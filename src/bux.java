import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public interface bux {
   void a(buu var1, cwq var2);

   cwq a(buu var1);

   void a(buu var1, float var2);

   default void a(buw $$0, evv $$1) {
      this.a($$0.a(), $$1, $$0.b());
   }

   default void a(aku<evx> $$0, evv $$1, Map<buu, Float> $$2) {
      this.a($$0, $$1, 0L, $$2);
   }

   default void a(aku<evx> $$0, evv $$1, long $$2, Map<buu, Float> $$3) {
      evx $$4 = $$1.a().p().bc().b($$0);
      if ($$4 != evx.a) {
         List<cwq> $$5 = $$4.a($$1, $$2);
         List<buu> $$6 = new ArrayList<>();

         for (cwq $$7 : $$5) {
            buu $$8 = this.a($$7, $$6);
            if ($$8 != null) {
               cwq $$9 = $$8.a($$7);
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
   default buu a(cwq $$0, List<buu> $$1) {
      if ($$0.f()) {
         return null;
      } else {
         dev $$2 = $$0.a(kv.D);
         if ($$2 != null) {
            buu $$3 = $$2.a();
            if (!$$1.contains($$3)) {
               return $$3;
            }
         } else if (!$$1.contains(buu.a)) {
            return buu.a;
         }

         return null;
      }
   }
}
