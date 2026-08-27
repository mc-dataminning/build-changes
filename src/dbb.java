import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class dbb extends cva {
   public static final MapCodec<dbb> a = b(dbb::new);
   public static final dig<din> b = dhy.ab;
   public static final dig<din> c = dhy.aa;
   public static final dig<din> d = dhy.ac;
   public static final dig<din> e = dhy.ad;
   public static final dii f = dhy.aT;
   public static final Map<hx, dig<din>> g = Maps.newEnumMap(ImmutableMap.of(hx.c, b, hx.f, c, hx.d, d, hx.e, e));
   protected static final int h = 1;
   protected static final int i = 3;
   protected static final int j = 13;
   protected static final int k = 3;
   protected static final int l = 13;
   private static final ekn m = cva.a(3.0, 0.0, 3.0, 13.0, 1.0, 13.0);
   private static final Map<hx, ekn> n = Maps.newEnumMap(
      ImmutableMap.of(
         hx.c,
         cva.a(3.0, 0.0, 0.0, 13.0, 1.0, 13.0),
         hx.d,
         cva.a(3.0, 0.0, 3.0, 13.0, 1.0, 16.0),
         hx.f,
         cva.a(3.0, 0.0, 3.0, 16.0, 1.0, 13.0),
         hx.e,
         cva.a(0.0, 0.0, 3.0, 13.0, 1.0, 13.0)
      )
   );
   private static final Map<hx, ekn> o = Maps.newEnumMap(
      ImmutableMap.of(
         hx.c,
         ekk.a(n.get(hx.c), cva.a(3.0, 0.0, 0.0, 13.0, 16.0, 1.0)),
         hx.d,
         ekk.a(n.get(hx.d), cva.a(3.0, 0.0, 15.0, 13.0, 16.0, 16.0)),
         hx.f,
         ekk.a(n.get(hx.f), cva.a(15.0, 0.0, 3.0, 16.0, 16.0, 13.0)),
         hx.e,
         ekk.a(n.get(hx.e), cva.a(0.0, 0.0, 3.0, 1.0, 16.0, 13.0))
      )
   );
   private static final Map<dhi, ekn> F = Maps.newHashMap();
   private static final eju[] G = ac.a(new eju[16], $$0 -> {
      for (int $$1 = 0; $$1 <= 15; $$1++) {
         float $$2 = (float)$$1 / 15.0F;
         float $$3 = $$2 * 0.6F + ($$2 > 0.0F ? 0.4F : 0.3F);
         float $$4 = atm.a($$2 * $$2 * 0.7F - 0.5F, 0.0F, 1.0F);
         float $$5 = atm.a($$2 * $$2 * 0.6F - 0.7F, 0.0F, 1.0F);
         $$0[$$1] = new eju((double)$$3, (double)$$4, (double)$$5);
      }
   });
   private static final float H = 0.2F;
   private final dhi I;
   private boolean J = true;

   @Override
   public MapCodec<dbb> a() {
      return a;
   }

   public dbb(dhh.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, din.c).a(c, din.c).a(d, din.c).a(e, din.c).a(f, Integer.valueOf(0)));
      this.I = this.o().a(b, din.b).a(c, din.b).a(d, din.b).a(e, din.b);
      UnmodifiableIterator var2 = this.n().a().iterator();

      while (var2.hasNext()) {
         dhi $$1 = (dhi)var2.next();
         if ($$1.c(f) == 0) {
            F.put($$1, this.n($$1));
         }
      }
   }

   private ekn n(dhi $$0) {
      ekn $$1 = m;

      for (hx $$2 : hx.c.a) {
         din $$3 = $$0.c(g.get($$2));
         if ($$3 == din.b) {
            $$1 = ekk.a($$1, n.get($$2));
         } else if ($$3 == din.a) {
            $$1 = ekk.a($$1, o.get($$2));
         }
      }

      return $$1;
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return F.get($$0.a(f, Integer.valueOf(0)));
   }

   @Override
   public dhi a(cnr $$0) {
      return this.a($$0.q(), this.I, $$0.a());
   }

   private dhi a(crg $$0, dhi $$1, ht $$2) {
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
            $$1 = $$1.a(e, din.b);
         }

         if (!$$6 && $$8) {
            $$1 = $$1.a(c, din.b);
         }

         if (!$$4 && $$9) {
            $$1 = $$1.a(b, din.b);
         }

         if (!$$5 && $$9) {
            $$1 = $$1.a(d, din.b);
         }

         return $$1;
      }
   }

   private dhi b(crg $$0, dhi $$1, ht $$2) {
      boolean $$3 = !$$0.a_($$2.c()).g($$0, $$2);

      for (hx $$4 : hx.c.a) {
         if (!$$1.c(g.get($$4)).a()) {
            din $$5 = this.a($$0, $$2, $$4, $$3);
            $$1 = $$1.a(g.get($$4), $$5);
         }
      }

      return $$1;
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      if ($$1 == hx.a) {
         return !this.a($$3, $$5, $$2) ? cvc.a.o() : $$0;
      } else if ($$1 == hx.b) {
         return this.a($$3, $$0, $$4);
      } else {
         din $$6 = this.a($$3, $$4, $$1);
         return $$6.a() == $$0.c(g.get($$1)).a() && !o($$0) ? $$0.a(g.get($$1), $$6) : this.a($$3, this.I.a(f, $$0.c(f)).a(g.get($$1), $$6), $$4);
      }
   }

   private static boolean o(dhi $$0) {
      return $$0.c(b).a() && $$0.c(d).a() && $$0.c(c).a() && $$0.c(e).a();
   }

   private static boolean p(dhi $$0) {
      return !$$0.c(b).a() && !$$0.c(d).a() && !$$0.c(c).a() && !$$0.c(e).a();
   }

   @Override
   public void a(dhi $$0, csb $$1, ht $$2, int $$3, int $$4) {
      ht.a $$5 = new ht.a();

      for (hx $$6 : hx.c.a) {
         din $$7 = $$0.c(g.get($$6));
         if ($$7 != din.c && !$$1.a_($$5.a($$2, $$6)).a(this)) {
            $$5.c(hx.a);
            dhi $$8 = $$1.a_($$5);
            if ($$8.a(this)) {
               ht $$9 = $$5.a($$6.g());
               $$1.a($$6.g(), $$1.a_($$9), $$5, $$9, $$3, $$4);
            }

            $$5.a($$2, $$6).c(hx.b);
            dhi $$10 = $$1.a_($$5);
            if ($$10.a(this)) {
               ht $$11 = $$5.a($$6.g());
               $$1.a($$6.g(), $$1.a_($$11), $$5, $$11, $$3, $$4);
            }
         }
      }
   }

   private din a(crg $$0, ht $$1, hx $$2) {
      return this.a($$0, $$1, $$2, !$$0.a_($$1.c()).g($$0, $$1));
   }

   private din a(crg $$0, ht $$1, hx $$2, boolean $$3) {
      ht $$4 = $$1.a($$2);
      dhi $$5 = $$0.a_($$4);
      if ($$3) {
         boolean $$6 = $$5.b() instanceof ddm || this.a($$0, $$4, $$5);
         if ($$6 && h($$0.a_($$4.c()))) {
            if ($$5.d($$0, $$4, $$2.g())) {
               return din.a;
            }

            return din.b;
         }
      }

      return !a($$5, $$2) && ($$5.g($$0, $$4) || !h($$0.a_($$4.d()))) ? din.c : din.b;
   }

   @Override
   public boolean a(dhi $$0, csd $$1, ht $$2) {
      ht $$3 = $$2.d();
      dhi $$4 = $$1.a_($$3);
      return this.a($$1, $$3, $$4);
   }

   private boolean a(crg $$0, ht $$1, dhi $$2) {
      return $$2.d($$0, $$1, hx.b) || $$2.a(cvc.hc);
   }

   private void a(csa $$0, ht $$1, dhi $$2) {
      int $$3 = this.a($$0, $$1);
      if ($$2.c(f) != $$3) {
         if ($$0.a_($$1) == $$2) {
            $$0.a($$1, $$2.a(f, Integer.valueOf($$3)), 2);
         }

         Set<ht> $$4 = Sets.newHashSet();
         $$4.add($$1);

         for (hx $$5 : hx.values()) {
            $$4.add($$1.a($$5));
         }

         for (ht $$6 : $$4) {
            $$0.a($$6, this);
         }
      }
   }

   private int a(csa $$0, ht $$1) {
      this.J = false;
      int $$2 = $$0.C($$1);
      this.J = true;
      int $$3 = 0;
      if ($$2 < 15) {
         for (hx $$4 : hx.c.a) {
            ht $$5 = $$1.a($$4);
            dhi $$6 = $$0.a_($$5);
            $$3 = Math.max($$3, this.q($$6));
            ht $$7 = $$1.c();
            if ($$6.g($$0, $$5) && !$$0.a_($$7).g($$0, $$7)) {
               $$3 = Math.max($$3, this.q($$0.a_($$5.c())));
            } else if (!$$6.g($$0, $$5)) {
               $$3 = Math.max($$3, this.q($$0.a_($$5.d())));
            }
         }
      }

      return Math.max($$2, $$3 - 1);
   }

   private int q(dhi $$0) {
      return $$0.a(this) ? $$0.c(f) : 0;
   }

   private void b(csa $$0, ht $$1) {
      if ($$0.a_($$1).a(this)) {
         $$0.a($$1, this);

         for (hx $$2 : hx.values()) {
            $$0.a($$1.a($$2), this);
         }
      }
   }

   @Override
   public void b(dhi $$0, csa $$1, ht $$2, dhi $$3, boolean $$4) {
      if (!$$3.a($$0.b()) && !$$1.B) {
         this.a($$1, $$2, $$0);

         for (hx $$5 : hx.c.b) {
            $$1.a($$2.a($$5), this);
         }

         this.c($$1, $$2);
      }
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, dhi $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         if (!$$1.B) {
            for (hx $$5 : hx.values()) {
               $$1.a($$2.a($$5), this);
            }

            this.a($$1, $$2, $$0);
            this.c($$1, $$2);
         }
      }
   }

   private void c(csa $$0, ht $$1) {
      for (hx $$2 : hx.c.a) {
         this.b($$0, $$1.a($$2));
      }

      for (hx $$3 : hx.c.a) {
         ht $$4 = $$1.a($$3);
         if ($$0.a_($$4).g($$0, $$4)) {
            this.b($$0, $$4.c());
         } else {
            this.b($$0, $$4.d());
         }
      }
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, cva $$3, ht $$4, boolean $$5) {
      if (!$$1.B) {
         if ($$0.a((csd)$$1, $$2)) {
            this.a($$1, $$2, $$0);
         } else {
            c($$0, $$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   public int b(dhi $$0, crg $$1, ht $$2, hx $$3) {
      return !this.J ? 0 : $$0.b($$1, $$2, $$3);
   }

   @Override
   public int a(dhi $$0, crg $$1, ht $$2, hx $$3) {
      if (this.J && $$3 != hx.a) {
         int $$4 = $$0.c(f);
         if ($$4 == 0) {
            return 0;
         } else {
            return $$3 != hx.b && !this.a($$1, $$0, $$2).c(g.get($$3.g())).a() ? 0 : $$4;
         }
      } else {
         return 0;
      }
   }

   protected static boolean h(dhi $$0) {
      return a($$0, null);
   }

   protected static boolean a(dhi $$0, @Nullable hx $$1) {
      if ($$0.a(cvc.cw)) {
         return true;
      } else if ($$0.a(cvc.eh)) {
         hx $$2 = $$0.c(dbg.aE);
         return $$2 == $$1 || $$2.g() == $$1;
      } else {
         return $$0.a(cvc.kO) ? $$1 == $$0.c(dak.a) : $$0.m() && $$1 != null;
      }
   }

   @Override
   public boolean f_(dhi $$0) {
      return this.J;
   }

   public static int b(int $$0) {
      eju $$1 = G[$$0];
      return atm.f((float)$$1.a(), (float)$$1.b(), (float)$$1.c());
   }

   private void a(csa $$0, ats $$1, ht $$2, eju $$3, hx $$4, hx $$5, float $$6, float $$7) {
      float $$8 = $$7 - $$6;
      if (!($$1.i() >= 0.2F * $$8)) {
         float $$9 = 0.4375F;
         float $$10 = $$6 + $$8 * $$1.i();
         double $$11 = 0.5 + (double)(0.4375F * (float)$$4.j()) + (double)($$10 * (float)$$5.j());
         double $$12 = 0.5 + (double)(0.4375F * (float)$$4.k()) + (double)($$10 * (float)$$5.k());
         double $$13 = 0.5 + (double)(0.4375F * (float)$$4.l()) + (double)($$10 * (float)$$5.l());
         $$0.a(new jm($$3.j(), 1.0F), (double)$$2.u() + $$11, (double)$$2.v() + $$12, (double)$$2.w() + $$13, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, ats $$3) {
      int $$4 = $$0.c(f);
      if ($$4 != 0) {
         for (hx $$5 : hx.c.a) {
            din $$6 = $$0.c(g.get($$5));
            switch ($$6) {
               case a:
                  this.a($$1, $$3, $$2, G[$$4], $$5, hx.b, -0.5F, 0.5F);
               case b:
                  this.a($$1, $$3, $$2, G[$$4], hx.a, $$5, 0.0F, 0.5F);
                  break;
               case c:
               default:
                  this.a($$1, $$3, $$2, G[$$4], hx.a, $$5, 0.0F, 0.3F);
            }
         }
      }
   }

   @Override
   public dhi a(dhi $$0, dbm $$1) {
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
   public dhi a(dhi $$0, czw $$1) {
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
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   public bix a(dhi $$0, csa $$1, ht $$2, cdu $$3, biw $$4, ejq $$5) {
      if (!$$3.fU().e) {
         return bix.d;
      } else {
         if (o($$0) || p($$0)) {
            dhi $$6 = o($$0) ? this.o() : this.I;
            $$6 = $$6.a(f, $$0.c(f));
            $$6 = this.a($$1, $$6, $$2);
            if ($$6 != $$0) {
               $$1.a($$2, $$6, 3);
               this.a($$1, $$2, $$0, $$6);
               return bix.a;
            }
         }

         return bix.d;
      }
   }

   private void a(csa $$0, ht $$1, dhi $$2, dhi $$3) {
      for (hx $$4 : hx.c.a) {
         ht $$5 = $$1.a($$4);
         if ($$2.c(g.get($$4)).a() != $$3.c(g.get($$4)).a() && $$0.a_($$5).g($$0, $$5)) {
            $$0.a($$5, $$3.b(), $$4.g());
         }
      }
   }
}
