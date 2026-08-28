import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public interface buw {
   void a(but var1, cwm var2);

   cwm a(but var1);

   void a(but var1, float var2);

   default void a(buv $$0, euq $$1) {
      this.a($$0.a(), $$1, $$0.b());
   }

   default void a(ali<eus> $$0, euq $$1, Map<but, Float> $$2) {
      this.a($$0, $$1, 0L, $$2);
   }

   default void a(ali<eus> $$0, euq $$1, long $$2, Map<but, Float> $$3) {
      eus $$4 = $$1.a().p().bc().b($$0);
      if ($$4 != eus.a) {
         List<cwm> $$5 = $$4.a($$1, $$2);
         List<but> $$6 = new ArrayList<>();

         for (cwm $$7 : $$5) {
            but $$8 = this.a($$7, $$6);
            if ($$8 != null) {
               cwm $$9 = $$8.a($$7);
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
   default but a(cwm $$0, List<but> $$1) {
      if ($$0.f()) {
         return null;
      } else {
         ddy $$2 = $$0.a(ku.D);
         if ($$2 != null) {
            but $$3 = $$2.a();
            if (!$$1.contains($$3)) {
               return $$3;
            }
         } else if (!$$1.contains(but.a)) {
            return but.a;
         }

         return null;
      }
   }
}
