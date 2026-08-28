import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlt extends dhm implements doo {
   public static final MapCodec<dlt> a = b(dlt::new);
   public static final dvj b = dvi.j;
   public static final dvj c = dvi.C;
   protected static final ezq d = ezn.a(dhm.a(5.0, 0.0, 5.0, 11.0, 7.0, 11.0), dhm.a(6.0, 7.0, 6.0, 10.0, 9.0, 10.0));
   protected static final ezq e = ezn.a(dhm.a(5.0, 1.0, 5.0, 11.0, 8.0, 11.0), dhm.a(6.0, 8.0, 6.0, 10.0, 10.0, 10.0));

   @Override
   public MapCodec<dlt> a() {
      return a;
   }

   public dlt(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dus a(czn $$0) {
      eqt $$1 = $$0.q().b_($$0.a());

      for (jk $$2 : $$0.f()) {
         if ($$2.o() == jk.a.b) {
            dus $$3 = this.n().b(b, Boolean.valueOf($$2 == jk.b));
            if ($$3.a((dem)$$0.q(), $$0.a())) {
               return $$3.b(c, Boolean.valueOf($$1.a() == equ.c));
            }
         }
      }

      return null;
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return $$0.c(b) ? e : d;
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(dus $$0, dem $$1, jf $$2) {
      jk $$3 = o($$0).g();
      return dhm.a($$1, $$2.a($$3), $$3.g());
   }

   protected static jk o(dus $$0) {
      return $$0.c(b) ? jk.a : jk.b;
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, equ.c, equ.c.a($$3));
      }

      return o($$0).g() == $$1 && !$$0.a($$3, $$4) ? dho.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eqt b_(dus $$0) {
      return $$0.c(c) ? equ.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dus $$0, eri $$1) {
      return false;
   }
}
