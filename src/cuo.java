import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class cuo extends cuf {
   private static final Logger a = LogUtils.getLogger();

   public cuo(cuf.a $$0) {
      super($$0);
   }

   @Override
   public bqq<cuk> a(dbt $$0, cms $$1, bqo $$2) {
      cuk $$3 = $$1.b($$2);
      if (!$$1.fP()) {
         $$1.a($$2, cuk.l);
      }

      List<alb> $$4 = $$3.a(km.Q, List.of());
      if ($$4.isEmpty()) {
         return bqq.d($$3);
      } else {
         if (!$$0.B) {
            cyt $$5 = $$0.o().aJ();
            List<cys<?>> $$6 = new ArrayList<>($$4.size());

            for (alb $$7 : $$4) {
               Optional<cys<?>> $$8 = $$5.a($$7);
               if (!$$8.isPresent()) {
                  a.error("Invalid recipe: {}", $$7);
                  return bqq.d($$3);
               }

               $$6.add($$8.get());
            }

            $$1.a($$6);
            $$1.b(awg.c.b(this));
         }

         return bqq.a($$3, $$0.x_());
      }
   }
}
