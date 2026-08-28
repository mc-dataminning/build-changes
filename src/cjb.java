import javax.annotation.Nullable;

public class cjb extends ckb {
   public cjb(bsm<? extends cjb> $$0, dcf $$1) {
      super($$0, $$1);
   }

   public static bui.a s() {
      return ckb.u().a(buj.s, 12.0);
   }

   @Override
   public boolean D(bsg $$0) {
      if (super.D($$0)) {
         if ($$0 instanceof btb) {
            int $$1 = 0;
            if (this.dQ().al() == bqd.c) {
               $$1 = 7;
            } else if (this.dQ().al() == bqd.d) {
               $$1 = 15;
            }

            if ($$1 > 0) {
               ((btb)$$0).b(new bro(brq.s, $$1 * 20, 0), this);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Nullable
   @Override
   public btu a(dcu $$0, bqe $$1, btf $$2, @Nullable btu $$3) {
      return $$3;
   }

   @Override
   public ewf l(bsg $$0) {
      return $$0.dk() <= this.dk() ? new ewf(0.0, 0.21875 * (double)this.ec(), 0.0) : super.l($$0);
   }
}
