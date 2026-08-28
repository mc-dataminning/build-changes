import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class bsz extends btb {
   public static final bsz a = new bsz(0.0F);
   public static final MapCodec<bsz> b = Codec.FLOAT.fieldOf("value").xmap(bsz::a, bsz::d);
   private final float d;

   public static bsz a(float $$0) {
      return $$0 == 0.0F ? a : new bsz($$0);
   }

   private bsz(float $$0) {
      this.d = $$0;
   }

   public float d() {
      return this.d;
   }

   @Override
   public float a(azt $$0) {
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
   public btc<?> c() {
      return btc.a;
   }

   @Override
   public String toString() {
      return Float.toString(this.d);
   }
}
