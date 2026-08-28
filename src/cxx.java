import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class cxx extends cxk {
   private static final Logger a = LogUtils.getLogger();

   public cxx(cxk.a $$0) {
      super($$0);
   }

   @Override
   public bti a(dhh $$0, cpw $$1, bth $$2) {
      cxo $$3 = $$1.b($$2);
      List<aly<dcd<?>>> $$4 = $$3.a(ku.ac, List.of());
      $$3.a(1, $$1);
      if ($$4.isEmpty()) {
         return bti.d;
      } else {
         if (!$$0.C) {
            dck $$5 = $$0.p().aI();
            List<dci<?>> $$6 = new ArrayList<>($$4.size());

            for (aly<dcd<?>> $$7 : $$4) {
               Optional<dci<?>> $$8 = $$5.b($$7);
               if (!$$8.isPresent()) {
                  a.error("Invalid recipe: {}", $$7);
                  return bti.d;
               }

               $$6.add($$8.get());
            }

            $$1.a($$6);
            $$1.b(axp.c.b(this));
         }

         return bti.a;
      }
   }
}
