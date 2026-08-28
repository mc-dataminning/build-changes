import com.mojang.serialization.MapCodec;

public class dly extends dju {
   public static final MapCodec<dly> i = b(dly::new);

   @Override
   public MapCodec<? extends dly> a() {
      return i;
   }

   protected dly(dvc.d $$0) {
      super(1.0F, 1.0F, 16.0F, 16.0F, 16.0F, $$0);
      this.l(
         this.F
            .b()
            .b(a, Boolean.valueOf(false))
            .b(b, Boolean.valueOf(false))
            .b(c, Boolean.valueOf(false))
            .b(d, Boolean.valueOf(false))
            .b(e, Boolean.valueOf(false))
      );
   }

   @Override
   public dvd a(czm $$0) {
      dea $$1 = $$0.q();
      jg $$2 = $$0.a();
      ere $$3 = $$0.q().b_($$0.a());
      jg $$4 = $$2.f();
      jg $$5 = $$2.g();
      jg $$6 = $$2.h();
      jg $$7 = $$2.i();
      dvd $$8 = $$1.a_($$4);
      dvd $$9 = $$1.a_($$5);
      dvd $$10 = $$1.a_($$6);
      dvd $$11 = $$1.a_($$7);
      return this.m()
         .b(a, Boolean.valueOf(this.a($$8, $$8.c($$1, $$4, jl.d))))
         .b(c, Boolean.valueOf(this.a($$9, $$9.c($$1, $$5, jl.c))))
         .b(d, Boolean.valueOf(this.a($$10, $$10.c($$1, $$6, jl.f))))
         .b(b, Boolean.valueOf(this.a($$11, $$11.c($$1, $$7, jl.e))))
         .b(e, Boolean.valueOf($$3.a() == erf.c));
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, erf.c, erf.c.a($$3));
      }

      return $$1.o().d() ? $$0.b(f.get($$1), Boolean.valueOf(this.a($$2, $$2.c($$3, $$5, $$1.g())))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected fab c(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return ezy.a();
   }

   @Override
   protected boolean b(dvd $$0, dvd $$1, jl $$2) {
      if ($$1.a(this)) {
         if (!$$2.o().d()) {
            return true;
         }

         if ($$0.c(f.get($$2)) && $$1.c(f.get($$2.g()))) {
            return true;
         }
      }

      return super.b($$0, $$1, $$2);
   }

   public final boolean a(dvd $$0, boolean $$1) {
      return !k($$0) && $$1 || $$0.b() instanceof dly || $$0.a(awz.M);
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
