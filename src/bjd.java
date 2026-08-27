import com.mojang.serialization.Codec;

public class bjd extends bjg {
   public static final bjd a = new bjd(0);
   public static final Codec<bjd> b = atw.e(Codec.INT, Codec.INT.fieldOf("value").codec()).xmap(bjd::new, bjd::d);
   private final int f;

   public static bjd a(int $$0) {
      return $$0 == 0 ? a : new bjd($$0);
   }

   private bjd(int $$0) {
      this.f = $$0;
   }

   public int d() {
      return this.f;
   }

   @Override
   public int a(auv $$0) {
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
   public bjh<?> c() {
      return bjh.a;
   }

   @Override
   public String toString() {
      return Integer.toString(this.f);
   }
}
