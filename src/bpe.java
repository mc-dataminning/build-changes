import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class bpe extends bpg {
   public static final bpe a = new bpe(0.0F);
   public static final MapCodec<bpe> b = Codec.FLOAT.fieldOf("value").xmap(bpe::a, bpe::d);
   private final float d;

   public static bpe a(float $$0) {
      return $$0 == 0.0F ? a : new bpe($$0);
   }

   private bpe(float $$0) {
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
   public bph<?> c() {
      return bph.a;
   }

   @Override
   public String toString() {
      return Float.toString(this.d);
   }
}
