import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.List.ListType;
import com.mojang.serialization.Dynamic;

public class bbh extends DataFix {
   public bbh(Schema $$0) {
      super($$0, true);
   }

   private Dynamic<?> a(Dynamic<?> $$0) {
      return $$0.remove("Bees");
   }

   private Dynamic<?> b(Dynamic<?> $$0) {
      $$0 = $$0.remove("EntityData");
      $$0 = $$0.renameField("TicksInHive", "ticks_in_hive");
      return $$0.renameField("MinOccupationTicks", "min_ticks_in_hive");
   }

   public TypeRewriteRule makeRule() {
      Type<?> $$0 = this.getInputSchema().getChoiceType(bhy.s, "minecraft:beehive");
      OpticFinder<?> $$1 = DSL.namedChoice("minecraft:beehive", $$0);
      ListType<?> $$2 = (ListType<?>)$$0.findFieldType("Bees");
      Type<?> $$3 = $$2.getElement();
      OpticFinder<?> $$4 = DSL.fieldFinder("Bees", $$2);
      OpticFinder<?> $$5 = DSL.typeFinder($$3);
      Type<?> $$6 = this.getInputSchema().getType(bhy.s);
      Type<?> $$7 = this.getOutputSchema().getType(bhy.s);
      return this.fixTypeEverywhereTyped(
         "BeehiveFieldRenameFix",
         $$6,
         $$7,
         $$4x -> bap.a(
               $$7,
               $$4x.updateTyped(
                  $$1,
                  $$2xx -> $$2xx.update(DSL.remainderFinder(), this::a)
                        .updateTyped($$4, $$1xxx -> $$1xxx.updateTyped($$5, $$0xxxx -> $$0xxxx.update(DSL.remainderFinder(), this::b)))
               )
            )
      );
   }
}
