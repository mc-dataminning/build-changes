import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class dat extends dag {
   private static final Logger a = LogUtils.getLogger();

   public dat(dag.a $$0) {
      super($$0);
   }

   @Override
   public bvc a(dkj $$0, csi $$1, bvb $$2) {
      dak $$3 = $$1.b($$2);
      List<alq<dfb<?>>> $$4 = $$3.a(kl.ag, List.of());
      $$3.a(1, $$1);
      if ($$4.isEmpty()) {
         return bvc.d;
      } else {
         if (!$$0.C) {
            dfi $$5 = $$0.p().aI();
            List<dfg<?>> $$6 = new ArrayList<>($$4.size());

            for (alq<dfb<?>> $$7 : $$4) {
               Optional<dfg<?>> $$8 = $$5.b($$7);
               if (!$$8.isPresent()) {
                  a.error("Invalid recipe: {}", $$7);
                  return bvc.d;
               }

               $$6.add($$8.get());
            }

            $$1.a($$6);
            $$1.b(axi.c.b(this));
         }

         return bvc.a;
      }
   }
}
