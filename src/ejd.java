public class ejd extends eje<elp> {
   public static final int a = 4;
   public static final int b = 4;
   public static final int c = 1;
   public static final float d = 0.5F;
   private static final iu ao = iu.c;
   private final boolean ap;

   public static iu a(iu $$0) {
      return ao.a((jz)$$0);
   }

   public ejd(boolean $$0) {
      super(elp.a);
      this.ap = $$0;
   }

   @Override
   public boolean a(ejg<elp> $$0) {
      iu $$1 = $$0.e();
      dju $$2 = $$0.b();

      for (iu $$3 : iu.c(new iu($$1.u() - 4, $$1.v() - 1, $$1.w() - 4), new iu($$1.u() + 4, $$1.v() + 32, $$1.w() + 4))) {
         boolean $$4 = $$3.a($$1, 2.5);
         if ($$4 || $$3.a($$1, 3.5)) {
            if ($$3.v() < $$1.v()) {
               if ($$4) {
                  this.a($$2, $$3, dmc.I.m());
               } else if ($$3.v() < $$1.v()) {
                  if (this.ap) {
                     this.a($$2, $$3, dmc.fV);
                  } else {
                     this.a($$2, $$3, dmc.fV.m());
                  }
               }
            } else if ($$3.v() > $$1.v()) {
               if (this.ap) {
                  this.a($$2, $$3, dmc.a);
               } else {
                  this.a($$2, $$3, dmc.a.m());
               }
            } else if (!$$4) {
               this.a($$2, $$3, dmc.I.m());
            } else if (this.ap) {
               this.a($$2, new iu($$3), dmc.fT);
            } else {
               this.a($$2, new iu($$3), dmc.a.m());
            }
         }
      }

      for (int $$5 = 0; $$5 < 4; $$5++) {
         this.a($$2, $$1.b($$5), dmc.I.m());
      }

      iu $$6 = $$1.b(2);

      for (ja $$7 : ja.c.a) {
         this.a($$2, $$6.a($$7), dmc.cy.m().b(dvq.e, $$7));
      }

      return true;
   }

   private void a(dju $$0, iu $$1, dma $$2) {
      if (!$$0.a_($$1).a($$2)) {
         $$0.a($$1, true, null);
         this.a($$0, $$1, $$2.m());
      }
   }
}
