import com.mojang.serialization.Codec;

public class bid extends big {
   public static final bid a = new bid(0);
   public static final Codec<bid> b = asy.e(Codec.INT, Codec.INT.fieldOf("value").codec()).xmap(bid::new, bid::d);
   private final int f;

   public static bid a(int $$0) {
      return $$0 == 0 ? a : new bid($$0);
   }

   private bid(int $$0) {
      this.f = $$0;
   }

   public int d() {
      return this.f;
   }

   @Override
   public int a(atw $$0) {
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
   public bih<?> c() {
      return bih.a;
   }

   @Override
   public String toString() {
      return Integer.toString(this.f);
   }
}
