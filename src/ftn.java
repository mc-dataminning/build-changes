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

public class ftn extends fji<ftn.a> {
   public static final DateTimeFormatter a = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withZone(ZoneId.systemDefault());
   static final akr m = akr.b("world_list/error_highlighted");
   static final akr n = akr.b("world_list/error");
   static final akr o = akr.b("world_list/marked_join_highlighted");
   static final akr p = akr.b("world_list/marked_join");
   static final akr q = akr.b("world_list/warning_highlighted");
   static final akr r = akr.b("world_list/warning");
   static final akr s = akr.b("world_list/join_highlighted");
   static final akr u = akr.b("world_list/join");
   static final Logger v = LogUtils.getLogger();
   static final wz w = wz.c("selectWorld.tooltip.fromNewerVersion1").a(n.m);
   static final wz x = wz.c("selectWorld.tooltip.fromNewerVersion2").a(n.m);
   static final wz y = wz.c("selectWorld.tooltip.snapshot1").a(n.g);
   static final wz z = wz.c("selectWorld.tooltip.snapshot2").a(n.g);
   static final wz A = wz.c("selectWorld.locked").a(n.m);
   static final wz B = wz.c("selectWorld.conversion.tooltip").a(n.m);
   static final wz C = wz.c("selectWorld.incompatible.tooltip").a(n.m);
   static final wz D = wz.c("selectWorld.experimental");
   private final fti E;
   private CompletableFuture<List<erg>> F;
   @Nullable
   private List<erg> G;
   private String H;
   private final ftn.b I;

   public ftn(fti $$0, fgo $$1, int $$2, int $$3, int $$4, int $$5, String $$6, @Nullable ftn $$7) {
      super($$1, $$2, $$3, $$4, $$5);
      this.E = $$0;
      this.I = new ftn.b($$1);
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
      this.aK_().forEach(ftn.a::close);
      super.k();
   }

   @Nullable
   private List<erg> K() {
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
      if (fmn.a($$0)) {
         Optional<ftn.c> $$3 = this.c();
         if ($$3.isPresent()) {
            if ($$3.get().b()) {
               this.c.aj().a(gtv.a(avp.Ar, 1.0F));
               $$3.get().c();
            }

            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void b(fhz $$0, int $$1, int $$2, float $$3) {
      List<erg> $$4 = this.K();
      if ($$4 != this.G) {
         this.a($$4);
      }

      super.b($$0, $$1, $$2, $$3);
   }

   private void a(@Nullable List<erg> $$0) {
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

   private CompletableFuture<List<erg>> M() {
      erf.a $$0;
      try {
         $$0 = this.c.m().b();
      } catch (ere var3) {
         v.error("Couldn't load level list", var3);
         this.c(var3.a());
         return CompletableFuture.completedFuture(List.of());
      }

      if ($$0.a()) {
         ftc.a(this.c, null);
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
            this.b(new ftn.c(this, $$2));
         }
      }

      this.O();
   }

   private boolean a(String $$0, erg $$1) {
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

   private void c(wz $$0) {
      this.c.a(new fnm(wz.c("selectWorld.unable_to_load"), $$0));
   }

   @Override
   public int b() {
      return 270;
   }

   public void a(@Nullable ftn.a $$0) {
      super.a($$0);
      this.E.a($$0 instanceof ftn.c $$1 ? $$1.f : null);
   }

   public Optional<ftn.c> c() {
      ftn.a $$0 = this.h();
      return $$0 instanceof ftn.c $$1 ? Optional.of($$1) : Optional.empty();
   }

   public fti J() {
      return this.E;
   }

   @Override
   public void a(fmi $$0) {
      if (this.aK_().contains(this.I)) {
         this.I.b($$0);
      } else {
         super.a($$0);
      }
   }

   public abstract static class a extends fji.a<ftn.a> implements AutoCloseable {
      @Override
      public void close() {
      }
   }

   public static class b extends ftn.a {
      private static final wz a = wz.c("selectWorld.loading_list");
      private final fgo b;

      public b(fgo $$0) {
         this.b = $$0;
      }

      @Override
      public void a(fhz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = (this.b.y.m - this.b.h.a(a)) / 2;
         int $$11 = $$2 + ($$5 - 9) / 2;
         $$0.a(this.b.h, a, $$10, $$11, 16777215, false);
         String $$12 = fns.a(ad.c());
         int $$13 = (this.b.y.m - this.b.h.b($$12)) / 2;
         int $$14 = $$11 + 9;
         $$0.a(this.b.h, $$12, $$13, $$14, -8355712, false);
      }

      @Override
      public wz a() {
         return a;
      }
   }

   public final class c extends ftn.a implements AutoCloseable {
      private static final int b = 32;
      private static final int c = 32;
      private final fgo d;
      private final fti e;
      final erg f;
      private final fnn g;
      @Nullable
      private Path h;
      private long i;

      public c(final ftn $$1, final erg $$2) {
         this.d = $$1.c;
         this.e = $$1.J();
         this.f = $$2;
         this.g = fnn.a(this.d.aa(), $$2.a());
         this.h = $$2.c();
         this.j();
         this.l();
      }

      private void j() {
         if (this.h != null) {
            try {
               BasicFileAttributes $$0 = Files.readAttributes(this.h, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
               if ($$0.isSymbolicLink()) {
                  List<ewt> $$1 = this.d.bb().a(this.h);
                  if (!$$1.isEmpty()) {
                     ftn.v.warn("{}", ewr.a(this.h, $$1));
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
               ftn.v.error("could not validate symlink", var4);
               this.h = null;
            }
         }
      }

      @Override
      public wz a() {
         wz $$0 = wz.a("narrator.select.world_info", this.f.b(), wz.a(new Date(this.f.f())), this.f.s());
         if (this.f.p()) {
            $$0 = wy.a($$0, ftn.A);
         }

         if (this.f.e()) {
            $$0 = wy.a($$0, ftn.D);
         }

         return wz.a("narrator.select", $$0);
      }

      @Override
      public void a(fhz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         String $$10 = this.f.b();
         String $$11 = this.f.a();
         long $$12 = this.f.f();
         if ($$12 != -1L) {
            $$11 = $$11 + " (" + ftn.a.format(Instant.ofEpochMilli($$12)) + ")";
         }

         if (StringUtils.isEmpty($$10)) {
            $$10 = grr.a("selectWorld.world") + " " + ($$1 + 1);
         }

         wz $$13 = this.f.s();
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
            akr $$16 = $$15 ? ftn.s : ftn.u;
            akr $$17 = $$15 ? ftn.q : ftn.r;
            akr $$18 = $$15 ? ftn.m : ftn.n;
            akr $$19 = $$15 ? ftn.o : ftn.p;
            if (this.f instanceof erg.c || this.f instanceof erg.b) {
               $$0.a($$18, $$3, $$2, 32, 32);
               $$0.a($$19, $$3, $$2, 32, 32);
               return;
            }

            if (this.f.p()) {
               $$0.a($$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(ftn.A, 175));
               }
            } else if (this.f.d()) {
               $$0.a($$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(ftn.B, 175));
               }
            } else if (!this.f.r()) {
               $$0.a($$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(ftn.C, 175));
               }
            } else if (this.f.m()) {
               $$0.a($$19, $$3, $$2, 32, 32);
               if (this.f.n()) {
                  $$0.a($$18, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(ftn.w.g(), ftn.x.g()));
                  }
               } else if (!ab.b().g()) {
                  $$0.a($$17, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(ftn.y.g(), ftn.z.g()));
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
            ftn.this.a((ftn.a)this);
            if (!($$0 - (double)ftn.this.s() <= 32.0) && ad.c() - this.i >= 250L) {
               this.i = ad.c();
               return super.a($$0, $$1, $$2);
            } else {
               if (this.b()) {
                  this.d.aj().a(gtv.a(avp.Ar, 1.0F));
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
               this.d.a(fnv.a(() -> this.d.a(this.e)));
            } else {
               this.d.x().a(this.f.a(), () -> {
                  ftn.this.L();
                  this.d.a(this.e);
               });
            }
         }
      }

      public void d() {
         this.d.a(new fnb($$0 -> {
            if ($$0) {
               this.d.a(new foa(true));
               this.e();
            }

            this.d.a(this.e);
         }, wz.c("selectWorld.deleteQuestion"), wz.a("selectWorld.deleteWarning", this.f.b()), wz.c("selectWorld.deleteButton"), wy.e));
      }

      public void e() {
         erf $$0 = this.d.m();
         String $$1 = this.f.a();

         try (erf.c $$2 = $$0.e($$1)) {
            $$2.k();
         } catch (IOException var8) {
            fku.b(this.d, $$1);
            ftn.v.error("Failed to delete world {}", $$1, var8);
         }

         ftn.this.L();
      }

      public void f() {
         this.k();
         String $$0 = this.f.a();

         erf.c $$1;
         try {
            $$1 = this.d.m().d($$0);
         } catch (IOException var6) {
            fku.a(this.d, $$0);
            ftn.v.error("Failed to access level {}", $$0, var6);
            ftn.this.L();
            return;
         } catch (ewr var7) {
            ftn.v.warn("{}", var7.getMessage());
            this.d.a(fnv.a(() -> this.d.a(this.e)));
            return;
         }

         fte $$5;
         try {
            $$5 = fte.a(this.d, $$1, $$1x -> {
               $$1.c();
               if ($$1x) {
                  ftn.this.L();
               }

               this.d.a(this.e);
            });
         } catch (um | us | IOException var5) {
            $$1.c();
            fku.a(this.d, $$0);
            ftn.v.error("Failed to load world data {}", $$0, var5);
            ftn.this.L();
            return;
         }

         this.d.a($$5);
      }

      public void h() {
         this.k();

         try (erf.c $$0 = this.d.m().d(this.f.a())) {
            Pair<dda, ftk> $$1 = this.d.x().a($$0);
            dda $$2 = (dda)$$1.getFirst();
            ftk $$3 = (ftk)$$1.getSecond();
            Path $$4 = ftc.a($$0.a(erd.j), this.d);
            $$3.b();
            if ($$3.c().e()) {
               this.d
                  .a(
                     new fnb(
                        $$3x -> this.d.a((fod)($$3x ? ftc.a(this.d, this.e, $$2, $$3, $$4) : this.e)),
                        wz.c("selectWorld.recreate.customized.title"),
                        wz.c("selectWorld.recreate.customized.text"),
                        wy.i,
                        wy.e
                     )
                  );
            } else {
               this.d.a(ftc.a(this.d, this.e, $$2, $$3, $$4));
            }
         } catch (ewr var8) {
            ftn.v.warn("{}", var8.getMessage());
            this.d.a(fnv.a(() -> this.d.a(this.e)));
         } catch (Exception var9) {
            ftn.v.error("Unable to recreate world", var9);
            this.d.a(new fmw(() -> this.d.a(this.e), wz.c("selectWorld.recreate.error.title"), wz.c("selectWorld.recreate.error.text")));
         }
      }

      private void k() {
         this.d.d(new fno(wz.c("selectWorld.data_read")));
      }

      private void l() {
         boolean $$0 = this.h != null && Files.isRegularFile(this.h);
         if ($$0) {
            try (InputStream $$1 = Files.newInputStream(this.h)) {
               this.g.a(faj.a($$1));
            } catch (Throwable var7) {
               ftn.v.error("Invalid icon for world {}", this.f.a(), var7);
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
