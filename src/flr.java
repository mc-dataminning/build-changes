public class flr implements flu<czj> {
   private final fee a;
   private final fee b;

   public flr(flv.a $$0) {
      this.a = $$0.a(fed.i);
      this.b = $$0.a(fed.h);
   }

   public static fek b() {
      fem $$0 = new fem();
      fen $$1 = $$0.a();
      $$1.a("main", fej.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), feg.a);
      $$1.a("left_leg", fej.c().a(50, 6).a(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), feg.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI / 2)));
      $$1.a("right_leg", fej.c().a(50, 18).a(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), feg.b((float) (Math.PI / 2), 0.0F, (float) Math.PI));
      return fek.a($$0, 64, 64);
   }

   public static fek c() {
      fem $$0 = new fem();
      fen $$1 = $$0.a();
      $$1.a("main", fej.c().a(0, 22).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), feg.a);
      $$1.a("left_leg", fej.c().a(50, 0).a(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), feg.b((float) (Math.PI / 2), 0.0F, 0.0F));
      $$1.a("right_leg", fej.c().a(50, 12).a(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), feg.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI * 3.0 / 2.0)));
      return fek.a($$0, 64, 64);
   }

   public void a(czj $$0, float $$1, eij $$2, fjx $$3, int $$4, int $$5) {
      fwu $$6 = fkj.p[$$0.d().a()];
      cmm $$7 = $$0.k();
      if ($$7 != null) {
         dcb $$8 = $$0.q();
         crq.c<? extends czj> $$9 = crq.a(czp.y, cpg::h, cpg::g, cqp.b, $$8, $$7, $$0.p(), ($$0x, $$1x) -> false);
         int $$10 = $$9.apply(new flx<>()).get($$4);
         this.a($$2, $$3, $$8.c(cpg.a) == dco.a ? this.a : this.b, $$8.c(cpg.aC), $$6, $$10, $$5, false);
      } else {
         this.a($$2, $$3, this.a, ha.d, $$6, $$4, $$5, false);
         this.a($$2, $$3, this.b, ha.d, $$6, $$4, $$5, true);
      }
   }

   private void a(eij $$0, fjx $$1, fee $$2, ha $$3, fwu $$4, int $$5, int $$6, boolean $$7) {
      $$0.a();
      $$0.a(0.0F, 0.5625F, $$7 ? -1.0F : 0.0F);
      $$0.a(a.b.rotationDegrees(90.0F));
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.f.rotationDegrees(180.0F + $$3.p()));
      $$0.a(-0.5F, -0.5F, -0.5F);
      ein $$8 = $$4.a($$1, fkf::b);
      $$2.a($$0, $$8, $$5, $$6);
      $$0.b();
   }
}
