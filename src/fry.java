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
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
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

public class fry extends fhv<fry.a> {
   public static final DateTimeFormatter a = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withZone(ZoneId.systemDefault());
   static final alb m = new alb("world_list/error_highlighted");
   static final alb n = new alb("world_list/error");
   static final alb o = new alb("world_list/marked_join_highlighted");
   static final alb p = new alb("world_list/marked_join");
   static final alb q = new alb("world_list/warning_highlighted");
   static final alb r = new alb("world_list/warning");
   static final alb s = new alb("world_list/join_highlighted");
   static final alb u = new alb("world_list/join");
   static final Logger v = LogUtils.getLogger();
   static final xl w = xl.c("selectWorld.tooltip.fromNewerVersion1").a(n.m);
   static final xl x = xl.c("selectWorld.tooltip.fromNewerVersion2").a(n.m);
   static final xl y = xl.c("selectWorld.tooltip.snapshot1").a(n.g);
   static final xl z = xl.c("selectWorld.tooltip.snapshot2").a(n.g);
   static final xl A = xl.c("selectWorld.locked").a(n.m);
   static final xl B = xl.c("selectWorld.conversion.tooltip").a(n.m);
   static final xl C = xl.c("selectWorld.incompatible.tooltip").a(n.m);
   static final xl D = xl.c("selectWorld.experimental");
   private final frt E;
   private CompletableFuture<List<eps>> F;
   @Nullable
   private List<eps> G;
   private String H;
   private final fry.b I;

   public fry(frt $$0, ffa $$1, int $$2, int $$3, int $$4, int $$5, String $$6, @Nullable fry $$7) {
      super($$1, $$2, $$3, $$4, $$5);
      this.E = $$0;
      this.I = new fry.b($$1);
      this.H = $$6;
      if ($$7 != null) {
         this.F = $$7.F;
      } else {
         this.F = this.L();
      }

      this.a(this.J());
   }

   @Override
   protected void k() {
      this.aF_().forEach(fry.a::close);
      super.k();
   }

   @Nullable
   private List<eps> J() {
      try {
         return this.F.getNow(null);
      } catch (CancellationException | CompletionException var2) {
         return null;
      }
   }

   void K() {
      this.F = this.L();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (fla.a($$0)) {
         Optional<fry.c> $$3 = this.d();
         if ($$3.isPresent()) {
            if ($$3.get().b()) {
               this.c.aj().a(gsd.a(avw.Ao, 1.0F));
               $$3.get().c();
            }

            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void b(fgm $$0, int $$1, int $$2, float $$3) {
      List<eps> $$4 = this.J();
      if ($$4 != this.G) {
         this.a($$4);
      }

      super.b($$0, $$1, $$2, $$3);
   }

   private void a(@Nullable List<eps> $$0) {
      if ($$0 == null) {
         this.M();
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

   private CompletableFuture<List<eps>> L() {
      epr.a $$0;
      try {
         $$0 = this.c.m().b();
      } catch (epq var3) {
         v.error("Couldn't load level list", var3);
         this.c(var3.a());
         return CompletableFuture.completedFuture(List.of());
      }

      if ($$0.a()) {
         frn.a(this.c, null);
         return CompletableFuture.completedFuture(List.of());
      } else {
         return this.c.m().a($$0).exceptionally($$0x -> {
            this.c.a(o.a($$0x, "Couldn't load level list"));
            return List.of();
         });
      }
   }

   private void a(String $$0, List<eps> $$1) {
      this.k();
      $$0 = $$0.toLowerCase(Locale.ROOT);

      for (eps $$2 : $$1) {
         if (this.a($$0, $$2)) {
            this.b(new fry.c(this, $$2));
         }
      }

      this.N();
   }

   private boolean a(String $$0, eps $$1) {
      return $$1.b().toLowerCase(Locale.ROOT).contains($$0) || $$1.a().toLowerCase(Locale.ROOT).contains($$0);
   }

   private void M() {
      this.k();
      this.b(this.I);
      this.N();
   }

   private void N() {
      this.a(this.n());
      this.E.d(true);
   }

   private void c(xl $$0) {
      this.c.a(new fmb(xl.c("selectWorld.unable_to_load"), $$0));
   }

   @Override
   public int b() {
      return 270;
   }

   public void a(@Nullable fry.a $$0) {
      super.a($$0);
      this.E.a($$0 instanceof fry.c $$1 ? $$1.f : null);
   }

   public Optional<fry.c> d() {
      fry.a $$0 = this.h();
      return $$0 instanceof fry.c $$1 ? Optional.of($$1) : Optional.empty();
   }

   public frt I() {
      return this.E;
   }

   @Override
   public void a(fkv $$0) {
      if (this.aF_().contains(this.I)) {
         this.I.b($$0);
      } else {
         super.a($$0);
      }
   }

   public abstract static class a extends fhv.a<fry.a> implements AutoCloseable {
      @Override
      public void close() {
      }
   }

   public static class b extends fry.a {
      private static final xl a = xl.c("selectWorld.loading_list");
      private final ffa b;

      public b(ffa $$0) {
         this.b = $$0;
      }

      @Override
      public void a(fgm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = (this.b.y.n - this.b.h.a(a)) / 2;
         int $$11 = $$2 + ($$5 - 9) / 2;
         $$0.a(this.b.h, a, $$10, $$11, 16777215, false);
         String $$12 = fmj.a(ac.c());
         int $$13 = (this.b.y.n - this.b.h.b($$12)) / 2;
         int $$14 = $$11 + 9;
         $$0.a(this.b.h, $$12, $$13, $$14, -8355712, false);
      }

      @Override
      public xl a() {
         return a;
      }
   }

   public final class c extends fry.a implements AutoCloseable {
      private static final int b = 32;
      private static final int c = 32;
      private final ffa d;
      private final frt e;
      final eps f;
      private final fmc g;
      @Nullable
      private Path h;
      private long i;

      public c(final fry $$1, final eps $$2) {
         this.d = $$1.c;
         this.e = $$1.I();
         this.f = $$2;
         this.g = fmc.a(this.d.aa(), $$2.a());
         this.h = $$2.c();
         this.j();
         this.l();
      }

      private void j() {
         if (this.h != null) {
            try {
               BasicFileAttributes $$0 = Files.readAttributes(this.h, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
               if ($$0.isSymbolicLink()) {
                  List<evd> $$1 = this.d.bd().a(this.h);
                  if (!$$1.isEmpty()) {
                     fry.v.warn("{}", evb.a(this.h, $$1));
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
               fry.v.error("could not validate symlink", var4);
               this.h = null;
            }
         }
      }

      @Override
      public xl a() {
         xl $$0 = xl.a("narrator.select.world_info", this.f.b(), xl.a(new Date(this.f.f())), this.f.s());
         if (this.f.p()) {
            $$0 = xk.a($$0, fry.A);
         }

         if (this.f.e()) {
            $$0 = xk.a($$0, fry.D);
         }

         return xl.a("narrator.select", $$0);
      }

      @Override
      public void a(fgm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         String $$10 = this.f.b();
         String $$11 = this.f.a();
         long $$12 = this.f.f();
         if ($$12 != -1L) {
            $$11 = $$11 + " (" + fry.a.format(Instant.ofEpochMilli($$12)) + ")";
         }

         if (StringUtils.isEmpty($$10)) {
            $$10 = gqa.a("selectWorld.world") + " " + ($$1 + 1);
         }

         xl $$13 = this.f.s();
         $$0.a(this.d.h, $$10, $$3 + 32 + 3, $$2 + 1, 16777215, false);
         $$0.a(this.d.h, $$11, $$3 + 32 + 3, $$2 + 9 + 3, -8355712, false);
         $$0.a(this.d.h, $$13, $$3 + 32 + 3, $$2 + 9 + 9 + 3, -8355712, false);
         RenderSystem.enableBlend();
         $$0.a(this.g.b(), $$3, $$2, 0.0F, 0.0F, 32, 32, 32, 32);
         RenderSystem.disableBlend();
         if (this.d.m.Z().c() || $$8) {
            $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
            int $$14 = $$6 - $$3;
            boolean $$15 = $$14 < 32;
            alb $$16 = $$15 ? fry.s : fry.u;
            alb $$17 = $$15 ? fry.q : fry.r;
            alb $$18 = $$15 ? fry.m : fry.n;
            alb $$19 = $$15 ? fry.o : fry.p;
            if (this.f instanceof eps.c || this.f instanceof eps.b) {
               $$0.a($$18, $$3, $$2, 32, 32);
               $$0.a($$19, $$3, $$2, 32, 32);
               return;
            }

            if (this.f.p()) {
               $$0.a($$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fry.A, 175));
               }
            } else if (this.f.d()) {
               $$0.a($$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fry.B, 175));
               }
            } else if (!this.f.r()) {
               $$0.a($$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fry.C, 175));
               }
            } else if (this.f.m()) {
               $$0.a($$19, $$3, $$2, 32, 32);
               if (this.f.n()) {
                  $$0.a($$18, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(fry.w.g(), fry.x.g()));
                  }
               } else if (!aa.b().g()) {
                  $$0.a($$17, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(fry.y.g(), fry.z.g()));
                  }
               }
            } else {
               $$0.a($$16, $$3, $$2, 32, 32);
            }
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (!this.f.u()) {
            return true;
         } else {
            fry.this.a((fry.a)this);
            if (!($$0 - (double)fry.this.r() <= 32.0) && ac.c() - this.i >= 250L) {
               this.i = ac.c();
               return super.a($$0, $$1, $$2);
            } else {
               if (this.b()) {
                  this.d.aj().a(gsd.a(avw.Ao, 1.0F));
                  this.c();
               }

               return true;
            }
         }
      }

      public boolean b() {
         return this.f.u();
      }

      public void c() {
         if (this.f.u()) {
            if (this.f instanceof eps.c) {
               this.d.a(fmn.a(() -> this.d.a(this.e)));
            } else {
               this.d.x().a(this.f.a(), () -> {
                  fry.this.K();
                  this.d.a(this.e);
               });
            }
         }
      }

      public void d() {
         this.d.a(new flq($$0 -> {
            if ($$0) {
               this.d.a(new fmv(true));
               this.e();
            }

            this.d.a(this.e);
         }, xl.c("selectWorld.deleteQuestion"), xl.a("selectWorld.deleteWarning", this.f.b()), xl.c("selectWorld.deleteButton"), xk.e));
      }

      public void e() {
         epr $$0 = this.d.m();
         String $$1 = this.f.a();

         try (epr.c $$2 = $$0.e($$1)) {
            $$2.k();
         } catch (IOException var8) {
            fjh.b(this.d, $$1);
            fry.v.error("Failed to delete world {}", $$1, var8);
         }

         fry.this.K();
      }

      public void f() {
         this.k();
         String $$0 = this.f.a();

         epr.c $$1;
         try {
            $$1 = this.d.m().d($$0);
         } catch (IOException var6) {
            fjh.a(this.d, $$0);
            fry.v.error("Failed to access level {}", $$0, var6);
            fry.this.K();
            return;
         } catch (evb var7) {
            fry.v.warn("{}", var7.getMessage());
            this.d.a(fmn.a(() -> this.d.a(this.e)));
            return;
         }

         frp $$5;
         try {
            $$5 = frp.a(this.d, $$1, $$1x -> {
               $$1.c();
               if ($$1x) {
                  fry.this.K();
               }

               this.d.a(this.e);
            });
         } catch (vc | vi | IOException var5) {
            $$1.c();
            fjh.a(this.d, $$0);
            fry.v.error("Failed to load world data {}", $$0, var5);
            fry.this.K();
            return;
         }

         this.d.a($$5);
      }

      public void h() {
         this.k();

         try (epr.c $$0 = this.d.m().d(this.f.a())) {
            Pair<dbx, frv> $$1 = this.d.x().a($$0);
            dbx $$2 = (dbx)$$1.getFirst();
            frv $$3 = (frv)$$1.getSecond();
            Path $$4 = frn.a($$0.a(epp.j), this.d);
            if ($$3.b().e()) {
               this.d
                  .a(
                     new flq(
                        $$3x -> this.d.a((fmy)($$3x ? frn.a(this.d, this.e, $$2, $$3, $$4) : this.e)),
                        xl.c("selectWorld.recreate.customized.title"),
                        xl.c("selectWorld.recreate.customized.text"),
                        xk.i,
                        xk.e
                     )
                  );
            } else {
               this.d.a(frn.a(this.d, this.e, $$2, $$3, $$4));
            }
         } catch (evb var8) {
            fry.v.warn("{}", var8.getMessage());
            this.d.a(fmn.a(() -> this.d.a(this.e)));
         } catch (Exception var9) {
            fry.v.error("Unable to recreate world", var9);
            this.d.a(new flk(() -> this.d.a(this.e), xl.c("selectWorld.recreate.error.title"), xl.c("selectWorld.recreate.error.text")));
         }
      }

      private void k() {
         this.d.d(new fme(xl.c("selectWorld.data_read")));
      }

      private void l() {
         boolean $$0 = this.h != null && Files.isRegularFile(this.h);
         if ($$0) {
            try (InputStream $$1 = Files.newInputStream(this.h)) {
               this.g.a(eyu.a($$1));
            } catch (Throwable var7) {
               fry.v.error("Invalid icon for world {}", this.f.a(), var7);
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
   }
}
