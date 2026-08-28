public class efx extends efy<eij> {
   public static final int a = 4;
   public static final int b = 4;
   public static final int c = 1;
   public static final float d = 0.5F;
   private static final ji ao = ji.c;
   private final boolean ap;

   public static ji a(ji $$0) {
      return ao.a((km)$$0);
   }

   public efx(boolean $$0) {
      super(eij.a);
      this.ap = $$0;
   }

   @Override
   public boolean a(ega<eij> $$0) {
      ji $$1 = $$0.e();
      dhg $$2 = $$0.b();

      for (ji $$3 : ji.c(new ji($$1.u() - 4, $$1.v() - 1, $$1.w() - 4), new ji($$1.u() + 4, $$1.v() + 32, $$1.w() + 4))) {
         boolean $$4 = $$3.a($$1, 2.5);
         if ($$4 || $$3.a($$1, 3.5)) {
            if ($$3.v() < $$1.v()) {
               if ($$4) {
                  this.a($$2, $$3, djo.I.m());
               } else if ($$3.v() < $$1.v()) {
                  this.a($$2, $$3, djo.fU.m());
               }
            } else if ($$3.v() > $$1.v()) {
               this.a($$2, $$3, djo.a.m());
            } else if (!$$4) {
               this.a($$2, $$3, djo.I.m());
            } else if (this.ap) {
               this.a($$2, new ji($$3), djo.fS.m());
            } else {
               this.a($$2, new ji($$3), djo.a.m());
            }
         }
      }

      for (int $$5 = 0; $$5 < 4; $$5++) {
         this.a($$2, $$1.b($$5), djo.I.m());
      }

      ji $$6 = $$1.b(2);

      for (jn $$7 : jn.c.a) {
         this.a($$2, $$6.a($$7), djo.cx.m().b(dst.g, $$7));
      }

      return true;
   }
}
