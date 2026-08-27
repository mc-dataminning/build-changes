import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class cvo extends cpn {
   public static final dcz<ddg> a = dcr.ab;
   public static final dcz<ddg> b = dcr.aa;
   public static final dcz<ddg> c = dcr.ac;
   public static final dcz<ddg> d = dcr.ad;
   public static final ddb e = dcr.aT;
   public static final Map<ha, dcz<ddg>> f = Maps.newEnumMap(ImmutableMap.of(ha.c, a, ha.f, b, ha.d, c, ha.e, d));
   protected static final int g = 1;
   protected static final int h = 3;
   protected static final int i = 13;
   protected static final int j = 3;
   protected static final int k = 13;
   private static final efb l = cpn.a(3.0, 0.0, 3.0, 13.0, 1.0, 13.0);
   private static final Map<ha, efb> m = Maps.newEnumMap(
      ImmutableMap.of(
         ha.c,
         cpn.a(3.0, 0.0, 0.0, 13.0, 1.0, 13.0),
         ha.d,
         cpn.a(3.0, 0.0, 3.0, 13.0, 1.0, 16.0),
         ha.f,
         cpn.a(3.0, 0.0, 3.0, 16.0, 1.0, 13.0),
         ha.e,
         cpn.a(0.0, 0.0, 3.0, 13.0, 1.0, 13.0)
      )
   );
   private static final Map<ha, efb> n = Maps.newEnumMap(
      ImmutableMap.of(
         ha.c,
         eey.a(m.get(ha.c), cpn.a(3.0, 0.0, 0.0, 13.0, 16.0, 1.0)),
         ha.d,
         eey.a(m.get(ha.d), cpn.a(3.0, 0.0, 15.0, 13.0, 16.0, 16.0)),
         ha.f,
         eey.a(m.get(ha.f), cpn.a(15.0, 0.0, 3.0, 16.0, 16.0, 13.0)),
         ha.e,
         eey.a(m.get(ha.e), cpn.a(0.0, 0.0, 3.0, 1.0, 16.0, 13.0))
      )
   );
   private static final Map<dcb, efb> D = Maps.newHashMap();
   private static final eei[] E = ac.a(new eei[16], $$0 -> {
      for (int $$1 = 0; $$1 <= 15; $$1++) {
         float $$2 = (float)$$1 / 15.0F;
         float $$3 = $$2 * 0.6F + ($$2 > 0.0F ? 0.4F : 0.3F);
         float $$4 = apa.a($$2 * $$2 * 0.7F - 0.5F, 0.0F, 1.0F);
         float $$5 = apa.a($$2 * $$2 * 0.6F - 0.7F, 0.0F, 1.0F);
         $$0[$$1] = new eei((double)$$3, (double)$$4, (double)$$5);
      }
   });
   private static final float F = 0.2F;
   private final dcb G;
   private boolean H = true;

   public cvo(dca.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, ddg.c).a(b, ddg.c).a(c, ddg.c).a(d, ddg.c).a(e, Integer.valueOf(0)));
      this.G = this.n().a(a, ddg.b).a(b, ddg.b).a(c, ddg.b).a(d, ddg.b);
      UnmodifiableIterator var2 = this.l().a().iterator();

      while (var2.hasNext()) {
         dcb $$1 = (dcb)var2.next();
         if ($$1.c(e) == 0) {
            D.put($$1, this.n($$1));
         }
      }
   }

   private efb n(dcb $$0) {
      efb $$1 = l;

      for (ha $$2 : ha.c.a) {
         ddg $$3 = $$0.c(f.get($$2));
         if ($$3 == ddg.b) {
            $$1 = eey.a($$1, m.get($$2));
         } else if ($$3 == ddg.a) {
            $$1 = eey.a($$1, n.get($$2));
         }
      }

      return $$1;
   }

   @Override
   public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
      return D.get($$0.a(e, Integer.valueOf(0)));
   }

   @Override
   public dcb a(cih $$0) {
      return this.a($$0.q(), this.G, $$0.a());
   }

   private dcb a(cls $$0, dcb $$1, gu $$2) {
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
            $$1 = $$1.a(d, ddg.b);
         }

         if (!$$6 && $$8) {
            $$1 = $$1.a(b, ddg.b);
         }

         if (!$$4 && $$9) {
            $$1 = $$1.a(a, ddg.b);
         }

         if (!$$5 && $$9) {
            $$1 = $$1.a(c, ddg.b);
         }

         return $$1;
      }
   }

   private dcb b(cls $$0, dcb $$1, gu $$2) {
      boolean $$3 = !$$0.a_($$2.c()).g($$0, $$2);

      for (ha $$4 : ha.c.a) {
         if (!$$1.c(f.get($$4)).a()) {
            ddg $$5 = this.a($$0, $$2, $$4, $$3);
            $$1 = $$1.a(f.get($$4), $$5);
         }
      }

      return $$1;
   }

   @Override
   public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
      if ($$1 == ha.a) {
         return $$0;
      } else if ($$1 == ha.b) {
         return this.a($$3, $$0, $$4);
      } else {
         ddg $$6 = this.a($$3, $$4, $$1);
         return $$6.a() == $$0.c(f.get($$1)).a() && !o($$0) ? $$0.a(f.get($$1), $$6) : this.a($$3, this.G.a(e, $$0.c(e)).a(f.get($$1), $$6), $$4);
      }
   }

   private static boolean o(dcb $$0) {
      return $$0.c(a).a() && $$0.c(c).a() && $$0.c(b).a() && $$0.c(d).a();
   }

   private static boolean p(dcb $$0) {
      return !$$0.c(a).a() && !$$0.c(c).a() && !$$0.c(b).a() && !$$0.c(d).a();
   }

   @Override
   public void a(dcb $$0, cmn $$1, gu $$2, int $$3, int $$4) {
      gu.a $$5 = new gu.a();

      for (ha $$6 : ha.c.a) {
         ddg $$7 = $$0.c(f.get($$6));
         if ($$7 != ddg.c && !$$1.a_($$5.a($$2, $$6)).a(this)) {
            $$5.c(ha.a);
            dcb $$8 = $$1.a_($$5);
            if ($$8.a(this)) {
               gu $$9 = $$5.a($$6.g());
               $$1.a($$6.g(), $$1.a_($$9), $$5, $$9, $$3, $$4);
            }

            $$5.a($$2, $$6).c(ha.b);
            dcb $$10 = $$1.a_($$5);
            if ($$10.a(this)) {
               gu $$11 = $$5.a($$6.g());
               $$1.a($$6.g(), $$1.a_($$11), $$5, $$11, $$3, $$4);
            }
         }
      }
   }

   private ddg a(cls $$0, gu $$1, ha $$2) {
      return this.a($$0, $$1, $$2, !$$0.a_($$1.c()).g($$0, $$1));
   }

   private ddg a(cls $$0, gu $$1, ha $$2, boolean $$3) {
      gu $$4 = $$1.a($$2);
      dcb $$5 = $$0.a_($$4);
      if ($$3) {
         boolean $$6 = $$5.b() instanceof cya || this.b($$0, $$4, $$5);
         if ($$6 && h($$0.a_($$4.c()))) {
            if ($$5.d($$0, $$4, $$2.g())) {
               return ddg.a;
            }

            return ddg.b;
         }
      }

      return !a($$5, $$2) && ($$5.g($$0, $$4) || !h($$0.a_($$4.d()))) ? ddg.c : ddg.b;
   }

   @Override
   public boolean a(dcb $$0, cmp $$1, gu $$2) {
      gu $$3 = $$2.d();
      dcb $$4 = $$1.a_($$3);
      return this.b($$1, $$3, $$4);
   }

   private boolean b(cls $$0, gu $$1, dcb $$2) {
      return $$2.d($$0, $$1, ha.b) || $$2.a(cpo.hc);
   }

   private void a(cmm $$0, gu $$1, dcb $$2) {
      int $$3 = this.a($$0, $$1);
      if ($$2.c(e) != $$3) {
         if ($$0.a_($$1) == $$2) {
            $$0.a($$1, $$2.a(e, Integer.valueOf($$3)), 2);
         }

         Set<gu> $$4 = Sets.newHashSet();
         $$4.add($$1);

         for (ha $$5 : ha.values()) {
            $$4.add($$1.a($$5));
         }

         for (gu $$6 : $$4) {
            $$0.a($$6, this);
         }
      }
   }

   private int a(cmm $$0, gu $$1) {
      this.H = false;
      int $$2 = $$0.C($$1);
      this.H = true;
      int $$3 = 0;
      if ($$2 < 15) {
         for (ha $$4 : ha.c.a) {
            gu $$5 = $$1.a($$4);
            dcb $$6 = $$0.a_($$5);
            $$3 = Math.max($$3, this.q($$6));
            gu $$7 = $$1.c();
            if ($$6.g($$0, $$5) && !$$0.a_($$7).g($$0, $$7)) {
               $$3 = Math.max($$3, this.q($$0.a_($$5.c())));
            } else if (!$$6.g($$0, $$5)) {
               $$3 = Math.max($$3, this.q($$0.a_($$5.d())));
            }
         }
      }

      return Math.max($$2, $$3 - 1);
   }

   private int q(dcb $$0) {
      return $$0.a(this) ? $$0.c(e) : 0;
   }

   private void b(cmm $$0, gu $$1) {
      if ($$0.a_($$1).a(this)) {
         $$0.a($$1, this);

         for (ha $$2 : ha.values()) {
            $$0.a($$1.a($$2), this);
         }
      }
   }

   @Override
   public void b(dcb $$0, cmm $$1, gu $$2, dcb $$3, boolean $$4) {
      if (!$$3.a($$0.b()) && !$$1.B) {
         this.a($$1, $$2, $$0);

         for (ha $$5 : ha.c.b) {
            $$1.a($$2.a($$5), this);
         }

         this.c($$1, $$2);
      }
   }

   @Override
   public void a(dcb $$0, cmm $$1, gu $$2, dcb $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         if (!$$1.B) {
            for (ha $$5 : ha.values()) {
               $$1.a($$2.a($$5), this);
            }

            this.a($$1, $$2, $$0);
            this.c($$1, $$2);
         }
      }
   }

   private void c(cmm $$0, gu $$1) {
      for (ha $$2 : ha.c.a) {
         this.b($$0, $$1.a($$2));
      }

      for (ha $$3 : ha.c.a) {
         gu $$4 = $$1.a($$3);
         if ($$0.a_($$4).g($$0, $$4)) {
            this.b($$0, $$4.c());
         } else {
            this.b($$0, $$4.d());
         }
      }
   }

   @Override
   public void a(dcb $$0, cmm $$1, gu $$2, cpn $$3, gu $$4, boolean $$5) {
      if (!$$1.B) {
         if ($$0.a((cmp)$$1, $$2)) {
            this.a($$1, $$2, $$0);
         } else {
            c($$0, $$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   public int b(dcb $$0, cls $$1, gu $$2, ha $$3) {
      return !this.H ? 0 : $$0.b($$1, $$2, $$3);
   }

   @Override
   public int a(dcb $$0, cls $$1, gu $$2, ha $$3) {
      if (this.H && $$3 != ha.a) {
         int $$4 = $$0.c(e);
         if ($$4 == 0) {
            return 0;
         } else {
            return $$3 != ha.b && !this.a($$1, $$0, $$2).c(f.get($$3.g())).a() ? 0 : $$4;
         }
      } else {
         return 0;
      }
   }

   protected static boolean h(dcb $$0) {
      return a($$0, null);
   }

   protected static boolean a(dcb $$0, @Nullable ha $$1) {
      if ($$0.a(cpo.cw)) {
         return true;
      } else if ($$0.a(cpo.ei)) {
         ha $$2 = $$0.c(cvt.aC);
         return $$2 == $$1 || $$2.g() == $$1;
      } else {
         return $$0.a(cpo.kO) ? $$1 == $$0.c(cuw.a) : $$0.m() && $$1 != null;
      }
   }

   @Override
   public boolean f_(dcb $$0) {
      return this.H;
   }

   public static int b(int $$0) {
      eei $$1 = E[$$0];
      return apa.f((float)$$1.a(), (float)$$1.b(), (float)$$1.c());
   }

   private void a(cmm $$0, apf $$1, gu $$2, eei $$3, ha $$4, ha $$5, float $$6, float $$7) {
      float $$8 = $$7 - $$6;
      if (!($$1.i() >= 0.2F * $$8)) {
         float $$9 = 0.4375F;
         float $$10 = $$6 + $$8 * $$1.i();
         double $$11 = 0.5 + (double)(0.4375F * (float)$$4.j()) + (double)($$10 * (float)$$5.j());
         double $$12 = 0.5 + (double)(0.4375F * (float)$$4.k()) + (double)($$10 * (float)$$5.k());
         double $$13 = 0.5 + (double)(0.4375F * (float)$$4.l()) + (double)($$10 * (float)$$5.l());
         $$0.a(new ip($$3.j(), 1.0F), (double)$$2.u() + $$11, (double)$$2.v() + $$12, (double)$$2.w() + $$13, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void a(dcb $$0, cmm $$1, gu $$2, apf $$3) {
      int $$4 = $$0.c(e);
      if ($$4 != 0) {
         for (ha $$5 : ha.c.a) {
            ddg $$6 = $$0.c(f.get($$5));
            switch ($$6) {
               case a:
                  this.a($$1, $$3, $$2, E[$$4], $$5, ha.b, -0.5F, 0.5F);
               case b:
                  this.a($$1, $$3, $$2, E[$$4], ha.a, $$5, 0.0F, 0.5F);
                  break;
               case c:
               default:
                  this.a($$1, $$3, $$2, E[$$4], ha.a, $$5, 0.0F, 0.3F);
            }
         }
      }
   }

   @Override
   public dcb a(dcb $$0, cvz $$1) {
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
   public dcb a(dcb $$0, cui $$1) {
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
   protected void a(dcc.a<cpn, dcb> $$0) {
      $$0.a(a, b, c, d, e);
   }

   @Override
   public bdx a(dcb $$0, cmm $$1, gu $$2, byo $$3, bdw $$4, eee $$5) {
      if (!$$3.fO().e) {
         return bdx.d;
      } else {
         if (o($$0) || p($$0)) {
            dcb $$6 = o($$0) ? this.n() : this.G;
            $$6 = $$6.a(e, $$0.c(e));
            $$6 = this.a($$1, $$6, $$2);
            if ($$6 != $$0) {
               $$1.a($$2, $$6, 3);
               this.a($$1, $$2, $$0, $$6);
               return bdx.a;
            }
         }

         return bdx.d;
      }
   }

   private void a(cmm $$0, gu $$1, dcb $$2, dcb $$3) {
      for (ha $$4 : ha.c.a) {
         gu $$5 = $$1.a($$4);
         if ($$2.c(f.get($$4)).a() != $$3.c(f.get($$4)).a() && $$0.a_($$5).g($$0, $$5)) {
            $$0.a($$5, $$3.b(), $$4.g());
         }
      }
   }
}
