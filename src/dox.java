import com.mojang.serialization.MapCodec;

public class dox extends dhm {
   public static final MapCodec<dox> b = b(dox::new);
   public static final dvj c = dvi.z;

   @Override
   protected MapCodec<? extends dox> a() {
      return b;
   }

   protected dox(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Boolean.valueOf(false)));
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      return $$1 == jk.b ? $$0.b(c, Boolean.valueOf(o($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dus a(czn $$0) {
      dus $$1 = $$0.q().a_($$0.a().d());
      return this.n().b(c, Boolean.valueOf(o($$1)));
   }

   private static boolean o(dus $$0) {
      return $$0.a(awv.bA);
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(c);
   }
}
