import com.mojang.serialization.MapCodec;

public class emi extends emj {
   public static final MapCodec<emi> a = MapCodec.unit(() -> emi.b);
   public static final emi b = new emi();

   private emi() {
   }

   @Override
   public boolean a(ja $$0, ja $$1, ja $$2, ayo $$3) {
      return true;
   }

   @Override
   protected emk<?> a() {
      return emk.a;
   }
}
