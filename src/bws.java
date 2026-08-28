import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public interface bws {
   void a(bwp var1, czd var2);

   czd a(bwp var1);

   void a(bwp var1, float var2);

   default void a(bwr $$0, ezk $$1) {
      this.a($$0.a(), $$1, $$0.b());
   }

   default void a(alf<ezm> $$0, ezk $$1, Map<bwp, Float> $$2) {
      this.a($$0, $$1, 0L, $$2);
   }

   default void a(alf<ezm> $$0, ezk $$1, long $$2, Map<bwp, Float> $$3) {
      ezm $$4 = $$1.a().p().bc().b($$0);
      if ($$4 != ezm.a) {
         List<czd> $$5 = $$4.a($$1, $$2);
         List<bwp> $$6 = new ArrayList<>();

         for (czd $$7 : $$5) {
            bwp $$8 = this.a($$7, $$6);
            if ($$8 != null) {
               czd $$9 = $$8.a($$7);
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
   default bwp a(czd $$0, List<bwp> $$1) {
      if ($$0.f()) {
         return null;
      } else {
         dhm $$2 = $$0.a(kj.D);
         if ($$2 != null) {
            bwp $$3 = $$2.b();
            if (!$$1.contains($$3)) {
               return $$3;
            }
         } else if (!$$1.contains(bwp.a)) {
            return bwp.a;
         }

         return null;
      }
   }
}
