import com.mojang.serialization.MapCodec;

public class dln extends dji {
   public static final MapCodec<dln> i = b(dln::new);

   @Override
   public MapCodec<? extends dln> a() {
      return i;
   }

   protected dln(dur.d $$0) {
      super(1.0F, 1.0F, 16.0F, 16.0F, 16.0F, $$0);
      this.l(
         this.F
            .b()
            .b(a, Boolean.valueOf(false))
            .b(b, Boolean.valueOf(false))
            .b(c, Boolean.valueOf(false))
            .b(d, Boolean.valueOf(false))
            .b(e, Boolean.valueOf(false))
      );
   }

   @Override
   public dus a(czn $$0) {
      ddo $$1 = $$0.q();
      jf $$2 = $$0.a();
      eqt $$3 = $$0.q().b_($$0.a());
      jf $$4 = $$2.f();
      jf $$5 = $$2.g();
      jf $$6 = $$2.h();
      jf $$7 = $$2.i();
      dus $$8 = $$1.a_($$4);
      dus $$9 = $$1.a_($$5);
      dus $$10 = $$1.a_($$6);
      dus $$11 = $$1.a_($$7);
      return this.n()
         .b(a, Boolean.valueOf(this.a($$8, $$8.c($$1, $$4, jk.d))))
         .b(c, Boolean.valueOf(this.a($$9, $$9.c($$1, $$5, jk.c))))
         .b(d, Boolean.valueOf(this.a($$10, $$10.c($$1, $$6, jk.f))))
         .b(b, Boolean.valueOf(this.a($$11, $$11.c($$1, $$7, jk.e))))
         .b(e, Boolean.valueOf($$3.a() == equ.c));
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, equ.c, equ.c.a($$3));
      }

      return $$1.o().d() ? $$0.b(f.get($$1), Boolean.valueOf(this.a($$2, $$2.c($$3, $$5, $$1.g())))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ezq c(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return ezn.a();
   }

   @Override
   protected boolean b(dus $$0, dus $$1, jk $$2) {
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

   public final boolean a(dus $$0, boolean $$1) {
      return !k($$0) && $$1 || $$0.b() instanceof dln || $$0.a(awv.M);
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
