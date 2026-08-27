public class csi<T extends brh & brx> extends csu {
   private final brn<T> a;
   private final int b;

   public csi(csu.a $$0, brn<T> $$1, int $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   @Override
   public bpn<csz> a(dad $$0, clh $$1, bpl $$2) {
      csz $$3 = $$1.b($$2);
      if ($$0.B) {
         return bpn.c($$3);
      } else {
         brh $$4 = $$1.db();
         if ($$1.bP() && $$4 instanceof brx $$5 && $$4.ai() == this.a && $$5.a()) {
            $$3.a(this.b, $$1, bsa.d($$2));
            if ($$3.d()) {
               csz $$6 = $$3.b(ctc.qV, 1);
               return bpn.a($$6);
            }

            return bpn.a($$3);
         }

         $$1.b(avm.c.b(this));
         return bpn.c($$3);
      }
   }
}
