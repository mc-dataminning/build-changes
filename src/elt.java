import com.mojang.serialization.Codec;

public class elt extends ekk<emw> {
   public elt(Codec<emw> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ekm<emw> $$0) {
      dkw $$1 = $$0.b();
      iv $$2 = $$0.e();
      iv.a $$3 = new iv.a();
      iv.a $$4 = new iv.a();

      for (int $$5 = 0; $$5 < 16; $$5++) {
         for (int $$6 = 0; $$6 < 16; $$6++) {
            int $$7 = $$2.u() + $$5;
            int $$8 = $$2.w() + $$6;
            int $$9 = $$1.a(ehd.a.e, $$7, $$8);
            $$3.d($$7, $$9, $$8);
            $$4.g($$3).c(jb.a, 1);
            dla $$10 = $$1.u($$3).a();
            if ($$10.a($$1, $$4, false)) {
               $$1.a($$4, dne.ee.m(), 2);
            }

            if ($$10.b($$1, $$3)) {
               $$1.a($$3, dne.ed.m(), 2);
               ebe $$11 = $$1.a_($$4);
               if ($$11.b(duw.c)) {
                  $$1.a($$4, $$11.b(duw.c, Boolean.valueOf(true)), 2);
               }
            }
         }
      }

      return true;
   }
}
