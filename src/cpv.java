public class cpv<T extends box & bpm> extends cqh {
   private final bpd<T> a;
   private final int b;

   public cpv(cqh.a $$0, bpd<T> $$1, int $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   @Override
   public bne<cqm> a(cxb $$0, ciu $$1, bnc $$2) {
      cqm $$3 = $$1.b($$2);
      if ($$0.B) {
         return bne.c($$3);
      } else {
         box $$4 = $$1.da();
         if ($$1.bO() && $$4 instanceof bpm $$5 && $$4.ai() == this.a && $$5.a()) {
            $$3.a(this.b, $$1, bpp.d($$2));
            if ($$3.b()) {
               cqm $$6 = $$3.b(cqp.qU, 1);
               return bne.a($$6);
            }

            return bne.a($$3);
         }

         $$1.b(aui.c.b(this));
         return bne.c($$3);
      }
   }
}
