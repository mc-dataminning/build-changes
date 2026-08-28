import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnz extends diy {
   public static final MapCodec<dnz> a = b(dnz::new);
   public static final dxu<jn> b = dnk.aF;
   public static final dxo c = dxn.B;
   public static final dxo d = dxn.s;
   public static final fbu e = djm.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final fbu f = djm.a(4.0, 2.0, 4.0, 12.0, 14.0, 12.0);
   public static final fbu g = fbr.a(e, f);
   public static final fbu h = djm.a(0.0, 15.0, 0.0, 16.0, 15.0, 16.0);
   public static final fbu i = fbr.a(g, h);
   public static final fbu j = fbr.a(
      djm.a(1.0, 10.0, 0.0, 5.333333, 14.0, 16.0), djm.a(5.333333, 12.0, 0.0, 9.666667, 16.0, 16.0), djm.a(9.666667, 14.0, 0.0, 14.0, 18.0, 16.0), g
   );
   public static final fbu k = fbr.a(
      djm.a(0.0, 10.0, 1.0, 16.0, 14.0, 5.333333), djm.a(0.0, 12.0, 5.333333, 16.0, 16.0, 9.666667), djm.a(0.0, 14.0, 9.666667, 16.0, 18.0, 14.0), g
   );
   public static final fbu l = fbr.a(
      djm.a(10.666667, 10.0, 0.0, 15.0, 14.0, 16.0), djm.a(6.333333, 12.0, 0.0, 10.666667, 16.0, 16.0), djm.a(2.0, 14.0, 0.0, 6.333333, 18.0, 16.0), g
   );
   public static final fbu m = fbr.a(
      djm.a(0.0, 10.0, 10.666667, 16.0, 14.0, 15.0), djm.a(0.0, 12.0, 6.333333, 16.0, 16.0, 10.666667), djm.a(0.0, 14.0, 2.0, 16.0, 18.0, 6.333333), g
   );
   private static final int n = 2;

   @Override
   public MapCodec<dnz> a() {
      return a;
   }

   protected dnz(dww.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jn.c).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected dpx a_(dwx $$0) {
      return dpx.c;
   }

   @Override
   protected fbu d_(dwx $$0) {
      return g;
   }

   @Override
   protected boolean g_(dwx $$0) {
      return true;
   }

   @Override
   public dwx a(dag $$0) {
      dgi $$1 = $$0.q();
      cwp $$2 = $$0.n();
      cox $$3 = $$0.o();
      boolean $$4 = false;
      if (!$$1.C && $$3 != null && $$3.gG()) {
         cyy $$5 = $$2.a(kv.Y, cyy.a);
         if ($$5.a("Book")) {
            $$4 = true;
         }
      }

      return this.m().b(b, $$0.g().g()).b(d, Boolean.valueOf($$4));
   }

   @Override
   protected fbu b(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return i;
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      switch ((jn)$$0.c(b)) {
         case c:
            return k;
         case d:
            return m;
         case f:
            return l;
         case e:
            return j;
         default:
            return g;
      }
   }

   @Override
   protected dwx a(dwx $$0, dqe $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dwx a(dwx $$0, dol $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public dtz a(ji $$0, dwx $$1) {
      return new dve($$0, $$1);
   }

   public static boolean a(@Nullable bvg $$0, dgi $$1, ji $$2, dwx $$3, cwp $$4) {
      if (!$$3.c(d)) {
         if (!$$1.C) {
            b($$0, $$1, $$2, $$3, $$4);
         }

         return true;
      } else {
         return false;
      }
   }

   private static void b(@Nullable bvg $$0, dgi $$1, ji $$2, dwx $$3, cwp $$4) {
      if ($$1.c_($$2) instanceof dve $$6) {
         $$6.b($$4.b(1, $$0));
         a($$0, $$1, $$2, $$3, true);
         $$1.a(null, $$2, awa.cz, awb.e, 1.0F, 1.0F);
      }
   }

   public static void a(@Nullable buk $$0, dgi $$1, ji $$2, dwx $$3, boolean $$4) {
      dwx $$5 = $$3.b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf($$4));
      $$1.a($$2, $$5, 3);
      $$1.a(ebt.c, $$2, ebt.a.a($$0, $$5));
      b($$1, $$2, $$3);
   }

   public static void a(dgi $$0, ji $$1, dwx $$2) {
      a($$0, $$1, $$2, true);
      $$0.a($$1, $$2.b(), 2);
      $$0.c(1043, $$1, 0);
   }

   private static void a(dgi $$0, ji $$1, dwx $$2, boolean $$3) {
      $$0.a($$1, $$2.b(c, Boolean.valueOf($$3)), 3);
      b($$0, $$1, $$2);
   }

   private static void b(dgi $$0, ji $$1, dwx $$2) {
      euh $$3 = eud.a($$0, $$2.c(b).g(), jn.b);
      $$0.a($$1.e(), $$2.b(), $$3);
   }

   @Override
   protected void a(dwx $$0, arc $$1, ji $$2, azh $$3) {
      a($$1, $$2, $$0, false);
   }

   @Override
   protected void a(dwx $$0, dgi $$1, ji $$2, dwx $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
         if ($$0.c(c)) {
            b($$1, $$2, $$0);
         }
      }
   }

   private void e(dwx $$0, dgi $$1, ji $$2) {
      if ($$1.c_($$2) instanceof dve $$4) {
         jn $$5 = $$0.c(b);
         cwp $$6 = $$4.b().v();
         float $$7 = 0.25F * (float)$$5.j();
         float $$8 = 0.25F * (float)$$5.l();
         clb $$9 = new clb($$1, (double)$$2.u() + 0.5 + (double)$$7, (double)($$2.v() + 1), (double)$$2.w() + 0.5 + (double)$$8, $$6);
         $$9.s();
         $$1.b($$9);
         $$4.a();
      }
   }

   @Override
   protected boolean f_(dwx $$0) {
      return true;
   }

   @Override
   protected int a(dwx $$0, dfn $$1, ji $$2, jn $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(dwx $$0, dfn $$1, ji $$2, jn $$3) {
      return $$3 == jn.b && $$0.c(c) ? 15 : 0;
   }

   @Override
   protected boolean c_(dwx $$0) {
      return true;
   }

   @Override
   protected int a(dwx $$0, dgi $$1, ji $$2) {
      if ($$0.c(d)) {
         dtz $$3 = $$1.c_($$2);
         if ($$3 instanceof dve) {
            return ((dve)$$3).j();
         }
      }

      return 0;
   }

   @Override
   protected bsj a(cwp $$0, dwx $$1, dgi $$2, ji $$3, cox $$4, bsi $$5, faw $$6) {
      if ($$1.c(d)) {
         return bsj.f;
      } else if ($$0.a(awy.aY)) {
         return (bsj)(a($$4, $$2, $$3, $$1, $$0) ? bsj.a : bsj.e);
      } else {
         return (bsj)($$0.f() && $$5 == bsi.a ? bsj.e : bsj.f);
      }
   }

   @Override
   protected bsj a(dwx $$0, dgi $$1, ji $$2, cox $$3, faw $$4) {
      if ($$0.c(d)) {
         if (!$$1.C) {
            this.a($$1, $$2, $$3);
         }

         return bsj.a;
      } else {
         return bsj.c;
      }
   }

   @Nullable
   @Override
   protected bsl b(dwx $$0, dgi $$1, ji $$2) {
      return !$$0.c(d) ? null : super.b($$0, $$1, $$2);
   }

   private void a(dgi $$0, ji $$1, cox $$2) {
      dtz $$3 = $$0.c_($$1);
      if ($$3 instanceof dve) {
         $$2.a((dve)$$3);
         $$2.a(awk.au);
      }
   }

   @Override
   protected boolean a(dwx $$0, eto $$1) {
      return false;
   }
}
