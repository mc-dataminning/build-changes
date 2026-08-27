public class foe extends fof {
   private final fpj b;
   protected final fpj a;

   public foe(fpj $$0) {
      this.b = $$0;
      this.a = $$0.b("head");
   }

   public static fpr a() {
      fpr $$0 = new fpr();
      fps $$1 = $$0.a();
      $$1.a("head", fpo.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), fpl.a);
      return $$0;
   }

   public static fpp b() {
      fpr $$0 = a();
      fps $$1 = $$0.a();
      $$1.a("head").a("hat", fpo.c().a(32, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fpn(0.25F)), fpl.a);
      return fpp.a($$0, 64, 64);
   }

   public static fpp c() {
      fpr $$0 = a();
      return fpp.a($$0, 64, 32);
   }

   @Override
   public void a(float $$0, float $$1, float $$2) {
      this.a.f = $$1 * (float) (Math.PI / 180.0);
      this.a.e = $$2 * (float) (Math.PI / 180.0);
   }

   @Override
   public void a(esh $$0, esl $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
