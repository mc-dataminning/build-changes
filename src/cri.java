import java.util.List;
import javax.annotation.Nullable;

public class cri extends cry {
   public static final byte[] a = new byte[]{1, 2, 3};
   public static final double b = 0.15;

   public cri(cry.a $$0) {
      super($$0);
   }

   @Override
   public boq a(cvn $$0) {
      czu $$1 = $$0.q();
      if (!$$1.B) {
         csd $$2 = $$0.n();
         etf $$3 = $$0.l();
         ir $$4 = $$0.k();
         cky $$5 = new cky($$1, $$0.o(), $$3.c + (double)$$4.j() * 0.15, $$3.d + (double)$$4.k() * 0.15, $$3.e + (double)$$4.l() * 0.15, $$2);
         $$1.b($$5);
         $$2.g(1);
      }

      return boq.a($$1.B);
   }

   @Override
   public bor<csd> a(czu $$0, ckl $$1, bop $$2) {
      if ($$1.fC()) {
         csd $$3 = $$1.b($$2);
         if (!$$0.B) {
            cky $$4 = new cky($$0, $$3, $$1);
            $$0.b($$4);
            $$3.a(1, $$1);
            $$1.b(avj.c.b(this));
         }

         return bor.a($$1.b($$2), $$0.x_());
      } else {
         return bor.c($$1.b($$2));
      }
   }

   @Override
   public void a(csd $$0, @Nullable czu $$1, List<ws> $$2, ctu $$3) {
      cuv $$4 = $$0.a(jz.K);
      if ($$4 != null) {
         $$4.a($$2::add, $$3);
      }
   }
}
