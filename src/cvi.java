public class cvi<T extends btz & bus> extends cvt {
   private final bug<T> a;
   private final int b;

   public cvi(bug<T> $$0, int $$1, cvt.a $$2) {
      super($$2);
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public bry a(dev $$0, coh $$1, brx $$2) {
      cvx $$3 = $$1.b($$2);
      if ($$0.C) {
         return bry.e;
      } else {
         btz $$4 = $$1.dm();
         if ($$1.ca() && $$4 instanceof bus $$5 && $$4.aq() == this.a && $$5.a()) {
            buh $$6 = buv.d($$2);
            cvx $$7 = $$3.a(this.b, cwb.qW, $$1, $$6);
            return bry.b.a($$7);
         }

         $$1.b(awu.c.b(this));
         return bry.e;
      }
   }
}
