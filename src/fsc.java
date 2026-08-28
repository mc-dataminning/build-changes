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

public class fsc extends fhz<fsc.a> {
   public static final DateTimeFormatter a = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withZone(ZoneId.systemDefault());
   static final ale m = new ale("world_list/error_highlighted");
   static final ale n = new ale("world_list/error");
   static final ale o = new ale("world_list/marked_join_highlighted");
   static final ale p = new ale("world_list/marked_join");
   static final ale q = new ale("world_list/warning_highlighted");
   static final ale r = new ale("world_list/warning");
   static final ale s = new ale("world_list/join_highlighted");
   static final ale u = new ale("world_list/join");
   static final Logger v = LogUtils.getLogger();
   static final xo w = xo.c("selectWorld.tooltip.fromNewerVersion1").a(n.m);
   static final xo x = xo.c("selectWorld.tooltip.fromNewerVersion2").a(n.m);
   static final xo y = xo.c("selectWorld.tooltip.snapshot1").a(n.g);
   static final xo z = xo.c("selectWorld.tooltip.snapshot2").a(n.g);
   static final xo A = xo.c("selectWorld.locked").a(n.m);
   static final xo B = xo.c("selectWorld.conversion.tooltip").a(n.m);
   static final xo C = xo.c("selectWorld.incompatible.tooltip").a(n.m);
   static final xo D = xo.c("selectWorld.experimental");
   private final frx E;
   private CompletableFuture<List<epw>> F;
   @Nullable
   private List<epw> G;
   private String H;
   private final fsc.b I;

   public fsc(frx $$0, ffe $$1, int $$2, int $$3, int $$4, int $$5, String $$6, @Nullable fsc $$7) {
      super($$1, $$2, $$3, $$4, $$5);
      this.E = $$0;
      this.I = new fsc.b($$1);
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
      this.aD_().forEach(fsc.a::close);
      super.k();
   }

   @Nullable
   private List<epw> J() {
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
      if (fle.a($$0)) {
         Optional<fsc.c> $$3 = this.c();
         if ($$3.isPresent()) {
            if ($$3.get().b()) {
               this.c.aj().a(gsh.a(avz.Ao, 1.0F));
               $$3.get().c();
            }

            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void b(fgq $$0, int $$1, int $$2, float $$3) {
      List<epw> $$4 = this.J();
      if ($$4 != this.G) {
         this.a($$4);
      }

      super.b($$0, $$1, $$2, $$3);
   }

   private void a(@Nullable List<epw> $$0) {
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

   private CompletableFuture<List<epw>> L() {
      epv.a $$0;
      try {
         $$0 = this.c.m().b();
      } catch (epu var3) {
         v.error("Couldn't load level list", var3);
         this.c(var3.a());
         return CompletableFuture.completedFuture(List.of());
      }

      if ($$0.a()) {
         frr.a(this.c, null);
         return CompletableFuture.completedFuture(List.of());
      } else {
         return this.c.m().a($$0).exceptionally($$0x -> {
            this.c.a(o.a($$0x, "Couldn't load level list"));
            return List.of();
         });
      }
   }

   private void a(String $$0, List<epw> $$1) {
      this.k();
      $$0 = $$0.toLowerCase(Locale.ROOT);

      for (epw $$2 : $$1) {
         if (this.a($$0, $$2)) {
            this.b(new fsc.c(this, $$2));
         }
      }

      this.N();
   }

   private boolean a(String $$0, epw $$1) {
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

   private void c(xo $$0) {
      this.c.a(new fmf(xo.c("selectWorld.unable_to_load"), $$0));
   }

   @Override
   public int b() {
      return 270;
   }

   public void a(@Nullable fsc.a $$0) {
      super.a($$0);
      this.E.a($$0 instanceof fsc.c $$1 ? $$1.f : null);
   }

   public Optional<fsc.c> c() {
      fsc.a $$0 = this.h();
      return $$0 instanceof fsc.c $$1 ? Optional.of($$1) : Optional.empty();
   }

   public frx I() {
      return this.E;
   }

   @Override
   public void a(fkz $$0) {
      if (this.aD_().contains(this.I)) {
         this.I.b($$0);
      } else {
         super.a($$0);
      }
   }

   public abstract static class a extends fhz.a<fsc.a> implements AutoCloseable {
      @Override
      public void close() {
      }
   }

   public static class b extends fsc.a {
      private static final xo a = xo.c("selectWorld.loading_list");
      private final ffe b;

      public b(ffe $$0) {
         this.b = $$0;
      }

      @Override
      public void a(fgq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = (this.b.y.n - this.b.h.a(a)) / 2;
         int $$11 = $$2 + ($$5 - 9) / 2;
         $$0.a(this.b.h, a, $$10, $$11, 16777215, false);
         String $$12 = fmn.a(ac.c());
         int $$13 = (this.b.y.n - this.b.h.b($$12)) / 2;
         int $$14 = $$11 + 9;
         $$0.a(this.b.h, $$12, $$13, $$14, -8355712, false);
      }

      @Override
      public xo a() {
         return a;
      }
   }

   public final class c extends fsc.a implements AutoCloseable {
      private static final int b = 32;
      private static final int c = 32;
      private final ffe d;
      private final frx e;
      final epw f;
      private final fmg g;
      @Nullable
      private Path h;
      private long i;

      public c(final fsc $$1, final epw $$2) {
         this.d = $$1.c;
         this.e = $$1.I();
         this.f = $$2;
         this.g = fmg.a(this.d.aa(), $$2.a());
         this.h = $$2.c();
         this.j();
         this.l();
      }

      private void j() {
         if (this.h != null) {
            try {
               BasicFileAttributes $$0 = Files.readAttributes(this.h, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
               if ($$0.isSymbolicLink()) {
                  List<evh> $$1 = this.d.bd().a(this.h);
                  if (!$$1.isEmpty()) {
                     fsc.v.warn("{}", evf.a(this.h, $$1));
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
               fsc.v.error("could not validate symlink", var4);
               this.h = null;
            }
         }
      }

      @Override
      public xo a() {
         xo $$0 = xo.a("narrator.select.world_info", this.f.b(), xo.a(new Date(this.f.f())), this.f.s());
         if (this.f.p()) {
            $$0 = xn.a($$0, fsc.A);
         }

         if (this.f.e()) {
            $$0 = xn.a($$0, fsc.D);
         }

         return xo.a("narrator.select", $$0);
      }

      @Override
      public void a(fgq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         String $$10 = this.f.b();
         String $$11 = this.f.a();
         long $$12 = this.f.f();
         if ($$12 != -1L) {
            $$11 = $$11 + " (" + fsc.a.format(Instant.ofEpochMilli($$12)) + ")";
         }

         if (StringUtils.isEmpty($$10)) {
            $$10 = gqe.a("selectWorld.world") + " " + ($$1 + 1);
         }

         xo $$13 = this.f.s();
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
            ale $$16 = $$15 ? fsc.s : fsc.u;
            ale $$17 = $$15 ? fsc.q : fsc.r;
            ale $$18 = $$15 ? fsc.m : fsc.n;
            ale $$19 = $$15 ? fsc.o : fsc.p;
            if (this.f instanceof epw.c || this.f instanceof epw.b) {
               $$0.a($$18, $$3, $$2, 32, 32);
               $$0.a($$19, $$3, $$2, 32, 32);
               return;
            }

            if (this.f.p()) {
               $$0.a($$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fsc.A, 175));
               }
            } else if (this.f.d()) {
               $$0.a($$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fsc.B, 175));
               }
            } else if (!this.f.r()) {
               $$0.a($$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fsc.C, 175));
               }
            } else if (this.f.m()) {
               $$0.a($$19, $$3, $$2, 32, 32);
               if (this.f.n()) {
                  $$0.a($$18, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(fsc.w.g(), fsc.x.g()));
                  }
               } else if (!aa.b().g()) {
                  $$0.a($$17, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(fsc.y.g(), fsc.z.g()));
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
            fsc.this.a((fsc.a)this);
            if (!($$0 - (double)fsc.this.r() <= 32.0) && ac.c() - this.i >= 250L) {
               this.i = ac.c();
               return super.a($$0, $$1, $$2);
            } else {
               if (this.b()) {
                  this.d.aj().a(gsh.a(avz.Ao, 1.0F));
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
            if (this.f instanceof epw.c) {
               this.d.a(fmr.a(() -> this.d.a(this.e)));
            } else {
               this.d.x().a(this.f.a(), () -> {
                  fsc.this.K();
                  this.d.a(this.e);
               });
            }
         }
      }

      public void d() {
         this.d.a(new flu($$0 -> {
            if ($$0) {
               this.d.a(new fmz(true));
               this.e();
            }

            this.d.a(this.e);
         }, xo.c("selectWorld.deleteQuestion"), xo.a("selectWorld.deleteWarning", this.f.b()), xo.c("selectWorld.deleteButton"), xn.e));
      }

      public void e() {
         epv $$0 = this.d.m();
         String $$1 = this.f.a();

         try (epv.c $$2 = $$0.e($$1)) {
            $$2.k();
         } catch (IOException var8) {
            fjl.b(this.d, $$1);
            fsc.v.error("Failed to delete world {}", $$1, var8);
         }

         fsc.this.K();
      }

      public void f() {
         this.k();
         String $$0 = this.f.a();

         epv.c $$1;
         try {
            $$1 = this.d.m().d($$0);
         } catch (IOException var6) {
            fjl.a(this.d, $$0);
            fsc.v.error("Failed to access level {}", $$0, var6);
            fsc.this.K();
            return;
         } catch (evf var7) {
            fsc.v.warn("{}", var7.getMessage());
            this.d.a(fmr.a(() -> this.d.a(this.e)));
            return;
         }

         frt $$5;
         try {
            $$5 = frt.a(this.d, $$1, $$1x -> {
               $$1.c();
               if ($$1x) {
                  fsc.this.K();
               }

               this.d.a(this.e);
            });
         } catch (vc | vi | IOException var5) {
            $$1.c();
            fjl.a(this.d, $$0);
            fsc.v.error("Failed to load world data {}", $$0, var5);
            fsc.this.K();
            return;
         }

         this.d.a($$5);
      }

      public void h() {
         this.k();

         try (epv.c $$0 = this.d.m().d(this.f.a())) {
            Pair<dcb, frz> $$1 = this.d.x().a($$0);
            dcb $$2 = (dcb)$$1.getFirst();
            frz $$3 = (frz)$$1.getSecond();
            Path $$4 = frr.a($$0.a(ept.j), this.d);
            if ($$3.b().e()) {
               this.d
                  .a(
                     new flu(
                        $$3x -> this.d.a((fnc)($$3x ? frr.a(this.d, this.e, $$2, $$3, $$4) : this.e)),
                        xo.c("selectWorld.recreate.customized.title"),
                        xo.c("selectWorld.recreate.customized.text"),
                        xn.i,
                        xn.e
                     )
                  );
            } else {
               this.d.a(frr.a(this.d, this.e, $$2, $$3, $$4));
            }
         } catch (evf var8) {
            fsc.v.warn("{}", var8.getMessage());
            this.d.a(fmr.a(() -> this.d.a(this.e)));
         } catch (Exception var9) {
            fsc.v.error("Unable to recreate world", var9);
            this.d.a(new flo(() -> this.d.a(this.e), xo.c("selectWorld.recreate.error.title"), xo.c("selectWorld.recreate.error.text")));
         }
      }

      private void k() {
         this.d.d(new fmi(xo.c("selectWorld.data_read")));
      }

      private void l() {
         boolean $$0 = this.h != null && Files.isRegularFile(this.h);
         if ($$0) {
            try (InputStream $$1 = Files.newInputStream(this.h)) {
               this.g.a(eyy.a($$1));
            } catch (Throwable var7) {
               fsc.v.error("Invalid icon for world {}", this.f.a(), var7);
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
