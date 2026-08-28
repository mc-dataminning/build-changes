import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class cwx extends cwk {
   private static final Logger a = LogUtils.getLogger();

   public cwx(cwk.a $$0) {
      super($$0);
   }

   @Override
   public bsj a(dgh $$0, cow $$1, bsi $$2) {
      cwo $$3 = $$1.b($$2);
      List<aku<dbd<?>>> $$4 = $$3.a(kv.ac, List.of());
      $$3.a(1, $$1);
      if ($$4.isEmpty()) {
         return bsj.d;
      } else {
         if (!$$0.C) {
            dbk $$5 = $$0.p().aI();
            List<dbi<?>> $$6 = new ArrayList<>($$4.size());

            for (aku<dbd<?>> $$7 : $$4) {
               Optional<dbi<?>> $$8 = $$5.b($$7);
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
