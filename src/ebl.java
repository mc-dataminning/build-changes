import com.mojang.serialization.Codec;

public class ebl extends eca<eed> {
   public ebl(Codec<eed> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ecc<eed> $$0) {
      ir $$1 = $$0.e();
      dcv $$2 = $$0.b();
      if (!$$2.u($$1)) {
         return false;
      } else {
         ayt $$3 = $$0.d();
         eed $$4 = $$0.f();

         for (int $$5 = 0; $$5 < 3; $$5++) {
            int $$6 = $$3.a(2) + 1;
            int $$7 = $$3.a(2) + 1;
            int $$8 = $$3.a(2) + 1;
            float $$9 = (float)($$6 + $$7 + $$8) * 0.333F + 0.5F;

            for (ir $$10 : ir.c($$1.b(-$$6, -$$7, -$$8), $$1.b($$6, $$7, $$8))) {
               if ($$10.j($$1) <= (double)($$9 * $$9)) {
                  $$2.a($$10, $$4.b, 3);
               }
            }

            $$1 = $$1.b(-1 + $$3.a(2), -$$3.a(2), -1 + $$3.a(2));
         }

         return true;
      }
   }
}
