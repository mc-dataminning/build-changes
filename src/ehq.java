public class ehq extends ehr<ekc> {
   public static final int a = 4;
   public static final int b = 4;
   public static final int c = 1;
   public static final float d = 0.5F;
   private static final jj ao = jj.c;
   private final boolean ap;

   public static jj a(jj $$0) {
      return ao.a((kn)$$0);
   }

   public ehq(boolean $$0) {
      super(ekc.a);
      this.ap = $$0;
   }

   @Override
   public boolean a(eht<ekc> $$0) {
      jj $$1 = $$0.e();
      dio $$2 = $$0.b();

      for (jj $$3 : jj.c(new jj($$1.u() - 4, $$1.v() - 1, $$1.w() - 4), new jj($$1.u() + 4, $$1.v() + 32, $$1.w() + 4))) {
         boolean $$4 = $$3.a($$1, 2.5);
         if ($$4 || $$3.a($$1, 3.5)) {
            if ($$3.v() < $$1.v()) {
               if ($$4) {
                  this.a($$2, $$3, dkw.I.m());
               } else if ($$3.v() < $$1.v()) {
                  if (this.ap) {
                     this.a($$2, $$3, dkw.fU);
                  } else {
                     this.a($$2, $$3, dkw.fU.m());
                  }
               }
            } else if ($$3.v() > $$1.v()) {
               if (this.ap) {
                  this.a($$2, $$3, dkw.a);
               } else {
                  this.a($$2, $$3, dkw.a.m());
               }
            } else if (!$$4) {
               this.a($$2, $$3, dkw.I.m());
            } else if (this.ap) {
               this.a($$2, new jj($$3), dkw.fS);
            } else {
               this.a($$2, new jj($$3), dkw.a.m());
            }
         }
      }

      for (int $$5 = 0; $$5 < 4; $$5++) {
         this.a($$2, $$1.b($$5), dkw.I.m());
      }

      jj $$6 = $$1.b(2);

      for (jo $$7 : jo.c.a) {
         this.a($$2, $$6.a($$7), dkw.cx.m().b(due.e, $$7));
      }

      return true;
   }

   private void a(dio $$0, jj $$1, dku $$2) {
      if (!$$0.a_($$1).a($$2)) {
         $$0.a($$1, true, null);
         this.a($$0, $$1, $$2.m());
      }
   }
}
