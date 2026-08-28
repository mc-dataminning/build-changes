import com.mojang.serialization.Codec;

public class efp extends efw<ehx> {
   public efp(Codec<ehx> $$0) {
      super($$0);
   }

   @Override
   public boolean a(efy<ehx> $$0) {
      ehx $$1 = $$0.f();
      ji $$2 = $$0.e();
      dhe $$3 = $$0.b();
      azg $$4 = $$0.d();
      boolean $$5 = false;
      int $$6 = $$2.v();
      int $$7 = $$6 + $$1.d();
      int $$8 = $$6 - $$1.d() - 1;
      int $$9 = $$1.c().a($$4);
      ji.a $$10 = new ji.a();

      for (ji $$11 : ji.c($$2.b(-$$9, 0, -$$9), $$2.b($$9, 0, $$9))) {
         int $$12 = $$11.u() - $$2.u();
         int $$13 = $$11.w() - $$2.w();
         if ($$12 * $$12 + $$13 * $$13 <= $$9 * $$9) {
            $$5 |= this.a($$1, $$3, $$4, $$7, $$8, $$10.g($$11));
         }
      }

      return $$5;
   }

   protected boolean a(ehx $$0, dhe $$1, azg $$2, int $$3, int $$4, ji.a $$5) {
      boolean $$6 = false;
      boolean $$7 = false;

      for (int $$8 = $$3; $$8 > $$4; $$8--) {
         $$5.q($$8);
         if ($$0.b().test($$1, $$5)) {
            dwv $$9 = $$0.a().a($$1, $$2, $$5);
            $$1.a($$5, $$9, 2);
            if (!$$7) {
               this.a($$1, $$5);
            }

            $$6 = true;
            $$7 = true;
         } else {
            $$7 = false;
         }
      }

      return $$6;
   }
}
