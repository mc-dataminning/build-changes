public class fju<T extends bkv> extends fid<T> {
   private static final String a = "upper_body";
   private final fkt b;
   private final fkt f;
   private final fkt g;
   private final fkt h;
   private final fkt i;

   public fju(fkt $$0) {
      this.b = $$0;
      this.g = $$0.b("head");
      this.h = $$0.b("left_arm");
      this.i = $$0.b("right_arm");
      this.f = $$0.b("upper_body");
   }

   public static fkz b() {
      flb $$0 = new flb();
      flc $$1 = $$0.a();
      float $$2 = 4.0F;
      fkx $$3 = new fkx(-0.5F);
      $$1.a("head", fky.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$3), fkv.a(0.0F, 4.0F, 0.0F));
      fky $$4 = fky.c().a(32, 0).a(-1.0F, 0.0F, -1.0F, 12.0F, 2.0F, 2.0F, $$3);
      $$1.a("left_arm", $$4, fkv.a(5.0F, 6.0F, 1.0F, 0.0F, 0.0F, 1.0F));
      $$1.a("right_arm", $$4, fkv.a(-5.0F, 6.0F, -1.0F, 0.0F, (float) Math.PI, -1.0F));
      $$1.a("upper_body", fky.c().a(0, 16).a(-5.0F, -10.0F, -5.0F, 10.0F, 10.0F, 10.0F, $$3), fkv.a(0.0F, 13.0F, 0.0F));
      $$1.a("lower_body", fky.c().a(0, 36).a(-6.0F, -12.0F, -6.0F, 12.0F, 12.0F, 12.0F, $$3), fkv.a(0.0F, 24.0F, 0.0F));
      return fkz.a($$0, 64, 64);
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.g.f = $$4 * (float) (Math.PI / 180.0);
      this.g.e = $$5 * (float) (Math.PI / 180.0);
      this.f.f = $$4 * (float) (Math.PI / 180.0) * 0.25F;
      float $$6 = atq.a(this.f.f);
      float $$7 = atq.b(this.f.f);
      this.h.f = this.f.f;
      this.i.f = this.f.f + (float) Math.PI;
      this.h.b = $$7 * 5.0F;
      this.h.d = -$$6 * 5.0F;
      this.i.b = -$$7 * 5.0F;
      this.i.d = $$6 * 5.0F;
   }

   @Override
   public fkt a() {
      return this.b;
   }

   public fkt c() {
      return this.g;
   }
}
