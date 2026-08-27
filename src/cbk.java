import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cbk extends cck {
   public cbk(blj<? extends cbk> $$0, csy $$1) {
      super($$0, $$1);
   }

   public static bna.a u() {
      return cck.w().a(bnb.l, 12.0);
   }

   @Override
   public boolean C(blf $$0) {
      if (super.C($$0)) {
         if ($$0 instanceof blv) {
            int $$1 = 0;
            if (this.dM().aj() == bji.c) {
               $$1 = 7;
            } else if (this.dM().aj() == bji.d) {
               $$1 = 15;
            }

            if ($$1 > 0) {
               ((blv)$$0).b(new bks(bku.s, $$1 * 20, 0), this);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Nullable
   @Override
   public bmo a(ctn $$0, bjj $$1, blz $$2, @Nullable bmo $$3, @Nullable sj $$4) {
      return $$3;
   }

   @Override
   protected float b(bmh $$0, blg $$1) {
      return 0.45F;
   }

   @Override
   protected Vector3f a(blf $$0, blg $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b, 0.0F);
   }

   @Override
   protected float l(blf $$0) {
      return $$0.dg() <= this.dg() ? -0.21875F : 0.0F;
   }
}
