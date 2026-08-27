public class fqb implements fqe<dcr> {
   private final fic a;
   private final fic b;

   public fqb(fqf.a $$0) {
      this.a = $$0.a(fib.i);
      this.b = $$0.a(fib.h);
   }

   public static fii b() {
      fik $$0 = new fik();
      fil $$1 = $$0.a();
      $$1.a("main", fih.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), fie.a);
      $$1.a("left_leg", fih.c().a(50, 6).a(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), fie.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI / 2)));
      $$1.a("right_leg", fih.c().a(50, 18).a(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), fie.b((float) (Math.PI / 2), 0.0F, (float) Math.PI));
      return fii.a($$0, 64, 64);
   }

   public static fii c() {
      fik $$0 = new fik();
      fil $$1 = $$0.a();
      $$1.a("main", fih.c().a(0, 22).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), fie.a);
      $$1.a("left_leg", fih.c().a(50, 0).a(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), fie.b((float) (Math.PI / 2), 0.0F, 0.0F));
      $$1.a("right_leg", fih.c().a(50, 12).a(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), fie.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI * 3.0 / 2.0)));
      return fii.a($$0, 64, 64);
   }

   public void a(dcr $$0, float $$1, elp $$2, foe $$3, int $$4, int $$5) {
      gbi $$6 = fot.p[$$0.d().a()];
      cpv $$7 = $$0.k();
      if ($$7 != null) {
         dfj $$8 = $$0.q();
         cuy.c<? extends dcr> $$9 = cuy.a(dcx.y, cso::h, cso::g, ctx.b, $$8, $$7, $$0.p(), ($$0x, $$1x) -> false);
         int $$10 = $$9.apply(new fqh<>()).get($$4);
         this.a($$2, $$3, $$8.c(cso.a) == dfw.a ? this.a : this.b, $$8.c(cso.aC), $$6, $$10, $$5, false);
      } else {
         this.a($$2, $$3, this.a, ha.d, $$6, $$4, $$5, false);
         this.a($$2, $$3, this.b, ha.d, $$6, $$4, $$5, true);
      }
   }

   private void a(elp $$0, foe $$1, fic $$2, ha $$3, gbi $$4, int $$5, int $$6, boolean $$7) {
      $$0.a();
      $$0.a(0.0F, 0.5625F, $$7 ? -1.0F : 0.0F);
      $$0.a(a.b.rotationDegrees(90.0F));
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.f.rotationDegrees(180.0F + $$3.p()));
      $$0.a(-0.5F, -0.5F, -0.5F);
      elt $$8 = $$4.a($$1, fom::c);
      $$2.a($$0, $$8, $$5, $$6);
      $$0.b();
   }
}
