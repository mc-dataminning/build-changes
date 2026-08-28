import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class dah extends czu {
   private static final Logger a = LogUtils.getLogger();

   public dah(czu.a $$0) {
      super($$0);
   }

   @Override
   public bur a(djx $$0, crx $$1, buq $$2) {
      czy $$3 = $$1.b($$2);
      List<alh<dep<?>>> $$4 = $$3.a(kk.ag, List.of());
      $$3.a(1, $$1);
      if ($$4.isEmpty()) {
         return bur.d;
      } else {
         if (!$$0.C) {
            dew $$5 = $$0.p().aI();
            List<deu<?>> $$6 = new ArrayList<>($$4.size());

            for (alh<dep<?>> $$7 : $$4) {
               Optional<deu<?>> $$8 = $$5.b($$7);
               if (!$$8.isPresent()) {
                  a.error("Invalid recipe: {}", $$7);
                  return bur.d;
               }

               $$6.add($$8.get());
            }

            $$1.a($$6);
            $$1.b(awz.c.b(this));
         }

         return bur.a;
      }
   }
}
