import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public interface btg {
   void a(btd var1, cur var2);

   cur a(btd var1);

   void a(btd var1, float var2);

   default void a(btf $$0, eqn $$1) {
      this.a($$0.a(), $$1, $$0.b());
   }

   default void a(ale<eqp> $$0, eqn $$1, Map<btd, Float> $$2) {
      this.a($$0, $$1, 0L, $$2);
   }

   default void a(ale<eqp> $$0, eqn $$1, long $$2, Map<btd, Float> $$3) {
      if (!$$0.equals(eqg.a)) {
         eqp $$4 = $$1.a().o().be().b($$0);
         if ($$4 != eqp.a) {
            List<cur> $$5 = $$4.a($$1, $$2);
            List<btd> $$6 = new ArrayList<>();

            for (cur $$7 : $$5) {
               btd $$8 = this.a($$7, $$6);
               if ($$8 != null) {
                  cur $$9 = $$8.f() ? $$7.c(1) : $$7;
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
   default btd a(cur $$0, List<btd> $$1) {
      if ($$0.e()) {
         return null;
      } else {
         ctt $$2 = ctt.c_($$0);
         if ($$2 != null) {
            btd $$3 = $$2.m();
            if (!$$1.contains($$3)) {
               return $$3;
            }
         } else if (!$$1.contains(btd.a)) {
            return btd.a;
         }

         return null;
      }
   }
}
