public class fpc<T extends cfk> extends fmv<T> implements fot {
   private final fpj a = this.l.b("hat_rim");

   public fpc(fpj $$0) {
      super($$0);
   }

   public static fpp c() {
      fpr $$0 = fmv.a(fpn.a, 0.0F);
      fps $$1 = $$0.a();
      $$1.a("head", new fpo().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F).a(24, 0).a(-1.0F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F), fpl.a);
      fps $$2 = $$1.a("hat", fpo.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new fpn(0.5F)), fpl.a);
      $$2.a("hat_rim", fpo.c().a(30, 47).a(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F), fpl.b((float) (-Math.PI / 2), 0.0F, 0.0F));
      $$1.a("body", fpo.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F).a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new fpn(0.05F)), fpl.a);
      $$1.a("right_arm", fpo.c().a(44, 22).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), fpl.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", fpo.c().a(44, 22).a().a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), fpl.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", fpo.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), fpl.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", fpo.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), fpl.a(2.0F, 12.0F, 0.0F));
      return fpp.a($$0, 64, 64);
   }

   public static fpp a(fpn $$0) {
      fpr $$1 = fmv.a($$0, 0.0F);
      fps $$2 = $$1.a();
      $$2.a("head", fpo.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), fpl.a);
      $$2.a("body", fpo.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0.a(0.1F)), fpl.a);
      $$2.a("right_leg", fpo.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), fpl.a(-2.0F, 12.0F, 0.0F));
      $$2.a("left_leg", fpo.c().a(0, 16).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), fpl.a(2.0F, 12.0F, 0.0F));
      $$2.a("hat").a("hat_rim", fpo.c(), fpl.a);
      return fpp.a($$1, 64, 32);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      flg.a(this.o, this.n, $$0.fY(), this.c, $$3);
   }

   @Override
   public void a(boolean $$0) {
      this.k.k = $$0;
      this.l.k = $$0;
      this.a.k = $$0;
   }
}
