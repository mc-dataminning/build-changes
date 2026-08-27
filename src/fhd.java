public class fhd<T extends biq> extends ffm<T> {
   private static final String a = "upper_body";
   private final fic b;
   private final fic f;
   private final fic g;
   private final fic h;
   private final fic i;

   public fhd(fic $$0) {
      this.b = $$0;
      this.g = $$0.b("head");
      this.h = $$0.b("left_arm");
      this.i = $$0.b("right_arm");
      this.f = $$0.b("upper_body");
   }

   public static fii b() {
      fik $$0 = new fik();
      fil $$1 = $$0.a();
      float $$2 = 4.0F;
      fig $$3 = new fig(-0.5F);
      $$1.a("head", fih.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$3), fie.a(0.0F, 4.0F, 0.0F));
      fih $$4 = fih.c().a(32, 0).a(-1.0F, 0.0F, -1.0F, 12.0F, 2.0F, 2.0F, $$3);
      $$1.a("left_arm", $$4, fie.a(5.0F, 6.0F, 1.0F, 0.0F, 0.0F, 1.0F));
      $$1.a("right_arm", $$4, fie.a(-5.0F, 6.0F, -1.0F, 0.0F, (float) Math.PI, -1.0F));
      $$1.a("upper_body", fih.c().a(0, 16).a(-5.0F, -10.0F, -5.0F, 10.0F, 10.0F, 10.0F, $$3), fie.a(0.0F, 13.0F, 0.0F));
      $$1.a("lower_body", fih.c().a(0, 36).a(-6.0F, -12.0F, -6.0F, 12.0F, 12.0F, 12.0F, $$3), fie.a(0.0F, 24.0F, 0.0F));
      return fii.a($$0, 64, 64);
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.g.f = $$4 * (float) (Math.PI / 180.0);
      this.g.e = $$5 * (float) (Math.PI / 180.0);
      this.f.f = $$4 * (float) (Math.PI / 180.0) * 0.25F;
      float $$6 = arw.a(this.f.f);
      float $$7 = arw.b(this.f.f);
      this.h.f = this.f.f;
      this.i.f = this.f.f + (float) Math.PI;
      this.h.b = $$7 * 5.0F;
      this.h.d = -$$6 * 5.0F;
      this.i.b = -$$7 * 5.0F;
      this.i.d = $$6 * 5.0F;
   }

   @Override
   public fic a() {
      return this.b;
   }

   public fic c() {
      return this.g;
   }
}
