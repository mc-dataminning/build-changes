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

public class fde extends eth<fde.a> {
   static final aeu a = new aeu("world_list/error_highlighted");
   static final aeu m = new aeu("world_list/error");
   static final aeu n = new aeu("world_list/marked_join_highlighted");
   static final aeu o = new aeu("world_list/marked_join");
   static final aeu p = new aeu("world_list/warning_highlighted");
   static final aeu q = new aeu("world_list/warning");
   static final aeu s = new aeu("world_list/join_highlighted");
   static final aeu t = new aeu("world_list/join");
   static final Logger u = LogUtils.getLogger();
   static final DateFormat v = new SimpleDateFormat();
   private static final aeu w = new aeu("textures/misc/unknown_server.png");
   static final ti x = ti.c("selectWorld.tooltip.fromNewerVersion1").a(n.m);
   static final ti y = ti.c("selectWorld.tooltip.fromNewerVersion2").a(n.m);
   static final ti z = ti.c("selectWorld.tooltip.snapshot1").a(n.g);
   static final ti A = ti.c("selectWorld.tooltip.snapshot2").a(n.g);
   static final ti B = ti.c("selectWorld.locked").a(n.m);
   static final ti C = ti.c("selectWorld.conversion.tooltip").a(n.m);
   static final ti D = ti.c("selectWorld.experimental");
   private final fcz E;
   private CompletableFuture<List<ecc>> F;
   @Nullable
   private List<ecc> G;
   private String H;
   private final fde.b I;

   public fde(fcz $$0, eqq $$1, int $$2, int $$3, int $$4, int $$5, int $$6, String $$7, @Nullable fde $$8) {
      super($$1, $$2, $$3, $$4, $$5, $$6);
      this.E = $$0;
      this.I = new fde.b($$1);
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
      this.i().forEach(fde.a::close);
      super.j();
   }

   @Nullable
   private List<ecc> w() {
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
      if (ewi.a($$0)) {
         Optional<fde.c> $$3 = this.d();
         if ($$3.isPresent()) {
            $$3.get().d();
            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void a(esa $$0, int $$1, int $$2, float $$3) {
      List<ecc> $$4 = this.w();
      if ($$4 != this.G) {
         this.a($$4);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   private void a(@Nullable List<ecc> $$0) {
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

   private CompletableFuture<List<ecc>> y() {
      ecb.a $$0;
      try {
         $$0 = this.c.l().b();
      } catch (eca var3) {
         u.error("Couldn't load level list", var3);
         this.a(var3.a());
         return CompletableFuture.completedFuture(List.of());
      }

      if ($$0.a()) {
         fct.a(this.c, null);
         return CompletableFuture.completedFuture(List.of());
      } else {
         return this.c.l().a($$0).exceptionally($$0x -> {
            this.c.a(o.a($$0x, "Couldn't load level list"));
            return List.of();
         });
      }
   }

   private void a(String $$0, List<ecc> $$1) {
      this.j();
      $$0 = $$0.toLowerCase(Locale.ROOT);

      for (ecc $$2 : $$1) {
         if (this.a($$0, $$2)) {
            this.b(new fde.c(this, $$2));
         }
      }

      this.A();
   }

   private boolean a(String $$0, ecc $$1) {
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

   private void a(ti $$0) {
      this.c.a(new exj(ti.c("selectWorld.unable_to_load"), $$0));
   }

   @Override
   protected int c() {
      return super.c() + 20;
   }

   @Override
   public int b() {
      return super.b() + 50;
   }

   public void a(@Nullable fde.a $$0) {
      super.a($$0);
      this.E.a($$0 != null && $$0.b(), $$0 != null);
   }

   public Optional<fde.c> d() {
      fde.a $$0 = this.f();
      return $$0 instanceof fde.c $$1 ? Optional.of($$1) : Optional.empty();
   }

   public fcz e() {
      return this.E;
   }

   @Override
   public void b(ewd $$0) {
      if (this.i().contains(this.I)) {
         this.I.b($$0);
      } else {
         super.b($$0);
      }
   }

   public abstract static class a extends eth.a<fde.a> implements AutoCloseable {
      public abstract boolean b();

      @Override
      public void close() {
      }
   }

   public static class b extends fde.a {
      private static final ti a = ti.c("selectWorld.loading_list");
      private final eqq b;

      public b(eqq $$0) {
         this.b = $$0;
      }

      @Override
      public void a(esa $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = (this.b.y.g - this.b.h.a(a)) / 2;
         int $$11 = $$2 + ($$5 - 9) / 2;
         $$0.a(this.b.h, a, $$10, $$11, 16777215, false);
         String $$12 = exq.a(ac.b());
         int $$13 = (this.b.y.g - this.b.h.b($$12)) / 2;
         int $$14 = $$11 + 9;
         $$0.a(this.b.h, $$12, $$13, $$14, -8355712, false);
      }

      @Override
      public ti a() {
         return a;
      }

      @Override
      public boolean b() {
         return false;
      }
   }

   public final class c extends fde.a implements AutoCloseable {
      private static final int b = 32;
      private static final int c = 32;
      private final eqq d;
      private final fcz e;
      private final ecc f;
      private final exk g;
      @Nullable
      private Path h;
      private long i;

      public c(fde $$1, ecc $$2) {
         this.d = $$1.c;
         this.e = $$1.e();
         this.f = $$2;
         this.g = exk.a(this.d.Y(), $$2.a());
         this.h = $$2.c();
         this.j();
         this.m();
      }

      private void j() {
         if (this.h != null) {
            try {
               BasicFileAttributes $$0 = Files.readAttributes(this.h, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
               if ($$0.isSymbolicLink()) {
                  List<egz> $$1 = this.d.bb().a(this.h);
                  if (!$$1.isEmpty()) {
                     fde.u.warn("{}", egx.a(this.h, $$1));
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
               fde.u.error("could not validate symlink", var4);
               this.h = null;
            }
         }
      }

      @Override
      public ti a() {
         ti $$0 = ti.a("narrator.select.world_info", this.f.b(), new Date(this.f.f()), this.f.s());
         if (this.f.p()) {
            $$0 = th.a($$0, fde.B);
         }

         if (this.f.e()) {
            $$0 = th.a($$0, fde.D);
         }

         return ti.a("narrator.select", $$0);
      }

      @Override
      public void a(esa $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         String $$10 = this.f.b();
         String $$11 = this.f.a();
         long $$12 = this.f.f();
         if ($$12 != -1L) {
            $$11 = $$11 + " (" + fde.v.format(new Date($$12)) + ")";
         }

         if (StringUtils.isEmpty($$10)) {
            $$10 = gaf.a("selectWorld.world") + " " + ($$1 + 1);
         }

         ti $$13 = this.f.s();
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
            aeu $$16 = $$15 ? fde.s : fde.t;
            aeu $$17 = $$15 ? fde.p : fde.q;
            aeu $$18 = $$15 ? fde.a : fde.m;
            aeu $$19 = $$15 ? fde.n : fde.o;
            if (this.f instanceof ecc.b) {
               $$0.a($$18, $$3, $$2, 32, 32);
               $$0.a($$19, $$3, $$2, 32, 32);
               return;
            }

            if (this.f.p()) {
               $$0.a($$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fde.B, 175));
               }
            } else if (this.f.d()) {
               $$0.a($$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fde.C, 175));
               }
            } else if (this.f.m()) {
               $$0.a($$19, $$3, $$2, 32, 32);
               if (this.f.n()) {
                  $$0.a($$18, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(fde.x.f(), fde.y.f()));
                  }
               } else if (!aa.b().g()) {
                  $$0.a($$17, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(fde.z.f(), fde.A.f()));
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
            fde.this.a((fde.a)this);
            if ($$0 - (double)fde.this.o() <= 32.0) {
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
            if (this.f instanceof ecc.b) {
               this.d.a(exu.a(this.e));
            } else {
               ecc.a $$0 = this.f.o();
               if ($$0.a()) {
                  String $$1 = "selectWorld.backupQuestion." + $$0.c();
                  String $$2 = "selectWorld.backupWarning." + $$0.c();
                  tv $$3 = ti.c($$1);
                  if ($$0.b()) {
                     $$3.a(n.r, n.m);
                  }

                  ti $$4 = ti.a($$2, this.f.k(), aa.b().c());
                  this.d.a(new ewt(this.e, ($$0x, $$1x) -> {
                     if ($$0x) {
                        String $$2x = this.f.a();

                        try (ecb.c $$3x = this.d.l().c($$2x)) {
                           fcv.a($$3x);
                        } catch (IOException var9) {
                           eur.a(this.d, $$2x);
                           fde.u.error("Failed to backup level {}", $$2x, var9);
                        } catch (egx var10) {
                           fde.u.warn("{}", var10.getMessage());
                           this.d.a(exu.a(this.e));
                        }
                     }

                     this.k();
                  }, $$3, $$4, false));
               } else if (this.f.n()) {
                  this.d.a(new ewy($$0x -> {
                     if ($$0x) {
                        try {
                           this.k();
                        } catch (Exception var3x) {
                           fde.u.error("Failure to open 'future world'", var3x);
                           this.d.a(new ews(() -> this.d.a(this.e), ti.c("selectWorld.futureworld.error.title"), ti.c("selectWorld.futureworld.error.text")));
                        }
                     } else {
                        this.d.a(this.e);
                     }
                  }, ti.c("selectWorld.versionQuestion"), ti.a("selectWorld.versionWarning", this.f.k()), ti.c("selectWorld.versionJoinButton"), th.e));
               } else {
                  this.k();
               }
            }
         }
      }

      public void e() {
         this.d.a(new ewy($$0 -> {
            if ($$0) {
               this.d.a(new eyd(true));
               this.f();
            }

            this.d.a(this.e);
         }, ti.c("selectWorld.deleteQuestion"), ti.a("selectWorld.deleteWarning", this.f.b()), ti.c("selectWorld.deleteButton"), th.e));
      }

      public void f() {
         ecb $$0 = this.d.l();
         String $$1 = this.f.a();

         try (ecb.c $$2 = $$0.d($$1)) {
            $$2.g();
         } catch (IOException var8) {
            eur.b(this.d, $$1);
            fde.u.error("Failed to delete world {}", $$1, var8);
         }

         fde.this.x();
      }

      public void g() {
         if (this.f instanceof ecc.b) {
            this.d.a(exu.a(this.e));
         } else {
            this.l();
            String $$0 = this.f.a();

            try {
               ecb.c $$1 = this.d.l().c($$0);
               this.d.a(new fcv($$2 -> {
                  try {
                     $$1.close();
                  } catch (IOException var5) {
                     fde.u.error("Failed to unlock level {}", $$0, var5);
                  }

                  if ($$2) {
                     fde.this.x();
                  }

                  this.d.a(this.e);
               }, $$1));
            } catch (IOException var3) {
               eur.a(this.d, $$0);
               fde.u.error("Failed to access level {}", $$0, var3);
               fde.this.x();
            } catch (egx var4) {
               fde.u.warn("{}", var4.getMessage());
               this.d.a(exu.a(this.e));
            }
         }
      }

      public void h() {
         if (this.f instanceof ecc.b) {
            this.d.a(exu.a(this.e));
         } else {
            this.l();

            try (ecb.c $$0 = this.d.l().c(this.f.a())) {
               Pair<cpu, fdb> $$1 = this.d.y().a($$0);
               cpu $$2 = (cpu)$$1.getFirst();
               fdb $$3 = (fdb)$$1.getSecond();
               Path $$4 = fct.a($$0.a(ebz.j), this.d);
               if ($$3.b().e()) {
                  this.d
                     .a(
                        new ewy(
                           $$3x -> this.d.a((eyf)($$3x ? fct.a(this.d, this.e, $$2, $$3, $$4) : this.e)),
                           ti.c("selectWorld.recreate.customized.title"),
                           ti.c("selectWorld.recreate.customized.text"),
                           th.i,
                           th.e
                        )
                     );
               } else {
                  this.d.a(fct.a(this.d, this.e, $$2, $$3, $$4));
               }
            } catch (egx var8) {
               fde.u.warn("{}", var8.getMessage());
               this.d.a(exu.a(this.e));
            } catch (Exception var9) {
               fde.u.error("Unable to recreate world", var9);
               this.d.a(new ews(() -> this.d.a(this.e), ti.c("selectWorld.recreate.error.title"), ti.c("selectWorld.recreate.error.text")));
            }
         }
      }

      private void k() {
         this.d.ai().a(gcc.a(aoz.yu, 1.0F));
         if (this.d.l().b(this.f.a())) {
            this.l();
            this.d.y().a(this.e, this.f.a());
         }
      }

      private void l() {
         this.d.d(new exl(ti.c("selectWorld.data_read")));
      }

      private void m() {
         boolean $$0 = this.h != null && Files.isRegularFile(this.h);
         if ($$0) {
            try (InputStream $$1 = Files.newInputStream(this.h)) {
               this.g.a(ekl.a($$1));
            } catch (Throwable var7) {
               fde.u.error("Invalid icon for world {}", this.f.a(), var7);
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
