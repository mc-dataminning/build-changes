import com.mojang.serialization.MapCodec;

public class epw extends epx {
   public static final MapCodec<epw> a = MapCodec.unit(() -> epw.b);
   public static final epw b = new epw();

   private epw() {
   }

   @Override
   public boolean a(jh $$0, jh $$1, jh $$2, azu $$3) {
      return true;
   }

   @Override
   protected epy<?> a() {
      return epy.a;
   }
}
