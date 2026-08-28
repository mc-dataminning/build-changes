import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Either;
import com.mojang.logging.LogUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fhg extends hep {
   static final Logger a = LogUtils.getLogger();
   static final ali b = ali.b("widget/slot_frame");
   private static final xi c = xi.c("mco.template.button.select");
   private static final xi B = xi.c("mco.template.button.trailer");
   private static final xi C = xi.c("mco.template.button.publisher");
   private static final int D = 100;
   private static final int E = 10;
   private final fow F = new fow(this);
   final Consumer<ffx> G;
   fhg.b H;
   private final ffi.d I;
   private flh J;
   private flh K;
   private flh L;
   @Nullable
   ffx M = null;
   @Nullable
   String N;
   @Nullable
   private xi[] O;
   @Nullable
   List<fhx.a> P;

   public fhg(xi $$0, Consumer<ffx> $$1, ffi.d $$2) {
      this($$0, $$1, $$2, null);
   }

   public fhg(xi $$0, Consumer<ffx> $$1, ffi.d $$2, @Nullable ffy $$3) {
      super($$0);
      this.G = $$1;
      this.I = $$2;
      if ($$3 == null) {
         this.H = new fhg.b(this);
         this.a(new ffy(10));
      } else {
         this.H = new fhg.b(this, Lists.newArrayList($$3.a));
         this.a($$3);
      }
   }

   public void a(xi... $$0) {
      this.O = $$0;
   }

   @Override
   public void aR_() {
      this.F.a(this.l, this.p);
      this.H = this.F.c(new fhg.b(this, this.H.d()));
      fpa $$0 = this.F.b(fpa.e().a(10));
      $$0.c().b();
      this.K = $$0.a(flh.a(B, $$0x -> this.F()).a(100).a());
      this.J = $$0.a(flh.a(c, $$0x -> this.E()).a(100).a());
      $$0.a(flh.a(xh.e, $$0x -> this.d()).a(100).a());
      this.L = $$0.a(flh.a(C, $$0x -> this.G()).a(100).a());
      this.D();
      this.F.a($$1 -> {
         flf var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.H.b(this.n, this.o - this.F.b() - this.J());
      this.F.a();
   }

   @Override
   public xi i() {
      List<xi> $$0 = Lists.newArrayListWithCapacity(2);
      $$0.add(this.l);
      if (this.O != null) {
         $$0.addAll(Arrays.asList(this.O));
      }

      return xh.a($$0);
   }

   void D() {
      this.L.k = this.M != null && !this.M.e.isEmpty();
      this.K.k = this.M != null && !this.M.g.isEmpty();
      this.J.j = this.M != null;
   }

   @Override
   public void d() {
      this.G.accept(null);
   }

   private void E() {
      if (this.M != null) {
         this.G.accept(this.M);
      }
   }

   private void F() {
      if (this.M != null && !this.M.g.isBlank()) {
         fpx.a(this, this.M.g);
      }
   }

   private void G() {
      if (this.M != null && !this.M.e.isBlank()) {
         fpx.a(this, this.M.e);
      }
   }

   private void a(final ffy $$0) {
      (new Thread("realms-template-fetcher") {
         @Override
         public void run() {
            ffy $$0 = $$0;
            fer $$1 = fer.a();

            while ($$0 != null) {
               Either<ffy, Exception> $$2 = fhg.this.a($$0, $$1);
               $$0 = fhg.this.m.a(() -> {
                  if ($$2.right().isPresent()) {
                     fhg.a.error("Couldn't fetch templates", (Throwable)$$2.right().get());
                     if (fhg.this.H.c()) {
                        fhg.this.P = fhx.a(gzk.a("mco.template.select.failure"));
                     }

                     return null;
                  } else {
                     ffy $$1x = (ffy)$$2.left().get();

                     for (ffx $$2x : $$1x.a) {
                        fhg.this.H.a($$2x);
                     }

                     if ($$1x.a.isEmpty()) {
                        if (fhg.this.H.c()) {
                           String $$3 = gzk.a("mco.template.select.none", "%link");
                           fhx.b $$4 = fhx.b.a(gzk.a("mco.template.select.none.linkTitle"), ayg.t.toString());
                           fhg.this.P = fhx.a($$3, $$4);
                        }

                        return null;
                     } else {
                        return $$1x;
                     }
                  }
               }).join();
            }
         }
      }).start();
   }

   Either<ffy, Exception> a(ffy $$0, fer $$1) {
      try {
         return Either.left($$1.a($$0.b + 1, $$0.c, this.I));
      } catch (fgc var4) {
         return Either.right(var4);
      }
   }

   @Override
   public void a(fku $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.N = null;
      if (this.P != null) {
         this.a($$0, $$1, $$2, this.P);
      }

      if (this.O != null) {
         for (int $$4 = 0; $$4 < this.O.length; $$4++) {
            xi $$5 = this.O[$$4];
            $$0.a(this.p, $$5, this.n / 2, g(-1 + $$4), -6250336);
         }
      }
   }

   private void a(fku $$0, int $$1, int $$2, List<fhx.a> $$3) {
      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         fhx.a $$5 = $$3.get($$4);
         int $$6 = g(4 + $$4);
         int $$7 = $$5.a.stream().mapToInt($$0x -> this.p.b($$0x.a())).sum();
         int $$8 = this.n / 2 - $$7 / 2;

         for (fhx.b $$9 : $$5.a) {
            int $$10 = $$9.b() ? 3368635 : -1;
            int $$11 = $$0.b(this.p, $$9.a(), $$8, $$6, $$10);
            if ($$9.b() && $$1 > $$8 && $$1 < $$11 && $$2 > $$6 - 3 && $$2 < $$6 + 8) {
               this.d(xi.b($$9.c()));
               this.N = $$9.c();
            }

            $$8 = $$11;
         }
      }
   }

   int J() {
      return this.O != null ? g(1) : 33;
   }

   class a extends fmd.a<fhg.a> {
      private static final fmu c = new fmu(ali.b("icon/link"), ali.b("icon/link_highlighted"));
      private static final fmu d = new fmu(ali.b("icon/video_link"), ali.b("icon/video_link_highlighted"));
      private static final xi e = xi.c("mco.template.info.tooltip");
      private static final xi f = xi.c("mco.template.trailer.tooltip");
      public final ffx a;
      private long g;
      @Nullable
      private flt h;
      @Nullable
      private flt i;

      public a(final ffx $$0) {
         this.a = $$0;
         if (!$$0.e.isBlank()) {
            this.h = new flt(15, 15, c, fpx.b(fhg.this, $$0.e), e);
            this.h.a(fms.a(e));
         }

         if (!$$0.g.isBlank()) {
            this.i = new flt(15, 15, d, fpx.b(fhg.this, $$0.g), f);
            this.i.a(fms.a(f));
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fhg.this.M = this.a;
         fhg.this.D();
         if (ae.c() - this.g < 250L && this.aM_()) {
            fhg.this.G.accept(this.a);
         }

         this.g = ae.c();
         if (this.h != null) {
            this.h.a($$0, $$1, $$2);
         }

         if (this.i != null) {
            this.i.a($$0, $$1, $$2);
         }

         return super.a($$0, $$1, $$2);
      }

      @Override
      public void a(fku $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(gir::B, fhv.a(this.a.a, this.a.f), $$3 + 1, $$2 + 1 + 1, 0.0F, 0.0F, 38, 38, 38, 38);
         $$0.a(gir::B, fhg.b, $$3, $$2 + 1, 40, 40);
         int $$10 = 5;
         int $$11 = fhg.this.p.b(this.a.c);
         if (this.h != null) {
            this.h.c($$3 + $$4 - $$11 - this.h.y() - 10, $$2);
            this.h.a($$0, $$6, $$7, $$9);
         }

         if (this.i != null) {
            this.i.c($$3 + $$4 - $$11 - this.i.y() * 2 - 15, $$2);
            this.i.a($$0, $$6, $$7, $$9);
         }

         int $$12 = $$3 + 45 + 20;
         int $$13 = $$2 + 5;
         $$0.a(fhg.this.p, this.a.b, $$12, $$13, -1, false);
         $$0.a(fhg.this.p, this.a.c, $$3 + $$4 - $$11 - 5, $$13, 7105644, false);
         $$0.a(fhg.this.p, this.a.d, $$12, $$13 + 9 + 5, -6250336, false);
         if (!this.a.h.isBlank()) {
            $$0.a(fhg.this.p, this.a.h, $$12, $$2 + $$5 - 9 / 2 - 5, 5000268, false);
         }
      }

      @Override
      public xi a() {
         xi $$0 = xh.b(
            xi.b(this.a.b), xi.a("mco.template.select.narrate.authors", this.a.d), xi.b(this.a.h), xi.a("mco.template.select.narrate.version", this.a.c)
         );
         return xi.a("narrator.select", $$0);
      }
   }

   class b extends heo<fhg.a> {
      public b(final fhg param1) {
         this(var1, Collections.emptyList());
      }

      public b(final Iterable<ffx> param1, final Iterable $$0) {
         super(var1.n, var1.o - 33 - var1.J(), var1.J(), 46);
         this.a = var1;
         $$0.forEach(this::a);
      }

      public void a(ffx $$0) {
         this.a((fhg.a)(this.a.new a($$0)));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.a.N != null) {
            fpx.a(this.a, this.a.N);
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      public void a(@Nullable fhg.a $$0) {
         super.a($$0);
         this.a.M = $$0 == null ? null : $$0.a;
         this.a.D();
      }

      @Override
      public int a() {
         return this.l() * 46;
      }

      @Override
      public int b() {
         return 300;
      }

      public boolean c() {
         return this.l() == 0;
      }

      public List<ffx> d() {
         return this.aI_().stream().map($$0 -> $$0.a).collect(Collectors.toList());
      }
   }
}
