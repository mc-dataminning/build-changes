import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class bre extends brg {
   public static final bre a = new bre(0.0F);
   public static final MapCodec<bre> b = Codec.FLOAT.fieldOf("value").xmap(bre::a, bre::d);
   private final float d;

   public static bre a(float $$0) {
      return $$0 == 0.0F ? a : new bre($$0);
   }

   private bre(float $$0) {
      this.d = $$0;
   }

   public float d() {
      return this.d;
   }

   @Override
   public float a(azs $$0) {
      return this.d;
   }

   @Override
   public float a() {
      return this.d;
   }

   @Override
   public float b() {
      return this.d;
   }

   @Override
   public brh<?> c() {
      return brh.a;
   }

   @Override
   public String toString() {
      return Float.toString(this.d);
   }
}
