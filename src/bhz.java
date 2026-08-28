import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;

public class bhz extends bfu {
   public bhz(Schema $$0, boolean $$1) {
      super($$0, $$1, "WeaponSmithChestLootTableFix", bgw.s, "minecraft:chest");
   }

   @Override
   protected Typed<?> a(Typed<?> $$0) {
      return $$0.update(
         DSL.remainderFinder(),
         $$0x -> {
            String $$1 = $$0x.get("LootTable").asString("");
            return $$1.equals("minecraft:chests/village_blacksmith")
               ? $$0x.set("LootTable", $$0x.createString("minecraft:chests/village/village_weaponsmith"))
               : $$0x;
         }
      );
   }
}
