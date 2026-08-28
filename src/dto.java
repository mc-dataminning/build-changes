import com.mojang.serialization.MapCodec;

public class dto extends dom {
   public static final MapCodec<dto> b = b(dto::new);

   protected dto(dyl.d $$0) {
      super($$0);
   }

   @Override
   protected MapCodec<? extends dto> a() {
      return b;
   }

   @Override
   protected fdo c(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return fdl.a();
   }

   @Override
   protected float c(dym $$0, dgv $$1, jj $$2) {
      return 1.0F;
   }

   @Override
   protected boolean e_(dym $$0) {
      return true;
   }
}
