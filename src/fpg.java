public class fpg extends fqd {
   private fld a;
   private final Runnable b;
   private final Runnable c;

   public fpg(Runnable $$0, Runnable $$1) {
      super(xd.c("datapackFailure.title"));
      this.a = fld.a;
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void aR_() {
      super.aR_();
      this.a = fld.a(this.p, this.n(), this.n - 50);
      this.c(fkk.a(xd.c("datapackFailure.safeMode"), $$0 -> this.c.run()).a(this.n / 2 - 155, this.o / 6 + 96, 150, 20).a());
      this.c(fkk.a(xc.k, $$0 -> this.b.run()).a(this.n / 2 - 155 + 160, this.o / 6 + 96, 150, 20).a());
   }

   @Override
   public void a(fjx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a.a($$0, this.n / 2, 70);
   }

   @Override
   public boolean aH_() {
      return false;
   }
}
