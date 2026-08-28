import com.mojang.serialization.MapCodec;

public class dkh extends djf {
   public static final MapCodec<dkh> i = b(dkh::new);
   private final ezm[] j;

   @Override
   public MapCodec<dkh> a() {
      return i;
   }

   public dkh(dun.d $$0) {
      super(2.0F, 2.0F, 16.0F, 16.0F, 24.0F, $$0);
      this.l(
         this.F
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
   protected ezm d_(duo $$0) {
      return this.j[this.h($$0)];
   }

   @Override
   protected ezm c(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return this.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(duo $$0, ere $$1) {
      return false;
   }

   public boolean a(duo $$0, boolean $$1, jj $$2) {
      dhj $$3 = $$0.b();
      boolean $$4 = this.o($$0);
      boolean $$5 = $$3 instanceof dki && dki.a($$0, $$2);
      return !k($$0) && $$1 || $$4 || $$5;
   }

   private boolean o(duo $$0) {
      return $$0.a(awt.T) && $$0.a(awt.l) == this.o().a(awt.l);
   }

   @Override
   protected brp a(duo $$0, deg $$1, je $$2, cnu $$3, eyo $$4) {
      return (brp)(!$$1.w_() ? cvz.a($$3, $$1, $$2) : brp.e);
   }

   @Override
   public duo a(czk $$0) {
      ddl $$1 = $$0.q();
      je $$2 = $$0.a();
      eqp $$3 = $$0.q().b_($$0.a());
      je $$4 = $$2.f();
      je $$5 = $$2.i();
      je $$6 = $$2.g();
      je $$7 = $$2.h();
      duo $$8 = $$1.a_($$4);
      duo $$9 = $$1.a_($$5);
      duo $$10 = $$1.a_($$6);
      duo $$11 = $$1.a_($$7);
      return super.a($$0)
         .b(a, Boolean.valueOf(this.a($$8, $$8.c($$1, $$4, jj.d), jj.d)))
         .b(b, Boolean.valueOf(this.a($$9, $$9.c($$1, $$5, jj.e), jj.e)))
         .b(c, Boolean.valueOf(this.a($$10, $$10.c($$1, $$6, jj.c), jj.c)))
         .b(d, Boolean.valueOf(this.a($$11, $$11.c($$1, $$7, jj.f), jj.f)))
         .b(e, Boolean.valueOf($$3.a() == eqq.c));
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eqq.c, eqq.c.a($$3));
      }

      return $$1.o().e() == jj.c.a ? $$0.b(f.get($$1), Boolean.valueOf(this.a($$2, $$2.c($$3, $$5, $$1.g()), $$1.g()))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
