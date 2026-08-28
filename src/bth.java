import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class bth extends btj {
   public static final bth a = new bth(0.0F);
   public static final MapCodec<bth> b = Codec.FLOAT.fieldOf("value").xmap(bth::a, bth::d);
   private final float d;

   public static bth a(float $$0) {
      return $$0 == 0.0F ? a : new bth($$0);
   }

   private bth(float $$0) {
      this.d = $$0;
   }

   public float d() {
      return this.d;
   }

   @Override
   public float a(azv $$0) {
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
   public btk<?> c() {
      return btk.a;
   }

   @Override
   public String toString() {
      return Float.toString(this.d);
   }
}
