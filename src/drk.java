import com.mojang.serialization.Codec;

public class drk extends dqf {
   public drk(Codec<dti> $$0) {
      super($$0);
   }

   @Override
   protected void a(csz $$0, auf $$1, hv $$2, int $$3, hv.a $$4, dti $$5) {
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
                  dip $$19 = $$5.b.a($$1, $$2);
                  if ($$19.b(czv.e) && $$19.b(czv.c) && $$19.b(czv.b) && $$19.b(czv.d)) {
                     $$19 = $$19.a(czv.e, Boolean.valueOf($$15))
                        .a(czv.c, Boolean.valueOf($$16))
                        .a(czv.b, Boolean.valueOf($$17))
                        .a(czv.d, Boolean.valueOf($$18));
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
