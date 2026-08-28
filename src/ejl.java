public class ejl extends ejm<elx> {
   public static final int a = 4;
   public static final int b = 4;
   public static final int c = 1;
   public static final float d = 0.5F;
   private static final iu ao = iu.c;
   private final boolean ap;

   public static iu a(iu $$0) {
      return ao.a((jz)$$0);
   }

   public ejl(boolean $$0) {
      super(elx.a);
      this.ap = $$0;
   }

   @Override
   public boolean a(ejo<elx> $$0) {
      iu $$1 = $$0.e();
      djz $$2 = $$0.b();

      for (iu $$3 : iu.c(new iu($$1.u() - 4, $$1.v() - 1, $$1.w() - 4), new iu($$1.u() + 4, $$1.v() + 32, $$1.w() + 4))) {
         boolean $$4 = $$3.a($$1, 2.5);
         if ($$4 || $$3.a($$1, 3.5)) {
            if ($$3.v() < $$1.v()) {
               if ($$4) {
                  this.a($$2, $$3, dmh.I.m());
               } else if ($$3.v() < $$1.v()) {
                  if (this.ap) {
                     this.a($$2, $$3, dmh.fY);
                  } else {
                     this.a($$2, $$3, dmh.fY.m());
                  }
               }
            } else if ($$3.v() > $$1.v()) {
               if (this.ap) {
                  this.a($$2, $$3, dmh.a);
               } else {
                  this.a($$2, $$3, dmh.a.m());
               }
            } else if (!$$4) {
               this.a($$2, $$3, dmh.I.m());
            } else if (this.ap) {
               this.a($$2, new iu($$3), dmh.fW);
            } else {
               this.a($$2, new iu($$3), dmh.a.m());
            }
         }
      }

      for (int $$5 = 0; $$5 < 4; $$5++) {
         this.a($$2, $$1.b($$5), dmh.I.m());
      }

      iu $$6 = $$1.b(2);

      for (ja $$7 : ja.c.a) {
         this.a($$2, $$6.a($$7), dmh.cA.m().b(dvy.e, $$7));
      }

      return true;
   }

   private void a(djz $$0, iu $$1, dmf $$2) {
      if (!$$0.a_($$1).a($$2)) {
         $$0.a($$1, true, null);
         this.a($$0, $$1, $$2.m());
      }
   }
}
