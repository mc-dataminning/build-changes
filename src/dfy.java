import com.mojang.serialization.MapCodec;

public class dfy extends ddu {
   public static final MapCodec<dfy> i = b(dfy::new);

   @Override
   public MapCodec<? extends dfy> a() {
      return i;
   }

   protected dfy(doy.d $$0) {
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
   public doz a(cuo $$0) {
      cyd $$1 = $$0.q();
      ib $$2 = $$0.a();
      eks $$3 = $$0.q().b_($$0.a());
      ib $$4 = $$2.e();
      ib $$5 = $$2.f();
      ib $$6 = $$2.g();
      ib $$7 = $$2.h();
      doz $$8 = $$1.a_($$4);
      doz $$9 = $$1.a_($$5);
      doz $$10 = $$1.a_($$6);
      doz $$11 = $$1.a_($$7);
      return this.n()
         .a(a, Boolean.valueOf(this.a($$8, $$8.d($$1, $$4, ih.d))))
         .a(c, Boolean.valueOf(this.a($$9, $$9.d($$1, $$5, ih.c))))
         .a(d, Boolean.valueOf(this.a($$10, $$10.d($$1, $$6, ih.f))))
         .a(b, Boolean.valueOf(this.a($$11, $$11.d($$1, $$7, ih.e))))
         .a(e, Boolean.valueOf($$3.a() == ekt.c));
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, ekt.c, ekt.c.a($$3));
      }

      return $$1.o().d() ? $$0.a(f.get($$1), Boolean.valueOf(this.a($$2, $$2.d($$3, $$5, $$1.g())))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected est c(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return esq.a();
   }

   @Override
   protected boolean a(doz $$0, doz $$1, ih $$2) {
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

   public final boolean a(doz $$0, boolean $$1) {
      return !j($$0) && $$1 || $$0.b() instanceof dfy || $$0.a(avc.L);
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
