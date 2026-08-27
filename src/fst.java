public class fst extends fud<byq, fer<byq>> {
   private static final aer a = new aer("textures/entity/enderman/enderman.png");
   private final aru i = aru.a();

   public fst(fsx.a $$0) {
      super($$0, new fer<>($$0.a(fhr.R)), 0.5F);
      this.a(new fwp<>(this));
      this.a(new fwg(this, $$0.c()));
   }

   public void a(byq $$0, float $$1, float $$2, elf $$3, fnu $$4, int $$5) {
      dez $$6 = $$0.ga();
      fer<byq> $$7 = this.a();
      $$7.a = $$6 != null;
      $$7.b = $$0.gb();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ehd a(byq $$0, float $$1) {
      if ($$0.gb()) {
         double $$2 = 0.02;
         return new ehd(this.i.k() * 0.02, 0.0, this.i.k() * 0.02);
      } else {
         return super.a($$0, $$1);
      }
   }

   public aer a(byq $$0) {
      return a;
   }
}
