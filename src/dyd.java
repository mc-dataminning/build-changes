public class dyd extends dye<eap> {
   public static final int a = 4;
   public static final int b = 4;
   public static final int c = 1;
   public static final float d = 0.5F;
   private static final id an = id.c;
   private final boolean ao;

   public static id a(id $$0) {
      return an.a((ji)$$0);
   }

   public dyd(boolean $$0) {
      super(eap.a);
      this.ao = $$0;
   }

   @Override
   public boolean a(dyg<eap> $$0) {
      id $$1 = $$0.e();
      dab $$2 = $$0.b();

      for (id $$3 : id.a(new id($$1.u() - 4, $$1.v() - 1, $$1.w() - 4), new id($$1.u() + 4, $$1.v() + 32, $$1.w() + 4))) {
         boolean $$4 = $$3.a($$1, 2.5);
         if ($$4 || $$3.a($$1, 3.5)) {
            if ($$3.v() < $$1.v()) {
               if ($$4) {
                  this.a($$2, $$3, dcj.F.n());
               } else if ($$3.v() < $$1.v()) {
                  this.a($$2, $$3, dcj.fz.n());
               }
            } else if ($$3.v() > $$1.v()) {
               this.a($$2, $$3, dcj.a.n());
            } else if (!$$4) {
               this.a($$2, $$3, dcj.F.n());
            } else if (this.ao) {
               this.a($$2, new id($$3), dcj.fx.n());
            } else {
               this.a($$2, new id($$3), dcj.a.n());
            }
         }
      }

      for (int $$5 = 0; $$5 < 4; $$5++) {
         this.a($$2, $$1.b($$5), dcj.F.n());
      }

      id $$6 = $$1.b(2);

      for (ij $$7 : ij.c.a) {
         this.a($$2, $$6.a($$7), dcj.cq.n().a(dli.g, $$7));
      }

      return true;
   }
}
