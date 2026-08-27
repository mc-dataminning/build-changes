import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class clf extends ckw {
   private static final String a = "Recipes";
   private static final Logger b = LogUtils.getLogger();

   public clf(ckw.a $$0) {
      super($$0);
   }

   @Override
   public bir<clb> a(crs $$0, cdm $$1, bip $$2) {
      clb $$3 = $$1.b($$2);
      rz $$4 = $$3.v();
      if (!$$1.fT().d) {
         $$1.a($$2, clb.b);
      }

      if ($$4 != null && $$4.b("Recipes", 9)) {
         if (!$$0.B) {
            sf $$5 = $$4.c("Recipes", 8);
            List<coh<?>> $$6 = Lists.newArrayList();
            coi $$7 = $$0.n().aE();

            for (int $$8 = 0; $$8 < $$5.size(); $$8++) {
               String $$9 = $$5.j($$8);
               Optional<coh<?>> $$10 = $$7.a(new agg($$9));
               if (!$$10.isPresent()) {
                  b.error("Invalid recipe: {}", $$9);
                  return bir.d($$3);
               }

               $$6.add($$10.get());
            }

            $$1.a($$6);
            $$1.b(aqx.c.b(this));
         }

         return bir.a($$3, $$0.x_());
      } else {
         b.error("Tag not valid: {}", $$4);
         return bir.d($$3);
      }
   }
}
