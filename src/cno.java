import javax.annotation.Nullable;

public class cno extends cop {
   public cno(bwo<? extends cno> $$0, dja $$1) {
      super($$0, $$1);
   }

   public static byj.a j() {
      return cop.m().a(byk.s, 12.0);
   }

   @Override
   public boolean c(arq $$0, bwf $$1) {
      if (super.c($$0, $$1)) {
         if ($$1 instanceof bxe) {
            int $$2 = 0;
            if (this.dV().an() == bua.c) {
               $$2 = 7;
            } else if (this.dV().an() == bua.d) {
               $$2 = 15;
            }

            if ($$2 > 0) {
               ((bxe)$$1).b(new bvj(bvl.s, $$2 * 20, 0), this);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Nullable
   @Override
   public bxw a(djr $$0, bub $$1, bwn $$2, @Nullable bxw $$3) {
      return $$3;
   }

   @Override
   public feq l(bwf $$0) {
      return $$0.dq() <= this.dq() ? new feq(0.0, 0.21875 * (double)this.el(), 0.0) : super.l($$0);
   }
}
