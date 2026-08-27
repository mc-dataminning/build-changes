public class fuf implements fui<dfz> {
   private final fly a;
   private final fly b;

   public fuf(fuj.a $$0) {
      this.a = $$0.a(flx.i);
      this.b = $$0.a(flx.h);
   }

   public static fme b() {
      fmg $$0 = new fmg();
      fmh $$1 = $$0.a();
      $$1.a("main", fmd.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), fma.a);
      $$1.a("left_leg", fmd.c().a(50, 6).a(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), fma.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI / 2)));
      $$1.a("right_leg", fmd.c().a(50, 18).a(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), fma.b((float) (Math.PI / 2), 0.0F, (float) Math.PI));
      return fme.a($$0, 64, 64);
   }

   public static fme c() {
      fmg $$0 = new fmg();
      fmh $$1 = $$0.a();
      $$1.a("main", fmd.c().a(0, 22).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), fma.a);
      $$1.a("left_leg", fmd.c().a(50, 0).a(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), fma.b((float) (Math.PI / 2), 0.0F, 0.0F));
      $$1.a("right_leg", fmd.c().a(50, 12).a(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), fma.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI * 3.0 / 2.0)));
      return fme.a($$0, 64, 64);
   }

   public void a(dfz $$0, float $$1, epd $$2, fsi $$3, int $$4, int $$5) {
      gfs $$6 = fsx.p[$$0.d().a()];
      csy $$7 = $$0.i();
      if ($$7 != null) {
         dip $$8 = $$0.r();
         cyg.c<? extends dfz> $$9 = cyg.a(dgf.y, cvs::h, cvs::g, cxc.c, $$8, $$7, $$0.aB_(), ($$0x, $$1x) -> false);
         int $$10 = $$9.apply(new ful<>()).get($$4);
         this.a($$2, $$3, $$8.c(cvs.b) == djc.a ? this.a : this.b, $$8.c(cvs.aE), $$6, $$10, $$5, false);
      } else {
         this.a($$2, $$3, this.a, ia.d, $$6, $$4, $$5, false);
         this.a($$2, $$3, this.b, ia.d, $$6, $$4, $$5, true);
      }
   }

   private void a(epd $$0, fsi $$1, fly $$2, ia $$3, gfs $$4, int $$5, int $$6, boolean $$7) {
      $$0.a();
      $$0.a(0.0F, 0.5625F, $$7 ? -1.0F : 0.0F);
      $$0.a(a.b.rotationDegrees(90.0F));
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.f.rotationDegrees(180.0F + $$3.p()));
      $$0.a(-0.5F, -0.5F, -0.5F);
      eph $$8 = $$4.a($$1, fsq::c);
      $$2.a($$0, $$8, $$5, $$6);
      $$0.b();
   }
}
