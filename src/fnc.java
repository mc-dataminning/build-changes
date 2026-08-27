public class fnc<T extends cdp> extends fkw<T> implements fmt {
   private final fnj a = this.l.b("hat_rim");

   public fnc(fnj $$0) {
      super($$0);
   }

   public static fnp c() {
      fnr $$0 = fkw.a(fnn.a, 0.0F);
      fns $$1 = $$0.a();
      $$1.a("head", new fno().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F).a(24, 0).a(-1.0F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F), fnl.a);
      fns $$2 = $$1.a("hat", fno.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new fnn(0.5F)), fnl.a);
      $$2.a("hat_rim", fno.c().a(30, 47).a(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F), fnl.b((float) (-Math.PI / 2), 0.0F, 0.0F));
      $$1.a("body", fno.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F).a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new fnn(0.05F)), fnl.a);
      $$1.a("right_arm", fno.c().a(44, 22).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), fnl.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", fno.c().a(44, 22).a().a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), fnl.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", fno.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), fnl.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", fno.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), fnl.a(2.0F, 12.0F, 0.0F));
      return fnp.a($$0, 64, 64);
   }

   public static fnp a(fnn $$0) {
      fnr $$1 = fkw.a($$0, 0.0F);
      fns $$2 = $$1.a();
      $$2.a("head", fno.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), fnl.a);
      $$2.a("body", fno.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0.a(0.1F)), fnl.a);
      $$2.a("right_leg", fno.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), fnl.a(-2.0F, 12.0F, 0.0F));
      $$2.a("left_leg", fno.c().a(0, 16).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), fnl.a(2.0F, 12.0F, 0.0F));
      $$2.a("hat").a("hat_rim", fno.c(), fnl.a);
      return fnp.a($$1, 64, 32);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      fjh.a(this.o, this.n, $$0.fX(), this.c, $$3);
   }

   @Override
   public void a(boolean $$0) {
      this.k.k = $$0;
      this.l.k = $$0;
      this.a.k = $$0;
   }
}
