import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public interface bxr {
   void a(bxo var1, dak var2);

   dak a(bxo var1);

   void a(bxo var1, float var2);

   default void a(bxq $$0, faw $$1) {
      this.a($$0.a(), $$1, $$0.b());
   }

   default void a(alq<fay> $$0, faw $$1, Map<bxo, Float> $$2) {
      this.a($$0, $$1, 0L, $$2);
   }

   default void a(alq<fay> $$0, faw $$1, long $$2, Map<bxo, Float> $$3) {
      fay $$4 = $$1.a().p().bc().b($$0);
      if ($$4 != fay.f) {
         List<dak> $$5 = $$4.a($$1, $$2);
         List<bxo> $$6 = new ArrayList<>();

         for (dak $$7 : $$5) {
            bxo $$8 = this.a($$7, $$6);
            if ($$8 != null) {
               dak $$9 = $$8.a($$7);
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
   default bxo a(dak $$0, List<bxo> $$1) {
      if ($$0.f()) {
         return null;
      } else {
         dit $$2 = $$0.a(kl.D);
         if ($$2 != null) {
            bxo $$3 = $$2.b();
            if (!$$1.contains($$3)) {
               return $$3;
            }
         } else if (!$$1.contains(bxo.a)) {
            return bxo.a;
         }

         return null;
      }
   }
}
