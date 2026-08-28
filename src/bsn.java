import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public interface bsn {
   void a(bsk var1, cua var2);

   cua a(bsk var1);

   void a(bsk var1, float var2);

   default void a(bsm $$0, eqr $$1) {
      this.a($$0.a(), $$1, $$0.b());
   }

   default void a(akj<eqt> $$0, eqr $$1, Map<bsk, Float> $$2) {
      this.a($$0, $$1, 0L, $$2);
   }

   default void a(akj<eqt> $$0, eqr $$1, long $$2, Map<bsk, Float> $$3) {
      if (!$$0.equals(eqk.a)) {
         eqt $$4 = $$1.a().o().be().b($$0);
         if ($$4 != eqt.a) {
            List<cua> $$5 = $$4.a($$1, $$2);
            List<bsk> $$6 = new ArrayList<>();

            for (cua $$7 : $$5) {
               bsk $$8 = this.a($$7, $$6);
               if ($$8 != null) {
                  cua $$9 = $$8.f() ? $$7.c(1) : $$7;
                  this.a($$8, $$9);
                  Float $$10 = $$3.get($$8);
                  if ($$10 != null) {
                     this.a($$8, $$10);
                  }

                  $$6.add($$8);
               }
            }
         }
      }
   }

   @Nullable
   default bsk a(cua $$0, List<bsk> $$1) {
      if ($$0.e()) {
         return null;
      } else {
         ctc $$2 = ctc.c_($$0);
         if ($$2 != null) {
            bsk $$3 = $$2.m();
            if (!$$1.contains($$3)) {
               return $$3;
            }
         } else if (!$$1.contains(bsk.a)) {
            return bsk.a;
         }

         return null;
      }
   }
}
