import com.mojang.serialization.Codec;

public class bhy extends bia {
   public static final bhy a = new bhy(0.0F);
   public static final Codec<bhy> b = asu.e(Codec.FLOAT, Codec.FLOAT.fieldOf("value").codec()).xmap(bhy::new, bhy::d);
   private final float d;

   public static bhy a(float $$0) {
      return $$0 == 0.0F ? a : new bhy($$0);
   }

   private bhy(float $$0) {
      this.d = $$0;
   }

   public float d() {
      return this.d;
   }

   @Override
   public float a(ats $$0) {
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
   public bib<?> c() {
      return bib.a;
   }

   @Override
   public String toString() {
      return Float.toString(this.d);
   }
}
