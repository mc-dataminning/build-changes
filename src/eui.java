public class eui extends euq {
   protected final euq a;
   protected final enr b;

   public eui(euq $$0, enr $$1, sw $$2) {
      super($$2);
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void ax_() {
      this.f.m.aq();
   }

   @Override
   public void aw_() {
      this.f.a(this.a);
   }

   protected void a(eox $$0, eqd $$1, int $$2, int $$3, float $$4) {
      this.a($$0);
      $$1.a($$0, $$2, $$3, $$4);
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
      super.a($$0, $$2, $$3, $$4);
   }
}
