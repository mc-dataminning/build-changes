public class fkl extends flz {
   private static final int a = 90;
   private final wx b;
   private fgt c = fgt.a;
   private final Runnable d;
   private final wx r;
   private final boolean s;

   public fkl(Runnable $$0, wx $$1, wx $$2) {
      this($$0, $$1, $$2, ww.k, true);
   }

   public fkl(Runnable $$0, wx $$1, wx $$2, wx $$3, boolean $$4) {
      super($$1);
      this.d = $$0;
      this.b = $$2;
      this.r = $$3;
      this.s = $$4;
   }

   @Override
   public wx i() {
      return ww.a(super.i(), this.b);
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.c = fgt.a(this.p, this.b, this.n - 50);
      int $$0 = this.c.a() * 9;
      int $$1 = ayf.a(90 + $$0 + 12, this.o / 6 + 96, this.o - 24);
      int $$2 = 150;
      this.c(fga.a(this.r, $$0x -> this.d.run()).a((this.n - 150) / 2, $$1, 150, 20).a());
   }

   @Override
   public void a(ffn $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 70, 16777215);
      this.c.a($$0, this.n / 2, 90);
   }

   @Override
   public boolean aE_() {
      return this.s;
   }
}
