public class fsr implements fsu<dez> {
   private final fko a;
   private final fko b;

   public fsr(fsv.a $$0) {
      this.a = $$0.a(fkn.i);
      this.b = $$0.a(fkn.h);
   }

   public static fku b() {
      fkw $$0 = new fkw();
      fkx $$1 = $$0.a();
      $$1.a("main", fkt.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), fkq.a);
      $$1.a("left_leg", fkt.c().a(50, 6).a(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), fkq.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI / 2)));
      $$1.a("right_leg", fkt.c().a(50, 18).a(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), fkq.b((float) (Math.PI / 2), 0.0F, (float) Math.PI));
      return fku.a($$0, 64, 64);
   }

   public static fku c() {
      fkw $$0 = new fkw();
      fkx $$1 = $$0.a();
      $$1.a("main", fkt.c().a(0, 22).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), fkq.a);
      $$1.a("left_leg", fkt.c().a(50, 0).a(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), fkq.b((float) (Math.PI / 2), 0.0F, 0.0F));
      $$1.a("right_leg", fkt.c().a(50, 12).a(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), fkq.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI * 3.0 / 2.0)));
      return fku.a($$0, 64, 64);
   }

   public void a(dez $$0, float $$1, enw $$2, fqu $$3, int $$4, int $$5) {
      gdy $$6 = frj.p[$$0.d().a()];
      csa $$7 = $$0.k();
      if ($$7 != null) {
         dhi $$8 = $$0.q();
         cxh.c<? extends dez> $$9 = cxh.a(dff.y, cut::h, cut::g, cwd.c, $$8, $$7, $$0.p(), ($$0x, $$1x) -> false);
         int $$10 = $$9.apply(new fsx<>()).get($$4);
         this.a($$2, $$3, $$8.c(cut.b) == dhv.a ? this.a : this.b, $$8.c(cut.aE), $$6, $$10, $$5, false);
      } else {
         this.a($$2, $$3, this.a, hx.d, $$6, $$4, $$5, false);
         this.a($$2, $$3, this.b, hx.d, $$6, $$4, $$5, true);
      }
   }

   private void a(enw $$0, fqu $$1, fko $$2, hx $$3, gdy $$4, int $$5, int $$6, boolean $$7) {
      $$0.a();
      $$0.a(0.0F, 0.5625F, $$7 ? -1.0F : 0.0F);
      $$0.a(a.b.rotationDegrees(90.0F));
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.f.rotationDegrees(180.0F + $$3.p()));
      $$0.a(-0.5F, -0.5F, -0.5F);
      eoa $$8 = $$4.a($$1, frc::c);
      $$2.a($$0, $$8, $$5, $$6);
      $$0.b();
   }
}
