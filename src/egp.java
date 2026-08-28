import com.mojang.serialization.Codec;

public class egp extends egw<eix> {
   public egp(Codec<eix> $$0) {
      super($$0);
   }

   @Override
   public boolean a(egy<eix> $$0) {
      eix $$1 = $$0.f();
      jh $$2 = $$0.e();
      dig $$3 = $$0.b();
      bam $$4 = $$0.d();
      boolean $$5 = false;
      int $$6 = $$2.v();
      int $$7 = $$6 + $$1.d();
      int $$8 = $$6 - $$1.d() - 1;
      int $$9 = $$1.c().a($$4);
      jh.a $$10 = new jh.a();

      for (jh $$11 : jh.c($$2.b(-$$9, 0, -$$9), $$2.b($$9, 0, $$9))) {
         int $$12 = $$11.u() - $$2.u();
         int $$13 = $$11.w() - $$2.w();
         if ($$12 * $$12 + $$13 * $$13 <= $$9 * $$9) {
            $$5 |= this.a($$1, $$3, $$4, $$7, $$8, $$10.g($$11));
         }
      }

      return $$5;
   }

   protected boolean a(eix $$0, dig $$1, bam $$2, int $$3, int $$4, jh.a $$5) {
      boolean $$6 = false;
      boolean $$7 = false;

      for (int $$8 = $$3; $$8 > $$4; $$8--) {
         $$5.q($$8);
         if ($$0.b().test($$1, $$5)) {
            dxv $$9 = $$0.a().a($$1, $$2, $$5);
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
