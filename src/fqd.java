public class fqd implements fqg<dct> {
   private final fie a;
   private final fie b;

   public fqd(fqh.a $$0) {
      this.a = $$0.a(fid.i);
      this.b = $$0.a(fid.h);
   }

   public static fik b() {
      fim $$0 = new fim();
      fin $$1 = $$0.a();
      $$1.a("main", fij.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), fig.a);
      $$1.a("left_leg", fij.c().a(50, 6).a(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), fig.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI / 2)));
      $$1.a("right_leg", fij.c().a(50, 18).a(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), fig.b((float) (Math.PI / 2), 0.0F, (float) Math.PI));
      return fik.a($$0, 64, 64);
   }

   public static fik c() {
      fim $$0 = new fim();
      fin $$1 = $$0.a();
      $$1.a("main", fij.c().a(0, 22).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), fig.a);
      $$1.a("left_leg", fij.c().a(50, 0).a(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), fig.b((float) (Math.PI / 2), 0.0F, 0.0F));
      $$1.a("right_leg", fij.c().a(50, 12).a(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), fig.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI * 3.0 / 2.0)));
      return fik.a($$0, 64, 64);
   }

   public void a(dct $$0, float $$1, elr $$2, fog $$3, int $$4, int $$5) {
      gbk $$6 = fov.p[$$0.d().a()];
      cpx $$7 = $$0.k();
      if ($$7 != null) {
         dfl $$8 = $$0.q();
         cva.c<? extends dct> $$9 = cva.a(dcz.y, csq::h, csq::g, ctz.b, $$8, $$7, $$0.p(), ($$0x, $$1x) -> false);
         int $$10 = $$9.apply(new fqj<>()).get($$4);
         this.a($$2, $$3, $$8.c(csq.a) == dfy.a ? this.a : this.b, $$8.c(csq.aC), $$6, $$10, $$5, false);
      } else {
         this.a($$2, $$3, this.a, hc.d, $$6, $$4, $$5, false);
         this.a($$2, $$3, this.b, hc.d, $$6, $$4, $$5, true);
      }
   }

   private void a(elr $$0, fog $$1, fie $$2, hc $$3, gbk $$4, int $$5, int $$6, boolean $$7) {
      $$0.a();
      $$0.a(0.0F, 0.5625F, $$7 ? -1.0F : 0.0F);
      $$0.a(a.b.rotationDegrees(90.0F));
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.f.rotationDegrees(180.0F + $$3.p()));
      $$0.a(-0.5F, -0.5F, -0.5F);
      elv $$8 = $$4.a($$1, foo::c);
      $$2.a($$0, $$8, $$5, $$6);
      $$0.b();
   }
}
