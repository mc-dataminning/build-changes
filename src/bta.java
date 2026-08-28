import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public interface bta {
   void a(bsx var1, cuo var2);

   cuo a(bsx var1);

   void a(bsx var1, float var2);

   default void a(bsz $$0, ero $$1) {
      this.a($$0.a(), $$1, $$0.b());
   }

   default void a(akp<erq> $$0, ero $$1, Map<bsx, Float> $$2) {
      this.a($$0, $$1, 0L, $$2);
   }

   default void a(akp<erq> $$0, ero $$1, long $$2, Map<bsx, Float> $$3) {
      if (!$$0.equals(erh.a)) {
         erq $$4 = $$1.a().o().be().b($$0);
         if ($$4 != erq.a) {
            List<cuo> $$5 = $$4.a($$1, $$2);
            List<bsx> $$6 = new ArrayList<>();

            for (cuo $$7 : $$5) {
               bsx $$8 = this.a($$7, $$6);
               if ($$8 != null) {
                  cuo $$9 = $$8.a($$7);
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
   default bsx a(cuo $$0, List<bsx> $$1) {
      if ($$0.e()) {
         return null;
      } else {
         ctq $$2 = ctq.c_($$0);
         if ($$2 != null) {
            bsx $$3 = $$2.m();
            if (!$$1.contains($$3)) {
               return $$3;
            }
         } else if (!$$1.contains(bsx.a)) {
            return bsx.a;
         }

         return null;
      }
   }
}
