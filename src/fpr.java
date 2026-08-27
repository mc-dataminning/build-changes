public class fpr implements fpu<dch> {
   private final fhs a;
   private final fhs b;

   public fpr(fpv.a $$0) {
      this.a = $$0.a(fhr.i);
      this.b = $$0.a(fhr.h);
   }

   public static fhy b() {
      fia $$0 = new fia();
      fib $$1 = $$0.a();
      $$1.a("main", fhx.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), fhu.a);
      $$1.a("left_leg", fhx.c().a(50, 6).a(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), fhu.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI / 2)));
      $$1.a("right_leg", fhx.c().a(50, 18).a(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), fhu.b((float) (Math.PI / 2), 0.0F, (float) Math.PI));
      return fhy.a($$0, 64, 64);
   }

   public static fhy c() {
      fia $$0 = new fia();
      fib $$1 = $$0.a();
      $$1.a("main", fhx.c().a(0, 22).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), fhu.a);
      $$1.a("left_leg", fhx.c().a(50, 0).a(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), fhu.b((float) (Math.PI / 2), 0.0F, 0.0F));
      $$1.a("right_leg", fhx.c().a(50, 12).a(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), fhu.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI * 3.0 / 2.0)));
      return fhy.a($$0, 64, 64);
   }

   public void a(dch $$0, float $$1, elf $$2, fnu $$3, int $$4, int $$5) {
      gay $$6 = foi.p[$$0.d().a()];
      cpl $$7 = $$0.k();
      if ($$7 != null) {
         dez $$8 = $$0.q();
         cuo.c<? extends dch> $$9 = cuo.a(dcn.y, cse::h, cse::g, ctn.b, $$8, $$7, $$0.p(), ($$0x, $$1x) -> false);
         int $$10 = $$9.apply(new fpx<>()).get($$4);
         this.a($$2, $$3, $$8.c(cse.a) == dfm.a ? this.a : this.b, $$8.c(cse.aC), $$6, $$10, $$5, false);
      } else {
         this.a($$2, $$3, this.a, ha.d, $$6, $$4, $$5, false);
         this.a($$2, $$3, this.b, ha.d, $$6, $$4, $$5, true);
      }
   }

   private void a(elf $$0, fnu $$1, fhs $$2, ha $$3, gay $$4, int $$5, int $$6, boolean $$7) {
      $$0.a();
      $$0.a(0.0F, 0.5625F, $$7 ? -1.0F : 0.0F);
      $$0.a(a.b.rotationDegrees(90.0F));
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.f.rotationDegrees(180.0F + $$3.p()));
      $$0.a(-0.5F, -0.5F, -0.5F);
      elj $$8 = $$4.a($$1, foc::c);
      $$2.a($$0, $$8, $$5, $$6);
      $$0.b();
   }
}
