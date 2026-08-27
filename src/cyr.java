import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class cyr extends csq {
   public static final dgc<dgj> a = dfu.ab;
   public static final dgc<dgj> b = dfu.aa;
   public static final dgc<dgj> c = dfu.ac;
   public static final dgc<dgj> d = dfu.ad;
   public static final dge e = dfu.aT;
   public static final Map<hc, dgc<dgj>> f = Maps.newEnumMap(ImmutableMap.of(hc.c, a, hc.f, b, hc.d, c, hc.e, d));
   protected static final int g = 1;
   protected static final int h = 3;
   protected static final int i = 13;
   protected static final int j = 3;
   protected static final int k = 13;
   private static final eib l = csq.a(3.0, 0.0, 3.0, 13.0, 1.0, 13.0);
   private static final Map<hc, eib> m = Maps.newEnumMap(
      ImmutableMap.of(
         hc.c,
         csq.a(3.0, 0.0, 0.0, 13.0, 1.0, 13.0),
         hc.d,
         csq.a(3.0, 0.0, 3.0, 13.0, 1.0, 16.0),
         hc.f,
         csq.a(3.0, 0.0, 3.0, 16.0, 1.0, 13.0),
         hc.e,
         csq.a(0.0, 0.0, 3.0, 13.0, 1.0, 13.0)
      )
   );
   private static final Map<hc, eib> n = Maps.newEnumMap(
      ImmutableMap.of(
         hc.c,
         ehy.a(m.get(hc.c), csq.a(3.0, 0.0, 0.0, 13.0, 16.0, 1.0)),
         hc.d,
         ehy.a(m.get(hc.d), csq.a(3.0, 0.0, 15.0, 13.0, 16.0, 16.0)),
         hc.f,
         ehy.a(m.get(hc.f), csq.a(15.0, 0.0, 3.0, 16.0, 16.0, 13.0)),
         hc.e,
         ehy.a(m.get(hc.e), csq.a(0.0, 0.0, 3.0, 1.0, 16.0, 13.0))
      )
   );
   private static final Map<dfe, eib> D = Maps.newHashMap();
   private static final ehi[] E = ac.a(new ehi[16], $$0 -> {
      for (int $$1 = 0; $$1 <= 15; $$1++) {
         float $$2 = (float)$$1 / 15.0F;
         float $$3 = $$2 * 0.6F + ($$2 > 0.0F ? 0.4F : 0.3F);
         float $$4 = ars.a($$2 * $$2 * 0.7F - 0.5F, 0.0F, 1.0F);
         float $$5 = ars.a($$2 * $$2 * 0.6F - 0.7F, 0.0F, 1.0F);
         $$0[$$1] = new ehi((double)$$3, (double)$$4, (double)$$5);
      }
   });
   private static final float F = 0.2F;
   private final dfe G;
   private boolean H = true;

   public cyr(dfd.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, dgj.c).a(b, dgj.c).a(c, dgj.c).a(d, dgj.c).a(e, Integer.valueOf(0)));
      this.G = this.n().a(a, dgj.b).a(b, dgj.b).a(c, dgj.b).a(d, dgj.b);
      UnmodifiableIterator var2 = this.l().a().iterator();

      while (var2.hasNext()) {
         dfe $$1 = (dfe)var2.next();
         if ($$1.c(e) == 0) {
            D.put($$1, this.n($$1));
         }
      }
   }

   private eib n(dfe $$0) {
      eib $$1 = l;

      for (hc $$2 : hc.c.a) {
         dgj $$3 = $$0.c(f.get($$2));
         if ($$3 == dgj.b) {
            $$1 = ehy.a($$1, m.get($$2));
         } else if ($$3 == dgj.a) {
            $$1 = ehy.a($$1, n.get($$2));
         }
      }

      return $$1;
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return D.get($$0.a(e, Integer.valueOf(0)));
   }

   @Override
   public dfe a(cli $$0) {
      return this.a($$0.q(), this.G, $$0.a());
   }

   private dfe a(cow $$0, dfe $$1, gw $$2) {
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
            $$1 = $$1.a(d, dgj.b);
         }

         if (!$$6 && $$8) {
            $$1 = $$1.a(b, dgj.b);
         }

         if (!$$4 && $$9) {
            $$1 = $$1.a(a, dgj.b);
         }

         if (!$$5 && $$9) {
            $$1 = $$1.a(c, dgj.b);
         }

         return $$1;
      }
   }

   private dfe b(cow $$0, dfe $$1, gw $$2) {
      boolean $$3 = !$$0.a_($$2.c()).g($$0, $$2);

      for (hc $$4 : hc.c.a) {
         if (!$$1.c(f.get($$4)).a()) {
            dgj $$5 = this.a($$0, $$2, $$4, $$3);
            $$1 = $$1.a(f.get($$4), $$5);
         }
      }

      return $$1;
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      if ($$1 == hc.a) {
         return !this.b($$3, $$5, $$2) ? csr.a.n() : $$0;
      } else if ($$1 == hc.b) {
         return this.a($$3, $$0, $$4);
      } else {
         dgj $$6 = this.a($$3, $$4, $$1);
         return $$6.a() == $$0.c(f.get($$1)).a() && !o($$0) ? $$0.a(f.get($$1), $$6) : this.a($$3, this.G.a(e, $$0.c(e)).a(f.get($$1), $$6), $$4);
      }
   }

   private static boolean o(dfe $$0) {
      return $$0.c(a).a() && $$0.c(c).a() && $$0.c(b).a() && $$0.c(d).a();
   }

   private static boolean p(dfe $$0) {
      return !$$0.c(a).a() && !$$0.c(c).a() && !$$0.c(b).a() && !$$0.c(d).a();
   }

   @Override
   public void a(dfe $$0, cpr $$1, gw $$2, int $$3, int $$4) {
      gw.a $$5 = new gw.a();

      for (hc $$6 : hc.c.a) {
         dgj $$7 = $$0.c(f.get($$6));
         if ($$7 != dgj.c && !$$1.a_($$5.a($$2, $$6)).a(this)) {
            $$5.c(hc.a);
            dfe $$8 = $$1.a_($$5);
            if ($$8.a(this)) {
               gw $$9 = $$5.a($$6.g());
               $$1.a($$6.g(), $$1.a_($$9), $$5, $$9, $$3, $$4);
            }

            $$5.a($$2, $$6).c(hc.b);
            dfe $$10 = $$1.a_($$5);
            if ($$10.a(this)) {
               gw $$11 = $$5.a($$6.g());
               $$1.a($$6.g(), $$1.a_($$11), $$5, $$11, $$3, $$4);
            }
         }
      }
   }

   private dgj a(cow $$0, gw $$1, hc $$2) {
      return this.a($$0, $$1, $$2, !$$0.a_($$1.c()).g($$0, $$1));
   }

   private dgj a(cow $$0, gw $$1, hc $$2, boolean $$3) {
      gw $$4 = $$1.a($$2);
      dfe $$5 = $$0.a_($$4);
      if ($$3) {
         boolean $$6 = $$5.b() instanceof dbd || this.b($$0, $$4, $$5);
         if ($$6 && h($$0.a_($$4.c()))) {
            if ($$5.d($$0, $$4, $$2.g())) {
               return dgj.a;
            }

            return dgj.b;
         }
      }

      return !a($$5, $$2) && ($$5.g($$0, $$4) || !h($$0.a_($$4.d()))) ? dgj.c : dgj.b;
   }

   @Override
   public boolean a(dfe $$0, cpt $$1, gw $$2) {
      gw $$3 = $$2.d();
      dfe $$4 = $$1.a_($$3);
      return this.b($$1, $$3, $$4);
   }

   private boolean b(cow $$0, gw $$1, dfe $$2) {
      return $$2.d($$0, $$1, hc.b) || $$2.a(csr.hc);
   }

   private void a(cpq $$0, gw $$1, dfe $$2) {
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

   private int a(cpq $$0, gw $$1) {
      this.H = false;
      int $$2 = $$0.C($$1);
      this.H = true;
      int $$3 = 0;
      if ($$2 < 15) {
         for (hc $$4 : hc.c.a) {
            gw $$5 = $$1.a($$4);
            dfe $$6 = $$0.a_($$5);
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

   private int q(dfe $$0) {
      return $$0.a(this) ? $$0.c(e) : 0;
   }

   private void b(cpq $$0, gw $$1) {
      if ($$0.a_($$1).a(this)) {
         $$0.a($$1, this);

         for (hc $$2 : hc.values()) {
            $$0.a($$1.a($$2), this);
         }
      }
   }

   @Override
   public void b(dfe $$0, cpq $$1, gw $$2, dfe $$3, boolean $$4) {
      if (!$$3.a($$0.b()) && !$$1.B) {
         this.a($$1, $$2, $$0);

         for (hc $$5 : hc.c.b) {
            $$1.a($$2.a($$5), this);
         }

         this.c($$1, $$2);
      }
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, dfe $$3, boolean $$4) {
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

   private void c(cpq $$0, gw $$1) {
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
   public void a(dfe $$0, cpq $$1, gw $$2, csq $$3, gw $$4, boolean $$5) {
      if (!$$1.B) {
         if ($$0.a((cpt)$$1, $$2)) {
            this.a($$1, $$2, $$0);
         } else {
            c($$0, $$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   public int b(dfe $$0, cow $$1, gw $$2, hc $$3) {
      return !this.H ? 0 : $$0.b($$1, $$2, $$3);
   }

   @Override
   public int a(dfe $$0, cow $$1, gw $$2, hc $$3) {
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

   protected static boolean h(dfe $$0) {
      return a($$0, null);
   }

   protected static boolean a(dfe $$0, @Nullable hc $$1) {
      if ($$0.a(csr.cw)) {
         return true;
      } else if ($$0.a(csr.ei)) {
         hc $$2 = $$0.c(cyw.aC);
         return $$2 == $$1 || $$2.g() == $$1;
      } else {
         return $$0.a(csr.kO) ? $$1 == $$0.c(cxz.a) : $$0.m() && $$1 != null;
      }
   }

   @Override
   public boolean f_(dfe $$0) {
      return this.H;
   }

   public static int b(int $$0) {
      ehi $$1 = E[$$0];
      return ars.f((float)$$1.a(), (float)$$1.b(), (float)$$1.c());
   }

   private void a(cpq $$0, arx $$1, gw $$2, ehi $$3, hc $$4, hc $$5, float $$6, float $$7) {
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
   public void a(dfe $$0, cpq $$1, gw $$2, arx $$3) {
      int $$4 = $$0.c(e);
      if ($$4 != 0) {
         for (hc $$5 : hc.c.a) {
            dgj $$6 = $$0.c(f.get($$5));
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
   public dfe a(dfe $$0, czc $$1) {
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
   public dfe a(dfe $$0, cxl $$1) {
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
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(a, b, c, d, e);
   }

   @Override
   public bgt a(dfe $$0, cpq $$1, gw $$2, cbp $$3, bgs $$4, ehe $$5) {
      if (!$$3.fR().e) {
         return bgt.d;
      } else {
         if (o($$0) || p($$0)) {
            dfe $$6 = o($$0) ? this.n() : this.G;
            $$6 = $$6.a(e, $$0.c(e));
            $$6 = this.a($$1, $$6, $$2);
            if ($$6 != $$0) {
               $$1.a($$2, $$6, 3);
               this.a($$1, $$2, $$0, $$6);
               return bgt.a;
            }
         }

         return bgt.d;
      }
   }

   private void a(cpq $$0, gw $$1, dfe $$2, dfe $$3) {
      for (hc $$4 : hc.c.a) {
         gw $$5 = $$1.a($$4);
         if ($$2.c(f.get($$4)).a() != $$3.c(f.get($$4)).a() && $$0.a_($$5).g($$0, $$5)) {
            $$0.a($$5, $$3.b(), $$4.g());
         }
      }
   }
}
