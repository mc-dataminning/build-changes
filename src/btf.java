import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public interface btf {
   void a(btc var1, cuq var2);

   cuq a(btc var1);

   void a(btc var1, float var2);

   default void a(bte $$0, eqm $$1) {
      this.a($$0.a(), $$1, $$0.b());
   }

   default void a(ale<eqo> $$0, eqm $$1, Map<btc, Float> $$2) {
      this.a($$0, $$1, 0L, $$2);
   }

   default void a(ale<eqo> $$0, eqm $$1, long $$2, Map<btc, Float> $$3) {
      if (!$$0.equals(eqf.a)) {
         eqo $$4 = $$1.a().o().be().b($$0);
         if ($$4 != eqo.a) {
            List<cuq> $$5 = $$4.a($$1, $$2);
            List<btc> $$6 = new ArrayList<>();

            for (cuq $$7 : $$5) {
               btc $$8 = this.a($$7, $$6);
               if ($$8 != null) {
                  cuq $$9 = $$8.f() ? $$7.c(1) : $$7;
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
   default btc a(cuq $$0, List<btc> $$1) {
      if ($$0.e()) {
         return null;
      } else {
         cts $$2 = cts.c_($$0);
         if ($$2 != null) {
            btc $$3 = $$2.m();
            if (!$$1.contains($$3)) {
               return $$3;
            }
         } else if (!$$1.contains(btc.a)) {
            return btc.a;
         }

         return null;
      }
   }
}
