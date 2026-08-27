import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class ckn extends cke {
   private static final String a = "Recipes";
   private static final Logger b = LogUtils.getLogger();

   public ckn(cke.a $$0) {
      super($$0);
   }

   @Override
   public bic<ckj> a(cqz $$0, ccx $$1, bia $$2) {
      ckj $$3 = $$1.b($$2);
      rt $$4 = $$3.v();
      if (!$$1.fT().d) {
         $$1.a($$2, ckj.b);
      }

      if ($$4 != null && $$4.b("Recipes", 9)) {
         if (!$$0.B) {
            rz $$5 = $$4.c("Recipes", 8);
            List<cno<?>> $$6 = Lists.newArrayList();
            cnp $$7 = $$0.n().aE();

            for (int $$8 = 0; $$8 < $$5.size(); $$8++) {
               String $$9 = $$5.j($$8);
               Optional<cno<?>> $$10 = $$7.a(new afw($$9));
               if (!$$10.isPresent()) {
                  b.error("Invalid recipe: {}", $$9);
                  return bic.d($$3);
               }

               $$6.add($$10.get());
            }

            $$1.a($$6);
            $$1.b(aqn.c.b(this));
         }

         return bic.a($$3, $$0.x_());
      } else {
         b.error("Tag not valid: {}", $$4);
         return bic.d($$3);
      }
   }
}
