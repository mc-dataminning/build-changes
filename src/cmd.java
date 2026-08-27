public class cmd extends cnj {
   private final cmc a;

   public cmd(bmv $$0, int $$1, int $$2, int $$3, cmc $$4) {
      super($$0, $$1, $$2, $$3);
      this.a = $$4;
   }

   @Override
   public boolean a(cqk $$0) {
      return !this.a.e(this.e) && super.a($$0);
   }

   @Override
   public void b() {
      super.b();
      this.a.a(this.d);
   }
}
