public class aar implements vd<ww> {
   private final tl a;
   private final tl b;

   public aar(tl $$0, tl $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public aar(so $$0) {
      this.a = $$0.l();
      this.b = $$0.l();
   }

   @Override
   public void a(so $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
   }

   public void a(ww $$0) {
      $$0.a(this);
   }

   public tl a() {
      return this.a;
   }

   public tl d() {
      return this.b;
   }
}
