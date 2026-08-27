public class ffy<T extends bjt> extends fgg<T> {
   private static final String a = "base";
   private static final String b = "upper_jaw";
   private static final String f = "lower_jaw";
   private final fiw g;
   private final fiw h;
   private final fiw i;
   private final fiw j;

   public ffy(fiw $$0) {
      this.g = $$0;
      this.h = $$0.b("base");
      this.i = $$0.b("upper_jaw");
      this.j = $$0.b("lower_jaw");
   }

   public static fjc b() {
      fje $$0 = new fje();
      fjf $$1 = $$0.a();
      $$1.a("base", fjb.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 10.0F, 12.0F, 10.0F), fiy.a(-5.0F, 24.0F, -5.0F));
      fjb $$2 = fjb.c().a(40, 0).a(0.0F, 0.0F, 0.0F, 4.0F, 14.0F, 8.0F);
      $$1.a("upper_jaw", $$2, fiy.a(1.5F, 24.0F, -4.0F));
      $$1.a("lower_jaw", $$2, fiy.a(-1.5F, 24.0F, 4.0F, 0.0F, (float) Math.PI, 0.0F));
      return fjc.a($$0, 64, 32);
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = $$1 * 2.0F;
      if ($$6 > 1.0F) {
         $$6 = 1.0F;
      }

      $$6 = 1.0F - $$6 * $$6 * $$6;
      this.i.g = (float) Math.PI - $$6 * 0.35F * (float) Math.PI;
      this.j.g = (float) Math.PI + $$6 * 0.35F * (float) Math.PI;
      float $$7 = ($$1 + asy.a($$1 * 2.7F)) * 0.6F * 12.0F;
      this.i.c = 24.0F - $$7;
      this.j.c = this.i.c;
      this.h.c = this.i.c;
   }

   @Override
   public fiw a() {
      return this.g;
   }
}
