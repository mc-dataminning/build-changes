import com.mojang.serialization.MapCodec;

public class dif extends dhd {
   public static final MapCodec<dif> i = b(dif::new);
   private final ewy[] j;

   @Override
   public MapCodec<dif> a() {
      return i;
   }

   public dif(dsj.d $$0) {
      super(2.0F, 2.0F, 16.0F, 16.0F, 24.0F, $$0);
      this.k(
         this.E
            .b()
            .a(a, Boolean.valueOf(false))
            .a(b, Boolean.valueOf(false))
            .a(c, Boolean.valueOf(false))
            .a(d, Boolean.valueOf(false))
            .a(e, Boolean.valueOf(false))
      );
      this.j = this.a(2.0F, 1.0F, 16.0F, 6.0F, 15.0F);
   }

   @Override
   protected ewy f(dsk $$0, dbl $$1, ja $$2) {
      return this.j[this.g($$0)];
   }

   @Override
   protected ewy c(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return this.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(dsk $$0, eow $$1) {
      return false;
   }

   public boolean a(dsk $$0, boolean $$1, jf $$2) {
      dfh $$3 = $$0.b();
      boolean $$4 = this.m($$0);
      boolean $$5 = $$3 instanceof dig && dig.a($$0, $$2);
      return !j($$0) && $$1 || $$4 || $$5;
   }

   private boolean m(dsk $$0) {
      return $$0.a(avw.S) && $$0.a(avw.k) == this.o().a(avw.k);
   }

   @Override
   protected bqi a(cuc $$0, dsk $$1, dcf $$2, ja $$3, cmk $$4, bqf $$5, ewb $$6) {
      if ($$2.B) {
         return $$0.a(cuf.uK) ? bqi.a : bqi.e;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bqg a(dsk $$0, dcf $$1, ja $$2, cmk $$3, ewb $$4) {
      return !$$1.x_() ? cuh.a($$3, $$1, $$2) : bqg.e;
   }

   @Override
   public dsk a(cxm $$0) {
      dbl $$1 = $$0.q();
      ja $$2 = $$0.a();
      eoh $$3 = $$0.q().b_($$0.a());
      ja $$4 = $$2.e();
      ja $$5 = $$2.h();
      ja $$6 = $$2.f();
      ja $$7 = $$2.g();
      dsk $$8 = $$1.a_($$4);
      dsk $$9 = $$1.a_($$5);
      dsk $$10 = $$1.a_($$6);
      dsk $$11 = $$1.a_($$7);
      return super.a($$0)
         .a(a, Boolean.valueOf(this.a($$8, $$8.d($$1, $$4, jf.d), jf.d)))
         .a(b, Boolean.valueOf(this.a($$9, $$9.d($$1, $$5, jf.e), jf.e)))
         .a(c, Boolean.valueOf(this.a($$10, $$10.d($$1, $$6, jf.c), jf.c)))
         .a(d, Boolean.valueOf(this.a($$11, $$11.d($$1, $$7, jf.f), jf.f)))
         .a(e, Boolean.valueOf($$3.a() == eoi.c));
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eoi.c, eoi.c.a($$3));
      }

      return $$1.o().e() == jf.c.a ? $$0.a(f.get($$1), Boolean.valueOf(this.a($$2, $$2.d($$3, $$5, $$1.g()), $$1.g()))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
