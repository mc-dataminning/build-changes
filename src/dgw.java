import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dgw extends dhm implements doo {
   public static final dvj d = dvi.C;
   private static final ezq a = dhm.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   protected dgw(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(d, Boolean.valueOf(true)));
   }

   @Override
   protected abstract MapCodec<? extends dgw> a();

   protected void a(dus $$0, dek $$1, jf $$2) {
      if (!d($$0, $$1, $$2)) {
         $$1.a($$2, this, 60 + $$1.D_().a(40));
      }
   }

   protected static boolean d(dus $$0, ddo $$1, jf $$2) {
      if ($$0.c(d)) {
         return true;
      } else {
         for (jk $$3 : jk.values()) {
            if ($$1.b_($$2.a($$3)).a(axb.a)) {
               return true;
            }
         }

         return false;
      }
   }

   @Nullable
   @Override
   public dus a(czn $$0) {
      eqt $$1 = $$0.q().b_($$0.a());
      return this.n().b(d, Boolean.valueOf($$1.a(axb.a) && $$1.e() == 8));
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return a;
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, equ.c, equ.c.a($$3));
      }

      return $$1 == jk.a && !this.a($$0, (dem)$$3, $$4) ? dho.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dus $$0, dem $$1, jf $$2) {
      jf $$3 = $$2.e();
      return $$1.a_($$3).c($$1, $$3, jk.b);
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(d);
   }

   @Override
   protected eqt b_(dus $$0) {
      return $$0.c(d) ? equ.c.a(false) : super.b_($$0);
   }
}
