import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class baj extends bdh {
   public baj(Schema $$0) {
      super($$0, false, "EntityBrushableBlockFieldsRenameFix", beh.s, "minecraft:brushable_block");
   }

   public Dynamic<?> a(Dynamic<?> $$0) {
      return aye.a(aye.a($$0, "loot_table", "LootTable"), "loot_table_seed", "LootTableSeed");
   }

   @Override
   protected Typed<?> a(Typed<?> $$0) {
      return $$0.update(DSL.remainderFinder(), this::a);
   }
}
