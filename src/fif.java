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

public class fif extends hfq {
   static final Logger a = LogUtils.getLogger();
   static final alj b = alj.b("widget/slot_frame");
   private static final xj c = xj.c("mco.template.button.select");
   private static final xj B = xj.c("mco.template.button.trailer");
   private static final xj C = xj.c("mco.template.button.publisher");
   private static final int D = 100;
   private static final int E = 10;
   private final fps F = new fps(this);
   final Consumer<fgx> G;
   fif.b H;
   private final fgi.d I;
   private fmd J;
   private fmd K;
   private fmd L;
   @Nullable
   fgx M = null;
   @Nullable
   String N;
   @Nullable
   private xj[] O;
   @Nullable
   List<fiw.a> P;

   public fif(xj $$0, Consumer<fgx> $$1, fgi.d $$2) {
      this($$0, $$1, $$2, null);
   }

   public fif(xj $$0, Consumer<fgx> $$1, fgi.d $$2, @Nullable fgy $$3) {
      super($$0);
      this.G = $$1;
      this.I = $$2;
      if ($$3 == null) {
         this.H = new fif.b(this);
         this.a(new fgy(10));
      } else {
         this.H = new fif.b(this, Lists.newArrayList($$3.a));
         this.a($$3);
      }
   }

   public void a(xj... $$0) {
      this.O = $$0;
   }

   @Override
   public void aR_() {
      this.F.a(this.l, this.p);
      this.H = this.F.c(new fif.b(this, this.H.d()));
      fpw $$0 = this.F.b(fpw.e().a(10));
      $$0.c().b();
      this.K = $$0.a(fmd.a(B, $$0x -> this.J()).a(100).a());
      this.J = $$0.a(fmd.a(c, $$0x -> this.G()).a(100).a());
      $$0.a(fmd.a(xi.e, $$0x -> this.aO_()).a(100).a());
      this.L = $$0.a(fmd.a(C, $$0x -> this.K()).a(100).a());
      this.F();
      this.F.a($$1 -> {
         fmb var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.H.b(this.n, this.o - this.F.b() - this.L());
      this.F.a();
   }

   @Override
   public xj i() {
      List<xj> $$0 = Lists.newArrayListWithCapacity(2);
      $$0.add(this.l);
      if (this.O != null) {
         $$0.addAll(Arrays.asList(this.O));
      }

      return xi.a($$0);
   }

   void F() {
      this.L.k = this.M != null && !this.M.e.isEmpty();
      this.K.k = this.M != null && !this.M.g.isEmpty();
      this.J.j = this.M != null;
   }

   @Override
   public void aO_() {
      this.G.accept(null);
   }

   private void G() {
      if (this.M != null) {
         this.G.accept(this.M);
      }
   }

   private void J() {
      if (this.M != null && !this.M.g.isBlank()) {
         fqt.a(this, this.M.g);
      }
   }

   private void K() {
      if (this.M != null && !this.M.e.isBlank()) {
         fqt.a(this, this.M.e);
      }
   }

   private void a(final fgy $$0) {
      (new Thread("realms-template-fetcher") {
         @Override
         public void run() {
            fgy $$0 = $$0;
            ffh $$1 = ffh.a();

            while ($$0 != null) {
               Either<fgy, Exception> $$2 = fif.this.a($$0, $$1);
               $$0 = fif.this.m.a(() -> {
                  if ($$2.right().isPresent()) {
                     fif.a.error("Couldn't fetch templates", (Throwable)$$2.right().get());
                     if (fif.this.H.c()) {
                        fif.this.P = fiw.a(hal.a("mco.template.select.failure"));
                     }

                     return null;
                  } else {
                     fgy $$1x = (fgy)$$2.left().get();

                     for (fgx $$2x : $$1x.a) {
                        fif.this.H.a($$2x);
                     }

                     if ($$1x.a.isEmpty()) {
                        if (fif.this.H.c()) {
                           String $$3 = hal.a("mco.template.select.none", "%link");
                           fiw.b $$4 = fiw.b.a(hal.a("mco.template.select.none.linkTitle"), ayi.t.toString());
                           fif.this.P = fiw.a($$3, $$4);
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

   Either<fgy, Exception> a(fgy $$0, ffh $$1) {
      try {
         return Either.left($$1.a($$0.b + 1, $$0.c, this.I));
      } catch (fhc var4) {
         return Either.right(var4);
      }
   }

   @Override
   public void a(flq $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.N = null;
      if (this.P != null) {
         this.a($$0, $$1, $$2, this.P);
      }

      if (this.O != null) {
         for (int $$4 = 0; $$4 < this.O.length; $$4++) {
            xj $$5 = this.O[$$4];
            $$0.a(this.p, $$5, this.n / 2, g(-1 + $$4), -6250336);
         }
      }
   }

   private void a(flq $$0, int $$1, int $$2, List<fiw.a> $$3) {
      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         fiw.a $$5 = $$3.get($$4);
         int $$6 = g(4 + $$4);
         int $$7 = $$5.a.stream().mapToInt($$0x -> this.p.b($$0x.a())).sum();
         int $$8 = this.n / 2 - $$7 / 2;

         for (fiw.b $$9 : $$5.a) {
            int $$10 = $$9.b() ? 3368635 : -1;
            int $$11 = $$0.b(this.p, $$9.a(), $$8, $$6, $$10);
            if ($$9.b() && $$1 > $$8 && $$1 < $$11 && $$2 > $$6 - 3 && $$2 < $$6 + 8) {
               this.d(xj.b($$9.c()));
               this.N = $$9.c();
            }

            $$8 = $$11;
         }
      }
   }

   int L() {
      return this.O != null ? g(1) : 33;
   }

   class a extends fmz.a<fif.a> {
      private static final fnq c = new fnq(alj.b("icon/link"), alj.b("icon/link_highlighted"));
      private static final fnq d = new fnq(alj.b("icon/video_link"), alj.b("icon/video_link_highlighted"));
      private static final xj e = xj.c("mco.template.info.tooltip");
      private static final xj f = xj.c("mco.template.trailer.tooltip");
      public final fgx a;
      private long g;
      @Nullable
      private fmp h;
      @Nullable
      private fmp i;

      public a(final fgx $$0) {
         this.a = $$0;
         if (!$$0.e.isBlank()) {
            this.h = new fmp(15, 15, c, fqt.b(fif.this, $$0.e), e);
            this.h.a(fno.a(e));
         }

         if (!$$0.g.isBlank()) {
            this.i = new fmp(15, 15, d, fqt.b(fif.this, $$0.g), f);
            this.i.a(fno.a(f));
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fif.this.M = this.a;
         fif.this.F();
         if (ae.c() - this.g < 250L && this.aL_()) {
            fif.this.G.accept(this.a);
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
      public void a(flq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(gjq::B, fiu.a(this.a.a, this.a.f), $$3 + 1, $$2 + 1 + 1, 0.0F, 0.0F, 38, 38, 38, 38);
         $$0.a(gjq::B, fif.b, $$3, $$2 + 1, 40, 40);
         int $$10 = 5;
         int $$11 = fif.this.p.b(this.a.c);
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
         $$0.a(fif.this.p, this.a.b, $$12, $$13, -1, false);
         $$0.a(fif.this.p, this.a.c, $$3 + $$4 - $$11 - 5, $$13, 7105644, false);
         $$0.a(fif.this.p, this.a.d, $$12, $$13 + 9 + 5, -6250336, false);
         if (!this.a.h.isBlank()) {
            $$0.a(fif.this.p, this.a.h, $$12, $$2 + $$5 - 9 / 2 - 5, 5000268, false);
         }
      }

      @Override
      public xj a() {
         xj $$0 = xi.b(
            xj.b(this.a.b), xj.a("mco.template.select.narrate.authors", this.a.d), xj.b(this.a.h), xj.a("mco.template.select.narrate.version", this.a.c)
         );
         return xj.a("narrator.select", $$0);
      }
   }

   class b extends hfp<fif.a> {
      public b(final fif param1) {
         this(var1, Collections.emptyList());
      }

      public b(final Iterable<fgx> param1, final Iterable $$0) {
         super(var1.n, var1.o - 33 - var1.L(), var1.L(), 46);
         this.a = var1;
         $$0.forEach(this::a);
      }

      public void a(fgx $$0) {
         this.a((fif.a)(this.a.new a($$0)));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.a.N != null) {
            fqt.a(this.a, this.a.N);
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      public void a(@Nullable fif.a $$0) {
         super.a($$0);
         this.a.M = $$0 == null ? null : $$0.a;
         this.a.F();
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

      public List<fgx> d() {
         return this.aH_().stream().map($$0 -> $$0.a).collect(Collectors.toList());
      }
   }
}
