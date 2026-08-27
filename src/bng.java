import com.mojang.serialization.Codec;

public class bng extends bni {
   public static final bng a = new bng(0.0F);
   public static final Codec<bng> b = awu.e(Codec.FLOAT, Codec.FLOAT.fieldOf("value").codec()).xmap(bng::new, bng::d);
   private final float d;

   public static bng a(float $$0) {
      return $$0 == 0.0F ? a : new bng($$0);
   }

   private bng(float $$0) {
      this.d = $$0;
   }

   public float d() {
      return this.d;
   }

   @Override
   public float a(axt $$0) {
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
   public bnj<?> c() {
      return bnj.a;
   }

   @Override
   public String toString() {
      return Float.toString(this.d);
   }
}
