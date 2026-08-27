public class fla extends flu {
   private final fmx a;
   private final fmx b;
   private final fmx c;

   public fla(fmx $$0) {
      this.a = $$0.b("head");
      this.b = this.a.b("left_ear");
      this.c = this.a.b("right_ear");
   }

   public static fnf a() {
      fnf $$0 = new fnf();
      flb.a(fnb.a, $$0);
      return $$0;
   }

   @Override
   public void a(float $$0, float $$1, float $$2) {
      this.a.f = $$1 * (float) (Math.PI / 180.0);
      this.a.e = $$2 * (float) (Math.PI / 180.0);
      float $$3 = 1.2F;
      this.b.g = (float)(-(Math.cos((double)($$0 * (float) Math.PI * 0.2F * 1.2F)) + 2.5)) * 0.2F;
      this.c.g = (float)(Math.cos((double)($$0 * (float) Math.PI * 0.2F)) + 2.5) * 0.2F;
   }

   @Override
   public void a(eqb $$0, eqf $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
