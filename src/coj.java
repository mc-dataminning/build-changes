import javax.annotation.Nullable;

public class coj extends cpk {
   public coj(bxc<? extends coj> $$0, djx $$1) {
      super($$0, $$1);
   }

   public static byz.a j() {
      return cpk.m().a(bza.s, 12.0);
   }

   @Override
   public boolean c(ars $$0, bwt $$1) {
      if (super.c($$0, $$1)) {
         if ($$1 instanceof bxu) {
            int $$2 = 0;
            if (this.dV().an() == buo.c) {
               $$2 = 7;
            } else if (this.dV().an() == buo.d) {
               $$2 = 15;
            }

            if ($$2 > 0) {
               ((bxu)$$1).b(new bvx(bvz.s, $$2 * 20, 0), this);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Nullable
   @Override
   public bym a(dko $$0, bup $$1, bxb $$2, @Nullable bym $$3) {
      return $$3;
   }

   @Override
   public ffq l(bwt $$0) {
      return $$0.dq() <= this.dq() ? new ffq(0.0, 0.21875 * (double)this.el(), 0.0) : super.l($$0);
   }
}
