public class ejs extends ejt<eme> {
   public static final int a = 4;
   public static final int b = 4;
   public static final int c = 1;
   public static final float d = 0.5F;
   private static final iv ao = iv.c;
   private final boolean ap;

   public static iv a(iv $$0) {
      return ao.a((ka)$$0);
   }

   public ejs(boolean $$0) {
      super(eme.a);
      this.ap = $$0;
   }

   @Override
   public boolean a(ejv<eme> $$0) {
      iv $$1 = $$0.e();
      dkg $$2 = $$0.b();

      for (iv $$3 : iv.c(new iv($$1.u() - 4, $$1.v() - 1, $$1.w() - 4), new iv($$1.u() + 4, $$1.v() + 32, $$1.w() + 4))) {
         boolean $$4 = $$3.a($$1, 2.5);
         if ($$4 || $$3.a($$1, 3.5)) {
            if ($$3.v() < $$1.v()) {
               if ($$4) {
                  this.a($$2, $$3, dmo.I.m());
               } else if ($$3.v() < $$1.v()) {
                  if (this.ap) {
                     this.a($$2, $$3, dmo.fY);
                  } else {
                     this.a($$2, $$3, dmo.fY.m());
                  }
               }
            } else if ($$3.v() > $$1.v()) {
               if (this.ap) {
                  this.a($$2, $$3, dmo.a);
               } else {
                  this.a($$2, $$3, dmo.a.m());
               }
            } else if (!$$4) {
               this.a($$2, $$3, dmo.I.m());
            } else if (this.ap) {
               this.a($$2, new iv($$3), dmo.fW);
            } else {
               this.a($$2, new iv($$3), dmo.a.m());
            }
         }
      }

      for (int $$5 = 0; $$5 < 4; $$5++) {
         this.a($$2, $$1.b($$5), dmo.I.m());
      }

      iv $$6 = $$1.b(2);

      for (jb $$7 : jb.c.a) {
         this.a($$2, $$6.a($$7), dmo.cA.m().b(dwf.e, $$7));
      }

      return true;
   }

   private void a(dkg $$0, iv $$1, dmm $$2) {
      if (!$$0.a_($$1).a($$2)) {
         $$0.a($$1, true, null);
         this.a($$0, $$1, $$2.m());
      }
   }
}
