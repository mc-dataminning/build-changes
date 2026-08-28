import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dny extends dix {
   public static final MapCodec<dny> a = b(dny::new);
   public static final dxt<jn> b = dnj.aF;
   public static final dxn c = dxm.B;
   public static final dxn d = dxm.s;
   public static final fbt e = djl.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final fbt f = djl.a(4.0, 2.0, 4.0, 12.0, 14.0, 12.0);
   public static final fbt g = fbq.a(e, f);
   public static final fbt h = djl.a(0.0, 15.0, 0.0, 16.0, 15.0, 16.0);
   public static final fbt i = fbq.a(g, h);
   public static final fbt j = fbq.a(
      djl.a(1.0, 10.0, 0.0, 5.333333, 14.0, 16.0), djl.a(5.333333, 12.0, 0.0, 9.666667, 16.0, 16.0), djl.a(9.666667, 14.0, 0.0, 14.0, 18.0, 16.0), g
   );
   public static final fbt k = fbq.a(
      djl.a(0.0, 10.0, 1.0, 16.0, 14.0, 5.333333), djl.a(0.0, 12.0, 5.333333, 16.0, 16.0, 9.666667), djl.a(0.0, 14.0, 9.666667, 16.0, 18.0, 14.0), g
   );
   public static final fbt l = fbq.a(
      djl.a(10.666667, 10.0, 0.0, 15.0, 14.0, 16.0), djl.a(6.333333, 12.0, 0.0, 10.666667, 16.0, 16.0), djl.a(2.0, 14.0, 0.0, 6.333333, 18.0, 16.0), g
   );
   public static final fbt m = fbq.a(
      djl.a(0.0, 10.0, 10.666667, 16.0, 14.0, 15.0), djl.a(0.0, 12.0, 6.333333, 16.0, 16.0, 10.666667), djl.a(0.0, 14.0, 2.0, 16.0, 18.0, 6.333333), g
   );
   private static final int n = 2;

   @Override
   public MapCodec<dny> a() {
      return a;
   }

   protected dny(dwv.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jn.c).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected fbt d_(dww $$0) {
      return g;
   }

   @Override
   protected boolean g_(dww $$0) {
      return true;
   }

   @Override
   public dww a(daf $$0) {
      dgh $$1 = $$0.q();
      cwo $$2 = $$0.n();
      cow $$3 = $$0.o();
      boolean $$4 = false;
      if (!$$1.C && $$3 != null && $$3.gG()) {
         cyx $$5 = $$2.a(kv.Y, cyx.a);
         if ($$5.a("Book")) {
            $$4 = true;
         }
      }

      return this.m().b(b, $$0.g().g()).b(d, Boolean.valueOf($$4));
   }

   @Override
   protected fbt b(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return i;
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
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
   protected dww a(dww $$0, dqd $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dww a(dww $$0, dok $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public dty a(ji $$0, dww $$1) {
      return new dvd($$0, $$1);
   }

   public static boolean a(@Nullable bvg $$0, dgh $$1, ji $$2, dww $$3, cwo $$4) {
      if (!$$3.c(d)) {
         if (!$$1.C) {
            b($$0, $$1, $$2, $$3, $$4);
         }

         return true;
      } else {
         return false;
      }
   }

   private static void b(@Nullable bvg $$0, dgh $$1, ji $$2, dww $$3, cwo $$4) {
      if ($$1.c_($$2) instanceof dvd $$6) {
         $$6.b($$4.b(1, $$0));
         a($$0, $$1, $$2, $$3, true);
         $$1.a(null, $$2, awa.cz, awb.e, 1.0F, 1.0F);
      }
   }

   public static void a(@Nullable buk $$0, dgh $$1, ji $$2, dww $$3, boolean $$4) {
      dww $$5 = $$3.b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf($$4));
      $$1.a($$2, $$5, 3);
      $$1.a(ebs.c, $$2, ebs.a.a($$0, $$5));
      b($$1, $$2, $$3);
   }

   public static void a(dgh $$0, ji $$1, dww $$2) {
      a($$0, $$1, $$2, true);
      $$0.a($$1, $$2.b(), 2);
      $$0.c(1043, $$1, 0);
   }

   private static void a(dgh $$0, ji $$1, dww $$2, boolean $$3) {
      $$0.a($$1, $$2.b(c, Boolean.valueOf($$3)), 3);
      b($$0, $$1, $$2);
   }

   private static void b(dgh $$0, ji $$1, dww $$2) {
      eug $$3 = euc.a($$0, $$2.c(b).g(), jn.b);
      $$0.a($$1.e(), $$2.b(), $$3);
   }

   @Override
   protected void a(dww $$0, ard $$1, ji $$2, azh $$3) {
      a($$1, $$2, $$0, false);
   }

   @Override
   protected void a(dww $$0, dgh $$1, ji $$2, dww $$3, boolean $$4) {
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

   private void e(dww $$0, dgh $$1, ji $$2) {
      if ($$1.c_($$2) instanceof dvd $$4) {
         jn $$5 = $$0.c(b);
         cwo $$6 = $$4.b().v();
         float $$7 = 0.25F * (float)$$5.j();
         float $$8 = 0.25F * (float)$$5.l();
         clb $$9 = new clb($$1, (double)$$2.u() + 0.5 + (double)$$7, (double)($$2.v() + 1), (double)$$2.w() + 0.5 + (double)$$8, $$6);
         $$9.s();
         $$1.b($$9);
         $$4.a();
      }
   }

   @Override
   protected boolean f_(dww $$0) {
      return true;
   }

   @Override
   protected int a(dww $$0, dfm $$1, ji $$2, jn $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(dww $$0, dfm $$1, ji $$2, jn $$3) {
      return $$3 == jn.b && $$0.c(c) ? 15 : 0;
   }

   @Override
   protected boolean c_(dww $$0) {
      return true;
   }

   @Override
   protected int a(dww $$0, dgh $$1, ji $$2) {
      if ($$0.c(d)) {
         dty $$3 = $$1.c_($$2);
         if ($$3 instanceof dvd) {
            return ((dvd)$$3).j();
         }
      }

      return 0;
   }

   @Override
   protected bsj a(cwo $$0, dww $$1, dgh $$2, ji $$3, cow $$4, bsi $$5, fav $$6) {
      if ($$1.c(d)) {
         return bsj.f;
      } else if ($$0.a(awy.aY)) {
         return (bsj)(a($$4, $$2, $$3, $$1, $$0) ? bsj.a : bsj.e);
      } else {
         return (bsj)($$0.f() && $$5 == bsi.a ? bsj.e : bsj.f);
      }
   }

   @Override
   protected bsj a(dww $$0, dgh $$1, ji $$2, cow $$3, fav $$4) {
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
   protected bsl b(dww $$0, dgh $$1, ji $$2) {
      return !$$0.c(d) ? null : super.b($$0, $$1, $$2);
   }

   private void a(dgh $$0, ji $$1, cow $$2) {
      dty $$3 = $$0.c_($$1);
      if ($$3 instanceof dvd) {
         $$2.a((dvd)$$3);
         $$2.a(awk.au);
      }
   }

   @Override
   protected boolean a(dww $$0, etn $$1) {
      return false;
   }
}
