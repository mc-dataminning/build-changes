import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class daj extends czw {
   private static final Logger a = LogUtils.getLogger();

   public daj(czw.a $$0) {
      super($$0);
   }

   @Override
   public but a(djz $$0, crz $$1, bus $$2) {
      daa $$3 = $$1.b($$2);
      List<alj<der<?>>> $$4 = $$3.a(kl.ag, List.of());
      $$3.a(1, $$1);
      if ($$4.isEmpty()) {
         return but.d;
      } else {
         if (!$$0.C) {
            dey $$5 = $$0.p().aI();
            List<dew<?>> $$6 = new ArrayList<>($$4.size());

            for (alj<der<?>> $$7 : $$4) {
               Optional<dew<?>> $$8 = $$5.b($$7);
               if (!$$8.isPresent()) {
                  a.error("Invalid recipe: {}", $$7);
                  return but.d;
               }

               $$6.add($$8.get());
            }

            $$1.a($$6);
            $$1.b(axb.c.b(this));
         }

         return but.a;
      }
   }
}
