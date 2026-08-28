import com.mojang.serialization.MapCodec;

public class ery extends erz {
   public static final MapCodec<ery> a = MapCodec.unit(() -> ery.b);
   public static final ery b = new ery();

   private ery() {
   }

   @Override
   public boolean a(jh $$0, jh $$1, jh $$2, bam $$3) {
      return true;
   }

   @Override
   protected esa<?> a() {
      return esa.a;
   }
}
