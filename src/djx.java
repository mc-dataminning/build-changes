import com.mojang.serialization.MapCodec;

public class djx extends dhs {
   public static final MapCodec<djx> i = b(djx::new);

   @Override
   public MapCodec<? extends djx> a() {
      return i;
   }

   protected djx(dsz.d $$0) {
      super(1.0F, 1.0F, 16.0F, 16.0F, 16.0F, $$0);
      this.k(
         this.E
            .b()
            .a(a, Boolean.valueOf(false))
            .a(b, Boolean.valueOf(false))
            .a(c, Boolean.valueOf(false))
            .a(d, Boolean.valueOf(false))
            .a(e, Boolean.valueOf(false))
      );
   }

   @Override
   public dta a(cyb $$0) {
      dca $$1 = $$0.q();
      jd $$2 = $$0.a();
      eoy $$3 = $$0.q().b_($$0.a());
      jd $$4 = $$2.e();
      jd $$5 = $$2.f();
      jd $$6 = $$2.g();
      jd $$7 = $$2.h();
      dta $$8 = $$1.a_($$4);
      dta $$9 = $$1.a_($$5);
      dta $$10 = $$1.a_($$6);
      dta $$11 = $$1.a_($$7);
      return this.o()
         .a(a, Boolean.valueOf(this.a($$8, $$8.d($$1, $$4, ji.d))))
         .a(c, Boolean.valueOf(this.a($$9, $$9.d($$1, $$5, ji.c))))
         .a(d, Boolean.valueOf(this.a($$10, $$10.d($$1, $$6, ji.f))))
         .a(b, Boolean.valueOf(this.a($$11, $$11.d($$1, $$7, ji.e))))
         .a(e, Boolean.valueOf($$3.a() == eoz.c));
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eoz.c, eoz.c.a($$3));
      }

      return $$1.o().d() ? $$0.a(f.get($$1), Boolean.valueOf(this.a($$2, $$2.d($$3, $$5, $$1.g())))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected exp c(dta $$0, dca $$1, jd $$2, exb $$3) {
      return exm.a();
   }

   @Override
   protected boolean a(dta $$0, dta $$1, ji $$2) {
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

   public final boolean a(dta $$0, boolean $$1) {
      return !j($$0) && $$1 || $$0.b() instanceof djx || $$0.a(awd.L);
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
