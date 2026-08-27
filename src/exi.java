public class exi extends eyk {
   private etj a;
   private final Runnable b;

   public exi(Runnable $$0) {
      super(tm.c("datapackFailure.title"));
      this.a = etj.a;
      this.b = $$0;
   }

   @Override
   protected void aI_() {
      super.aI_();
      this.a = etj.a(this.i, this.m(), this.g - 50);
      this.d(esq.a(tm.c("datapackFailure.safeMode"), $$0 -> this.b.run()).a(this.g / 2 - 155, this.h / 6 + 96, 150, 20).a());
      this.d(esq.a(tl.l, $$0 -> this.f.a(null)).a(this.g / 2 - 155 + 160, this.h / 6 + 96, 150, 20).a());
   }

   @Override
   public void a(esf $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a.a($$0, this.g / 2, 70);
   }

   @Override
   public boolean ay_() {
      return false;
   }
}
