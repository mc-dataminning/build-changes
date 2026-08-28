import java.util.Map;

public class aah implements zq<zw> {
   public static final zh<wg, aah> a = zq.a(aah::a, aah::new);
   private final Map<ali<? extends kd<?>>, axu.a> b;

   public aah(Map<ali<? extends kd<?>>, axu.a> $$0) {
      this.b = $$0;
   }

   private aah(wg $$0) {
      this.b = $$0.a(wg::r, axu.a::b);
   }

   private void a(wg $$0) {
      $$0.a(this.b, wg::b, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zs<aah> a() {
      return aai.k;
   }

   public void a(zw $$0) {
      $$0.a(this);
   }

   public Map<ali<? extends kd<?>>, axu.a> b() {
      return this.b;
   }
}
