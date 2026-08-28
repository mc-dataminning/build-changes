import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public interface buu {
   void a(bur var1, cwn var2);

   cwn a(bur var1);

   void a(bur var1, float var2);

   default void a(but $$0, evs $$1) {
      this.a($$0.a(), $$1, $$0.b());
   }

   default void a(akt<evu> $$0, evs $$1, Map<bur, Float> $$2) {
      this.a($$0, $$1, 0L, $$2);
   }

   default void a(akt<evu> $$0, evs $$1, long $$2, Map<bur, Float> $$3) {
      evu $$4 = $$1.a().p().bc().b($$0);
      if ($$4 != evu.a) {
         List<cwn> $$5 = $$4.a($$1, $$2);
         List<bur> $$6 = new ArrayList<>();

         for (cwn $$7 : $$5) {
            bur $$8 = this.a($$7, $$6);
            if ($$8 != null) {
               cwn $$9 = $$8.a($$7);
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
   default bur a(cwn $$0, List<bur> $$1) {
      if ($$0.f()) {
         return null;
      } else {
         des $$2 = $$0.a(kv.D);
         if ($$2 != null) {
            bur $$3 = $$2.a();
            if (!$$1.contains($$3)) {
               return $$3;
            }
         } else if (!$$1.contains(bur.a)) {
            return bur.a;
         }

         return null;
      }
   }
}
