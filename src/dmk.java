import com.mojang.serialization.MapCodec;

public class dmk extends dho {
   public static final MapCodec<dmk> b = b(dmk::new);

   protected dmk(dra.d $$0) {
      super($$0);
   }

   @Override
   protected MapCodec<? extends dmk> a() {
      return b;
   }

   @Override
   protected evd c(drb $$0, dad $$1, io $$2, eup $$3) {
      return eva.a();
   }

   @Override
   protected float d(drb $$0, dad $$1, io $$2) {
      return 1.0F;
   }

   @Override
   protected boolean a_(drb $$0, dad $$1, io $$2) {
      return true;
   }
}
