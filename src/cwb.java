import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class cwb extends cvn {
   private static final Logger a = LogUtils.getLogger();

   public cwb(cvn.a $$0) {
      super($$0);
   }

   @Override
   public brs a(dej $$0, cnx $$1, brr $$2) {
      cvs $$3 = $$1.b($$2);
      List<ale> $$4 = $$3.a(ks.X, List.of());
      $$3.a(1, $$1);
      if ($$4.isEmpty()) {
         return brs.d;
      } else {
         if (!$$0.B) {
            dao $$5 = $$0.o().aI();
            List<dam<?>> $$6 = new ArrayList<>($$4.size());

            for (ale $$7 : $$4) {
               Optional<dam<?>> $$8 = $$5.a($$7);
               if (!$$8.isPresent()) {
                  a.error("Invalid recipe: {}", $$7);
                  return brs.d;
               }

               $$6.add($$8.get());
            }

            $$1.a($$6);
            $$1.b(awq.c.b(this));
         }

         return brs.a;
      }
   }
}
