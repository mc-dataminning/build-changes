public class cpi extends cqo {
   private final cph a;

   public cpi(bpn $$0, int $$1, int $$2, int $$3, cph $$4) {
      super($$0, $$1, $$2, $$3);
      this.a = $$4;
   }

   @Override
   public boolean a(cto $$0) {
      return !this.a.e(this.e) && super.a($$0);
   }

   @Override
   public void b() {
      super.b();
      this.a.a(this.d);
   }
}
