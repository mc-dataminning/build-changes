import com.mojang.serialization.Codec;

public class bin extends biq {
   public static final bin a = new bin(0);
   public static final Codec<bin> b = atg.e(Codec.INT, Codec.INT.fieldOf("value").codec()).xmap(bin::new, bin::d);
   private final int f;

   public static bin a(int $$0) {
      return $$0 == 0 ? a : new bin($$0);
   }

   private bin(int $$0) {
      this.f = $$0;
   }

   public int d() {
      return this.f;
   }

   @Override
   public int a(auf $$0) {
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
   public bir<?> c() {
      return bir.a;
   }

   @Override
   public String toString() {
      return Integer.toString(this.f);
   }
}
