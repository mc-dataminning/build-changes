import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class dlz extends dfw {
   public static final MapCodec<dlz> a = b(dlz::new);
   public static final dty<duf> b = dtq.ab;
   public static final dty<duf> c = dtq.aa;
   public static final dty<duf> d = dtq.ac;
   public static final dty<duf> e = dtq.ad;
   public static final dua f = dtq.aT;
   public static final Map<ji, dty<duf>> g = Maps.newEnumMap(ImmutableMap.of(ji.c, b, ji.f, c, ji.d, d, ji.e, e));
   protected static final int h = 1;
   protected static final int i = 3;
   protected static final int j = 13;
   protected static final int k = 3;
   protected static final int l = 13;
   private static final exp m = dfw.a(3.0, 0.0, 3.0, 13.0, 1.0, 13.0);
   private static final Map<ji, exp> n = Maps.newEnumMap(
      ImmutableMap.of(
         ji.c,
         dfw.a(3.0, 0.0, 0.0, 13.0, 1.0, 13.0),
         ji.d,
         dfw.a(3.0, 0.0, 3.0, 13.0, 1.0, 16.0),
         ji.f,
         dfw.a(3.0, 0.0, 3.0, 16.0, 1.0, 13.0),
         ji.e,
         dfw.a(0.0, 0.0, 3.0, 13.0, 1.0, 13.0)
      )
   );
   private static final Map<ji, exp> o = Maps.newEnumMap(
      ImmutableMap.of(
         ji.c,
         exm.a(n.get(ji.c), dfw.a(3.0, 0.0, 0.0, 13.0, 16.0, 1.0)),
         ji.d,
         exm.a(n.get(ji.d), dfw.a(3.0, 0.0, 15.0, 13.0, 16.0, 16.0)),
         ji.f,
         exm.a(n.get(ji.f), dfw.a(15.0, 0.0, 3.0, 16.0, 16.0, 13.0)),
         ji.e,
         exm.a(n.get(ji.e), dfw.a(0.0, 0.0, 3.0, 1.0, 16.0, 13.0))
      )
   );
   private static final Map<dta, exp> F = Maps.newHashMap();
   private static final eww[] G = ad.a(new eww[16], $$0 -> {
      for (int $$1 = 0; $$1 <= 15; $$1++) {
         float $$2 = (float)$$1 / 15.0F;
         float $$3 = $$2 * 0.6F + ($$2 > 0.0F ? 0.4F : 0.3F);
         float $$4 = ayn.a($$2 * $$2 * 0.7F - 0.5F, 0.0F, 1.0F);
         float $$5 = ayn.a($$2 * $$2 * 0.6F - 0.7F, 0.0F, 1.0F);
         $$0[$$1] = new eww((double)$$3, (double)$$4, (double)$$5);
      }
   });
   private static final float H = 0.2F;
   private final dta I;
   private boolean J = true;

   @Override
   public MapCodec<dlz> a() {
      return a;
   }

   public dlz(dsz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, duf.c).a(c, duf.c).a(d, duf.c).a(e, duf.c).a(f, Integer.valueOf(0)));
      this.I = this.o().a(b, duf.b).a(c, duf.b).a(d, duf.b).a(e, duf.b);
      UnmodifiableIterator var2 = this.l().a().iterator();

      while (var2.hasNext()) {
         dta $$1 = (dta)var2.next();
         if ($$1.c(f) == 0) {
            F.put($$1, this.n($$1));
         }
      }
   }

   private exp n(dta $$0) {
      exp $$1 = m;

      for (ji $$2 : ji.c.a) {
         duf $$3 = $$0.c(g.get($$2));
         if ($$3 == duf.b) {
            $$1 = exm.a($$1, n.get($$2));
         } else if ($$3 == duf.a) {
            $$1 = exm.a($$1, o.get($$2));
         }
      }

      return $$1;
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return F.get($$0.a(f, Integer.valueOf(0)));
   }

   @Override
   public dta a(cyb $$0) {
      return this.a($$0.q(), this.I, $$0.a());
   }

   private dta a(dca $$0, dta $$1, jd $$2) {
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
            $$1 = $$1.a(e, duf.b);
         }

         if (!$$6 && $$8) {
            $$1 = $$1.a(c, duf.b);
         }

         if (!$$4 && $$9) {
            $$1 = $$1.a(b, duf.b);
         }

         if (!$$5 && $$9) {
            $$1 = $$1.a(d, duf.b);
         }

         return $$1;
      }
   }

   private dta b(dca $$0, dta $$1, jd $$2) {
      boolean $$3 = !$$0.a_($$2.c()).g($$0, $$2);

      for (ji $$4 : ji.c.a) {
         if (!$$1.c(g.get($$4)).a()) {
            duf $$5 = this.a($$0, $$2, $$4, $$3);
            $$1 = $$1.a(g.get($$4), $$5);
         }
      }

      return $$1;
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      if ($$1 == ji.a) {
         return !this.a($$3, $$5, $$2) ? dfy.a.o() : $$0;
      } else if ($$1 == ji.b) {
         return this.a($$3, $$0, $$4);
      } else {
         duf $$6 = this.a($$3, $$4, $$1);
         return $$6.a() == $$0.c(g.get($$1)).a() && !o($$0) ? $$0.a(g.get($$1), $$6) : this.a($$3, this.I.a(f, $$0.c(f)).a(g.get($$1), $$6), $$4);
      }
   }

   private static boolean o(dta $$0) {
      return $$0.c(b).a() && $$0.c(d).a() && $$0.c(c).a() && $$0.c(e).a();
   }

   private static boolean p(dta $$0) {
      return !$$0.c(b).a() && !$$0.c(d).a() && !$$0.c(c).a() && !$$0.c(e).a();
   }

   @Override
   protected void a(dta $$0, dcv $$1, jd $$2, int $$3, int $$4) {
      jd.a $$5 = new jd.a();

      for (ji $$6 : ji.c.a) {
         duf $$7 = $$0.c(g.get($$6));
         if ($$7 != duf.c && !$$1.a_($$5.a($$2, $$6)).a(this)) {
            $$5.c(ji.a);
            dta $$8 = $$1.a_($$5);
            if ($$8.a(this)) {
               jd $$9 = $$5.a($$6.g());
               $$1.a($$6.g(), $$1.a_($$9), $$5, $$9, $$3, $$4);
            }

            $$5.a($$2, $$6).c(ji.b);
            dta $$10 = $$1.a_($$5);
            if ($$10.a(this)) {
               jd $$11 = $$5.a($$6.g());
               $$1.a($$6.g(), $$1.a_($$11), $$5, $$11, $$3, $$4);
            }
         }
      }
   }

   private duf a(dca $$0, jd $$1, ji $$2) {
      return this.a($$0, $$1, $$2, !$$0.a_($$1.c()).g($$0, $$1));
   }

   private duf a(dca $$0, jd $$1, ji $$2, boolean $$3) {
      jd $$4 = $$1.a($$2);
      dta $$5 = $$0.a_($$4);
      if ($$3) {
         boolean $$6 = $$5.b() instanceof dok || this.a($$0, $$4, $$5);
         if ($$6 && m($$0.a_($$4.c()))) {
            if ($$5.d($$0, $$4, $$2.g())) {
               return duf.a;
            }

            return duf.b;
         }
      }

      return !a($$5, $$2) && ($$5.g($$0, $$4) || !m($$0.a_($$4.d()))) ? duf.c : duf.b;
   }

   @Override
   protected boolean a(dta $$0, dcx $$1, jd $$2) {
      jd $$3 = $$2.d();
      dta $$4 = $$1.a_($$3);
      return this.a($$1, $$3, $$4);
   }

   private boolean a(dca $$0, jd $$1, dta $$2) {
      return $$2.d($$0, $$1, ji.b) || $$2.a(dfy.hc);
   }

   private void a(dcu $$0, jd $$1, dta $$2) {
      int $$3 = this.a($$0, $$1);
      if ($$2.c(f) != $$3) {
         if ($$0.a_($$1) == $$2) {
            $$0.a($$1, $$2.a(f, Integer.valueOf($$3)), 2);
         }

         Set<jd> $$4 = Sets.newHashSet();
         $$4.add($$1);

         for (ji $$5 : ji.values()) {
            $$4.add($$1.a($$5));
         }

         for (jd $$6 : $$4) {
            $$0.a($$6, this);
         }
      }
   }

   private int a(dcu $$0, jd $$1) {
      this.J = false;
      int $$2 = $$0.D($$1);
      this.J = true;
      int $$3 = 0;
      if ($$2 < 15) {
         for (ji $$4 : ji.c.a) {
            jd $$5 = $$1.a($$4);
            dta $$6 = $$0.a_($$5);
            $$3 = Math.max($$3, this.q($$6));
            jd $$7 = $$1.c();
            if ($$6.g($$0, $$5) && !$$0.a_($$7).g($$0, $$7)) {
               $$3 = Math.max($$3, this.q($$0.a_($$5.c())));
            } else if (!$$6.g($$0, $$5)) {
               $$3 = Math.max($$3, this.q($$0.a_($$5.d())));
            }
         }
      }

      return Math.max($$2, $$3 - 1);
   }

   private int q(dta $$0) {
      return $$0.a(this) ? $$0.c(f) : 0;
   }

   private void b(dcu $$0, jd $$1) {
      if ($$0.a_($$1).a(this)) {
         $$0.a($$1, this);

         for (ji $$2 : ji.values()) {
            $$0.a($$1.a($$2), this);
         }
      }
   }

   @Override
   protected void b(dta $$0, dcu $$1, jd $$2, dta $$3, boolean $$4) {
      if (!$$3.a($$0.b()) && !$$1.B) {
         this.a($$1, $$2, $$0);

         for (ji $$5 : ji.c.b) {
            $$1.a($$2.a($$5), this);
         }

         this.c($$1, $$2);
      }
   }

   @Override
   protected void a(dta $$0, dcu $$1, jd $$2, dta $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         if (!$$1.B) {
            for (ji $$5 : ji.values()) {
               $$1.a($$2.a($$5), this);
            }

            this.a($$1, $$2, $$0);
            this.c($$1, $$2);
         }
      }
   }

   private void c(dcu $$0, jd $$1) {
      for (ji $$2 : ji.c.a) {
         this.b($$0, $$1.a($$2));
      }

      for (ji $$3 : ji.c.a) {
         jd $$4 = $$1.a($$3);
         if ($$0.a_($$4).g($$0, $$4)) {
            this.b($$0, $$4.c());
         } else {
            this.b($$0, $$4.d());
         }
      }
   }

   @Override
   protected void a(dta $$0, dcu $$1, jd $$2, dfw $$3, jd $$4, boolean $$5) {
      if (!$$1.B) {
         if ($$0.a((dcx)$$1, $$2)) {
            this.a($$1, $$2, $$0);
         } else {
            c($$0, $$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   protected int b(dta $$0, dca $$1, jd $$2, ji $$3) {
      return !this.J ? 0 : $$0.b($$1, $$2, $$3);
   }

   @Override
   protected int a(dta $$0, dca $$1, jd $$2, ji $$3) {
      if (this.J && $$3 != ji.a) {
         int $$4 = $$0.c(f);
         if ($$4 == 0) {
            return 0;
         } else {
            return $$3 != ji.b && !this.a($$1, $$0, $$2).c(g.get($$3.g())).a() ? 0 : $$4;
         }
      } else {
         return 0;
      }
   }

   protected static boolean m(dta $$0) {
      return a($$0, null);
   }

   protected static boolean a(dta $$0, @Nullable ji $$1) {
      if ($$0.a(dfy.cw)) {
         return true;
      } else if ($$0.a(dfy.eh)) {
         ji $$2 = $$0.c(dme.aE);
         return $$2 == $$1 || $$2.g() == $$1;
      } else {
         return $$0.a(dfy.kO) ? $$1 == $$0.c(dlh.a) : $$0.m() && $$1 != null;
      }
   }

   @Override
   protected boolean e_(dta $$0) {
      return this.J;
   }

   public static int b(int $$0) {
      eww $$1 = G[$$0];
      return ayn.f((float)$$1.a(), (float)$$1.b(), (float)$$1.c());
   }

   private void a(dcu $$0, ayv $$1, jd $$2, eww $$3, ji $$4, ji $$5, float $$6, float $$7) {
      float $$8 = $$7 - $$6;
      if (!($$1.i() >= 0.2F * $$8)) {
         float $$9 = 0.4375F;
         float $$10 = $$6 + $$8 * $$1.i();
         double $$11 = 0.5 + (double)(0.4375F * (float)$$4.j()) + (double)($$10 * (float)$$5.j());
         double $$12 = 0.5 + (double)(0.4375F * (float)$$4.k()) + (double)($$10 * (float)$$5.k());
         double $$13 = 0.5 + (double)(0.4375F * (float)$$4.l()) + (double)($$10 * (float)$$5.l());
         $$0.a(new lh($$3.j(), 1.0F), (double)$$2.u() + $$11, (double)$$2.v() + $$12, (double)$$2.w() + $$13, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void a(dta $$0, dcu $$1, jd $$2, ayv $$3) {
      int $$4 = $$0.c(f);
      if ($$4 != 0) {
         for (ji $$5 : ji.c.a) {
            duf $$6 = $$0.c(g.get($$5));
            switch ($$6) {
               case a:
                  this.a($$1, $$3, $$2, G[$$4], $$5, ji.b, -0.5F, 0.5F);
               case b:
                  this.a($$1, $$3, $$2, G[$$4], ji.a, $$5, 0.0F, 0.5F);
                  break;
               case c:
               default:
                  this.a($$1, $$3, $$2, G[$$4], ji.a, $$5, 0.0F, 0.3F);
            }
         }
      }
   }

   @Override
   protected dta a(dta $$0, dmk $$1) {
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
   protected dta a(dta $$0, dkt $$1) {
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
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected bqq a(dta $$0, dcu $$1, jd $$2, cmv $$3, ews $$4) {
      if (!$$3.ga().e) {
         return bqq.e;
      } else {
         if (o($$0) || p($$0)) {
            dta $$5 = o($$0) ? this.o() : this.I;
            $$5 = $$5.a(f, $$0.c(f));
            $$5 = this.a($$1, $$5, $$2);
            if ($$5 != $$0) {
               $$1.a($$2, $$5, 3);
               this.a($$1, $$2, $$0, $$5);
               return bqq.a;
            }
         }

         return bqq.e;
      }
   }

   private void a(dcu $$0, jd $$1, dta $$2, dta $$3) {
      for (ji $$4 : ji.c.a) {
         jd $$5 = $$1.a($$4);
         if ($$2.c(g.get($$4)).a() != $$3.c(g.get($$4)).a() && $$0.a_($$5).g($$0, $$5)) {
            $$0.a($$5, $$3.b(), $$4.g());
         }
      }
   }
}
