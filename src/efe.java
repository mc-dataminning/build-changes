import com.mojang.serialization.Codec;

public class efe extends edy {
   public efe(Codec<ehc> $$0) {
      super($$0);
   }

   @Override
   protected void a(dfn $$0, azu $$1, jh $$2, int $$3, jh.a $$4, ehc $$5) {
      int $$6 = $$5.d;

      for (int $$7 = -$$6; $$7 <= $$6; $$7++) {
         for (int $$8 = -$$6; $$8 <= $$6; $$8++) {
            boolean $$9 = $$7 == -$$6;
            boolean $$10 = $$7 == $$6;
            boolean $$11 = $$8 == -$$6;
            boolean $$12 = $$8 == $$6;
            boolean $$13 = $$9 || $$10;
            boolean $$14 = $$11 || $$12;
            if (!$$13 || !$$14) {
               $$4.a($$2, $$7, $$3, $$8);
               if (!$$0.a_($$4).s()) {
                  boolean $$15 = $$9 || $$14 && $$7 == 1 - $$6;
                  boolean $$16 = $$10 || $$14 && $$7 == $$6 - 1;
                  boolean $$17 = $$11 || $$13 && $$8 == 1 - $$6;
                  boolean $$18 = $$12 || $$13 && $$8 == $$6 - 1;
                  dvv $$19 = $$5.b.a($$1, $$2);
                  if ($$19.b(dmm.e) && $$19.b(dmm.c) && $$19.b(dmm.b) && $$19.b(dmm.d)) {
                     $$19 = $$19.b(dmm.e, Boolean.valueOf($$15))
                        .b(dmm.c, Boolean.valueOf($$16))
                        .b(dmm.b, Boolean.valueOf($$17))
                        .b(dmm.d, Boolean.valueOf($$18));
                  }

                  this.a($$0, $$4, $$19);
               }
            }
         }
      }
   }

   @Override
   protected int a(int $$0, int $$1, int $$2, int $$3) {
      return $$3 <= 3 ? 0 : $$2;
   }
}
