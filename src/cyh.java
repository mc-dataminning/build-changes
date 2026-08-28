import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class cyh extends cxu {
   private static final Logger a = LogUtils.getLogger();

   public cyh(cxu.a $$0) {
      super($$0);
   }

   @Override
   public btq a(dhp $$0, cqi $$1, btp $$2) {
      cxy $$3 = $$1.b($$2);
      List<alc<dcl<?>>> $$4 = $$3.a(kx.ae, List.of());
      $$3.a(1, $$1);
      if ($$4.isEmpty()) {
         return btq.d;
      } else {
         if (!$$0.C) {
            dcs $$5 = $$0.p().aI();
            List<dcq<?>> $$6 = new ArrayList<>($$4.size());

            for (alc<dcl<?>> $$7 : $$4) {
               Optional<dcq<?>> $$8 = $$5.b($$7);
               if (!$$8.isPresent()) {
                  a.error("Invalid recipe: {}", $$7);
                  return btq.d;
               }

               $$6.add($$8.get());
            }

            $$1.a($$6);
            $$1.b(awu.c.b(this));
         }

         return btq.a;
      }
   }
}
