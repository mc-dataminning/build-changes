import javax.annotation.Nullable;

public class czz extends csq {
   public static final int a = 8;
   public static final dge b = dfu.aF;
   protected static final eib[] c = new eib[]{
      ehy.a(),
      csq.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      csq.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      csq.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      csq.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      csq.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      csq.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      csq.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      csq.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };
   public static final int d = 5;

   protected czz(dfd.d $$0) {
      super($$0);
      this.k(this.C.b().a(b, Integer.valueOf(1)));
   }

   @Override
   public boolean a(dfe $$0, cow $$1, gw $$2, eax $$3) {
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
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return c[$$0.c(b)];
   }

   @Override
   public eib c(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return c[$$0.c(b) - 1];
   }

   @Override
   public eib b_(dfe $$0, cow $$1, gw $$2) {
      return c[$$0.c(b)];
   }

   @Override
   public eib b(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return c[$$0.c(b)];
   }

   @Override
   public boolean g_(dfe $$0) {
      return true;
   }

   @Override
   public float b(dfe $$0, cow $$1, gw $$2) {
      return $$0.c(b) == 8 ? 0.2F : 1.0F;
   }

   @Override
   public boolean a(dfe $$0, cpt $$1, gw $$2) {
      dfe $$3 = $$1.a_($$2.d());
      if ($$3.a(apo.cg)) {
         return false;
      } else {
         return $$3.a(apo.ch) ? true : csq.a($$3.k($$1, $$2.d()), hc.b) || $$3.a(this) && $$3.c(b) == 8;
      }
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      return !$$0.a($$3, $$4) ? csr.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void b(dfe $$0, akn $$1, gw $$2, arx $$3) {
      if ($$1.a(cpz.b, $$2) > 11) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   public boolean a(dfe $$0, cli $$1) {
      int $$2 = $$0.c(b);
      if (!$$1.n().a(this.k()) || $$2 >= 8) {
         return $$2 == 1;
      } else {
         return $$1.c() ? $$1.k() == hc.b : true;
      }
   }

   @Nullable
   @Override
   public dfe a(cli $$0) {
      dfe $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         int $$2 = $$1.c(b);
         return $$1.a(b, Integer.valueOf(Math.min(8, $$2 + 1)));
      } else {
         return super.a($$0);
      }
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(b);
   }
}
