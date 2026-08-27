public class fpi implements fpl<dci> {
   private final fhn a;
   private final fhn b;

   public fpi(fpm.a $$0) {
      this.a = $$0.a(fhm.i);
      this.b = $$0.a(fhm.h);
   }

   public static fht b() {
      fhv $$0 = new fhv();
      fhw $$1 = $$0.a();
      $$1.a("main", fhs.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), fhp.a);
      $$1.a("left_leg", fhs.c().a(50, 6).a(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), fhp.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI / 2)));
      $$1.a("right_leg", fhs.c().a(50, 18).a(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), fhp.b((float) (Math.PI / 2), 0.0F, (float) Math.PI));
      return fht.a($$0, 64, 64);
   }

   public static fht c() {
      fhv $$0 = new fhv();
      fhw $$1 = $$0.a();
      $$1.a("main", fhs.c().a(0, 22).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), fhp.a);
      $$1.a("left_leg", fhs.c().a(50, 0).a(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), fhp.b((float) (Math.PI / 2), 0.0F, 0.0F));
      $$1.a("right_leg", fhs.c().a(50, 12).a(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), fhp.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI * 3.0 / 2.0)));
      return fht.a($$0, 64, 64);
   }

   public void a(dci $$0, float $$1, elg $$2, fnl $$3, int $$4, int $$5) {
      gap $$6 = fnz.p[$$0.d().a()];
      cpm $$7 = $$0.k();
      if ($$7 != null) {
         dfa $$8 = $$0.q();
         cup.c<? extends dci> $$9 = cup.a(dco.y, csf::h, csf::g, cto.b, $$8, $$7, $$0.p(), ($$0x, $$1x) -> false);
         int $$10 = $$9.apply(new fpo<>()).get($$4);
         this.a($$2, $$3, $$8.c(csf.a) == dfn.a ? this.a : this.b, $$8.c(csf.aC), $$6, $$10, $$5, false);
      } else {
         this.a($$2, $$3, this.a, ha.d, $$6, $$4, $$5, false);
         this.a($$2, $$3, this.b, ha.d, $$6, $$4, $$5, true);
      }
   }

   private void a(elg $$0, fnl $$1, fhn $$2, ha $$3, gap $$4, int $$5, int $$6, boolean $$7) {
      $$0.a();
      $$0.a(0.0F, 0.5625F, $$7 ? -1.0F : 0.0F);
      $$0.a(a.b.rotationDegrees(90.0F));
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.f.rotationDegrees(180.0F + $$3.p()));
      $$0.a(-0.5F, -0.5F, -0.5F);
      elk $$8 = $$4.a($$1, fnt::c);
      $$2.a($$0, $$8, $$5, $$6);
      $$0.b();
   }
}
