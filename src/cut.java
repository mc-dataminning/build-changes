import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class cut extends cuk {
   private static final Logger a = LogUtils.getLogger();

   public cut(cuk.a $$0) {
      super($$0);
   }

   @Override
   public bqv<cup> a(dby $$0, cmx $$1, bqt $$2) {
      cup $$3 = $$1.b($$2);
      if (!$$1.fP()) {
         $$1.a($$2, cup.l);
      }

      List<alf> $$4 = $$3.a(km.R, List.of());
      if ($$4.isEmpty()) {
         return bqv.d($$3);
      } else {
         if (!$$0.B) {
            cyy $$5 = $$0.o().aJ();
            List<cyx<?>> $$6 = new ArrayList<>($$4.size());

            for (alf $$7 : $$4) {
               Optional<cyx<?>> $$8 = $$5.a($$7);
               if (!$$8.isPresent()) {
                  a.error("Invalid recipe: {}", $$7);
                  return bqv.d($$3);
               }

               $$6.add($$8.get());
            }

            $$1.a($$6);
            $$1.b(awk.c.b(this));
         }

         return bqv.a($$3, $$0.x_());
      }
   }
}
