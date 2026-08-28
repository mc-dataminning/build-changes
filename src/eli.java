import com.mojang.serialization.MapCodec;

public class eli extends eme {
   public static final MapCodec<eli> a = MapCodec.unit(() -> eli.b);
   public static final eli b = new eli();

   private eli() {
   }

   @Override
   public boolean a(dsc $$0, azh $$1) {
      return true;
   }

   @Override
   protected emf<?> a() {
      return emf.a;
   }
}
