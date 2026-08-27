import javax.annotation.Nullable;

public class chc extends cic {
   public chc(bqr<? extends chc> $$0, czu $$1) {
      super($$0, $$1);
   }

   public static bsk.a r() {
      return cic.u().a(bsl.q, 12.0);
   }

   @Override
   public boolean C(bql $$0) {
      if (super.C($$0)) {
         if ($$0 instanceof bre) {
            int $$1 = 0;
            if (this.dN().ak() == bon.c) {
               $$1 = 7;
            } else if (this.dN().ak() == bon.d) {
               $$1 = 15;
            }

            if ($$1 > 0) {
               ((bre)$$0).b(new bpx(bpz.s, $$1 * 20, 0), this);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Nullable
   @Override
   public brw a(daj $$0, boo $$1, bri $$2, @Nullable brw $$3) {
      return $$3;
   }

   @Override
   public etf l(bql $$0) {
      return $$0.dh() <= this.dh() ? new etf(0.0, 0.21875 * (double)this.ec(), 0.0) : super.l($$0);
   }
}
