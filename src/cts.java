import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class cts extends ctj {
   private static final Logger a = LogUtils.getLogger();

   public cts(ctj.a $$0) {
      super($$0);
   }

   @Override
   public bpv<cto> a(dax $$0, clw $$1, bpt $$2) {
      cto $$3 = $$1.b($$2);
      if (!$$1.fP()) {
         $$1.a($$2, cto.i);
      }

      List<akm> $$4 = $$3.a(kb.Q, List.of());
      if ($$4.isEmpty()) {
         return bpv.d($$3);
      } else {
         if (!$$0.B) {
            cxx $$5 = $$0.o().aJ();
            List<cxw<?>> $$6 = new ArrayList<>($$4.size());

            for (akm $$7 : $$4) {
               Optional<cxw<?>> $$8 = $$5.a($$7);
               if (!$$8.isPresent()) {
                  a.error("Invalid recipe: {}", $$7);
                  return bpv.d($$3);
               }

               $$6.add($$8.get());
            }

            $$1.a($$6);
            $$1.b(avr.c.b(this));
         }

         return bpv.a($$3, $$0.x_());
      }
   }
}
