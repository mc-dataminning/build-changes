import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class bgk extends bfd {
   public bgk(Schema $$0, boolean $$1) {
      super($$0, $$1, "Remove Golem Gossip Fix", bgh.B, "minecraft:villager");
   }

   @Override
   protected Typed<?> a(Typed<?> $$0) {
      return $$0.update(DSL.remainderFinder(), bgk::a);
   }

   private static Dynamic<?> a(Dynamic<?> $$0) {
      return $$0.update("Gossips", $$1 -> $$0.createList($$1.asStream().filter($$0xx -> !$$0xx.get("Type").asString("").equals("golem"))));
   }
}
