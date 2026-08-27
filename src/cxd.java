import javax.annotation.Nullable;

public class cxd extends csi {
   public static final dgd a = cwo.aC;
   public static final dga b = dfz.w;
   public static final dga c = dfz.o;
   public static final eig d = csv.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final eig e = csv.a(4.0, 2.0, 4.0, 12.0, 14.0, 12.0);
   public static final eig f = eid.a(d, e);
   public static final eig g = csv.a(0.0, 15.0, 0.0, 16.0, 15.0, 16.0);
   public static final eig h = eid.a(f, g);
   public static final eig i = eid.a(
      csv.a(1.0, 10.0, 0.0, 5.333333, 14.0, 16.0), csv.a(5.333333, 12.0, 0.0, 9.666667, 16.0, 16.0), csv.a(9.666667, 14.0, 0.0, 14.0, 18.0, 16.0), f
   );
   public static final eig j = eid.a(
      csv.a(0.0, 10.0, 1.0, 16.0, 14.0, 5.333333), csv.a(0.0, 12.0, 5.333333, 16.0, 16.0, 9.666667), csv.a(0.0, 14.0, 9.666667, 16.0, 18.0, 14.0), f
   );
   public static final eig k = eid.a(
      csv.a(10.666667, 10.0, 0.0, 15.0, 14.0, 16.0), csv.a(6.333333, 12.0, 0.0, 10.666667, 16.0, 16.0), csv.a(2.0, 14.0, 0.0, 6.333333, 18.0, 16.0), f
   );
   public static final eig l = eid.a(
      csv.a(0.0, 10.0, 10.666667, 16.0, 14.0, 15.0), csv.a(0.0, 12.0, 6.333333, 16.0, 16.0, 10.666667), csv.a(0.0, 14.0, 2.0, 16.0, 18.0, 6.333333), f
   );
   private static final int m = 2;

   protected cxd(dfi.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, hc.c).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   public cza b_(dfj $$0) {
      return cza.c;
   }

   @Override
   public eig f(dfj $$0, cpb $$1, gw $$2) {
      return f;
   }

   @Override
   public boolean g_(dfj $$0) {
      return true;
   }

   @Override
   public dfj a(cln $$0) {
      cpv $$1 = $$0.q();
      cjf $$2 = $$0.n();
      cbu $$3 = $$0.o();
      boolean $$4 = false;
      if (!$$1.B && $$3 != null && $$3.go()) {
         qy $$5 = cgy.a($$2);
         if ($$5 != null && $$5.e("Book")) {
            $$4 = true;
         }
      }

      return this.n().a(a, $$0.g().g()).a(c, Boolean.valueOf($$4));
   }

   @Override
   public eig c(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return h;
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      switch ((hc)$$0.c(a)) {
         case c:
            return j;
         case d:
            return l;
         case f:
            return k;
         case e:
            return i;
         default:
            return f;
      }
   }

   @Override
   public dfj a(dfj $$0, czh $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfj a(dfj $$0, cxq $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(a, b, c);
   }

   @Override
   public dcv a(gw $$0, dfj $$1) {
      return new ddw($$0, $$1);
   }

   public static boolean a(@Nullable biq $$0, cpv $$1, gw $$2, dfj $$3, cjf $$4) {
      if (!$$3.c(c)) {
         if (!$$1.B) {
            b($$0, $$1, $$2, $$3, $$4);
         }

         return true;
      } else {
         return false;
      }
   }

   private static void b(@Nullable biq $$0, cpv $$1, gw $$2, dfj $$3, cjf $$4) {
      if ($$1.c_($$2) instanceof ddw $$6) {
         $$6.a($$4.a(1));
         a($$0, $$1, $$2, $$3, true);
         $$1.a(null, $$2, ape.cf, apf.e, 1.0F, 1.0F);
      }
   }

   public static void a(@Nullable biq $$0, cpv $$1, gw $$2, dfj $$3, boolean $$4) {
      dfj $$5 = $$3.a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf($$4));
      $$1.a($$2, $$5, 3);
      $$1.a(djt.c, $$2, djt.a.a($$0, $$5));
      b($$1, $$2, $$3);
   }

   public static void a(cpv $$0, gw $$1, dfj $$2) {
      a($$0, $$1, $$2, true);
      $$0.a($$1, $$2.b(), 2);
      $$0.c(1043, $$1, 0);
   }

   private static void a(cpv $$0, gw $$1, dfj $$2, boolean $$3) {
      $$0.a($$1, $$2.a(b, Boolean.valueOf($$3)), 3);
      b($$0, $$1, $$2);
   }

   private static void b(cpv $$0, gw $$1, dfj $$2) {
      $$0.a($$1.d(), $$2.b());
   }

   @Override
   public void a(dfj $$0, akr $$1, gw $$2, asc $$3) {
      a($$1, $$2, $$0, false);
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, dfj $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(c)) {
            this.d($$0, $$1, $$2);
         }

         if ($$0.c(b)) {
            $$1.a($$2.d(), this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   private void d(dfj $$0, cpv $$1, gw $$2) {
      if ($$1.c_($$2) instanceof ddw $$4) {
         hc $$5 = $$0.c(a);
         cjf $$6 = $$4.c().p();
         float $$7 = 0.25F * (float)$$5.j();
         float $$8 = 0.25F * (float)$$5.l();
         byn $$9 = new byn($$1, (double)$$2.u() + 0.5 + (double)$$7, (double)($$2.v() + 1), (double)$$2.w() + 0.5 + (double)$$8, $$6);
         $$9.t();
         $$1.b($$9);
         $$4.a();
      }
   }

   @Override
   public boolean f_(dfj $$0) {
      return true;
   }

   @Override
   public int a(dfj $$0, cpb $$1, gw $$2, hc $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   public int b(dfj $$0, cpb $$1, gw $$2, hc $$3) {
      return $$3 == hc.b && $$0.c(b) ? 15 : 0;
   }

   @Override
   public boolean d_(dfj $$0) {
      return true;
   }

   @Override
   public int a(dfj $$0, cpv $$1, gw $$2) {
      if ($$0.c(c)) {
         dcv $$3 = $$1.c_($$2);
         if ($$3 instanceof ddw) {
            return ((ddw)$$3).i();
         }
      }

      return 0;
   }

   @Override
   public bgy a(dfj $$0, cpv $$1, gw $$2, cbu $$3, bgx $$4, ehj $$5) {
      if ($$0.c(c)) {
         if (!$$1.B) {
            this.a($$1, $$2, $$3);
         }

         return bgy.a($$1.B);
      } else {
         cjf $$6 = $$3.b($$4);
         return !$$6.b() && !$$6.a(aqb.au) ? bgy.b : bgy.d;
      }
   }

   @Nullable
   @Override
   public bhb b(dfj $$0, cpv $$1, gw $$2) {
      return !$$0.c(c) ? null : super.b($$0, $$1, $$2);
   }

   private void a(cpv $$0, gw $$1, cbu $$2) {
      dcv $$3 = $$0.c_($$1);
      if ($$3 instanceof ddw) {
         $$2.a((ddw)$$3);
         $$2.a(apo.au);
      }
   }

   @Override
   public boolean a(dfj $$0, cpb $$1, gw $$2, ebc $$3) {
      return false;
   }
}
