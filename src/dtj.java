import com.mojang.serialization.Codec;

public class dtj extends dtk {
   public static final dtj a = new dtj(dlh.a(0));
   public static final Codec<dtj> b = arb.e(dlh.a, dlh.a.fieldOf("value").codec()).xmap(dtj::new, dtj::b);
   private final dlh d;

   public static dtj a(dlh $$0) {
      return new dtj($$0);
   }

   private dtj(dlh $$0) {
      this.d = $$0;
   }

   public dlh b() {
      return this.d;
   }

   @Override
   public int a(arx $$0, dlk $$1) {
      return this.d.a($$1);
   }

   @Override
   public dtl<?> a() {
      return dtl.a;
   }

   @Override
   public String toString() {
      return this.d.toString();
   }
}
