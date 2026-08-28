import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class cug extends ctx {
   private static final Logger a = LogUtils.getLogger();

   public cug(ctx.a $$0) {
      super($$0);
   }

   @Override
   public bqh<cuc> a(dcf $$0, cmk $$1, bqf $$2) {
      cuc $$3 = $$1.b($$2);
      $$3.a(1, $$1);
      List<akk> $$4 = $$3.a(kn.R, List.of());
      if ($$4.isEmpty()) {
         return bqh.d($$3);
      } else {
         if (!$$0.B) {
            cym $$5 = $$0.o().aK();
            List<cyk<?>> $$6 = new ArrayList<>($$4.size());

            for (akk $$7 : $$4) {
               Optional<cyk<?>> $$8 = $$5.a($$7);
               if (!$$8.isPresent()) {
                  a.error("Invalid recipe: {}", $$7);
                  return bqh.d($$3);
               }

               $$6.add($$8.get());
            }

            $$1.a($$6);
            $$1.b(avr.c.b(this));
         }

         return bqh.a($$3, $$0.x_());
      }
   }
}
