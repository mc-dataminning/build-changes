import com.mojang.serialization.Codec;

public class bhd extends bhg {
   public static final bhd a = new bhd(0);
   public static final Codec<bhd> b = asg.e(Codec.INT, Codec.INT.fieldOf("value").codec()).xmap(bhd::new, bhd::d);
   private final int f;

   public static bhd a(int $$0) {
      return $$0 == 0 ? a : new bhd($$0);
   }

   private bhd(int $$0) {
      this.f = $$0;
   }

   public int d() {
      return this.f;
   }

   @Override
   public int a(ate $$0) {
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
   public bhh<?> c() {
      return bhh.a;
   }

   @Override
   public String toString() {
      return Integer.toString(this.f);
   }
}
