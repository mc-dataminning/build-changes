public class fhc<T extends bzs> extends fex<T> implements fgu {
   private final fhj a = this.l.b("hat_rim");

   public fhc(fhj $$0) {
      super($$0);
   }

   public static fhp c() {
      fhr $$0 = fex.a(fhn.a, 0.0F);
      fhs $$1 = $$0.a();
      $$1.a("head", new fho().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F).a(24, 0).a(-1.0F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F), fhl.a);
      fhs $$2 = $$1.a("hat", fho.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new fhn(0.5F)), fhl.a);
      $$2.a("hat_rim", fho.c().a(30, 47).a(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F), fhl.b((float) (-Math.PI / 2), 0.0F, 0.0F));
      $$1.a("body", fho.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F).a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new fhn(0.05F)), fhl.a);
      $$1.a("right_arm", fho.c().a(44, 22).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), fhl.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", fho.c().a(44, 22).a().a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), fhl.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", fho.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), fhl.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", fho.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), fhl.a(2.0F, 12.0F, 0.0F));
      return fhp.a($$0, 64, 64);
   }

   public static fhp a(fhn $$0) {
      fhr $$1 = fex.a($$0, 0.0F);
      fhs $$2 = $$1.a();
      $$2.a("head", fho.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), fhl.a);
      $$2.a("body", fho.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0.a(0.1F)), fhl.a);
      $$2.a("right_leg", fho.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), fhl.a(-2.0F, 12.0F, 0.0F));
      $$2.a("left_leg", fho.c().a(0, 16).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), fhl.a(2.0F, 12.0F, 0.0F));
      $$2.a("hat").a("hat_rim", fho.c(), fhl.a);
      return fhp.a($$1, 64, 32);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      fdk.a(this.o, this.n, $$0.fS(), this.c, $$3);
   }

   @Override
   public void a(boolean $$0) {
      this.k.k = $$0;
      this.l.k = $$0;
      this.a.k = $$0;
   }
}
