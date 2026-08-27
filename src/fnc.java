public class fnc<T extends cep> extends fmk<T> {
   private static final String a = "tail_base";
   private static final String b = "tail_tip";
   private final fpc f;
   private final fpc g;
   private final fpc h;
   private final fpc i;
   private final fpc j;
   private final fpc k;
   private final fpc l;

   public fnc(fpc $$0) {
      this.f = $$0;
      fpc $$1 = $$0.b("body");
      this.k = $$1.b("tail_base");
      this.l = this.k.b("tail_tip");
      this.g = $$1.b("left_wing_base");
      this.h = this.g.b("left_wing_tip");
      this.i = $$1.b("right_wing_base");
      this.j = this.i.b("right_wing_tip");
   }

   public static fpi b() {
      fpk $$0 = new fpk();
      fpl $$1 = $$0.a();
      fpl $$2 = $$1.a("body", fph.c().a(0, 8).a(-3.0F, -2.0F, -8.0F, 5.0F, 3.0F, 9.0F), fpe.b(-0.1F, 0.0F, 0.0F));
      fpl $$3 = $$2.a("tail_base", fph.c().a(3, 20).a(-2.0F, 0.0F, 0.0F, 3.0F, 2.0F, 6.0F), fpe.a(0.0F, -2.0F, 1.0F));
      $$3.a("tail_tip", fph.c().a(4, 29).a(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 6.0F), fpe.a(0.0F, 0.5F, 6.0F));
      fpl $$4 = $$2.a("left_wing_base", fph.c().a(23, 12).a(0.0F, 0.0F, 0.0F, 6.0F, 2.0F, 9.0F), fpe.a(2.0F, -2.0F, -8.0F, 0.0F, 0.0F, 0.1F));
      $$4.a("left_wing_tip", fph.c().a(16, 24).a(0.0F, 0.0F, 0.0F, 13.0F, 1.0F, 9.0F), fpe.a(6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1F));
      fpl $$5 = $$2.a("right_wing_base", fph.c().a(23, 12).a().a(-6.0F, 0.0F, 0.0F, 6.0F, 2.0F, 9.0F), fpe.a(-3.0F, -2.0F, -8.0F, 0.0F, 0.0F, -0.1F));
      $$5.a("right_wing_tip", fph.c().a(16, 24).a().a(-13.0F, 0.0F, 0.0F, 13.0F, 1.0F, 9.0F), fpe.a(-6.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F));
      $$2.a("head", fph.c().a(0, 0).a(-4.0F, -2.0F, -5.0F, 7.0F, 3.0F, 5.0F), fpe.a(0.0F, 1.0F, -7.0F, 0.2F, 0.0F, 0.0F));
      return fpi.a($$0, 64, 64);
   }

   @Override
   public fpc a() {
      return this.f;
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = ((float)$$0.w() + $$3) * 7.448451F * (float) (Math.PI / 180.0);
      float $$7 = 16.0F;
      this.g.g = awh.b($$6) * 16.0F * (float) (Math.PI / 180.0);
      this.h.g = awh.b($$6) * 16.0F * (float) (Math.PI / 180.0);
      this.i.g = -this.g.g;
      this.j.g = -this.h.g;
      this.k.e = -(5.0F + awh.b($$6 * 2.0F) * 5.0F) * (float) (Math.PI / 180.0);
      this.l.e = -(5.0F + awh.b($$6 * 2.0F) * 5.0F) * (float) (Math.PI / 180.0);
   }
}
