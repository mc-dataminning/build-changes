import com.mojang.serialization.Codec;

public class dua extends dsv {
   public dua(Codec<dvy> $$0) {
      super($$0);
   }

   @Override
   protected void a(cvo $$0, awo $$1, hz $$2, int $$3, hz.a $$4, dvy $$5) {
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
                  dlf $$19 = $$5.b.a($$1, $$2);
                  if ($$19.b(dck.e) && $$19.b(dck.c) && $$19.b(dck.b) && $$19.b(dck.d)) {
                     $$19 = $$19.a(dck.e, Boolean.valueOf($$15))
                        .a(dck.c, Boolean.valueOf($$16))
                        .a(dck.b, Boolean.valueOf($$17))
                        .a(dck.d, Boolean.valueOf($$18));
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
