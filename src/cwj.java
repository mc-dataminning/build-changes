public class cwj extends cud {
   protected cwj(dey.d $$0) {
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
   public dez a(clf $$0) {
      cor $$1 = $$0.q();
      gu $$2 = $$0.a();
      eac $$3 = $$0.q().b_($$0.a());
      gu $$4 = $$2.e();
      gu $$5 = $$2.f();
      gu $$6 = $$2.g();
      gu $$7 = $$2.h();
      dez $$8 = $$1.a_($$4);
      dez $$9 = $$1.a_($$5);
      dez $$10 = $$1.a_($$6);
      dez $$11 = $$1.a_($$7);
      return this.n()
         .a(a, Boolean.valueOf(this.a($$8, $$8.d($$1, $$4, ha.d))))
         .a(c, Boolean.valueOf(this.a($$9, $$9.d($$1, $$5, ha.c))))
         .a(d, Boolean.valueOf(this.a($$10, $$10.d($$1, $$6, ha.f))))
         .a(b, Boolean.valueOf(this.a($$11, $$11.d($$1, $$7, ha.e))))
         .a(e, Boolean.valueOf($$3.a() == ead.c));
   }

   @Override
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, ead.c, ead.c.a($$3));
      }

      return $$1.o().d() ? $$0.a(f.get($$1), Boolean.valueOf(this.a($$2, $$2.d($$3, $$5, $$1.g())))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public ehw b(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return eht.a();
   }

   @Override
   public boolean a(dez $$0, dez $$1, ha $$2) {
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

   public final boolean a(dez $$0, boolean $$1) {
      return !j($$0) && $$1 || $$0.b() instanceof cwj || $$0.a(apl.L);
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
