public class cjp extends cjc {
   private static final int a = 32;

   public cjp(cjc.a $$0) {
      super($$0);
   }

   @Override
   public cjh a(cjh $$0, cpx $$1, bji $$2) {
      if ($$2 instanceof akt $$3) {
         al.z.a($$3, $$0);
         $$3.b(app.c.b(this));
      }

      if ($$2 instanceof cbw && !((cbw)$$2).fS().d) {
         $$0.h(1);
      }

      if (!$$1.B) {
         $$2.eq();
      }

      return $$0.b() ? new cjh(cjk.pK) : $$0;
   }

   @Override
   public int b(cjh $$0) {
      return 32;
   }

   @Override
   public cla c(cjh $$0) {
      return cla.c;
   }

   @Override
   public bhb<cjh> a(cpx $$0, cbw $$1, bgz $$2) {
      return cjj.a($$0, $$1, $$2);
   }
}
