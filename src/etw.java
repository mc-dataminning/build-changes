import com.mojang.serialization.MapCodec;

public class etw extends etx {
   public static final MapCodec<etw> a = MapCodec.unit(() -> etw.b);
   public static final etw b = new etw();

   private etw() {
   }

   @Override
   public boolean a(iu $$0, iu $$1, iu $$2, azt $$3) {
      return true;
   }

   @Override
   protected ety<?> a() {
      return ety.a;
   }
}
