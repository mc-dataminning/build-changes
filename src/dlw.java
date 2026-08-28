import com.mojang.serialization.MapCodec;
import java.util.OptionalInt;

public class dlw extends dhm implements doo {
   public static final MapCodec<dlw> b = b(dlw::new);
   public static final int c = 7;
   public static final dvs d = dvi.aC;
   public static final dvj e = dvi.v;
   public static final dvj f = dvi.C;
   private static final int a = 1;

   @Override
   public MapCodec<? extends dlw> a() {
      return b;
   }

   public dlw(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(d, Integer.valueOf(7)).b(e, Boolean.valueOf(false)).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected ezq b_(dus $$0, ddo $$1, jf $$2) {
      return ezn.a();
   }

   @Override
   protected boolean f(dus $$0) {
      return $$0.c(d) == 7 && !$$0.c(e);
   }

   @Override
   protected void b(dus $$0, arj $$1, jf $$2, azn $$3) {
      if (this.o($$0)) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   protected boolean o(dus $$0) {
      return !$$0.c(e) && $$0.c(d) == 7;
   }

   @Override
   protected void a(dus $$0, arj $$1, jf $$2, azn $$3) {
      $$1.a($$2, a($$0, $$1, $$2), 3);
   }

   @Override
   protected int i_(dus $$0) {
      return 1;
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, equ.c, equ.c.a($$3));
      }

      int $$6 = r($$2) + 1;
      if ($$6 != 1 || $$0.c(d) != $$6) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   private static dus a(dus $$0, dek $$1, jf $$2) {
      int $$3 = 7;
      jf.a $$4 = new jf.a();

      for (jk $$5 : jk.values()) {
         $$4.a($$2, $$5);
         $$3 = Math.min($$3, r($$1.a_($$4)) + 1);
         if ($$3 == 1) {
            break;
         }
      }

      return $$0.b(d, Integer.valueOf($$3));
   }

   private static int r(dus $$0) {
      return q($$0).orElse(7);
   }

   public static OptionalInt q(dus $$0) {
      if ($$0.a(awv.u)) {
         return OptionalInt.of(0);
      } else {
         return $$0.b(d) ? OptionalInt.of($$0.c(d)) : OptionalInt.empty();
      }
   }

   @Override
   protected eqt b_(dus $$0) {
      return $$0.c(f) ? equ.c.a(false) : super.b_($$0);
   }

   @Override
   public void a(dus $$0, dej $$1, jf $$2, azn $$3) {
      if ($$1.r($$2.d())) {
         if ($$3.a(15) == 1) {
            jf $$4 = $$2.e();
            dus $$5 = $$1.a_($$4);
            if (!$$5.t() || !$$5.c($$1, $$4, jk.b)) {
               azj.a($$1, $$2, $$3, lo.l);
            }
         }
      }
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(d, e, f);
   }

   @Override
   public dus a(czn $$0) {
      eqt $$1 = $$0.q().b_($$0.a());
      dus $$2 = this.n().b(e, Boolean.valueOf(true)).b(f, Boolean.valueOf($$1.a() == equ.c));
      return a($$2, $$0.q(), $$0.a());
   }
}
