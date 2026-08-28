import com.mojang.serialization.MapCodec;

public class dgs extends dgt {
   public static final MapCodec<dgs> a = b(dgs::new);
   protected static final float b = 6.0F;
   protected static final ezm c = dhj.a(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);

   @Override
   public MapCodec<dgs> a() {
      return a;
   }

   protected dgs(dun.d $$0) {
      super($$0);
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return c;
   }
}
