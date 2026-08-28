import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class cuw extends cuj {
   private static final Logger a = LogUtils.getLogger();

   public cuw(cuj.a $$0) {
      super($$0);
   }

   @Override
   public bqr<cuo> a(dcu $$0, cmv $$1, bqp $$2) {
      cuo $$3 = $$1.b($$2);
      List<akq> $$4 = $$3.a(kq.S, List.of());
      $$3.a(1, $$1);
      if ($$4.isEmpty()) {
         return bqr.d($$3);
      } else {
         if (!$$0.B) {
            czb $$5 = $$0.o().aJ();
            List<cyz<?>> $$6 = new ArrayList<>($$4.size());

            for (akq $$7 : $$4) {
               Optional<cyz<?>> $$8 = $$5.a($$7);
               if (!$$8.isPresent()) {
                  a.error("Invalid recipe: {}", $$7);
                  return bqr.d($$3);
               }

               $$6.add($$8.get());
            }

            $$1.a($$6);
            $$1.b(avy.c.b(this));
         }

         return bqr.a($$3, $$0.x_());
      }
   }
}
