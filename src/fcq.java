import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;

public class fcq extends ete<fcq.a> {
   static final aep a = new aep("world_list/error_highlighted");
   static final aep l = new aep("world_list/error");
   static final aep m = new aep("world_list/marked_join_highlighted");
   static final aep n = new aep("world_list/marked_join");
   static final aep o = new aep("world_list/warning_highlighted");
   static final aep p = new aep("world_list/warning");
   static final aep q = new aep("world_list/join_highlighted");
   static final aep s = new aep("world_list/join");
   static final Logger t = LogUtils.getLogger();
   static final DateFormat u = new SimpleDateFormat();
   private static final aep v = new aep("textures/misc/unknown_server.png");
   static final te w = te.c("selectWorld.tooltip.fromNewerVersion1").a(n.m);
   static final te x = te.c("selectWorld.tooltip.fromNewerVersion2").a(n.m);
   static final te y = te.c("selectWorld.tooltip.snapshot1").a(n.g);
   static final te z = te.c("selectWorld.tooltip.snapshot2").a(n.g);
   static final te A = te.c("selectWorld.locked").a(n.m);
   static final te B = te.c("selectWorld.conversion.tooltip").a(n.m);
   static final te C = te.c("selectWorld.experimental");
   private final fcl D;
   private CompletableFuture<List<ebw>> E;
   @Nullable
   private List<ebw> F;
   private String G;
   private final fcq.b H;

   public fcq(fcl $$0, eqn $$1, int $$2, int $$3, int $$4, int $$5, int $$6, String $$7, @Nullable fcq $$8) {
      super($$1, $$2, $$3, $$4, $$5, $$6);
      this.D = $$0;
      this.H = new fcq.b($$1);
      this.G = $$7;
      if ($$8 != null) {
         this.E = $$8.E;
      } else {
         this.E = this.x();
      }

      this.a(this.v());
   }

   @Override
   protected void j() {
      this.i().forEach(fcq.a::close);
      super.j();
   }

   @Nullable
   private List<ebw> v() {
      try {
         return this.E.getNow(null);
      } catch (CancellationException | CompletionException var2) {
         return null;
      }
   }

   void w() {
      this.E = this.x();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (evy.a($$0)) {
         Optional<fcq.c> $$3 = this.d();
         if ($$3.isPresent()) {
            $$3.get().d();
            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void a(erx $$0, int $$1, int $$2, float $$3) {
      List<ebw> $$4 = this.v();
      if ($$4 != this.F) {
         this.a($$4);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   private void a(@Nullable List<ebw> $$0) {
      if ($$0 == null) {
         this.y();
      } else {
         this.a(this.G, $$0);
      }

      this.F = $$0;
   }

   public void a(String $$0) {
      if (this.F != null && !$$0.equals(this.G)) {
         this.a($$0, this.F);
      }

      this.G = $$0;
   }

   private CompletableFuture<List<ebw>> x() {
      ebv.a $$0;
      try {
         $$0 = this.b.k().b();
      } catch (ebu var3) {
         t.error("Couldn't load level list", var3);
         this.a(var3.a());
         return CompletableFuture.completedFuture(List.of());
      }

      if ($$0.a()) {
         fcf.a(this.b, null);
         return CompletableFuture.completedFuture(List.of());
      } else {
         return this.b.k().a($$0).exceptionally($$0x -> {
            this.b.a(o.a($$0x, "Couldn't load level list"));
            return List.of();
         });
      }
   }

   private void a(String $$0, List<ebw> $$1) {
      this.j();
      $$0 = $$0.toLowerCase(Locale.ROOT);

      for (ebw $$2 : $$1) {
         if (this.a($$0, $$2)) {
            this.b(new fcq.c(this, $$2));
         }
      }

      this.z();
   }

   private boolean a(String $$0, ebw $$1) {
      return $$1.b().toLowerCase(Locale.ROOT).contains($$0) || $$1.a().toLowerCase(Locale.ROOT).contains($$0);
   }

   private void y() {
      this.j();
      this.b(this.H);
      this.z();
   }

   private void z() {
      this.D.d(true);
   }

   private void a(te $$0) {
      this.b.a(new ewz(te.c("selectWorld.unable_to_load"), $$0));
   }

   @Override
   protected int c() {
      return super.c() + 20;
   }

   @Override
   public int b() {
      return super.b() + 50;
   }

   public void a(@Nullable fcq.a $$0) {
      super.a($$0);
      this.D.a($$0 != null && $$0.b(), $$0 != null);
   }

   public Optional<fcq.c> d() {
      fcq.a $$0 = this.f();
      return $$0 instanceof fcq.c $$1 ? Optional.of($$1) : Optional.empty();
   }

   public fcl e() {
      return this.D;
   }

   @Override
   public void b(evt $$0) {
      if (this.i().contains(this.H)) {
         this.H.b($$0);
      } else {
         super.b($$0);
      }
   }

   public abstract static class a extends ete.a<fcq.a> implements AutoCloseable {
      public abstract boolean b();

      @Override
      public void close() {
      }
   }

   public static class b extends fcq.a {
      private static final te a = te.c("selectWorld.loading_list");
      private final eqn b;

      public b(eqn $$0) {
         this.b = $$0;
      }

      @Override
      public void a(erx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = (this.b.z.g - this.b.h.a(a)) / 2;
         int $$11 = $$2 + ($$5 - 9) / 2;
         $$0.a(this.b.h, a, $$10, $$11, 16777215, false);
         String $$12 = exg.a(ac.b());
         int $$13 = (this.b.z.g - this.b.h.b($$12)) / 2;
         int $$14 = $$11 + 9;
         $$0.a(this.b.h, $$12, $$13, $$14, -8355712, false);
      }

      @Override
      public te a() {
         return a;
      }

      @Override
      public boolean b() {
         return false;
      }
   }

   public final class c extends fcq.a implements AutoCloseable {
      private static final int b = 32;
      private static final int c = 32;
      private final eqn d;
      private final fcl e;
      private final ebw f;
      private final exa g;
      @Nullable
      private Path h;
      private long i;

      public c(fcq $$1, ebw $$2) {
         this.d = $$1.b;
         this.e = $$1.e();
         this.f = $$2;
         this.g = exa.a(this.d.X(), $$2.a());
         this.h = $$2.c();
         this.j();
         this.m();
      }

      private void j() {
         if (this.h != null) {
            try {
               BasicFileAttributes $$0 = Files.readAttributes(this.h, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
               if ($$0.isSymbolicLink()) {
                  List<egw> $$1 = this.d.ba().a(this.h);
                  if (!$$1.isEmpty()) {
                     fcq.t.warn("{}", egu.a(this.h, $$1));
                     this.h = null;
                  } else {
                     $$0 = Files.readAttributes(this.h, BasicFileAttributes.class);
                  }
               }

               if (!$$0.isRegularFile()) {
                  this.h = null;
               }
            } catch (NoSuchFileException var3) {
               this.h = null;
            } catch (IOException var4) {
               fcq.t.error("could not validate symlink", var4);
               this.h = null;
            }
         }
      }

      @Override
      public te a() {
         te $$0 = te.a("narrator.select.world_info", this.f.b(), new Date(this.f.f()), this.f.s());
         if (this.f.p()) {
            $$0 = td.a($$0, fcq.A);
         }

         if (this.f.e()) {
            $$0 = td.a($$0, fcq.C);
         }

         return te.a("narrator.select", $$0);
      }

      @Override
      public void a(erx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         String $$10 = this.f.b();
         String $$11 = this.f.a();
         long $$12 = this.f.f();
         if ($$12 != -1L) {
            $$11 = $$11 + " (" + fcq.u.format(new Date($$12)) + ")";
         }

         if (StringUtils.isEmpty($$10)) {
            $$10 = fzm.a("selectWorld.world") + " " + ($$1 + 1);
         }

         te $$13 = this.f.s();
         $$0.a(this.d.h, $$10, $$3 + 32 + 3, $$2 + 1, 16777215, false);
         $$0.a(this.d.h, $$11, $$3 + 32 + 3, $$2 + 9 + 3, -8355712, false);
         $$0.a(this.d.h, $$13, $$3 + 32 + 3, $$2 + 9 + 9 + 3, -8355712, false);
         RenderSystem.enableBlend();
         $$0.a(this.g.b(), $$3, $$2, 0.0F, 0.0F, 32, 32, 32, 32);
         RenderSystem.disableBlend();
         if (this.d.m.U().c() || $$8) {
            $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
            int $$14 = $$6 - $$3;
            boolean $$15 = $$14 < 32;
            aep $$16 = $$15 ? fcq.q : fcq.s;
            aep $$17 = $$15 ? fcq.o : fcq.p;
            aep $$18 = $$15 ? fcq.a : fcq.l;
            aep $$19 = $$15 ? fcq.m : fcq.n;
            if (this.f instanceof ebw.b) {
               $$0.a($$18, $$3, $$2, 32, 32);
               $$0.a($$19, $$3, $$2, 32, 32);
               return;
            }

            if (this.f.p()) {
               $$0.a($$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fcq.A, 175));
               }
            } else if (this.f.d()) {
               $$0.a($$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fcq.B, 175));
               }
            } else if (this.f.m()) {
               $$0.a($$19, $$3, $$2, 32, 32);
               if (this.f.n()) {
                  $$0.a($$18, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(fcq.w.f(), fcq.x.f()));
                  }
               } else if (!aa.b().g()) {
                  $$0.a($$17, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(fcq.y.f(), fcq.z.f()));
                  }
               }
            } else {
               $$0.a($$16, $$3, $$2, 32, 32);
            }
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.f.q()) {
            return true;
         } else {
            fcq.this.a((fcq.a)this);
            if ($$0 - (double)fcq.this.o() <= 32.0) {
               this.d();
               return true;
            } else if (ac.b() - this.i < 250L) {
               this.d();
               return true;
            } else {
               this.i = ac.b();
               return true;
            }
         }
      }

      public void d() {
         if (!this.f.q()) {
            if (this.f instanceof ebw.b) {
               this.d.a(exk.a(this.e));
            } else {
               ebw.a $$0 = this.f.o();
               if ($$0.a()) {
                  String $$1 = "selectWorld.backupQuestion." + $$0.c();
                  String $$2 = "selectWorld.backupWarning." + $$0.c();
                  tr $$3 = te.c($$1);
                  if ($$0.b()) {
                     $$3.a(n.r, n.m);
                  }

                  te $$4 = te.a($$2, this.f.k(), aa.b().c());
                  this.d.a(new ewj(this.e, ($$0x, $$1x) -> {
                     if ($$0x) {
                        String $$2x = this.f.a();

                        try (ebv.c $$3x = this.d.k().c($$2x)) {
                           fch.a($$3x);
                        } catch (IOException var9) {
                           eui.a(this.d, $$2x);
                           fcq.t.error("Failed to backup level {}", $$2x, var9);
                        } catch (egu var10) {
                           fcq.t.warn("{}", var10.getMessage());
                           this.d.a(exk.a(this.e));
                        }
                     }

                     this.k();
                  }, $$3, $$4, false));
               } else if (this.f.n()) {
                  this.d.a(new ewo($$0x -> {
                     if ($$0x) {
                        try {
                           this.k();
                        } catch (Exception var3x) {
                           fcq.t.error("Failure to open 'future world'", var3x);
                           this.d.a(new ewi(() -> this.d.a(this.e), te.c("selectWorld.futureworld.error.title"), te.c("selectWorld.futureworld.error.text")));
                        }
                     } else {
                        this.d.a(this.e);
                     }
                  }, te.c("selectWorld.versionQuestion"), te.a("selectWorld.versionWarning", this.f.k()), te.c("selectWorld.versionJoinButton"), td.e));
               } else {
                  this.k();
               }
            }
         }
      }

      public void e() {
         this.d.a(new ewo($$0 -> {
            if ($$0) {
               this.d.a(new ext(true));
               this.f();
            }

            this.d.a(this.e);
         }, te.c("selectWorld.deleteQuestion"), te.a("selectWorld.deleteWarning", this.f.b()), te.c("selectWorld.deleteButton"), td.e));
      }

      public void f() {
         ebv $$0 = this.d.k();
         String $$1 = this.f.a();

         try (ebv.c $$2 = $$0.d($$1)) {
            $$2.g();
         } catch (IOException var8) {
            eui.b(this.d, $$1);
            fcq.t.error("Failed to delete world {}", $$1, var8);
         }

         fcq.this.w();
      }

      public void g() {
         if (this.f instanceof ebw.b) {
            this.d.a(exk.a(this.e));
         } else {
            this.l();
            String $$0 = this.f.a();

            try {
               ebv.c $$1 = this.d.k().c($$0);
               this.d.a(new fch($$2 -> {
                  try {
                     $$1.close();
                  } catch (IOException var5) {
                     fcq.t.error("Failed to unlock level {}", $$0, var5);
                  }

                  if ($$2) {
                     fcq.this.w();
                  }

                  this.d.a(this.e);
               }, $$1));
            } catch (IOException var3) {
               eui.a(this.d, $$0);
               fcq.t.error("Failed to access level {}", $$0, var3);
               fcq.this.w();
            } catch (egu var4) {
               fcq.t.warn("{}", var4.getMessage());
               this.d.a(exk.a(this.e));
            }
         }
      }

      public void h() {
         if (this.f instanceof ebw.b) {
            this.d.a(exk.a(this.e));
         } else {
            this.l();

            try (ebv.c $$0 = this.d.k().c(this.f.a())) {
               Pair<cpo, fcn> $$1 = this.d.w().a($$0);
               cpo $$2 = (cpo)$$1.getFirst();
               fcn $$3 = (fcn)$$1.getSecond();
               Path $$4 = fcf.a($$0.a(ebt.j), this.d);
               if ($$3.b().e()) {
                  this.d
                     .a(
                        new ewo(
                           $$3x -> this.d.a((exv)($$3x ? fcf.a(this.d, this.e, $$2, $$3, $$4) : this.e)),
                           te.c("selectWorld.recreate.customized.title"),
                           te.c("selectWorld.recreate.customized.text"),
                           td.i,
                           td.e
                        )
                     );
               } else {
                  this.d.a(fcf.a(this.d, this.e, $$2, $$3, $$4));
               }
            } catch (egu var8) {
               fcq.t.warn("{}", var8.getMessage());
               this.d.a(exk.a(this.e));
            } catch (Exception var9) {
               fcq.t.error("Unable to recreate world", var9);
               this.d.a(new ewi(() -> this.d.a(this.e), te.c("selectWorld.recreate.error.title"), te.c("selectWorld.recreate.error.text")));
            }
         }
      }

      private void k() {
         this.d.ah().a(gbj.a(aou.yp, 1.0F));
         if (this.d.k().b(this.f.a())) {
            this.l();
            this.d.w().a(this.e, this.f.a());
         }
      }

      private void l() {
         this.d.d(new exb(te.c("selectWorld.data_read")));
      }

      private void m() {
         boolean $$0 = this.h != null && Files.isRegularFile(this.h);
         if ($$0) {
            try (InputStream $$1 = Files.newInputStream(this.h)) {
               this.g.a(eki.a($$1));
            } catch (Throwable var7) {
               fcq.t.error("Invalid icon for world {}", this.f.a(), var7);
               this.h = null;
            }
         } else {
            this.g.a();
         }
      }

      @Override
      public void close() {
         this.g.close();
      }

      public String i() {
         return this.f.b();
      }

      @Override
      public boolean b() {
         return !this.f.q();
      }
   }
}
