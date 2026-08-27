public class dzw extends dzx<eci> {
   public static final int a = 4;
   public static final int b = 4;
   public static final int c = 1;
   public static final float d = 0.5F;
   private static final io an = io.c;
   private final boolean ao;

   public static io a(io $$0) {
      return an.a((js)$$0);
   }

   public dzw(boolean $$0) {
      super(eci.a);
      this.ao = $$0;
   }

   @Override
   public boolean a(dzz<eci> $$0) {
      io $$1 = $$0.e();
      dbs $$2 = $$0.b();

      for (io $$3 : io.c(new io($$1.u() - 4, $$1.v() - 1, $$1.w() - 4), new io($$1.u() + 4, $$1.v() + 32, $$1.w() + 4))) {
         boolean $$4 = $$3.a($$1, 2.5);
         if ($$4 || $$3.a($$1, 3.5)) {
            if ($$3.v() < $$1.v()) {
               if ($$4) {
                  this.a($$2, $$3, dea.F.n());
               } else if ($$3.v() < $$1.v()) {
                  this.a($$2, $$3, dea.fz.n());
               }
            } else if ($$3.v() > $$1.v()) {
               this.a($$2, $$3, dea.a.n());
            } else if (!$$4) {
               this.a($$2, $$3, dea.F.n());
            } else if (this.ao) {
               this.a($$2, new io($$3), dea.fx.n());
            } else {
               this.a($$2, new io($$3), dea.a.n());
            }
         }
      }

      for (int $$5 = 0; $$5 < 4; $$5++) {
         this.a($$2, $$1.b($$5), dea.F.n());
      }

      io $$6 = $$1.b(2);

      for (it $$7 : it.c.a) {
         this.a($$2, $$6.a($$7), dea.cq.n().a(dna.g, $$7));
      }

      return true;
   }
}
