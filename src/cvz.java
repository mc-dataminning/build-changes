import com.mojang.serialization.MapCodec;

public class cvz extends cwa {
   public static final MapCodec<cvz> a = b(cvz::new);
   protected static final float b = 6.0F;
   protected static final emm c = cwq.a(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);

   @Override
   public MapCodec<cvz> a() {
      return a;
   }

   protected cvz(djg.d $$0) {
      super($$0);
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return c;
   }
}
