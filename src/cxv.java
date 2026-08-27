public class cxv extends csy {
   public static final int a = 3;
   public static final dge b = dfu.as;
   private static final eib[] c = new eib[]{
      csq.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      csq.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      csq.a(0.0, 0.0, 0.0, 16.0, 11.0, 16.0),
      csq.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0)
   };

   protected cxv(dfd.d $$0) {
      super($$0);
      this.k(this.C.b().a(b, Integer.valueOf(0)));
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return c[$$0.c(b)];
   }

   @Override
   protected boolean d(dfe $$0, cow $$1, gw $$2) {
      return $$0.a(csr.dX);
   }

   @Override
   public boolean e_(dfe $$0) {
      return $$0.c(b) < 3;
   }

   @Override
   public void b(dfe $$0, akn $$1, gw $$2, arx $$3) {
      int $$4 = $$0.c(b);
      if ($$4 < 3 && $$3.a(10) == 0) {
         $$0 = $$0.a(b, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$0, 2);
      }
   }

   @Override
   public cja a(cow $$0, gw $$1, dfe $$2) {
      return new cja(cjd.ru);
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(b);
   }
}
