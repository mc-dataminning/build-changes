import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public interface btb {
   void a(bsy var1, cuq var2);

   cuq a(bsy var1);

   void a(bsy var1, float var2);

   default void a(bta $$0, ers $$1) {
      this.a($$0.a(), $$1, $$0.b());
   }

   default void a(akq<eru> $$0, ers $$1, Map<bsy, Float> $$2) {
      this.a($$0, $$1, 0L, $$2);
   }

   default void a(akq<eru> $$0, ers $$1, long $$2, Map<bsy, Float> $$3) {
      if (!$$0.equals(erl.a)) {
         eru $$4 = $$1.a().o().be().b($$0);
         if ($$4 != eru.a) {
            List<cuq> $$5 = $$4.a($$1, $$2);
            List<bsy> $$6 = new ArrayList<>();

            for (cuq $$7 : $$5) {
               bsy $$8 = this.a($$7, $$6);
               if ($$8 != null) {
                  cuq $$9 = $$8.a($$7);
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
   default bsy a(cuq $$0, List<bsy> $$1) {
      if ($$0.e()) {
         return null;
      } else {
         cts $$2 = cts.c_($$0);
         if ($$2 != null) {
            bsy $$3 = $$2.m();
            if (!$$1.contains($$3)) {
               return $$3;
            }
         } else if (!$$1.contains(bsy.a)) {
            return bsy.a;
         }

         return null;
      }
   }
}
