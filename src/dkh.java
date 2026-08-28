import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkh extends dfi {
   public static final MapCodec<dkh> a = b(dkh::new);
   public static final dtu b = djs.aE;
   public static final dtr c = dtq.w;
   public static final dtr d = dtq.o;
   public static final exp e = dfw.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final exp f = dfw.a(4.0, 2.0, 4.0, 12.0, 14.0, 12.0);
   public static final exp g = exm.a(e, f);
   public static final exp h = dfw.a(0.0, 15.0, 0.0, 16.0, 15.0, 16.0);
   public static final exp i = exm.a(g, h);
   public static final exp j = exm.a(
      dfw.a(1.0, 10.0, 0.0, 5.333333, 14.0, 16.0), dfw.a(5.333333, 12.0, 0.0, 9.666667, 16.0, 16.0), dfw.a(9.666667, 14.0, 0.0, 14.0, 18.0, 16.0), g
   );
   public static final exp k = exm.a(
      dfw.a(0.0, 10.0, 1.0, 16.0, 14.0, 5.333333), dfw.a(0.0, 12.0, 5.333333, 16.0, 16.0, 9.666667), dfw.a(0.0, 14.0, 9.666667, 16.0, 18.0, 14.0), g
   );
   public static final exp l = exm.a(
      dfw.a(10.666667, 10.0, 0.0, 15.0, 14.0, 16.0), dfw.a(6.333333, 12.0, 0.0, 10.666667, 16.0, 16.0), dfw.a(2.0, 14.0, 0.0, 6.333333, 18.0, 16.0), g
   );
   public static final exp m = exm.a(
      dfw.a(0.0, 10.0, 10.666667, 16.0, 14.0, 15.0), dfw.a(0.0, 12.0, 6.333333, 16.0, 16.0, 10.666667), dfw.a(0.0, 14.0, 2.0, 16.0, 18.0, 6.333333), g
   );
   private static final int n = 2;

   @Override
   public MapCodec<dkh> a() {
      return a;
   }

   protected dkh(dsz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ji.c).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected dmd a_(dta $$0) {
      return dmd.c;
   }

   @Override
   protected exp f(dta $$0, dca $$1, jd $$2) {
      return g;
   }

   @Override
   protected boolean f_(dta $$0) {
      return true;
   }

   @Override
   public dta a(cyb $$0) {
      dcu $$1 = $$0.q();
      cuo $$2 = $$0.n();
      cmv $$3 = $$0.o();
      boolean $$4 = false;
      if (!$$1.B && $$3 != null && $$3.gw()) {
         cxf $$5 = $$2.a(kq.O, cxf.a);
         if ($$5.a("Book")) {
            $$4 = true;
         }
      }

      return this.o().a(b, $$0.g().g()).a(d, Boolean.valueOf($$4));
   }

   @Override
   protected exp b(dta $$0, dca $$1, jd $$2, exb $$3) {
      return i;
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
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
   protected dta a(dta $$0, dmk $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dta a(dta $$0, dkt $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public dqf a(jd $$0, dta $$1) {
      return new dri($$0, $$1);
   }

   public static boolean a(@Nullable btl $$0, dcu $$1, jd $$2, dta $$3, cuo $$4) {
      if (!$$3.c(d)) {
         if (!$$1.B) {
            b($$0, $$1, $$2, $$3, $$4);
         }

         return true;
      } else {
         return false;
      }
   }

   private static void b(@Nullable btl $$0, dcu $$1, jd $$2, dta $$3, cuo $$4) {
      if ($$1.c_($$2) instanceof dri $$6) {
         $$6.b($$4.b(1, $$0));
         a($$0, $$1, $$2, $$3, true);
         $$1.a(null, $$2, avo.cz, avp.e, 1.0F, 1.0F);
      }
   }

   public static void a(@Nullable bsq $$0, dcu $$1, jd $$2, dta $$3, boolean $$4) {
      dta $$5 = $$3.a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf($$4));
      $$1.a($$2, $$5, 3);
      $$1.a(dxw.c, $$2, dxw.a.a($$0, $$5));
      b($$1, $$2, $$3);
   }

   public static void a(dcu $$0, jd $$1, dta $$2) {
      a($$0, $$1, $$2, true);
      $$0.a($$1, $$2.b(), 2);
      $$0.c(1043, $$1, 0);
   }

   private static void a(dcu $$0, jd $$1, dta $$2, boolean $$3) {
      $$0.a($$1, $$2.a(c, Boolean.valueOf($$3)), 3);
      b($$0, $$1, $$2);
   }

   private static void b(dcu $$0, jd $$1, dta $$2) {
      $$0.a($$1.d(), $$2.b());
   }

   @Override
   protected void a(dta $$0, aqt $$1, jd $$2, ayv $$3) {
      a($$1, $$2, $$0, false);
   }

   @Override
   protected void a(dta $$0, dcu $$1, jd $$2, dta $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d)) {
            this.d($$0, $$1, $$2);
         }

         if ($$0.c(c)) {
            $$1.a($$2.d(), this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   private void d(dta $$0, dcu $$1, jd $$2) {
      if ($$1.c_($$2) instanceof dri $$4) {
         ji $$5 = $$0.c(b);
         cuo $$6 = $$4.b().s();
         float $$7 = 0.25F * (float)$$5.j();
         float $$8 = 0.25F * (float)$$5.l();
         cjf $$9 = new cjf($$1, (double)$$2.u() + 0.5 + (double)$$7, (double)($$2.v() + 1), (double)$$2.w() + 0.5 + (double)$$8, $$6);
         $$9.v();
         $$1.b($$9);
         $$4.a();
      }
   }

   @Override
   protected boolean e_(dta $$0) {
      return true;
   }

   @Override
   protected int a(dta $$0, dca $$1, jd $$2, ji $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(dta $$0, dca $$1, jd $$2, ji $$3) {
      return $$3 == ji.b && $$0.c(c) ? 15 : 0;
   }

   @Override
   protected boolean c_(dta $$0) {
      return true;
   }

   @Override
   protected int a(dta $$0, dcu $$1, jd $$2) {
      if ($$0.c(d)) {
         dqf $$3 = $$1.c_($$2);
         if ($$3 instanceof dri) {
            return ((dri)$$3).j();
         }
      }

      return 0;
   }

   @Override
   protected bqs a(cuo $$0, dta $$1, dcu $$2, jd $$3, cmv $$4, bqp $$5, ews $$6) {
      if ($$1.c(d)) {
         return bqs.d;
      } else if ($$0.a(awm.aU)) {
         return a($$4, $$2, $$3, $$1, $$0) ? bqs.a($$2.B) : bqs.e;
      } else {
         return $$0.e() && $$5 == bqp.a ? bqs.e : bqs.d;
      }
   }

   @Override
   protected bqq a(dta $$0, dcu $$1, jd $$2, cmv $$3, ews $$4) {
      if ($$0.c(d)) {
         if (!$$1.B) {
            this.a($$1, $$2, $$3);
         }

         return bqq.a($$1.B);
      } else {
         return bqq.c;
      }
   }

   @Nullable
   @Override
   protected bqu b(dta $$0, dcu $$1, jd $$2) {
      return !$$0.c(d) ? null : super.b($$0, $$1, $$2);
   }

   private void a(dcu $$0, jd $$1, cmv $$2) {
      dqf $$3 = $$0.c_($$1);
      if ($$3 instanceof dri) {
         $$2.a((dri)$$3);
         $$2.a(avy.au);
      }
   }

   @Override
   protected boolean a(dta $$0, epn $$1) {
      return false;
   }
}
