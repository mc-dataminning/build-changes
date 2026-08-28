import javax.annotation.Nullable;

public class cli extends cmi {
   public cli(bur<? extends cli> $$0, dgh $$1) {
      super($$0, $$1);
   }

   public static bwn.a m() {
      return cmi.p().a(bwo.s, 12.0);
   }

   @Override
   public boolean c(ard $$0, buk $$1) {
      if (super.c($$0, $$1)) {
         if ($$1 instanceof bvg) {
            int $$2 = 0;
            if (this.dV().am() == bsg.c) {
               $$2 = 7;
            } else if (this.dV().am() == bsg.d) {
               $$2 = 15;
            }

            if ($$2 > 0) {
               ((bvg)$$1).b(new btp(btr.s, $$2 * 20, 0), this);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Nullable
   @Override
   public bvz a(dgy $$0, bsh $$1, buq $$2, @Nullable bvz $$3) {
      return $$3;
   }

   @Override
   public faz l(buk $$0) {
      return $$0.dq() <= this.dq() ? new faz(0.0, 0.21875 * (double)this.ej(), 0.0) : super.l($$0);
   }
}
