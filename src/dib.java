import com.mojang.serialization.MapCodec;

public class dib extends dfw {
   public static final MapCodec<dib> i = b(dib::new);

   @Override
   public MapCodec<? extends dib> a() {
      return i;
   }

   protected dib(drc.d $$0) {
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
   public drd a(cxb $$0) {
      daf $$1 = $$0.q();
      io $$2 = $$0.a();
      emw $$3 = $$0.q().b_($$0.a());
      io $$4 = $$2.e();
      io $$5 = $$2.f();
      io $$6 = $$2.g();
      io $$7 = $$2.h();
      drd $$8 = $$1.a_($$4);
      drd $$9 = $$1.a_($$5);
      drd $$10 = $$1.a_($$6);
      drd $$11 = $$1.a_($$7);
      return this.n()
         .a(a, Boolean.valueOf(this.a($$8, $$8.d($$1, $$4, it.d))))
         .a(c, Boolean.valueOf(this.a($$9, $$9.d($$1, $$5, it.c))))
         .a(d, Boolean.valueOf(this.a($$10, $$10.d($$1, $$6, it.f))))
         .a(b, Boolean.valueOf(this.a($$11, $$11.d($$1, $$7, it.e))))
         .a(e, Boolean.valueOf($$3.a() == emx.c));
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, emx.c, emx.c.a($$3));
      }

      return $$1.o().d() ? $$0.a(f.get($$1), Boolean.valueOf(this.a($$2, $$2.d($$3, $$5, $$1.g())))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected evf c(drd $$0, daf $$1, io $$2, eur $$3) {
      return evc.a();
   }

   @Override
   protected boolean a(drd $$0, drd $$1, it $$2) {
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

   public final boolean a(drd $$0, boolean $$1) {
      return !j($$0) && $$1 || $$0.b() instanceof dib || $$0.a(avx.L);
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
