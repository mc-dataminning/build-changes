import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class dpt extends djm {
   public static final MapCodec<dpt> a = b(dpt::new);
   public static final dxu<dyb> b = dxn.ae;
   public static final dxu<dyb> c = dxn.ad;
   public static final dxu<dyb> d = dxn.af;
   public static final dxu<dyb> e = dxn.ag;
   public static final dxw f = dxn.aW;
   public static final Map<jn, dxu<dyb>> g = Maps.newEnumMap(ImmutableMap.of(jn.c, b, jn.f, c, jn.d, d, jn.e, e));
   protected static final int h = 1;
   protected static final int i = 3;
   protected static final int j = 13;
   protected static final int k = 3;
   protected static final int l = 13;
   private static final fbu m = djm.a(3.0, 0.0, 3.0, 13.0, 1.0, 13.0);
   private static final Map<jn, fbu> n = Maps.newEnumMap(
      ImmutableMap.of(
         jn.c,
         djm.a(3.0, 0.0, 0.0, 13.0, 1.0, 13.0),
         jn.d,
         djm.a(3.0, 0.0, 3.0, 13.0, 1.0, 16.0),
         jn.f,
         djm.a(3.0, 0.0, 3.0, 16.0, 1.0, 13.0),
         jn.e,
         djm.a(0.0, 0.0, 3.0, 13.0, 1.0, 13.0)
      )
   );
   private static final Map<jn, fbu> o = Maps.newEnumMap(
      ImmutableMap.of(
         jn.c,
         fbr.a(n.get(jn.c), djm.a(3.0, 0.0, 0.0, 13.0, 16.0, 1.0)),
         jn.d,
         fbr.a(n.get(jn.d), djm.a(3.0, 0.0, 15.0, 13.0, 16.0, 16.0)),
         jn.f,
         fbr.a(n.get(jn.f), djm.a(15.0, 0.0, 3.0, 16.0, 16.0, 13.0)),
         jn.e,
         fbr.a(n.get(jn.e), djm.a(0.0, 0.0, 3.0, 1.0, 16.0, 13.0))
      )
   );
   private static final Map<dwx, fbu> G = Maps.newHashMap();
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
   private final dwx J;
   private final euj K = new euc(this);
   private boolean L = true;

   @Override
   public MapCodec<dpt> a() {
      return a;
   }

   public dpt(dww.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dyb.c).b(c, dyb.c).b(d, dyb.c).b(e, dyb.c).b(f, Integer.valueOf(0)));
      this.J = this.m().b(b, dyb.b).b(c, dyb.b).b(d, dyb.b).b(e, dyb.b);
      UnmodifiableIterator var2 = this.l().a().iterator();

      while (var2.hasNext()) {
         dwx $$1 = (dwx)var2.next();
         if ($$1.c(f) == 0) {
            G.put($$1, this.q($$1));
         }
      }
   }

   private fbu q(dwx $$0) {
      fbu $$1 = m;

      for (jn $$2 : jn.c.a) {
         dyb $$3 = $$0.c(g.get($$2));
         if ($$3 == dyb.b) {
            $$1 = fbr.a($$1, n.get($$2));
         } else if ($$3 == dyb.a) {
            $$1 = fbr.a($$1, o.get($$2));
         }
      }

      return $$1;
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return G.get($$0.b(f, Integer.valueOf(0)));
   }

   @Override
   public dwx a(dag $$0) {
      return this.a($$0.q(), this.J, $$0.a());
   }

   private dwx a(dfn $$0, dwx $$1, ji $$2) {
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
            $$1 = $$1.b(e, dyb.b);
         }

         if (!$$6 && $$8) {
            $$1 = $$1.b(c, dyb.b);
         }

         if (!$$4 && $$9) {
            $$1 = $$1.b(b, dyb.b);
         }

         if (!$$5 && $$9) {
            $$1 = $$1.b(d, dyb.b);
         }

         return $$1;
      }
   }

   private dwx b(dfn $$0, dwx $$1, ji $$2) {
      boolean $$3 = !$$0.a_($$2.d()).d($$0, $$2);

      for (jn $$4 : jn.c.a) {
         if (!$$1.c(g.get($$4)).a()) {
            dyb $$5 = this.a($$0, $$2, $$4, $$3);
            $$1 = $$1.b(g.get($$4), $$5);
         }
      }

      return $$1;
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      if ($$4 == jn.a) {
         return !this.a($$1, $$5, $$6) ? djo.a.m() : $$0;
      } else if ($$4 == jn.b) {
         return this.a($$1, $$0, $$3);
      } else {
         dyb $$8 = this.a($$1, $$3, $$4);
         return $$8.a() == $$0.c(g.get($$4)).a() && !r($$0) ? $$0.b(g.get($$4), $$8) : this.a($$1, this.J.b(f, $$0.c(f)).b(g.get($$4), $$8), $$3);
      }
   }

   private static boolean r(dwx $$0) {
      return $$0.c(b).a() && $$0.c(d).a() && $$0.c(c).a() && $$0.c(e).a();
   }

   private static boolean s(dwx $$0) {
      return !$$0.c(b).a() && !$$0.c(d).a() && !$$0.c(c).a() && !$$0.c(e).a();
   }

   @Override
   protected void a(dwx $$0, dgj $$1, ji $$2, int $$3, int $$4) {
      ji.a $$5 = new ji.a();

      for (jn $$6 : jn.c.a) {
         dyb $$7 = $$0.c(g.get($$6));
         if ($$7 != dyb.c && !$$1.a_($$5.a($$2, $$6)).a(this)) {
            $$5.c(jn.a);
            dwx $$8 = $$1.a_($$5);
            if ($$8.a(this)) {
               ji $$9 = $$5.a($$6.g());
               $$1.a($$6.g(), $$5, $$9, $$1.a_($$9), $$3, $$4);
            }

            $$5.a($$2, $$6).c(jn.b);
            dwx $$10 = $$1.a_($$5);
            if ($$10.a(this)) {
               ji $$11 = $$5.a($$6.g());
               $$1.a($$6.g(), $$5, $$11, $$1.a_($$11), $$3, $$4);
            }
         }
      }
   }

   private dyb a(dfn $$0, ji $$1, jn $$2) {
      return this.a($$0, $$1, $$2, !$$0.a_($$1.d()).d($$0, $$1));
   }

   private dyb a(dfn $$0, ji $$1, jn $$2, boolean $$3) {
      ji $$4 = $$1.a($$2);
      dwx $$5 = $$0.a_($$4);
      if ($$3) {
         boolean $$6 = $$5.b() instanceof dse || this.a($$0, $$4, $$5);
         if ($$6 && o($$0.a_($$4.d()))) {
            if ($$5.c($$0, $$4, $$2.g())) {
               return dyb.a;
            }

            return dyb.b;
         }
      }

      return !a($$5, $$2) && ($$5.d($$0, $$4) || !o($$0.a_($$4.e()))) ? dyb.c : dyb.b;
   }

   @Override
   protected boolean a(dwx $$0, dgl $$1, ji $$2) {
      ji $$3 = $$2.e();
      dwx $$4 = $$1.a_($$3);
      return this.a($$1, $$3, $$4);
   }

   private boolean a(dfn $$0, ji $$1, dwx $$2) {
      return $$2.c($$0, $$1, jn.b) || $$2.a(djo.hz);
   }

   private void a(dgi $$0, ji $$1, dwx $$2, @Nullable euh $$3, boolean $$4) {
      if (a($$0)) {
         new eue(this).a($$0, $$1, $$2, $$3, $$4);
      } else {
         this.K.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   public int a(dgi $$0, ji $$1) {
      this.L = false;
      int $$2 = $$0.D($$1);
      this.L = true;
      return $$2;
   }

   private void b(dgi $$0, ji $$1) {
      if ($$0.a_($$1).a(this)) {
         $$0.a($$1, this);

         for (jn $$2 : jn.values()) {
            $$0.a($$1.a($$2), this);
         }
      }
   }

   @Override
   protected void b(dwx $$0, dgi $$1, ji $$2, dwx $$3, boolean $$4) {
      if (!$$3.a($$0.b()) && !$$1.C) {
         this.a($$1, $$2, $$0, null, true);

         for (jn $$5 : jn.c.b) {
            $$1.a($$2.a($$5), this);
         }

         this.c($$1, $$2);
      }
   }

   @Override
   protected void a(dwx $$0, dgi $$1, ji $$2, dwx $$3, boolean $$4) {
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

   private void c(dgi $$0, ji $$1) {
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
   protected void a(dwx $$0, dgi $$1, ji $$2, djm $$3, @Nullable euh $$4, boolean $$5) {
      if (!$$1.C) {
         if ($$3 != this || !a($$1)) {
            if ($$0.a((dgl)$$1, $$2)) {
               this.a($$1, $$2, $$0, $$4, false);
            } else {
               c($$0, $$1, $$2);
               $$1.a($$2, false);
            }
         }
      }
   }

   private static boolean a(dgi $$0) {
      return $$0.K().b(crv.c);
   }

   @Override
   protected int b(dwx $$0, dfn $$1, ji $$2, jn $$3) {
      return !this.L ? 0 : $$0.a($$1, $$2, $$3);
   }

   @Override
   protected int a(dwx $$0, dfn $$1, ji $$2, jn $$3) {
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

   protected static boolean o(dwx $$0) {
      return a($$0, null);
   }

   protected static boolean a(dwx $$0, @Nullable jn $$1) {
      if ($$0.a(djo.cE)) {
         return true;
      } else if ($$0.a(djo.eu)) {
         jn $$2 = $$0.c(dpy.aF);
         return $$2 == $$1 || $$2.g() == $$1;
      } else {
         return $$0.a(djo.lq) ? $$1 == $$0.c(dpa.a) : $$0.p() && $$1 != null;
      }
   }

   @Override
   protected boolean f_(dwx $$0) {
      return this.L;
   }

   public static int b(int $$0) {
      return H[$$0];
   }

   private static void a(dgi $$0, azh $$1, ji $$2, int $$3, jn $$4, jn $$5, float $$6, float $$7) {
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
   public void a(dwx $$0, dgi $$1, ji $$2, azh $$3) {
      int $$4 = $$0.c(f);
      if ($$4 != 0) {
         for (jn $$5 : jn.c.a) {
            dyb $$6 = $$0.c(g.get($$5));
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
   protected dwx a(dwx $$0, dqe $$1) {
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
   protected dwx a(dwx $$0, dol $$1) {
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
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected bsj a(dwx $$0, dgi $$1, ji $$2, cox $$3, faw $$4) {
      if (!$$3.gj().e) {
         return bsj.e;
      } else {
         if (r($$0) || s($$0)) {
            dwx $$5 = r($$0) ? this.m() : this.J;
            $$5 = $$5.b(f, $$0.c(f));
            $$5 = this.a($$1, $$5, $$2);
            if ($$5 != $$0) {
               $$1.a($$2, $$5, 3);
               this.a($$1, $$2, $$0, $$5);
               return bsj.a;
            }
         }

         return bsj.e;
      }
   }

   private void a(dgi $$0, ji $$1, dwx $$2, dwx $$3) {
      euh $$4 = eud.a($$0, null, jn.b);

      for (jn $$5 : jn.c.a) {
         ji $$6 = $$1.a($$5);
         if ($$2.c(g.get($$5)).a() != $$3.c(g.get($$5)).a() && $$0.a_($$6).d($$0, $$6)) {
            $$0.a($$6, $$3.b(), $$5.g(), eud.a($$4, $$5));
         }
      }
   }
}
