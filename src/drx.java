import com.mojang.serialization.MapCodec;

public class drx extends dsb {
   public static final MapCodec<drx> a = b(drx::new);

   @Override
   public MapCodec<drx> a() {
      return a;
   }

   public drx(dwu.d $$0) {
      super($$0);
   }

   @Override
   protected boolean e_(dwv $$0) {
      return false;
   }

   @Override
   protected int i_(dwv $$0) {
      return 15;
   }
}
