import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class cnk extends cnb {
   private static final String a = "Recipes";
   private static final Logger b = LogUtils.getLogger();

   public cnk(cnb.a $$0) {
      super($$0);
   }

   @Override
   public bkd<cng> a(ctx $$0, cfq $$1, bkb $$2) {
      cng $$3 = $$1.b($$2);
      so $$4 = $$3.v();
      if (!$$1.fT().d) {
         $$1.a($$2, cng.f);
      }

      if ($$4 != null && $$4.b("Recipes", 9)) {
         if (!$$0.B) {
            su $$5 = $$4.c("Recipes", 8);
            List<cqm<?>> $$6 = Lists.newArrayList();
            cqn $$7 = $$0.o().aG();

            for (int $$8 = 0; $$8 < $$5.size(); $$8++) {
               String $$9 = $$5.j($$8);
               Optional<cqm<?>> $$10 = $$7.a(new ahh($$9));
               if (!$$10.isPresent()) {
                  b.error("Invalid recipe: {}", $$9);
                  return bkd.d($$3);
               }

               $$6.add($$10.get());
            }

            $$1.a($$6);
            $$1.b(asd.c.b(this));
         }

         return bkd.a($$3, $$0.y_());
      } else {
         b.error("Tag not valid: {}", $$4);
         return bkd.d($$3);
      }
   }
}
