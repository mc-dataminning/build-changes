import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class biq extends bhi {
   public biq(Schema $$0, boolean $$1) {
      super($$0, $$1, "Remove Golem Gossip Fix", bin.B, "minecraft:villager");
   }

   @Override
   protected Typed<?> a(Typed<?> $$0) {
      return $$0.update(DSL.remainderFinder(), biq::a);
   }

   private static Dynamic<?> a(Dynamic<?> $$0) {
      return $$0.update("Gossips", $$1 -> $$0.createList($$1.asStream().filter($$0xx -> !$$0xx.get("Type").asString("").equals("golem"))));
   }
}
