public class fqw<T extends cgr> extends fop<T> implements fqn {
   private final frd a = this.l.b("hat_rim");

   public fqw(frd $$0) {
      super($$0);
   }

   public static frj c() {
      frl $$0 = fop.a(frh.a, 0.0F);
      frm $$1 = $$0.a();
      $$1.a("head", new fri().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F).a(24, 0).a(-1.0F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F), frf.a);
      frm $$2 = $$1.a("hat", fri.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new frh(0.5F)), frf.a);
      $$2.a("hat_rim", fri.c().a(30, 47).a(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F), frf.b((float) (-Math.PI / 2), 0.0F, 0.0F));
      $$1.a("body", fri.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F).a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new frh(0.05F)), frf.a);
      $$1.a("right_arm", fri.c().a(44, 22).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), frf.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", fri.c().a(44, 22).a().a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), frf.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", fri.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), frf.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", fri.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), frf.a(2.0F, 12.0F, 0.0F));
      return frj.a($$0, 64, 64);
   }

   public static frj a(frh $$0) {
      frl $$1 = fop.a($$0, 0.0F);
      frm $$2 = $$1.a();
      $$2.a("head", fri.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), frf.a);
      $$2.a("body", fri.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0.a(0.1F)), frf.a);
      $$2.a("right_leg", fri.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), frf.a(-2.0F, 12.0F, 0.0F));
      $$2.a("left_leg", fri.c().a(0, 16).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), frf.a(2.0F, 12.0F, 0.0F));
      $$2.a("hat").a("hat_rim", fri.c(), frf.a);
      return frj.a($$1, 64, 32);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      fna.a(this.o, this.n, $$0.gf(), this.c, $$3);
   }

   @Override
   public void a(boolean $$0) {
      this.k.k = $$0;
      this.l.k = $$0;
      this.a.k = $$0;
   }
}
