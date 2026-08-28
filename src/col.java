import javax.annotation.Nullable;

public class col extends cpm {
   public col(bxe<? extends col> $$0, djz $$1) {
      super($$0, $$1);
   }

   public static bzb.a j() {
      return cpm.m().a(bzc.s, 12.0);
   }

   @Override
   public boolean c(aru $$0, bwv $$1) {
      if (super.c($$0, $$1)) {
         if ($$1 instanceof bxw) {
            int $$2 = 0;
            if (this.dV().an() == buq.c) {
               $$2 = 7;
            } else if (this.dV().an() == buq.d) {
               $$2 = 15;
            }

            if ($$2 > 0) {
               ((bxw)$$1).b(new bvz(bwb.s, $$2 * 20, 0), this);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Nullable
   @Override
   public byo a(dkq $$0, bur $$1, bxd $$2, @Nullable byo $$3) {
      return $$3;
   }

   @Override
   public ffs l(bwv $$0) {
      return $$0.dq() <= this.dq() ? new ffs(0.0, 0.21875 * (double)this.el(), 0.0) : super.l($$0);
   }
}
