import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import java.util.Optional;

public class bid extends bft {
   public bid(Schema $$0, boolean $$1) {
      super($$0, $$1, "Zombie Villager XP rebuild", bgv.B, "minecraft:zombie_villager");
   }

   @Override
   protected Typed<?> a(Typed<?> $$0) {
      return $$0.update(DSL.remainderFinder(), $$0x -> {
         Optional<Number> $$1 = $$0x.get("Xp").asNumber().result();
         if ($$1.isEmpty()) {
            int $$2 = $$0x.get("VillagerData").get("level").asInt(1);
            return $$0x.set("Xp", $$0x.createInt(bhv.a($$2)));
         } else {
            return $$0x;
         }
      });
   }
}
