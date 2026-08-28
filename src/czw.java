import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class czw extends czj {
   private static final Logger a = LogUtils.getLogger();

   public czw(czj.a $$0) {
      super($$0);
   }

   @Override
   public bug a(djm $$0, crm $$1, buf $$2) {
      czn $$3 = $$1.b($$2);
      List<alf<dee<?>>> $$4 = $$3.a(kk.ag, List.of());
      $$3.a(1, $$1);
      if ($$4.isEmpty()) {
         return bug.d;
      } else {
         if (!$$0.C) {
            del $$5 = $$0.p().aI();
            List<dej<?>> $$6 = new ArrayList<>($$4.size());

            for (alf<dee<?>> $$7 : $$4) {
               Optional<dej<?>> $$8 = $$5.b($$7);
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
