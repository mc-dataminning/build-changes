public class fkh<T extends ccb> extends fic<T> implements fjz {
   private final fko a = this.l.b("hat_rim");

   public fkh(fko $$0) {
      super($$0);
   }

   public static fku c() {
      fkw $$0 = fic.a(fks.a, 0.0F);
      fkx $$1 = $$0.a();
      $$1.a("head", new fkt().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F).a(24, 0).a(-1.0F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F), fkq.a);
      fkx $$2 = $$1.a("hat", fkt.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new fks(0.5F)), fkq.a);
      $$2.a("hat_rim", fkt.c().a(30, 47).a(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F), fkq.b((float) (-Math.PI / 2), 0.0F, 0.0F));
      $$1.a("body", fkt.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F).a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new fks(0.05F)), fkq.a);
      $$1.a("right_arm", fkt.c().a(44, 22).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), fkq.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", fkt.c().a(44, 22).a().a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), fkq.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", fkt.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), fkq.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", fkt.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), fkq.a(2.0F, 12.0F, 0.0F));
      return fku.a($$0, 64, 64);
   }

   public static fku a(fks $$0) {
      fkw $$1 = fic.a($$0, 0.0F);
      fkx $$2 = $$1.a();
      $$2.a("head", fkt.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), fkq.a);
      $$2.a("body", fkt.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0.a(0.1F)), fkq.a);
      $$2.a("right_leg", fkt.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), fkq.a(-2.0F, 12.0F, 0.0F));
      $$2.a("left_leg", fkt.c().a(0, 16).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), fkq.a(2.0F, 12.0F, 0.0F));
      $$2.a("hat").a("hat_rim", fkt.c(), fkq.a);
      return fku.a($$1, 64, 32);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      fgp.a(this.o, this.n, $$0.fX(), this.c, $$3);
   }

   @Override
   public void a(boolean $$0) {
      this.k.k = $$0;
      this.l.k = $$0;
      this.a.k = $$0;
   }
}
