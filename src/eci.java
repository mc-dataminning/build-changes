import com.mojang.serialization.Codec;

public class eci extends ebd {
   public eci(Codec<eeg> $$0) {
      super($$0);
   }

   @Override
   protected void a(dcv $$0, ayv $$1, jd $$2, int $$3, jd.a $$4, eeg $$5) {
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
                  dta $$19 = $$5.b.a($$1, $$2);
                  if ($$19.b(djt.e) && $$19.b(djt.c) && $$19.b(djt.b) && $$19.b(djt.d)) {
                     $$19 = $$19.a(djt.e, Boolean.valueOf($$15))
                        .a(djt.c, Boolean.valueOf($$16))
                        .a(djt.b, Boolean.valueOf($$17))
                        .a(djt.d, Boolean.valueOf($$18));
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
