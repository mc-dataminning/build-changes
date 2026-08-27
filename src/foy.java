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

public class foy extends feu<foy.a> {
   public static final DateTimeFormatter a = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withZone(ZoneId.systemDefault());
   static final ajv m = new ajv("world_list/error_highlighted");
   static final ajv n = new ajv("world_list/error");
   static final ajv o = new ajv("world_list/marked_join_highlighted");
   static final ajv p = new ajv("world_list/marked_join");
   static final ajv q = new ajv("world_list/warning_highlighted");
   static final ajv r = new ajv("world_list/warning");
   static final ajv s = new ajv("world_list/join_highlighted");
   static final ajv u = new ajv("world_list/join");
   static final Logger v = LogUtils.getLogger();
   static final wi w = wi.c("selectWorld.tooltip.fromNewerVersion1").a(n.m);
   static final wi x = wi.c("selectWorld.tooltip.fromNewerVersion2").a(n.m);
   static final wi y = wi.c("selectWorld.tooltip.snapshot1").a(n.g);
   static final wi z = wi.c("selectWorld.tooltip.snapshot2").a(n.g);
   static final wi A = wi.c("selectWorld.locked").a(n.m);
   static final wi B = wi.c("selectWorld.conversion.tooltip").a(n.m);
   static final wi C = wi.c("selectWorld.incompatible.tooltip").a(n.m);
   static final wi D = wi.c("selectWorld.experimental");
   private final fot E;
   private CompletableFuture<List<enb>> F;
   @Nullable
   private List<enb> G;
   private String H;
   private final foy.b I;

   public foy(fot $$0, fby $$1, int $$2, int $$3, int $$4, int $$5, String $$6, @Nullable foy $$7) {
      super($$1, $$2, $$3, $$4, $$5);
      this.E = $$0;
      this.I = new foy.b($$1);
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
      this.aE_().forEach(foy.a::close);
      super.k();
   }

   @Nullable
   private List<enb> J() {
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
      if (fhz.a($$0)) {
         Optional<foy.c> $$3 = this.d();
         if ($$3.isPresent()) {
            if ($$3.get().b()) {
               this.c.ak().a(gpa.a(auo.zV, 1.0F));
               $$3.get().c();
            }

            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void b(fdl $$0, int $$1, int $$2, float $$3) {
      List<enb> $$4 = this.J();
      if ($$4 != this.G) {
         this.a($$4);
      }

      super.b($$0, $$1, $$2, $$3);
   }

   private void a(@Nullable List<enb> $$0) {
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

   private CompletableFuture<List<enb>> L() {
      ena.a $$0;
      try {
         $$0 = this.c.m().b();
      } catch (emz var3) {
         v.error("Couldn't load level list", var3);
         this.c(var3.a());
         return CompletableFuture.completedFuture(List.of());
      }

      if ($$0.a()) {
         fom.a(this.c, null);
         return CompletableFuture.completedFuture(List.of());
      } else {
         return this.c.m().a($$0).exceptionally($$0x -> {
            this.c.a(o.a($$0x, "Couldn't load level list"));
            return List.of();
         });
      }
   }

   private void a(String $$0, List<enb> $$1) {
      this.k();
      $$0 = $$0.toLowerCase(Locale.ROOT);

      for (enb $$2 : $$1) {
         if (this.a($$0, $$2)) {
            this.b(new foy.c(this, $$2));
         }
      }

      this.N();
   }

   private boolean a(String $$0, enb $$1) {
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

   private void c(wi $$0) {
      this.c.a(new fja(wi.c("selectWorld.unable_to_load"), $$0));
   }

   @Override
   public int b() {
      return 270;
   }

   public void a(@Nullable foy.a $$0) {
      super.a($$0);
      this.E.a($$0 instanceof foy.c $$1 ? $$1.f : null);
   }

   public Optional<foy.c> d() {
      foy.a $$0 = this.h();
      return $$0 instanceof foy.c $$1 ? Optional.of($$1) : Optional.empty();
   }

   public fot I() {
      return this.E;
   }

   @Override
   public void a(fhu $$0) {
      if (this.aE_().contains(this.I)) {
         this.I.b($$0);
      } else {
         super.a($$0);
      }
   }

   public abstract static class a extends feu.a<foy.a> implements AutoCloseable {
      @Override
      public void close() {
      }
   }

   public static class b extends foy.a {
      private static final wi a = wi.c("selectWorld.loading_list");
      private final fby b;

      public b(fby $$0) {
         this.b = $$0;
      }

      @Override
      public void a(fdl $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = (this.b.y.k - this.b.h.a(a)) / 2;
         int $$11 = $$2 + ($$5 - 9) / 2;
         $$0.a(this.b.h, a, $$10, $$11, 16777215, false);
         String $$12 = fji.a(ac.b());
         int $$13 = (this.b.y.k - this.b.h.b($$12)) / 2;
         int $$14 = $$11 + 9;
         $$0.a(this.b.h, $$12, $$13, $$14, -8355712, false);
      }

      @Override
      public wi a() {
         return a;
      }
   }

   public final class c extends foy.a implements AutoCloseable {
      private static final int b = 32;
      private static final int c = 32;
      private final fby d;
      private final fot e;
      final enb f;
      private final fjb g;
      @Nullable
      private Path h;
      private long i;

      public c(foy $$1, enb $$2) {
         this.d = $$1.c;
         this.e = $$1.I();
         this.f = $$2;
         this.g = fjb.a(this.d.aa(), $$2.a());
         this.h = $$2.c();
         this.j();
         this.l();
      }

      private void j() {
         if (this.h != null) {
            try {
               BasicFileAttributes $$0 = Files.readAttributes(this.h, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
               if ($$0.isSymbolicLink()) {
                  List<esa> $$1 = this.d.be().a(this.h);
                  if (!$$1.isEmpty()) {
                     foy.v.warn("{}", ery.a(this.h, $$1));
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
               foy.v.error("could not validate symlink", var4);
               this.h = null;
            }
         }
      }

      @Override
      public wi a() {
         wi $$0 = wi.a("narrator.select.world_info", this.f.b(), wi.a(new Date(this.f.f())), this.f.s());
         if (this.f.p()) {
            $$0 = wh.a($$0, foy.A);
         }

         if (this.f.e()) {
            $$0 = wh.a($$0, foy.D);
         }

         return wi.a("narrator.select", $$0);
      }

      @Override
      public void a(fdl $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         String $$10 = this.f.b();
         String $$11 = this.f.a();
         long $$12 = this.f.f();
         if ($$12 != -1L) {
            $$11 = $$11 + " (" + foy.a.format(Instant.ofEpochMilli($$12)) + ")";
         }

         if (StringUtils.isEmpty($$10)) {
            $$10 = gmx.a("selectWorld.world") + " " + ($$1 + 1);
         }

         wi $$13 = this.f.s();
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
            ajv $$16 = $$15 ? foy.s : foy.u;
            ajv $$17 = $$15 ? foy.q : foy.r;
            ajv $$18 = $$15 ? foy.m : foy.n;
            ajv $$19 = $$15 ? foy.o : foy.p;
            if (this.f instanceof enb.c || this.f instanceof enb.b) {
               $$0.a($$18, $$3, $$2, 32, 32);
               $$0.a($$19, $$3, $$2, 32, 32);
               return;
            }

            if (this.f.p()) {
               $$0.a($$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(foy.A, 175));
               }
            } else if (this.f.d()) {
               $$0.a($$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(foy.B, 175));
               }
            } else if (!this.f.r()) {
               $$0.a($$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(foy.C, 175));
               }
            } else if (this.f.m()) {
               $$0.a($$19, $$3, $$2, 32, 32);
               if (this.f.n()) {
                  $$0.a($$18, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(foy.w.g(), foy.x.g()));
                  }
               } else if (!aa.b().g()) {
                  $$0.a($$17, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(foy.y.g(), foy.z.g()));
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
            foy.this.a((foy.a)this);
            if (!($$0 - (double)foy.this.r() <= 32.0) && ac.b() - this.i >= 250L) {
               this.i = ac.b();
               return super.a($$0, $$1, $$2);
            } else {
               if (this.b()) {
                  this.d.ak().a(gpa.a(auo.zV, 1.0F));
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
            if (this.f instanceof enb.c) {
               this.d.a(fjm.a(() -> this.d.a(this.e)));
            } else {
               this.d.x().a(this.f.a(), () -> {
                  foy.this.K();
                  this.d.a(this.e);
               });
            }
         }
      }

      public void d() {
         this.d.a(new fip($$0 -> {
            if ($$0) {
               this.d.a(new fju(true));
               this.e();
            }

            this.d.a(this.e);
         }, wi.c("selectWorld.deleteQuestion"), wi.a("selectWorld.deleteWarning", this.f.b()), wi.c("selectWorld.deleteButton"), wh.e));
      }

      public void e() {
         ena $$0 = this.d.m();
         String $$1 = this.f.a();

         try (ena.c $$2 = $$0.e($$1)) {
            $$2.k();
         } catch (IOException var8) {
            fgg.b(this.d, $$1);
            foy.v.error("Failed to delete world {}", $$1, var8);
         }

         foy.this.K();
      }

      public void f() {
         this.k();
         String $$0 = this.f.a();

         ena.c $$1;
         try {
            $$1 = this.d.m().d($$0);
         } catch (IOException var6) {
            fgg.a(this.d, $$0);
            foy.v.error("Failed to access level {}", $$0, var6);
            foy.this.K();
            return;
         } catch (ery var7) {
            foy.v.warn("{}", var7.getMessage());
            this.d.a(fjm.a(() -> this.d.a(this.e)));
            return;
         }

         foo $$5;
         try {
            $$5 = foo.a(this.d, $$1, $$1x -> {
               $$1.c();
               if ($$1x) {
                  foy.this.K();
               }

               this.d.a(this.e);
            });
         } catch (tz | uf | IOException var5) {
            $$1.c();
            fgg.a(this.d, $$0);
            foy.v.error("Failed to load world data {}", $$0, var5);
            foy.this.K();
            return;
         }

         this.d.a($$5);
      }

      public void h() {
         this.k();

         try (ena.c $$0 = this.d.m().d(this.f.a())) {
            Pair<czk, fov> $$1 = this.d.x().a($$0);
            czk $$2 = (czk)$$1.getFirst();
            fov $$3 = (fov)$$1.getSecond();
            Path $$4 = fom.a($$0.a(emy.j), this.d);
            if ($$3.b().e()) {
               this.d
                  .a(
                     new fip(
                        $$3x -> this.d.a((fjx)($$3x ? fom.a(this.d, this.e, $$2, $$3, $$4) : this.e)),
                        wi.c("selectWorld.recreate.customized.title"),
                        wi.c("selectWorld.recreate.customized.text"),
                        wh.i,
                        wh.e
                     )
                  );
            } else {
               this.d.a(fom.a(this.d, this.e, $$2, $$3, $$4));
            }
         } catch (ery var8) {
            foy.v.warn("{}", var8.getMessage());
            this.d.a(fjm.a(() -> this.d.a(this.e)));
         } catch (Exception var9) {
            foy.v.error("Unable to recreate world", var9);
            this.d.a(new fij(() -> this.d.a(this.e), wi.c("selectWorld.recreate.error.title"), wi.c("selectWorld.recreate.error.text")));
         }
      }

      private void k() {
         this.d.d(new fjd(wi.c("selectWorld.data_read")));
      }

      private void l() {
         boolean $$0 = this.h != null && Files.isRegularFile(this.h);
         if ($$0) {
            try (InputStream $$1 = Files.newInputStream(this.h)) {
               this.g.a(evs.a($$1));
            } catch (Throwable var7) {
               foy.v.error("Invalid icon for world {}", this.f.a(), var7);
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
