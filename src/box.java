import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class box extends boz {
   public static final box a = new box(0.0F);
   public static final MapCodec<box> b = Codec.FLOAT.fieldOf("value").xmap(box::a, box::d);
   private final float d;

   public static box a(float $$0) {
      return $$0 == 0.0F ? a : new box($$0);
   }

   private box(float $$0) {
      this.d = $$0;
   }

   public float d() {
      return this.d;
   }

   @Override
   public float a(aym $$0) {
      return this.d;
   }

   @Override
   public float a() {
      return this.d;
   }

   @Override
   public float b() {
      return this.d + 1.0F;
   }

   @Override
   public bpa<?> c() {
      return bpa.a;
   }

   @Override
   public String toString() {
      return Float.toString(this.d);
   }
}
