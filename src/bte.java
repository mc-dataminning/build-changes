import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class bte extends btg {
   public static final bte a = new bte(0.0F);
   public static final MapCodec<bte> b = Codec.FLOAT.fieldOf("value").xmap(bte::a, bte::d);
   private final float d;

   public static bte a(float $$0) {
      return $$0 == 0.0F ? a : new bte($$0);
   }

   private bte(float $$0) {
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
   public bth<?> c() {
      return bth.a;
   }

   @Override
   public String toString() {
      return Float.toString(this.d);
   }
}
