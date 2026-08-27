public class fqx implements fra<ddt> {
   private final fiw a;
   private final fiw b;

   public fqx(frb.a $$0) {
      this.a = $$0.a(fiv.i);
      this.b = $$0.a(fiv.h);
   }

   public static fjc b() {
      fje $$0 = new fje();
      fjf $$1 = $$0.a();
      $$1.a("main", fjb.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), fiy.a);
      $$1.a("left_leg", fjb.c().a(50, 6).a(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), fiy.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI / 2)));
      $$1.a("right_leg", fjb.c().a(50, 18).a(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), fiy.b((float) (Math.PI / 2), 0.0F, (float) Math.PI));
      return fjc.a($$0, 64, 64);
   }

   public static fjc c() {
      fje $$0 = new fje();
      fjf $$1 = $$0.a();
      $$1.a("main", fjb.c().a(0, 22).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), fiy.a);
      $$1.a("left_leg", fjb.c().a(50, 0).a(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), fiy.b((float) (Math.PI / 2), 0.0F, 0.0F));
      $$1.a("right_leg", fjb.c().a(50, 12).a(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), fiy.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI * 3.0 / 2.0)));
      return fjc.a($$0, 64, 64);
   }

   public void a(ddt $$0, float $$1, emh $$2, fpb $$3, int $$4, int $$5) {
      gce $$6 = fpp.p[$$0.d().a()];
      cqz $$7 = $$0.k();
      if ($$7 != null) {
         dgb $$8 = $$0.q();
         cwf.c<? extends ddt> $$9 = cwf.a(ddz.y, ctt::h, ctt::g, cvd.c, $$8, $$7, $$0.p(), ($$0x, $$1x) -> false);
         int $$10 = $$9.apply(new frd<>()).get($$4);
         this.a($$2, $$3, $$8.c(ctt.b) == dgo.a ? this.a : this.b, $$8.c(ctt.aE), $$6, $$10, $$5, false);
      } else {
         this.a($$2, $$3, this.a, hx.d, $$6, $$4, $$5, false);
         this.a($$2, $$3, this.b, hx.d, $$6, $$4, $$5, true);
      }
   }

   private void a(emh $$0, fpb $$1, fiw $$2, hx $$3, gce $$4, int $$5, int $$6, boolean $$7) {
      $$0.a();
      $$0.a(0.0F, 0.5625F, $$7 ? -1.0F : 0.0F);
      $$0.a(a.b.rotationDegrees(90.0F));
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.f.rotationDegrees(180.0F + $$3.p()));
      $$0.a(-0.5F, -0.5F, -0.5F);
      eml $$8 = $$4.a($$1, fpj::c);
      $$2.a($$0, $$8, $$5, $$6);
      $$0.b();
   }
}
