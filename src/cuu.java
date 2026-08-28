import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class cuu extends cul {
   private static final Logger a = LogUtils.getLogger();

   public cuu(cul.a $$0) {
      super($$0);
   }

   @Override
   public bqw<cuq> a(dbz $$0, cmy $$1, bqu $$2) {
      cuq $$3 = $$1.b($$2);
      if (!$$1.fP()) {
         $$1.a($$2, cuq.l);
      }

      List<alf> $$4 = $$3.a(km.R, List.of());
      if ($$4.isEmpty()) {
         return bqw.d($$3);
      } else {
         if (!$$0.B) {
            cyz $$5 = $$0.o().aJ();
            List<cyy<?>> $$6 = new ArrayList<>($$4.size());

            for (alf $$7 : $$4) {
               Optional<cyy<?>> $$8 = $$5.a($$7);
               if (!$$8.isPresent()) {
                  a.error("Invalid recipe: {}", $$7);
                  return bqw.d($$3);
               }

               $$6.add($$8.get());
            }

            $$1.a($$6);
            $$1.b(awk.c.b(this));
         }

         return bqw.a($$3, $$0.x_());
      }
   }
}
