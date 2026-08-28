import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class dlj extends dfh {
   public static final MapCodec<dlj> a = b(dlj::new);
   public static final dti<dtp> b = dta.ab;
   public static final dti<dtp> c = dta.aa;
   public static final dti<dtp> d = dta.ac;
   public static final dti<dtp> e = dta.ad;
   public static final dtk f = dta.aT;
   public static final Map<jf, dti<dtp>> g = Maps.newEnumMap(ImmutableMap.of(jf.c, b, jf.f, c, jf.d, d, jf.e, e));
   protected static final int h = 1;
   protected static final int i = 3;
   protected static final int j = 13;
   protected static final int k = 3;
   protected static final int l = 13;
   private static final ewy m = dfh.a(3.0, 0.0, 3.0, 13.0, 1.0, 13.0);
   private static final Map<jf, ewy> n = Maps.newEnumMap(
      ImmutableMap.of(
         jf.c,
         dfh.a(3.0, 0.0, 0.0, 13.0, 1.0, 13.0),
         jf.d,
         dfh.a(3.0, 0.0, 3.0, 13.0, 1.0, 16.0),
         jf.f,
         dfh.a(3.0, 0.0, 3.0, 16.0, 1.0, 13.0),
         jf.e,
         dfh.a(0.0, 0.0, 3.0, 13.0, 1.0, 13.0)
      )
   );
   private static final Map<jf, ewy> o = Maps.newEnumMap(
      ImmutableMap.of(
         jf.c,
         ewv.a(n.get(jf.c), dfh.a(3.0, 0.0, 0.0, 13.0, 16.0, 1.0)),
         jf.d,
         ewv.a(n.get(jf.d), dfh.a(3.0, 0.0, 15.0, 13.0, 16.0, 16.0)),
         jf.f,
         ewv.a(n.get(jf.f), dfh.a(15.0, 0.0, 3.0, 16.0, 16.0, 13.0)),
         jf.e,
         ewv.a(n.get(jf.e), dfh.a(0.0, 0.0, 3.0, 1.0, 16.0, 13.0))
      )
   );
   private static final Map<dsk, ewy> F = Maps.newHashMap();
   private static final ewf[] G = ac.a(new ewf[16], $$0 -> {
      for (int $$1 = 0; $$1 <= 15; $$1++) {
         float $$2 = (float)$$1 / 15.0F;
         float $$3 = $$2 * 0.6F + ($$2 > 0.0F ? 0.4F : 0.3F);
         float $$4 = ayg.a($$2 * $$2 * 0.7F - 0.5F, 0.0F, 1.0F);
         float $$5 = ayg.a($$2 * $$2 * 0.6F - 0.7F, 0.0F, 1.0F);
         $$0[$$1] = new ewf((double)$$3, (double)$$4, (double)$$5);
      }
   });
   private static final float H = 0.2F;
   private final dsk I;
   private boolean J = true;

   @Override
   public MapCodec<dlj> a() {
      return a;
   }

   public dlj(dsj.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dtp.c).a(c, dtp.c).a(d, dtp.c).a(e, dtp.c).a(f, Integer.valueOf(0)));
      this.I = this.o().a(b, dtp.b).a(c, dtp.b).a(d, dtp.b).a(e, dtp.b);
      UnmodifiableIterator var2 = this.l().a().iterator();

      while (var2.hasNext()) {
         dsk $$1 = (dsk)var2.next();
         if ($$1.c(f) == 0) {
            F.put($$1, this.n($$1));
         }
      }
   }

   private ewy n(dsk $$0) {
      ewy $$1 = m;

      for (jf $$2 : jf.c.a) {
         dtp $$3 = $$0.c(g.get($$2));
         if ($$3 == dtp.b) {
            $$1 = ewv.a($$1, n.get($$2));
         } else if ($$3 == dtp.a) {
            $$1 = ewv.a($$1, o.get($$2));
         }
      }

      return $$1;
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return F.get($$0.a(f, Integer.valueOf(0)));
   }

   @Override
   public dsk a(cxm $$0) {
      return this.a($$0.q(), this.I, $$0.a());
   }

   private dsk a(dbl $$0, dsk $$1, ja $$2) {
      boolean $$3 = p($$1);
      $$1 = this.b($$0, this.o().a(f, $$1.c(f)), $$2);
      if ($$3 && p($$1)) {
         return $$1;
      } else {
         boolean $$4 = $$1.c(b).a();
         boolean $$5 = $$1.c(d).a();
         boolean $$6 = $$1.c(c).a();
         boolean $$7 = $$1.c(e).a();
         boolean $$8 = !$$4 && !$$5;
         boolean $$9 = !$$6 && !$$7;
         if (!$$7 && $$8) {
            $$1 = $$1.a(e, dtp.b);
         }

         if (!$$6 && $$8) {
            $$1 = $$1.a(c, dtp.b);
         }

         if (!$$4 && $$9) {
            $$1 = $$1.a(b, dtp.b);
         }

         if (!$$5 && $$9) {
            $$1 = $$1.a(d, dtp.b);
         }

         return $$1;
      }
   }

   private dsk b(dbl $$0, dsk $$1, ja $$2) {
      boolean $$3 = !$$0.a_($$2.c()).g($$0, $$2);

      for (jf $$4 : jf.c.a) {
         if (!$$1.c(g.get($$4)).a()) {
            dtp $$5 = this.a($$0, $$2, $$4, $$3);
            $$1 = $$1.a(g.get($$4), $$5);
         }
      }

      return $$1;
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      if ($$1 == jf.a) {
         return !this.a($$3, $$5, $$2) ? dfj.a.o() : $$0;
      } else if ($$1 == jf.b) {
         return this.a($$3, $$0, $$4);
      } else {
         dtp $$6 = this.a($$3, $$4, $$1);
         return $$6.a() == $$0.c(g.get($$1)).a() && !o($$0) ? $$0.a(g.get($$1), $$6) : this.a($$3, this.I.a(f, $$0.c(f)).a(g.get($$1), $$6), $$4);
      }
   }

   private static boolean o(dsk $$0) {
      return $$0.c(b).a() && $$0.c(d).a() && $$0.c(c).a() && $$0.c(e).a();
   }

   private static boolean p(dsk $$0) {
      return !$$0.c(b).a() && !$$0.c(d).a() && !$$0.c(c).a() && !$$0.c(e).a();
   }

   @Override
   protected void a(dsk $$0, dcg $$1, ja $$2, int $$3, int $$4) {
      ja.a $$5 = new ja.a();

      for (jf $$6 : jf.c.a) {
         dtp $$7 = $$0.c(g.get($$6));
         if ($$7 != dtp.c && !$$1.a_($$5.a($$2, $$6)).a(this)) {
            $$5.c(jf.a);
            dsk $$8 = $$1.a_($$5);
            if ($$8.a(this)) {
               ja $$9 = $$5.a($$6.g());
               $$1.a($$6.g(), $$1.a_($$9), $$5, $$9, $$3, $$4);
            }

            $$5.a($$2, $$6).c(jf.b);
            dsk $$10 = $$1.a_($$5);
            if ($$10.a(this)) {
               ja $$11 = $$5.a($$6.g());
               $$1.a($$6.g(), $$1.a_($$11), $$5, $$11, $$3, $$4);
            }
         }
      }
   }

   private dtp a(dbl $$0, ja $$1, jf $$2) {
      return this.a($$0, $$1, $$2, !$$0.a_($$1.c()).g($$0, $$1));
   }

   private dtp a(dbl $$0, ja $$1, jf $$2, boolean $$3) {
      ja $$4 = $$1.a($$2);
      dsk $$5 = $$0.a_($$4);
      if ($$3) {
         boolean $$6 = $$5.b() instanceof dnu || this.a($$0, $$4, $$5);
         if ($$6 && m($$0.a_($$4.c()))) {
            if ($$5.d($$0, $$4, $$2.g())) {
               return dtp.a;
            }

            return dtp.b;
         }
      }

      return !a($$5, $$2) && ($$5.g($$0, $$4) || !m($$0.a_($$4.d()))) ? dtp.c : dtp.b;
   }

   @Override
   protected boolean a(dsk $$0, dci $$1, ja $$2) {
      ja $$3 = $$2.d();
      dsk $$4 = $$1.a_($$3);
      return this.a($$1, $$3, $$4);
   }

   private boolean a(dbl $$0, ja $$1, dsk $$2) {
      return $$2.d($$0, $$1, jf.b) || $$2.a(dfj.hc);
   }

   private void a(dcf $$0, ja $$1, dsk $$2) {
      int $$3 = this.a($$0, $$1);
      if ($$2.c(f) != $$3) {
         if ($$0.a_($$1) == $$2) {
            $$0.a($$1, $$2.a(f, Integer.valueOf($$3)), 2);
         }

         Set<ja> $$4 = Sets.newHashSet();
         $$4.add($$1);

         for (jf $$5 : jf.values()) {
            $$4.add($$1.a($$5));
         }

         for (ja $$6 : $$4) {
            $$0.a($$6, this);
         }
      }
   }

   private int a(dcf $$0, ja $$1) {
      this.J = false;
      int $$2 = $$0.D($$1);
      this.J = true;
      int $$3 = 0;
      if ($$2 < 15) {
         for (jf $$4 : jf.c.a) {
            ja $$5 = $$1.a($$4);
            dsk $$6 = $$0.a_($$5);
            $$3 = Math.max($$3, this.q($$6));
            ja $$7 = $$1.c();
            if ($$6.g($$0, $$5) && !$$0.a_($$7).g($$0, $$7)) {
               $$3 = Math.max($$3, this.q($$0.a_($$5.c())));
            } else if (!$$6.g($$0, $$5)) {
               $$3 = Math.max($$3, this.q($$0.a_($$5.d())));
            }
         }
      }

      return Math.max($$2, $$3 - 1);
   }

   private int q(dsk $$0) {
      return $$0.a(this) ? $$0.c(f) : 0;
   }

   private void b(dcf $$0, ja $$1) {
      if ($$0.a_($$1).a(this)) {
         $$0.a($$1, this);

         for (jf $$2 : jf.values()) {
            $$0.a($$1.a($$2), this);
         }
      }
   }

   @Override
   protected void b(dsk $$0, dcf $$1, ja $$2, dsk $$3, boolean $$4) {
      if (!$$3.a($$0.b()) && !$$1.B) {
         this.a($$1, $$2, $$0);

         for (jf $$5 : jf.c.b) {
            $$1.a($$2.a($$5), this);
         }

         this.c($$1, $$2);
      }
   }

   @Override
   protected void a(dsk $$0, dcf $$1, ja $$2, dsk $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         if (!$$1.B) {
            for (jf $$5 : jf.values()) {
               $$1.a($$2.a($$5), this);
            }

            this.a($$1, $$2, $$0);
            this.c($$1, $$2);
         }
      }
   }

   private void c(dcf $$0, ja $$1) {
      for (jf $$2 : jf.c.a) {
         this.b($$0, $$1.a($$2));
      }

      for (jf $$3 : jf.c.a) {
         ja $$4 = $$1.a($$3);
         if ($$0.a_($$4).g($$0, $$4)) {
            this.b($$0, $$4.c());
         } else {
            this.b($$0, $$4.d());
         }
      }
   }

   @Override
   protected void a(dsk $$0, dcf $$1, ja $$2, dfh $$3, ja $$4, boolean $$5) {
      if (!$$1.B) {
         if ($$0.a((dci)$$1, $$2)) {
            this.a($$1, $$2, $$0);
         } else {
            c($$0, $$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   protected int b(dsk $$0, dbl $$1, ja $$2, jf $$3) {
      return !this.J ? 0 : $$0.b($$1, $$2, $$3);
   }

   @Override
   protected int a(dsk $$0, dbl $$1, ja $$2, jf $$3) {
      if (this.J && $$3 != jf.a) {
         int $$4 = $$0.c(f);
         if ($$4 == 0) {
            return 0;
         } else {
            return $$3 != jf.b && !this.a($$1, $$0, $$2).c(g.get($$3.g())).a() ? 0 : $$4;
         }
      } else {
         return 0;
      }
   }

   protected static boolean m(dsk $$0) {
      return a($$0, null);
   }

   protected static boolean a(dsk $$0, @Nullable jf $$1) {
      if ($$0.a(dfj.cw)) {
         return true;
      } else if ($$0.a(dfj.eh)) {
         jf $$2 = $$0.c(dlo.aE);
         return $$2 == $$1 || $$2.g() == $$1;
      } else {
         return $$0.a(dfj.kO) ? $$1 == $$0.c(dks.a) : $$0.m() && $$1 != null;
      }
   }

   @Override
   protected boolean e_(dsk $$0) {
      return this.J;
   }

   public static int b(int $$0) {
      ewf $$1 = G[$$0];
      return ayg.f((float)$$1.a(), (float)$$1.b(), (float)$$1.c());
   }

   private void a(dcf $$0, ayo $$1, ja $$2, ewf $$3, jf $$4, jf $$5, float $$6, float $$7) {
      float $$8 = $$7 - $$6;
      if (!($$1.i() >= 0.2F * $$8)) {
         float $$9 = 0.4375F;
         float $$10 = $$6 + $$8 * $$1.i();
         double $$11 = 0.5 + (double)(0.4375F * (float)$$4.j()) + (double)($$10 * (float)$$5.j());
         double $$12 = 0.5 + (double)(0.4375F * (float)$$4.k()) + (double)($$10 * (float)$$5.k());
         double $$13 = 0.5 + (double)(0.4375F * (float)$$4.l()) + (double)($$10 * (float)$$5.l());
         $$0.a(new le($$3.j(), 1.0F), (double)$$2.u() + $$11, (double)$$2.v() + $$12, (double)$$2.w() + $$13, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void a(dsk $$0, dcf $$1, ja $$2, ayo $$3) {
      int $$4 = $$0.c(f);
      if ($$4 != 0) {
         for (jf $$5 : jf.c.a) {
            dtp $$6 = $$0.c(g.get($$5));
            switch ($$6) {
               case a:
                  this.a($$1, $$3, $$2, G[$$4], $$5, jf.b, -0.5F, 0.5F);
               case b:
                  this.a($$1, $$3, $$2, G[$$4], jf.a, $$5, 0.0F, 0.5F);
                  break;
               case c:
               default:
                  this.a($$1, $$3, $$2, G[$$4], jf.a, $$5, 0.0F, 0.3F);
            }
         }
      }
   }

   @Override
   protected dsk a(dsk $$0, dlu $$1) {
      switch ($$1) {
         case c:
            return $$0.a(b, $$0.c(d)).a(c, $$0.c(e)).a(d, $$0.c(b)).a(e, $$0.c(c));
         case d:
            return $$0.a(b, $$0.c(c)).a(c, $$0.c(d)).a(d, $$0.c(e)).a(e, $$0.c(b));
         case b:
            return $$0.a(b, $$0.c(e)).a(c, $$0.c(b)).a(d, $$0.c(c)).a(e, $$0.c(d));
         default:
            return $$0;
      }
   }

   @Override
   protected dsk a(dsk $$0, dke $$1) {
      switch ($$1) {
         case b:
            return $$0.a(b, $$0.c(d)).a(d, $$0.c(b));
         case c:
            return $$0.a(c, $$0.c(e)).a(e, $$0.c(c));
         default:
            return super.a($$0, $$1);
      }
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected bqg a(dsk $$0, dcf $$1, ja $$2, cmk $$3, ewb $$4) {
      if (!$$3.ga().e) {
         return bqg.e;
      } else {
         if (o($$0) || p($$0)) {
            dsk $$5 = o($$0) ? this.o() : this.I;
            $$5 = $$5.a(f, $$0.c(f));
            $$5 = this.a($$1, $$5, $$2);
            if ($$5 != $$0) {
               $$1.a($$2, $$5, 3);
               this.a($$1, $$2, $$0, $$5);
               return bqg.a;
            }
         }

         return bqg.e;
      }
   }

   private void a(dcf $$0, ja $$1, dsk $$2, dsk $$3) {
      for (jf $$4 : jf.c.a) {
         ja $$5 = $$1.a($$4);
         if ($$2.c(g.get($$4)).a() != $$3.c(g.get($$4)).a() && $$0.a_($$5).g($$0, $$5)) {
            $$0.a($$5, $$3.b(), $$4.g());
         }
      }
   }
}
