import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class ctu extends ctl {
   private static final Logger a = LogUtils.getLogger();

   public ctu(ctl.a $$0) {
      super($$0);
   }

   @Override
   public bpx<ctq> a(daz $$0, cly $$1, bpv $$2) {
      ctq $$3 = $$1.b($$2);
      if (!$$1.fP()) {
         $$1.a($$2, ctq.i);
      }

      List<akn> $$4 = $$3.a(kb.Q, List.of());
      if ($$4.isEmpty()) {
         return bpx.d($$3);
      } else {
         if (!$$0.B) {
            cxz $$5 = $$0.o().aJ();
            List<cxy<?>> $$6 = new ArrayList<>($$4.size());

            for (akn $$7 : $$4) {
               Optional<cxy<?>> $$8 = $$5.a($$7);
               if (!$$8.isPresent()) {
                  a.error("Invalid recipe: {}", $$7);
                  return bpx.d($$3);
               }

               $$6.add($$8.get());
            }

            $$1.a($$6);
            $$1.b(avs.c.b(this));
         }

         return bpx.a($$3, $$0.x_());
      }
   }
}
