import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dql extends dke {
   public static final MapCodec<dql> a = b(dql::new);
   public static final dyo<dyv> b = dyg.ae;
   public static final dyo<dyv> c = dyg.ad;
   public static final dyo<dyv> d = dyg.af;
   public static final dyo<dyv> e = dyg.ag;
   public static final dyq f = dyg.aW;
   public static final Map<jn, dyo<dyv>> g = ImmutableMap.copyOf(Maps.newEnumMap(Map.of(jn.c, b, jn.f, c, jn.d, d, jn.e, e)));
   private static final int[] h = af.a(new int[16], $$0 -> {
      for (int $$1 = 0; $$1 <= 15; $$1++) {
         float $$2 = (float)$$1 / 15.0F;
         float $$3 = $$2 * 0.6F + ($$2 > 0.0F ? 0.4F : 0.3F);
         float $$4 = ayz.a($$2 * $$2 * 0.7F - 0.5F, 0.0F, 1.0F);
         float $$5 = ayz.a($$2 * $$2 * 0.6F - 0.7F, 0.0F, 1.0F);
         $$0[$$1] = axk.a(1.0F, $$3, $$4, $$5);
      }
   });
   private static final float i = 0.2F;
   private final Function<dxq, fcr> C;
   private final dxq Q;
   private final evg R = new euz(this);
   private boolean S = true;

   @Override
   public MapCodec<dql> a() {
      return a;
   }

   public dql(dxp.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, dyv.c).b(c, dyv.c).b(d, dyv.c).b(e, dyv.c).b(f, Integer.valueOf(0)));
      this.C = this.b();
      this.Q = this.m().b(b, dyv.b).b(c, dyv.b).b(d, dyv.b).b(e, dyv.b);
   }

   private Function<dxq, fcr> b() {
      int $$0 = 1;
      int $$1 = 10;
      fcr $$2 = dke.b(10.0, 0.0, 1.0);
      Map<jn, fcr> $$3 = fco.c(dke.a(10.0, 0.0, 1.0, 0.0, 8.0));
      Map<jn, fcr> $$4 = fco.c(dke.b(10.0, 16.0, 0.0, 1.0));
      return this.a($$3x -> {
         fcr $$4x = $$2;

         for (Entry<jn, dyo<dyv>> $$5 : g.entrySet()) {
            $$4x = switch ((dyv)$$3x.c($$5.getValue())) {
               case a -> fco.a($$4x, $$3.get($$5.getKey()), $$4.get($$5.getKey()));
               case b -> fco.a($$4x, $$3.get($$5.getKey()));
               case c -> $$4x;
            };
         }

         return $$4x;
      }, new dyt[]{f});
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return this.C.apply($$0);
   }

   @Override
   public dxq a(dax $$0) {
      return this.a($$0.q(), this.Q, $$0.a());
   }

   private dxq a(dgf $$0, dxq $$1, ji $$2) {
      boolean $$3 = r($$1);
      $$1 = this.b($$0, this.m().b(f, $$1.c(f)), $$2);
      if ($$3 && r($$1)) {
         return $$1;
      } else {
         boolean $$4 = $$1.c(b).a();
         boolean $$5 = $$1.c(d).a();
         boolean $$6 = $$1.c(c).a();
         boolean $$7 = $$1.c(e).a();
         boolean $$8 = !$$4 && !$$5;
         boolean $$9 = !$$6 && !$$7;
         if (!$$7 && $$8) {
            $$1 = $$1.b(e, dyv.b);
         }

         if (!$$6 && $$8) {
            $$1 = $$1.b(c, dyv.b);
         }

         if (!$$4 && $$9) {
            $$1 = $$1.b(b, dyv.b);
         }

         if (!$$5 && $$9) {
            $$1 = $$1.b(d, dyv.b);
         }

         return $$1;
      }
   }

   private dxq b(dgf $$0, dxq $$1, ji $$2) {
      boolean $$3 = !$$0.a_($$2.d()).d($$0, $$2);

      for (jn $$4 : jn.c.a) {
         if (!$$1.c(g.get($$4)).a()) {
            dyv $$5 = this.a($$0, $$2, $$4, $$3);
            $$1 = $$1.b(g.get($$4), $$5);
         }
      }

      return $$1;
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      if ($$4 == jn.a) {
         return !this.a($$1, $$5, $$6) ? dkg.a.m() : $$0;
      } else if ($$4 == jn.b) {
         return this.a($$1, $$0, $$3);
      } else {
         dyv $$8 = this.a($$1, $$3, $$4);
         return $$8.a() == $$0.c(g.get($$4)).a() && !q($$0) ? $$0.b(g.get($$4), $$8) : this.a($$1, this.Q.b(f, $$0.c(f)).b(g.get($$4), $$8), $$3);
      }
   }

   private static boolean q(dxq $$0) {
      return $$0.c(b).a() && $$0.c(d).a() && $$0.c(c).a() && $$0.c(e).a();
   }

   private static boolean r(dxq $$0) {
      return !$$0.c(b).a() && !$$0.c(d).a() && !$$0.c(c).a() && !$$0.c(e).a();
   }

   @Override
   protected void a(dxq $$0, dha $$1, ji $$2, int $$3, int $$4) {
      ji.a $$5 = new ji.a();

      for (jn $$6 : jn.c.a) {
         dyv $$7 = $$0.c(g.get($$6));
         if ($$7 != dyv.c && !$$1.a_($$5.a($$2, $$6)).a(this)) {
            $$5.c(jn.a);
            dxq $$8 = $$1.a_($$5);
            if ($$8.a(this)) {
               ji $$9 = $$5.a($$6.g());
               $$1.a($$6.g(), $$5, $$9, $$1.a_($$9), $$3, $$4);
            }

            $$5.a($$2, $$6).c(jn.b);
            dxq $$10 = $$1.a_($$5);
            if ($$10.a(this)) {
               ji $$11 = $$5.a($$6.g());
               $$1.a($$6.g(), $$5, $$11, $$1.a_($$11), $$3, $$4);
            }
         }
      }
   }

   private dyv a(dgf $$0, ji $$1, jn $$2) {
      return this.a($$0, $$1, $$2, !$$0.a_($$1.d()).d($$0, $$1));
   }

   private dyv a(dgf $$0, ji $$1, jn $$2, boolean $$3) {
      ji $$4 = $$1.a($$2);
      dxq $$5 = $$0.a_($$4);
      if ($$3) {
         boolean $$6 = $$5.b() instanceof dsx || this.a($$0, $$4, $$5);
         if ($$6 && o($$0.a_($$4.d()))) {
            if ($$5.c($$0, $$4, $$2.g())) {
               return dyv.a;
            }

            return dyv.b;
         }
      }

      return !a($$5, $$2) && ($$5.d($$0, $$4) || !o($$0.a_($$4.e()))) ? dyv.c : dyv.b;
   }

   @Override
   protected boolean a(dxq $$0, dhc $$1, ji $$2) {
      ji $$3 = $$2.e();
      dxq $$4 = $$1.a_($$3);
      return this.a($$1, $$3, $$4);
   }

   private boolean a(dgf $$0, ji $$1, dxq $$2) {
      return $$2.c($$0, $$1, jn.b) || $$2.a(dkg.hz);
   }

   private void a(dgz $$0, ji $$1, dxq $$2, @Nullable eve $$3, boolean $$4) {
      if (a($$0)) {
         new evb(this).a($$0, $$1, $$2, $$3, $$4);
      } else {
         this.R.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   public int a(dgz $$0, ji $$1) {
      this.S = false;
      int $$2 = $$0.D($$1);
      this.S = true;
      return $$2;
   }

   private void b(dgz $$0, ji $$1) {
      if ($$0.a_($$1).a(this)) {
         $$0.a($$1, this);

         for (jn $$2 : jn.values()) {
            $$0.a($$1.a($$2), this);
         }
      }
   }

   @Override
   protected void a(dxq $$0, dgz $$1, ji $$2, dxq $$3, boolean $$4) {
      if (!$$3.a($$0.b()) && !$$1.C) {
         this.a($$1, $$2, $$0, null, true);

         for (jn $$5 : jn.c.b) {
            $$1.a($$2.a($$5), this);
         }

         this.c($$1, $$2);
      }
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, boolean $$3) {
      if (!$$3) {
         for (jn $$4 : jn.values()) {
            $$1.a($$2.a($$4), this);
         }

         this.a($$1, $$2, $$0, null, false);
         this.c($$1, $$2);
      }
   }

   private void c(dgz $$0, ji $$1) {
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
   protected void a(dxq $$0, dgz $$1, ji $$2, dke $$3, @Nullable eve $$4, boolean $$5) {
      if (!$$1.C) {
         if ($$3 != this || !a($$1)) {
            if ($$0.a((dhc)$$1, $$2)) {
               this.a($$1, $$2, $$0, $$4, false);
            } else {
               c($$0, $$1, $$2);
               $$1.a($$2, false);
            }
         }
      }
   }

   private static boolean a(dgz $$0) {
      return $$0.K().b(csp.c);
   }

   @Override
   protected int b(dxq $$0, dgf $$1, ji $$2, jn $$3) {
      return !this.S ? 0 : $$0.a($$1, $$2, $$3);
   }

   @Override
   protected int a(dxq $$0, dgf $$1, ji $$2, jn $$3) {
      if (this.S && $$3 != jn.a) {
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

   protected static boolean o(dxq $$0) {
      return a($$0, null);
   }

   protected static boolean a(dxq $$0, @Nullable jn $$1) {
      if ($$0.a(dkg.cE)) {
         return true;
      } else if ($$0.a(dkg.eu)) {
         jn $$2 = $$0.c(dqq.e);
         return $$2 == $$1 || $$2.g() == $$1;
      } else {
         return $$0.a(dkg.lq) ? $$1 == $$0.c(dpu.a) : $$0.p() && $$1 != null;
      }
   }

   @Override
   protected boolean f_(dxq $$0) {
      return this.S;
   }

   public static int b(int $$0) {
      return h[$$0];
   }

   private static void a(dgz $$0, azh $$1, ji $$2, int $$3, jn $$4, jn $$5, float $$6, float $$7) {
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
   public void a(dxq $$0, dgz $$1, ji $$2, azh $$3) {
      int $$4 = $$0.c(f);
      if ($$4 != 0) {
         for (jn $$5 : jn.c.a) {
            dyv $$6 = $$0.c(g.get($$5));
            switch ($$6) {
               case a:
                  a($$1, $$3, $$2, h[$$4], $$5, jn.b, -0.5F, 0.5F);
               case b:
                  a($$1, $$3, $$2, h[$$4], jn.a, $$5, 0.0F, 0.5F);
                  break;
               case c:
               default:
                  a($$1, $$3, $$2, h[$$4], jn.a, $$5, 0.0F, 0.3F);
            }
         }
      }
   }

   @Override
   protected dxq a(dxq $$0, dqw $$1) {
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
   protected dxq a(dxq $$0, dpf $$1) {
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
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected bsy a(dxq $$0, dgz $$1, ji $$2, cpr $$3, fbt $$4) {
      if (!$$3.gm().e) {
         return bsy.e;
      } else {
         if (q($$0) || r($$0)) {
            dxq $$5 = q($$0) ? this.m() : this.Q;
            $$5 = $$5.b(f, $$0.c(f));
            $$5 = this.a($$1, $$5, $$2);
            if ($$5 != $$0) {
               $$1.a($$2, $$5, 3);
               this.a($$1, $$2, $$0, $$5);
               return bsy.a;
            }
         }

         return bsy.e;
      }
   }

   private void a(dgz $$0, ji $$1, dxq $$2, dxq $$3) {
      eve $$4 = eva.a($$0, null, jn.b);

      for (jn $$5 : jn.c.a) {
         ji $$6 = $$1.a($$5);
         if ($$2.c(g.get($$5)).a() != $$3.c(g.get($$5)).a() && $$0.a_($$6).d($$0, $$6)) {
            $$0.a($$6, $$3.b(), $$5.g(), eva.a($$4, $$5));
         }
      }
   }
}
