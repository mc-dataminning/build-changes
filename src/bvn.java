import javax.annotation.Nullable;

public class bvn extends bwn {
   public bvn(bfn<? extends bvn> $$0, cmm $$1) {
      super($$0, $$1);
   }

   public static bhf.a q() {
      return bwn.r().a(bhg.a, 12.0);
   }

   @Override
   public boolean z(bfj $$0) {
      if (super.z($$0)) {
         if ($$0 instanceof bfz) {
            int $$1 = 0;
            if (this.dI().ai() == bdu.c) {
               $$1 = 7;
            } else if (this.dI().ai() == bdu.d) {
               $$1 = 15;
            }

            if ($$1 > 0) {
               ((bfz)$$0).b(new bfa(bfc.s, $$1 * 20, 0), this);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Nullable
   @Override
   public bgt a(cnb $$0, bdv $$1, bgd $$2, @Nullable bgt $$3, @Nullable qr $$4) {
      return $$3;
   }

   @Override
   protected float b(bgl $$0, bfk $$1) {
      return 0.45F;
   }
}
