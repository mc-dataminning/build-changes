import java.util.function.Supplier;

public class dam extends csy implements css {
   public static final int a = 7;
   public static final dge b = dfu.av;
   protected static final float c = 1.0F;
   protected static final eib[] d = new eib[]{
      csq.a(7.0, 0.0, 7.0, 9.0, 2.0, 9.0),
      csq.a(7.0, 0.0, 7.0, 9.0, 4.0, 9.0),
      csq.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0),
      csq.a(7.0, 0.0, 7.0, 9.0, 8.0, 9.0),
      csq.a(7.0, 0.0, 7.0, 9.0, 10.0, 9.0),
      csq.a(7.0, 0.0, 7.0, 9.0, 12.0, 9.0),
      csq.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0),
      csq.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private final dan e;
   private final Supplier<civ> f;

   protected dam(dan $$0, Supplier<civ> $$1, dfd.d $$2) {
      super($$2);
      this.e = $$0;
      this.f = $$1;
      this.k(this.C.b().a(b, Integer.valueOf(0)));
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return d[$$0.c(b)];
   }

   @Override
   protected boolean d(dfe $$0, cow $$1, gw $$2) {
      return $$0.a(csr.cC);
   }

   @Override
   public void b(dfe $$0, akn $$1, gw $$2, arx $$3) {
      if ($$1.b($$2, 0) >= 9) {
         float $$4 = cuh.a(this, $$1, $$2);
         if ($$3.a((int)(25.0F / $$4) + 1) == 0) {
            int $$5 = $$0.c(b);
            if ($$5 < 7) {
               $$0 = $$0.a(b, Integer.valueOf($$5 + 1));
               $$1.a($$2, $$0, 2);
            } else {
               hc $$6 = hc.c.a.a($$3);
               gw $$7 = $$2.a($$6);
               dfe $$8 = $$1.a_($$7.d());
               if ($$1.a_($$7).i() && ($$8.a(csr.cC) || $$8.a(apo.af))) {
                  $$1.b($$7, this.e.n());
                  $$1.b($$2, this.e.b().n().a(cwj.aC, $$6));
               }
            }
         }
      }
   }

   @Override
   public cja a(cow $$0, gw $$1, dfe $$2) {
      return new cja(this.f.get());
   }

   @Override
   public boolean a(cpt $$0, gw $$1, dfe $$2) {
      return $$2.c(b) != 7;
   }

   @Override
   public boolean a(cpq $$0, arx $$1, gw $$2, dfe $$3) {
      return true;
   }

   @Override
   public void a(akn $$0, arx $$1, gw $$2, dfe $$3) {
      int $$4 = Math.min(7, $$3.c(b) + ars.a($$0.z, 2, 5));
      dfe $$5 = $$3.a(b, Integer.valueOf($$4));
      $$0.a($$2, $$5, 2);
      if ($$4 == 7) {
         $$5.b($$0, $$2, $$0.z);
      }
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(b);
   }

   public dan a() {
      return this.e;
   }
}
