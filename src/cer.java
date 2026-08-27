import javax.annotation.Nullable;

public class cer extends cfr {
   public cer(bol<? extends cer> $$0, cwe $$1) {
      super($$0, $$1);
   }

   public static bqd.a u() {
      return cfr.w().a(bqe.n, 12.0);
   }

   @Override
   public boolean B(bof $$0) {
      if (super.B($$0)) {
         if ($$0 instanceof box) {
            int $$1 = 0;
            if (this.dJ().aj() == bmi.c) {
               $$1 = 7;
            } else if (this.dJ().aj() == bmi.d) {
               $$1 = 15;
            }

            if ($$1 > 0) {
               ((box)$$0).b(new bns(bnu.s, $$1 * 20, 0), this);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Nullable
   @Override
   public bpp a(cwt $$0, bmj $$1, bpb $$2, @Nullable bpp $$3) {
      return $$3;
   }

   @Override
   public eov k(bof $$0) {
      return $$0.dd() <= this.dd() ? new eov(0.0, 0.21875 * (double)this.dY(), 0.0) : super.k($$0);
   }
}
