import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class bco extends bfq {
   public bco(Schema $$0) {
      super($$0, false, "EntityBrushableBlockFieldsRenameFix", bgs.s, "minecraft:brushable_block");
   }

   public Dynamic<?> a(Dynamic<?> $$0) {
      return $$0.renameField("loot_table", "LootTable").renameField("loot_table_seed", "LootTableSeed");
   }

   @Override
   protected Typed<?> a(Typed<?> $$0) {
      return $$0.update(DSL.remainderFinder(), this::a);
   }
}
