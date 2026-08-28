import com.mojang.serialization.MapCodec;

public class dji extends dhd {
   public static final MapCodec<dji> i = b(dji::new);

   @Override
   public MapCodec<? extends dji> a() {
      return i;
   }

   protected dji(dsj.d $$0) {
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
   public dsk a(cxm $$0) {
      dbl $$1 = $$0.q();
      ja $$2 = $$0.a();
      eoh $$3 = $$0.q().b_($$0.a());
      ja $$4 = $$2.e();
      ja $$5 = $$2.f();
      ja $$6 = $$2.g();
      ja $$7 = $$2.h();
      dsk $$8 = $$1.a_($$4);
      dsk $$9 = $$1.a_($$5);
      dsk $$10 = $$1.a_($$6);
      dsk $$11 = $$1.a_($$7);
      return this.o()
         .a(a, Boolean.valueOf(this.a($$8, $$8.d($$1, $$4, jf.d))))
         .a(c, Boolean.valueOf(this.a($$9, $$9.d($$1, $$5, jf.c))))
         .a(d, Boolean.valueOf(this.a($$10, $$10.d($$1, $$6, jf.f))))
         .a(b, Boolean.valueOf(this.a($$11, $$11.d($$1, $$7, jf.e))))
         .a(e, Boolean.valueOf($$3.a() == eoi.c));
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eoi.c, eoi.c.a($$3));
      }

      return $$1.o().d() ? $$0.a(f.get($$1), Boolean.valueOf(this.a($$2, $$2.d($$3, $$5, $$1.g())))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ewy c(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return ewv.a();
   }

   @Override
   protected boolean a(dsk $$0, dsk $$1, jf $$2) {
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

   public final boolean a(dsk $$0, boolean $$1) {
      return !j($$0) && $$1 || $$0.b() instanceof dji || $$0.a(avw.L);
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
