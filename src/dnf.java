import com.mojang.serialization.Codec;

public class dnf extends dnl<dpm> {
   public dnf(Codec<dpm> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dnn<dpm> $$0) {
      dpm $$1 = $$0.f();
      gv $$2 = $$0.e();
      cqe $$3 = $$0.b();
      art $$4 = $$0.d();
      boolean $$5 = false;
      int $$6 = $$2.v();
      int $$7 = $$6 + $$1.d();
      int $$8 = $$6 - $$1.d() - 1;
      int $$9 = $$1.c().a($$4);
      gv.a $$10 = new gv.a();

      for (gv $$11 : gv.a($$2.b(-$$9, 0, -$$9), $$2.b($$9, 0, $$9))) {
         int $$12 = $$11.u() - $$2.u();
         int $$13 = $$11.w() - $$2.w();
         if ($$12 * $$12 + $$13 * $$13 <= $$9 * $$9) {
            $$5 |= this.a($$1, $$3, $$4, $$7, $$8, $$10.g($$11));
         }
      }

      return $$5;
   }

   protected boolean a(dpm $$0, cqe $$1, art $$2, int $$3, int $$4, gv.a $$5) {
      boolean $$6 = false;
      dey $$7 = null;

      for (int $$8 = $$3; $$8 > $$4; $$8--) {
         $$5.q($$8);
         if ($$0.b().test($$1, $$5)) {
            dey $$9 = $$0.a().a($$1, $$2, $$5);
            $$1.a($$5, $$9, 2);
            this.a($$1, $$5);
            $$6 = true;
         }
      }

      return $$6;
   }
}
