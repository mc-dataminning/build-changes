import com.mojang.serialization.Codec;

public class ehk extends ehr<ejs> {
   public ehk(Codec<ejs> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eht<ejs> $$0) {
      ejs $$1 = $$0.f();
      jj $$2 = $$0.e();
      dio $$3 = $$0.b();
      azs $$4 = $$0.d();
      boolean $$5 = false;
      int $$6 = $$2.v();
      int $$7 = $$6 + $$1.d();
      int $$8 = $$6 - $$1.d() - 1;
      int $$9 = $$1.c().a($$4);
      jj.a $$10 = new jj.a();

      for (jj $$11 : jj.c($$2.b(-$$9, 0, -$$9), $$2.b($$9, 0, $$9))) {
         int $$12 = $$11.u() - $$2.u();
         int $$13 = $$11.w() - $$2.w();
         if ($$12 * $$12 + $$13 * $$13 <= $$9 * $$9) {
            $$5 |= this.a($$1, $$3, $$4, $$7, $$8, $$10.g($$11));
         }
      }

      return $$5;
   }

   protected boolean a(ejs $$0, dio $$1, azs $$2, int $$3, int $$4, jj.a $$5) {
      boolean $$6 = false;
      boolean $$7 = false;

      for (int $$8 = $$3; $$8 > $$4; $$8--) {
         $$5.q($$8);
         if ($$0.b().test($$1, $$5)) {
            dym $$9 = $$0.a().a($$1, $$2, $$5);
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
