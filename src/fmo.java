public class fmo<T extends cdh> extends fki<T> implements fmf {
   private final fmv a = this.l.b("hat_rim");

   public fmo(fmv $$0) {
      super($$0);
   }

   public static fnb c() {
      fnd $$0 = fki.a(fmz.a, 0.0F);
      fne $$1 = $$0.a();
      $$1.a("head", new fna().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F).a(24, 0).a(-1.0F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F), fmx.a);
      fne $$2 = $$1.a("hat", fna.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new fmz(0.5F)), fmx.a);
      $$2.a("hat_rim", fna.c().a(30, 47).a(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F), fmx.b((float) (-Math.PI / 2), 0.0F, 0.0F));
      $$1.a("body", fna.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F).a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new fmz(0.05F)), fmx.a);
      $$1.a("right_arm", fna.c().a(44, 22).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), fmx.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", fna.c().a(44, 22).a().a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), fmx.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", fna.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), fmx.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", fna.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), fmx.a(2.0F, 12.0F, 0.0F));
      return fnb.a($$0, 64, 64);
   }

   public static fnb a(fmz $$0) {
      fnd $$1 = fki.a($$0, 0.0F);
      fne $$2 = $$1.a();
      $$2.a("head", fna.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), fmx.a);
      $$2.a("body", fna.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0.a(0.1F)), fmx.a);
      $$2.a("right_leg", fna.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), fmx.a(-2.0F, 12.0F, 0.0F));
      $$2.a("left_leg", fna.c().a(0, 16).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), fmx.a(2.0F, 12.0F, 0.0F));
      $$2.a("hat").a("hat_rim", fna.c(), fmx.a);
      return fnb.a($$1, 64, 32);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      fiu.a(this.o, this.n, $$0.fW(), this.c, $$3);
   }

   @Override
   public void a(boolean $$0) {
      this.k.k = $$0;
      this.l.k = $$0;
      this.a.k = $$0;
   }
}
