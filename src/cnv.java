import javax.annotation.Nullable;

public class cnv extends cow {
   public cnv(bwr<? extends cnv> $$0, djh $$1) {
      super($$0, $$1);
   }

   public static byo.a j() {
      return cow.m().a(byp.s, 12.0);
   }

   @Override
   public boolean c(arq $$0, bwi $$1) {
      if (super.c($$0, $$1)) {
         if ($$1 instanceof bxj) {
            int $$2 = 0;
            if (this.dU().an() == bud.c) {
               $$2 = 7;
            } else if (this.dU().an() == bud.d) {
               $$2 = 15;
            }

            if ($$2 > 0) {
               ((bxj)$$1).b(new bvm(bvo.s, $$2 * 20, 0), this);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Nullable
   @Override
   public byb a(djy $$0, bue $$1, bwq $$2, @Nullable byb $$3) {
      return $$3;
   }

   @Override
   public fex l(bwi $$0) {
      return $$0.dp() <= this.dp() ? new fex(0.0, 0.21875 * (double)this.ek(), 0.0) : super.l($$0);
   }
}
