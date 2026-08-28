import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class cuv extends cum {
   private static final Logger a = LogUtils.getLogger();

   public cuv(cum.a $$0) {
      super($$0);
   }

   @Override
   public bqx<cur> a(dca $$0, cmz $$1, bqv $$2) {
      cur $$3 = $$1.b($$2);
      if (!$$1.fP()) {
         $$1.a($$2, cur.l);
      }

      List<alf> $$4 = $$3.a(km.R, List.of());
      if ($$4.isEmpty()) {
         return bqx.d($$3);
      } else {
         if (!$$0.B) {
            cza $$5 = $$0.o().aJ();
            List<cyz<?>> $$6 = new ArrayList<>($$4.size());

            for (alf $$7 : $$4) {
               Optional<cyz<?>> $$8 = $$5.a($$7);
               if (!$$8.isPresent()) {
                  a.error("Invalid recipe: {}", $$7);
                  return bqx.d($$3);
               }

               $$6.add($$8.get());
            }

            $$1.a($$6);
            $$1.b(awk.c.b(this));
         }

         return bqx.a($$3, $$0.x_());
      }
   }
}
