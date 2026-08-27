import com.mojang.serialization.Codec;

public class bjc extends bjf {
   public static final bjc a = new bjc(0);
   public static final Codec<bjc> b = atv.e(Codec.INT, Codec.INT.fieldOf("value").codec()).xmap(bjc::new, bjc::d);
   private final int f;

   public static bjc a(int $$0) {
      return $$0 == 0 ? a : new bjc($$0);
   }

   private bjc(int $$0) {
      this.f = $$0;
   }

   public int d() {
      return this.f;
   }

   @Override
   public int a(auu $$0) {
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
   public bjg<?> c() {
      return bjg.a;
   }

   @Override
   public String toString() {
      return Integer.toString(this.f);
   }
}
