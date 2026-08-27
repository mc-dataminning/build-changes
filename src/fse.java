public class fse implements fsh<den> {
   private final fkb a;
   private final fkb b;

   public fse(fsi.a $$0) {
      this.a = $$0.a(fka.i);
      this.b = $$0.a(fka.h);
   }

   public static fkh b() {
      fkj $$0 = new fkj();
      fkk $$1 = $$0.a();
      $$1.a("main", fkg.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), fkd.a);
      $$1.a("left_leg", fkg.c().a(50, 6).a(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), fkd.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI / 2)));
      $$1.a("right_leg", fkg.c().a(50, 18).a(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), fkd.b((float) (Math.PI / 2), 0.0F, (float) Math.PI));
      return fkh.a($$0, 64, 64);
   }

   public static fkh c() {
      fkj $$0 = new fkj();
      fkk $$1 = $$0.a();
      $$1.a("main", fkg.c().a(0, 22).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), fkd.a);
      $$1.a("left_leg", fkg.c().a(50, 0).a(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), fkd.b((float) (Math.PI / 2), 0.0F, 0.0F));
      $$1.a("right_leg", fkg.c().a(50, 12).a(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), fkd.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI * 3.0 / 2.0)));
      return fkh.a($$0, 64, 64);
   }

   public void a(den $$0, float $$1, enk $$2, fqh $$3, int $$4, int $$5) {
      gdl $$6 = fqw.p[$$0.d().a()];
      crs $$7 = $$0.k();
      if ($$7 != null) {
         dgw $$8 = $$0.q();
         cwz.c<? extends den> $$9 = cwz.a(det.y, cum::h, cum::g, cvw.c, $$8, $$7, $$0.p(), ($$0x, $$1x) -> false);
         int $$10 = $$9.apply(new fsk<>()).get($$4);
         this.a($$2, $$3, $$8.c(cum.b) == dhj.a ? this.a : this.b, $$8.c(cum.aE), $$6, $$10, $$5, false);
      } else {
         this.a($$2, $$3, this.a, hx.d, $$6, $$4, $$5, false);
         this.a($$2, $$3, this.b, hx.d, $$6, $$4, $$5, true);
      }
   }

   private void a(enk $$0, fqh $$1, fkb $$2, hx $$3, gdl $$4, int $$5, int $$6, boolean $$7) {
      $$0.a();
      $$0.a(0.0F, 0.5625F, $$7 ? -1.0F : 0.0F);
      $$0.a(a.b.rotationDegrees(90.0F));
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.f.rotationDegrees(180.0F + $$3.p()));
      $$0.a(-0.5F, -0.5F, -0.5F);
      eno $$8 = $$4.a($$1, fqp::c);
      $$2.a($$0, $$8, $$5, $$6);
      $$0.b();
   }
}
