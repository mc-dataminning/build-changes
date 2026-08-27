public class fsw implements fsz<dfe> {
   private final fkt a;
   private final fkt b;

   public fsw(fta.a $$0) {
      this.a = $$0.a(fks.i);
      this.b = $$0.a(fks.h);
   }

   public static fkz b() {
      flb $$0 = new flb();
      flc $$1 = $$0.a();
      $$1.a("main", fky.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), fkv.a);
      $$1.a("left_leg", fky.c().a(50, 6).a(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), fkv.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI / 2)));
      $$1.a("right_leg", fky.c().a(50, 18).a(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), fkv.b((float) (Math.PI / 2), 0.0F, (float) Math.PI));
      return fkz.a($$0, 64, 64);
   }

   public static fkz c() {
      flb $$0 = new flb();
      flc $$1 = $$0.a();
      $$1.a("main", fky.c().a(0, 22).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), fkv.a);
      $$1.a("left_leg", fky.c().a(50, 0).a(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), fkv.b((float) (Math.PI / 2), 0.0F, 0.0F));
      $$1.a("right_leg", fky.c().a(50, 12).a(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), fkv.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI * 3.0 / 2.0)));
      return fkz.a($$0, 64, 64);
   }

   public void a(dfe $$0, float $$1, eob $$2, fqz $$3, int $$4, int $$5) {
      ged $$6 = fro.p[$$0.d().a()];
      csf $$7 = $$0.i();
      if ($$7 != null) {
         dhn $$8 = $$0.r();
         cxm.c<? extends dfe> $$9 = cxm.a(dfk.y, cuy::h, cuy::g, cwi.c, $$8, $$7, $$0.aC_(), ($$0x, $$1x) -> false);
         int $$10 = $$9.apply(new ftc<>()).get($$4);
         this.a($$2, $$3, $$8.c(cuy.b) == dia.a ? this.a : this.b, $$8.c(cuy.aE), $$6, $$10, $$5, false);
      } else {
         this.a($$2, $$3, this.a, ib.d, $$6, $$4, $$5, false);
         this.a($$2, $$3, this.b, ib.d, $$6, $$4, $$5, true);
      }
   }

   private void a(eob $$0, fqz $$1, fkt $$2, ib $$3, ged $$4, int $$5, int $$6, boolean $$7) {
      $$0.a();
      $$0.a(0.0F, 0.5625F, $$7 ? -1.0F : 0.0F);
      $$0.a(a.b.rotationDegrees(90.0F));
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.f.rotationDegrees(180.0F + $$3.p()));
      $$0.a(-0.5F, -0.5F, -0.5F);
      eof $$8 = $$4.a($$1, frh::c);
      $$2.a($$0, $$8, $$5, $$6);
      $$0.b();
   }
}
