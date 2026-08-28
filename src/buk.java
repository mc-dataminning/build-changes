import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public interface buk {
   void a(buh var1, cvx var2);

   cvx a(buh var1);

   void a(buh var1, float var2);

   default void a(buj $$0, etz $$1) {
      this.a($$0.a(), $$1, $$0.b());
   }

   default void a(alg<eub> $$0, etz $$1, Map<buh, Float> $$2) {
      this.a($$0, $$1, 0L, $$2);
   }

   default void a(alg<eub> $$0, etz $$1, long $$2, Map<buh, Float> $$3) {
      eub $$4 = $$1.a().o().bd().b($$0);
      if ($$4 != eub.a) {
         List<cvx> $$5 = $$4.a($$1, $$2);
         List<buh> $$6 = new ArrayList<>();

         for (cvx $$7 : $$5) {
            buh $$8 = this.a($$7, $$6);
            if ($$8 != null) {
               cvx $$9 = $$8.a($$7);
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
   default buh a(cvx $$0, List<buh> $$1) {
      if ($$0.f()) {
         return null;
      } else {
         ddh $$2 = $$0.a(kt.D);
         if ($$2 != null) {
            buh $$3 = $$2.a();
            if (!$$1.contains($$3)) {
               return $$3;
            }
         } else if (!$$1.contains(buh.a)) {
            return buh.a;
         }

         return null;
      }
   }
}
