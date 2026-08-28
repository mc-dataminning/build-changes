import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkj extends dfk {
   public static final MapCodec<dkj> a = b(dkj::new);
   public static final dtw b = dju.aE;
   public static final dtt c = dts.w;
   public static final dtt d = dts.o;
   public static final ext e = dfy.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final ext f = dfy.a(4.0, 2.0, 4.0, 12.0, 14.0, 12.0);
   public static final ext g = exq.a(e, f);
   public static final ext h = dfy.a(0.0, 15.0, 0.0, 16.0, 15.0, 16.0);
   public static final ext i = exq.a(g, h);
   public static final ext j = exq.a(
      dfy.a(1.0, 10.0, 0.0, 5.333333, 14.0, 16.0), dfy.a(5.333333, 12.0, 0.0, 9.666667, 16.0, 16.0), dfy.a(9.666667, 14.0, 0.0, 14.0, 18.0, 16.0), g
   );
   public static final ext k = exq.a(
      dfy.a(0.0, 10.0, 1.0, 16.0, 14.0, 5.333333), dfy.a(0.0, 12.0, 5.333333, 16.0, 16.0, 9.666667), dfy.a(0.0, 14.0, 9.666667, 16.0, 18.0, 14.0), g
   );
   public static final ext l = exq.a(
      dfy.a(10.666667, 10.0, 0.0, 15.0, 14.0, 16.0), dfy.a(6.333333, 12.0, 0.0, 10.666667, 16.0, 16.0), dfy.a(2.0, 14.0, 0.0, 6.333333, 18.0, 16.0), g
   );
   public static final ext m = exq.a(
      dfy.a(0.0, 10.0, 10.666667, 16.0, 14.0, 15.0), dfy.a(0.0, 12.0, 6.333333, 16.0, 16.0, 10.666667), dfy.a(0.0, 14.0, 2.0, 16.0, 18.0, 6.333333), g
   );
   private static final int n = 2;

   @Override
   public MapCodec<dkj> a() {
      return a;
   }

   protected dkj(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ji.c).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected dmf a_(dtc $$0) {
      return dmf.c;
   }

   @Override
   protected ext f(dtc $$0, dcc $$1, jd $$2) {
      return g;
   }

   @Override
   protected boolean f_(dtc $$0) {
      return true;
   }

   @Override
   public dtc a(cyd $$0) {
      dcw $$1 = $$0.q();
      cuq $$2 = $$0.n();
      cmx $$3 = $$0.o();
      boolean $$4 = false;
      if (!$$1.B && $$3 != null && $$3.gw()) {
         cxh $$5 = $$2.a(kq.O, cxh.a);
         if ($$5.a("Book")) {
            $$4 = true;
         }
      }

      return this.o().a(b, $$0.g().g()).a(d, Boolean.valueOf($$4));
   }

   @Override
   protected ext b(dtc $$0, dcc $$1, jd $$2, exf $$3) {
      return i;
   }

   @Override
   protected ext a(dtc $$0, dcc $$1, jd $$2, exf $$3) {
      switch ((ji)$$0.c(b)) {
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
   protected dtc a(dtc $$0, dmm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dtc a(dtc $$0, dkv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public dqh a(jd $$0, dtc $$1) {
      return new drk($$0, $$1);
   }

   public static boolean a(@Nullable btn $$0, dcw $$1, jd $$2, dtc $$3, cuq $$4) {
      if (!$$3.c(d)) {
         if (!$$1.B) {
            b($$0, $$1, $$2, $$3, $$4);
         }

         return true;
      } else {
         return false;
      }
   }

   private static void b(@Nullable btn $$0, dcw $$1, jd $$2, dtc $$3, cuq $$4) {
      if ($$1.c_($$2) instanceof drk $$6) {
         $$6.b($$4.b(1, $$0));
         a($$0, $$1, $$2, $$3, true);
         $$1.a(null, $$2, avp.cz, avq.e, 1.0F, 1.0F);
      }
   }

   public static void a(@Nullable bsr $$0, dcw $$1, jd $$2, dtc $$3, boolean $$4) {
      dtc $$5 = $$3.a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf($$4));
      $$1.a($$2, $$5, 3);
      $$1.a(dxz.c, $$2, dxz.a.a($$0, $$5));
      b($$1, $$2, $$3);
   }

   public static void a(dcw $$0, jd $$1, dtc $$2) {
      a($$0, $$1, $$2, true);
      $$0.a($$1, $$2.b(), 2);
      $$0.c(1043, $$1, 0);
   }

   private static void a(dcw $$0, jd $$1, dtc $$2, boolean $$3) {
      $$0.a($$1, $$2.a(c, Boolean.valueOf($$3)), 3);
      b($$0, $$1, $$2);
   }

   private static void b(dcw $$0, jd $$1, dtc $$2) {
      $$0.a($$1.e(), $$2.b());
   }

   @Override
   protected void a(dtc $$0, aqu $$1, jd $$2, ayw $$3) {
      a($$1, $$2, $$0, false);
   }

   @Override
   protected void a(dtc $$0, dcw $$1, jd $$2, dtc $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d)) {
            this.d($$0, $$1, $$2);
         }

         if ($$0.c(c)) {
            $$1.a($$2.e(), this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   private void d(dtc $$0, dcw $$1, jd $$2) {
      if ($$1.c_($$2) instanceof drk $$4) {
         ji $$5 = $$0.c(b);
         cuq $$6 = $$4.b().s();
         float $$7 = 0.25F * (float)$$5.j();
         float $$8 = 0.25F * (float)$$5.l();
         cjh $$9 = new cjh($$1, (double)$$2.u() + 0.5 + (double)$$7, (double)($$2.v() + 1), (double)$$2.w() + 0.5 + (double)$$8, $$6);
         $$9.v();
         $$1.b($$9);
         $$4.a();
      }
   }

   @Override
   protected boolean e_(dtc $$0) {
      return true;
   }

   @Override
   protected int a(dtc $$0, dcc $$1, jd $$2, ji $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(dtc $$0, dcc $$1, jd $$2, ji $$3) {
      return $$3 == ji.b && $$0.c(c) ? 15 : 0;
   }

   @Override
   protected boolean c_(dtc $$0) {
      return true;
   }

   @Override
   protected int a(dtc $$0, dcw $$1, jd $$2) {
      if ($$0.c(d)) {
         dqh $$3 = $$1.c_($$2);
         if ($$3 instanceof drk) {
            return ((drk)$$3).j();
         }
      }

      return 0;
   }

   @Override
   protected bqt a(cuq $$0, dtc $$1, dcw $$2, jd $$3, cmx $$4, bqq $$5, eww $$6) {
      if ($$1.c(d)) {
         return bqt.d;
      } else if ($$0.a(awn.aU)) {
         return a($$4, $$2, $$3, $$1, $$0) ? bqt.a($$2.B) : bqt.e;
      } else {
         return $$0.e() && $$5 == bqq.a ? bqt.e : bqt.d;
      }
   }

   @Override
   protected bqr a(dtc $$0, dcw $$1, jd $$2, cmx $$3, eww $$4) {
      if ($$0.c(d)) {
         if (!$$1.B) {
            this.a($$1, $$2, $$3);
         }

         return bqr.a($$1.B);
      } else {
         return bqr.c;
      }
   }

   @Nullable
   @Override
   protected bqv b(dtc $$0, dcw $$1, jd $$2) {
      return !$$0.c(d) ? null : super.b($$0, $$1, $$2);
   }

   private void a(dcw $$0, jd $$1, cmx $$2) {
      dqh $$3 = $$0.c_($$1);
      if ($$3 instanceof drk) {
         $$2.a((drk)$$3);
         $$2.a(avz.au);
      }
   }

   @Override
   protected boolean a(dtc $$0, epr $$1) {
      return false;
   }
}
