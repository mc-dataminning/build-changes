import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class czt extends czg {
   private static final Logger a = LogUtils.getLogger();

   public czt(czg.a $$0) {
      super($$0);
   }

   @Override
   public bug a(djh $$0, crj $$1, buf $$2) {
      czk $$3 = $$1.b($$2);
      List<alf<deb<?>>> $$4 = $$3.a(kk.ag, List.of());
      $$3.a(1, $$1);
      if ($$4.isEmpty()) {
         return bug.d;
      } else {
         if (!$$0.C) {
            dei $$5 = $$0.p().aI();
            List<deg<?>> $$6 = new ArrayList<>($$4.size());

            for (alf<deb<?>> $$7 : $$4) {
               Optional<deg<?>> $$8 = $$5.b($$7);
               if (!$$8.isPresent()) {
                  a.error("Invalid recipe: {}", $$7);
                  return bug.d;
               }

               $$6.add($$8.get());
            }

            $$1.a($$6);
            $$1.b(awx.c.b(this));
         }

         return bug.a;
      }
   }
}
