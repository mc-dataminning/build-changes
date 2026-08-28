public class eis extends eit<ele> {
   public static final int a = 4;
   public static final int b = 4;
   public static final int c = 1;
   public static final float d = 0.5F;
   private static final iu ao = iu.c;
   private final boolean ap;

   public static iu a(iu $$0) {
      return ao.a((jz)$$0);
   }

   public eis(boolean $$0) {
      super(ele.a);
      this.ap = $$0;
   }

   @Override
   public boolean a(eiv<ele> $$0) {
      iu $$1 = $$0.e();
      djo $$2 = $$0.b();

      for (iu $$3 : iu.c(new iu($$1.u() - 4, $$1.v() - 1, $$1.w() - 4), new iu($$1.u() + 4, $$1.v() + 32, $$1.w() + 4))) {
         boolean $$4 = $$3.a($$1, 2.5);
         if ($$4 || $$3.a($$1, 3.5)) {
            if ($$3.v() < $$1.v()) {
               if ($$4) {
                  this.a($$2, $$3, dlw.I.m());
               } else if ($$3.v() < $$1.v()) {
                  if (this.ap) {
                     this.a($$2, $$3, dlw.fU);
                  } else {
                     this.a($$2, $$3, dlw.fU.m());
                  }
               }
            } else if ($$3.v() > $$1.v()) {
               if (this.ap) {
                  this.a($$2, $$3, dlw.a);
               } else {
                  this.a($$2, $$3, dlw.a.m());
               }
            } else if (!$$4) {
               this.a($$2, $$3, dlw.I.m());
            } else if (this.ap) {
               this.a($$2, new iu($$3), dlw.fS);
            } else {
               this.a($$2, new iu($$3), dlw.a.m());
            }
         }
      }

      for (int $$5 = 0; $$5 < 4; $$5++) {
         this.a($$2, $$1.b($$5), dlw.I.m());
      }

      iu $$6 = $$1.b(2);

      for (ja $$7 : ja.c.a) {
         this.a($$2, $$6.a($$7), dlw.cx.m().b(dvg.e, $$7));
      }

      return true;
   }

   private void a(djo $$0, iu $$1, dlu $$2) {
      if (!$$0.a_($$1).a($$2)) {
         $$0.a($$1, true, null);
         this.a($$0, $$1, $$2.m());
      }
   }
}
