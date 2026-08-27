import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class csh extends cry {
   private static final Logger a = LogUtils.getLogger();

   public csh(cry.a $$0) {
      super($$0);
   }

   @Override
   public bor<csd> a(czu $$0, ckl $$1, bop $$2) {
      csd $$3 = $$1.b($$2);
      if (!$$1.fN()) {
         $$1.a($$2, csd.i);
      }

      List<akf> $$4 = $$3.a(jz.H, List.of());
      if ($$4.isEmpty()) {
         return bor.d($$3);
      } else {
         if (!$$0.B) {
            cwj $$5 = $$0.o().aJ();
            List<cwi<?>> $$6 = new ArrayList<>($$4.size());

            for (akf $$7 : $$4) {
               Optional<cwi<?>> $$8 = $$5.a($$7);
               if (!$$8.isPresent()) {
                  a.error("Invalid recipe: {}", $$7);
                  return bor.d($$3);
               }

               $$6.add($$8.get());
            }

            $$1.a($$6);
            $$1.b(avj.c.b(this));
         }

         return bor.a($$3, $$0.x_());
      }
   }
}
