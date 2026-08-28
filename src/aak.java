import java.util.Map;

public class aak implements zv<aab> {
   public static final zm<wl, aak> a = zv.a(aak::a, aak::new);
   private final Map<ald<? extends jv<?>>, axh.a> b;

   public aak(Map<ald<? extends jv<?>>, axh.a> $$0) {
      this.b = $$0;
   }

   private aak(wl $$0) {
      this.b = $$0.a(wl::r, axh.a::b);
   }

   private void a(wl $$0) {
      $$0.a(this.b, wl::b, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zx<aak> a() {
      return aal.i;
   }

   public void a(aab $$0) {
      $$0.a(this);
   }

   public Map<ald<? extends jv<?>>, axh.a> b() {
      return this.b;
   }
}
