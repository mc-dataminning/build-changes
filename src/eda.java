import com.mojang.serialization.Codec;

public class eda extends edb {
   public static final Codec<eda> a = Codec.unit(() -> eda.b);
   public static final eda b = new eda();

   private eda() {
   }

   @Override
   public boolean a(hx $$0, hx $$1, hx $$2, auw $$3) {
      return true;
   }

   @Override
   protected edc<?> a() {
      return edc.a;
   }
}
