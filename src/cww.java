import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class cww extends cwj {
   private static final Logger a = LogUtils.getLogger();

   public cww(cwj.a $$0) {
      super($$0);
   }

   @Override
   public bsi a(dgg $$0, cov $$1, bsh $$2) {
      cwn $$3 = $$1.b($$2);
      List<akt<dbc<?>>> $$4 = $$3.a(kv.ac, List.of());
      $$3.a(1, $$1);
      if ($$4.isEmpty()) {
         return bsi.d;
      } else {
         if (!$$0.C) {
            dbj $$5 = $$0.p().aI();
            List<dbh<?>> $$6 = new ArrayList<>($$4.size());

            for (akt<dbc<?>> $$7 : $$4) {
               Optional<dbh<?>> $$8 = $$5.b($$7);
               if (!$$8.isPresent()) {
                  a.error("Invalid recipe: {}", $$7);
                  return bsi.d;
               }

               $$6.add($$8.get());
            }

            $$1.a($$6);
            $$1.b(awj.c.b(this));
         }

         return bsi.a;
      }
   }
}
