import javax.annotation.Nullable;

public class cko extends clo {
   public cko(bty<? extends cko> $$0, dej $$1) {
      super($$0, $$1);
   }

   public static bvt.a q() {
      return clo.t().a(bvu.s, 12.0);
   }

   @Override
   public boolean E(btr $$0) {
      if (super.E($$0)) {
         if ($$0 instanceof bun) {
            int $$1 = 0;
            if (this.dS().am() == brp.c) {
               $$1 = 7;
            } else if (this.dS().am() == brp.d) {
               $$1 = 15;
            }

            if ($$1 > 0) {
               ((bun)$$0).b(new bsy(bta.s, $$1 * 20, 0), this);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Nullable
   @Override
   public bvf a(dez $$0, brq $$1, btx $$2, @Nullable bvf $$3) {
      return $$3;
   }

   @Override
   public eyw l(btr $$0) {
      return $$0.dn() <= this.dn() ? new eyw(0.0, 0.21875 * (double)this.eg(), 0.0) : super.l($$0);
   }
}
