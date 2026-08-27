public class fip<T extends cbe> extends fgk<T> implements fih {
   private final fiw a = this.l.b("hat_rim");

   public fip(fiw $$0) {
      super($$0);
   }

   public static fjc c() {
      fje $$0 = fgk.a(fja.a, 0.0F);
      fjf $$1 = $$0.a();
      $$1.a("head", new fjb().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F).a(24, 0).a(-1.0F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F), fiy.a);
      fjf $$2 = $$1.a("hat", fjb.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new fja(0.5F)), fiy.a);
      $$2.a("hat_rim", fjb.c().a(30, 47).a(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F), fiy.b((float) (-Math.PI / 2), 0.0F, 0.0F));
      $$1.a("body", fjb.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F).a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new fja(0.05F)), fiy.a);
      $$1.a("right_arm", fjb.c().a(44, 22).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), fiy.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", fjb.c().a(44, 22).a().a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), fiy.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", fjb.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), fiy.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", fjb.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), fiy.a(2.0F, 12.0F, 0.0F));
      return fjc.a($$0, 64, 64);
   }

   public static fjc a(fja $$0) {
      fje $$1 = fgk.a($$0, 0.0F);
      fjf $$2 = $$1.a();
      $$2.a("head", fjb.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), fiy.a);
      $$2.a("body", fjb.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0.a(0.1F)), fiy.a);
      $$2.a("right_leg", fjb.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), fiy.a(-2.0F, 12.0F, 0.0F));
      $$2.a("left_leg", fjb.c().a(0, 16).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), fiy.a(2.0F, 12.0F, 0.0F));
      $$2.a("hat").a("hat_rim", fjb.c(), fiy.a);
      return fjc.a($$1, 64, 32);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      fex.a(this.o, this.n, $$0.fW(), this.c, $$3);
   }

   @Override
   public void a(boolean $$0) {
      this.k.k = $$0;
      this.l.k = $$0;
      this.a.k = $$0;
   }
}
