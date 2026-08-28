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

public class fth extends fjc<fth.a> {
   public static final DateTimeFormatter a = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withZone(ZoneId.systemDefault());
   static final akq m = akq.b("world_list/error_highlighted");
   static final akq n = akq.b("world_list/error");
   static final akq o = akq.b("world_list/marked_join_highlighted");
   static final akq p = akq.b("world_list/marked_join");
   static final akq q = akq.b("world_list/warning_highlighted");
   static final akq r = akq.b("world_list/warning");
   static final akq s = akq.b("world_list/join_highlighted");
   static final akq u = akq.b("world_list/join");
   static final Logger v = LogUtils.getLogger();
   static final wy w = wy.c("selectWorld.tooltip.fromNewerVersion1").a(n.m);
   static final wy x = wy.c("selectWorld.tooltip.fromNewerVersion2").a(n.m);
   static final wy y = wy.c("selectWorld.tooltip.snapshot1").a(n.g);
   static final wy z = wy.c("selectWorld.tooltip.snapshot2").a(n.g);
   static final wy A = wy.c("selectWorld.locked").a(n.m);
   static final wy B = wy.c("selectWorld.conversion.tooltip").a(n.m);
   static final wy C = wy.c("selectWorld.incompatible.tooltip").a(n.m);
   static final wy D = wy.c("selectWorld.experimental");
   private final ftc E;
   private CompletableFuture<List<era>> F;
   @Nullable
   private List<era> G;
   private String H;
   private final fth.b I;

   public fth(ftc $$0, fgi $$1, int $$2, int $$3, int $$4, int $$5, String $$6, @Nullable fth $$7) {
      super($$1, $$2, $$3, $$4, $$5);
      this.E = $$0;
      this.I = new fth.b($$1);
      this.H = $$6;
      if ($$7 != null) {
         this.F = $$7.F;
      } else {
         this.F = this.M();
      }

      this.a(this.K());
   }

   @Override
   protected void k() {
      this.aG_().forEach(fth.a::close);
      super.k();
   }

   @Nullable
   private List<era> K() {
      try {
         return this.F.getNow(null);
      } catch (CancellationException | CompletionException var2) {
         return null;
      }
   }

   void L() {
      this.F = this.M();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (fmh.a($$0)) {
         Optional<fth.c> $$3 = this.c();
         if ($$3.isPresent()) {
            if ($$3.get().b()) {
               this.c.aj().a(gto.a(avo.Ar, 1.0F));
               $$3.get().c();
            }

            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void b(fht $$0, int $$1, int $$2, float $$3) {
      List<era> $$4 = this.K();
      if ($$4 != this.G) {
         this.a($$4);
      }

      super.b($$0, $$1, $$2, $$3);
   }

   private void a(@Nullable List<era> $$0) {
      if ($$0 == null) {
         this.N();
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

   private CompletableFuture<List<era>> M() {
      eqz.a $$0;
      try {
         $$0 = this.c.m().b();
      } catch (eqy var3) {
         v.error("Couldn't load level list", var3);
         this.c(var3.a());
         return CompletableFuture.completedFuture(List.of());
      }

      if ($$0.a()) {
         fsw.a(this.c, null);
         return CompletableFuture.completedFuture(List.of());
      } else {
         return this.c.m().a($$0).exceptionally($$0x -> {
            this.c.a(o.a($$0x, "Couldn't load level list"));
            return List.of();
         });
      }
   }

   private void a(String $$0, List<era> $$1) {
      this.k();
      $$0 = $$0.toLowerCase(Locale.ROOT);

      for (era $$2 : $$1) {
         if (this.a($$0, $$2)) {
            this.b(new fth.c(this, $$2));
         }
      }

      this.O();
   }

   private boolean a(String $$0, era $$1) {
      return $$1.b().toLowerCase(Locale.ROOT).contains($$0) || $$1.a().toLowerCase(Locale.ROOT).contains($$0);
   }

   private void N() {
      this.k();
      this.b(this.I);
      this.O();
   }

   private void O() {
      this.o();
      this.E.d(true);
   }

   private void c(wy $$0) {
      this.c.a(new fng(wy.c("selectWorld.unable_to_load"), $$0));
   }

   @Override
   public int b() {
      return 270;
   }

   public void a(@Nullable fth.a $$0) {
      super.a($$0);
      this.E.a($$0 instanceof fth.c $$1 ? $$1.f : null);
   }

   public Optional<fth.c> c() {
      fth.a $$0 = this.h();
      return $$0 instanceof fth.c $$1 ? Optional.of($$1) : Optional.empty();
   }

   public ftc J() {
      return this.E;
   }

   @Override
   public void a(fmc $$0) {
      if (this.aG_().contains(this.I)) {
         this.I.b($$0);
      } else {
         super.a($$0);
      }
   }

   public abstract static class a extends fjc.a<fth.a> implements AutoCloseable {
      @Override
      public void close() {
      }
   }

   public static class b extends fth.a {
      private static final wy a = wy.c("selectWorld.loading_list");
      private final fgi b;

      public b(fgi $$0) {
         this.b = $$0;
      }

      @Override
      public void a(fht $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = (this.b.y.m - this.b.h.a(a)) / 2;
         int $$11 = $$2 + ($$5 - 9) / 2;
         $$0.a(this.b.h, a, $$10, $$11, 16777215, false);
         String $$12 = fnm.a(ad.c());
         int $$13 = (this.b.y.m - this.b.h.b($$12)) / 2;
         int $$14 = $$11 + 9;
         $$0.a(this.b.h, $$12, $$13, $$14, -8355712, false);
      }

      @Override
      public wy a() {
         return a;
      }
   }

   public final class c extends fth.a implements AutoCloseable {
      private static final int b = 32;
      private static final int c = 32;
      private final fgi d;
      private final ftc e;
      final era f;
      private final fnh g;
      @Nullable
      private Path h;
      private long i;

      public c(final fth $$1, final era $$2) {
         this.d = $$1.c;
         this.e = $$1.J();
         this.f = $$2;
         this.g = fnh.a(this.d.aa(), $$2.a());
         this.h = $$2.c();
         this.j();
         this.l();
      }

      private void j() {
         if (this.h != null) {
            try {
               BasicFileAttributes $$0 = Files.readAttributes(this.h, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
               if ($$0.isSymbolicLink()) {
                  List<ewn> $$1 = this.d.bb().a(this.h);
                  if (!$$1.isEmpty()) {
                     fth.v.warn("{}", ewl.a(this.h, $$1));
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
               fth.v.error("could not validate symlink", var4);
               this.h = null;
            }
         }
      }

      @Override
      public wy a() {
         wy $$0 = wy.a("narrator.select.world_info", this.f.b(), wy.a(new Date(this.f.f())), this.f.s());
         if (this.f.p()) {
            $$0 = wx.a($$0, fth.A);
         }

         if (this.f.e()) {
            $$0 = wx.a($$0, fth.D);
         }

         return wy.a("narrator.select", $$0);
      }

      @Override
      public void a(fht $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         String $$10 = this.f.b();
         String $$11 = this.f.a();
         long $$12 = this.f.f();
         if ($$12 != -1L) {
            $$11 = $$11 + " (" + fth.a.format(Instant.ofEpochMilli($$12)) + ")";
         }

         if (StringUtils.isEmpty($$10)) {
            $$10 = grl.a("selectWorld.world") + " " + ($$1 + 1);
         }

         wy $$13 = this.f.s();
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
            akq $$16 = $$15 ? fth.s : fth.u;
            akq $$17 = $$15 ? fth.q : fth.r;
            akq $$18 = $$15 ? fth.m : fth.n;
            akq $$19 = $$15 ? fth.o : fth.p;
            if (this.f instanceof era.c || this.f instanceof era.b) {
               $$0.a($$18, $$3, $$2, 32, 32);
               $$0.a($$19, $$3, $$2, 32, 32);
               return;
            }

            if (this.f.p()) {
               $$0.a($$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fth.A, 175));
               }
            } else if (this.f.d()) {
               $$0.a($$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fth.B, 175));
               }
            } else if (!this.f.r()) {
               $$0.a($$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fth.C, 175));
               }
            } else if (this.f.m()) {
               $$0.a($$19, $$3, $$2, 32, 32);
               if (this.f.n()) {
                  $$0.a($$18, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(fth.w.g(), fth.x.g()));
                  }
               } else if (!ab.b().g()) {
                  $$0.a($$17, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(fth.y.g(), fth.z.g()));
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
            fth.this.a((fth.a)this);
            if (!($$0 - (double)fth.this.s() <= 32.0) && ad.c() - this.i >= 250L) {
               this.i = ad.c();
               return super.a($$0, $$1, $$2);
            } else {
               if (this.b()) {
                  this.d.aj().a(gto.a(avo.Ar, 1.0F));
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
            if (this.f instanceof era.c) {
               this.d.a(fnp.a(() -> this.d.a(this.e)));
            } else {
               this.d.x().a(this.f.a(), () -> {
                  fth.this.L();
                  this.d.a(this.e);
               });
            }
         }
      }

      public void d() {
         this.d.a(new fmv($$0 -> {
            if ($$0) {
               this.d.a(new fnu(true));
               this.e();
            }

            this.d.a(this.e);
         }, wy.c("selectWorld.deleteQuestion"), wy.a("selectWorld.deleteWarning", this.f.b()), wy.c("selectWorld.deleteButton"), wx.e));
      }

      public void e() {
         eqz $$0 = this.d.m();
         String $$1 = this.f.a();

         try (eqz.c $$2 = $$0.e($$1)) {
            $$2.k();
         } catch (IOException var8) {
            fko.b(this.d, $$1);
            fth.v.error("Failed to delete world {}", $$1, var8);
         }

         fth.this.L();
      }

      public void f() {
         this.k();
         String $$0 = this.f.a();

         eqz.c $$1;
         try {
            $$1 = this.d.m().d($$0);
         } catch (IOException var6) {
            fko.a(this.d, $$0);
            fth.v.error("Failed to access level {}", $$0, var6);
            fth.this.L();
            return;
         } catch (ewl var7) {
            fth.v.warn("{}", var7.getMessage());
            this.d.a(fnp.a(() -> this.d.a(this.e)));
            return;
         }

         fsy $$5;
         try {
            $$5 = fsy.a(this.d, $$1, $$1x -> {
               $$1.c();
               if ($$1x) {
                  fth.this.L();
               }

               this.d.a(this.e);
            });
         } catch (ul | ur | IOException var5) {
            $$1.c();
            fko.a(this.d, $$0);
            fth.v.error("Failed to load world data {}", $$0, var5);
            fth.this.L();
            return;
         }

         this.d.a($$5);
      }

      public void h() {
         this.k();

         try (eqz.c $$0 = this.d.m().d(this.f.a())) {
            Pair<dcy, fte> $$1 = this.d.x().a($$0);
            dcy $$2 = (dcy)$$1.getFirst();
            fte $$3 = (fte)$$1.getSecond();
            Path $$4 = fsw.a($$0.a(eqx.j), this.d);
            $$3.b();
            if ($$3.c().e()) {
               this.d
                  .a(
                     new fmv(
                        $$3x -> this.d.a((fnx)($$3x ? fsw.a(this.d, this.e, $$2, $$3, $$4) : this.e)),
                        wy.c("selectWorld.recreate.customized.title"),
                        wy.c("selectWorld.recreate.customized.text"),
                        wx.i,
                        wx.e
                     )
                  );
            } else {
               this.d.a(fsw.a(this.d, this.e, $$2, $$3, $$4));
            }
         } catch (ewl var8) {
            fth.v.warn("{}", var8.getMessage());
            this.d.a(fnp.a(() -> this.d.a(this.e)));
         } catch (Exception var9) {
            fth.v.error("Unable to recreate world", var9);
            this.d.a(new fmq(() -> this.d.a(this.e), wy.c("selectWorld.recreate.error.title"), wy.c("selectWorld.recreate.error.text")));
         }
      }

      private void k() {
         this.d.d(new fni(wy.c("selectWorld.data_read")));
      }

      private void l() {
         boolean $$0 = this.h != null && Files.isRegularFile(this.h);
         if ($$0) {
            try (InputStream $$1 = Files.newInputStream(this.h)) {
               this.g.a(fad.a($$1));
            } catch (Throwable var7) {
               fth.v.error("Invalid icon for world {}", this.f.a(), var7);
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
