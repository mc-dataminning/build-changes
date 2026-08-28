import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public interface bup {
   void a(bum var1, cwb var2);

   cwb a(bum var1);

   void a(bum var1, float var2);

   default void a(buo $$0, euf $$1) {
      this.a($$0.a(), $$1, $$0.b());
   }

   default void a(alh<euh> $$0, euf $$1, Map<bum, Float> $$2) {
      this.a($$0, $$1, 0L, $$2);
   }

   default void a(alh<euh> $$0, euf $$1, long $$2, Map<bum, Float> $$3) {
      euh $$4 = $$1.a().o().bc().b($$0);
      if ($$4 != euh.a) {
         List<cwb> $$5 = $$4.a($$1, $$2);
         List<bum> $$6 = new ArrayList<>();

         for (cwb $$7 : $$5) {
            bum $$8 = this.a($$7, $$6);
            if ($$8 != null) {
               cwb $$9 = $$8.a($$7);
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
   default bum a(cwb $$0, List<bum> $$1) {
      if ($$0.f()) {
         return null;
      } else {
         ddn $$2 = $$0.a(ku.D);
         if ($$2 != null) {
            bum $$3 = $$2.a();
            if (!$$1.contains($$3)) {
               return $$3;
            }
         } else if (!$$1.contains(bum.a)) {
            return bum.a;
         }

         return null;
      }
   }
}
