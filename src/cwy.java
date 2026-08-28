import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class cwy extends cwl {
   private static final Logger a = LogUtils.getLogger();

   public cwy(cwl.a $$0) {
      super($$0);
   }

   @Override
   public bsj a(dgi $$0, cox $$1, bsi $$2) {
      cwp $$3 = $$1.b($$2);
      List<akt<dbe<?>>> $$4 = $$3.a(kv.ac, List.of());
      $$3.a(1, $$1);
      if ($$4.isEmpty()) {
         return bsj.d;
      } else {
         if (!$$0.C) {
            dbl $$5 = $$0.p().aI();
            List<dbj<?>> $$6 = new ArrayList<>($$4.size());

            for (akt<dbe<?>> $$7 : $$4) {
               Optional<dbj<?>> $$8 = $$5.b($$7);
               if (!$$8.isPresent()) {
                  a.error("Invalid recipe: {}", $$7);
                  return bsj.d;
               }

               $$6.add($$8.get());
            }

            $$1.a($$6);
            $$1.b(awk.c.b(this));
         }

         return bsj.a;
      }
   }
}
