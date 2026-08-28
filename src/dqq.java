import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class dqq extends dkl {
   public static final MapCodec<dqq> a = b(dqq::new);
   public static final dyr<dyy> b = dyk.ac;
   public static final dyr<dyy> c = dyk.ab;
   public static final dyr<dyy> d = dyk.ad;
   public static final dyr<dyy> e = dyk.ae;
   public static final dyt f = dyk.aU;
   public static final Map<jm, dyr<dyy>> g = Maps.newEnumMap(ImmutableMap.of(jm.c, b, jm.f, c, jm.d, d, jm.e, e));
   protected static final int h = 1;
   protected static final int i = 3;
   protected static final int j = 13;
   protected static final int k = 3;
   protected static final int l = 13;
   private static final fcr m = dkl.a(3.0, 0.0, 3.0, 13.0, 1.0, 13.0);
   private static final Map<jm, fcr> n = Maps.newEnumMap(
      ImmutableMap.of(
         jm.c,
         dkl.a(3.0, 0.0, 0.0, 13.0, 1.0, 13.0),
         jm.d,
         dkl.a(3.0, 0.0, 3.0, 13.0, 1.0, 16.0),
         jm.f,
         dkl.a(3.0, 0.0, 3.0, 16.0, 1.0, 13.0),
         jm.e,
         dkl.a(0.0, 0.0, 3.0, 13.0, 1.0, 13.0)
      )
   );
   private static final Map<jm, fcr> o = Maps.newEnumMap(
      ImmutableMap.of(
         jm.c,
         fco.a(n.get(jm.c), dkl.a(3.0, 0.0, 0.0, 13.0, 16.0, 1.0)),
         jm.d,
         fco.a(n.get(jm.d), dkl.a(3.0, 0.0, 15.0, 13.0, 16.0, 16.0)),
         jm.f,
         fco.a(n.get(jm.f), dkl.a(15.0, 0.0, 3.0, 16.0, 16.0, 13.0)),
         jm.e,
         fco.a(n.get(jm.e), dkl.a(0.0, 0.0, 3.0, 1.0, 16.0, 13.0))
      )
   );
   private static final Map<dxu, fcr> G = Maps.newHashMap();
   private static final int[] H = ae.a(new int[16], $$0 -> {
      for (int $$1 = 0; $$1 <= 15; $$1++) {
         float $$2 = (float)$$1 / 15.0F;
         float $$3 = $$2 * 0.6F + ($$2 > 0.0F ? 0.4F : 0.3F);
         float $$4 = bae.a($$2 * $$2 * 0.7F - 0.5F, 0.0F, 1.0F);
         float $$5 = bae.a($$2 * $$2 * 0.6F - 0.7F, 0.0F, 1.0F);
         $$0[$$1] = ayp.a(1.0F, $$3, $$4, $$5);
      }
   });
   private static final float I = 0.2F;
   private final dxu J;
   private final evg K = new euz(this);
   private boolean L = true;

   @Override
   public MapCodec<dqq> a() {
      return a;
   }

   public dqq(dxt.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dyy.c).b(c, dyy.c).b(d, dyy.c).b(e, dyy.c).b(f, Integer.valueOf(0)));
      this.J = this.m().b(b, dyy.b).b(c, dyy.b).b(d, dyy.b).b(e, dyy.b);
      UnmodifiableIterator var2 = this.l().a().iterator();

      while (var2.hasNext()) {
         dxu $$1 = (dxu)var2.next();
         if ($$1.c(f) == 0) {
            G.put($$1, this.q($$1));
         }
      }
   }

   private fcr q(dxu $$0) {
      fcr $$1 = m;

      for (jm $$2 : jm.c.a) {
         dyy $$3 = $$0.c(g.get($$2));
         if ($$3 == dyy.b) {
            $$1 = fco.a($$1, n.get($$2));
         } else if ($$3 == dyy.a) {
            $$1 = fco.a($$1, o.get($$2));
         }
      }

      return $$1;
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return G.get($$0.b(f, Integer.valueOf(0)));
   }

   @Override
   public dxu a(dbf $$0) {
      return this.a($$0.q(), this.J, $$0.a());
   }

   private dxu a(dgm $$0, dxu $$1, jh $$2) {
      boolean $$3 = s($$1);
      $$1 = this.b($$0, this.m().b(f, $$1.c(f)), $$2);
      if ($$3 && s($$1)) {
         return $$1;
      } else {
         boolean $$4 = $$1.c(b).a();
         boolean $$5 = $$1.c(d).a();
         boolean $$6 = $$1.c(c).a();
         boolean $$7 = $$1.c(e).a();
         boolean $$8 = !$$4 && !$$5;
         boolean $$9 = !$$6 && !$$7;
         if (!$$7 && $$8) {
            $$1 = $$1.b(e, dyy.b);
         }

         if (!$$6 && $$8) {
            $$1 = $$1.b(c, dyy.b);
         }

         if (!$$4 && $$9) {
            $$1 = $$1.b(b, dyy.b);
         }

         if (!$$5 && $$9) {
            $$1 = $$1.b(d, dyy.b);
         }

         return $$1;
      }
   }

   private dxu b(dgm $$0, dxu $$1, jh $$2) {
      boolean $$3 = !$$0.a_($$2.d()).d($$0, $$2);

      for (jm $$4 : jm.c.a) {
         if (!$$1.c(g.get($$4)).a()) {
            dyy $$5 = this.a($$0, $$2, $$4, $$3);
            $$1 = $$1.b(g.get($$4), $$5);
         }
      }

      return $$1;
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      if ($$4 == jm.a) {
         return !this.a($$1, $$5, $$6) ? dkn.a.m() : $$0;
      } else if ($$4 == jm.b) {
         return this.a($$1, $$0, $$3);
      } else {
         dyy $$8 = this.a($$1, $$3, $$4);
         return $$8.a() == $$0.c(g.get($$4)).a() && !r($$0) ? $$0.b(g.get($$4), $$8) : this.a($$1, this.J.b(f, $$0.c(f)).b(g.get($$4), $$8), $$3);
      }
   }

   private static boolean r(dxu $$0) {
      return $$0.c(b).a() && $$0.c(d).a() && $$0.c(c).a() && $$0.c(e).a();
   }

   private static boolean s(dxu $$0) {
      return !$$0.c(b).a() && !$$0.c(d).a() && !$$0.c(c).a() && !$$0.c(e).a();
   }

   @Override
   protected void a(dxu $$0, dhi $$1, jh $$2, int $$3, int $$4) {
      jh.a $$5 = new jh.a();

      for (jm $$6 : jm.c.a) {
         dyy $$7 = $$0.c(g.get($$6));
         if ($$7 != dyy.c && !$$1.a_($$5.a($$2, $$6)).a(this)) {
            $$5.c(jm.a);
            dxu $$8 = $$1.a_($$5);
            if ($$8.a(this)) {
               jh $$9 = $$5.a($$6.g());
               $$1.a($$6.g(), $$5, $$9, $$1.a_($$9), $$3, $$4);
            }

            $$5.a($$2, $$6).c(jm.b);
            dxu $$10 = $$1.a_($$5);
            if ($$10.a(this)) {
               jh $$11 = $$5.a($$6.g());
               $$1.a($$6.g(), $$5, $$11, $$1.a_($$11), $$3, $$4);
            }
         }
      }
   }

   private dyy a(dgm $$0, jh $$1, jm $$2) {
      return this.a($$0, $$1, $$2, !$$0.a_($$1.d()).d($$0, $$1));
   }

   private dyy a(dgm $$0, jh $$1, jm $$2, boolean $$3) {
      jh $$4 = $$1.a($$2);
      dxu $$5 = $$0.a_($$4);
      if ($$3) {
         boolean $$6 = $$5.b() instanceof dtb || this.a($$0, $$4, $$5);
         if ($$6 && o($$0.a_($$4.d()))) {
            if ($$5.c($$0, $$4, $$2.g())) {
               return dyy.a;
            }

            return dyy.b;
         }
      }

      return !a($$5, $$2) && ($$5.d($$0, $$4) || !o($$0.a_($$4.e()))) ? dyy.c : dyy.b;
   }

   @Override
   protected boolean a(dxu $$0, dhk $$1, jh $$2) {
      jh $$3 = $$2.e();
      dxu $$4 = $$1.a_($$3);
      return this.a($$1, $$3, $$4);
   }

   private boolean a(dgm $$0, jh $$1, dxu $$2) {
      return $$2.c($$0, $$1, jm.b) || $$2.a(dkn.hs);
   }

   private void a(dhh $$0, jh $$1, dxu $$2, @Nullable eve $$3, boolean $$4) {
      if (a($$0)) {
         new evb(this).a($$0, $$1, $$2, $$3, $$4);
      } else {
         this.K.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   public int a(dhh $$0, jh $$1) {
      this.L = false;
      int $$2 = $$0.D($$1);
      this.L = true;
      return $$2;
   }

   private void b(dhh $$0, jh $$1) {
      if ($$0.a_($$1).a(this)) {
         $$0.a($$1, this);

         for (jm $$2 : jm.values()) {
            $$0.a($$1.a($$2), this);
         }
      }
   }

   @Override
   protected void b(dxu $$0, dhh $$1, jh $$2, dxu $$3, boolean $$4) {
      if (!$$3.a($$0.b()) && !$$1.C) {
         this.a($$1, $$2, $$0, null, true);

         for (jm $$5 : jm.c.b) {
            $$1.a($$2.a($$5), this);
         }

         this.c($$1, $$2);
      }
   }

   @Override
   protected void a(dxu $$0, dhh $$1, jh $$2, dxu $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         if (!$$1.C) {
            for (jm $$5 : jm.values()) {
               $$1.a($$2.a($$5), this);
            }

            this.a($$1, $$2, $$0, null, false);
            this.c($$1, $$2);
         }
      }
   }

   private void c(dhh $$0, jh $$1) {
      for (jm $$2 : jm.c.a) {
         this.b($$0, $$1.a($$2));
      }

      for (jm $$3 : jm.c.a) {
         jh $$4 = $$1.a($$3);
         if ($$0.a_($$4).d($$0, $$4)) {
            this.b($$0, $$4.d());
         } else {
            this.b($$0, $$4.e());
         }
      }
   }

   @Override
   protected void a(dxu $$0, dhh $$1, jh $$2, dkl $$3, @Nullable eve $$4, boolean $$5) {
      if (!$$1.C) {
         if ($$3 != this || !a($$1)) {
            if ($$0.a((dhk)$$1, $$2)) {
               this.a($$1, $$2, $$0, $$4, false);
            } else {
               c($$0, $$1, $$2);
               $$1.a($$2, false);
            }
         }
      }
   }

   private static boolean a(dhh $$0) {
      return $$0.J().b(csu.d);
   }

   @Override
   protected int b(dxu $$0, dgm $$1, jh $$2, jm $$3) {
      return !this.L ? 0 : $$0.a($$1, $$2, $$3);
   }

   @Override
   protected int a(dxu $$0, dgm $$1, jh $$2, jm $$3) {
      if (this.L && $$3 != jm.a) {
         int $$4 = $$0.c(f);
         if ($$4 == 0) {
            return 0;
         } else {
            return $$3 != jm.b && !this.a($$1, $$0, $$2).c(g.get($$3.g())).a() ? 0 : $$4;
         }
      } else {
         return 0;
      }
   }

   protected static boolean o(dxu $$0) {
      return a($$0, null);
   }

   protected static boolean a(dxu $$0, @Nullable jm $$1) {
      if ($$0.a(dkn.cE)) {
         return true;
      } else if ($$0.a(dkn.eu)) {
         jm $$2 = $$0.c(dqv.aF);
         return $$2 == $$1 || $$2.g() == $$1;
      } else {
         return $$0.a(dkn.lj) ? $$1 == $$0.c(dpy.a) : $$0.p() && $$1 != null;
      }
   }

   @Override
   protected boolean f_(dxu $$0) {
      return this.L;
   }

   public static int b(int $$0) {
      return H[$$0];
   }

   private static void a(dhh $$0, bam $$1, jh $$2, int $$3, jm $$4, jm $$5, float $$6, float $$7) {
      float $$8 = $$7 - $$6;
      if (!($$1.i() >= 0.2F * $$8)) {
         float $$9 = 0.4375F;
         float $$10 = $$6 + $$8 * $$1.i();
         double $$11 = 0.5 + (double)(0.4375F * (float)$$4.j()) + (double)($$10 * (float)$$5.j());
         double $$12 = 0.5 + (double)(0.4375F * (float)$$4.k()) + (double)($$10 * (float)$$5.k());
         double $$13 = 0.5 + (double)(0.4375F * (float)$$4.l()) + (double)($$10 * (float)$$5.l());
         $$0.a(new ln($$3, 1.0F), (double)$$2.u() + $$11, (double)$$2.v() + $$12, (double)$$2.w() + $$13, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void a(dxu $$0, dhh $$1, jh $$2, bam $$3) {
      int $$4 = $$0.c(f);
      if ($$4 != 0) {
         for (jm $$5 : jm.c.a) {
            dyy $$6 = $$0.c(g.get($$5));
            switch ($$6) {
               case a:
                  a($$1, $$3, $$2, H[$$4], $$5, jm.b, -0.5F, 0.5F);
               case b:
                  a($$1, $$3, $$2, H[$$4], jm.a, $$5, 0.0F, 0.5F);
                  break;
               case c:
               default:
                  a($$1, $$3, $$2, H[$$4], jm.a, $$5, 0.0F, 0.3F);
            }
         }
      }
   }

   @Override
   protected dxu a(dxu $$0, drb $$1) {
      switch ($$1) {
         case c:
            return $$0.b(b, $$0.c(d)).b(c, $$0.c(e)).b(d, $$0.c(b)).b(e, $$0.c(c));
         case d:
            return $$0.b(b, $$0.c(c)).b(c, $$0.c(d)).b(d, $$0.c(e)).b(e, $$0.c(b));
         case b:
            return $$0.b(b, $$0.c(e)).b(c, $$0.c(b)).b(d, $$0.c(c)).b(e, $$0.c(d));
         default:
            return $$0;
      }
   }

   @Override
   protected dxu a(dxu $$0, dpk $$1) {
      switch ($$1) {
         case b:
            return $$0.b(b, $$0.c(d)).b(d, $$0.c(b));
         case c:
            return $$0.b(c, $$0.c(e)).b(e, $$0.c(c));
         default:
            return super.a($$0, $$1);
      }
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected bti a(dxu $$0, dhh $$1, jh $$2, cpw $$3, fbt $$4) {
      if (!$$3.gh().e) {
         return bti.e;
      } else {
         if (r($$0) || s($$0)) {
            dxu $$5 = r($$0) ? this.m() : this.J;
            $$5 = $$5.b(f, $$0.c(f));
            $$5 = this.a($$1, $$5, $$2);
            if ($$5 != $$0) {
               $$1.a($$2, $$5, 3);
               this.a($$1, $$2, $$0, $$5);
               return bti.a;
            }
         }

         return bti.e;
      }
   }

   private void a(dhh $$0, jh $$1, dxu $$2, dxu $$3) {
      eve $$4 = eva.a($$0, null, jm.b);

      for (jm $$5 : jm.c.a) {
         jh $$6 = $$1.a($$5);
         if ($$2.c(g.get($$5)).a() != $$3.c(g.get($$5)).a() && $$0.a_($$6).d($$0, $$6)) {
            $$0.a($$6, $$3.b(), $$5.g(), eva.a($$4, $$5));
         }
      }
   }
}
