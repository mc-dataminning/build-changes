import com.mojang.serialization.Codec;

public class bfq extends bft {
   public static final bfq a = new bfq(0);
   public static final Codec<bfq> b = aqw.c(Codec.INT, Codec.INT.fieldOf("value").codec()).xmap(bfq::new, bfq::d);
   private final int f;

   public static bfq a(int $$0) {
      return $$0 == 0 ? a : new bfq($$0);
   }

   private bfq(int $$0) {
      this.f = $$0;
   }

   public int d() {
      return this.f;
   }

   @Override
   public int a(art $$0) {
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
   public bfu<?> c() {
      return bfu.a;
   }

   @Override
   public String toString() {
      return Integer.toString(this.f);
   }
}
