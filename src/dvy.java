import com.mojang.serialization.MapCodec;

public class dvy extends dwd {
   public static final MapCodec<dvy> a = b(dvy::new);

   @Override
   public MapCodec<dvy> a() {
      return a;
   }

   public dvy(ebd.d $$0) {
      super($$0);
   }

   @Override
   protected boolean e_(ebe $$0) {
      return false;
   }

   @Override
   protected int i_(ebe $$0) {
      return 15;
   }
}
