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

public class fsb extends fhy<fsb.a> {
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
   private final frw E;
   private CompletableFuture<List<epv>> F;
   @Nullable
   private List<epv> G;
   private String H;
   private final fsb.b I;

   public fsb(frw $$0, ffd $$1, int $$2, int $$3, int $$4, int $$5, String $$6, @Nullable fsb $$7) {
      super($$1, $$2, $$3, $$4, $$5);
      this.E = $$0;
      this.I = new fsb.b($$1);
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
      this.aE_().forEach(fsb.a::close);
      super.k();
   }

   @Nullable
   private List<epv> J() {
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
      if (fld.a($$0)) {
         Optional<fsb.c> $$3 = this.d();
         if ($$3.isPresent()) {
            if ($$3.get().b()) {
               this.c.aj().a(gsg.a(avz.Ao, 1.0F));
               $$3.get().c();
            }

            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void b(fgp $$0, int $$1, int $$2, float $$3) {
      List<epv> $$4 = this.J();
      if ($$4 != this.G) {
         this.a($$4);
      }

      super.b($$0, $$1, $$2, $$3);
   }

   private void a(@Nullable List<epv> $$0) {
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

   private CompletableFuture<List<epv>> L() {
      epu.a $$0;
      try {
         $$0 = this.c.m().b();
      } catch (ept var3) {
         v.error("Couldn't load level list", var3);
         this.c(var3.a());
         return CompletableFuture.completedFuture(List.of());
      }

      if ($$0.a()) {
         frq.a(this.c, null);
         return CompletableFuture.completedFuture(List.of());
      } else {
         return this.c.m().a($$0).exceptionally($$0x -> {
            this.c.a(o.a($$0x, "Couldn't load level list"));
            return List.of();
         });
      }
   }

   private void a(String $$0, List<epv> $$1) {
      this.k();
      $$0 = $$0.toLowerCase(Locale.ROOT);

      for (epv $$2 : $$1) {
         if (this.a($$0, $$2)) {
            this.b(new fsb.c(this, $$2));
         }
      }

      this.N();
   }

   private boolean a(String $$0, epv $$1) {
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
      this.c.a(new fme(xo.c("selectWorld.unable_to_load"), $$0));
   }

   @Override
   public int b() {
      return 270;
   }

   public void a(@Nullable fsb.a $$0) {
      super.a($$0);
      this.E.a($$0 instanceof fsb.c $$1 ? $$1.f : null);
   }

   public Optional<fsb.c> d() {
      fsb.a $$0 = this.h();
      return $$0 instanceof fsb.c $$1 ? Optional.of($$1) : Optional.empty();
   }

   public frw I() {
      return this.E;
   }

   @Override
   public void a(fky $$0) {
      if (this.aE_().contains(this.I)) {
         this.I.b($$0);
      } else {
         super.a($$0);
      }
   }

   public abstract static class a extends fhy.a<fsb.a> implements AutoCloseable {
      @Override
      public void close() {
      }
   }

   public static class b extends fsb.a {
      private static final xo a = xo.c("selectWorld.loading_list");
      private final ffd b;

      public b(ffd $$0) {
         this.b = $$0;
      }

      @Override
      public void a(fgp $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = (this.b.y.n - this.b.h.a(a)) / 2;
         int $$11 = $$2 + ($$5 - 9) / 2;
         $$0.a(this.b.h, a, $$10, $$11, 16777215, false);
         String $$12 = fmm.a(ac.c());
         int $$13 = (this.b.y.n - this.b.h.b($$12)) / 2;
         int $$14 = $$11 + 9;
         $$0.a(this.b.h, $$12, $$13, $$14, -8355712, false);
      }

      @Override
      public xo a() {
         return a;
      }
   }

   public final class c extends fsb.a implements AutoCloseable {
      private static final int b = 32;
      private static final int c = 32;
      private final ffd d;
      private final frw e;
      final epv f;
      private final fmf g;
      @Nullable
      private Path h;
      private long i;

      public c(final fsb $$1, final epv $$2) {
         this.d = $$1.c;
         this.e = $$1.I();
         this.f = $$2;
         this.g = fmf.a(this.d.aa(), $$2.a());
         this.h = $$2.c();
         this.j();
         this.l();
      }

      private void j() {
         if (this.h != null) {
            try {
               BasicFileAttributes $$0 = Files.readAttributes(this.h, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
               if ($$0.isSymbolicLink()) {
                  List<evg> $$1 = this.d.bd().a(this.h);
                  if (!$$1.isEmpty()) {
                     fsb.v.warn("{}", eve.a(this.h, $$1));
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
               fsb.v.error("could not validate symlink", var4);
               this.h = null;
            }
         }
      }

      @Override
      public xo a() {
         xo $$0 = xo.a("narrator.select.world_info", this.f.b(), xo.a(new Date(this.f.f())), this.f.s());
         if (this.f.p()) {
            $$0 = xn.a($$0, fsb.A);
         }

         if (this.f.e()) {
            $$0 = xn.a($$0, fsb.D);
         }

         return xo.a("narrator.select", $$0);
      }

      @Override
      public void a(fgp $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         String $$10 = this.f.b();
         String $$11 = this.f.a();
         long $$12 = this.f.f();
         if ($$12 != -1L) {
            $$11 = $$11 + " (" + fsb.a.format(Instant.ofEpochMilli($$12)) + ")";
         }

         if (StringUtils.isEmpty($$10)) {
            $$10 = gqd.a("selectWorld.world") + " " + ($$1 + 1);
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
            ale $$16 = $$15 ? fsb.s : fsb.u;
            ale $$17 = $$15 ? fsb.q : fsb.r;
            ale $$18 = $$15 ? fsb.m : fsb.n;
            ale $$19 = $$15 ? fsb.o : fsb.p;
            if (this.f instanceof epv.c || this.f instanceof epv.b) {
               $$0.a($$18, $$3, $$2, 32, 32);
               $$0.a($$19, $$3, $$2, 32, 32);
               return;
            }

            if (this.f.p()) {
               $$0.a($$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fsb.A, 175));
               }
            } else if (this.f.d()) {
               $$0.a($$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fsb.B, 175));
               }
            } else if (!this.f.r()) {
               $$0.a($$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fsb.C, 175));
               }
            } else if (this.f.m()) {
               $$0.a($$19, $$3, $$2, 32, 32);
               if (this.f.n()) {
                  $$0.a($$18, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(fsb.w.g(), fsb.x.g()));
                  }
               } else if (!aa.b().g()) {
                  $$0.a($$17, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(fsb.y.g(), fsb.z.g()));
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
            fsb.this.a((fsb.a)this);
            if (!($$0 - (double)fsb.this.r() <= 32.0) && ac.c() - this.i >= 250L) {
               this.i = ac.c();
               return super.a($$0, $$1, $$2);
            } else {
               if (this.b()) {
                  this.d.aj().a(gsg.a(avz.Ao, 1.0F));
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
            if (this.f instanceof epv.c) {
               this.d.a(fmq.a(() -> this.d.a(this.e)));
            } else {
               this.d.x().a(this.f.a(), () -> {
                  fsb.this.K();
                  this.d.a(this.e);
               });
            }
         }
      }

      public void d() {
         this.d.a(new flt($$0 -> {
            if ($$0) {
               this.d.a(new fmy(true));
               this.e();
            }

            this.d.a(this.e);
         }, xo.c("selectWorld.deleteQuestion"), xo.a("selectWorld.deleteWarning", this.f.b()), xo.c("selectWorld.deleteButton"), xn.e));
      }

      public void e() {
         epu $$0 = this.d.m();
         String $$1 = this.f.a();

         try (epu.c $$2 = $$0.e($$1)) {
            $$2.k();
         } catch (IOException var8) {
            fjk.b(this.d, $$1);
            fsb.v.error("Failed to delete world {}", $$1, var8);
         }

         fsb.this.K();
      }

      public void f() {
         this.k();
         String $$0 = this.f.a();

         epu.c $$1;
         try {
            $$1 = this.d.m().d($$0);
         } catch (IOException var6) {
            fjk.a(this.d, $$0);
            fsb.v.error("Failed to access level {}", $$0, var6);
            fsb.this.K();
            return;
         } catch (eve var7) {
            fsb.v.warn("{}", var7.getMessage());
            this.d.a(fmq.a(() -> this.d.a(this.e)));
            return;
         }

         frs $$5;
         try {
            $$5 = frs.a(this.d, $$1, $$1x -> {
               $$1.c();
               if ($$1x) {
                  fsb.this.K();
               }

               this.d.a(this.e);
            });
         } catch (vc | vi | IOException var5) {
            $$1.c();
            fjk.a(this.d, $$0);
            fsb.v.error("Failed to load world data {}", $$0, var5);
            fsb.this.K();
            return;
         }

         this.d.a($$5);
      }

      public void h() {
         this.k();

         try (epu.c $$0 = this.d.m().d(this.f.a())) {
            Pair<dca, fry> $$1 = this.d.x().a($$0);
            dca $$2 = (dca)$$1.getFirst();
            fry $$3 = (fry)$$1.getSecond();
            Path $$4 = frq.a($$0.a(eps.j), this.d);
            if ($$3.b().e()) {
               this.d
                  .a(
                     new flt(
                        $$3x -> this.d.a((fnb)($$3x ? frq.a(this.d, this.e, $$2, $$3, $$4) : this.e)),
                        xo.c("selectWorld.recreate.customized.title"),
                        xo.c("selectWorld.recreate.customized.text"),
                        xn.i,
                        xn.e
                     )
                  );
            } else {
               this.d.a(frq.a(this.d, this.e, $$2, $$3, $$4));
            }
         } catch (eve var8) {
            fsb.v.warn("{}", var8.getMessage());
            this.d.a(fmq.a(() -> this.d.a(this.e)));
         } catch (Exception var9) {
            fsb.v.error("Unable to recreate world", var9);
            this.d.a(new fln(() -> this.d.a(this.e), xo.c("selectWorld.recreate.error.title"), xo.c("selectWorld.recreate.error.text")));
         }
      }

      private void k() {
         this.d.d(new fmh(xo.c("selectWorld.data_read")));
      }

      private void l() {
         boolean $$0 = this.h != null && Files.isRegularFile(this.h);
         if ($$0) {
            try (InputStream $$1 = Files.newInputStream(this.h)) {
               this.g.a(eyx.a($$1));
            } catch (Throwable var7) {
               fsb.v.error("Invalid icon for world {}", this.f.a(), var7);
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
