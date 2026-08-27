import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class cmv extends cmm {
   private static final String a = "Recipes";
   private static final Logger b = LogUtils.getLogger();

   public cmv(cmm.a $$0) {
      super($$0);
   }

   @Override
   public bjw<cmr> a(cti $$0, cfb $$1, bju $$2) {
      cmr $$3 = $$1.b($$2);
      sl $$4 = $$3.v();
      if (!$$1.fT().d) {
         $$1.a($$2, cmr.f);
      }

      if ($$4 != null && $$4.b("Recipes", 9)) {
         if (!$$0.B) {
            sr $$5 = $$4.c("Recipes", 8);
            List<cpx<?>> $$6 = Lists.newArrayList();
            cpy $$7 = $$0.o().aG();

            for (int $$8 = 0; $$8 < $$5.size(); $$8++) {
               String $$9 = $$5.j($$8);
               Optional<cpx<?>> $$10 = $$7.a(new ahd($$9));
               if (!$$10.isPresent()) {
                  b.error("Invalid recipe: {}", $$9);
                  return bjw.d($$3);
               }

               $$6.add($$10.get());
            }

            $$1.a($$6);
            $$1.b(arw.c.b(this));
         }

         return bjw.a($$3, $$0.y_());
      } else {
         b.error("Tag not valid: {}", $$4);
         return bjw.d($$3);
      }
   }
}
