import com.mojang.serialization.MapCodec;

public class czf extends cxb {
   public static final MapCodec<czf> i = b(czf::new);

   @Override
   public MapCodec<? extends czf> a() {
      return i;
   }

   protected czf(dhm.d $$0) {
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
   public dhn a(cnw $$0) {
      crl $$1 = $$0.q();
      hx $$2 = $$0.a();
      ecx $$3 = $$0.q().b_($$0.a());
      hx $$4 = $$2.e();
      hx $$5 = $$2.f();
      hx $$6 = $$2.g();
      hx $$7 = $$2.h();
      dhn $$8 = $$1.a_($$4);
      dhn $$9 = $$1.a_($$5);
      dhn $$10 = $$1.a_($$6);
      dhn $$11 = $$1.a_($$7);
      return this.o()
         .a(a, Boolean.valueOf(this.a($$8, $$8.d($$1, $$4, ib.d))))
         .a(c, Boolean.valueOf(this.a($$9, $$9.d($$1, $$5, ib.c))))
         .a(d, Boolean.valueOf(this.a($$10, $$10.d($$1, $$6, ib.f))))
         .a(b, Boolean.valueOf(this.a($$11, $$11.d($$1, $$7, ib.e))))
         .a(e, Boolean.valueOf($$3.a() == ecy.c));
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, ecy.c, ecy.c.a($$3));
      }

      return $$1.o().d() ? $$0.a(f.get($$1), Boolean.valueOf(this.a($$2, $$2.d($$3, $$5, $$1.g())))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eks c(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return ekp.a();
   }

   @Override
   public boolean a(dhn $$0, dhn $$1, ib $$2) {
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

   public final boolean a(dhn $$0, boolean $$1) {
      return !j($$0) && $$1 || $$0.b() instanceof czf || $$0.a(ark.L);
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
