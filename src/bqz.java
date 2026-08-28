import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class bqz extends brb {
   public static final bqz a = new bqz(0.0F);
   public static final MapCodec<bqz> b = Codec.FLOAT.fieldOf("value").xmap(bqz::a, bqz::d);
   private final float d;

   public static bqz a(float $$0) {
      return $$0 == 0.0F ? a : new bqz($$0);
   }

   private bqz(float $$0) {
      this.d = $$0;
   }

   public float d() {
      return this.d;
   }

   @Override
   public float a(azr $$0) {
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
   public brc<?> c() {
      return brc.a;
   }

   @Override
   public String toString() {
      return Float.toString(this.d);
   }
}
