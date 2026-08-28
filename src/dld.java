import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dld extends dhm implements doo {
   public static final MapCodec<dld> a = b(dld::new);
   private static final dvj c = dvi.C;
   protected static final ezq b = dhm.a(2.0, 10.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dld> a() {
      return a;
   }

   protected dld(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(c);
   }

   @Override
   protected eqt b_(dus $$0) {
      return $$0.c(c) ? equ.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public dus a(czn $$0) {
      dus $$1 = super.a($$0);
      if ($$1 != null) {
         eqt $$2 = $$0.q().b_($$0.a());
         return $$1.b(c, Boolean.valueOf($$2.a() == equ.c));
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(dus $$0, dem $$1, jf $$2) {
      jf $$3 = $$2.d();
      dus $$4 = $$1.a_($$3);
      return $$4.c($$1, $$3, jk.a);
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return b;
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      if ($$1 == jk.b && !this.a($$0, $$3, $$4)) {
         return dho.a.n();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, equ.c, equ.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
