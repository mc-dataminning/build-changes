import com.mojang.serialization.Codec;

public class bmf extends bmi {
   public static final bmf a = new bmf(0);
   public static final Codec<bmf> b = awe.e(Codec.INT, Codec.INT.fieldOf("value").codec()).xmap(bmf::new, bmf::d);
   private final int f;

   public static bmf a(int $$0) {
      return $$0 == 0 ? a : new bmf($$0);
   }

   private bmf(int $$0) {
      this.f = $$0;
   }

   public int d() {
      return this.f;
   }

   @Override
   public int a(axd $$0) {
      return this.f;
   }

   @Override
   public int a() {
      return this.f;
   }

   @Override
   public int b() {
      return this.f;
   }

   @Override
   public bmj<?> c() {
      return bmj.a;
   }

   @Override
   public String toString() {
      return Integer.toString(this.f);
   }
}
