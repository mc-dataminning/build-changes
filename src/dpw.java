import com.mojang.serialization.MapCodec;

public class dpw extends dkz {
   public static final MapCodec<dpw> b = b(dpw::new);

   protected dpw(dun.d $$0) {
      super($$0);
   }

   @Override
   protected MapCodec<? extends dpw> a() {
      return b;
   }

   @Override
   protected ezm c(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return ezj.a();
   }

   @Override
   protected float c(duo $$0, ddl $$1, je $$2) {
      return 1.0F;
   }

   @Override
   protected boolean e_(duo $$0) {
      return true;
   }
}
