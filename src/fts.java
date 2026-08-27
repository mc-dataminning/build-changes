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

public class fts extends fjj<fts.a> {
   public static final DateTimeFormatter a = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withZone(ZoneId.systemDefault());
   static final akt m = new akt("world_list/error_highlighted");
   static final akt n = new akt("world_list/error");
   static final akt o = new akt("world_list/marked_join_highlighted");
   static final akt p = new akt("world_list/marked_join");
   static final akt q = new akt("world_list/warning_highlighted");
   static final akt r = new akt("world_list/warning");
   static final akt s = new akt("world_list/join_highlighted");
   static final akt u = new akt("world_list/join");
   static final Logger v = LogUtils.getLogger();
   static final xe w = xe.c("selectWorld.tooltip.fromNewerVersion1").a(n.m);
   static final xe x = xe.c("selectWorld.tooltip.fromNewerVersion2").a(n.m);
   static final xe y = xe.c("selectWorld.tooltip.snapshot1").a(n.g);
   static final xe z = xe.c("selectWorld.tooltip.snapshot2").a(n.g);
   static final xe A = xe.c("selectWorld.locked").a(n.m);
   static final xe B = xe.c("selectWorld.conversion.tooltip").a(n.m);
   static final xe C = xe.c("selectWorld.incompatible.tooltip").a(n.m);
   static final xe D = xe.c("selectWorld.experimental");
   private final ftn E;
   private CompletableFuture<List<erg>> F;
   @Nullable
   private List<erg> G;
   private String H;
   private final fts.b I;

   public fts(ftn $$0, fgj $$1, int $$2, int $$3, int $$4, int $$5, String $$6, @Nullable fts $$7) {
      super($$1, $$2, $$3, $$4, $$5);
      this.E = $$0;
      this.I = new fts.b($$1);
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
      this.aE_().forEach(fts.a::close);
      super.k();
   }

   @Nullable
   private List<erg> J() {
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
      if (fmo.a($$0)) {
         Optional<fts.c> $$3 = this.d();
         if ($$3.isPresent()) {
            if ($$3.get().b()) {
               this.c.ak().a(guh.a(avo.AM, 1.0F));
               $$3.get().c();
            }

            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void b(fia $$0, int $$1, int $$2, float $$3) {
      List<erg> $$4 = this.J();
      if ($$4 != this.G) {
         this.a($$4);
      }

      super.b($$0, $$1, $$2, $$3);
   }

   private void a(@Nullable List<erg> $$0) {
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

   private CompletableFuture<List<erg>> L() {
      erf.a $$0;
      try {
         $$0 = this.c.m().b();
      } catch (ere var3) {
         v.error("Couldn't load level list", var3);
         this.c(var3.a());
         return CompletableFuture.completedFuture(List.of());
      }

      if ($$0.a()) {
         fth.a(this.c, null);
         return CompletableFuture.completedFuture(List.of());
      } else {
         return this.c.m().a($$0).exceptionally($$0x -> {
            this.c.a(o.a($$0x, "Couldn't load level list"));
            return List.of();
         });
      }
   }

   private void a(String $$0, List<erg> $$1) {
      this.k();
      $$0 = $$0.toLowerCase(Locale.ROOT);

      for (erg $$2 : $$1) {
         if (this.a($$0, $$2)) {
            this.b(new fts.c(this, $$2));
         }
      }

      this.N();
   }

   private boolean a(String $$0, erg $$1) {
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

   private void c(xe $$0) {
      this.c.a(new fnp(xe.c("selectWorld.unable_to_load"), $$0));
   }

   @Override
   public int b() {
      return 270;
   }

   public void a(@Nullable fts.a $$0) {
      super.a($$0);
      this.E.a($$0 instanceof fts.c $$1 ? $$1.f : null);
   }

   public Optional<fts.c> d() {
      fts.a $$0 = this.h();
      return $$0 instanceof fts.c $$1 ? Optional.of($$1) : Optional.empty();
   }

   public ftn I() {
      return this.E;
   }

   @Override
   public void a(fmj $$0) {
      if (this.aE_().contains(this.I)) {
         this.I.b($$0);
      } else {
         super.a($$0);
      }
   }

   public abstract static class a extends fjj.a<fts.a> implements AutoCloseable {
      @Override
      public void close() {
      }
   }

   public static class b extends fts.a {
      private static final xe a = xe.c("selectWorld.loading_list");
      private final fgj b;

      public b(fgj $$0) {
         this.b = $$0;
      }

      @Override
      public void a(fia $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = (this.b.y.n - this.b.h.a(a)) / 2;
         int $$11 = $$2 + ($$5 - 9) / 2;
         $$0.a(this.b.h, a, $$10, $$11, 16777215, false);
         String $$12 = fnx.a(ad.b());
         int $$13 = (this.b.y.n - this.b.h.b($$12)) / 2;
         int $$14 = $$11 + 9;
         $$0.a(this.b.h, $$12, $$13, $$14, -8355712, false);
      }

      @Override
      public xe a() {
         return a;
      }
   }

   public final class c extends fts.a implements AutoCloseable {
      private static final int b = 32;
      private static final int c = 32;
      private final fgj d;
      private final ftn e;
      final erg f;
      private final fnq g;
      @Nullable
      private Path h;
      private long i;

      public c(fts $$1, erg $$2) {
         this.d = $$1.c;
         this.e = $$1.I();
         this.f = $$2;
         this.g = fnq.a(this.d.aa(), $$2.a());
         this.h = $$2.c();
         this.j();
         this.l();
      }

      private void j() {
         if (this.h != null) {
            try {
               BasicFileAttributes $$0 = Files.readAttributes(this.h, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
               if ($$0.isSymbolicLink()) {
                  List<ewl> $$1 = this.d.bf().a(this.h);
                  if (!$$1.isEmpty()) {
                     fts.v.warn("{}", ewj.a(this.h, $$1));
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
               fts.v.error("could not validate symlink", var4);
               this.h = null;
            }
         }
      }

      @Override
      public xe a() {
         xe $$0 = xe.a("narrator.select.world_info", this.f.b(), xe.a(new Date(this.f.f())), this.f.s());
         if (this.f.p()) {
            $$0 = xd.a($$0, fts.A);
         }

         if (this.f.e()) {
            $$0 = xd.a($$0, fts.D);
         }

         return xe.a("narrator.select", $$0);
      }

      @Override
      public void a(fia $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         String $$10 = this.f.b();
         String $$11 = this.f.a();
         long $$12 = this.f.f();
         if ($$12 != -1L) {
            $$11 = $$11 + " (" + fts.a.format(Instant.ofEpochMilli($$12)) + ")";
         }

         if (StringUtils.isEmpty($$10)) {
            $$10 = gse.a("selectWorld.world") + " " + ($$1 + 1);
         }

         xe $$13 = this.f.s();
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
            akt $$16 = $$15 ? fts.s : fts.u;
            akt $$17 = $$15 ? fts.q : fts.r;
            akt $$18 = $$15 ? fts.m : fts.n;
            akt $$19 = $$15 ? fts.o : fts.p;
            if (this.f instanceof erg.c || this.f instanceof erg.b) {
               $$0.a($$18, $$3, $$2, 32, 32);
               $$0.a($$19, $$3, $$2, 32, 32);
               return;
            }

            if (this.f.p()) {
               $$0.a($$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fts.A, 175));
               }
            } else if (this.f.d()) {
               $$0.a($$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fts.B, 175));
               }
            } else if (!this.f.r()) {
               $$0.a($$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fts.C, 175));
               }
            } else if (this.f.m()) {
               $$0.a($$19, $$3, $$2, 32, 32);
               if (this.f.n()) {
                  $$0.a($$18, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(fts.w.g(), fts.x.g()));
                  }
               } else if (!ab.b().g()) {
                  $$0.a($$17, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(fts.y.g(), fts.z.g()));
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
            fts.this.a((fts.a)this);
            if (!($$0 - (double)fts.this.r() <= 32.0) && ad.b() - this.i >= 250L) {
               this.i = ad.b();
               return super.a($$0, $$1, $$2);
            } else {
               if (this.b()) {
                  this.d.ak().a(guh.a(avo.AM, 1.0F));
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
            if (this.f instanceof erg.c) {
               this.d.a(fob.a(() -> this.d.a(this.e)));
            } else {
               this.d.x().a(this.f.a(), () -> {
                  fts.this.K();
                  this.d.a(this.e);
               });
            }
         }
      }

      public void d() {
         this.d.a(new fne($$0 -> {
            if ($$0) {
               this.d.a(new fok(true));
               this.e();
            }

            this.d.a(this.e);
         }, xe.c("selectWorld.deleteQuestion"), xe.a("selectWorld.deleteWarning", this.f.b()), xe.c("selectWorld.deleteButton"), xd.e));
      }

      public void e() {
         erf $$0 = this.d.m();
         String $$1 = this.f.a();

         try (erf.c $$2 = $$0.e($$1)) {
            $$2.k();
         } catch (IOException var8) {
            fkv.b(this.d, $$1);
            fts.v.error("Failed to delete world {}", $$1, var8);
         }

         fts.this.K();
      }

      public void f() {
         this.k();
         String $$0 = this.f.a();

         erf.c $$1;
         try {
            $$1 = this.d.m().d($$0);
         } catch (IOException var6) {
            fkv.a(this.d, $$0);
            fts.v.error("Failed to access level {}", $$0, var6);
            fts.this.K();
            return;
         } catch (ewj var7) {
            fts.v.warn("{}", var7.getMessage());
            this.d.a(fob.a(() -> this.d.a(this.e)));
            return;
         }

         ftj $$5;
         try {
            $$5 = ftj.a(this.d, $$1, $$1x -> {
               $$1.c();
               if ($$1x) {
                  fts.this.K();
               }

               this.d.a(this.e);
            });
         } catch (uv | vb | IOException var5) {
            $$1.c();
            fkv.a(this.d, $$0);
            fts.v.error("Failed to load world data {}", $$0, var5);
            fts.this.K();
            return;
         }

         this.d.a($$5);
      }

      public void h() {
         this.k();

         try (erf.c $$0 = this.d.m().d(this.f.a())) {
            Pair<dce, ftp> $$1 = this.d.x().a($$0);
            dce $$2 = (dce)$$1.getFirst();
            ftp $$3 = (ftp)$$1.getSecond();
            Path $$4 = fth.a($$0.a(erd.j), this.d);
            if ($$3.b().e()) {
               this.d
                  .a(
                     new fne(
                        $$3x -> this.d.a((fon)($$3x ? fth.a(this.d, this.e, $$2, $$3, $$4) : this.e)),
                        xe.c("selectWorld.recreate.customized.title"),
                        xe.c("selectWorld.recreate.customized.text"),
                        xd.i,
                        xd.e
                     )
                  );
            } else {
               this.d.a(fth.a(this.d, this.e, $$2, $$3, $$4));
            }
         } catch (ewj var8) {
            fts.v.warn("{}", var8.getMessage());
            this.d.a(fob.a(() -> this.d.a(this.e)));
         } catch (Exception var9) {
            fts.v.error("Unable to recreate world", var9);
            this.d.a(new fmy(() -> this.d.a(this.e), xe.c("selectWorld.recreate.error.title"), xe.c("selectWorld.recreate.error.text")));
         }
      }

      private void k() {
         this.d.d(new fns(xe.c("selectWorld.data_read")));
      }

      private void l() {
         boolean $$0 = this.h != null && Files.isRegularFile(this.h);
         if ($$0) {
            try (InputStream $$1 = Files.newInputStream(this.h)) {
               this.g.a(fad.a($$1));
            } catch (Throwable var7) {
               fts.v.error("Invalid icon for world {}", this.f.a(), var7);
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
