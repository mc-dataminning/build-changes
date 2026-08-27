import javax.annotation.Nullable;

public class dae extends csv {
   public static final int a = 8;
   public static final dgj b = dfz.aF;
   protected static final eig[] c = new eig[]{
      eid.a(),
      csv.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      csv.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      csv.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      csv.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      csv.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      csv.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      csv.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      csv.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };
   public static final int d = 5;

   protected dae(dfi.d $$0) {
      super($$0);
      this.k(this.C.b().a(b, Integer.valueOf(1)));
   }

   @Override
   public boolean a(dfj $$0, cpb $$1, gw $$2, ebc $$3) {
      switch ($$3) {
         case a:
            return $$0.c(b) < 5;
         case b:
            return false;
         case c:
            return false;
         default:
            return false;
      }
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return c[$$0.c(b)];
   }

   @Override
   public eig c(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return c[$$0.c(b) - 1];
   }

   @Override
   public eig b_(dfj $$0, cpb $$1, gw $$2) {
      return c[$$0.c(b)];
   }

   @Override
   public eig b(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return c[$$0.c(b)];
   }

   @Override
   public boolean g_(dfj $$0) {
      return true;
   }

   @Override
   public float b(dfj $$0, cpb $$1, gw $$2) {
      return $$0.c(b) == 8 ? 0.2F : 1.0F;
   }

   @Override
   public boolean a(dfj $$0, cpy $$1, gw $$2) {
      dfj $$3 = $$1.a_($$2.d());
      if ($$3.a(apt.cg)) {
         return false;
      } else {
         return $$3.a(apt.ch) ? true : csv.a($$3.k($$1, $$2.d()), hc.b) || $$3.a(this) && $$3.c(b) == 8;
      }
   }

   @Override
   public dfj a(dfj $$0, hc $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      return !$$0.a($$3, $$4) ? csw.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void b(dfj $$0, akr $$1, gw $$2, asc $$3) {
      if ($$1.a(cqe.b, $$2) > 11) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   public boolean a(dfj $$0, cln $$1) {
      int $$2 = $$0.c(b);
      if (!$$1.n().a(this.k()) || $$2 >= 8) {
         return $$2 == 1;
      } else {
         return $$1.c() ? $$1.k() == hc.b : true;
      }
   }

   @Nullable
   @Override
   public dfj a(cln $$0) {
      dfj $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         int $$2 = $$1.c(b);
         return $$1.a(b, Integer.valueOf(Math.min(8, $$2 + 1)));
      } else {
         return super.a($$0);
      }
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(b);
   }
}
