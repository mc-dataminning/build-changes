import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public interface buc {
   void a(btz var1, cvs var2);

   cvs a(btz var1);

   void a(btz var1, float var2);

   default void a(bub $$0, eto $$1) {
      this.a($$0.a(), $$1, $$0.b());
   }

   default void a(ald<etq> $$0, eto $$1, Map<btz, Float> $$2) {
      this.a($$0, $$1, 0L, $$2);
   }

   default void a(ald<etq> $$0, eto $$1, long $$2, Map<btz, Float> $$3) {
      etq $$4 = $$1.a().o().bd().b($$0);
      if ($$4 != etq.a) {
         List<cvs> $$5 = $$4.a($$1, $$2);
         List<btz> $$6 = new ArrayList<>();

         for (cvs $$7 : $$5) {
            btz $$8 = this.a($$7, $$6);
            if ($$8 != null) {
               cvs $$9 = $$8.a($$7);
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
   default btz a(cvs $$0, List<btz> $$1) {
      if ($$0.f()) {
         return null;
      } else {
         cuv $$2 = cuv.c_($$0);
         if ($$2 != null) {
            btz $$3 = $$2.l();
            if (!$$1.contains($$3)) {
               return $$3;
            }
         } else if (!$$1.contains(btz.a)) {
            return btz.a;
         }

         return null;
      }
   }
}
