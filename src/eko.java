import com.mojang.serialization.MapCodec;

public class eko extends ekp {
   public static final eko a = new eko(eck.a(0));
   public static final MapCodec<eko> b = eck.a.fieldOf("value").xmap(eko::new, eko::b);
   private final eck d;

   public static eko a(eck $$0) {
      return new eko($$0);
   }

   private eko(eck $$0) {
      this.d = $$0;
   }

   public eck b() {
      return this.d;
   }

   @Override
   public int a(azu $$0, ecn $$1) {
      return this.d.a($$1);
   }

   @Override
   public ekq<?> a() {
      return ekq.a;
   }

   @Override
   public String toString() {
      return this.d.toString();
   }
}
