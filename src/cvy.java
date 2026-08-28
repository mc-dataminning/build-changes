import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class cvy extends cvk {
   private static final Logger a = LogUtils.getLogger();

   public cvy(cvk.a $$0) {
      super($$0);
   }

   @Override
   public brp a(deg $$0, cnu $$1, bro $$2) {
      cvp $$3 = $$1.b($$2);
      List<alc> $$4 = $$3.a(kr.X, List.of());
      $$3.a(1, $$1);
      if ($$4.isEmpty()) {
         return brp.d;
      } else {
         if (!$$0.B) {
            dal $$5 = $$0.o().aI();
            List<daj<?>> $$6 = new ArrayList<>($$4.size());

            for (alc $$7 : $$4) {
               Optional<daj<?>> $$8 = $$5.a($$7);
               if (!$$8.isPresent()) {
                  a.error("Invalid recipe: {}", $$7);
                  return brp.d;
               }

               $$6.add($$8.get());
            }

            $$1.a($$6);
            $$1.b(awo.c.b(this));
         }

         return brp.a;
      }
   }
}
