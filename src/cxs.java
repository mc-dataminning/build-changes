import com.mojang.serialization.MapCodec;

public class cxs extends cxp {
   public static final MapCodec<cxs> a = b(cxs::new);
   private static final double c = 0.13;
   private static final double e = 0.08;
   private static final double f = 0.05;
   private static final int g = 20;
   protected static final eiy b = cua.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);

   @Override
   public MapCodec<cxs> a() {
      return a;
   }

   public cxs(dga.d $$0) {
      super($$0);
   }

   private static boolean c(bjt $$0) {
      return $$0 instanceof bkj || $$0 instanceof ceo || $$0 instanceof bzr || $$0 instanceof ceq;
   }

   @Override
   public eiy c(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return b;
   }

   @Override
   public void a(cqz $$0, dgb $$1, ht $$2, bjt $$3, float $$4) {
      $$3.a(aqd.la, 1.0F, 1.0F);
      if (!$$0.B) {
         $$0.a($$3, (byte)54);
      }

      if ($$3.a($$4, 0.2F, $$0.ag().k())) {
         $$3.a(this.aJ.g(), this.aJ.a() * 0.5F, this.aJ.b() * 0.75F);
      }
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, bjt $$3) {
      if (this.a($$2, $$3)) {
         this.a($$3, $$2);
         this.d($$3);
         this.a($$1, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   private boolean a(ht $$0, bjt $$1) {
      if ($$1.aA()) {
         return false;
      } else if ($$1.ds() > (double)$$0.v() + 0.9375 - 1.0E-7) {
         return false;
      } else if ($$1.do().d >= -0.08) {
         return false;
      } else {
         double $$2 = Math.abs((double)$$0.u() + 0.5 - $$1.dq());
         double $$3 = Math.abs((double)$$0.w() + 0.5 - $$1.dw());
         double $$4 = 0.4375 + (double)($$1.df() / 2.0F);
         return $$2 + 1.0E-7 > $$4 || $$3 + 1.0E-7 > $$4;
      }
   }

   private void a(bjt $$0, ht $$1) {
      if ($$0 instanceof alr && $$0.dL().V() % 20L == 0L) {
         al.J.a((alr)$$0, $$0.dL().a_($$1));
      }
   }

   private void d(bjt $$0) {
      eif $$1 = $$0.do();
      if ($$1.d < -0.13) {
         double $$2 = -0.05 / $$1.d;
         $$0.f(new eif($$1.c * $$2, -0.05, $$1.e * $$2));
      } else {
         $$0.f(new eif($$1.c, -0.05, $$1.e));
      }

      $$0.n();
   }

   private void a(cqz $$0, bjt $$1) {
      if (c($$1)) {
         if ($$0.z.a(5) == 0) {
            $$1.a(aqd.la, 1.0F, 1.0F);
         }

         if (!$$0.B && $$0.z.a(5) == 0) {
            $$0.a($$1, (byte)53);
         }
      }
   }

   public static void a(bjt $$0) {
      a($$0, 5);
   }

   public static void b(bjt $$0) {
      a($$0, 10);
   }

   private static void a(bjt $$0, int $$1) {
      if ($$0.dL().B) {
         dgb $$2 = cuc.pg.o();

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            $$0.dL().a(new jk(js.c, $$2), $$0.dq(), $$0.ds(), $$0.dw(), 0.0, 0.0, 0.0);
         }
      }
   }
}
