public class fmi extends fnf {
   private final xp a;

   public fmi(xp $$0, xp $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected void aM_() {
      super.aM_();
      this.c(fhg.a(xo.e, $$0 -> this.m.a(null)).a(this.n / 2 - 100, 140, 200, 20).a());
   }

   @Override
   public void a(fgt $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 90, 16777215);
      $$0.a(this.p, this.a, this.n / 2, 110, 16777215);
   }

   @Override
   public void b(fgt $$0, int $$1, int $$2, float $$3) {
      $$0.b(0, 0, this.n, this.o, -12574688, -11530224);
   }

   @Override
   public boolean aC_() {
      return false;
   }
}
