import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public interface btc {
   void a(bsz var1, cun var2);

   cun a(bsz var1);

   void a(bsz var1, float var2);

   default void a(btb $$0, eqj $$1) {
      this.a($$0.a(), $$1, $$0.b());
   }

   default void a(ald<eql> $$0, eqj $$1, Map<bsz, Float> $$2) {
      this.a($$0, $$1, 0L, $$2);
   }

   default void a(ald<eql> $$0, eqj $$1, long $$2, Map<bsz, Float> $$3) {
      if (!$$0.equals(eqc.a)) {
         eql $$4 = $$1.a().o().be().b($$0);
         if ($$4 != eql.a) {
            List<cun> $$5 = $$4.a($$1, $$2);
            List<bsz> $$6 = new ArrayList<>();

            for (cun $$7 : $$5) {
               bsz $$8 = this.a($$7, $$6);
               if ($$8 != null) {
                  cun $$9 = $$8.f() ? $$7.c(1) : $$7;
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
   default bsz a(cun $$0, List<bsz> $$1) {
      if ($$0.e()) {
         return null;
      } else {
         ctp $$2 = ctp.c_($$0);
         if ($$2 != null) {
            bsz $$3 = $$2.m();
            if (!$$1.contains($$3)) {
               return $$3;
            }
         } else if (!$$1.contains(bsz.a)) {
            return bsz.a;
         }

         return null;
      }
   }
}
