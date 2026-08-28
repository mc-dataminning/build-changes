import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public interface bvv {
   void a(bvs var1, cxp var2);

   cxp a(bvs var1);

   void a(bvs var1, float var2);

   default void a(bvu $$0, ews $$1) {
      this.a($$0.a(), $$1, $$0.b());
   }

   default void a(aly<ewu> $$0, ews $$1, Map<bvs, Float> $$2) {
      this.a($$0, $$1, 0L, $$2);
   }

   default void a(aly<ewu> $$0, ews $$1, long $$2, Map<bvs, Float> $$3) {
      ewu $$4 = $$1.a().p().bc().b($$0);
      if ($$4 != ewu.a) {
         List<cxp> $$5 = $$4.a($$1, $$2);
         List<bvs> $$6 = new ArrayList<>();

         for (cxp $$7 : $$5) {
            bvs $$8 = this.a($$7, $$6);
            if ($$8 != null) {
               cxp $$9 = $$8.a($$7);
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
   default bvs a(cxp $$0, List<bvs> $$1) {
      if ($$0.f()) {
         return null;
      } else {
         dfu $$2 = $$0.a(ku.D);
         if ($$2 != null) {
            bvs $$3 = $$2.a();
            if (!$$1.contains($$3)) {
               return $$3;
            }
         } else if (!$$1.contains(bvs.a)) {
            return bvs.a;
         }

         return null;
      }
   }
}
