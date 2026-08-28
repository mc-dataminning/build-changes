import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public interface bwv {
   void a(bws var1, czn var2);

   czn a(bws var1);

   void a(bws var1, float var2);

   default void a(bwu $$0, ezw $$1) {
      this.a($$0.a(), $$1, $$0.b());
   }

   default void a(alf<ezy> $$0, ezw $$1, Map<bws, Float> $$2) {
      this.a($$0, $$1, 0L, $$2);
   }

   default void a(alf<ezy> $$0, ezw $$1, long $$2, Map<bws, Float> $$3) {
      ezy $$4 = $$1.a().p().bc().b($$0);
      if ($$4 != ezy.f) {
         List<czn> $$5 = $$4.a($$1, $$2);
         List<bws> $$6 = new ArrayList<>();

         for (czn $$7 : $$5) {
            bws $$8 = this.a($$7, $$6);
            if ($$8 != null) {
               czn $$9 = $$8.a($$7);
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
   default bws a(czn $$0, List<bws> $$1) {
      if ($$0.f()) {
         return null;
      } else {
         dhw $$2 = $$0.a(kk.D);
         if ($$2 != null) {
            bws $$3 = $$2.b();
            if (!$$1.contains($$3)) {
               return $$3;
            }
         } else if (!$$1.contains(bws.a)) {
            return bws.a;
         }

         return null;
      }
   }
}
