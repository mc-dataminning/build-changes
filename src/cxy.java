import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class cxy extends cxl {
   private static final Logger a = LogUtils.getLogger();

   public cxy(cxl.a $$0) {
      super($$0);
   }

   @Override
   public btj a(dhi $$0, cpx $$1, bti $$2) {
      cxp $$3 = $$1.b($$2);
      List<aly<dce<?>>> $$4 = $$3.a(ku.ac, List.of());
      $$3.a(1, $$1);
      if ($$4.isEmpty()) {
         return btj.d;
      } else {
         if (!$$0.C) {
            dcl $$5 = $$0.p().aI();
            List<dcj<?>> $$6 = new ArrayList<>($$4.size());

            for (aly<dce<?>> $$7 : $$4) {
               Optional<dcj<?>> $$8 = $$5.b($$7);
               if (!$$8.isPresent()) {
                  a.error("Invalid recipe: {}", $$7);
                  return btj.d;
               }

               $$6.add($$8.get());
            }

            $$1.a($$6);
            $$1.b(axp.c.b(this));
         }

         return btj.a;
      }
   }
}
