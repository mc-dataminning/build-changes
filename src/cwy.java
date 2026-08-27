import javax.annotation.Nullable;

public class cwy extends csd {
   public static final dfy a = cwj.aC;
   public static final dfv b = dfu.w;
   public static final dfv c = dfu.o;
   public static final eib d = csq.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final eib e = csq.a(4.0, 2.0, 4.0, 12.0, 14.0, 12.0);
   public static final eib f = ehy.a(d, e);
   public static final eib g = csq.a(0.0, 15.0, 0.0, 16.0, 15.0, 16.0);
   public static final eib h = ehy.a(f, g);
   public static final eib i = ehy.a(
      csq.a(1.0, 10.0, 0.0, 5.333333, 14.0, 16.0), csq.a(5.333333, 12.0, 0.0, 9.666667, 16.0, 16.0), csq.a(9.666667, 14.0, 0.0, 14.0, 18.0, 16.0), f
   );
   public static final eib j = ehy.a(
      csq.a(0.0, 10.0, 1.0, 16.0, 14.0, 5.333333), csq.a(0.0, 12.0, 5.333333, 16.0, 16.0, 9.666667), csq.a(0.0, 14.0, 9.666667, 16.0, 18.0, 14.0), f
   );
   public static final eib k = ehy.a(
      csq.a(10.666667, 10.0, 0.0, 15.0, 14.0, 16.0), csq.a(6.333333, 12.0, 0.0, 10.666667, 16.0, 16.0), csq.a(2.0, 14.0, 0.0, 6.333333, 18.0, 16.0), f
   );
   public static final eib l = ehy.a(
      csq.a(0.0, 10.0, 10.666667, 16.0, 14.0, 15.0), csq.a(0.0, 12.0, 6.333333, 16.0, 16.0, 10.666667), csq.a(0.0, 14.0, 2.0, 16.0, 18.0, 6.333333), f
   );
   private static final int m = 2;

   protected cwy(dfd.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, hc.c).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   public cyv b_(dfe $$0) {
      return cyv.c;
   }

   @Override
   public eib f(dfe $$0, cow $$1, gw $$2) {
      return f;
   }

   @Override
   public boolean g_(dfe $$0) {
      return true;
   }

   @Override
   public dfe a(cli $$0) {
      cpq $$1 = $$0.q();
      cja $$2 = $$0.n();
      cbp $$3 = $$0.o();
      boolean $$4 = false;
      if (!$$1.B && $$3 != null && $$3.gn()) {
         qu $$5 = cgt.a($$2);
         if ($$5 != null && $$5.e("Book")) {
            $$4 = true;
         }
      }

      return this.n().a(a, $$0.g().g()).a(c, Boolean.valueOf($$4));
   }

   @Override
   public eib c(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return h;
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
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
   public dfe a(dfe $$0, czc $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfe a(dfe $$0, cxl $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(a, b, c);
   }

   @Override
   public dcq a(gw $$0, dfe $$1) {
      return new ddr($$0, $$1);
   }

   public static boolean a(@Nullable bil $$0, cpq $$1, gw $$2, dfe $$3, cja $$4) {
      if (!$$3.c(c)) {
         if (!$$1.B) {
            b($$0, $$1, $$2, $$3, $$4);
         }

         return true;
      } else {
         return false;
      }
   }

   private static void b(@Nullable bil $$0, cpq $$1, gw $$2, dfe $$3, cja $$4) {
      if ($$1.c_($$2) instanceof ddr $$6) {
         $$6.a($$4.a(1));
         a($$0, $$1, $$2, $$3, true);
         $$1.a(null, $$2, aoz.cf, apa.e, 1.0F, 1.0F);
      }
   }

   public static void a(@Nullable bil $$0, cpq $$1, gw $$2, dfe $$3, boolean $$4) {
      dfe $$5 = $$3.a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf($$4));
      $$1.a($$2, $$5, 3);
      $$1.a(djo.c, $$2, djo.a.a($$0, $$5));
      b($$1, $$2, $$3);
   }

   public static void a(cpq $$0, gw $$1, dfe $$2) {
      a($$0, $$1, $$2, true);
      $$0.a($$1, $$2.b(), 2);
      $$0.c(1043, $$1, 0);
   }

   private static void a(cpq $$0, gw $$1, dfe $$2, boolean $$3) {
      $$0.a($$1, $$2.a(b, Boolean.valueOf($$3)), 3);
      b($$0, $$1, $$2);
   }

   private static void b(cpq $$0, gw $$1, dfe $$2) {
      $$0.a($$1.d(), $$2.b());
   }

   @Override
   public void a(dfe $$0, akn $$1, gw $$2, arx $$3) {
      a($$1, $$2, $$0, false);
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, dfe $$3, boolean $$4) {
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

   private void d(dfe $$0, cpq $$1, gw $$2) {
      if ($$1.c_($$2) instanceof ddr $$4) {
         hc $$5 = $$0.c(a);
         cja $$6 = $$4.c().p();
         float $$7 = 0.25F * (float)$$5.j();
         float $$8 = 0.25F * (float)$$5.l();
         byi $$9 = new byi($$1, (double)$$2.u() + 0.5 + (double)$$7, (double)($$2.v() + 1), (double)$$2.w() + 0.5 + (double)$$8, $$6);
         $$9.o();
         $$1.b($$9);
         $$4.a();
      }
   }

   @Override
   public boolean f_(dfe $$0) {
      return true;
   }

   @Override
   public int a(dfe $$0, cow $$1, gw $$2, hc $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   public int b(dfe $$0, cow $$1, gw $$2, hc $$3) {
      return $$3 == hc.b && $$0.c(b) ? 15 : 0;
   }

   @Override
   public boolean d_(dfe $$0) {
      return true;
   }

   @Override
   public int a(dfe $$0, cpq $$1, gw $$2) {
      if ($$0.c(c)) {
         dcq $$3 = $$1.c_($$2);
         if ($$3 instanceof ddr) {
            return ((ddr)$$3).i();
         }
      }

      return 0;
   }

   @Override
   public bgt a(dfe $$0, cpq $$1, gw $$2, cbp $$3, bgs $$4, ehe $$5) {
      if ($$0.c(c)) {
         if (!$$1.B) {
            this.a($$1, $$2, $$3);
         }

         return bgt.a($$1.B);
      } else {
         cja $$6 = $$3.b($$4);
         return !$$6.b() && !$$6.a(apw.au) ? bgt.b : bgt.d;
      }
   }

   @Nullable
   @Override
   public bgw b(dfe $$0, cpq $$1, gw $$2) {
      return !$$0.c(c) ? null : super.b($$0, $$1, $$2);
   }

   private void a(cpq $$0, gw $$1, cbp $$2) {
      dcq $$3 = $$0.c_($$1);
      if ($$3 instanceof ddr) {
         $$2.a((ddr)$$3);
         $$2.a(apj.au);
      }
   }

   @Override
   public boolean a(dfe $$0, cow $$1, gw $$2, eax $$3) {
      return false;
   }
}
