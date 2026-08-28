public class eav extends eaw<edh> {
   public static final int a = 4;
   public static final int b = 4;
   public static final int c = 1;
   public static final float d = 0.5F;
   private static final iz an = iz.c;
   private final boolean ao;

   public static iz a(iz $$0) {
      return an.a((kd)$$0);
   }

   public eav(boolean $$0) {
      super(edh.a);
      this.ao = $$0;
   }

   @Override
   public boolean a(eay<edh> $$0) {
      iz $$1 = $$0.e();
      dcr $$2 = $$0.b();

      for (iz $$3 : iz.c(new iz($$1.u() - 4, $$1.v() - 1, $$1.w() - 4), new iz($$1.u() + 4, $$1.v() + 32, $$1.w() + 4))) {
         boolean $$4 = $$3.a($$1, 2.5);
         if ($$4 || $$3.a($$1, 3.5)) {
            if ($$3.v() < $$1.v()) {
               if ($$4) {
                  this.a($$2, $$3, dez.F.o());
               } else if ($$3.v() < $$1.v()) {
                  this.a($$2, $$3, dez.fz.o());
               }
            } else if ($$3.v() > $$1.v()) {
               this.a($$2, $$3, dez.a.o());
            } else if (!$$4) {
               this.a($$2, $$3, dez.F.o());
            } else if (this.ao) {
               this.a($$2, new iz($$3), dez.fx.o());
            } else {
               this.a($$2, new iz($$3), dez.a.o());
            }
         }
      }

      for (int $$5 = 0; $$5 < 4; $$5++) {
         this.a($$2, $$1.b($$5), dez.F.o());
      }

      iz $$6 = $$1.b(2);

      for (je $$7 : je.c.a) {
         this.a($$2, $$6.a($$7), dez.cq.o().a(dnz.g, $$7));
      }

      return true;
   }
}
