public class cwk extends cue {
   protected cwk(dez.d $$0) {
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
   public dfa a(clg $$0) {
      cos $$1 = $$0.q();
      gu $$2 = $$0.a();
      ead $$3 = $$0.q().b_($$0.a());
      gu $$4 = $$2.e();
      gu $$5 = $$2.f();
      gu $$6 = $$2.g();
      gu $$7 = $$2.h();
      dfa $$8 = $$1.a_($$4);
      dfa $$9 = $$1.a_($$5);
      dfa $$10 = $$1.a_($$6);
      dfa $$11 = $$1.a_($$7);
      return this.n()
         .a(a, Boolean.valueOf(this.a($$8, $$8.d($$1, $$4, ha.d))))
         .a(c, Boolean.valueOf(this.a($$9, $$9.d($$1, $$5, ha.c))))
         .a(d, Boolean.valueOf(this.a($$10, $$10.d($$1, $$6, ha.f))))
         .a(b, Boolean.valueOf(this.a($$11, $$11.d($$1, $$7, ha.e))))
         .a(e, Boolean.valueOf($$3.a() == eae.c));
   }

   @Override
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eae.c, eae.c.a($$3));
      }

      return $$1.o().d() ? $$0.a(f.get($$1), Boolean.valueOf(this.a($$2, $$2.d($$3, $$5, $$1.g())))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public ehx b(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return ehu.a();
   }

   @Override
   public boolean a(dfa $$0, dfa $$1, ha $$2) {
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

   public final boolean a(dfa $$0, boolean $$1) {
      return !j($$0) && $$1 || $$0.b() instanceof cwk || $$0.a(apl.L);
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
