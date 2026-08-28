import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class cuh extends cty {
   private static final Logger a = LogUtils.getLogger();

   public cuh(cty.a $$0) {
      super($$0);
   }

   @Override
   public bqi<cud> a(dcg $$0, cml $$1, bqg $$2) {
      cud $$3 = $$1.b($$2);
      $$3.a(1, $$1);
      List<akk> $$4 = $$3.a(kn.R, List.of());
      if ($$4.isEmpty()) {
         return bqi.d($$3);
      } else {
         if (!$$0.B) {
            cyn $$5 = $$0.o().aK();
            List<cyl<?>> $$6 = new ArrayList<>($$4.size());

            for (akk $$7 : $$4) {
               Optional<cyl<?>> $$8 = $$5.a($$7);
               if (!$$8.isPresent()) {
                  a.error("Invalid recipe: {}", $$7);
                  return bqi.d($$3);
               }

               $$6.add($$8.get());
            }

            $$1.a($$6);
            $$1.b(avr.c.b(this));
         }

         return bqi.a($$3, $$0.x_());
      }
   }
}
