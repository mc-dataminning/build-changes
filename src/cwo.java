import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class cwo extends cwb {
   private static final Logger a = LogUtils.getLogger();

   public cwo(cwb.a $$0) {
      super($$0);
   }

   @Override
   public bsh a(dff $$0, cor $$1, bsg $$2) {
      cwf $$3 = $$1.b($$2);
      List<all> $$4 = $$3.a(ku.ac, List.of());
      $$3.a(1, $$1);
      if ($$4.isEmpty()) {
         return bsh.d;
      } else {
         if (!$$0.C) {
            dax $$5 = $$0.o().aI();
            List<dav<?>> $$6 = new ArrayList<>($$4.size());

            for (all $$7 : $$4) {
               Optional<dav<?>> $$8 = $$5.a($$7);
               if (!$$8.isPresent()) {
                  a.error("Invalid recipe: {}", $$7);
                  return bsh.d;
               }

               $$6.add($$8.get());
            }

            $$1.a($$6);
            $$1.b(awy.c.b(this));
         }

         return bsh.a;
      }
   }
}
