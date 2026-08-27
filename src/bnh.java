import com.mojang.serialization.Codec;

public class bnh extends bnk {
   public static final bnh a = new bnh(0);
   public static final Codec<bnh> b = awu.e(Codec.INT, Codec.INT.fieldOf("value").codec()).xmap(bnh::new, bnh::d);
   private final int f;

   public static bnh a(int $$0) {
      return $$0 == 0 ? a : new bnh($$0);
   }

   private bnh(int $$0) {
      this.f = $$0;
   }

   public int d() {
      return this.f;
   }

   @Override
   public int a(axt $$0) {
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
   public bnl<?> c() {
      return bnl.a;
   }

   @Override
   public String toString() {
      return Integer.toString(this.f);
   }
}
