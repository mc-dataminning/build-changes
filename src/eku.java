public class eku extends ekw<eni> {
   public static final int a = 4;
   public static final int b = 4;
   public static final int c = 1;
   public static final float d = 0.5F;
   private static final iw ap = iw.c;
   private final boolean aq;

   public static iw a(iw $$0) {
      return ap.a((kb)$$0);
   }

   public eku(boolean $$0) {
      super(eni.a);
      this.aq = $$0;
   }

   @Override
   public boolean a(eky<eni> $$0) {
      iw $$1 = $$0.e();
      dli $$2 = $$0.b();

      for (iw $$3 : iw.c(new iw($$1.u() - 4, $$1.v() - 1, $$1.w() - 4), new iw($$1.u() + 4, $$1.v() + 32, $$1.w() + 4))) {
         boolean $$4 = $$3.a($$1, 2.5);
         if ($$4 || $$3.a($$1, 3.5)) {
            if ($$3.v() < $$1.v()) {
               if ($$4) {
                  this.a($$2, $$3, dnq.I.m());
               } else if ($$3.v() < $$1.v()) {
                  if (this.aq) {
                     this.a($$2, $$3, dnq.fY);
                  } else {
                     this.a($$2, $$3, dnq.fY.m());
                  }
               }
            } else if ($$3.v() > $$1.v()) {
               if (this.aq) {
                  this.a($$2, $$3, dnq.a);
               } else {
                  this.a($$2, $$3, dnq.a.m());
               }
            } else if (!$$4) {
               this.a($$2, $$3, dnq.I.m());
            } else if (this.aq) {
               this.a($$2, new iw($$3), dnq.fW);
            } else {
               this.a($$2, new iw($$3), dnq.a.m());
            }
         }
      }

      for (int $$5 = 0; $$5 < 4; $$5++) {
         this.a($$2, $$1.b($$5), dnq.I.m());
      }

      iw $$6 = $$1.b(2);

      for (jc $$7 : jc.c.a) {
         this.a($$2, $$6.a($$7), dnq.cA.m().b(dxh.e, $$7));
      }

      return true;
   }

   private void a(dli $$0, iw $$1, dno $$2) {
      if (!$$0.a_($$1).a($$2)) {
         $$0.a($$1, true, null);
         this.a($$0, $$1, $$2.m());
      }
   }
}
