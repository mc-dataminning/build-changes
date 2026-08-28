import com.mojang.serialization.MapCodec;

public class dkv extends dju {
   public static final MapCodec<dkv> i = b(dkv::new);
   private final fab[] j;

   @Override
   public MapCodec<dkv> a() {
      return i;
   }

   public dkv(dvc.d $$0) {
      super(2.0F, 2.0F, 16.0F, 16.0F, 24.0F, $$0);
      this.l(
         this.F
            .b()
            .b(a, Boolean.valueOf(false))
            .b(b, Boolean.valueOf(false))
            .b(c, Boolean.valueOf(false))
            .b(d, Boolean.valueOf(false))
            .b(e, Boolean.valueOf(false))
      );
      this.j = this.a(2.0F, 1.0F, 16.0F, 6.0F, 15.0F);
   }

   @Override
   protected fab d_(dvd $$0) {
      return this.j[this.h($$0)];
   }

   @Override
   protected fab c(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return this.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(dvd $$0, ert $$1) {
      return false;
   }

   public boolean a(dvd $$0, boolean $$1, jl $$2) {
      dhy $$3 = $$0.b();
      boolean $$4 = this.o($$0);
      boolean $$5 = $$3 instanceof dkw && dkw.a($$0, $$2);
      return !k($$0) && $$1 || $$4 || $$5;
   }

   private boolean o(dvd $$0) {
      return $$0.a(awz.T) && $$0.a(awz.l) == this.m().a(awz.l);
   }

   @Override
   protected bry a(dvd $$0, dev $$1, jg $$2, coh $$3, ezd $$4) {
      return (bry)(!$$1.y_() ? cwh.a($$3, $$1, $$2) : bry.e);
   }

   @Override
   public dvd a(czm $$0) {
      dea $$1 = $$0.q();
      jg $$2 = $$0.a();
      ere $$3 = $$0.q().b_($$0.a());
      jg $$4 = $$2.f();
      jg $$5 = $$2.i();
      jg $$6 = $$2.g();
      jg $$7 = $$2.h();
      dvd $$8 = $$1.a_($$4);
      dvd $$9 = $$1.a_($$5);
      dvd $$10 = $$1.a_($$6);
      dvd $$11 = $$1.a_($$7);
      return super.a($$0)
         .b(a, Boolean.valueOf(this.a($$8, $$8.c($$1, $$4, jl.d), jl.d)))
         .b(b, Boolean.valueOf(this.a($$9, $$9.c($$1, $$5, jl.e), jl.e)))
         .b(c, Boolean.valueOf(this.a($$10, $$10.c($$1, $$6, jl.c), jl.c)))
         .b(d, Boolean.valueOf(this.a($$11, $$11.c($$1, $$7, jl.f), jl.f)))
         .b(e, Boolean.valueOf($$3.a() == erf.c));
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, erf.c, erf.c.a($$3));
      }

      return $$1.o().e() == jl.c.a ? $$0.b(f.get($$1), Boolean.valueOf(this.a($$2, $$2.c($$3, $$5, $$1.g()), $$1.g()))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
