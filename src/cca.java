import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cca extends cda {
   public cca(blz<? extends cca> $$0, ctp $$1) {
      super($$0, $$1);
   }

   public static bnq.a u() {
      return cda.w().a(bnr.l, 12.0);
   }

   @Override
   public boolean C(blv $$0) {
      if (super.C($$0)) {
         if ($$0 instanceof bml) {
            int $$1 = 0;
            if (this.dM().ak() == bjy.c) {
               $$1 = 7;
            } else if (this.dM().ak() == bjy.d) {
               $$1 = 15;
            }

            if ($$1 > 0) {
               ((bml)$$0).b(new bli(blk.s, $$1 * 20, 0), this);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Nullable
   @Override
   public bne a(cue $$0, bjz $$1, bmp $$2, @Nullable bne $$3, @Nullable sn $$4) {
      return $$3;
   }

   @Override
   protected float b(bmx $$0, blw $$1) {
      return 0.45F;
   }

   @Override
   protected Vector3f a(blv $$0, blw $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b, 0.0F);
   }

   @Override
   protected float l(blv $$0) {
      return $$0.dg() <= this.dg() ? -0.21875F : 0.0F;
   }
}
