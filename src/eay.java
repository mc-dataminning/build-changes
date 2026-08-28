public class eay extends eaz<edk> {
   public static final int a = 4;
   public static final int b = 4;
   public static final int c = 1;
   public static final float d = 0.5F;
   private static final iz an = iz.c;
   private final boolean ao;

   public static iz a(iz $$0) {
      return an.a((kd)$$0);
   }

   public eay(boolean $$0) {
      super(edk.a);
      this.ao = $$0;
   }

   @Override
   public boolean a(ebb<edk> $$0) {
      iz $$1 = $$0.e();
      dcu $$2 = $$0.b();

      for (iz $$3 : iz.c(new iz($$1.u() - 4, $$1.v() - 1, $$1.w() - 4), new iz($$1.u() + 4, $$1.v() + 32, $$1.w() + 4))) {
         boolean $$4 = $$3.a($$1, 2.5);
         if ($$4 || $$3.a($$1, 3.5)) {
            if ($$3.v() < $$1.v()) {
               if ($$4) {
                  this.a($$2, $$3, dfc.F.o());
               } else if ($$3.v() < $$1.v()) {
                  this.a($$2, $$3, dfc.fz.o());
               }
            } else if ($$3.v() > $$1.v()) {
               this.a($$2, $$3, dfc.a.o());
            } else if (!$$4) {
               this.a($$2, $$3, dfc.F.o());
            } else if (this.ao) {
               this.a($$2, new iz($$3), dfc.fx.o());
            } else {
               this.a($$2, new iz($$3), dfc.a.o());
            }
         }
      }

      for (int $$5 = 0; $$5 < 4; $$5++) {
         this.a($$2, $$1.b($$5), dfc.F.o());
      }

      iz $$6 = $$1.b(2);

      for (je $$7 : je.c.a) {
         this.a($$2, $$6.a($$7), dfc.cq.o().a(doc.g, $$7));
      }

      return true;
   }
}
