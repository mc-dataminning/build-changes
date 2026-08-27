public class fpw implements fpz<dcm> {
   private final fhx a;
   private final fhx b;

   public fpw(fqa.a $$0) {
      this.a = $$0.a(fhw.i);
      this.b = $$0.a(fhw.h);
   }

   public static fid b() {
      fif $$0 = new fif();
      fig $$1 = $$0.a();
      $$1.a("main", fic.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), fhz.a);
      $$1.a("left_leg", fic.c().a(50, 6).a(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), fhz.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI / 2)));
      $$1.a("right_leg", fic.c().a(50, 18).a(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), fhz.b((float) (Math.PI / 2), 0.0F, (float) Math.PI));
      return fid.a($$0, 64, 64);
   }

   public static fid c() {
      fif $$0 = new fif();
      fig $$1 = $$0.a();
      $$1.a("main", fic.c().a(0, 22).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), fhz.a);
      $$1.a("left_leg", fic.c().a(50, 0).a(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), fhz.b((float) (Math.PI / 2), 0.0F, 0.0F));
      $$1.a("right_leg", fic.c().a(50, 12).a(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), fhz.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI * 3.0 / 2.0)));
      return fid.a($$0, 64, 64);
   }

   public void a(dcm $$0, float $$1, elk $$2, fnz $$3, int $$4, int $$5) {
      gbd $$6 = fon.p[$$0.d().a()];
      cpq $$7 = $$0.k();
      if ($$7 != null) {
         dfe $$8 = $$0.q();
         cut.c<? extends dcm> $$9 = cut.a(dcs.y, csj::h, csj::g, cts.b, $$8, $$7, $$0.p(), ($$0x, $$1x) -> false);
         int $$10 = $$9.apply(new fqc<>()).get($$4);
         this.a($$2, $$3, $$8.c(csj.a) == dfr.a ? this.a : this.b, $$8.c(csj.aC), $$6, $$10, $$5, false);
      } else {
         this.a($$2, $$3, this.a, hc.d, $$6, $$4, $$5, false);
         this.a($$2, $$3, this.b, hc.d, $$6, $$4, $$5, true);
      }
   }

   private void a(elk $$0, fnz $$1, fhx $$2, hc $$3, gbd $$4, int $$5, int $$6, boolean $$7) {
      $$0.a();
      $$0.a(0.0F, 0.5625F, $$7 ? -1.0F : 0.0F);
      $$0.a(a.b.rotationDegrees(90.0F));
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.f.rotationDegrees(180.0F + $$3.p()));
      $$0.a(-0.5F, -0.5F, -0.5F);
      elo $$8 = $$4.a($$1, foh::c);
      $$2.a($$0, $$8, $$5, $$6);
      $$0.b();
   }
}
