public class ftf<T extends chs> extends fqz<T> implements fsw {
   private final ftm a = this.l.b("hat_rim");

   public ftf(ftm $$0) {
      super($$0);
   }

   public static fts c() {
      ftu $$0 = fqz.a(ftq.a, 0.0F);
      ftv $$1 = $$0.a();
      $$1.a("head", new ftr().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F).a(24, 0).a(-1.0F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F), fto.a);
      ftv $$2 = $$1.a("hat", ftr.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new ftq(0.5F)), fto.a);
      $$2.a("hat_rim", ftr.c().a(30, 47).a(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F), fto.b((float) (-Math.PI / 2), 0.0F, 0.0F));
      $$1.a("body", ftr.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F).a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new ftq(0.05F)), fto.a);
      $$1.a("right_arm", ftr.c().a(44, 22).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), fto.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", ftr.c().a(44, 22).a().a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), fto.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", ftr.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), fto.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", ftr.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), fto.a(2.0F, 12.0F, 0.0F));
      return fts.a($$0, 64, 64);
   }

   public static fts a(ftq $$0) {
      ftu $$1 = fqz.a($$0, 0.0F);
      ftv $$2 = $$1.a();
      $$2.a("head", ftr.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), fto.a);
      $$2.a("body", ftr.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0.a(0.1F)), fto.a);
      $$2.a("right_leg", ftr.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), fto.a(-2.0F, 12.0F, 0.0F));
      $$2.a("left_leg", ftr.c().a(0, 16).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), fto.a(2.0F, 12.0F, 0.0F));
      $$2.a("hat").a("hat_rim", ftr.c(), fto.a);
      return fts.a($$1, 64, 32);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      fpj.a(this.o, this.n, $$0.gf(), this.c, $$3);
   }

   @Override
   public void a(boolean $$0) {
      this.k.k = $$0;
      this.l.k = $$0;
      this.a.k = $$0;
   }
}
