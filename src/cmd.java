import javax.annotation.Nullable;

public class cmd extends cnd {
   public cmd(bvi<? extends cmd> $$0, dgz $$1) {
      super($$0, $$1);
   }

   public static bxf.a j() {
      return cnd.m().a(bxg.s, 12.0);
   }

   @Override
   public boolean c(ard $$0, bva $$1) {
      if (super.c($$0, $$1)) {
         if ($$1 instanceof bvy) {
            int $$2 = 0;
            if (this.dU().an() == bsv.c) {
               $$2 = 7;
            } else if (this.dU().an() == bsv.d) {
               $$2 = 15;
            }

            if ($$2 > 0) {
               ((bvy)$$1).b(new bue(bug.s, $$2 * 20, 0), this);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Nullable
   @Override
   public bwr a(dhq $$0, bsw $$1, bvh $$2, @Nullable bwr $$3) {
      return $$3;
   }

   @Override
   public fbx l(bva $$0) {
      return $$0.dp() <= this.dp() ? new fbx(0.0, 0.21875 * (double)this.ej(), 0.0) : super.l($$0);
   }
}
