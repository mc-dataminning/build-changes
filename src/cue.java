import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class cue extends ctv {
   private static final Logger a = LogUtils.getLogger();

   public cue(ctv.a $$0) {
      super($$0);
   }

   @Override
   public bqe<cua> a(dcd $$0, cmh $$1, bqc $$2) {
      cua $$3 = $$1.b($$2);
      if (!$$1.fL()) {
         $$1.a($$2, cua.l);
      }

      List<akk> $$4 = $$3.a(kn.R, List.of());
      if ($$4.isEmpty()) {
         return bqe.d($$3);
      } else {
         if (!$$0.B) {
            cyk $$5 = $$0.o().aJ();
            List<cyi<?>> $$6 = new ArrayList<>($$4.size());

            for (akk $$7 : $$4) {
               Optional<cyi<?>> $$8 = $$5.a($$7);
               if (!$$8.isPresent()) {
                  a.error("Invalid recipe: {}", $$7);
                  return bqe.d($$3);
               }

               $$6.add($$8.get());
            }

            $$1.a($$6);
            $$1.b(avp.c.b(this));
         }

         return bqe.a($$3, $$0.x_());
      }
   }
}
