import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class crw extends crn {
   private static final Logger a = LogUtils.getLogger();

   public crw(crn.a $$0) {
      super($$0);
   }

   @Override
   public bog<crs> a(czg $$0, cka $$1, boe $$2) {
      crs $$3 = $$1.b($$2);
      if (!$$1.fM()) {
         $$1.a($$2, crs.i);
      }

      List<ajv> $$4 = $$3.a(jr.H, List.of());
      if ($$4.isEmpty()) {
         return bog.d($$3);
      } else {
         if (!$$0.B) {
            cvv $$5 = $$0.o().aJ();
            List<cvu<?>> $$6 = new ArrayList<>($$4.size());

            for (ajv $$7 : $$4) {
               Optional<cvu<?>> $$8 = $$5.a($$7);
               if (!$$8.isPresent()) {
                  a.error("Invalid recipe: {}", $$7);
                  return bog.d($$3);
               }

               $$6.add($$8.get());
            }

            $$1.a($$6);
            $$1.b(auz.c.b(this));
         }

         return bog.a($$3, $$0.x_());
      }
   }
}
