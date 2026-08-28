import com.mojang.serialization.MapCodec;

public class dlc extends dfh {
   public static final MapCodec<dlc> a = b(dlc::new);

   @Override
   public MapCodec<dlc> a() {
      return a;
   }

   public dlc(dsj.d $$0) {
      super($$0);
   }

   @Override
   protected boolean e_(dsk $$0) {
      return true;
   }

   @Override
   protected int a(dsk $$0, dbl $$1, ja $$2, jf $$3) {
      return 15;
   }
}
