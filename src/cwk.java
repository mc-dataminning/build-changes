import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class cwk extends cvx {
   private static final Logger a = LogUtils.getLogger();

   public cwk(cvx.a $$0) {
      super($$0);
   }

   @Override
   public bsd a(dfb $$0, com $$1, bsc $$2) {
      cwb $$3 = $$1.b($$2);
      List<ali> $$4 = $$3.a(ku.ac, List.of());
      $$3.a(1, $$1);
      if ($$4.isEmpty()) {
         return bsd.d;
      } else {
         if (!$$0.C) {
            dat $$5 = $$0.o().aI();
            List<dar<?>> $$6 = new ArrayList<>($$4.size());

            for (ali $$7 : $$4) {
               Optional<dar<?>> $$8 = $$5.a($$7);
               if (!$$8.isPresent()) {
                  a.error("Invalid recipe: {}", $$7);
                  return bsd.d;
               }

               $$6.add($$8.get());
            }

            $$1.a($$6);
            $$1.b(awv.c.b(this));
         }

         return bsd.a;
      }
   }
}
