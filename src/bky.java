import com.mojang.serialization.Codec;

public class bky extends blb {
   public static final bky a = new bky(0);
   public static final Codec<bky> b = avq.e(Codec.INT, Codec.INT.fieldOf("value").codec()).xmap(bky::new, bky::d);
   private final int f;

   public static bky a(int $$0) {
      return $$0 == 0 ? a : new bky($$0);
   }

   private bky(int $$0) {
      this.f = $$0;
   }

   public int d() {
      return this.f;
   }

   @Override
   public int a(awp $$0) {
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
   public blc<?> c() {
      return blc.a;
   }

   @Override
   public String toString() {
      return Integer.toString(this.f);
   }
}
