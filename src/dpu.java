import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class dpu extends djn {
   public static final MapCodec<dpu> a = b(dpu::new);
   public static final dxv<dyc> b = dxo.ae;
   public static final dxv<dyc> c = dxo.ad;
   public static final dxv<dyc> d = dxo.af;
   public static final dxv<dyc> e = dxo.ag;
   public static final dxx f = dxo.aW;
   public static final Map<jn, dxv<dyc>> g = Maps.newEnumMap(ImmutableMap.of(jn.c, b, jn.f, c, jn.d, d, jn.e, e));
   protected static final int h = 1;
   protected static final int i = 3;
   protected static final int j = 13;
   protected static final int k = 3;
   protected static final int l = 13;
   private static final fbv m = djn.a(3.0, 0.0, 3.0, 13.0, 1.0, 13.0);
   private static final Map<jn, fbv> n = Maps.newEnumMap(
      ImmutableMap.of(
         jn.c,
         djn.a(3.0, 0.0, 0.0, 13.0, 1.0, 13.0),
         jn.d,
         djn.a(3.0, 0.0, 3.0, 13.0, 1.0, 16.0),
         jn.f,
         djn.a(3.0, 0.0, 3.0, 16.0, 1.0, 13.0),
         jn.e,
         djn.a(0.0, 0.0, 3.0, 13.0, 1.0, 13.0)
      )
   );
   private static final Map<jn, fbv> o = Maps.newEnumMap(
      ImmutableMap.of(
         jn.c,
         fbs.a(n.get(jn.c), djn.a(3.0, 0.0, 0.0, 13.0, 16.0, 1.0)),
         jn.d,
         fbs.a(n.get(jn.d), djn.a(3.0, 0.0, 15.0, 13.0, 16.0, 16.0)),
         jn.f,
         fbs.a(n.get(jn.f), djn.a(15.0, 0.0, 3.0, 16.0, 16.0, 13.0)),
         jn.e,
         fbs.a(n.get(jn.e), djn.a(0.0, 0.0, 3.0, 1.0, 16.0, 13.0))
      )
   );
   private static final Map<dwy, fbv> G = Maps.newHashMap();
   private static final int[] H = af.a(new int[16], $$0 -> {
      for (int $$1 = 0; $$1 <= 15; $$1++) {
         float $$2 = (float)$$1 / 15.0F;
         float $$3 = $$2 * 0.6F + ($$2 > 0.0F ? 0.4F : 0.3F);
         float $$4 = ayz.a($$2 * $$2 * 0.7F - 0.5F, 0.0F, 1.0F);
         float $$5 = ayz.a($$2 * $$2 * 0.6F - 0.7F, 0.0F, 1.0F);
         $$0[$$1] = axk.a(1.0F, $$3, $$4, $$5);
      }
   });
   private static final float I = 0.2F;
   private final dwy J;
   private final euk K = new eud(this);
   private boolean L = true;

   @Override
   public MapCodec<dpu> a() {
      return a;
   }

   public dpu(dwx.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dyc.c).b(c, dyc.c).b(d, dyc.c).b(e, dyc.c).b(f, Integer.valueOf(0)));
      this.J = this.m().b(b, dyc.b).b(c, dyc.b).b(d, dyc.b).b(e, dyc.b);
      UnmodifiableIterator var2 = this.l().a().iterator();

      while (var2.hasNext()) {
         dwy $$1 = (dwy)var2.next();
         if ($$1.c(f) == 0) {
            G.put($$1, this.q($$1));
         }
      }
   }

   private fbv q(dwy $$0) {
      fbv $$1 = m;

      for (jn $$2 : jn.c.a) {
         dyc $$3 = $$0.c(g.get($$2));
         if ($$3 == dyc.b) {
            $$1 = fbs.a($$1, n.get($$2));
         } else if ($$3 == dyc.a) {
            $$1 = fbs.a($$1, o.get($$2));
         }
      }

      return $$1;
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return G.get($$0.b(f, Integer.valueOf(0)));
   }

   @Override
   public dwy a(dah $$0) {
      return this.a($$0.q(), this.J, $$0.a());
   }

   private dwy a(dfo $$0, dwy $$1, ji $$2) {
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
            $$1 = $$1.b(e, dyc.b);
         }

         if (!$$6 && $$8) {
            $$1 = $$1.b(c, dyc.b);
         }

         if (!$$4 && $$9) {
            $$1 = $$1.b(b, dyc.b);
         }

         if (!$$5 && $$9) {
            $$1 = $$1.b(d, dyc.b);
         }

         return $$1;
      }
   }

   private dwy b(dfo $$0, dwy $$1, ji $$2) {
      boolean $$3 = !$$0.a_($$2.d()).d($$0, $$2);

      for (jn $$4 : jn.c.a) {
         if (!$$1.c(g.get($$4)).a()) {
            dyc $$5 = this.a($$0, $$2, $$4, $$3);
            $$1 = $$1.b(g.get($$4), $$5);
         }
      }

      return $$1;
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      if ($$4 == jn.a) {
         return !this.a($$1, $$5, $$6) ? djp.a.m() : $$0;
      } else if ($$4 == jn.b) {
         return this.a($$1, $$0, $$3);
      } else {
         dyc $$8 = this.a($$1, $$3, $$4);
         return $$8.a() == $$0.c(g.get($$4)).a() && !r($$0) ? $$0.b(g.get($$4), $$8) : this.a($$1, this.J.b(f, $$0.c(f)).b(g.get($$4), $$8), $$3);
      }
   }

   private static boolean r(dwy $$0) {
      return $$0.c(b).a() && $$0.c(d).a() && $$0.c(c).a() && $$0.c(e).a();
   }

   private static boolean s(dwy $$0) {
      return !$$0.c(b).a() && !$$0.c(d).a() && !$$0.c(c).a() && !$$0.c(e).a();
   }

   @Override
   protected void a(dwy $$0, dgk $$1, ji $$2, int $$3, int $$4) {
      ji.a $$5 = new ji.a();

      for (jn $$6 : jn.c.a) {
         dyc $$7 = $$0.c(g.get($$6));
         if ($$7 != dyc.c && !$$1.a_($$5.a($$2, $$6)).a(this)) {
            $$5.c(jn.a);
            dwy $$8 = $$1.a_($$5);
            if ($$8.a(this)) {
               ji $$9 = $$5.a($$6.g());
               $$1.a($$6.g(), $$5, $$9, $$1.a_($$9), $$3, $$4);
            }

            $$5.a($$2, $$6).c(jn.b);
            dwy $$10 = $$1.a_($$5);
            if ($$10.a(this)) {
               ji $$11 = $$5.a($$6.g());
               $$1.a($$6.g(), $$5, $$11, $$1.a_($$11), $$3, $$4);
            }
         }
      }
   }

   private dyc a(dfo $$0, ji $$1, jn $$2) {
      return this.a($$0, $$1, $$2, !$$0.a_($$1.d()).d($$0, $$1));
   }

   private dyc a(dfo $$0, ji $$1, jn $$2, boolean $$3) {
      ji $$4 = $$1.a($$2);
      dwy $$5 = $$0.a_($$4);
      if ($$3) {
         boolean $$6 = $$5.b() instanceof dsf || this.a($$0, $$4, $$5);
         if ($$6 && o($$0.a_($$4.d()))) {
            if ($$5.c($$0, $$4, $$2.g())) {
               return dyc.a;
            }

            return dyc.b;
         }
      }

      return !a($$5, $$2) && ($$5.d($$0, $$4) || !o($$0.a_($$4.e()))) ? dyc.c : dyc.b;
   }

   @Override
   protected boolean a(dwy $$0, dgm $$1, ji $$2) {
      ji $$3 = $$2.e();
      dwy $$4 = $$1.a_($$3);
      return this.a($$1, $$3, $$4);
   }

   private boolean a(dfo $$0, ji $$1, dwy $$2) {
      return $$2.c($$0, $$1, jn.b) || $$2.a(djp.hz);
   }

   private void a(dgj $$0, ji $$1, dwy $$2, @Nullable eui $$3, boolean $$4) {
      if (a($$0)) {
         new euf(this).a($$0, $$1, $$2, $$3, $$4);
      } else {
         this.K.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   public int a(dgj $$0, ji $$1) {
      this.L = false;
      int $$2 = $$0.D($$1);
      this.L = true;
      return $$2;
   }

   private void b(dgj $$0, ji $$1) {
      if ($$0.a_($$1).a(this)) {
         $$0.a($$1, this);

         for (jn $$2 : jn.values()) {
            $$0.a($$1.a($$2), this);
         }
      }
   }

   @Override
   protected void b(dwy $$0, dgj $$1, ji $$2, dwy $$3, boolean $$4) {
      if (!$$3.a($$0.b()) && !$$1.C) {
         this.a($$1, $$2, $$0, null, true);

         for (jn $$5 : jn.c.b) {
            $$1.a($$2.a($$5), this);
         }

         this.c($$1, $$2);
      }
   }

   @Override
   protected void a(dwy $$0, dgj $$1, ji $$2, dwy $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         if (!$$1.C) {
            for (jn $$5 : jn.values()) {
               $$1.a($$2.a($$5), this);
            }

            this.a($$1, $$2, $$0, null, false);
            this.c($$1, $$2);
         }
      }
   }

   private void c(dgj $$0, ji $$1) {
      for (jn $$2 : jn.c.a) {
         this.b($$0, $$1.a($$2));
      }

      for (jn $$3 : jn.c.a) {
         ji $$4 = $$1.a($$3);
         if ($$0.a_($$4).d($$0, $$4)) {
            this.b($$0, $$4.d());
         } else {
            this.b($$0, $$4.e());
         }
      }
   }

   @Override
   protected void a(dwy $$0, dgj $$1, ji $$2, djn $$3, @Nullable eui $$4, boolean $$5) {
      if (!$$1.C) {
         if ($$3 != this || !a($$1)) {
            if ($$0.a((dgm)$$1, $$2)) {
               this.a($$1, $$2, $$0, $$4, false);
            } else {
               c($$0, $$1, $$2);
               $$1.a($$2, false);
            }
         }
      }
   }

   private static boolean a(dgj $$0) {
      return $$0.K().b(crw.c);
   }

   @Override
   protected int b(dwy $$0, dfo $$1, ji $$2, jn $$3) {
      return !this.L ? 0 : $$0.a($$1, $$2, $$3);
   }

   @Override
   protected int a(dwy $$0, dfo $$1, ji $$2, jn $$3) {
      if (this.L && $$3 != jn.a) {
         int $$4 = $$0.c(f);
         if ($$4 == 0) {
            return 0;
         } else {
            return $$3 != jn.b && !this.a($$1, $$0, $$2).c(g.get($$3.g())).a() ? 0 : $$4;
         }
      } else {
         return 0;
      }
   }

   protected static boolean o(dwy $$0) {
      return a($$0, null);
   }

   protected static boolean a(dwy $$0, @Nullable jn $$1) {
      if ($$0.a(djp.cE)) {
         return true;
      } else if ($$0.a(djp.eu)) {
         jn $$2 = $$0.c(dpz.aF);
         return $$2 == $$1 || $$2.g() == $$1;
      } else {
         return $$0.a(djp.lq) ? $$1 == $$0.c(dpb.a) : $$0.p() && $$1 != null;
      }
   }

   @Override
   protected boolean f_(dwy $$0) {
      return this.L;
   }

   public static int b(int $$0) {
      return H[$$0];
   }

   private static void a(dgj $$0, azh $$1, ji $$2, int $$3, jn $$4, jn $$5, float $$6, float $$7) {
      float $$8 = $$7 - $$6;
      if (!($$1.i() >= 0.2F * $$8)) {
         float $$9 = 0.4375F;
         float $$10 = $$6 + $$8 * $$1.i();
         double $$11 = 0.5 + (double)(0.4375F * (float)$$4.j()) + (double)($$10 * (float)$$5.j());
         double $$12 = 0.5 + (double)(0.4375F * (float)$$4.k()) + (double)($$10 * (float)$$5.k());
         double $$13 = 0.5 + (double)(0.4375F * (float)$$4.l()) + (double)($$10 * (float)$$5.l());
         $$0.a(new lo($$3, 1.0F), (double)$$2.u() + $$11, (double)$$2.v() + $$12, (double)$$2.w() + $$13, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void a(dwy $$0, dgj $$1, ji $$2, azh $$3) {
      int $$4 = $$0.c(f);
      if ($$4 != 0) {
         for (jn $$5 : jn.c.a) {
            dyc $$6 = $$0.c(g.get($$5));
            switch ($$6) {
               case a:
                  a($$1, $$3, $$2, H[$$4], $$5, jn.b, -0.5F, 0.5F);
               case b:
                  a($$1, $$3, $$2, H[$$4], jn.a, $$5, 0.0F, 0.5F);
                  break;
               case c:
               default:
                  a($$1, $$3, $$2, H[$$4], jn.a, $$5, 0.0F, 0.3F);
            }
         }
      }
   }

   @Override
   protected dwy a(dwy $$0, dqf $$1) {
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
   protected dwy a(dwy $$0, dom $$1) {
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
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected bsl a(dwy $$0, dgj $$1, ji $$2, coy $$3, fax $$4) {
      if (!$$3.gj().e) {
         return bsl.e;
      } else {
         if (r($$0) || s($$0)) {
            dwy $$5 = r($$0) ? this.m() : this.J;
            $$5 = $$5.b(f, $$0.c(f));
            $$5 = this.a($$1, $$5, $$2);
            if ($$5 != $$0) {
               $$1.a($$2, $$5, 3);
               this.a($$1, $$2, $$0, $$5);
               return bsl.a;
            }
         }

         return bsl.e;
      }
   }

   private void a(dgj $$0, ji $$1, dwy $$2, dwy $$3) {
      eui $$4 = eue.a($$0, null, jn.b);

      for (jn $$5 : jn.c.a) {
         ji $$6 = $$1.a($$5);
         if ($$2.c(g.get($$5)).a() != $$3.c(g.get($$5)).a() && $$0.a_($$6).d($$0, $$6)) {
            $$0.a($$6, $$3.b(), $$5.g(), eue.a($$4, $$5));
         }
      }
   }
}
