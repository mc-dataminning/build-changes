import com.mojang.serialization.Codec;

public class bgc extends bgf {
   public static final bgc a = new bgc(0);
   public static final Codec<bgc> b = arh.e(Codec.INT, Codec.INT.fieldOf("value").codec()).xmap(bgc::new, bgc::d);
   private final int f;

   public static bgc a(int $$0) {
      return $$0 == 0 ? a : new bgc($$0);
   }

   private bgc(int $$0) {
      this.f = $$0;
   }

   public int d() {
      return this.f;
   }

   @Override
   public int a(ase $$0) {
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
   public bgg<?> c() {
      return bgg.a;
   }

   @Override
   public String toString() {
      return Integer.toString(this.f);
   }
}
