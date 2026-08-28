import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class bjo extends bhi {
   private static final double a = 16.0;
   private static final double b = 48.0;

   public bjo(Schema $$0) {
      super($$0, false, "Villager Follow Range Fix", bin.B, "minecraft:villager");
   }

   @Override
   protected Typed<?> a(Typed<?> $$0) {
      return $$0.update(DSL.remainderFinder(), bjo::a);
   }

   private static Dynamic<?> a(Dynamic<?> $$0) {
      return $$0.update(
         "Attributes",
         $$1 -> $$0.createList(
               $$1.asStream()
                  .map(
                     $$0xx -> $$0xx.get("Name").asString("").equals("generic.follow_range") && $$0xx.get("Base").asDouble(0.0) == 16.0
                           ? $$0xx.set("Base", $$0xx.createDouble(48.0))
                           : $$0xx
                  )
            )
      );
   }
}
