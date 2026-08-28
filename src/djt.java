import com.mojang.serialization.MapCodec;

public class djt extends dir {
   public static final MapCodec<djt> i = b(djt::new);
   private final eyx[] j;

   @Override
   public MapCodec<djt> a() {
      return i;
   }

   public djt(dtz.d $$0) {
      super(2.0F, 2.0F, 16.0F, 16.0F, 24.0F, $$0);
      this.l(
         this.E
            .b()
            .b(a, Boolean.valueOf(false))
            .b(b, Boolean.valueOf(false))
            .b(c, Boolean.valueOf(false))
            .b(d, Boolean.valueOf(false))
            .b(e, Boolean.valueOf(false))
      );
      this.j = this.a(2.0F, 1.0F, 16.0F, 6.0F, 15.0F);
   }

   @Override
   protected eyx d_(dua $$0) {
      return this.j[this.h($$0)];
   }

   @Override
   protected eyx c(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return this.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(dua $$0, eqq $$1) {
      return false;
   }

   public boolean a(dua $$0, boolean $$1, jj $$2) {
      dgv $$3 = $$0.b();
      boolean $$4 = this.o($$0);
      boolean $$5 = $$3 instanceof dju && dju.a($$0, $$2);
      return !k($$0) && $$1 || $$4 || $$5;
   }

   private boolean o(dua $$0) {
      return $$0.a(aws.T) && $$0.a(aws.l) == this.o().a(aws.l);
   }

   @Override
   protected brk a(dua $$0, dds $$1, je $$2, cnp $$3, eya $$4) {
      return (brk)(!$$1.w_() ? cvu.a($$3, $$1, $$2) : brk.e);
   }

   @Override
   public dua a(cyw $$0) {
      dcx $$1 = $$0.q();
      je $$2 = $$0.a();
      eqb $$3 = $$0.q().b_($$0.a());
      je $$4 = $$2.f();
      je $$5 = $$2.i();
      je $$6 = $$2.g();
      je $$7 = $$2.h();
      dua $$8 = $$1.a_($$4);
      dua $$9 = $$1.a_($$5);
      dua $$10 = $$1.a_($$6);
      dua $$11 = $$1.a_($$7);
      return super.a($$0)
         .b(a, Boolean.valueOf(this.a($$8, $$8.c($$1, $$4, jj.d), jj.d)))
         .b(b, Boolean.valueOf(this.a($$9, $$9.c($$1, $$5, jj.e), jj.e)))
         .b(c, Boolean.valueOf(this.a($$10, $$10.c($$1, $$6, jj.c), jj.c)))
         .b(d, Boolean.valueOf(this.a($$11, $$11.c($$1, $$7, jj.f), jj.f)))
         .b(e, Boolean.valueOf($$3.a() == eqc.c));
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eqc.c, eqc.c.a($$3));
      }

      return $$1.o().e() == jj.c.a ? $$0.b(f.get($$1), Boolean.valueOf(this.a($$2, $$2.c($$3, $$5, $$1.g()), $$1.g()))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
