public class fmp<T extends cdh> extends fkj<T> implements fmg {
   private final fmw a = this.l.b("hat_rim");

   public fmp(fmw $$0) {
      super($$0);
   }

   public static fnc c() {
      fne $$0 = fkj.a(fna.a, 0.0F);
      fnf $$1 = $$0.a();
      $$1.a("head", new fnb().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F).a(24, 0).a(-1.0F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F), fmy.a);
      fnf $$2 = $$1.a("hat", fnb.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new fna(0.5F)), fmy.a);
      $$2.a("hat_rim", fnb.c().a(30, 47).a(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F), fmy.b((float) (-Math.PI / 2), 0.0F, 0.0F));
      $$1.a("body", fnb.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F).a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new fna(0.05F)), fmy.a);
      $$1.a("right_arm", fnb.c().a(44, 22).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), fmy.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", fnb.c().a(44, 22).a().a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), fmy.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", fnb.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), fmy.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", fnb.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), fmy.a(2.0F, 12.0F, 0.0F));
      return fnc.a($$0, 64, 64);
   }

   public static fnc a(fna $$0) {
      fne $$1 = fkj.a($$0, 0.0F);
      fnf $$2 = $$1.a();
      $$2.a("head", fnb.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), fmy.a);
      $$2.a("body", fnb.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0.a(0.1F)), fmy.a);
      $$2.a("right_leg", fnb.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), fmy.a(-2.0F, 12.0F, 0.0F));
      $$2.a("left_leg", fnb.c().a(0, 16).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), fmy.a(2.0F, 12.0F, 0.0F));
      $$2.a("hat").a("hat_rim", fnb.c(), fmy.a);
      return fnc.a($$1, 64, 32);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      fiv.a(this.o, this.n, $$0.fW(), this.c, $$3);
   }

   @Override
   public void a(boolean $$0) {
      this.k.k = $$0;
      this.l.k = $$0;
      this.a.k = $$0;
   }
}
