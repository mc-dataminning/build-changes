public class fof<T extends box> extends fon<T> {
   private static final String a = "base";
   private static final String b = "upper_jaw";
   private static final String f = "lower_jaw";
   private final frf g;
   private final frf h;
   private final frf i;
   private final frf j;

   public fof(frf $$0) {
      this.g = $$0;
      this.h = $$0.b("base");
      this.i = $$0.b("upper_jaw");
      this.j = $$0.b("lower_jaw");
   }

   public static frl b() {
      frn $$0 = new frn();
      fro $$1 = $$0.a();
      $$1.a("base", frk.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 10.0F, 12.0F, 10.0F), frh.a(-5.0F, 24.0F, -5.0F));
      frk $$2 = frk.c().a(40, 0).a(0.0F, 0.0F, 0.0F, 4.0F, 14.0F, 8.0F);
      $$1.a("upper_jaw", $$2, frh.a(1.5F, 24.0F, -4.0F));
      $$1.a("lower_jaw", $$2, frh.a(-1.5F, 24.0F, 4.0F, 0.0F, (float) Math.PI, 0.0F));
      return frl.a($$0, 64, 32);
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
      float $$7 = ($$1 + aww.a($$1 * 2.7F)) * 0.6F * 12.0F;
      this.i.c = 24.0F - $$7;
      this.j.c = this.i.c;
      this.h.c = this.i.c;
   }

   @Override
   public frf a() {
      return this.g;
   }
}
