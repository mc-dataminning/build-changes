import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class czb extends cyo {
   private static final Logger a = LogUtils.getLogger();

   public czb(cyo.a $$0) {
      super($$0);
   }

   @Override
   public bty a(dip $$0, cqs $$1, btx $$2) {
      cys $$3 = $$1.b($$2);
      List<ald<ddj<?>>> $$4 = $$3.a(kj.ag, List.of());
      $$3.a(1, $$1);
      if ($$4.isEmpty()) {
         return bty.d;
      } else {
         if (!$$0.C) {
            ddq $$5 = $$0.p().aI();
            List<ddo<?>> $$6 = new ArrayList<>($$4.size());

            for (ald<ddj<?>> $$7 : $$4) {
               Optional<ddo<?>> $$8 = $$5.b($$7);
               if (!$$8.isPresent()) {
                  a.error("Invalid recipe: {}", $$7);
                  return bty.d;
               }

               $$6.add($$8.get());
            }

            $$1.a($$6);
            $$1.b(awv.c.b(this));
         }

         return bty.a;
      }
   }
}
