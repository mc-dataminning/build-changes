import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class cus extends cuj {
   private static final Logger a = LogUtils.getLogger();

   public cus(cuj.a $$0) {
      super($$0);
   }

   @Override
   public bqu<cuo> a(dbx $$0, cmw $$1, bqs $$2) {
      cuo $$3 = $$1.b($$2);
      if (!$$1.fP()) {
         $$1.a($$2, cuo.l);
      }

      List<ale> $$4 = $$3.a(km.R, List.of());
      if ($$4.isEmpty()) {
         return bqu.d($$3);
      } else {
         if (!$$0.B) {
            cyx $$5 = $$0.o().aJ();
            List<cyw<?>> $$6 = new ArrayList<>($$4.size());

            for (ale $$7 : $$4) {
               Optional<cyw<?>> $$8 = $$5.a($$7);
               if (!$$8.isPresent()) {
                  a.error("Invalid recipe: {}", $$7);
                  return bqu.d($$3);
               }

               $$6.add($$8.get());
            }

            $$1.a($$6);
            $$1.b(awj.c.b(this));
         }

         return bqu.a($$3, $$0.x_());
      }
   }
}
