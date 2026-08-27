import java.util.List;
import javax.annotation.Nullable;

public class cst extends ctj implements cug {
   public static final byte[] a = new byte[]{1, 2, 3};
   public static final double b = 0.15;

   public cst(ctj.a $$0) {
      super($$0);
   }

   @Override
   public bpu a(cxb $$0) {
      dax $$1 = $$0.q();
      if (!$$1.B) {
         cto $$2 = $$0.n();
         euk $$3 = $$0.l();
         it $$4 = $$0.k();
         cmj $$5 = new cmj($$1, $$0.o(), $$3.c + (double)$$4.j() * 0.15, $$3.d + (double)$$4.k() * 0.15, $$3.e + (double)$$4.l() * 0.15, $$2);
         $$1.b($$5);
         $$2.h(1);
      }

      return bpu.a($$1.B);
   }

   @Override
   public bpv<cto> a(dax $$0, clw $$1, bpt $$2) {
      if ($$1.fE()) {
         cto $$3 = $$1.b($$2);
         if (!$$0.B) {
            cmj $$4 = new cmj($$0, $$3, $$1);
            $$0.b($$4);
            $$3.a(1, $$1);
            $$1.b(avr.c.b(this));
         }

         return bpv.a($$1.b($$2), $$0.x_());
      } else {
         return bpv.c($$1.b($$2));
      }
   }

   @Override
   public void a(cto $$0, @Nullable dax $$1, List<wx> $$2, cvh $$3) {
      cwi $$4 = $$0.a(kb.T);
      if ($$4 != null) {
         $$4.a($$2::add, $$3);
      }
   }

   @Override
   public cmo a(dax $$0, jh $$1, cto $$2, it $$3) {
      return new cmj($$0, $$2.c(1), $$1.a(), $$1.b(), $$1.c(), true);
   }

   @Override
   public cug.a c() {
      return cug.a.a().a(cst::a).a(0.5F).b(1.0F).a(1004).a();
   }

   private static euk a(kf $$0, it $$1) {
      return $$0.a()
         .b(
            (double)$$1.j() * (0.5000099999997474 - (double)bsa.P.l() / 2.0),
            (double)$$1.k() * (0.5000099999997474 - (double)bsa.P.m() / 2.0) - (double)bsa.P.m() / 2.0,
            (double)$$1.l() * (0.5000099999997474 - (double)bsa.P.l() / 2.0)
         );
   }
}
