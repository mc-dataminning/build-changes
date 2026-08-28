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

public class fel extends gwo {
   static final Logger a = LogUtils.getLogger();
   static final akr b = akr.b("widget/slot_frame");
   private static final wz c = wz.c("mco.template.button.select");
   private static final wz B = wz.c("mco.template.button.trailer");
   private static final wz C = wz.c("mco.template.button.publisher");
   private static final int D = 100;
   private static final int E = 10;
   private final flx F = new flx(this);
   final Consumer<fdc> G;
   fel.b H;
   private final fcn.d I;
   private fik J;
   private fik K;
   private fik L;
   @Nullable
   fdc M = null;
   @Nullable
   String N;
   @Nullable
   private wz[] O;
   @Nullable
   List<ffc.a> P;

   public fel(wz $$0, Consumer<fdc> $$1, fcn.d $$2) {
      this($$0, $$1, $$2, null);
   }

   public fel(wz $$0, Consumer<fdc> $$1, fcn.d $$2, @Nullable fdd $$3) {
      super($$0);
      this.G = $$1;
      this.I = $$2;
      if ($$3 == null) {
         this.H = new fel.b(this);
         this.a(new fdd(10));
      } else {
         this.H = new fel.b(this, Lists.newArrayList($$3.a));
         this.a($$3);
      }
   }

   public void a(wz... $$0) {
      this.O = $$0;
   }

   @Override
   public void aT_() {
      this.F.a(this.k, this.o);
      this.H = this.F.c(new fel.b(this, this.H.d()));
      fmb $$0 = this.F.b(fmb.e().a(10));
      $$0.c().b();
      this.K = $$0.a(fik.a(B, $$0x -> this.E()).a(100).a());
      this.J = $$0.a(fik.a(c, $$0x -> this.D()).a(100).a());
      $$0.a(fik.a(wy.e, $$0x -> this.d()).a(100).a());
      this.L = $$0.a(fik.a(C, $$0x -> this.F()).a(100).a());
      this.C();
      this.F.a($$1 -> {
         fii var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.H.b(this.m, this.n - this.F.b() - this.G());
      this.F.a();
   }

   @Override
   public wz i() {
      List<wz> $$0 = Lists.newArrayListWithCapacity(2);
      $$0.add(this.k);
      if (this.O != null) {
         $$0.addAll(Arrays.asList(this.O));
      }

      return wy.a($$0);
   }

   void C() {
      this.L.k = this.M != null && !this.M.e.isEmpty();
      this.K.k = this.M != null && !this.M.g.isEmpty();
      this.J.j = this.M != null;
   }

   @Override
   public void d() {
      this.G.accept(null);
   }

   private void D() {
      if (this.M != null) {
         this.G.accept(this.M);
      }
   }

   private void E() {
      if (this.M != null && !this.M.g.isBlank()) {
         fmy.a(this, this.M.g);
      }
   }

   private void F() {
      if (this.M != null && !this.M.e.isBlank()) {
         fmy.a(this, this.M.e);
      }
   }

   private void a(final fdd $$0) {
      (new Thread("realms-template-fetcher") {
         @Override
         public void run() {
            fdd $$0 = $$0;
            fbw $$1 = fbw.a();

            while ($$0 != null) {
               Either<fdd, Exception> $$2 = fel.this.a($$0, $$1);
               $$0 = fel.this.l.a(() -> {
                  if ($$2.right().isPresent()) {
                     fel.a.error("Couldn't fetch templates", (Throwable)$$2.right().get());
                     if (fel.this.H.c()) {
                        fel.this.P = ffc.a(grp.a("mco.template.select.failure"));
                     }

                     return null;
                  } else {
                     fdd $$1x = (fdd)$$2.left().get();

                     for (fdc $$2x : $$1x.a) {
                        fel.this.H.a($$2x);
                     }

                     if ($$1x.a.isEmpty()) {
                        if (fel.this.H.c()) {
                           String $$3 = grp.a("mco.template.select.none", "%link");
                           ffc.b $$4 = ffc.b.a(grp.a("mco.template.select.none.linkTitle"), axj.t.toString());
                           fel.this.P = ffc.a($$3, $$4);
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

   Either<fdd, Exception> a(fdd $$0, fbw $$1) {
      try {
         return Either.left($$1.a($$0.b + 1, $$0.c, this.I));
      } catch (fdh var4) {
         return Either.right(var4);
      }
   }

   @Override
   public void a(fhx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.N = null;
      if (this.P != null) {
         this.a($$0, $$1, $$2, this.P);
      }

      if (this.O != null) {
         for (int $$4 = 0; $$4 < this.O.length; $$4++) {
            wz $$5 = this.O[$$4];
            $$0.a(this.o, $$5, this.m / 2, g(-1 + $$4), -6250336);
         }
      }
   }

   private void a(fhx $$0, int $$1, int $$2, List<ffc.a> $$3) {
      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         ffc.a $$5 = $$3.get($$4);
         int $$6 = g(4 + $$4);
         int $$7 = $$5.a.stream().mapToInt($$0x -> this.o.b($$0x.a())).sum();
         int $$8 = this.m / 2 - $$7 / 2;

         for (ffc.b $$9 : $$5.a) {
            int $$10 = $$9.b() ? 3368635 : -1;
            int $$11 = $$0.b(this.o, $$9.a(), $$8, $$6, $$10);
            if ($$9.b() && $$1 > $$8 && $$1 < $$11 && $$2 > $$6 - 3 && $$2 < $$6 + 8) {
               this.d(wz.b($$9.c()));
               this.N = $$9.c();
            }

            $$8 = $$11;
         }
      }
   }

   int G() {
      return this.O != null ? g(1) : 33;
   }

   class a extends fjg.a<fel.a> {
      private static final fjx c = new fjx(akr.b("icon/link"), akr.b("icon/link_highlighted"));
      private static final fjx d = new fjx(akr.b("icon/video_link"), akr.b("icon/video_link_highlighted"));
      private static final wz e = wz.c("mco.template.info.tooltip");
      private static final wz f = wz.c("mco.template.trailer.tooltip");
      public final fdc a;
      private long g;
      @Nullable
      private fiw h;
      @Nullable
      private fiw i;

      public a(final fdc $$0) {
         this.a = $$0;
         if (!$$0.e.isBlank()) {
            this.h = new fiw(15, 15, c, fmy.b(fel.this, $$0.e), e);
            this.h.a(fjv.a(e));
         }

         if (!$$0.g.isBlank()) {
            this.i = new fiw(15, 15, d, fmy.b(fel.this, $$0.g), f);
            this.i.a(fjv.a(f));
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fel.this.M = this.a;
         fel.this.C();
         if (ad.c() - this.g < 250L && this.aO_()) {
            fel.this.G.accept(this.a);
         }

         this.g = ad.c();
         if (this.h != null) {
            this.h.a($$0, $$1, $$2);
         }

         if (this.i != null) {
            this.i.a($$0, $$1, $$2);
         }

         return super.a($$0, $$1, $$2);
      }

      @Override
      public void a(fhx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(ffa.a(this.a.a, this.a.f), $$3 + 1, $$2 + 1 + 1, 0.0F, 0.0F, 38, 38, 38, 38);
         $$0.a(fel.b, $$3, $$2 + 1, 40, 40);
         int $$10 = 5;
         int $$11 = fel.this.o.b(this.a.c);
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
         $$0.a(fel.this.o, this.a.b, $$12, $$13, -1, false);
         $$0.a(fel.this.o, this.a.c, $$3 + $$4 - $$11 - 5, $$13, 7105644, false);
         $$0.a(fel.this.o, this.a.d, $$12, $$13 + 9 + 5, -6250336, false);
         if (!this.a.h.isBlank()) {
            $$0.a(fel.this.o, this.a.h, $$12, $$2 + $$5 - 9 / 2 - 5, 5000268, false);
         }
      }

      @Override
      public wz a() {
         wz $$0 = wy.b(
            wz.b(this.a.b), wz.a("mco.template.select.narrate.authors", this.a.d), wz.b(this.a.h), wz.a("mco.template.select.narrate.version", this.a.c)
         );
         return wz.a("narrator.select", $$0);
      }
   }

   class b extends gwn<fel.a> {
      public b(final fel param1) {
         this(var1, Collections.emptyList());
      }

      public b(final Iterable<fdc> param1, final Iterable $$0) {
         super(var1.m, var1.n - 33 - var1.G(), var1.G(), 46);
         this.a = var1;
         $$0.forEach(this::a);
      }

      public void a(fdc $$0) {
         this.a((fel.a)(this.a.new a($$0)));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.a.N != null) {
            fmy.a(this.a, this.a.N);
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      public void a(@Nullable fel.a $$0) {
         super.a($$0);
         this.a.M = $$0 == null ? null : $$0.a;
         this.a.C();
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

      public List<fdc> d() {
         return this.aK_().stream().map($$0 -> $$0.a).collect(Collectors.toList());
      }
   }
}
