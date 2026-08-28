import com.mojang.serialization.MapCodec;

public class dru extends dpm {
   public static final MapCodec<dru> g = b(dru::new);

   @Override
   public MapCodec<? extends dru> a() {
      return g;
   }

   protected dru(ebp.d $$0) {
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
   public ebq a(ded $$0) {
      djn $$1 = $$0.q();
      iw $$2 = $$0.a();
      eya $$3 = $$0.q().b_($$0.a());
      iw $$4 = $$2.f();
      iw $$5 = $$2.g();
      iw $$6 = $$2.h();
      iw $$7 = $$2.i();
      ebq $$8 = $$1.a_($$4);
      ebq $$9 = $$1.a_($$5);
      ebq $$10 = $$1.a_($$6);
      ebq $$11 = $$1.a_($$7);
      return this.m()
         .b(a, Boolean.valueOf(this.a($$8, $$8.c($$1, $$4, jc.d))))
         .b(c, Boolean.valueOf(this.a($$9, $$9.c($$1, $$5, jc.c))))
         .b(d, Boolean.valueOf(this.a($$10, $$10.c($$1, $$6, jc.f))))
         .b(b, Boolean.valueOf(this.a($$11, $$11.c($$1, $$7, jc.e))))
         .b(e, Boolean.valueOf($$3.a() == eyb.c));
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, eyb.c, eyb.c.a($$1));
      }

      return $$4.o().d() ? $$0.b(f.get($$4), Boolean.valueOf(this.a($$6, $$6.c($$1, $$5, $$4.g())))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fgw c(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return fgt.a();
   }

   @Override
   protected boolean b(ebq $$0, ebq $$1, jc $$2) {
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

   public final boolean a(ebq $$0, boolean $$1) {
      return !k($$0) && $$1 || $$0.b() instanceof dru || $$0.a(axn.N);
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
