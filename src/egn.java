public class egn extends ego<eiz> {
   public static final int a = 4;
   public static final int b = 4;
   public static final int c = 1;
   public static final float d = 0.5F;
   private static final jh ao = jh.c;
   private final boolean ap;

   public static jh a(jh $$0) {
      return ao.a((kl)$$0);
   }

   public egn(boolean $$0) {
      super(eiz.a);
      this.ap = $$0;
   }

   @Override
   public boolean a(egq<eiz> $$0) {
      jh $$1 = $$0.e();
      dhy $$2 = $$0.b();

      for (jh $$3 : jh.c(new jh($$1.u() - 4, $$1.v() - 1, $$1.w() - 4), new jh($$1.u() + 4, $$1.v() + 32, $$1.w() + 4))) {
         boolean $$4 = $$3.a($$1, 2.5);
         if ($$4 || $$3.a($$1, 3.5)) {
            if ($$3.v() < $$1.v()) {
               if ($$4) {
                  this.a($$2, $$3, dkg.I.m());
               } else if ($$3.v() < $$1.v()) {
                  this.a($$2, $$3, dkg.fN.m());
               }
            } else if ($$3.v() > $$1.v()) {
               this.a($$2, $$3, dkg.a.m());
            } else if (!$$4) {
               this.a($$2, $$3, dkg.I.m());
            } else if (this.ap) {
               this.a($$2, new jh($$3), dkg.fL.m());
            } else {
               this.a($$2, new jh($$3), dkg.a.m());
            }
         }
      }

      for (int $$5 = 0; $$5 < 4; $$5++) {
         this.a($$2, $$1.b($$5), dkg.I.m());
      }

      jh $$6 = $$1.b(2);

      for (jm $$7 : jm.c.a) {
         this.a($$2, $$6.a($$7), dkg.cx.m().b(dtj.g, $$7));
      }

      return true;
   }
}
