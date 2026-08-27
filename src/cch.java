import javax.annotation.Nullable;

public class cch extends cdh {
   public cch(bmc<? extends cch> $$0, ctx $$1) {
      super($$0, $$1);
   }

   public static bnt.a u() {
      return cdh.w().a(bnu.n, 12.0);
   }

   @Override
   public boolean B(blw $$0) {
      if (super.B($$0)) {
         if ($$0 instanceof bmo) {
            int $$1 = 0;
            if (this.dL().ak() == bjz.c) {
               $$1 = 7;
            } else if (this.dL().ak() == bjz.d) {
               $$1 = 15;
            }

            if ($$1 > 0) {
               ((bmo)$$0).b(new blj(bll.s, $$1 * 20, 0), this);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Nullable
   @Override
   public bnh a(cum $$0, bka $$1, bms $$2, @Nullable bnh $$3, @Nullable so $$4) {
      return $$3;
   }

   @Override
   public emc k(blw $$0) {
      return $$0.dg() <= this.dg() ? new emc(0.0, 0.21875 * (double)this.dZ(), 0.0) : super.k($$0);
   }
}
