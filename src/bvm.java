import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public interface bvm {
   void a(bvj var1, cxh var2);

   cxh a(bvj var1);

   void a(bvj var1, float var2);

   default void a(bvl $$0, ewr $$1) {
      this.a($$0.a(), $$1, $$0.b());
   }

   default void a(akt<ewt> $$0, ewr $$1, Map<bvj, Float> $$2) {
      this.a($$0, $$1, 0L, $$2);
   }

   default void a(akt<ewt> $$0, ewr $$1, long $$2, Map<bvj, Float> $$3) {
      ewt $$4 = $$1.a().p().bc().b($$0);
      if ($$4 != ewt.a) {
         List<cxh> $$5 = $$4.a($$1, $$2);
         List<bvj> $$6 = new ArrayList<>();

         for (cxh $$7 : $$5) {
            bvj $$8 = this.a($$7, $$6);
            if ($$8 != null) {
               cxh $$9 = $$8.a($$7);
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
   default bvj a(cxh $$0, List<bvj> $$1) {
      if ($$0.f()) {
         return null;
      } else {
         dfm $$2 = $$0.a(kv.E);
         if ($$2 != null) {
            bvj $$3 = $$2.a();
            if (!$$1.contains($$3)) {
               return $$3;
            }
         } else if (!$$1.contains(bvj.a)) {
            return bvj.a;
         }

         return null;
      }
   }
}
