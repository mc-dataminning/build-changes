import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class cym extends csl {
   public static final dfx<dge> a = dfp.ab;
   public static final dfx<dge> b = dfp.aa;
   public static final dfx<dge> c = dfp.ac;
   public static final dfx<dge> d = dfp.ad;
   public static final dfz e = dfp.aT;
   public static final Map<ha, dfx<dge>> f = Maps.newEnumMap(ImmutableMap.of(ha.c, a, ha.f, b, ha.d, c, ha.e, d));
   protected static final int g = 1;
   protected static final int h = 3;
   protected static final int i = 13;
   protected static final int j = 3;
   protected static final int k = 13;
   private static final ehw l = csl.a(3.0, 0.0, 3.0, 13.0, 1.0, 13.0);
   private static final Map<ha, ehw> m = Maps.newEnumMap(
      ImmutableMap.of(
         ha.c,
         csl.a(3.0, 0.0, 0.0, 13.0, 1.0, 13.0),
         ha.d,
         csl.a(3.0, 0.0, 3.0, 13.0, 1.0, 16.0),
         ha.f,
         csl.a(3.0, 0.0, 3.0, 16.0, 1.0, 13.0),
         ha.e,
         csl.a(0.0, 0.0, 3.0, 13.0, 1.0, 13.0)
      )
   );
   private static final Map<ha, ehw> n = Maps.newEnumMap(
      ImmutableMap.of(
         ha.c,
         eht.a(m.get(ha.c), csl.a(3.0, 0.0, 0.0, 13.0, 16.0, 1.0)),
         ha.d,
         eht.a(m.get(ha.d), csl.a(3.0, 0.0, 15.0, 13.0, 16.0, 16.0)),
         ha.f,
         eht.a(m.get(ha.f), csl.a(15.0, 0.0, 3.0, 16.0, 16.0, 13.0)),
         ha.e,
         eht.a(m.get(ha.e), csl.a(0.0, 0.0, 3.0, 1.0, 16.0, 13.0))
      )
   );
   private static final Map<dez, ehw> D = Maps.newHashMap();
   private static final ehd[] E = ac.a(new ehd[16], $$0 -> {
      for (int $$1 = 0; $$1 <= 15; $$1++) {
         float $$2 = (float)$$1 / 15.0F;
         float $$3 = $$2 * 0.6F + ($$2 > 0.0F ? 0.4F : 0.3F);
         float $$4 = arp.a($$2 * $$2 * 0.7F - 0.5F, 0.0F, 1.0F);
         float $$5 = arp.a($$2 * $$2 * 0.6F - 0.7F, 0.0F, 1.0F);
         $$0[$$1] = new ehd((double)$$3, (double)$$4, (double)$$5);
      }
   });
   private static final float F = 0.2F;
   private final dez G;
   private boolean H = true;

   public cym(dey.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, dge.c).a(b, dge.c).a(c, dge.c).a(d, dge.c).a(e, Integer.valueOf(0)));
      this.G = this.n().a(a, dge.b).a(b, dge.b).a(c, dge.b).a(d, dge.b);
      UnmodifiableIterator var2 = this.l().a().iterator();

      while (var2.hasNext()) {
         dez $$1 = (dez)var2.next();
         if ($$1.c(e) == 0) {
            D.put($$1, this.n($$1));
         }
      }
   }

   private ehw n(dez $$0) {
      ehw $$1 = l;

      for (ha $$2 : ha.c.a) {
         dge $$3 = $$0.c(f.get($$2));
         if ($$3 == dge.b) {
            $$1 = eht.a($$1, m.get($$2));
         } else if ($$3 == dge.a) {
            $$1 = eht.a($$1, n.get($$2));
         }
      }

      return $$1;
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return D.get($$0.a(e, Integer.valueOf(0)));
   }

   @Override
   public dez a(clf $$0) {
      return this.a($$0.q(), this.G, $$0.a());
   }

   private dez a(cor $$0, dez $$1, gu $$2) {
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
            $$1 = $$1.a(d, dge.b);
         }

         if (!$$6 && $$8) {
            $$1 = $$1.a(b, dge.b);
         }

         if (!$$4 && $$9) {
            $$1 = $$1.a(a, dge.b);
         }

         if (!$$5 && $$9) {
            $$1 = $$1.a(c, dge.b);
         }

         return $$1;
      }
   }

   private dez b(cor $$0, dez $$1, gu $$2) {
      boolean $$3 = !$$0.a_($$2.c()).g($$0, $$2);

      for (ha $$4 : ha.c.a) {
         if (!$$1.c(f.get($$4)).a()) {
            dge $$5 = this.a($$0, $$2, $$4, $$3);
            $$1 = $$1.a(f.get($$4), $$5);
         }
      }

      return $$1;
   }

   @Override
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      if ($$1 == ha.a) {
         return $$0;
      } else if ($$1 == ha.b) {
         return this.a($$3, $$0, $$4);
      } else {
         dge $$6 = this.a($$3, $$4, $$1);
         return $$6.a() == $$0.c(f.get($$1)).a() && !o($$0) ? $$0.a(f.get($$1), $$6) : this.a($$3, this.G.a(e, $$0.c(e)).a(f.get($$1), $$6), $$4);
      }
   }

   private static boolean o(dez $$0) {
      return $$0.c(a).a() && $$0.c(c).a() && $$0.c(b).a() && $$0.c(d).a();
   }

   private static boolean p(dez $$0) {
      return !$$0.c(a).a() && !$$0.c(c).a() && !$$0.c(b).a() && !$$0.c(d).a();
   }

   @Override
   public void a(dez $$0, cpm $$1, gu $$2, int $$3, int $$4) {
      gu.a $$5 = new gu.a();

      for (ha $$6 : ha.c.a) {
         dge $$7 = $$0.c(f.get($$6));
         if ($$7 != dge.c && !$$1.a_($$5.a($$2, $$6)).a(this)) {
            $$5.c(ha.a);
            dez $$8 = $$1.a_($$5);
            if ($$8.a(this)) {
               gu $$9 = $$5.a($$6.g());
               $$1.a($$6.g(), $$1.a_($$9), $$5, $$9, $$3, $$4);
            }

            $$5.a($$2, $$6).c(ha.b);
            dez $$10 = $$1.a_($$5);
            if ($$10.a(this)) {
               gu $$11 = $$5.a($$6.g());
               $$1.a($$6.g(), $$1.a_($$11), $$5, $$11, $$3, $$4);
            }
         }
      }
   }

   private dge a(cor $$0, gu $$1, ha $$2) {
      return this.a($$0, $$1, $$2, !$$0.a_($$1.c()).g($$0, $$1));
   }

   private dge a(cor $$0, gu $$1, ha $$2, boolean $$3) {
      gu $$4 = $$1.a($$2);
      dez $$5 = $$0.a_($$4);
      if ($$3) {
         boolean $$6 = $$5.b() instanceof day || this.b($$0, $$4, $$5);
         if ($$6 && h($$0.a_($$4.c()))) {
            if ($$5.d($$0, $$4, $$2.g())) {
               return dge.a;
            }

            return dge.b;
         }
      }

      return !a($$5, $$2) && ($$5.g($$0, $$4) || !h($$0.a_($$4.d()))) ? dge.c : dge.b;
   }

   @Override
   public boolean a(dez $$0, cpo $$1, gu $$2) {
      gu $$3 = $$2.d();
      dez $$4 = $$1.a_($$3);
      return this.b($$1, $$3, $$4);
   }

   private boolean b(cor $$0, gu $$1, dez $$2) {
      return $$2.d($$0, $$1, ha.b) || $$2.a(csm.hc);
   }

   private void a(cpl $$0, gu $$1, dez $$2) {
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

   private int a(cpl $$0, gu $$1) {
      this.H = false;
      int $$2 = $$0.C($$1);
      this.H = true;
      int $$3 = 0;
      if ($$2 < 15) {
         for (ha $$4 : ha.c.a) {
            gu $$5 = $$1.a($$4);
            dez $$6 = $$0.a_($$5);
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

   private int q(dez $$0) {
      return $$0.a(this) ? $$0.c(e) : 0;
   }

   private void b(cpl $$0, gu $$1) {
      if ($$0.a_($$1).a(this)) {
         $$0.a($$1, this);

         for (ha $$2 : ha.values()) {
            $$0.a($$1.a($$2), this);
         }
      }
   }

   @Override
   public void b(dez $$0, cpl $$1, gu $$2, dez $$3, boolean $$4) {
      if (!$$3.a($$0.b()) && !$$1.B) {
         this.a($$1, $$2, $$0);

         for (ha $$5 : ha.c.b) {
            $$1.a($$2.a($$5), this);
         }

         this.c($$1, $$2);
      }
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, dez $$3, boolean $$4) {
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

   private void c(cpl $$0, gu $$1) {
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
   public void a(dez $$0, cpl $$1, gu $$2, csl $$3, gu $$4, boolean $$5) {
      if (!$$1.B) {
         if ($$0.a((cpo)$$1, $$2)) {
            this.a($$1, $$2, $$0);
         } else {
            c($$0, $$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   public int b(dez $$0, cor $$1, gu $$2, ha $$3) {
      return !this.H ? 0 : $$0.b($$1, $$2, $$3);
   }

   @Override
   public int a(dez $$0, cor $$1, gu $$2, ha $$3) {
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

   protected static boolean h(dez $$0) {
      return a($$0, null);
   }

   protected static boolean a(dez $$0, @Nullable ha $$1) {
      if ($$0.a(csm.cw)) {
         return true;
      } else if ($$0.a(csm.ei)) {
         ha $$2 = $$0.c(cyr.aC);
         return $$2 == $$1 || $$2.g() == $$1;
      } else {
         return $$0.a(csm.kO) ? $$1 == $$0.c(cxu.a) : $$0.m() && $$1 != null;
      }
   }

   @Override
   public boolean f_(dez $$0) {
      return this.H;
   }

   public static int b(int $$0) {
      ehd $$1 = E[$$0];
      return arp.f((float)$$1.a(), (float)$$1.b(), (float)$$1.c());
   }

   private void a(cpl $$0, aru $$1, gu $$2, ehd $$3, ha $$4, ha $$5, float $$6, float $$7) {
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
   public void a(dez $$0, cpl $$1, gu $$2, aru $$3) {
      int $$4 = $$0.c(e);
      if ($$4 != 0) {
         for (ha $$5 : ha.c.a) {
            dge $$6 = $$0.c(f.get($$5));
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
   public dez a(dez $$0, cyx $$1) {
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
   public dez a(dez $$0, cxg $$1) {
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
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(a, b, c, d, e);
   }

   @Override
   public bgq a(dez $$0, cpl $$1, gu $$2, cbm $$3, bgp $$4, egz $$5) {
      if (!$$3.fR().e) {
         return bgq.d;
      } else {
         if (o($$0) || p($$0)) {
            dez $$6 = o($$0) ? this.n() : this.G;
            $$6 = $$6.a(e, $$0.c(e));
            $$6 = this.a($$1, $$6, $$2);
            if ($$6 != $$0) {
               $$1.a($$2, $$6, 3);
               this.a($$1, $$2, $$0, $$6);
               return bgq.a;
            }
         }

         return bgq.d;
      }
   }

   private void a(cpl $$0, gu $$1, dez $$2, dez $$3) {
      for (ha $$4 : ha.c.a) {
         gu $$5 = $$1.a($$4);
         if ($$2.c(f.get($$4)).a() != $$3.c(f.get($$4)).a() && $$0.a_($$5).g($$0, $$5)) {
            $$0.a($$5, $$3.b(), $$4.g());
         }
      }
   }
}
