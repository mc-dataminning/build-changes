import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class czm extends cyz {
   private static final Logger a = LogUtils.getLogger();

   public czm(cyz.a $$0) {
      super($$0);
   }

   @Override
   public bud a(dja $$0, crc $$1, buc $$2) {
      czd $$3 = $$1.b($$2);
      List<alf<ddu<?>>> $$4 = $$3.a(kj.ag, List.of());
      $$3.a(1, $$1);
      if ($$4.isEmpty()) {
         return bud.d;
      } else {
         if (!$$0.C) {
            deb $$5 = $$0.p().aI();
            List<ddz<?>> $$6 = new ArrayList<>($$4.size());

            for (alf<ddu<?>> $$7 : $$4) {
               Optional<ddz<?>> $$8 = $$5.b($$7);
               if (!$$8.isPresent()) {
                  a.error("Invalid recipe: {}", $$7);
                  return bud.d;
               }

               $$6.add($$8.get());
            }

            $$1.a($$6);
            $$1.b(awx.c.b(this));
         }

         return bud.a;
      }
   }
}
