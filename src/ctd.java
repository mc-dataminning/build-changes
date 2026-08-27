import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class ctd extends csu {
   private static final Logger a = LogUtils.getLogger();

   public ctd(csu.a $$0) {
      super($$0);
   }

   @Override
   public bpn<csz> a(dad $$0, clh $$1, bpl $$2) {
      csz $$3 = $$1.b($$2);
      if (!$$1.fN()) {
         $$1.a($$2, csz.i);
      }

      List<akh> $$4 = $$3.a(ka.O, List.of());
      if ($$4.isEmpty()) {
         return bpn.d($$3);
      } else {
         if (!$$0.B) {
            cxg $$5 = $$0.o().aJ();
            List<cxf<?>> $$6 = new ArrayList<>($$4.size());

            for (akh $$7 : $$4) {
               Optional<cxf<?>> $$8 = $$5.a($$7);
               if (!$$8.isPresent()) {
                  a.error("Invalid recipe: {}", $$7);
                  return bpn.d($$3);
               }

               $$6.add($$8.get());
            }

            $$1.a($$6);
            $$1.b(avm.c.b(this));
         }

         return bpn.a($$3, $$0.x_());
      }
   }
}
