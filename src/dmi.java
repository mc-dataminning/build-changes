import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmi extends dhm implements doo {
   public static final MapCodec<dmi> a = b(dmi::new);
   public static final dvj b = dvi.C;

   @Override
   public MapCodec<dmi> a() {
      return a;
   }

   protected dmi(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean b(dus $$0, dus $$1, jk $$2) {
      return $$1.a(dho.ac) && $$2.o() == jk.a.b;
   }

   @Nullable
   @Override
   public dus a(czn $$0) {
      eqt $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == equ.c;
      return super.a($$0).b(b, Boolean.valueOf($$2));
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
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(b);
   }
}
