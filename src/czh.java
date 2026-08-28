import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class czh extends cyu {
   private static final Logger a = LogUtils.getLogger();

   public czh(cyu.a $$0) {
      super($$0);
   }

   @Override
   public bub a(div $$0, cqy $$1, bua $$2) {
      cyy $$3 = $$1.b($$2);
      List<alf<ddp<?>>> $$4 = $$3.a(kj.ag, List.of());
      $$3.a(1, $$1);
      if ($$4.isEmpty()) {
         return bub.d;
      } else {
         if (!$$0.C) {
            ddw $$5 = $$0.p().aI();
            List<ddu<?>> $$6 = new ArrayList<>($$4.size());

            for (alf<ddp<?>> $$7 : $$4) {
               Optional<ddu<?>> $$8 = $$5.b($$7);
               if (!$$8.isPresent()) {
                  a.error("Invalid recipe: {}", $$7);
                  return bub.d;
               }

               $$6.add($$8.get());
            }

            $$1.a($$6);
            $$1.b(awx.c.b(this));
         }

         return bub.a;
      }
   }
}
