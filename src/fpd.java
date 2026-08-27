public class fpd implements fpg<dcg> {
   private final fhj a;
   private final fhj b;

   public fpd(fph.a $$0) {
      this.a = $$0.a(fhi.i);
      this.b = $$0.a(fhi.h);
   }

   public static fhp b() {
      fhr $$0 = new fhr();
      fhs $$1 = $$0.a();
      $$1.a("main", fho.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), fhl.a);
      $$1.a("left_leg", fho.c().a(50, 6).a(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), fhl.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI / 2)));
      $$1.a("right_leg", fho.c().a(50, 18).a(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), fhl.b((float) (Math.PI / 2), 0.0F, (float) Math.PI));
      return fhp.a($$0, 64, 64);
   }

   public static fhp c() {
      fhr $$0 = new fhr();
      fhs $$1 = $$0.a();
      $$1.a("main", fho.c().a(0, 22).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), fhl.a);
      $$1.a("left_leg", fho.c().a(50, 0).a(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), fhl.b((float) (Math.PI / 2), 0.0F, 0.0F));
      $$1.a("right_leg", fho.c().a(50, 12).a(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), fhl.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI * 3.0 / 2.0)));
      return fhp.a($$0, 64, 64);
   }

   public void a(dcg $$0, float $$1, elh $$2, fng $$3, int $$4, int $$5) {
      gak $$6 = fnu.p[$$0.d().a()];
      cpk $$7 = $$0.k();
      if ($$7 != null) {
         dey $$8 = $$0.q();
         cun.c<? extends dcg> $$9 = cun.a(dcm.y, csd::h, csd::g, ctm.b, $$8, $$7, $$0.p(), ($$0x, $$1x) -> false);
         int $$10 = $$9.apply(new fpj<>()).get($$4);
         this.a($$2, $$3, $$8.c(csd.a) == dfl.a ? this.a : this.b, $$8.c(csd.aC), $$6, $$10, $$5, false);
      } else {
         this.a($$2, $$3, this.a, hb.d, $$6, $$4, $$5, false);
         this.a($$2, $$3, this.b, hb.d, $$6, $$4, $$5, true);
      }
   }

   private void a(elh $$0, fng $$1, fhj $$2, hb $$3, gak $$4, int $$5, int $$6, boolean $$7) {
      $$0.a();
      $$0.a(0.0F, 0.5625F, $$7 ? -1.0F : 0.0F);
      $$0.a(a.b.rotationDegrees(90.0F));
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.f.rotationDegrees(180.0F + $$3.p()));
      $$0.a(-0.5F, -0.5F, -0.5F);
      ell $$8 = $$4.a($$1, fno::b);
      $$2.a($$0, $$8, $$5, $$6);
      $$0.b();
   }
}
