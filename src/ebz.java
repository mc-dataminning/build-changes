public class ebz extends eca<eer> {
   public static final int a = 4;
   public static final int b = 4;
   public static final int c = 1;
   public static final float d = 0.5F;
   private static final ir au = ir.c;
   private final boolean av;

   public static ir a(ir $$0) {
      return au.a((jv)$$0);
   }

   public ebz(boolean $$0) {
      super(eer.a);
      this.av = $$0;
   }

   @Override
   public boolean a(ecc<eer> $$0) {
      ir $$1 = $$0.e();
      dcv $$2 = $$0.b();

      for (ir $$3 : ir.c(new ir($$1.u() - 4, $$1.v() - 1, $$1.w() - 4), new ir($$1.u() + 4, $$1.v() + 32, $$1.w() + 4))) {
         boolean $$4 = $$3.a($$1, 2.5);
         if ($$4 || $$3.a($$1, 3.5)) {
            if ($$3.v() < $$1.v()) {
               if ($$4) {
                  this.a($$2, $$3, dfe.ak.n());
               } else if ($$3.v() < $$1.v()) {
                  this.a($$2, $$3, dfe.gr.n());
               }
            } else if ($$3.v() > $$1.v()) {
               this.a($$2, $$3, dfe.a.n());
            } else if (!$$4) {
               this.a($$2, $$3, dfe.ak.n());
            } else if (this.av) {
               this.a($$2, new ir($$3), dfe.gp.n());
            } else {
               this.a($$2, new ir($$3), dfe.a.n());
            }
         }
      }

      for (int $$5 = 0; $$5 < 4; $$5++) {
         this.a($$2, $$1.b($$5), dfe.ak.n());
      }

      ir $$6 = $$1.b(2);

      for (iw $$7 : iw.c.a) {
         this.a($$2, $$6.a($$7), dfe.db.n().a(dou.g, $$7));
      }

      return true;
   }
}
