import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class bbq extends ber {
   public bbq(Schema $$0) {
      super($$0, false, "EntityBrushableBlockFieldsRenameFix", bfs.s, "minecraft:brushable_block");
   }

   public Dynamic<?> a(Dynamic<?> $$0) {
      return azh.a(azh.a($$0, "loot_table", "LootTable"), "loot_table_seed", "LootTableSeed");
   }

   @Override
   protected Typed<?> a(Typed<?> $$0) {
      return $$0.update(DSL.remainderFinder(), this::a);
   }
}
