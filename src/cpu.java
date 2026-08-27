import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class cpu extends cpl {
   private static final String a = "Recipes";
   private static final Logger b = LogUtils.getLogger();

   public cpu(cpl.a $$0) {
      super($$0);
   }

   @Override
   public bmm<cpq> a(cwe $$0, cia $$1, bmk $$2) {
      cpq $$3 = $$1.b($$2);
      sy $$4 = $$3.w();
      if (!$$1.fW().d) {
         $$1.a($$2, cpq.h);
      }

      if ($$4 != null && $$4.b("Recipes", 9)) {
         if (!$$0.B) {
            te $$5 = $$4.c("Recipes", 8);
            List<csu<?>> $$6 = Lists.newArrayList();
            csv $$7 = $$0.o().aJ();

            for (int $$8 = 0; $$8 < $$5.size(); $$8++) {
               String $$9 = $$5.j($$8);
               Optional<csu<?>> $$10 = $$7.a(new ajc($$9));
               if (!$$10.isPresent()) {
                  b.error("Invalid recipe: {}", $$9);
                  return bmm.d($$3);
               }

               $$6.add($$10.get());
            }

            $$1.a($$6);
            $$1.b(atz.c.b(this));
         }

         return bmm.a($$3, $$0.y_());
      } else {
         b.error("Tag not valid: {}", $$4);
         return bmm.d($$3);
      }
   }
}
