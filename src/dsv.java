import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dsv extends dmm {
   public static final MapCodec<dsv> a = b(dsv::new);
   public static final ebm<ebt> b = ebe.ae;
   public static final ebm<ebt> c = ebe.ad;
   public static final ebm<ebt> d = ebe.af;
   public static final ebm<ebt> e = ebe.ag;
   public static final ebo f = ebe.aW;
   public static final Map<jb, ebm<ebt>> g = ImmutableMap.copyOf(Maps.newEnumMap(Map.of(jb.c, b, jb.f, c, jb.d, d, jb.e, e)));
   private static final int[] h = ag.a(new int[16], $$0 -> {
      for (int $$1 = 0; $$1 <= 15; $$1++) {
         float $$2 = (float)$$1 / 15.0F;
         float $$3 = $$2 * 0.6F + ($$2 > 0.0F ? 0.4F : 0.3F);
         float $$4 = azm.a($$2 * $$2 * 0.7F - 0.5F, 0.0F, 1.0F);
         float $$5 = azm.a($$2 * $$2 * 0.6F - 0.7F, 0.0F, 1.0F);
         $$0[$$1] = axw.a(1.0F, $$3, $$4, $$5);
      }
   });
   private static final float i = 0.2F;
   private final Function<eao, ffr> D;
   private final eao R;
   private final eyf S = new exy(this);
   private boolean T = true;

   @Override
   public MapCodec<dsv> a() {
      return a;
   }

   public dsv(ean.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, ebt.c).b(c, ebt.c).b(d, ebt.c).b(e, ebt.c).b(f, Integer.valueOf(0)));
      this.D = this.b();
      this.R = this.m().b(b, ebt.b).b(c, ebt.b).b(d, ebt.b).b(e, ebt.b);
   }

   private Function<eao, ffr> b() {
      int $$0 = 1;
      int $$1 = 10;
      ffr $$2 = dmm.b(10.0, 0.0, 1.0);
      Map<jb, ffr> $$3 = ffo.c(dmm.a(10.0, 0.0, 1.0, 0.0, 8.0));
      Map<jb, ffr> $$4 = ffo.c(dmm.b(10.0, 16.0, 0.0, 1.0));
      return this.a($$3x -> {
         ffr $$4x = $$2;

         for (Entry<jb, ebm<ebt>> $$5 : g.entrySet()) {
            $$4x = switch ((ebt)$$3x.c($$5.getValue())) {
               case a -> ffo.a($$4x, $$3.get($$5.getKey()), $$4.get($$5.getKey()));
               case b -> ffo.a($$4x, $$3.get($$5.getKey()));
               case c -> $$4x;
            };
         }

         return $$4x;
      }, new ebr[]{f});
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return this.D.apply($$0);
   }

   @Override
   public eao a(ddd $$0) {
      return this.a($$0.q(), this.R, $$0.a());
   }

   private eao a(din $$0, eao $$1, iv $$2) {
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
            $$1 = $$1.b(e, ebt.b);
         }

         if (!$$6 && $$8) {
            $$1 = $$1.b(c, ebt.b);
         }

         if (!$$4 && $$9) {
            $$1 = $$1.b(b, ebt.b);
         }

         if (!$$5 && $$9) {
            $$1 = $$1.b(d, ebt.b);
         }

         return $$1;
      }
   }

   private eao b(din $$0, eao $$1, iv $$2) {
      boolean $$3 = !$$0.a_($$2.d()).d($$0, $$2);

      for (jb $$4 : jb.c.a) {
         if (!$$1.c(g.get($$4)).a()) {
            ebt $$5 = this.a($$0, $$2, $$4, $$3);
            $$1 = $$1.b(g.get($$4), $$5);
         }
      }

      return $$1;
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      if ($$4 == jb.a) {
         return !this.a($$1, $$5, $$6) ? dmo.a.m() : $$0;
      } else if ($$4 == jb.b) {
         return this.a($$1, $$0, $$3);
      } else {
         ebt $$8 = this.a($$1, $$3, $$4);
         return $$8.a() == $$0.c(g.get($$4)).a() && !q($$0) ? $$0.b(g.get($$4), $$8) : this.a($$1, this.R.b(f, $$0.c(f)).b(g.get($$4), $$8), $$3);
      }
   }

   private static boolean q(eao $$0) {
      return $$0.c(b).a() && $$0.c(d).a() && $$0.c(c).a() && $$0.c(e).a();
   }

   private static boolean r(eao $$0) {
      return !$$0.c(b).a() && !$$0.c(d).a() && !$$0.c(c).a() && !$$0.c(e).a();
   }

   @Override
   protected void a(eao $$0, dji $$1, iv $$2, int $$3, int $$4) {
      iv.a $$5 = new iv.a();

      for (jb $$6 : jb.c.a) {
         ebt $$7 = $$0.c(g.get($$6));
         if ($$7 != ebt.c && !$$1.a_($$5.a($$2, $$6)).a(this)) {
            $$5.c(jb.a);
            eao $$8 = $$1.a_($$5);
            if ($$8.a(this)) {
               iv $$9 = $$5.a($$6.g());
               $$1.a($$6.g(), $$5, $$9, $$1.a_($$9), $$3, $$4);
            }

            $$5.a($$2, $$6).c(jb.b);
            eao $$10 = $$1.a_($$5);
            if ($$10.a(this)) {
               iv $$11 = $$5.a($$6.g());
               $$1.a($$6.g(), $$5, $$11, $$1.a_($$11), $$3, $$4);
            }
         }
      }
   }

   private ebt a(din $$0, iv $$1, jb $$2) {
      return this.a($$0, $$1, $$2, !$$0.a_($$1.d()).d($$0, $$1));
   }

   private ebt a(din $$0, iv $$1, jb $$2, boolean $$3) {
      iv $$4 = $$1.a($$2);
      eao $$5 = $$0.a_($$4);
      if ($$3) {
         boolean $$6 = $$5.b() instanceof dvo || this.a($$0, $$4, $$5);
         if ($$6 && o($$0.a_($$4.d()))) {
            if ($$5.c($$0, $$4, $$2.g())) {
               return ebt.a;
            }

            return ebt.b;
         }
      }

      return !a($$5, $$2) && ($$5.d($$0, $$4) || !o($$0.a_($$4.e()))) ? ebt.c : ebt.b;
   }

   @Override
   protected boolean a(eao $$0, djk $$1, iv $$2) {
      iv $$3 = $$2.e();
      eao $$4 = $$1.a_($$3);
      return this.a($$1, $$3, $$4);
   }

   private boolean a(din $$0, iv $$1, eao $$2) {
      return $$2.c($$0, $$1, jb.b) || $$2.a(dmo.hD);
   }

   private void a(djh $$0, iv $$1, eao $$2, @Nullable eyd $$3, boolean $$4) {
      if (a($$0)) {
         new eya(this).a($$0, $$1, $$2, $$3, $$4);
      } else {
         this.S.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   public int a(djh $$0, iv $$1) {
      this.T = false;
      int $$2 = $$0.E($$1);
      this.T = true;
      return $$2;
   }

   private void b(djh $$0, iv $$1) {
      if ($$0.a_($$1).a(this)) {
         $$0.a($$1, this);

         for (jb $$2 : jb.values()) {
            $$0.a($$1.a($$2), this);
         }
      }
   }

   @Override
   protected void a(eao $$0, djh $$1, iv $$2, eao $$3, boolean $$4) {
      if (!$$3.a($$0.b()) && !$$1.C) {
         this.a($$1, $$2, $$0, null, true);

         for (jb $$5 : jb.c.b) {
            $$1.a($$2.a($$5), this);
         }

         this.c($$1, $$2);
      }
   }

   @Override
   protected void a(eao $$0, arq $$1, iv $$2, boolean $$3) {
      if (!$$3) {
         for (jb $$4 : jb.values()) {
            $$1.a($$2.a($$4), this);
         }

         this.a($$1, $$2, $$0, null, false);
         this.c($$1, $$2);
      }
   }

   private void c(djh $$0, iv $$1) {
      for (jb $$2 : jb.c.a) {
         this.b($$0, $$1.a($$2));
      }

      for (jb $$3 : jb.c.a) {
         iv $$4 = $$1.a($$3);
         if ($$0.a_($$4).d($$0, $$4)) {
            this.b($$0, $$4.d());
         } else {
            this.b($$0, $$4.e());
         }
      }
   }

   @Override
   protected void a(eao $$0, djh $$1, iv $$2, dmm $$3, @Nullable eyd $$4, boolean $$5) {
      if (!$$1.C) {
         if ($$3 != this || !a($$1)) {
            if ($$0.a((djk)$$1, $$2)) {
               this.a($$1, $$2, $$0, $$4, false);
            } else {
               c($$0, $$1, $$2);
               $$1.a($$2, false);
            }
         }
      }
   }

   private static boolean a(djh $$0) {
      return $$0.K().b(cuv.c);
   }

   @Override
   protected int b(eao $$0, din $$1, iv $$2, jb $$3) {
      return !this.T ? 0 : $$0.a($$1, $$2, $$3);
   }

   @Override
   protected int a(eao $$0, din $$1, iv $$2, jb $$3) {
      if (this.T && $$3 != jb.a) {
         int $$4 = $$0.c(f);
         if ($$4 == 0) {
            return 0;
         } else {
            return $$3 != jb.b && !this.a($$1, $$0, $$2).c(g.get($$3.g())).a() ? 0 : $$4;
         }
      } else {
         return 0;
      }
   }

   protected static boolean o(eao $$0) {
      return a($$0, null);
   }

   protected static boolean a(eao $$0, @Nullable jb $$1) {
      if ($$0.a(dmo.cH)) {
         return true;
      } else if ($$0.a(dmo.ey)) {
         jb $$2 = $$0.c(dta.e);
         return $$2 == $$1 || $$2.g() == $$1;
      } else {
         return $$0.a(dmo.lu) ? $$1 == $$0.c(dse.a) : $$0.p() && $$1 != null;
      }
   }

   @Override
   protected boolean f_(eao $$0) {
      return this.T;
   }

   public static int b(int $$0) {
      return h[$$0];
   }

   private static void a(djh $$0, azv $$1, iv $$2, int $$3, jb $$4, jb $$5, float $$6, float $$7) {
      float $$8 = $$7 - $$6;
      if (!($$1.i() >= 0.2F * $$8)) {
         float $$9 = 0.4375F;
         float $$10 = $$6 + $$8 * $$1.i();
         double $$11 = 0.5 + (double)(0.4375F * (float)$$4.j()) + (double)($$10 * (float)$$5.j());
         double $$12 = 0.5 + (double)(0.4375F * (float)$$4.k()) + (double)($$10 * (float)$$5.k());
         double $$13 = 0.5 + (double)(0.4375F * (float)$$4.l()) + (double)($$10 * (float)$$5.l());
         $$0.a(new lt($$3, 1.0F), (double)$$2.u() + $$11, (double)$$2.v() + $$12, (double)$$2.w() + $$13, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void a(eao $$0, djh $$1, iv $$2, azv $$3) {
      int $$4 = $$0.c(f);
      if ($$4 != 0) {
         for (jb $$5 : jb.c.a) {
            ebt $$6 = $$0.c(g.get($$5));
            switch ($$6) {
               case a:
                  a($$1, $$3, $$2, h[$$4], $$5, jb.b, -0.5F, 0.5F);
               case b:
                  a($$1, $$3, $$2, h[$$4], jb.a, $$5, 0.0F, 0.5F);
                  break;
               case c:
               default:
                  a($$1, $$3, $$2, h[$$4], jb.a, $$5, 0.0F, 0.3F);
            }
         }
      }
   }

   @Override
   protected eao a(eao $$0, dtg $$1) {
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
   protected eao a(eao $$0, drp $$1) {
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
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected bug a(eao $$0, djh $$1, iv $$2, crj $$3, fet $$4) {
      if (!$$3.gj().e) {
         return bug.e;
      } else {
         if (q($$0) || r($$0)) {
            eao $$5 = q($$0) ? this.m() : this.R;
            $$5 = $$5.b(f, $$0.c(f));
            $$5 = this.a($$1, $$5, $$2);
            if ($$5 != $$0) {
               $$1.a($$2, $$5, 3);
               this.a($$1, $$2, $$0, $$5);
               return bug.a;
            }
         }

         return bug.e;
      }
   }

   private void a(djh $$0, iv $$1, eao $$2, eao $$3) {
      eyd $$4 = exz.a($$0, null, jb.b);

      for (jb $$5 : jb.c.a) {
         iv $$6 = $$1.a($$5);
         if ($$2.c(g.get($$5)).a() != $$3.c(g.get($$5)).a() && $$0.a_($$6).d($$0, $$6)) {
            $$0.a($$6, $$3.b(), $$5.g(), exz.a($$4, $$5));
         }
      }
   }
}
