import com.mojang.serialization.MapCodec;

public class dno extends dli {
   public static final MapCodec<dno> i = b(dno::new);

   @Override
   public MapCodec<? extends dno> a() {
      return i;
   }

   protected dno(dwv.d $$0) {
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
   public dww a(daf $$0) {
      dfm $$1 = $$0.q();
      ji $$2 = $$0.a();
      esy $$3 = $$0.q().b_($$0.a());
      ji $$4 = $$2.f();
      ji $$5 = $$2.g();
      ji $$6 = $$2.h();
      ji $$7 = $$2.i();
      dww $$8 = $$1.a_($$4);
      dww $$9 = $$1.a_($$5);
      dww $$10 = $$1.a_($$6);
      dww $$11 = $$1.a_($$7);
      return this.m()
         .b(a, Boolean.valueOf(this.a($$8, $$8.c($$1, $$4, jn.d))))
         .b(c, Boolean.valueOf(this.a($$9, $$9.c($$1, $$5, jn.c))))
         .b(d, Boolean.valueOf(this.a($$10, $$10.c($$1, $$6, jn.f))))
         .b(b, Boolean.valueOf(this.a($$11, $$11.c($$1, $$7, jn.e))))
         .b(e, Boolean.valueOf($$3.a() == esz.c));
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, esz.c, esz.c.a($$1));
      }

      return $$4.o().d() ? $$0.b(f.get($$4), Boolean.valueOf(this.a($$6, $$6.c($$1, $$5, $$4.g())))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fbt c(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return fbq.a();
   }

   @Override
   protected boolean b(dww $$0, dww $$1, jn $$2) {
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

   public final boolean a(dww $$0, boolean $$1) {
      return !k($$0) && $$1 || $$0.b() instanceof dno || $$0.a(awp.N);
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
