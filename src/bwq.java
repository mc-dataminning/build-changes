import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public interface bwq {
   void a(bwn var1, cyy var2);

   cyy a(bwn var1);

   void a(bwn var1, float var2);

   default void a(bwp $$0, ezc $$1) {
      this.a($$0.a(), $$1, $$0.b());
   }

   default void a(alf<eze> $$0, ezc $$1, Map<bwn, Float> $$2) {
      this.a($$0, $$1, 0L, $$2);
   }

   default void a(alf<eze> $$0, ezc $$1, long $$2, Map<bwn, Float> $$3) {
      eze $$4 = $$1.a().p().bc().b($$0);
      if ($$4 != eze.a) {
         List<cyy> $$5 = $$4.a($$1, $$2);
         List<bwn> $$6 = new ArrayList<>();

         for (cyy $$7 : $$5) {
            bwn $$8 = this.a($$7, $$6);
            if ($$8 != null) {
               cyy $$9 = $$8.a($$7);
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
   default bwn a(cyy $$0, List<bwn> $$1) {
      if ($$0.f()) {
         return null;
      } else {
         dhh $$2 = $$0.a(kj.D);
         if ($$2 != null) {
            bwn $$3 = $$2.b();
            if (!$$1.contains($$3)) {
               return $$3;
            }
         } else if (!$$1.contains(bwn.a)) {
            return bwn.a;
         }

         return null;
      }
   }
}
