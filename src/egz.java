import com.mojang.serialization.Codec;

public class egz extends efq {
   public egz(Codec<eiu> $$0) {
      super($$0);
   }

   @Override
   protected void a(dhb $$0, bam $$1, jh $$2, int $$3, jh.a $$4, eiu $$5) {
      for (int $$6 = $$3 - 3; $$6 <= $$3; $$6++) {
         int $$7 = $$6 < $$3 ? $$5.d : $$5.d - 1;
         int $$8 = $$5.d - 2;

         for (int $$9 = -$$7; $$9 <= $$7; $$9++) {
            for (int $$10 = -$$7; $$10 <= $$7; $$10++) {
               boolean $$11 = $$9 == -$$7;
               boolean $$12 = $$9 == $$7;
               boolean $$13 = $$10 == -$$7;
               boolean $$14 = $$10 == $$7;
               boolean $$15 = $$11 || $$12;
               boolean $$16 = $$13 || $$14;
               if ($$6 >= $$3 || $$15 != $$16) {
                  $$4.a($$2, $$9, $$6, $$10);
                  if (!$$0.a_($$4).s()) {
                     dxn $$17 = $$5.b.a($$1, $$2);
                     if ($$17.b(dod.e) && $$17.b(dod.c) && $$17.b(dod.b) && $$17.b(dod.d) && $$17.b(dod.f)) {
                        $$17 = $$17.b(dod.f, Boolean.valueOf($$6 >= $$3 - 1))
                           .b(dod.e, Boolean.valueOf($$9 < -$$8))
                           .b(dod.c, Boolean.valueOf($$9 > $$8))
                           .b(dod.b, Boolean.valueOf($$10 < -$$8))
                           .b(dod.d, Boolean.valueOf($$10 > $$8));
                     }

                     this.a($$0, $$4, $$17);
                  }
               }
            }
         }
      }
   }

   @Override
   protected int a(int $$0, int $$1, int $$2, int $$3) {
      int $$4 = 0;
      if ($$3 < $$1 && $$3 >= $$1 - 3) {
         $$4 = $$2;
      } else if ($$3 == $$1) {
         $$4 = $$2;
      }

      return $$4;
   }
}
