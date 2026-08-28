import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class cxt extends cxg {
   private static final Logger a = LogUtils.getLogger();

   public cxt(cxg.a $$0) {
      super($$0);
   }

   @Override
   public bte a(dha $$0, cps $$1, btd $$2) {
      cxk $$3 = $$1.b($$2);
      List<aly<dbz<?>>> $$4 = $$3.a(ku.ac, List.of());
      $$3.a(1, $$1);
      if ($$4.isEmpty()) {
         return bte.d;
      } else {
         if (!$$0.C) {
            dcf $$5 = $$0.p().aI();
            List<dcd<?>> $$6 = new ArrayList<>($$4.size());

            for (aly<dbz<?>> $$7 : $$4) {
               Optional<dcd<?>> $$8 = $$5.b($$7);
               if (!$$8.isPresent()) {
                  a.error("Invalid recipe: {}", $$7);
                  return bte.d;
               }

               $$6.add($$8.get());
            }

            $$1.a($$6);
            $$1.b(axp.c.b(this));
         }

         return bte.a;
      }
   }
}
