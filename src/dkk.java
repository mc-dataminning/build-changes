import com.mojang.serialization.MapCodec;

public class dkk extends dji {
   public static final MapCodec<dkk> i = b(dkk::new);
   private final ezq[] j;

   @Override
   public MapCodec<dkk> a() {
      return i;
   }

   public dkk(dur.d $$0) {
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
   protected ezq d_(dus $$0) {
      return this.j[this.h($$0)];
   }

   @Override
   protected ezq c(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return this.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(dus $$0, eri $$1) {
      return false;
   }

   public boolean a(dus $$0, boolean $$1, jk $$2) {
      dhm $$3 = $$0.b();
      boolean $$4 = this.o($$0);
      boolean $$5 = $$3 instanceof dkl && dkl.a($$0, $$2);
      return !k($$0) && $$1 || $$4 || $$5;
   }

   private boolean o(dus $$0) {
      return $$0.a(awv.T) && $$0.a(awv.l) == this.n().a(awv.l);
   }

   @Override
   protected brs a(dus $$0, dej $$1, jf $$2, cnx $$3, eys $$4) {
      return (brs)(!$$1.x_() ? cwc.a($$3, $$1, $$2) : brs.e);
   }

   @Override
   public dus a(czn $$0) {
      ddo $$1 = $$0.q();
      jf $$2 = $$0.a();
      eqt $$3 = $$0.q().b_($$0.a());
      jf $$4 = $$2.f();
      jf $$5 = $$2.i();
      jf $$6 = $$2.g();
      jf $$7 = $$2.h();
      dus $$8 = $$1.a_($$4);
      dus $$9 = $$1.a_($$5);
      dus $$10 = $$1.a_($$6);
      dus $$11 = $$1.a_($$7);
      return super.a($$0)
         .b(a, Boolean.valueOf(this.a($$8, $$8.c($$1, $$4, jk.d), jk.d)))
         .b(b, Boolean.valueOf(this.a($$9, $$9.c($$1, $$5, jk.e), jk.e)))
         .b(c, Boolean.valueOf(this.a($$10, $$10.c($$1, $$6, jk.c), jk.c)))
         .b(d, Boolean.valueOf(this.a($$11, $$11.c($$1, $$7, jk.f), jk.f)))
         .b(e, Boolean.valueOf($$3.a() == equ.c));
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, equ.c, equ.c.a($$3));
      }

      return $$1.o().e() == jk.c.a ? $$0.b(f.get($$1), Boolean.valueOf(this.a($$2, $$2.c($$3, $$5, $$1.g()), $$1.g()))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
