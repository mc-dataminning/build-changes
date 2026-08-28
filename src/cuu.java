public class cuu<T extends btj & buc> extends cvg {
   private final btq<T> a;
   private final int b;

   public cuu(cvg.a $$0, btq<T> $$1, int $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   @Override
   public brk a(dds $$0, cnp $$1, brj $$2) {
      cvl $$3 = $$1.b($$2);
      if ($$0.B) {
         return brk.e;
      } else {
         btj $$4 = $$1.dh();
         if ($$1.bW() && $$4 instanceof buc $$5 && $$4.ao() == this.a && $$5.a()) {
            btr $$6 = buf.d($$2);
            cvl $$7 = $$3.a(this.b, cvo.qW, $$1, $$6);
            return brk.b.a($$7);
         }

         $$1.b(awn.c.b(this));
         return brk.e;
      }
   }
}
