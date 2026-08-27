import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class cyy extends csx {
   public static final dgj<dgq> a = dgb.ab;
   public static final dgj<dgq> b = dgb.aa;
   public static final dgj<dgq> c = dgb.ac;
   public static final dgj<dgq> d = dgb.ad;
   public static final dgl e = dgb.aT;
   public static final Map<hc, dgj<dgq>> f = Maps.newEnumMap(ImmutableMap.of(hc.c, a, hc.f, b, hc.d, c, hc.e, d));
   protected static final int g = 1;
   protected static final int h = 3;
   protected static final int i = 13;
   protected static final int j = 3;
   protected static final int k = 13;
   private static final eii l = csx.a(3.0, 0.0, 3.0, 13.0, 1.0, 13.0);
   private static final Map<hc, eii> m = Maps.newEnumMap(
      ImmutableMap.of(
         hc.c,
         csx.a(3.0, 0.0, 0.0, 13.0, 1.0, 13.0),
         hc.d,
         csx.a(3.0, 0.0, 3.0, 13.0, 1.0, 16.0),
         hc.f,
         csx.a(3.0, 0.0, 3.0, 16.0, 1.0, 13.0),
         hc.e,
         csx.a(0.0, 0.0, 3.0, 13.0, 1.0, 13.0)
      )
   );
   private static final Map<hc, eii> n = Maps.newEnumMap(
      ImmutableMap.of(
         hc.c,
         eif.a(m.get(hc.c), csx.a(3.0, 0.0, 0.0, 13.0, 16.0, 1.0)),
         hc.d,
         eif.a(m.get(hc.d), csx.a(3.0, 0.0, 15.0, 13.0, 16.0, 16.0)),
         hc.f,
         eif.a(m.get(hc.f), csx.a(15.0, 0.0, 3.0, 16.0, 16.0, 13.0)),
         hc.e,
         eif.a(m.get(hc.e), csx.a(0.0, 0.0, 3.0, 1.0, 16.0, 13.0))
      )
   );
   private static final Map<dfl, eii> D = Maps.newHashMap();
   private static final ehp[] E = ac.a(new ehp[16], $$0 -> {
      for (int $$1 = 0; $$1 <= 15; $$1++) {
         float $$2 = (float)$$1 / 15.0F;
         float $$3 = $$2 * 0.6F + ($$2 > 0.0F ? 0.4F : 0.3F);
         float $$4 = ary.a($$2 * $$2 * 0.7F - 0.5F, 0.0F, 1.0F);
         float $$5 = ary.a($$2 * $$2 * 0.6F - 0.7F, 0.0F, 1.0F);
         $$0[$$1] = new ehp((double)$$3, (double)$$4, (double)$$5);
      }
   });
   private static final float F = 0.2F;
   private final dfl G;
   private boolean H = true;

   public cyy(dfk.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, dgq.c).a(b, dgq.c).a(c, dgq.c).a(d, dgq.c).a(e, Integer.valueOf(0)));
      this.G = this.n().a(a, dgq.b).a(b, dgq.b).a(c, dgq.b).a(d, dgq.b);
      UnmodifiableIterator var2 = this.l().a().iterator();

      while (var2.hasNext()) {
         dfl $$1 = (dfl)var2.next();
         if ($$1.c(e) == 0) {
            D.put($$1, this.n($$1));
         }
      }
   }

   private eii n(dfl $$0) {
      eii $$1 = l;

      for (hc $$2 : hc.c.a) {
         dgq $$3 = $$0.c(f.get($$2));
         if ($$3 == dgq.b) {
            $$1 = eif.a($$1, m.get($$2));
         } else if ($$3 == dgq.a) {
            $$1 = eif.a($$1, n.get($$2));
         }
      }

      return $$1;
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return D.get($$0.a(e, Integer.valueOf(0)));
   }

   @Override
   public dfl a(clp $$0) {
      return this.a($$0.q(), this.G, $$0.a());
   }

   private dfl a(cpd $$0, dfl $$1, gw $$2) {
      boolean $$3 = p($$1);
      $$1 = this.b($$0, this.n().a(e, $$1.c(e)), $$2);
      if ($$3 && p($$1)) {
         return $$1;
      } else {
         boolean $$4 = $$1.c(a).a();
         boolean $$5 = $$1.c(c).a();
         boolean $$6 = $$1.c(b).a();
         boolean $$7 = $$1.c(d).a();
         boolean $$8 = !$$4 && !$$5;
         boolean $$9 = !$$6 && !$$7;
         if (!$$7 && $$8) {
            $$1 = $$1.a(d, dgq.b);
         }

         if (!$$6 && $$8) {
            $$1 = $$1.a(b, dgq.b);
         }

         if (!$$4 && $$9) {
            $$1 = $$1.a(a, dgq.b);
         }

         if (!$$5 && $$9) {
            $$1 = $$1.a(c, dgq.b);
         }

         return $$1;
      }
   }

   private dfl b(cpd $$0, dfl $$1, gw $$2) {
      boolean $$3 = !$$0.a_($$2.c()).g($$0, $$2);

      for (hc $$4 : hc.c.a) {
         if (!$$1.c(f.get($$4)).a()) {
            dgq $$5 = this.a($$0, $$2, $$4, $$3);
            $$1 = $$1.a(f.get($$4), $$5);
         }
      }

      return $$1;
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      if ($$1 == hc.a) {
         return !this.b($$3, $$5, $$2) ? csy.a.n() : $$0;
      } else if ($$1 == hc.b) {
         return this.a($$3, $$0, $$4);
      } else {
         dgq $$6 = this.a($$3, $$4, $$1);
         return $$6.a() == $$0.c(f.get($$1)).a() && !o($$0) ? $$0.a(f.get($$1), $$6) : this.a($$3, this.G.a(e, $$0.c(e)).a(f.get($$1), $$6), $$4);
      }
   }

   private static boolean o(dfl $$0) {
      return $$0.c(a).a() && $$0.c(c).a() && $$0.c(b).a() && $$0.c(d).a();
   }

   private static boolean p(dfl $$0) {
      return !$$0.c(a).a() && !$$0.c(c).a() && !$$0.c(b).a() && !$$0.c(d).a();
   }

   @Override
   public void a(dfl $$0, cpy $$1, gw $$2, int $$3, int $$4) {
      gw.a $$5 = new gw.a();

      for (hc $$6 : hc.c.a) {
         dgq $$7 = $$0.c(f.get($$6));
         if ($$7 != dgq.c && !$$1.a_($$5.a($$2, $$6)).a(this)) {
            $$5.c(hc.a);
            dfl $$8 = $$1.a_($$5);
            if ($$8.a(this)) {
               gw $$9 = $$5.a($$6.g());
               $$1.a($$6.g(), $$1.a_($$9), $$5, $$9, $$3, $$4);
            }

            $$5.a($$2, $$6).c(hc.b);
            dfl $$10 = $$1.a_($$5);
            if ($$10.a(this)) {
               gw $$11 = $$5.a($$6.g());
               $$1.a($$6.g(), $$1.a_($$11), $$5, $$11, $$3, $$4);
            }
         }
      }
   }

   private dgq a(cpd $$0, gw $$1, hc $$2) {
      return this.a($$0, $$1, $$2, !$$0.a_($$1.c()).g($$0, $$1));
   }

   private dgq a(cpd $$0, gw $$1, hc $$2, boolean $$3) {
      gw $$4 = $$1.a($$2);
      dfl $$5 = $$0.a_($$4);
      if ($$3) {
         boolean $$6 = $$5.b() instanceof dbk || this.b($$0, $$4, $$5);
         if ($$6 && h($$0.a_($$4.c()))) {
            if ($$5.d($$0, $$4, $$2.g())) {
               return dgq.a;
            }

            return dgq.b;
         }
      }

      return !a($$5, $$2) && ($$5.g($$0, $$4) || !h($$0.a_($$4.d()))) ? dgq.c : dgq.b;
   }

   @Override
   public boolean a(dfl $$0, cqa $$1, gw $$2) {
      gw $$3 = $$2.d();
      dfl $$4 = $$1.a_($$3);
      return this.b($$1, $$3, $$4);
   }

   private boolean b(cpd $$0, gw $$1, dfl $$2) {
      return $$2.d($$0, $$1, hc.b) || $$2.a(csy.hc);
   }

   private void a(cpx $$0, gw $$1, dfl $$2) {
      int $$3 = this.a($$0, $$1);
      if ($$2.c(e) != $$3) {
         if ($$0.a_($$1) == $$2) {
            $$0.a($$1, $$2.a(e, Integer.valueOf($$3)), 2);
         }

         Set<gw> $$4 = Sets.newHashSet();
         $$4.add($$1);

         for (hc $$5 : hc.values()) {
            $$4.add($$1.a($$5));
         }

         for (gw $$6 : $$4) {
            $$0.a($$6, this);
         }
      }
   }

   private int a(cpx $$0, gw $$1) {
      this.H = false;
      int $$2 = $$0.C($$1);
      this.H = true;
      int $$3 = 0;
      if ($$2 < 15) {
         for (hc $$4 : hc.c.a) {
            gw $$5 = $$1.a($$4);
            dfl $$6 = $$0.a_($$5);
            $$3 = Math.max($$3, this.q($$6));
            gw $$7 = $$1.c();
            if ($$6.g($$0, $$5) && !$$0.a_($$7).g($$0, $$7)) {
               $$3 = Math.max($$3, this.q($$0.a_($$5.c())));
            } else if (!$$6.g($$0, $$5)) {
               $$3 = Math.max($$3, this.q($$0.a_($$5.d())));
            }
         }
      }

      return Math.max($$2, $$3 - 1);
   }

   private int q(dfl $$0) {
      return $$0.a(this) ? $$0.c(e) : 0;
   }

   private void b(cpx $$0, gw $$1) {
      if ($$0.a_($$1).a(this)) {
         $$0.a($$1, this);

         for (hc $$2 : hc.values()) {
            $$0.a($$1.a($$2), this);
         }
      }
   }

   @Override
   public void b(dfl $$0, cpx $$1, gw $$2, dfl $$3, boolean $$4) {
      if (!$$3.a($$0.b()) && !$$1.B) {
         this.a($$1, $$2, $$0);

         for (hc $$5 : hc.c.b) {
            $$1.a($$2.a($$5), this);
         }

         this.c($$1, $$2);
      }
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, dfl $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         if (!$$1.B) {
            for (hc $$5 : hc.values()) {
               $$1.a($$2.a($$5), this);
            }

            this.a($$1, $$2, $$0);
            this.c($$1, $$2);
         }
      }
   }

   private void c(cpx $$0, gw $$1) {
      for (hc $$2 : hc.c.a) {
         this.b($$0, $$1.a($$2));
      }

      for (hc $$3 : hc.c.a) {
         gw $$4 = $$1.a($$3);
         if ($$0.a_($$4).g($$0, $$4)) {
            this.b($$0, $$4.c());
         } else {
            this.b($$0, $$4.d());
         }
      }
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, csx $$3, gw $$4, boolean $$5) {
      if (!$$1.B) {
         if ($$0.a((cqa)$$1, $$2)) {
            this.a($$1, $$2, $$0);
         } else {
            c($$0, $$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   public int b(dfl $$0, cpd $$1, gw $$2, hc $$3) {
      return !this.H ? 0 : $$0.b($$1, $$2, $$3);
   }

   @Override
   public int a(dfl $$0, cpd $$1, gw $$2, hc $$3) {
      if (this.H && $$3 != hc.a) {
         int $$4 = $$0.c(e);
         if ($$4 == 0) {
            return 0;
         } else {
            return $$3 != hc.b && !this.a($$1, $$0, $$2).c(f.get($$3.g())).a() ? 0 : $$4;
         }
      } else {
         return 0;
      }
   }

   protected static boolean h(dfl $$0) {
      return a($$0, null);
   }

   protected static boolean a(dfl $$0, @Nullable hc $$1) {
      if ($$0.a(csy.cw)) {
         return true;
      } else if ($$0.a(csy.ei)) {
         hc $$2 = $$0.c(czd.aC);
         return $$2 == $$1 || $$2.g() == $$1;
      } else {
         return $$0.a(csy.kO) ? $$1 == $$0.c(cyg.a) : $$0.m() && $$1 != null;
      }
   }

   @Override
   public boolean f_(dfl $$0) {
      return this.H;
   }

   public static int b(int $$0) {
      ehp $$1 = E[$$0];
      return ary.f((float)$$1.a(), (float)$$1.b(), (float)$$1.c());
   }

   private void a(cpx $$0, ase $$1, gw $$2, ehp $$3, hc $$4, hc $$5, float $$6, float $$7) {
      float $$8 = $$7 - $$6;
      if (!($$1.i() >= 0.2F * $$8)) {
         float $$9 = 0.4375F;
         float $$10 = $$6 + $$8 * $$1.i();
         double $$11 = 0.5 + (double)(0.4375F * (float)$$4.j()) + (double)($$10 * (float)$$5.j());
         double $$12 = 0.5 + (double)(0.4375F * (float)$$4.k()) + (double)($$10 * (float)$$5.k());
         double $$13 = 0.5 + (double)(0.4375F * (float)$$4.l()) + (double)($$10 * (float)$$5.l());
         $$0.a(new ir($$3.j(), 1.0F), (double)$$2.u() + $$11, (double)$$2.v() + $$12, (double)$$2.w() + $$13, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, ase $$3) {
      int $$4 = $$0.c(e);
      if ($$4 != 0) {
         for (hc $$5 : hc.c.a) {
            dgq $$6 = $$0.c(f.get($$5));
            switch ($$6) {
               case a:
                  this.a($$1, $$3, $$2, E[$$4], $$5, hc.b, -0.5F, 0.5F);
               case b:
                  this.a($$1, $$3, $$2, E[$$4], hc.a, $$5, 0.0F, 0.5F);
                  break;
               case c:
               default:
                  this.a($$1, $$3, $$2, E[$$4], hc.a, $$5, 0.0F, 0.3F);
            }
         }
      }
   }

   @Override
   public dfl a(dfl $$0, czj $$1) {
      switch ($$1) {
         case c:
            return $$0.a(a, $$0.c(c)).a(b, $$0.c(d)).a(c, $$0.c(a)).a(d, $$0.c(b));
         case d:
            return $$0.a(a, $$0.c(b)).a(b, $$0.c(c)).a(c, $$0.c(d)).a(d, $$0.c(a));
         case b:
            return $$0.a(a, $$0.c(d)).a(b, $$0.c(a)).a(c, $$0.c(b)).a(d, $$0.c(c));
         default:
            return $$0;
      }
   }

   @Override
   public dfl a(dfl $$0, cxs $$1) {
      switch ($$1) {
         case b:
            return $$0.a(a, $$0.c(c)).a(c, $$0.c(a));
         case c:
            return $$0.a(b, $$0.c(d)).a(d, $$0.c(b));
         default:
            return super.a($$0, $$1);
      }
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(a, b, c, d, e);
   }

   @Override
   public bha a(dfl $$0, cpx $$1, gw $$2, cbw $$3, bgz $$4, ehl $$5) {
      if (!$$3.fS().e) {
         return bha.d;
      } else {
         if (o($$0) || p($$0)) {
            dfl $$6 = o($$0) ? this.n() : this.G;
            $$6 = $$6.a(e, $$0.c(e));
            $$6 = this.a($$1, $$6, $$2);
            if ($$6 != $$0) {
               $$1.a($$2, $$6, 3);
               this.a($$1, $$2, $$0, $$6);
               return bha.a;
            }
         }

         return bha.d;
      }
   }

   private void a(cpx $$0, gw $$1, dfl $$2, dfl $$3) {
      for (hc $$4 : hc.c.a) {
         gw $$5 = $$1.a($$4);
         if ($$2.c(f.get($$4)).a() != $$3.c(f.get($$4)).a() && $$0.a_($$5).g($$0, $$5)) {
            $$0.a($$5, $$3.b(), $$4.g());
         }
      }
   }
}
