import com.mojang.serialization.Codec;

public class bfr extends bft {
   public static final bfr a = new bfr(0.0F);
   public static final Codec<bfr> b = aqy.c(Codec.FLOAT, Codec.FLOAT.fieldOf("value").codec()).xmap(bfr::new, bfr::d);
   private final float d;

   public static bfr a(float $$0) {
      return $$0 == 0.0F ? a : new bfr($$0);
   }

   private bfr(float $$0) {
      this.d = $$0;
   }

   public float d() {
      return this.d;
   }

   @Override
   public float a(aru $$0) {
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
   public bfu<?> c() {
      return bfu.a;
   }

   @Override
   public String toString() {
      return Float.toString(this.d);
   }
}
