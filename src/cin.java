import javax.annotation.Nullable;

public class cin extends cjn {
   public cin(bsa<? extends cin> $$0, dax $$1) {
      super($$0, $$1);
   }

   public static btv.a s() {
      return cjn.u().a(btw.q, 12.0);
   }

   @Override
   public boolean C(bru $$0) {
      if (super.C($$0)) {
         if ($$0 instanceof bso) {
            int $$1 = 0;
            if (this.dP().ak() == bpr.c) {
               $$1 = 7;
            } else if (this.dP().ak() == bpr.d) {
               $$1 = 15;
            }

            if ($$1 > 0) {
               ((bso)$$0).b(new brc(bre.s, $$1 * 20, 0), this);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Nullable
   @Override
   public bth a(dbm $$0, bps $$1, bss $$2, @Nullable bth $$3) {
      return $$3;
   }

   @Override
   public euk l(bru $$0) {
      return $$0.dj() <= this.dj() ? new euk(0.0, 0.21875 * (double)this.ee(), 0.0) : super.l($$0);
   }
}
