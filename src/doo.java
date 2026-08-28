import com.mojang.serialization.MapCodec;

public class doo extends dmj {
   public static final MapCodec<doo> i = b(doo::new);

   @Override
   public MapCodec<? extends doo> a() {
      return i;
   }

   protected doo(dxt.d $$0) {
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
   public dxu a(dbf $$0) {
      dgm $$1 = $$0.q();
      jh $$2 = $$0.a();
      etw $$3 = $$0.q().b_($$0.a());
      jh $$4 = $$2.f();
      jh $$5 = $$2.g();
      jh $$6 = $$2.h();
      jh $$7 = $$2.i();
      dxu $$8 = $$1.a_($$4);
      dxu $$9 = $$1.a_($$5);
      dxu $$10 = $$1.a_($$6);
      dxu $$11 = $$1.a_($$7);
      return this.m()
         .b(a, Boolean.valueOf(this.a($$8, $$8.c($$1, $$4, jm.d))))
         .b(c, Boolean.valueOf(this.a($$9, $$9.c($$1, $$5, jm.c))))
         .b(d, Boolean.valueOf(this.a($$10, $$10.c($$1, $$6, jm.f))))
         .b(b, Boolean.valueOf(this.a($$11, $$11.c($$1, $$7, jm.e))))
         .b(e, Boolean.valueOf($$3.a() == etx.c));
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, etx.c, etx.c.a($$1));
      }

      return $$4.o().d() ? $$0.b(f.get($$4), Boolean.valueOf(this.a($$6, $$6.c($$1, $$5, $$4.g())))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fcr c(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return fco.a();
   }

   @Override
   protected boolean b(dxu $$0, dxu $$1, jm $$2) {
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

   public final boolean a(dxu $$0, boolean $$1) {
      return !k($$0) && $$1 || $$0.b() instanceof doo || $$0.a(axu.N);
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
