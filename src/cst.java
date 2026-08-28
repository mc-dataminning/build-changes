import java.util.Optional;
import javax.annotation.Nullable;

public class cst extends cuf {
   public cst(cuf.a $$0) {
      super($$0);
   }

   @Nullable
   public static jh a(dbt $$0) {
      return $$0.D_().j() ? jh.a($$0.af(), $$0.V()) : null;
   }

   @Override
   public boolean d_(cuk $$0) {
      return $$0.b(km.R) || super.d_($$0);
   }

   @Override
   public void a(cuk $$0, dbt $$1, bsp $$2, int $$3, boolean $$4) {
      if ($$1 instanceof arb $$5) {
         cxi $$6 = $$0.a(km.R);
         if ($$6 != null) {
            cxi $$7 = $$6.a($$5);
            if ($$7 != $$6) {
               $$0.b(km.R, $$7);
            }
         }
      }
   }

   @Override
   public bqp a(cxx $$0) {
      iz $$1 = $$0.a();
      dbt $$2 = $$0.q();
      if (!$$2.a_($$1).a(dew.pq)) {
         return super.a($$0);
      } else {
         $$2.a(null, $$1, avw.on, avx.h, 1.0F, 1.0F);
         cms $$3 = $$0.o();
         cuk $$4 = $$0.n();
         boolean $$5 = !$$3.fP() && $$4.I() == 1;
         cxi $$6 = new cxi(Optional.of(jh.a($$2.af(), $$1)), true);
         if ($$5) {
            $$4.b(km.R, $$6);
         } else {
            cuk $$7 = $$4.a(cun.qS, 1);
            $$4.a(1, $$3);
            $$7.b(km.R, $$6);
            if (!$$3.gc().f($$7)) {
               $$3.a($$7, false);
            }
         }

         return bqp.a($$2.B);
      }
   }

   @Override
   public String i(cuk $$0) {
      return $$0.b(km.R) ? "item.minecraft.lodestone_compass" : super.i($$0);
   }
}
