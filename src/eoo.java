import com.mojang.serialization.MapCodec;

public class eoo extends eop {
   public static final eoo a = new eoo(egh.a(0));
   public static final MapCodec<eoo> b = egh.a.fieldOf("value").xmap(eoo::new, eoo::b);
   private final egh d;

   public static eoo a(egh $$0) {
      return new eoo($$0);
   }

   private eoo(egh $$0) {
      this.d = $$0;
   }

   public egh b() {
      return this.d;
   }

   @Override
   public int a(azt $$0, egk $$1) {
      return this.d.a($$1);
   }

   @Override
   public eoq<?> a() {
      return eoq.a;
   }

   @Override
   public String toString() {
      return this.d.toString();
   }
}
