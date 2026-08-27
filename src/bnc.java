import com.mojang.serialization.Codec;

public class bnc extends bnf {
   public static final bnc a = new bnc(0);
   public static final Codec<bnc> b = aws.e(Codec.INT, Codec.INT.fieldOf("value").codec()).xmap(bnc::new, bnc::d);
   private final int f;

   public static bnc a(int $$0) {
      return $$0 == 0 ? a : new bnc($$0);
   }

   private bnc(int $$0) {
      this.f = $$0;
   }

   public int d() {
      return this.f;
   }

   @Override
   public int a(axr $$0) {
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
   public bng<?> c() {
      return bng.a;
   }

   @Override
   public String toString() {
      return Integer.toString(this.f);
   }
}
