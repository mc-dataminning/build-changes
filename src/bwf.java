import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public interface bwf {
   void a(bwc var1, cxy var2);

   cxy a(bwc var1);

   void a(bwc var1, float var2);

   default void a(bwe $$0, exo $$1) {
      this.a($$0.a(), $$1, $$0.b());
   }

   default void a(alc<exq> $$0, exo $$1, Map<bwc, Float> $$2) {
      this.a($$0, $$1, 0L, $$2);
   }

   default void a(alc<exq> $$0, exo $$1, long $$2, Map<bwc, Float> $$3) {
      exq $$4 = $$1.a().p().bc().b($$0);
      if ($$4 != exq.a) {
         List<cxy> $$5 = $$4.a($$1, $$2);
         List<bwc> $$6 = new ArrayList<>();

         for (cxy $$7 : $$5) {
            bwc $$8 = this.a($$7, $$6);
            if ($$8 != null) {
               cxy $$9 = $$8.a($$7);
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
   default bwc a(cxy $$0, List<bwc> $$1) {
      if ($$0.f()) {
         return null;
      } else {
         dgc $$2 = $$0.a(kx.E);
         if ($$2 != null) {
            bwc $$3 = $$2.b();
            if (!$$1.contains($$3)) {
               return $$3;
            }
         } else if (!$$1.contains(bwc.a)) {
            return bwc.a;
         }

         return null;
      }
   }
}
