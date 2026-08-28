import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public interface bwn {
   void a(bwk var1, cys var2);

   cys a(bwk var1);

   void a(bwk var1, float var2);

   default void a(bwm $$0, eyq $$1) {
      this.a($$0.a(), $$1, $$0.b());
   }

   default void a(ald<eys> $$0, eyq $$1, Map<bwk, Float> $$2) {
      this.a($$0, $$1, 0L, $$2);
   }

   default void a(ald<eys> $$0, eyq $$1, long $$2, Map<bwk, Float> $$3) {
      eys $$4 = $$1.a().p().bc().b($$0);
      if ($$4 != eys.a) {
         List<cys> $$5 = $$4.a($$1, $$2);
         List<bwk> $$6 = new ArrayList<>();

         for (cys $$7 : $$5) {
            bwk $$8 = this.a($$7, $$6);
            if ($$8 != null) {
               cys $$9 = $$8.a($$7);
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

   @Nullable
   default bwk a(cys $$0, List<bwk> $$1) {
      if ($$0.f()) {
         return null;
      } else {
         dhb $$2 = $$0.a(kj.D);
         if ($$2 != null) {
            bwk $$3 = $$2.b();
            if (!$$1.contains($$3)) {
               return $$3;
            }
         } else if (!$$1.contains(bwk.a)) {
            return bwk.a;
         }

         return null;
      }
   }
}
