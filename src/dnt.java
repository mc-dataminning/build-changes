import com.mojang.serialization.Codec;

public class dnt extends dmo {
   public dnt(Codec<dpr> $$0) {
      super($$0);
   }

   @Override
   protected void a(cpl $$0, art $$1, gv $$2, int $$3, gv.a $$4, dpr $$5) {
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
               if (!$$0.a_($$4).i($$0, $$4)) {
                  boolean $$15 = $$9 || $$14 && $$7 == 1 - $$6;
                  boolean $$16 = $$10 || $$14 && $$7 == $$6 - 1;
                  boolean $$17 = $$11 || $$13 && $$8 == 1 - $$6;
                  boolean $$18 = $$12 || $$13 && $$8 == $$6 - 1;
                  dey $$19 = $$5.b.a($$1, $$2);
                  if ($$19.b(cwe.d) && $$19.b(cwe.b) && $$19.b(cwe.a) && $$19.b(cwe.c)) {
                     $$19 = $$19.a(cwe.d, Boolean.valueOf($$15))
                        .a(cwe.b, Boolean.valueOf($$16))
                        .a(cwe.a, Boolean.valueOf($$17))
                        .a(cwe.c, Boolean.valueOf($$18));
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
