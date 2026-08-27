import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class cqo extends cqf {
   private static final String a = "Recipes";
   private static final Logger b = LogUtils.getLogger();

   public cqo(cqf.a $$0) {
      super($$0);
   }

   @Override
   public bnd<cqk> a(cwz $$0, cis $$1, bnb $$2) {
      cqk $$3 = $$1.b($$2);
      ta $$4 = $$3.w();
      if (!$$1.fM()) {
         $$1.a($$2, cqk.h);
      }

      if ($$4 != null && $$4.b("Recipes", 9)) {
         if (!$$0.B) {
            tg $$5 = $$4.c("Recipes", 8);
            List<ctp<?>> $$6 = Lists.newArrayList();
            ctq $$7 = $$0.o().aJ();

            for (int $$8 = 0; $$8 < $$5.size(); $$8++) {
               String $$9 = $$5.j($$8);
               Optional<ctp<?>> $$10 = $$7.a(new ajh($$9));
               if (!$$10.isPresent()) {
                  b.error("Invalid recipe: {}", $$9);
                  return bnd.d($$3);
               }

               $$6.add($$10.get());
            }

            $$1.a($$6);
            $$1.b(aui.c.b(this));
         }

         return bnd.a($$3, $$0.x_());
      } else {
         b.error("Tag not valid: {}", $$4);
         return bnd.d($$3);
      }
   }
}
