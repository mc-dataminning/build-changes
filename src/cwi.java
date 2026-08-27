public class cwi extends cuc {
   protected cwi(dex.d $$0) {
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
   public dey a(cle $$0) {
      coq $$1 = $$0.q();
      gv $$2 = $$0.a();
      eab $$3 = $$0.q().b_($$0.a());
      gv $$4 = $$2.e();
      gv $$5 = $$2.f();
      gv $$6 = $$2.g();
      gv $$7 = $$2.h();
      dey $$8 = $$1.a_($$4);
      dey $$9 = $$1.a_($$5);
      dey $$10 = $$1.a_($$6);
      dey $$11 = $$1.a_($$7);
      return this.n()
         .a(a, Boolean.valueOf(this.a($$8, $$8.d($$1, $$4, hb.d))))
         .a(c, Boolean.valueOf(this.a($$9, $$9.d($$1, $$5, hb.c))))
         .a(d, Boolean.valueOf(this.a($$10, $$10.d($$1, $$6, hb.f))))
         .a(b, Boolean.valueOf(this.a($$11, $$11.d($$1, $$7, hb.e))))
         .a(e, Boolean.valueOf($$3.a() == eac.c));
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eac.c, eac.c.a($$3));
      }

      return $$1.o().d() ? $$0.a(f.get($$1), Boolean.valueOf(this.a($$2, $$2.d($$3, $$5, $$1.g())))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public ehy b(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return ehv.a();
   }

   @Override
   public boolean a(dey $$0, dey $$1, hb $$2) {
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

   public final boolean a(dey $$0, boolean $$1) {
      return !j($$0) && $$1 || $$0.b() instanceof cwi || $$0.a(apj.L);
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
