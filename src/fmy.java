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

public class fmy extends hpj {
   static final Logger a = LogUtils.getLogger();
   static final alg b = alg.b("widget/slot_frame");
   private static final wy c = wy.c("mco.template.button.select");
   private static final wy C = wy.c("mco.template.button.trailer");
   private static final wy D = wy.c("mco.template.button.publisher");
   private static final int E = 100;
   private static final int F = 10;
   private final fvx G = new fvx(this);
   final Consumer<flq> H;
   fmy.b I;
   private final fla.d J;
   private fsj K;
   private fsj L;
   private fsj M;
   @Nullable
   flq N = null;
   @Nullable
   String O;
   @Nullable
   private wy[] P;
   @Nullable
   List<fnp.a> Q;

   public fmy(wy $$0, Consumer<flq> $$1, fla.d $$2) {
      this($$0, $$1, $$2, null);
   }

   public fmy(wy $$0, Consumer<flq> $$1, fla.d $$2, @Nullable flr $$3) {
      super($$0);
      this.H = $$1;
      this.J = $$2;
      if ($$3 == null) {
         this.I = new fmy.b(this);
         this.a(new flr(10));
      } else {
         this.I = new fmy.b(this, Lists.newArrayList($$3.a));
         this.a($$3);
      }
   }

   public void a(wy... $$0) {
      this.P = $$0;
   }

   @Override
   public void aO_() {
      this.G.a(this.l, this.p);
      this.I = this.G.c(new fmy.b(this, this.I.c()));
      fwb $$0 = this.G.b(fwb.e().a(10));
      $$0.c().b();
      this.L = $$0.a(fsj.a(C, $$0x -> this.G()).a(100).a());
      this.K = $$0.a(fsj.a(c, $$0x -> this.F()).a(100).a());
      $$0.a(fsj.a(wx.e, $$0x -> this.aL_()).a(100).a());
      this.M = $$0.a(fsj.a(D, $$0x -> this.H()).a(100).a());
      this.E();
      this.G.a($$1 -> {
         fsh var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.I.b(this.n, this.o - this.G.b() - this.I());
      this.G.a();
   }

   @Override
   public wy i() {
      List<wy> $$0 = Lists.newArrayListWithCapacity(2);
      $$0.add(this.l);
      if (this.P != null) {
         $$0.addAll(Arrays.asList(this.P));
      }

      return wx.a($$0);
   }

   void E() {
      this.M.k = this.N != null && !this.N.e.isEmpty();
      this.L.k = this.N != null && !this.N.g.isEmpty();
      this.K.j = this.N != null;
   }

   @Override
   public void aL_() {
      this.H.accept(null);
   }

   private void F() {
      if (this.N != null) {
         this.H.accept(this.N);
      }
   }

   private void G() {
      if (this.N != null && !this.N.g.isBlank()) {
         fwy.a(this, this.N.g);
      }
   }

   private void H() {
      if (this.N != null && !this.N.e.isBlank()) {
         fwy.a(this, this.N.e);
      }
   }

   private void a(final flr $$0) {
      (new Thread("realms-template-fetcher") {
         @Override
         public void run() {
            flr $$0 = $$0;
            fjz $$1 = fjz.a();

            while ($$0 != null) {
               Either<flr, Exception> $$2 = fmy.this.a($$0, $$1);
               $$0 = fmy.this.m.a(() -> {
                  if ($$2.right().isPresent()) {
                     fmy.a.error("Couldn't fetch templates", (Throwable)$$2.right().get());
                     if (fmy.this.I.b()) {
                        fmy.this.Q = fnp.a(hke.a("mco.template.select.failure"));
                     }

                     return null;
                  } else {
                     flr $$1x = (flr)$$2.left().get();

                     for (flq $$2x : $$1x.a) {
                        fmy.this.I.a($$2x);
                     }

                     if ($$1x.a.isEmpty()) {
                        if (fmy.this.I.b()) {
                           String $$3 = hke.a("mco.template.select.none", "%link");
                           fnp.b $$4 = fnp.b.a(hke.a("mco.template.select.none.linkTitle"), ayh.t.toString());
                           fmy.this.Q = fnp.a($$3, $$4);
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

   Either<flr, Exception> a(flr $$0, fjz $$1) {
      try {
         return Either.left($$1.a($$0.b + 1, $$0.c, this.J));
      } catch (flv var4) {
         return Either.right(var4);
      }
   }

   @Override
   public void a(frv $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.O = null;
      if (this.Q != null) {
         this.a($$0, $$1, $$2, this.Q);
      }

      if (this.P != null) {
         for (int $$4 = 0; $$4 < this.P.length; $$4++) {
            wy $$5 = this.P[$$4];
            $$0.a(this.p, $$5, this.n / 2, g(-1 + $$4), -6250336);
         }
      }
   }

   private void a(frv $$0, int $$1, int $$2, List<fnp.a> $$3) {
      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         fnp.a $$5 = $$3.get($$4);
         int $$6 = g(4 + $$4);
         int $$7 = $$5.a.stream().mapToInt($$0x -> this.p.b($$0x.a())).sum();
         int $$8 = this.n / 2 - $$7 / 2;

         for (fnp.b $$9 : $$5.a) {
            int $$10 = $$9.b() ? 3368635 : -1;
            int $$11 = $$0.b(this.p, $$9.a(), $$8, $$6, $$10);
            if ($$9.b() && $$1 > $$8 && $$1 < $$11 && $$2 > $$6 - 3 && $$2 < $$6 + 8) {
               this.d(wy.b($$9.c()));
               this.O = $$9.c();
            }

            $$8 = $$11;
         }
      }
   }

   int I() {
      return this.P != null ? g(1) : 33;
   }

   class a extends ftf.a<fmy.a> {
      private static final ftw c = new ftw(alg.b("icon/link"), alg.b("icon/link_highlighted"));
      private static final ftw d = new ftw(alg.b("icon/video_link"), alg.b("icon/video_link_highlighted"));
      private static final wy e = wy.c("mco.template.info.tooltip");
      private static final wy f = wy.c("mco.template.trailer.tooltip");
      public final flq a;
      private long g;
      @Nullable
      private fsv h;
      @Nullable
      private fsv i;

      public a(final flq $$0) {
         this.a = $$0;
         if (!$$0.e.isBlank()) {
            this.h = new fsv(15, 15, c, fwy.b(fmy.this, $$0.e), e);
            this.h.a(ftu.a(e));
         }

         if (!$$0.g.isBlank()) {
            this.i = new fsv(15, 15, d, fwy.b(fmy.this, $$0.g), f);
            this.i.a(ftu.a(f));
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fmy.this.N = this.a;
         fmy.this.E();
         if (af.c() - this.g < 250L && this.aJ_()) {
            fmy.this.H.accept(this.a);
         }

         this.g = af.c();
         if (this.h != null) {
            this.h.a($$0, $$1, $$2);
         }

         if (this.i != null) {
            this.i.a($$0, $$1, $$2);
         }

         return super.a($$0, $$1, $$2);
      }

      @Override
      public void a(frv $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(gqk::H, fnn.a(this.a.a, this.a.f), $$3 + 1, $$2 + 1 + 1, 0.0F, 0.0F, 38, 38, 38, 38);
         $$0.a(gqk::H, fmy.b, $$3, $$2 + 1, 40, 40);
         int $$10 = 5;
         int $$11 = fmy.this.p.b(this.a.c);
         if (this.h != null) {
            this.h.c($$3 + $$4 - $$11 - this.h.A() - 10, $$2);
            this.h.a($$0, $$6, $$7, $$9);
         }

         if (this.i != null) {
            this.i.c($$3 + $$4 - $$11 - this.i.A() * 2 - 15, $$2);
            this.i.a($$0, $$6, $$7, $$9);
         }

         int $$12 = $$3 + 45 + 20;
         int $$13 = $$2 + 5;
         $$0.b(fmy.this.p, this.a.b, $$12, $$13, -1);
         $$0.b(fmy.this.p, this.a.c, $$3 + $$4 - $$11 - 5, $$13, 7105644);
         $$0.b(fmy.this.p, this.a.d, $$12, $$13 + 9 + 5, -6250336);
         if (!this.a.h.isBlank()) {
            $$0.b(fmy.this.p, this.a.h, $$12, $$2 + $$5 - 9 / 2 - 5, 5000268);
         }
      }

      @Override
      public wy a() {
         wy $$0 = wx.b(
            wy.b(this.a.b), wy.a("mco.template.select.narrate.authors", this.a.d), wy.b(this.a.h), wy.a("mco.template.select.narrate.version", this.a.c)
         );
         return wy.a("narrator.select", $$0);
      }
   }

   class b extends ftf<fmy.a> {
      public b(final fmy param1) {
         this(var1, Collections.emptyList());
      }

      public b(final Iterable<flq> param1, final Iterable $$0) {
         super(foz.Q(), var1.n, var1.o - 33 - var1.I(), var1.I(), 46);
         this.a = var1;
         $$0.forEach(this::a);
      }

      public void a(flq $$0) {
         this.b(this.a.new a($$0));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.a.O != null) {
            fwy.a(this.a, this.a.O);
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      public void a(@Nullable fmy.a $$0) {
         super.a($$0);
         this.a.N = $$0 == null ? null : $$0.a;
         this.a.E();
      }

      @Override
      public int a() {
         return 300;
      }

      public boolean b() {
         return this.t() == 0;
      }

      public List<flq> c() {
         return this.aE_().stream().map($$0 -> $$0.a).collect(Collectors.toList());
      }
   }
}
