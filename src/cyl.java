import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class cyl extends csk {
   public static final dfw<dgd> a = dfo.ab;
   public static final dfw<dgd> b = dfo.aa;
   public static final dfw<dgd> c = dfo.ac;
   public static final dfw<dgd> d = dfo.ad;
   public static final dfy e = dfo.aT;
   public static final Map<hb, dfw<dgd>> f = Maps.newEnumMap(ImmutableMap.of(hb.c, a, hb.f, b, hb.d, c, hb.e, d));
   protected static final int g = 1;
   protected static final int h = 3;
   protected static final int i = 13;
   protected static final int j = 3;
   protected static final int k = 13;
   private static final ehy l = csk.a(3.0, 0.0, 3.0, 13.0, 1.0, 13.0);
   private static final Map<hb, ehy> m = Maps.newEnumMap(
      ImmutableMap.of(
         hb.c,
         csk.a(3.0, 0.0, 0.0, 13.0, 1.0, 13.0),
         hb.d,
         csk.a(3.0, 0.0, 3.0, 13.0, 1.0, 16.0),
         hb.f,
         csk.a(3.0, 0.0, 3.0, 16.0, 1.0, 13.0),
         hb.e,
         csk.a(0.0, 0.0, 3.0, 13.0, 1.0, 13.0)
      )
   );
   private static final Map<hb, ehy> n = Maps.newEnumMap(
      ImmutableMap.of(
         hb.c,
         ehv.a(m.get(hb.c), csk.a(3.0, 0.0, 0.0, 13.0, 16.0, 1.0)),
         hb.d,
         ehv.a(m.get(hb.d), csk.a(3.0, 0.0, 15.0, 13.0, 16.0, 16.0)),
         hb.f,
         ehv.a(m.get(hb.f), csk.a(15.0, 0.0, 3.0, 16.0, 16.0, 13.0)),
         hb.e,
         ehv.a(m.get(hb.e), csk.a(0.0, 0.0, 3.0, 1.0, 16.0, 13.0))
      )
   );
   private static final Map<dey, ehy> D = Maps.newHashMap();
   private static final ehf[] E = ac.a(new ehf[16], $$0 -> {
      for (int $$1 = 0; $$1 <= 15; $$1++) {
         float $$2 = (float)$$1 / 15.0F;
         float $$3 = $$2 * 0.6F + ($$2 > 0.0F ? 0.4F : 0.3F);
         float $$4 = aro.a($$2 * $$2 * 0.7F - 0.5F, 0.0F, 1.0F);
         float $$5 = aro.a($$2 * $$2 * 0.6F - 0.7F, 0.0F, 1.0F);
         $$0[$$1] = new ehf((double)$$3, (double)$$4, (double)$$5);
      }
   });
   private static final float F = 0.2F;
   private final dey G;
   private boolean H = true;

   public cyl(dex.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, dgd.c).a(b, dgd.c).a(c, dgd.c).a(d, dgd.c).a(e, Integer.valueOf(0)));
      this.G = this.n().a(a, dgd.b).a(b, dgd.b).a(c, dgd.b).a(d, dgd.b);
      UnmodifiableIterator var2 = this.l().a().iterator();

      while (var2.hasNext()) {
         dey $$1 = (dey)var2.next();
         if ($$1.c(e) == 0) {
            D.put($$1, this.n($$1));
         }
      }
   }

   private ehy n(dey $$0) {
      ehy $$1 = l;

      for (hb $$2 : hb.c.a) {
         dgd $$3 = $$0.c(f.get($$2));
         if ($$3 == dgd.b) {
            $$1 = ehv.a($$1, m.get($$2));
         } else if ($$3 == dgd.a) {
            $$1 = ehv.a($$1, n.get($$2));
         }
      }

      return $$1;
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return D.get($$0.a(e, Integer.valueOf(0)));
   }

   @Override
   public dey a(cle $$0) {
      return this.a($$0.q(), this.G, $$0.a());
   }

   private dey a(coq $$0, dey $$1, gv $$2) {
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
            $$1 = $$1.a(d, dgd.b);
         }

         if (!$$6 && $$8) {
            $$1 = $$1.a(b, dgd.b);
         }

         if (!$$4 && $$9) {
            $$1 = $$1.a(a, dgd.b);
         }

         if (!$$5 && $$9) {
            $$1 = $$1.a(c, dgd.b);
         }

         return $$1;
      }
   }

   private dey b(coq $$0, dey $$1, gv $$2) {
      boolean $$3 = !$$0.a_($$2.c()).g($$0, $$2);

      for (hb $$4 : hb.c.a) {
         if (!$$1.c(f.get($$4)).a()) {
            dgd $$5 = this.a($$0, $$2, $$4, $$3);
            $$1 = $$1.a(f.get($$4), $$5);
         }
      }

      return $$1;
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      if ($$1 == hb.a) {
         return $$0;
      } else if ($$1 == hb.b) {
         return this.a($$3, $$0, $$4);
      } else {
         dgd $$6 = this.a($$3, $$4, $$1);
         return $$6.a() == $$0.c(f.get($$1)).a() && !o($$0) ? $$0.a(f.get($$1), $$6) : this.a($$3, this.G.a(e, $$0.c(e)).a(f.get($$1), $$6), $$4);
      }
   }

   private static boolean o(dey $$0) {
      return $$0.c(a).a() && $$0.c(c).a() && $$0.c(b).a() && $$0.c(d).a();
   }

   private static boolean p(dey $$0) {
      return !$$0.c(a).a() && !$$0.c(c).a() && !$$0.c(b).a() && !$$0.c(d).a();
   }

   @Override
   public void a(dey $$0, cpl $$1, gv $$2, int $$3, int $$4) {
      gv.a $$5 = new gv.a();

      for (hb $$6 : hb.c.a) {
         dgd $$7 = $$0.c(f.get($$6));
         if ($$7 != dgd.c && !$$1.a_($$5.a($$2, $$6)).a(this)) {
            $$5.c(hb.a);
            dey $$8 = $$1.a_($$5);
            if ($$8.a(this)) {
               gv $$9 = $$5.a($$6.g());
               $$1.a($$6.g(), $$1.a_($$9), $$5, $$9, $$3, $$4);
            }

            $$5.a($$2, $$6).c(hb.b);
            dey $$10 = $$1.a_($$5);
            if ($$10.a(this)) {
               gv $$11 = $$5.a($$6.g());
               $$1.a($$6.g(), $$1.a_($$11), $$5, $$11, $$3, $$4);
            }
         }
      }
   }

   private dgd a(coq $$0, gv $$1, hb $$2) {
      return this.a($$0, $$1, $$2, !$$0.a_($$1.c()).g($$0, $$1));
   }

   private dgd a(coq $$0, gv $$1, hb $$2, boolean $$3) {
      gv $$4 = $$1.a($$2);
      dey $$5 = $$0.a_($$4);
      if ($$3) {
         boolean $$6 = $$5.b() instanceof dax || this.b($$0, $$4, $$5);
         if ($$6 && h($$0.a_($$4.c()))) {
            if ($$5.d($$0, $$4, $$2.g())) {
               return dgd.a;
            }

            return dgd.b;
         }
      }

      return !a($$5, $$2) && ($$5.g($$0, $$4) || !h($$0.a_($$4.d()))) ? dgd.c : dgd.b;
   }

   @Override
   public boolean a(dey $$0, cpn $$1, gv $$2) {
      gv $$3 = $$2.d();
      dey $$4 = $$1.a_($$3);
      return this.b($$1, $$3, $$4);
   }

   private boolean b(coq $$0, gv $$1, dey $$2) {
      return $$2.d($$0, $$1, hb.b) || $$2.a(csl.hc);
   }

   private void a(cpk $$0, gv $$1, dey $$2) {
      int $$3 = this.a($$0, $$1);
      if ($$2.c(e) != $$3) {
         if ($$0.a_($$1) == $$2) {
            $$0.a($$1, $$2.a(e, Integer.valueOf($$3)), 2);
         }

         Set<gv> $$4 = Sets.newHashSet();
         $$4.add($$1);

         for (hb $$5 : hb.values()) {
            $$4.add($$1.a($$5));
         }

         for (gv $$6 : $$4) {
            $$0.a($$6, this);
         }
      }
   }

   private int a(cpk $$0, gv $$1) {
      this.H = false;
      int $$2 = $$0.C($$1);
      this.H = true;
      int $$3 = 0;
      if ($$2 < 15) {
         for (hb $$4 : hb.c.a) {
            gv $$5 = $$1.a($$4);
            dey $$6 = $$0.a_($$5);
            $$3 = Math.max($$3, this.q($$6));
            gv $$7 = $$1.c();
            if ($$6.g($$0, $$5) && !$$0.a_($$7).g($$0, $$7)) {
               $$3 = Math.max($$3, this.q($$0.a_($$5.c())));
            } else if (!$$6.g($$0, $$5)) {
               $$3 = Math.max($$3, this.q($$0.a_($$5.d())));
            }
         }
      }

      return Math.max($$2, $$3 - 1);
   }

   private int q(dey $$0) {
      return $$0.a(this) ? $$0.c(e) : 0;
   }

   private void b(cpk $$0, gv $$1) {
      if ($$0.a_($$1).a(this)) {
         $$0.a($$1, this);

         for (hb $$2 : hb.values()) {
            $$0.a($$1.a($$2), this);
         }
      }
   }

   @Override
   public void b(dey $$0, cpk $$1, gv $$2, dey $$3, boolean $$4) {
      if (!$$3.a($$0.b()) && !$$1.B) {
         this.a($$1, $$2, $$0);

         for (hb $$5 : hb.c.b) {
            $$1.a($$2.a($$5), this);
         }

         this.c($$1, $$2);
      }
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, dey $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         if (!$$1.B) {
            for (hb $$5 : hb.values()) {
               $$1.a($$2.a($$5), this);
            }

            this.a($$1, $$2, $$0);
            this.c($$1, $$2);
         }
      }
   }

   private void c(cpk $$0, gv $$1) {
      for (hb $$2 : hb.c.a) {
         this.b($$0, $$1.a($$2));
      }

      for (hb $$3 : hb.c.a) {
         gv $$4 = $$1.a($$3);
         if ($$0.a_($$4).g($$0, $$4)) {
            this.b($$0, $$4.c());
         } else {
            this.b($$0, $$4.d());
         }
      }
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, csk $$3, gv $$4, boolean $$5) {
      if (!$$1.B) {
         if ($$0.a((cpn)$$1, $$2)) {
            this.a($$1, $$2, $$0);
         } else {
            c($$0, $$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   public int b(dey $$0, coq $$1, gv $$2, hb $$3) {
      return !this.H ? 0 : $$0.b($$1, $$2, $$3);
   }

   @Override
   public int a(dey $$0, coq $$1, gv $$2, hb $$3) {
      if (this.H && $$3 != hb.a) {
         int $$4 = $$0.c(e);
         if ($$4 == 0) {
            return 0;
         } else {
            return $$3 != hb.b && !this.a($$1, $$0, $$2).c(f.get($$3.g())).a() ? 0 : $$4;
         }
      } else {
         return 0;
      }
   }

   protected static boolean h(dey $$0) {
      return a($$0, null);
   }

   protected static boolean a(dey $$0, @Nullable hb $$1) {
      if ($$0.a(csl.cw)) {
         return true;
      } else if ($$0.a(csl.ei)) {
         hb $$2 = $$0.c(cyq.aC);
         return $$2 == $$1 || $$2.g() == $$1;
      } else {
         return $$0.a(csl.kO) ? $$1 == $$0.c(cxt.a) : $$0.m() && $$1 != null;
      }
   }

   @Override
   public boolean f_(dey $$0) {
      return this.H;
   }

   public static int b(int $$0) {
      ehf $$1 = E[$$0];
      return aro.f((float)$$1.a(), (float)$$1.b(), (float)$$1.c());
   }

   private void a(cpk $$0, art $$1, gv $$2, ehf $$3, hb $$4, hb $$5, float $$6, float $$7) {
      float $$8 = $$7 - $$6;
      if (!($$1.i() >= 0.2F * $$8)) {
         float $$9 = 0.4375F;
         float $$10 = $$6 + $$8 * $$1.i();
         double $$11 = 0.5 + (double)(0.4375F * (float)$$4.j()) + (double)($$10 * (float)$$5.j());
         double $$12 = 0.5 + (double)(0.4375F * (float)$$4.k()) + (double)($$10 * (float)$$5.k());
         double $$13 = 0.5 + (double)(0.4375F * (float)$$4.l()) + (double)($$10 * (float)$$5.l());
         $$0.a(new iq($$3.j(), 1.0F), (double)$$2.u() + $$11, (double)$$2.v() + $$12, (double)$$2.w() + $$13, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, art $$3) {
      int $$4 = $$0.c(e);
      if ($$4 != 0) {
         for (hb $$5 : hb.c.a) {
            dgd $$6 = $$0.c(f.get($$5));
            switch ($$6) {
               case a:
                  this.a($$1, $$3, $$2, E[$$4], $$5, hb.b, -0.5F, 0.5F);
               case b:
                  this.a($$1, $$3, $$2, E[$$4], hb.a, $$5, 0.0F, 0.5F);
                  break;
               case c:
               default:
                  this.a($$1, $$3, $$2, E[$$4], hb.a, $$5, 0.0F, 0.3F);
            }
         }
      }
   }

   @Override
   public dey a(dey $$0, cyw $$1) {
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
   public dey a(dey $$0, cxf $$1) {
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
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(a, b, c, d, e);
   }

   @Override
   public bgo a(dey $$0, cpk $$1, gv $$2, cbl $$3, bgn $$4, ehb $$5) {
      if (!$$3.fR().e) {
         return bgo.d;
      } else {
         if (o($$0) || p($$0)) {
            dey $$6 = o($$0) ? this.n() : this.G;
            $$6 = $$6.a(e, $$0.c(e));
            $$6 = this.a($$1, $$6, $$2);
            if ($$6 != $$0) {
               $$1.a($$2, $$6, 3);
               this.a($$1, $$2, $$0, $$6);
               return bgo.a;
            }
         }

         return bgo.d;
      }
   }

   private void a(cpk $$0, gv $$1, dey $$2, dey $$3) {
      for (hb $$4 : hb.c.a) {
         gv $$5 = $$1.a($$4);
         if ($$2.c(f.get($$4)).a() != $$3.c(f.get($$4)).a() && $$0.a_($$5).g($$0, $$5)) {
            $$0.a($$5, $$3.b(), $$4.g());
         }
      }
   }
}
