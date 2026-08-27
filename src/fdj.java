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

public class fdj extends etm<fdj.a> {
   static final aew a = new aew("world_list/error_highlighted");
   static final aew m = new aew("world_list/error");
   static final aew n = new aew("world_list/marked_join_highlighted");
   static final aew o = new aew("world_list/marked_join");
   static final aew p = new aew("world_list/warning_highlighted");
   static final aew q = new aew("world_list/warning");
   static final aew s = new aew("world_list/join_highlighted");
   static final aew t = new aew("world_list/join");
   static final Logger u = LogUtils.getLogger();
   static final DateFormat v = new SimpleDateFormat();
   private static final aew w = new aew("textures/misc/unknown_server.png");
   static final tl x = tl.c("selectWorld.tooltip.fromNewerVersion1").a(n.m);
   static final tl y = tl.c("selectWorld.tooltip.fromNewerVersion2").a(n.m);
   static final tl z = tl.c("selectWorld.tooltip.snapshot1").a(n.g);
   static final tl A = tl.c("selectWorld.tooltip.snapshot2").a(n.g);
   static final tl B = tl.c("selectWorld.locked").a(n.m);
   static final tl C = tl.c("selectWorld.conversion.tooltip").a(n.m);
   static final tl D = tl.c("selectWorld.experimental");
   private final fde E;
   private CompletableFuture<List<ech>> F;
   @Nullable
   private List<ech> G;
   private String H;
   private final fdj.b I;

   public fdj(fde $$0, eqv $$1, int $$2, int $$3, int $$4, int $$5, int $$6, String $$7, @Nullable fdj $$8) {
      super($$1, $$2, $$3, $$4, $$5, $$6);
      this.E = $$0;
      this.I = new fdj.b($$1);
      this.H = $$7;
      if ($$8 != null) {
         this.F = $$8.F;
      } else {
         this.F = this.y();
      }

      this.a(this.w());
   }

   @Override
   protected void j() {
      this.i().forEach(fdj.a::close);
      super.j();
   }

   @Nullable
   private List<ech> w() {
      try {
         return this.F.getNow(null);
      } catch (CancellationException | CompletionException var2) {
         return null;
      }
   }

   void x() {
      this.F = this.y();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (ewn.a($$0)) {
         Optional<fdj.c> $$3 = this.d();
         if ($$3.isPresent()) {
            $$3.get().d();
            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void a(esf $$0, int $$1, int $$2, float $$3) {
      List<ech> $$4 = this.w();
      if ($$4 != this.G) {
         this.a($$4);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   private void a(@Nullable List<ech> $$0) {
      if ($$0 == null) {
         this.z();
      } else {
         this.a(this.H, $$0);
      }

      this.G = $$0;
   }

   public void a(String $$0) {
      if (this.G != null && !$$0.equals(this.H)) {
         this.a($$0, this.G);
      }

      this.H = $$0;
   }

   private CompletableFuture<List<ech>> y() {
      ecg.a $$0;
      try {
         $$0 = this.c.l().b();
      } catch (ecf var3) {
         u.error("Couldn't load level list", var3);
         this.a(var3.a());
         return CompletableFuture.completedFuture(List.of());
      }

      if ($$0.a()) {
         fcy.a(this.c, null);
         return CompletableFuture.completedFuture(List.of());
      } else {
         return this.c.l().a($$0).exceptionally($$0x -> {
            this.c.a(o.a($$0x, "Couldn't load level list"));
            return List.of();
         });
      }
   }

   private void a(String $$0, List<ech> $$1) {
      this.j();
      $$0 = $$0.toLowerCase(Locale.ROOT);

      for (ech $$2 : $$1) {
         if (this.a($$0, $$2)) {
            this.b(new fdj.c(this, $$2));
         }
      }

      this.A();
   }

   private boolean a(String $$0, ech $$1) {
      return $$1.b().toLowerCase(Locale.ROOT).contains($$0) || $$1.a().toLowerCase(Locale.ROOT).contains($$0);
   }

   private void z() {
      this.j();
      this.b(this.I);
      this.A();
   }

   private void A() {
      this.E.d(true);
   }

   private void a(tl $$0) {
      this.c.a(new exo(tl.c("selectWorld.unable_to_load"), $$0));
   }

   @Override
   protected int c() {
      return super.c() + 20;
   }

   @Override
   public int b() {
      return super.b() + 50;
   }

   public void a(@Nullable fdj.a $$0) {
      super.a($$0);
      this.E.a($$0 != null && $$0.b(), $$0 != null);
   }

   public Optional<fdj.c> d() {
      fdj.a $$0 = this.f();
      return $$0 instanceof fdj.c $$1 ? Optional.of($$1) : Optional.empty();
   }

   public fde e() {
      return this.E;
   }

   @Override
   public void b(ewi $$0) {
      if (this.i().contains(this.I)) {
         this.I.b($$0);
      } else {
         super.b($$0);
      }
   }

   public abstract static class a extends etm.a<fdj.a> implements AutoCloseable {
      public abstract boolean b();

      @Override
      public void close() {
      }
   }

   public static class b extends fdj.a {
      private static final tl a = tl.c("selectWorld.loading_list");
      private final eqv b;

      public b(eqv $$0) {
         this.b = $$0;
      }

      @Override
      public void a(esf $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = (this.b.y.g - this.b.h.a(a)) / 2;
         int $$11 = $$2 + ($$5 - 9) / 2;
         $$0.a(this.b.h, a, $$10, $$11, 16777215, false);
         String $$12 = exv.a(ac.b());
         int $$13 = (this.b.y.g - this.b.h.b($$12)) / 2;
         int $$14 = $$11 + 9;
         $$0.a(this.b.h, $$12, $$13, $$14, -8355712, false);
      }

      @Override
      public tl a() {
         return a;
      }

      @Override
      public boolean b() {
         return false;
      }
   }

   public final class c extends fdj.a implements AutoCloseable {
      private static final int b = 32;
      private static final int c = 32;
      private final eqv d;
      private final fde e;
      private final ech f;
      private final exp g;
      @Nullable
      private Path h;
      private long i;

      public c(fdj $$1, ech $$2) {
         this.d = $$1.c;
         this.e = $$1.e();
         this.f = $$2;
         this.g = exp.a(this.d.Y(), $$2.a());
         this.h = $$2.c();
         this.j();
         this.m();
      }

      private void j() {
         if (this.h != null) {
            try {
               BasicFileAttributes $$0 = Files.readAttributes(this.h, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
               if ($$0.isSymbolicLink()) {
                  List<ehe> $$1 = this.d.bb().a(this.h);
                  if (!$$1.isEmpty()) {
                     fdj.u.warn("{}", ehc.a(this.h, $$1));
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
               fdj.u.error("could not validate symlink", var4);
               this.h = null;
            }
         }
      }

      @Override
      public tl a() {
         tl $$0 = tl.a("narrator.select.world_info", this.f.b(), new Date(this.f.f()), this.f.s());
         if (this.f.p()) {
            $$0 = tk.a($$0, fdj.B);
         }

         if (this.f.e()) {
            $$0 = tk.a($$0, fdj.D);
         }

         return tl.a("narrator.select", $$0);
      }

      @Override
      public void a(esf $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         String $$10 = this.f.b();
         String $$11 = this.f.a();
         long $$12 = this.f.f();
         if ($$12 != -1L) {
            $$11 = $$11 + " (" + fdj.v.format(new Date($$12)) + ")";
         }

         if (StringUtils.isEmpty($$10)) {
            $$10 = gak.a("selectWorld.world") + " " + ($$1 + 1);
         }

         tl $$13 = this.f.s();
         $$0.a(this.d.h, $$10, $$3 + 32 + 3, $$2 + 1, 16777215, false);
         $$0.a(this.d.h, $$11, $$3 + 32 + 3, $$2 + 9 + 3, -8355712, false);
         $$0.a(this.d.h, $$13, $$3 + 32 + 3, $$2 + 9 + 9 + 3, -8355712, false);
         RenderSystem.enableBlend();
         $$0.a(this.g.b(), $$3, $$2, 0.0F, 0.0F, 32, 32, 32, 32);
         RenderSystem.disableBlend();
         if (this.d.m.V().c() || $$8) {
            $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
            int $$14 = $$6 - $$3;
            boolean $$15 = $$14 < 32;
            aew $$16 = $$15 ? fdj.s : fdj.t;
            aew $$17 = $$15 ? fdj.p : fdj.q;
            aew $$18 = $$15 ? fdj.a : fdj.m;
            aew $$19 = $$15 ? fdj.n : fdj.o;
            if (this.f instanceof ech.b) {
               $$0.a($$18, $$3, $$2, 32, 32);
               $$0.a($$19, $$3, $$2, 32, 32);
               return;
            }

            if (this.f.p()) {
               $$0.a($$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fdj.B, 175));
               }
            } else if (this.f.d()) {
               $$0.a($$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fdj.C, 175));
               }
            } else if (this.f.m()) {
               $$0.a($$19, $$3, $$2, 32, 32);
               if (this.f.n()) {
                  $$0.a($$18, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(fdj.x.f(), fdj.y.f()));
                  }
               } else if (!aa.b().g()) {
                  $$0.a($$17, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(fdj.z.f(), fdj.A.f()));
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
            fdj.this.a((fdj.a)this);
            if ($$0 - (double)fdj.this.o() <= 32.0) {
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
            if (this.f instanceof ech.b) {
               this.d.a(exz.a(this.e));
            } else {
               ech.a $$0 = this.f.o();
               if ($$0.a()) {
                  String $$1 = "selectWorld.backupQuestion." + $$0.c();
                  String $$2 = "selectWorld.backupWarning." + $$0.c();
                  ty $$3 = tl.c($$1);
                  if ($$0.b()) {
                     $$3.a(n.r, n.m);
                  }

                  tl $$4 = tl.a($$2, this.f.k(), aa.b().c());
                  this.d.a(new ewy(this.e, ($$0x, $$1x) -> {
                     if ($$0x) {
                        String $$2x = this.f.a();

                        try (ecg.c $$3x = this.d.l().d($$2x)) {
                           fda.a($$3x);
                        } catch (IOException var9) {
                           euw.a(this.d, $$2x);
                           fdj.u.error("Failed to backup level {}", $$2x, var9);
                        } catch (ehc var10) {
                           fdj.u.warn("{}", var10.getMessage());
                           this.d.a(exz.a(this.e));
                        }
                     }

                     this.k();
                  }, $$3, $$4, false));
               } else if (this.f.n()) {
                  this.d.a(new exd($$0x -> {
                     if ($$0x) {
                        try {
                           this.k();
                        } catch (Exception var3x) {
                           fdj.u.error("Failure to open 'future world'", var3x);
                           this.d.a(new ewx(() -> this.d.a(this.e), tl.c("selectWorld.futureworld.error.title"), tl.c("selectWorld.futureworld.error.text")));
                        }
                     } else {
                        this.d.a(this.e);
                     }
                  }, tl.c("selectWorld.versionQuestion"), tl.a("selectWorld.versionWarning", this.f.k()), tl.c("selectWorld.versionJoinButton"), tk.e));
               } else {
                  this.k();
               }
            }
         }
      }

      public void e() {
         this.d.a(new exd($$0 -> {
            if ($$0) {
               this.d.a(new eyi(true));
               this.f();
            }

            this.d.a(this.e);
         }, tl.c("selectWorld.deleteQuestion"), tl.a("selectWorld.deleteWarning", this.f.b()), tl.c("selectWorld.deleteButton"), tk.e));
      }

      public void f() {
         ecg $$0 = this.d.l();
         String $$1 = this.f.a();

         try (ecg.c $$2 = $$0.e($$1)) {
            $$2.g();
         } catch (IOException var8) {
            euw.b(this.d, $$1);
            fdj.u.error("Failed to delete world {}", $$1, var8);
         }

         fdj.this.x();
      }

      public void g() {
         if (this.f instanceof ech.b) {
            this.d.a(exz.a(this.e));
         } else {
            this.l();
            String $$0 = this.f.a();

            try {
               ecg.c $$1 = this.d.l().d($$0);
               this.d.a(new fda($$2 -> {
                  try {
                     $$1.close();
                  } catch (IOException var5) {
                     fdj.u.error("Failed to unlock level {}", $$0, var5);
                  }

                  if ($$2) {
                     fdj.this.x();
                  }

                  this.d.a(this.e);
               }, $$1));
            } catch (IOException var3) {
               euw.a(this.d, $$0);
               fdj.u.error("Failed to access level {}", $$0, var3);
               fdj.this.x();
            } catch (ehc var4) {
               fdj.u.warn("{}", var4.getMessage());
               this.d.a(exz.a(this.e));
            }
         }
      }

      public void h() {
         if (this.f instanceof ech.b) {
            this.d.a(exz.a(this.e));
         } else {
            this.l();

            try (ecg.c $$0 = this.d.l().d(this.f.a())) {
               Pair<cpz, fdg> $$1 = this.d.y().a($$0);
               cpz $$2 = (cpz)$$1.getFirst();
               fdg $$3 = (fdg)$$1.getSecond();
               Path $$4 = fcy.a($$0.a(ece.j), this.d);
               if ($$3.b().e()) {
                  this.d
                     .a(
                        new exd(
                           $$3x -> this.d.a((eyk)($$3x ? fcy.a(this.d, this.e, $$2, $$3, $$4) : this.e)),
                           tl.c("selectWorld.recreate.customized.title"),
                           tl.c("selectWorld.recreate.customized.text"),
                           tk.i,
                           tk.e
                        )
                     );
               } else {
                  this.d.a(fcy.a(this.d, this.e, $$2, $$3, $$4));
               }
            } catch (ehc var8) {
               fdj.u.warn("{}", var8.getMessage());
               this.d.a(exz.a(this.e));
            } catch (Exception var9) {
               fdj.u.error("Unable to recreate world", var9);
               this.d.a(new ewx(() -> this.d.a(this.e), tl.c("selectWorld.recreate.error.title"), tl.c("selectWorld.recreate.error.text")));
            }
         }
      }

      private void k() {
         this.d.ai().a(gch.a(apd.yu, 1.0F));
         if (this.d.l().b(this.f.a())) {
            this.l();
            this.d.y().a(this.e, this.f.a());
         }
      }

      private void l() {
         this.d.d(new exq(tl.c("selectWorld.data_read")));
      }

      private void m() {
         boolean $$0 = this.h != null && Files.isRegularFile(this.h);
         if ($$0) {
            try (InputStream $$1 = Files.newInputStream(this.h)) {
               this.g.a(ekq.a($$1));
            } catch (Throwable var7) {
               fdj.u.error("Invalid icon for world {}", this.f.a(), var7);
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
