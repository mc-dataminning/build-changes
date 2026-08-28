import com.mojang.serialization.MapCodec;

public class dkw extends dir {
   public static final MapCodec<dkw> i = b(dkw::new);

   @Override
   public MapCodec<? extends dkw> a() {
      return i;
   }

   protected dkw(dtz.d $$0) {
      super(1.0F, 1.0F, 16.0F, 16.0F, 16.0F, $$0);
      this.l(
         this.E
            .b()
            .b(a, Boolean.valueOf(false))
            .b(b, Boolean.valueOf(false))
            .b(c, Boolean.valueOf(false))
            .b(d, Boolean.valueOf(false))
            .b(e, Boolean.valueOf(false))
      );
   }

   @Override
   public dua a(cyw $$0) {
      dcx $$1 = $$0.q();
      je $$2 = $$0.a();
      eqb $$3 = $$0.q().b_($$0.a());
      je $$4 = $$2.f();
      je $$5 = $$2.g();
      je $$6 = $$2.h();
      je $$7 = $$2.i();
      dua $$8 = $$1.a_($$4);
      dua $$9 = $$1.a_($$5);
      dua $$10 = $$1.a_($$6);
      dua $$11 = $$1.a_($$7);
      return this.o()
         .b(a, Boolean.valueOf(this.a($$8, $$8.c($$1, $$4, jj.d))))
         .b(c, Boolean.valueOf(this.a($$9, $$9.c($$1, $$5, jj.c))))
         .b(d, Boolean.valueOf(this.a($$10, $$10.c($$1, $$6, jj.f))))
         .b(b, Boolean.valueOf(this.a($$11, $$11.c($$1, $$7, jj.e))))
         .b(e, Boolean.valueOf($$3.a() == eqc.c));
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eqc.c, eqc.c.a($$3));
      }

      return $$1.o().d() ? $$0.b(f.get($$1), Boolean.valueOf(this.a($$2, $$2.c($$3, $$5, $$1.g())))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eyx c(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return eyu.a();
   }

   @Override
   protected boolean b(dua $$0, dua $$1, jj $$2) {
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

   public final boolean a(dua $$0, boolean $$1) {
      return !k($$0) && $$1 || $$0.b() instanceof dkw || $$0.a(aws.M);
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
