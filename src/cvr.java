public class cvr extends cwl {
   public static final int a = 3;
   public static final dge b = dfu.as;
   private static final int c = 4;
   private static final int d = 2;

   public cvr(dfd.d $$0) {
      super($$0);
      this.k(this.C.b().a(b, Integer.valueOf(0)));
   }

   @Override
   public void b(dfe $$0, akn $$1, gw $$2, arx $$3) {
      this.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dfe $$0, akn $$1, gw $$2, arx $$3) {
      if (($$3.a(3) == 0 || this.a($$1, $$2, 4)) && $$1.z($$2) > 11 - $$0.c(b) - $$0.b($$1, $$2) && this.e($$0, $$1, $$2)) {
         gw.a $$4 = new gw.a();

         for (hc $$5 : hc.values()) {
            $$4.a($$2, $$5);
            dfe $$6 = $$1.a_($$4);
            if ($$6.a(this) && !this.e($$6, $$1, $$4)) {
               $$1.a($$4, this, ars.a($$3, 20, 40));
            }
         }
      } else {
         $$1.a($$2, this, ars.a($$3, 20, 40));
      }
   }

   private boolean e(dfe $$0, cpq $$1, gw $$2) {
      int $$3 = $$0.c(b);
      if ($$3 < 3) {
         $$1.a($$2, $$0.a(b, Integer.valueOf($$3 + 1)), 2);
         return false;
      } else {
         this.d($$0, $$1, $$2);
         return true;
      }
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, csq $$3, gw $$4, boolean $$5) {
      if ($$3.n().a(this) && this.a($$1, $$2, 2)) {
         this.d($$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean a(cow $$0, gw $$1, int $$2) {
      int $$3 = 0;
      gw.a $$4 = new gw.a();

      for (hc $$5 : hc.values()) {
         $$4.a($$1, $$5);
         if ($$0.a_($$4).a(this)) {
            if (++$$3 >= $$2) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(b);
   }

   @Override
   public cja a(cow $$0, gw $$1, dfe $$2) {
      return cja.b;
   }
}
