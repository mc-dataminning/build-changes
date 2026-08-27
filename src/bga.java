import com.mojang.serialization.Codec;

public class bga extends bgd {
   public static final bga a = new bga(0);
   public static final Codec<bga> b = arf.e(Codec.INT, Codec.INT.fieldOf("value").codec()).xmap(bga::new, bga::d);
   private final int f;

   public static bga a(int $$0) {
      return $$0 == 0 ? a : new bga($$0);
   }

   private bga(int $$0) {
      this.f = $$0;
   }

   public int d() {
      return this.f;
   }

   @Override
   public int a(asc $$0) {
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
   public bge<?> c() {
      return bge.a;
   }

   @Override
   public String toString() {
      return Integer.toString(this.f);
   }
}
