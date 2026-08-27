import com.mojang.serialization.Codec;

public class bfp extends bfr {
   public static final bfp a = new bfp(0.0F);
   public static final Codec<bfp> b = aqw.c(Codec.FLOAT, Codec.FLOAT.fieldOf("value").codec()).xmap(bfp::new, bfp::d);
   private final float d;

   public static bfp a(float $$0) {
      return $$0 == 0.0F ? a : new bfp($$0);
   }

   private bfp(float $$0) {
      this.d = $$0;
   }

   public float d() {
      return this.d;
   }

   @Override
   public float a(art $$0) {
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
   public bfs<?> c() {
      return bfs.a;
   }

   @Override
   public String toString() {
      return Float.toString(this.d);
   }
}
