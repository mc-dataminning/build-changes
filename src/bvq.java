import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public interface bvq {
   void a(bvn var1, cxk var2);

   cxk a(bvn var1);

   void a(bvn var1, float var2);

   default void a(bvp $$0, ewk $$1) {
      this.a($$0.a(), $$1, $$0.b());
   }

   default void a(aly<ewm> $$0, ewk $$1, Map<bvn, Float> $$2) {
      this.a($$0, $$1, 0L, $$2);
   }

   default void a(aly<ewm> $$0, ewk $$1, long $$2, Map<bvn, Float> $$3) {
      ewm $$4 = $$1.a().p().bc().b($$0);
      if ($$4 != ewm.a) {
         List<cxk> $$5 = $$4.a($$1, $$2);
         List<bvn> $$6 = new ArrayList<>();

         for (cxk $$7 : $$5) {
            bvn $$8 = this.a($$7, $$6);
            if ($$8 != null) {
               cxk $$9 = $$8.a($$7);
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
   default bvn a(cxk $$0, List<bvn> $$1) {
      if ($$0.f()) {
         return null;
      } else {
         dfm $$2 = $$0.a(ku.D);
         if ($$2 != null) {
            bvn $$3 = $$2.a();
            if (!$$1.contains($$3)) {
               return $$3;
            }
         } else if (!$$1.contains(bvn.a)) {
            return bvn.a;
         }

         return null;
      }
   }
}
