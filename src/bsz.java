import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public interface bsz {
   void a(bsw var1, cuk var2);

   cuk a(bsw var1);

   void a(bsw var1, float var2);

   default void a(bsy $$0, eqg $$1) {
      this.a($$0.a(), $$1, $$0.b());
   }

   default void a(ala<eqi> $$0, eqg $$1, Map<bsw, Float> $$2) {
      this.a($$0, $$1, 0L, $$2);
   }

   default void a(ala<eqi> $$0, eqg $$1, long $$2, Map<bsw, Float> $$3) {
      if (!$$0.equals(epz.a)) {
         eqi $$4 = $$1.a().o().be().b($$0);
         if ($$4 != eqi.a) {
            List<cuk> $$5 = $$4.a($$1, $$2);
            List<bsw> $$6 = new ArrayList<>();

            for (cuk $$7 : $$5) {
               bsw $$8 = this.a($$7, $$6);
               if ($$8 != null) {
                  cuk $$9 = $$8.f() ? $$7.c(1) : $$7;
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
   default bsw a(cuk $$0, List<bsw> $$1) {
      if ($$0.e()) {
         return null;
      } else {
         ctm $$2 = ctm.c_($$0);
         if ($$2 != null) {
            bsw $$3 = $$2.m();
            if (!$$1.contains($$3)) {
               return $$3;
            }
         } else if (!$$1.contains(bsw.a)) {
            return bsw.a;
         }

         return null;
      }
   }
}
