import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class cwv extends cwi {
   private static final Logger a = LogUtils.getLogger();

   public cwv(cwi.a $$0) {
      super($$0);
   }

   @Override
   public bsk a(dfm $$0, cou $$1, bsj $$2) {
      cwm $$3 = $$1.b($$2);
      List<alj> $$4 = $$3.a(ku.ac, List.of());
      $$3.a(1, $$1);
      if ($$4.isEmpty()) {
         return bsk.d;
      } else {
         if (!$$0.C) {
            dbe $$5 = $$0.p().aI();
            List<dbc<?>> $$6 = new ArrayList<>($$4.size());

            for (alj $$7 : $$4) {
               Optional<dbc<?>> $$8 = $$5.a($$7);
               if (!$$8.isPresent()) {
                  a.error("Invalid recipe: {}", $$7);
                  return bsk.d;
               }

               $$6.add($$8.get());
            }

            $$1.a($$6);
            $$1.b(awx.c.b(this));
         }

         return bsk.a;
      }
   }
}
