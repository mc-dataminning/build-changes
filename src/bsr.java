import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public interface bsr {
   void a(bso var1, cud var2);

   cud a(bso var1);

   void a(bso var1, float var2);

   default void a(bsq $$0, eqz $$1) {
      this.a($$0.a(), $$1, $$0.b());
   }

   default void a(akj<erb> $$0, eqz $$1, Map<bso, Float> $$2) {
      this.a($$0, $$1, 0L, $$2);
   }

   default void a(akj<erb> $$0, eqz $$1, long $$2, Map<bso, Float> $$3) {
      if (!$$0.equals(eqs.a)) {
         erb $$4 = $$1.a().o().bf().b($$0);
         if ($$4 != erb.a) {
            List<cud> $$5 = $$4.a($$1, $$2);
            List<bso> $$6 = new ArrayList<>();

            for (cud $$7 : $$5) {
               bso $$8 = this.a($$7, $$6);
               if ($$8 != null) {
                  cud $$9 = $$8.a($$7);
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
   default bso a(cud $$0, List<bso> $$1) {
      if ($$0.e()) {
         return null;
      } else {
         ctf $$2 = ctf.c_($$0);
         if ($$2 != null) {
            bso $$3 = $$2.m();
            if (!$$1.contains($$3)) {
               return $$3;
            }
         } else if (!$$1.contains(bso.a)) {
            return bso.a;
         }

         return null;
      }
   }
}
