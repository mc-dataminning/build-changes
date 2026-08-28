import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public interface btu {
   void a(btr var1, cvl var2);

   cvl a(btr var1);

   void a(btr var1, float var2);

   default void a(btt $$0, esw $$1) {
      this.a($$0.a(), $$1, $$0.b());
   }

   default void a(ala<esy> $$0, esw $$1, Map<btr, Float> $$2) {
      this.a($$0, $$1, 0L, $$2);
   }

   default void a(ala<esy> $$0, esw $$1, long $$2, Map<btr, Float> $$3) {
      if (!$$0.equals(esp.a)) {
         esy $$4 = $$1.a().o().bd().b($$0);
         if ($$4 != esy.a) {
            List<cvl> $$5 = $$4.a($$1, $$2);
            List<btr> $$6 = new ArrayList<>();

            for (cvl $$7 : $$5) {
               btr $$8 = this.a($$7, $$6);
               if ($$8 != null) {
                  cvl $$9 = $$8.a($$7);
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
   default btr a(cvl $$0, List<btr> $$1) {
      if ($$0.f()) {
         return null;
      } else {
         cun $$2 = cun.c_($$0);
         if ($$2 != null) {
            btr $$3 = $$2.m();
            if (!$$1.contains($$3)) {
               return $$3;
            }
         } else if (!$$1.contains(btr.a)) {
            return btr.a;
         }

         return null;
      }
   }
}
