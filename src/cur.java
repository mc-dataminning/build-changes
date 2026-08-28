import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class cur extends cui {
   private static final Logger a = LogUtils.getLogger();

   public cur(cui.a $$0) {
      super($$0);
   }

   @Override
   public bqt<cun> a(dbw $$0, cmv $$1, bqr $$2) {
      cun $$3 = $$1.b($$2);
      if (!$$1.fP()) {
         $$1.a($$2, cun.l);
      }

      List<ale> $$4 = $$3.a(km.Q, List.of());
      if ($$4.isEmpty()) {
         return bqt.d($$3);
      } else {
         if (!$$0.B) {
            cyw $$5 = $$0.o().aJ();
            List<cyv<?>> $$6 = new ArrayList<>($$4.size());

            for (ale $$7 : $$4) {
               Optional<cyv<?>> $$8 = $$5.a($$7);
               if (!$$8.isPresent()) {
                  a.error("Invalid recipe: {}", $$7);
                  return bqt.d($$3);
               }

               $$6.add($$8.get());
            }

            $$1.a($$6);
            $$1.b(awj.c.b(this));
         }

         return bqt.a($$3, $$0.x_());
      }
   }
}
