import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bzw extends caw {
   public bzw(bjx<? extends bzw> $$0, cqz $$1) {
      super($$0, $$1);
   }

   public static blo.a s() {
      return caw.t().a(blp.l, 12.0);
   }

   @Override
   public boolean C(bjt $$0) {
      if (super.C($$0)) {
         if ($$0 instanceof bkj) {
            int $$1 = 0;
            if (this.dL().ai() == bhy.c) {
               $$1 = 7;
            } else if (this.dL().ai() == bhy.d) {
               $$1 = 15;
            }

            if ($$1 > 0) {
               ((bkj)$$0).b(new bjg(bji.s, $$1 * 20, 0), this);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Nullable
   @Override
   public blc a(cro $$0, bhz $$1, bkn $$2, @Nullable blc $$3, @Nullable rt $$4) {
      return $$3;
   }

   @Override
   protected float b(bkv $$0, bju $$1) {
      return 0.45F;
   }

   @Override
   protected Vector3f a(bjt $$0, bju $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b, 0.0F);
   }

   @Override
   protected float l(bjt $$0) {
      return $$0.df() <= this.df() ? -0.21875F : 0.0F;
   }
}
