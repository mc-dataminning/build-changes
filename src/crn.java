import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class crn extends cre {
   private static final Logger a = LogUtils.getLogger();

   public crn(cre.a $$0) {
      super($$0);
   }

   @Override
   public bob<crj> a(cyx $$0, cjt $$1, bnz $$2) {
      crj $$3 = $$1.b($$2);
      if (!$$1.fM()) {
         $$1.a($$2, crj.i);
      }

      List<ajt> $$4 = $$3.a(jp.H, List.of());
      if ($$4.isEmpty()) {
         return bob.d($$3);
      } else {
         if (!$$0.B) {
            cvm $$5 = $$0.o().aJ();
            List<cvl<?>> $$6 = new ArrayList<>($$4.size());

            for (ajt $$7 : $$4) {
               Optional<cvl<?>> $$8 = $$5.a($$7);
               if (!$$8.isPresent()) {
                  a.error("Invalid recipe: {}", $$7);
                  return bob.d($$3);
               }

               $$6.add($$8.get());
            }

            $$1.a($$6);
            $$1.b(auw.c.b(this));
         }

         return bob.a($$3, $$0.x_());
      }
   }
}
