import java.util.Map;

public class aal implements zw<aac> {
   public static final zn<wm, aal> a = zw.a(aal::a, aal::new);
   private final Map<ale<? extends jv<?>>, axi.a> b;

   public aal(Map<ale<? extends jv<?>>, axi.a> $$0) {
      this.b = $$0;
   }

   private aal(wm $$0) {
      this.b = $$0.a(wm::r, axi.a::b);
   }

   private void a(wm $$0) {
      $$0.a(this.b, wm::b, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zy<aal> a() {
      return aam.i;
   }

   public void a(aac $$0) {
      $$0.a(this);
   }

   public Map<ale<? extends jv<?>>, axi.a> b() {
      return this.b;
   }
}
