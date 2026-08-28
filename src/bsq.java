import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public interface bsq {
   void a(bsn var1, cuc var2);

   cuc a(bsn var1);

   void a(bsn var1, float var2);

   default void a(bsp $$0, eqx $$1) {
      this.a($$0.a(), $$1, $$0.b());
   }

   default void a(akj<eqz> $$0, eqx $$1, Map<bsn, Float> $$2) {
      this.a($$0, $$1, 0L, $$2);
   }

   default void a(akj<eqz> $$0, eqx $$1, long $$2, Map<bsn, Float> $$3) {
      if (!$$0.equals(eqq.a)) {
         eqz $$4 = $$1.a().o().bf().b($$0);
         if ($$4 != eqz.a) {
            List<cuc> $$5 = $$4.a($$1, $$2);
            List<bsn> $$6 = new ArrayList<>();

            for (cuc $$7 : $$5) {
               bsn $$8 = this.a($$7, $$6);
               if ($$8 != null) {
                  cuc $$9 = $$8.f() ? $$7.c(1) : $$7;
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
   default bsn a(cuc $$0, List<bsn> $$1) {
      if ($$0.e()) {
         return null;
      } else {
         cte $$2 = cte.c_($$0);
         if ($$2 != null) {
            bsn $$3 = $$2.m();
            if (!$$1.contains($$3)) {
               return $$3;
            }
         } else if (!$$1.contains(bsn.a)) {
            return bsn.a;
         }

         return null;
      }
   }
}
