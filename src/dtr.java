public class dtr extends dts<dwd> {
   public static final int a = 4;
   public static final int b = 4;
   public static final int c = 1;
   public static final float d = 0.5F;
   private static final hz an = hz.c;
   private final boolean ao;

   public static hz a(hz $$0) {
      return an.a((jd)$$0);
   }

   public dtr(boolean $$0) {
      super(dwd.a);
      this.ao = $$0;
   }

   @Override
   public boolean a(dtu<dwd> $$0) {
      hz $$1 = $$0.e();
      cwi $$2 = $$0.b();

      for (hz $$3 : hz.a(new hz($$1.u() - 4, $$1.v() - 1, $$1.w() - 4), new hz($$1.u() + 4, $$1.v() + 32, $$1.w() + 4))) {
         boolean $$4 = $$3.a($$1, 2.5);
         if ($$4 || $$3.a($$1, 3.5)) {
            if ($$3.v() < $$1.v()) {
               if ($$4) {
                  this.a($$2, $$3, cyq.F.o());
               } else if ($$3.v() < $$1.v()) {
                  this.a($$2, $$3, cyq.fz.o());
               }
            } else if ($$3.v() > $$1.v()) {
               this.a($$2, $$3, cyq.a.o());
            } else if (!$$4) {
               this.a($$2, $$3, cyq.F.o());
            } else if (this.ao) {
               this.a($$2, new hz($$3), cyq.fx.o());
            } else {
               this.a($$2, new hz($$3), cyq.a.o());
            }
         }
      }

      for (int $$5 = 0; $$5 < 4; $$5++) {
         this.a($$2, $$1.b($$5), cyq.F.o());
      }

      hz $$6 = $$1.b(2);

      for (ie $$7 : ie.c.a) {
         this.a($$2, $$6.a($$7), cyq.cq.o().a(dho.g, $$7));
      }

      return true;
   }
}
