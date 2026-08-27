import javax.annotation.Nullable;

public class chy extends ciy {
   public chy(brn<? extends chy> $$0, dad $$1) {
      super($$0, $$1);
   }

   public static btg.a r() {
      return ciy.u().a(bth.q, 12.0);
   }

   @Override
   public boolean C(brh $$0) {
      if (super.C($$0)) {
         if ($$0 instanceof bsa) {
            int $$1 = 0;
            if (this.dN().ak() == bpj.c) {
               $$1 = 7;
            } else if (this.dN().ak() == bpj.d) {
               $$1 = 15;
            }

            if ($$1 > 0) {
               ((bsa)$$0).b(new bqt(bqv.s, $$1 * 20, 0), this);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Nullable
   @Override
   public bss a(das $$0, bpk $$1, bse $$2, @Nullable bss $$3) {
      return $$3;
   }

   @Override
   public etp l(brh $$0) {
      return $$0.dh() <= this.dh() ? new etp(0.0, 0.21875 * (double)this.ec(), 0.0) : super.l($$0);
   }
}
