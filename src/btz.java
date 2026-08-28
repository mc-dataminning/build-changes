import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public interface btz {
   void a(btw var1, cvp var2);

   cvp a(btw var1);

   void a(btw var1, float var2);

   default void a(bty $$0, etk $$1) {
      this.a($$0.a(), $$1, $$0.b());
   }

   default void a(alb<etm> $$0, etk $$1, Map<btw, Float> $$2) {
      this.a($$0, $$1, 0L, $$2);
   }

   default void a(alb<etm> $$0, etk $$1, long $$2, Map<btw, Float> $$3) {
      if (!$$0.equals(etd.a)) {
         etm $$4 = $$1.a().o().bd().b($$0);
         if ($$4 != etm.a) {
            List<cvp> $$5 = $$4.a($$1, $$2);
            List<btw> $$6 = new ArrayList<>();

            for (cvp $$7 : $$5) {
               btw $$8 = this.a($$7, $$6);
               if ($$8 != null) {
                  cvp $$9 = $$8.a($$7);
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
   default btw a(cvp $$0, List<btw> $$1) {
      if ($$0.f()) {
         return null;
      } else {
         cus $$2 = cus.c_($$0);
         if ($$2 != null) {
            btw $$3 = $$2.l();
            if (!$$1.contains($$3)) {
               return $$3;
            }
         } else if (!$$1.contains(btw.a)) {
            return btw.a;
         }

         return null;
      }
   }
}
