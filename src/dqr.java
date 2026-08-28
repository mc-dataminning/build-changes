import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqr extends dpz implements doo {
   public static final MapCodec<dqr> a = b(dqr::new);
   public static final dvj c = dvi.C;

   @Override
   protected MapCodec<? extends dqr> a() {
      return a;
   }

   protected dqr(dur.d $$0) {
      super($$0);
      this.l(this.n().b(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dus a(czn $$0) {
      eqt $$1 = $$0.q().b_($$0.a());
      return super.a($$0).b(c, Boolean.valueOf($$1.b(equ.c)));
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, equ.c, equ.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eqt b_(dus $$0) {
      return $$0.c(c) ? equ.c.a(true) : super.b_($$0);
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(c);
   }
}
