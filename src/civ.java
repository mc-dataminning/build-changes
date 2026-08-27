public class civ extends cjc {
   private static final int a = 40;

   public civ(cjc.a $$0) {
      super($$0);
   }

   @Override
   public cjh a(cjh $$0, cpx $$1, bji $$2) {
      super.a($$0, $$1, $$2);
      if ($$2 instanceof akt $$3) {
         al.z.a($$3, $$0);
         $$3.b(app.c.b(this));
      }

      if (!$$1.B) {
         $$2.d(bih.s);
      }

      if ($$0.b()) {
         return new cjh(cjk.rw);
      } else {
         if ($$2 instanceof cbw $$4 && !$$4.fS().d) {
            cjh $$5 = new cjh(cjk.rw);
            if (!$$4.fR().e($$5)) {
               $$4.a($$5, false);
            }
         }

         return $$0;
      }
   }

   @Override
   public int b(cjh $$0) {
      return 40;
   }

   @Override
   public cla c(cjh $$0) {
      return cla.c;
   }

   @Override
   public ape aj_() {
      return apf.lb;
   }

   @Override
   public ape ak_() {
      return apf.lb;
   }

   @Override
   public bhb<cjh> a(cpx $$0, cbw $$1, bgz $$2) {
      return cjj.a($$0, $$1, $$2);
   }
}
