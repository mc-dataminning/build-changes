import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public interface bvu {
   void a(bvr var1, cxo var2);

   cxo a(bvr var1);

   void a(bvr var1, float var2);

   default void a(bvt $$0, ewr $$1) {
      this.a($$0.a(), $$1, $$0.b());
   }

   default void a(aly<ewt> $$0, ewr $$1, Map<bvr, Float> $$2) {
      this.a($$0, $$1, 0L, $$2);
   }

   default void a(aly<ewt> $$0, ewr $$1, long $$2, Map<bvr, Float> $$3) {
      ewt $$4 = $$1.a().p().bc().b($$0);
      if ($$4 != ewt.a) {
         List<cxo> $$5 = $$4.a($$1, $$2);
         List<bvr> $$6 = new ArrayList<>();

         for (cxo $$7 : $$5) {
            bvr $$8 = this.a($$7, $$6);
            if ($$8 != null) {
               cxo $$9 = $$8.a($$7);
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
   default bvr a(cxo $$0, List<bvr> $$1) {
      if ($$0.f()) {
         return null;
      } else {
         dft $$2 = $$0.a(ku.D);
         if ($$2 != null) {
            bvr $$3 = $$2.a();
            if (!$$1.contains($$3)) {
               return $$3;
            }
         } else if (!$$1.contains(bvr.a)) {
            return bvr.a;
         }

         return null;
      }
   }
}
