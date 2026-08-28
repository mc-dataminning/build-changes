import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class dqk extends dkd {
   public static final MapCodec<dqk> a = b(dqk::new);
   public static final dyl<dys> b = dye.ae;
   public static final dyl<dys> c = dye.ad;
   public static final dyl<dys> d = dye.af;
   public static final dyl<dys> e = dye.ag;
   public static final dyn f = dye.aW;
   public static final Map<jm, dyl<dys>> g = Maps.newEnumMap(ImmutableMap.of(jm.c, b, jm.f, c, jm.d, d, jm.e, e));
   protected static final int h = 1;
   protected static final int i = 3;
   protected static final int j = 13;
   protected static final int k = 3;
   protected static final int l = 13;
   private static final fcl m = dkd.a(3.0, 0.0, 3.0, 13.0, 1.0, 13.0);
   private static final Map<jm, fcl> n = Maps.newEnumMap(
      ImmutableMap.of(
         jm.c,
         dkd.a(3.0, 0.0, 0.0, 13.0, 1.0, 13.0),
         jm.d,
         dkd.a(3.0, 0.0, 3.0, 13.0, 1.0, 16.0),
         jm.f,
         dkd.a(3.0, 0.0, 3.0, 16.0, 1.0, 13.0),
         jm.e,
         dkd.a(0.0, 0.0, 3.0, 13.0, 1.0, 13.0)
      )
   );
   private static final Map<jm, fcl> o = Maps.newEnumMap(
      ImmutableMap.of(
         jm.c,
         fci.a(n.get(jm.c), dkd.a(3.0, 0.0, 0.0, 13.0, 16.0, 1.0)),
         jm.d,
         fci.a(n.get(jm.d), dkd.a(3.0, 0.0, 15.0, 13.0, 16.0, 16.0)),
         jm.f,
         fci.a(n.get(jm.f), dkd.a(15.0, 0.0, 3.0, 16.0, 16.0, 13.0)),
         jm.e,
         fci.a(n.get(jm.e), dkd.a(0.0, 0.0, 3.0, 1.0, 16.0, 13.0))
      )
   );
   private static final Map<dxo, fcl> G = Maps.newHashMap();
   private static final int[] H = ae.a(new int[16], $$0 -> {
      for (int $$1 = 0; $$1 <= 15; $$1++) {
         float $$2 = (float)$$1 / 15.0F;
         float $$3 = $$2 * 0.6F + ($$2 > 0.0F ? 0.4F : 0.3F);
         float $$4 = azu.a($$2 * $$2 * 0.7F - 0.5F, 0.0F, 1.0F);
         float $$5 = azu.a($$2 * $$2 * 0.6F - 0.7F, 0.0F, 1.0F);
         $$0[$$1] = ayf.a(1.0F, $$3, $$4, $$5);
      }
   });
   private static final float I = 0.2F;
   private final dxo J;
   private final eva K = new eut(this);
   private boolean L = true;

   @Override
   public MapCodec<dqk> a() {
      return a;
   }

   public dqk(dxn.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dys.c).b(c, dys.c).b(d, dys.c).b(e, dys.c).b(f, Integer.valueOf(0)));
      this.J = this.m().b(b, dys.b).b(c, dys.b).b(d, dys.b).b(e, dys.b);
      UnmodifiableIterator var2 = this.l().a().iterator();

      while (var2.hasNext()) {
         dxo $$1 = (dxo)var2.next();
         if ($$1.c(f) == 0) {
            G.put($$1, this.q($$1));
         }
      }
   }

   private fcl q(dxo $$0) {
      fcl $$1 = m;

      for (jm $$2 : jm.c.a) {
         dys $$3 = $$0.c(g.get($$2));
         if ($$3 == dys.b) {
            $$1 = fci.a($$1, n.get($$2));
         } else if ($$3 == dys.a) {
            $$1 = fci.a($$1, o.get($$2));
         }
      }

      return $$1;
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return G.get($$0.b(f, Integer.valueOf(0)));
   }

   @Override
   public dxo a(dax $$0) {
      return this.a($$0.q(), this.J, $$0.a());
   }

   private dxo a(dge $$0, dxo $$1, jh $$2) {
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
            $$1 = $$1.b(e, dys.b);
         }

         if (!$$6 && $$8) {
            $$1 = $$1.b(c, dys.b);
         }

         if (!$$4 && $$9) {
            $$1 = $$1.b(b, dys.b);
         }

         if (!$$5 && $$9) {
            $$1 = $$1.b(d, dys.b);
         }

         return $$1;
      }
   }

   private dxo b(dge $$0, dxo $$1, jh $$2) {
      boolean $$3 = !$$0.a_($$2.d()).d($$0, $$2);

      for (jm $$4 : jm.c.a) {
         if (!$$1.c(g.get($$4)).a()) {
            dys $$5 = this.a($$0, $$2, $$4, $$3);
            $$1 = $$1.b(g.get($$4), $$5);
         }
      }

      return $$1;
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      if ($$4 == jm.a) {
         return !this.a($$1, $$5, $$6) ? dkf.a.m() : $$0;
      } else if ($$4 == jm.b) {
         return this.a($$1, $$0, $$3);
      } else {
         dys $$8 = this.a($$1, $$3, $$4);
         return $$8.a() == $$0.c(g.get($$4)).a() && !r($$0) ? $$0.b(g.get($$4), $$8) : this.a($$1, this.J.b(f, $$0.c(f)).b(g.get($$4), $$8), $$3);
      }
   }

   private static boolean r(dxo $$0) {
      return $$0.c(b).a() && $$0.c(d).a() && $$0.c(c).a() && $$0.c(e).a();
   }

   private static boolean s(dxo $$0) {
      return !$$0.c(b).a() && !$$0.c(d).a() && !$$0.c(c).a() && !$$0.c(e).a();
   }

   @Override
   protected void a(dxo $$0, dha $$1, jh $$2, int $$3, int $$4) {
      jh.a $$5 = new jh.a();

      for (jm $$6 : jm.c.a) {
         dys $$7 = $$0.c(g.get($$6));
         if ($$7 != dys.c && !$$1.a_($$5.a($$2, $$6)).a(this)) {
            $$5.c(jm.a);
            dxo $$8 = $$1.a_($$5);
            if ($$8.a(this)) {
               jh $$9 = $$5.a($$6.g());
               $$1.a($$6.g(), $$5, $$9, $$1.a_($$9), $$3, $$4);
            }

            $$5.a($$2, $$6).c(jm.b);
            dxo $$10 = $$1.a_($$5);
            if ($$10.a(this)) {
               jh $$11 = $$5.a($$6.g());
               $$1.a($$6.g(), $$5, $$11, $$1.a_($$11), $$3, $$4);
            }
         }
      }
   }

   private dys a(dge $$0, jh $$1, jm $$2) {
      return this.a($$0, $$1, $$2, !$$0.a_($$1.d()).d($$0, $$1));
   }

   private dys a(dge $$0, jh $$1, jm $$2, boolean $$3) {
      jh $$4 = $$1.a($$2);
      dxo $$5 = $$0.a_($$4);
      if ($$3) {
         boolean $$6 = $$5.b() instanceof dsv || this.a($$0, $$4, $$5);
         if ($$6 && o($$0.a_($$4.d()))) {
            if ($$5.c($$0, $$4, $$2.g())) {
               return dys.a;
            }

            return dys.b;
         }
      }

      return !a($$5, $$2) && ($$5.d($$0, $$4) || !o($$0.a_($$4.e()))) ? dys.c : dys.b;
   }

   @Override
   protected boolean a(dxo $$0, dhc $$1, jh $$2) {
      jh $$3 = $$2.e();
      dxo $$4 = $$1.a_($$3);
      return this.a($$1, $$3, $$4);
   }

   private boolean a(dge $$0, jh $$1, dxo $$2) {
      return $$2.c($$0, $$1, jm.b) || $$2.a(dkf.hz);
   }

   private void a(dgz $$0, jh $$1, dxo $$2, @Nullable euy $$3, boolean $$4) {
      if (a($$0)) {
         new euv(this).a($$0, $$1, $$2, $$3, $$4);
      } else {
         this.K.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   public int a(dgz $$0, jh $$1) {
      this.L = false;
      int $$2 = $$0.D($$1);
      this.L = true;
      return $$2;
   }

   private void b(dgz $$0, jh $$1) {
      if ($$0.a_($$1).a(this)) {
         $$0.a($$1, this);

         for (jm $$2 : jm.values()) {
            $$0.a($$1.a($$2), this);
         }
      }
   }

   @Override
   protected void b(dxo $$0, dgz $$1, jh $$2, dxo $$3, boolean $$4) {
      if (!$$3.a($$0.b()) && !$$1.C) {
         this.a($$1, $$2, $$0, null, true);

         for (jm $$5 : jm.c.b) {
            $$1.a($$2.a($$5), this);
         }

         this.c($$1, $$2);
      }
   }

   @Override
   protected void a(dxo $$0, dgz $$1, jh $$2, dxo $$3, boolean $$4) {
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

   private void c(dgz $$0, jh $$1) {
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
   protected void a(dxo $$0, dgz $$1, jh $$2, dkd $$3, @Nullable euy $$4, boolean $$5) {
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
      return $$0.K().b(csm.c);
   }

   @Override
   protected int b(dxo $$0, dge $$1, jh $$2, jm $$3) {
      return !this.L ? 0 : $$0.a($$1, $$2, $$3);
   }

   @Override
   protected int a(dxo $$0, dge $$1, jh $$2, jm $$3) {
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

   protected static boolean o(dxo $$0) {
      return a($$0, null);
   }

   protected static boolean a(dxo $$0, @Nullable jm $$1) {
      if ($$0.a(dkf.cE)) {
         return true;
      } else if ($$0.a(dkf.eu)) {
         jm $$2 = $$0.c(dqp.aF);
         return $$2 == $$1 || $$2.g() == $$1;
      } else {
         return $$0.a(dkf.lq) ? $$1 == $$0.c(dpr.a) : $$0.p() && $$1 != null;
      }
   }

   @Override
   protected boolean f_(dxo $$0) {
      return this.L;
   }

   public static int b(int $$0) {
      return H[$$0];
   }

   private static void a(dgz $$0, bac $$1, jh $$2, int $$3, jm $$4, jm $$5, float $$6, float $$7) {
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
   public void a(dxo $$0, dgz $$1, jh $$2, bac $$3) {
      int $$4 = $$0.c(f);
      if ($$4 != 0) {
         for (jm $$5 : jm.c.a) {
            dys $$6 = $$0.c(g.get($$5));
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
   protected dxo a(dxo $$0, dqv $$1) {
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
   protected dxo a(dxo $$0, dpc $$1) {
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
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected bta a(dxo $$0, dgz $$1, jh $$2, cpo $$3, fbn $$4) {
      if (!$$3.gj().e) {
         return bta.e;
      } else {
         if (r($$0) || s($$0)) {
            dxo $$5 = r($$0) ? this.m() : this.J;
            $$5 = $$5.b(f, $$0.c(f));
            $$5 = this.a($$1, $$5, $$2);
            if ($$5 != $$0) {
               $$1.a($$2, $$5, 3);
               this.a($$1, $$2, $$0, $$5);
               return bta.a;
            }
         }

         return bta.e;
      }
   }

   private void a(dgz $$0, jh $$1, dxo $$2, dxo $$3) {
      euy $$4 = euu.a($$0, null, jm.b);

      for (jm $$5 : jm.c.a) {
         jh $$6 = $$1.a($$5);
         if ($$2.c(g.get($$5)).a() != $$3.c(g.get($$5)).a() && $$0.a_($$6).d($$0, $$6)) {
            $$0.a($$6, $$3.b(), $$5.g(), euu.a($$4, $$5));
         }
      }
   }
}
