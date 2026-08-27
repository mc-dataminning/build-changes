import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class cls extends clj {
   private static final String a = "Recipes";
   private static final Logger b = LogUtils.getLogger();

   public cls(clj.a $$0) {
      super($$0);
   }

   @Override
   public bjc<clo> a(csf $$0, cdz $$1, bja $$2) {
      clo $$3 = $$1.b($$2);
      sd $$4 = $$3.v();
      if (!$$1.fU().d) {
         $$1.a($$2, clo.b);
      }

      if ($$4 != null && $$4.b("Recipes", 9)) {
         if (!$$0.B) {
            sj $$5 = $$4.c("Recipes", 8);
            List<cov<?>> $$6 = Lists.newArrayList();
            cow $$7 = $$0.n().aG();

            for (int $$8 = 0; $$8 < $$5.size(); $$8++) {
               String $$9 = $$5.j($$8);
               Optional<cov<?>> $$10 = $$7.a(new agm($$9));
               if (!$$10.isPresent()) {
                  b.error("Invalid recipe: {}", $$9);
                  return bjc.d($$3);
               }

               $$6.add($$10.get());
            }

            $$1.a($$6);
            $$1.b(arf.c.b(this));
         }

         return bjc.a($$3, $$0.y_());
      } else {
         b.error("Tag not valid: {}", $$4);
         return bjc.d($$3);
      }
   }
}
