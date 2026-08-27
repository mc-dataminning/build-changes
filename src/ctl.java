public class ctl extends crf {
   protected ctl(dca.d $$0) {
      super(1.0F, 1.0F, 16.0F, 16.0F, 16.0F, $$0);
      this.k(
         this.C
            .b()
            .a(a, Boolean.valueOf(false))
            .a(b, Boolean.valueOf(false))
            .a(c, Boolean.valueOf(false))
            .a(d, Boolean.valueOf(false))
            .a(e, Boolean.valueOf(false))
      );
   }

   @Override
   public dcb a(cih $$0) {
      cls $$1 = $$0.q();
      gu $$2 = $$0.a();
      dxe $$3 = $$0.q().b_($$0.a());
      gu $$4 = $$2.e();
      gu $$5 = $$2.f();
      gu $$6 = $$2.g();
      gu $$7 = $$2.h();
      dcb $$8 = $$1.a_($$4);
      dcb $$9 = $$1.a_($$5);
      dcb $$10 = $$1.a_($$6);
      dcb $$11 = $$1.a_($$7);
      return this.n()
         .a(a, Boolean.valueOf(this.a($$8, $$8.d($$1, $$4, ha.d))))
         .a(c, Boolean.valueOf(this.a($$9, $$9.d($$1, $$5, ha.c))))
         .a(d, Boolean.valueOf(this.a($$10, $$10.d($$1, $$6, ha.f))))
         .a(b, Boolean.valueOf(this.a($$11, $$11.d($$1, $$7, ha.e))))
         .a(e, Boolean.valueOf($$3.a() == dxf.c));
   }

   @Override
   public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, dxf.c, dxf.c.a($$3));
      }

      return $$1.o().d() ? $$0.a(f.get($$1), Boolean.valueOf(this.a($$2, $$2.d($$3, $$5, $$1.g())))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public efb b(dcb $$0, cls $$1, gu $$2, een $$3) {
      return eey.a();
   }

   @Override
   public boolean a(dcb $$0, dcb $$1, ha $$2) {
      if ($$1.a(this)) {
         if (!$$2.o().d()) {
            return true;
         }

         if ($$0.c(f.get($$2)) && $$1.c(f.get($$2.g()))) {
            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   public final boolean a(dcb $$0, boolean $$1) {
      return !j($$0) && $$1 || $$0.b() instanceof ctl || $$0.a(amw.L);
   }

   @Override
   protected void a(dcc.a<cpn, dcb> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
