public class efs implements eft {
   private final ctp b;

   public efs(ctp $$0) {
      this.b = $$0;
   }

   @Override
   public void a(ic $$0, djh $$1, hx $$2, hx $$3, int $$4, int $$5) {
      eft.a(this.b, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   @Override
   public void a(hx $$0, cwq $$1, hx $$2) {
      djh $$3 = this.b.a_($$0);
      this.a($$3, $$0, $$1, $$2, false);
   }

   @Override
   public void a(djh $$0, hx $$1, cwq $$2, hx $$3, boolean $$4) {
      eft.a(this.b, $$0, $$1, $$2, $$3, $$4);
   }
}
