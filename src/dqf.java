import com.mojang.serialization.MapCodec;

public class dqf extends dnx {
   public static final MapCodec<dqf> g = b(dqf::new);

   @Override
   public MapCodec<? extends dqf> a() {
      return g;
   }

   protected dqf(dzy.d $$0) {
      super(2.0F, 16.0F, 2.0F, 16.0F, 16.0F, $$0);
      this.l(
         this.B
            .b()
            .b(a, Boolean.valueOf(false))
            .b(b, Boolean.valueOf(false))
            .b(c, Boolean.valueOf(false))
            .b(d, Boolean.valueOf(false))
            .b(e, Boolean.valueOf(false))
      );
   }

   @Override
   public dzz a(dcr $$0) {
      dib $$1 = $$0.q();
      iu $$2 = $$0.a();
      ewg $$3 = $$0.q().b_($$0.a());
      iu $$4 = $$2.f();
      iu $$5 = $$2.g();
      iu $$6 = $$2.h();
      iu $$7 = $$2.i();
      dzz $$8 = $$1.a_($$4);
      dzz $$9 = $$1.a_($$5);
      dzz $$10 = $$1.a_($$6);
      dzz $$11 = $$1.a_($$7);
      return this.m()
         .b(a, Boolean.valueOf(this.a($$8, $$8.c($$1, $$4, ja.d))))
         .b(c, Boolean.valueOf(this.a($$9, $$9.c($$1, $$5, ja.c))))
         .b(d, Boolean.valueOf(this.a($$10, $$10.c($$1, $$6, ja.f))))
         .b(b, Boolean.valueOf(this.a($$11, $$11.c($$1, $$7, ja.e))))
         .b(e, Boolean.valueOf($$3.a() == ewh.c));
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, ewh.c, ewh.c.a($$1));
      }

      return $$4.o().d() ? $$0.b(f.get($$4), Boolean.valueOf(this.a($$6, $$6.c($$1, $$5, $$4.g())))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected ffc c(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return fez.a();
   }

   @Override
   protected boolean b(dzz $$0, dzz $$1, ja $$2) {
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

   public final boolean a(dzz $$0, boolean $$1) {
      return !k($$0) && $$1 || $$0.b() instanceof dqf || $$0.a(axc.N);
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
