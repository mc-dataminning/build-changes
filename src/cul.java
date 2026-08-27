import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class cul extends cuc {
   private static final Logger a = LogUtils.getLogger();

   public cul(cuc.a $$0) {
      super($$0);
   }

   @Override
   public bqb<cuh> a(dca $$0, cly $$1, bpz $$2) {
      cuh $$3 = $$1.b($$2);
      if (!$$1.fY()) {
         $$1.a($$2, cuh.i);
      }

      List<akt> $$4 = $$3.a(ke.Q, List.of());
      if ($$4.isEmpty()) {
         return bqb.d($$3);
      } else {
         if (!$$0.C) {
            czd $$5 = $$0.o().aJ();
            List<czc<?>> $$6 = new ArrayList<>($$4.size());

            for (akt $$7 : $$4) {
               Optional<czc<?>> $$8 = $$5.a($$7);
               if (!$$8.isPresent()) {
                  a.error("Invalid recipe: {}", $$7);
                  return bqb.d($$3);
               }

               $$6.add($$8.get());
            }

            $$1.a($$6);
            $$1.b(avz.c.b(this));
         }

         return bqb.a($$3, $$0.x_());
      }
   }
}
