import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class cxp extends cxc {
   private static final Logger a = LogUtils.getLogger();

   public cxp(cxc.a $$0) {
      super($$0);
   }

   @Override
   public bta a(dgz $$0, cpo $$1, bsz $$2) {
      cxg $$3 = $$1.b($$2);
      List<alo<dbv<?>>> $$4 = $$3.a(ku.ac, List.of());
      $$3.a(1, $$1);
      if ($$4.isEmpty()) {
         return bta.d;
      } else {
         if (!$$0.C) {
            dcc $$5 = $$0.p().aI();
            List<dca<?>> $$6 = new ArrayList<>($$4.size());

            for (alo<dbv<?>> $$7 : $$4) {
               Optional<dca<?>> $$8 = $$5.b($$7);
               if (!$$8.isPresent()) {
                  a.error("Invalid recipe: {}", $$7);
                  return bta.d;
               }

               $$6.add($$8.get());
            }

            $$1.a($$6);
            $$1.b(axf.c.b(this));
         }

         return bta.a;
      }
   }
}
