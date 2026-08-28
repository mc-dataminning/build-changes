import com.mojang.serialization.MapCodec;

public class drz extends dsd {
   public static final MapCodec<drz> a = b(drz::new);

   @Override
   public MapCodec<drz> a() {
      return a;
   }

   public drz(dww.d $$0) {
      super($$0);
   }

   @Override
   protected boolean e_(dwx $$0) {
      return false;
   }

   @Override
   protected int i_(dwx $$0) {
      return 15;
   }
}
