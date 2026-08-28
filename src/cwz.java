import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class cwz extends cwm {
   private static final Logger a = LogUtils.getLogger();

   public cwz(cwm.a $$0) {
      super($$0);
   }

   @Override
   public bsl a(dgj $$0, coy $$1, bsk $$2) {
      cwq $$3 = $$1.b($$2);
      List<aku<dbf<?>>> $$4 = $$3.a(kv.ac, List.of());
      $$3.a(1, $$1);
      if ($$4.isEmpty()) {
         return bsl.d;
      } else {
         if (!$$0.C) {
            dbm $$5 = $$0.p().aI();
            List<dbk<?>> $$6 = new ArrayList<>($$4.size());

            for (aku<dbf<?>> $$7 : $$4) {
               Optional<dbk<?>> $$8 = $$5.b($$7);
               if (!$$8.isPresent()) {
                  a.error("Invalid recipe: {}", $$7);
                  return bsl.d;
               }

               $$6.add($$8.get());
            }

            $$1.a($$6);
            $$1.b(awk.c.b(this));
         }

         return bsl.a;
      }
   }
}
