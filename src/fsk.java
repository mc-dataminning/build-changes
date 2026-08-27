public class fsk extends ftu<byr, fem<byr>> {
   private static final aer a = new aer("textures/entity/enderman/enderman.png");
   private final aru i = aru.a();

   public fsk(fso.a $$0) {
      super($$0, new fem<>($$0.a(fhm.R)), 0.5F);
      this.a(new fwg<>(this));
      this.a(new fvx(this, $$0.c()));
   }

   public void a(byr $$0, float $$1, float $$2, elg $$3, fnl $$4, int $$5) {
      dfa $$6 = $$0.fZ();
      fem<byr> $$7 = this.a();
      $$7.a = $$6 != null;
      $$7.b = $$0.ga();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ehe a(byr $$0, float $$1) {
      if ($$0.ga()) {
         double $$2 = 0.02;
         return new ehe(this.i.k() * 0.02, 0.0, this.i.k() * 0.02);
      } else {
         return super.a($$0, $$1);
      }
   }

   public aer a(byr $$0) {
      return a;
   }
}
