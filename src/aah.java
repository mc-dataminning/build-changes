import java.util.Map;

public class aah implements zs<zy> {
   public static final zj<wl, aah> a = zs.a(aah::a, aah::new);
   private final Map<ala<? extends jv<?>>, axe.a> b;

   public aah(Map<ala<? extends jv<?>>, axe.a> $$0) {
      this.b = $$0;
   }

   private aah(wl $$0) {
      this.b = $$0.a(wl::r, axe.a::b);
   }

   private void a(wl $$0) {
      $$0.a(this.b, wl::b, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zu<aah> a() {
      return aai.i;
   }

   public void a(zy $$0) {
      $$0.a(this);
   }

   public Map<ala<? extends jv<?>>, axe.a> b() {
      return this.b;
   }
}
