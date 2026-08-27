import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class dgd extends dac {
   public static final MapCodec<dgd> a = b(dgd::new);
   public static final dnz<dog> b = dnr.ab;
   public static final dnz<dog> c = dnr.aa;
   public static final dnz<dog> d = dnr.ac;
   public static final dnz<dog> e = dnr.ad;
   public static final dob f = dnr.aT;
   public static final Map<ih, dnz<dog>> g = Maps.newEnumMap(ImmutableMap.of(ih.c, b, ih.f, c, ih.d, d, ih.e, e));
   protected static final int h = 1;
   protected static final int i = 3;
   protected static final int j = 13;
   protected static final int k = 3;
   protected static final int l = 13;
   private static final eqm m = dac.a(3.0, 0.0, 3.0, 13.0, 1.0, 13.0);
   private static final Map<ih, eqm> n = Maps.newEnumMap(
      ImmutableMap.of(
         ih.c,
         dac.a(3.0, 0.0, 0.0, 13.0, 1.0, 13.0),
         ih.d,
         dac.a(3.0, 0.0, 3.0, 13.0, 1.0, 16.0),
         ih.f,
         dac.a(3.0, 0.0, 3.0, 16.0, 1.0, 13.0),
         ih.e,
         dac.a(0.0, 0.0, 3.0, 13.0, 1.0, 13.0)
      )
   );
   private static final Map<ih, eqm> o = Maps.newEnumMap(
      ImmutableMap.of(
         ih.c,
         eqj.a(n.get(ih.c), dac.a(3.0, 0.0, 0.0, 13.0, 16.0, 1.0)),
         ih.d,
         eqj.a(n.get(ih.d), dac.a(3.0, 0.0, 15.0, 13.0, 16.0, 16.0)),
         ih.f,
         eqj.a(n.get(ih.f), dac.a(15.0, 0.0, 3.0, 16.0, 16.0, 13.0)),
         ih.e,
         eqj.a(n.get(ih.e), dac.a(0.0, 0.0, 3.0, 1.0, 16.0, 13.0))
      )
   );
   private static final Map<dnb, eqm> F = Maps.newHashMap();
   private static final ept[] G = ac.a(new ept[16], $$0 -> {
      for (int $$1 = 0; $$1 <= 15; $$1++) {
         float $$2 = (float)$$1 / 15.0F;
         float $$3 = $$2 * 0.6F + ($$2 > 0.0F ? 0.4F : 0.3F);
         float $$4 = aww.a($$2 * $$2 * 0.7F - 0.5F, 0.0F, 1.0F);
         float $$5 = aww.a($$2 * $$2 * 0.6F - 0.7F, 0.0F, 1.0F);
         $$0[$$1] = new ept((double)$$3, (double)$$4, (double)$$5);
      }
   });
   private static final float H = 0.2F;
   private final dnb I;
   private boolean J = true;

   @Override
   public MapCodec<dgd> a() {
      return a;
   }

   public dgd(dna.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dog.c).a(c, dog.c).a(d, dog.c).a(e, dog.c).a(f, Integer.valueOf(0)));
      this.I = this.o().a(b, dog.b).a(c, dog.b).a(d, dog.b).a(e, dog.b);
      UnmodifiableIterator var2 = this.n().a().iterator();

      while (var2.hasNext()) {
         dnb $$1 = (dnb)var2.next();
         if ($$1.c(f) == 0) {
            F.put($$1, this.n($$1));
         }
      }
   }

   private eqm n(dnb $$0) {
      eqm $$1 = m;

      for (ih $$2 : ih.c.a) {
         dog $$3 = $$0.c(g.get($$2));
         if ($$3 == dog.b) {
            $$1 = eqj.a($$1, n.get($$2));
         } else if ($$3 == dog.a) {
            $$1 = eqj.a($$1, o.get($$2));
         }
      }

      return $$1;
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return F.get($$0.a(f, Integer.valueOf(0)));
   }

   @Override
   public dnb a(csu $$0) {
      return this.a($$0.q(), this.I, $$0.a());
   }

   private dnb a(cwh $$0, dnb $$1, ib $$2) {
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
            $$1 = $$1.a(e, dog.b);
         }

         if (!$$6 && $$8) {
            $$1 = $$1.a(c, dog.b);
         }

         if (!$$4 && $$9) {
            $$1 = $$1.a(b, dog.b);
         }

         if (!$$5 && $$9) {
            $$1 = $$1.a(d, dog.b);
         }

         return $$1;
      }
   }

   private dnb b(cwh $$0, dnb $$1, ib $$2) {
      boolean $$3 = !$$0.a_($$2.c()).g($$0, $$2);

      for (ih $$4 : ih.c.a) {
         if (!$$1.c(g.get($$4)).a()) {
            dog $$5 = this.a($$0, $$2, $$4, $$3);
            $$1 = $$1.a(g.get($$4), $$5);
         }
      }

      return $$1;
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      if ($$1 == ih.a) {
         return !this.a($$3, $$5, $$2) ? dae.a.o() : $$0;
      } else if ($$1 == ih.b) {
         return this.a($$3, $$0, $$4);
      } else {
         dog $$6 = this.a($$3, $$4, $$1);
         return $$6.a() == $$0.c(g.get($$1)).a() && !o($$0) ? $$0.a(g.get($$1), $$6) : this.a($$3, this.I.a(f, $$0.c(f)).a(g.get($$1), $$6), $$4);
      }
   }

   private static boolean o(dnb $$0) {
      return $$0.c(b).a() && $$0.c(d).a() && $$0.c(c).a() && $$0.c(e).a();
   }

   private static boolean p(dnb $$0) {
      return !$$0.c(b).a() && !$$0.c(d).a() && !$$0.c(c).a() && !$$0.c(e).a();
   }

   @Override
   protected void a(dnb $$0, cxc $$1, ib $$2, int $$3, int $$4) {
      ib.a $$5 = new ib.a();

      for (ih $$6 : ih.c.a) {
         dog $$7 = $$0.c(g.get($$6));
         if ($$7 != dog.c && !$$1.a_($$5.a($$2, $$6)).a(this)) {
            $$5.c(ih.a);
            dnb $$8 = $$1.a_($$5);
            if ($$8.a(this)) {
               ib $$9 = $$5.a($$6.g());
               $$1.a($$6.g(), $$1.a_($$9), $$5, $$9, $$3, $$4);
            }

            $$5.a($$2, $$6).c(ih.b);
            dnb $$10 = $$1.a_($$5);
            if ($$10.a(this)) {
               ib $$11 = $$5.a($$6.g());
               $$1.a($$6.g(), $$1.a_($$11), $$5, $$11, $$3, $$4);
            }
         }
      }
   }

   private dog a(cwh $$0, ib $$1, ih $$2) {
      return this.a($$0, $$1, $$2, !$$0.a_($$1.c()).g($$0, $$1));
   }

   private dog a(cwh $$0, ib $$1, ih $$2, boolean $$3) {
      ib $$4 = $$1.a($$2);
      dnb $$5 = $$0.a_($$4);
      if ($$3) {
         boolean $$6 = $$5.b() instanceof dio || this.a($$0, $$4, $$5);
         if ($$6 && m($$0.a_($$4.c()))) {
            if ($$5.d($$0, $$4, $$2.g())) {
               return dog.a;
            }

            return dog.b;
         }
      }

      return !a($$5, $$2) && ($$5.g($$0, $$4) || !m($$0.a_($$4.d()))) ? dog.c : dog.b;
   }

   @Override
   protected boolean a(dnb $$0, cxe $$1, ib $$2) {
      ib $$3 = $$2.d();
      dnb $$4 = $$1.a_($$3);
      return this.a($$1, $$3, $$4);
   }

   private boolean a(cwh $$0, ib $$1, dnb $$2) {
      return $$2.d($$0, $$1, ih.b) || $$2.a(dae.hc);
   }

   private void a(cxb $$0, ib $$1, dnb $$2) {
      int $$3 = this.a($$0, $$1);
      if ($$2.c(f) != $$3) {
         if ($$0.a_($$1) == $$2) {
            $$0.a($$1, $$2.a(f, Integer.valueOf($$3)), 2);
         }

         Set<ib> $$4 = Sets.newHashSet();
         $$4.add($$1);

         for (ih $$5 : ih.values()) {
            $$4.add($$1.a($$5));
         }

         for (ib $$6 : $$4) {
            $$0.a($$6, this);
         }
      }
   }

   private int a(cxb $$0, ib $$1) {
      this.J = false;
      int $$2 = $$0.D($$1);
      this.J = true;
      int $$3 = 0;
      if ($$2 < 15) {
         for (ih $$4 : ih.c.a) {
            ib $$5 = $$1.a($$4);
            dnb $$6 = $$0.a_($$5);
            $$3 = Math.max($$3, this.q($$6));
            ib $$7 = $$1.c();
            if ($$6.g($$0, $$5) && !$$0.a_($$7).g($$0, $$7)) {
               $$3 = Math.max($$3, this.q($$0.a_($$5.c())));
            } else if (!$$6.g($$0, $$5)) {
               $$3 = Math.max($$3, this.q($$0.a_($$5.d())));
            }
         }
      }

      return Math.max($$2, $$3 - 1);
   }

   private int q(dnb $$0) {
      return $$0.a(this) ? $$0.c(f) : 0;
   }

   private void b(cxb $$0, ib $$1) {
      if ($$0.a_($$1).a(this)) {
         $$0.a($$1, this);

         for (ih $$2 : ih.values()) {
            $$0.a($$1.a($$2), this);
         }
      }
   }

   @Override
   protected void b(dnb $$0, cxb $$1, ib $$2, dnb $$3, boolean $$4) {
      if (!$$3.a($$0.b()) && !$$1.B) {
         this.a($$1, $$2, $$0);

         for (ih $$5 : ih.c.b) {
            $$1.a($$2.a($$5), this);
         }

         this.c($$1, $$2);
      }
   }

   @Override
   protected void a(dnb $$0, cxb $$1, ib $$2, dnb $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         if (!$$1.B) {
            for (ih $$5 : ih.values()) {
               $$1.a($$2.a($$5), this);
            }

            this.a($$1, $$2, $$0);
            this.c($$1, $$2);
         }
      }
   }

   private void c(cxb $$0, ib $$1) {
      for (ih $$2 : ih.c.a) {
         this.b($$0, $$1.a($$2));
      }

      for (ih $$3 : ih.c.a) {
         ib $$4 = $$1.a($$3);
         if ($$0.a_($$4).g($$0, $$4)) {
            this.b($$0, $$4.c());
         } else {
            this.b($$0, $$4.d());
         }
      }
   }

   @Override
   protected void a(dnb $$0, cxb $$1, ib $$2, dac $$3, ib $$4, boolean $$5) {
      if (!$$1.B) {
         if ($$0.a((cxe)$$1, $$2)) {
            this.a($$1, $$2, $$0);
         } else {
            c($$0, $$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   protected int b(dnb $$0, cwh $$1, ib $$2, ih $$3) {
      return !this.J ? 0 : $$0.b($$1, $$2, $$3);
   }

   @Override
   protected int a(dnb $$0, cwh $$1, ib $$2, ih $$3) {
      if (this.J && $$3 != ih.a) {
         int $$4 = $$0.c(f);
         if ($$4 == 0) {
            return 0;
         } else {
            return $$3 != ih.b && !this.a($$1, $$0, $$2).c(g.get($$3.g())).a() ? 0 : $$4;
         }
      } else {
         return 0;
      }
   }

   protected static boolean m(dnb $$0) {
      return a($$0, null);
   }

   protected static boolean a(dnb $$0, @Nullable ih $$1) {
      if ($$0.a(dae.cw)) {
         return true;
      } else if ($$0.a(dae.eh)) {
         ih $$2 = $$0.c(dgi.aE);
         return $$2 == $$1 || $$2.g() == $$1;
      } else {
         return $$0.a(dae.kO) ? $$1 == $$0.c(dfm.a) : $$0.m() && $$1 != null;
      }
   }

   @Override
   protected boolean f_(dnb $$0) {
      return this.J;
   }

   public static int b(int $$0) {
      ept $$1 = G[$$0];
      return aww.f((float)$$1.a(), (float)$$1.b(), (float)$$1.c());
   }

   private void a(cxb $$0, axd $$1, ib $$2, ept $$3, ih $$4, ih $$5, float $$6, float $$7) {
      float $$8 = $$7 - $$6;
      if (!($$1.i() >= 0.2F * $$8)) {
         float $$9 = 0.4375F;
         float $$10 = $$6 + $$8 * $$1.i();
         double $$11 = 0.5 + (double)(0.4375F * (float)$$4.j()) + (double)($$10 * (float)$$5.j());
         double $$12 = 0.5 + (double)(0.4375F * (float)$$4.k()) + (double)($$10 * (float)$$5.k());
         double $$13 = 0.5 + (double)(0.4375F * (float)$$4.l()) + (double)($$10 * (float)$$5.l());
         $$0.a(new jw($$3.j(), 1.0F), (double)$$2.u() + $$11, (double)$$2.v() + $$12, (double)$$2.w() + $$13, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void a(dnb $$0, cxb $$1, ib $$2, axd $$3) {
      int $$4 = $$0.c(f);
      if ($$4 != 0) {
         for (ih $$5 : ih.c.a) {
            dog $$6 = $$0.c(g.get($$5));
            switch ($$6) {
               case a:
                  this.a($$1, $$3, $$2, G[$$4], $$5, ih.b, -0.5F, 0.5F);
               case b:
                  this.a($$1, $$3, $$2, G[$$4], ih.a, $$5, 0.0F, 0.5F);
                  break;
               case c:
               default:
                  this.a($$1, $$3, $$2, G[$$4], ih.a, $$5, 0.0F, 0.3F);
            }
         }
      }
   }

   @Override
   protected dnb a(dnb $$0, dgo $$1) {
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
   protected dnb a(dnb $$0, dey $$1) {
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
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected bnd a(dnb $$0, cxb $$1, ib $$2, ciu $$3, epp $$4) {
      if (!$$3.ga().e) {
         return bnd.d;
      } else {
         if (o($$0) || p($$0)) {
            dnb $$5 = o($$0) ? this.o() : this.I;
            $$5 = $$5.a(f, $$0.c(f));
            $$5 = this.a($$1, $$5, $$2);
            if ($$5 != $$0) {
               $$1.a($$2, $$5, 3);
               this.a($$1, $$2, $$0, $$5);
               return bnd.a;
            }
         }

         return bnd.d;
      }
   }

   private void a(cxb $$0, ib $$1, dnb $$2, dnb $$3) {
      for (ih $$4 : ih.c.a) {
         ib $$5 = $$1.a($$4);
         if ($$2.c(g.get($$4)).a() != $$3.c(g.get($$4)).a() && $$0.a_($$5).g($$0, $$5)) {
            $$0.a($$5, $$3.b(), $$4.g());
         }
      }
   }
}
