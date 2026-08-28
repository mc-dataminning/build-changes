import com.mojang.serialization.MapCodec;

public class dlf extends dhm implements doo {
   public static final MapCodec<dlf> a = b(dlf::new);
   private static final ezq c = dhm.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);
   public static final dvj b = dvi.C;

   public dlf(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   public MapCodec<dlf> a() {
      return a;
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(b);
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, equ.c, equ.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eqt b_(dus $$0) {
      return $$0.c(b) ? equ.c.a(false) : super.b_($$0);
   }

   @Override
   public dus a(czn $$0) {
      eqt $$1 = $$0.q().b_($$0.a());
      return this.n().b(b, Boolean.valueOf($$1.b(equ.c)));
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return c;
   }

   @Override
   protected boolean a(dus $$0, eri $$1) {
      return false;
   }
}
