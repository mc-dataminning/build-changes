import com.mojang.serialization.MapCodec;

public class dqs extends dok {
   public static final MapCodec<dqs> g = b(dqs::new);

   @Override
   public MapCodec<? extends dqs> a() {
      return g;
   }

   protected dqs(ean.d $$0) {
      super(2.0F, 16.0F, 2.0F, 16.0F, 16.0F, $$0);
      this.l(
         this.C
            .b()
            .b(a, Boolean.valueOf(false))
            .b(b, Boolean.valueOf(false))
            .b(c, Boolean.valueOf(false))
            .b(d, Boolean.valueOf(false))
            .b(e, Boolean.valueOf(false))
      );
   }

   @Override
   public eao a(ddd $$0) {
      din $$1 = $$0.q();
      iv $$2 = $$0.a();
      ewv $$3 = $$0.q().b_($$0.a());
      iv $$4 = $$2.f();
      iv $$5 = $$2.g();
      iv $$6 = $$2.h();
      iv $$7 = $$2.i();
      eao $$8 = $$1.a_($$4);
      eao $$9 = $$1.a_($$5);
      eao $$10 = $$1.a_($$6);
      eao $$11 = $$1.a_($$7);
      return this.m()
         .b(a, Boolean.valueOf(this.a($$8, $$8.c($$1, $$4, jb.d))))
         .b(c, Boolean.valueOf(this.a($$9, $$9.c($$1, $$5, jb.c))))
         .b(d, Boolean.valueOf(this.a($$10, $$10.c($$1, $$6, jb.f))))
         .b(b, Boolean.valueOf(this.a($$11, $$11.c($$1, $$7, jb.e))))
         .b(e, Boolean.valueOf($$3.a() == eww.c));
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, eww.c, eww.c.a($$1));
      }

      return $$4.o().d() ? $$0.b(f.get($$4), Boolean.valueOf(this.a($$6, $$6.c($$1, $$5, $$4.g())))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected ffr c(eao $$0, din $$1, iv $$2, ffc $$3) {
      return ffo.a();
   }

   @Override
   protected boolean b(eao $$0, eao $$1, jb $$2) {
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

   public final boolean a(eao $$0, boolean $$1) {
      return !k($$0) && $$1 || $$0.b() instanceof dqs || $$0.a(axc.N);
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
