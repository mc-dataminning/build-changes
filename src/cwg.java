import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class cwg extends cvt {
   private static final Logger a = LogUtils.getLogger();

   public cwg(cvt.a $$0) {
      super($$0);
   }

   @Override
   public bry a(dev $$0, coh $$1, brx $$2) {
      cvx $$3 = $$1.b($$2);
      List<alh> $$4 = $$3.a(kt.ab, List.of());
      $$3.a(1, $$1);
      if ($$4.isEmpty()) {
         return bry.d;
      } else {
         if (!$$0.C) {
            dan $$5 = $$0.o().aI();
            List<dal<?>> $$6 = new ArrayList<>($$4.size());

            for (alh $$7 : $$4) {
               Optional<dal<?>> $$8 = $$5.a($$7);
               if (!$$8.isPresent()) {
                  a.error("Invalid recipe: {}", $$7);
                  return bry.d;
               }

               $$6.add($$8.get());
            }

            $$1.a($$6);
            $$1.b(awu.c.b(this));
         }

         return bry.a;
      }
   }
}
