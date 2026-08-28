import com.mojang.serialization.MapCodec;

public class dji extends dhs {
   public static final MapCodec<dji> a = b(dji::new);
   protected static final float b = 6.0F;
   protected static final ezm c = dhj.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dji> a() {
      return a;
   }

   protected dji(dun.d $$0) {
      super($$0);
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return c;
   }

   @Override
   protected boolean b(duo $$0, ddl $$1, je $$2) {
      return $$0.a(awt.cm);
   }
}
