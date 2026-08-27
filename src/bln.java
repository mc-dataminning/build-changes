import com.mojang.serialization.Codec;

public class bln extends blq {
   public static final bln a = new bln(0);
   public static final Codec<bln> b = avu.e(Codec.INT, Codec.INT.fieldOf("value").codec()).xmap(bln::new, bln::d);
   private final int f;

   public static bln a(int $$0) {
      return $$0 == 0 ? a : new bln($$0);
   }

   private bln(int $$0) {
      this.f = $$0;
   }

   public int d() {
      return this.f;
   }

   @Override
   public int a(awt $$0) {
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
   public blr<?> c() {
      return blr.a;
   }

   @Override
   public String toString() {
      return Integer.toString(this.f);
   }
}
