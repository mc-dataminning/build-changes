import com.mojang.serialization.MapCodec;

public class dmq extends dkm {
   public static final MapCodec<dmq> i = b(dmq::new);

   @Override
   public MapCodec<? extends dmq> a() {
      return i;
   }

   protected dmq(dvu.d $$0) {
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
   public dvv a(dad $$0) {
      der $$1 = $$0.q();
      jh $$2 = $$0.a();
      erv $$3 = $$0.q().b_($$0.a());
      jh $$4 = $$2.f();
      jh $$5 = $$2.g();
      jh $$6 = $$2.h();
      jh $$7 = $$2.i();
      dvv $$8 = $$1.a_($$4);
      dvv $$9 = $$1.a_($$5);
      dvv $$10 = $$1.a_($$6);
      dvv $$11 = $$1.a_($$7);
      return this.m()
         .b(a, Boolean.valueOf(this.a($$8, $$8.c($$1, $$4, jm.d))))
         .b(c, Boolean.valueOf(this.a($$9, $$9.c($$1, $$5, jm.c))))
         .b(d, Boolean.valueOf(this.a($$10, $$10.c($$1, $$6, jm.f))))
         .b(b, Boolean.valueOf(this.a($$11, $$11.c($$1, $$7, jm.e))))
         .b(e, Boolean.valueOf($$3.a() == erw.c));
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, erw.c, erw.c.a($$1));
      }

      return $$4.o().d() ? $$0.b(f.get($$4), Boolean.valueOf(this.a($$6, $$6.c($$1, $$5, $$4.g())))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fas c(dvv $$0, der $$1, jh $$2, fad $$3) {
      return fap.a();
   }

   @Override
   protected boolean b(dvv $$0, dvv $$1, jm $$2) {
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

   public final boolean a(dvv $$0, boolean $$1) {
      return !k($$0) && $$1 || $$0.b() instanceof dmq || $$0.a(axc.M);
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
