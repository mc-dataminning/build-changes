import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class azj extends baq {
   public azj(Schema $$0, String $$1) {
      super($$0, false, "Gossip for for " + $$1, bbq.x, $$1);
   }

   @Override
   protected Typed<?> a(Typed<?> $$0) {
      return $$0.update(
         DSL.remainderFinder(),
         $$0x -> $$0x.update(
               "Gossips",
               $$0xx -> (Dynamic)DataFixUtils.orElse(
                     $$0xx.asStreamOpt()
                        .result()
                        .map($$0xxx -> $$0xxx.map($$0xxxx -> (Dynamic)avv.c($$0xxxx, "Target", "Target").orElse($$0xxxx)))
                        .map($$0xx::createList),
                     $$0xx
                  )
            )
      );
   }
}
