import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import java.util.Set;

public class bci extends DataFix {
   private static final Set<String> a = Set.of(
      "minecraft:beacon",
      "minecraft:banner",
      "minecraft:brewing_stand",
      "minecraft:chest",
      "minecraft:trapped_chest",
      "minecraft:dispenser",
      "minecraft:dropper",
      "minecraft:enchanting_table",
      "minecraft:furnace",
      "minecraft:hopper",
      "minecraft:shulker_box"
   );

   public bci(Schema $$0) {
      super($$0, true);
   }

   public TypeRewriteRule makeRule() {
      OpticFinder<String> $$0 = DSL.fieldFinder("id", bky.a());
      Type<?> $$1 = this.getInputSchema().getType(bjd.s);
      Type<?> $$2 = this.getOutputSchema().getType(bjd.s);
      Type<?> $$3 = bbh.a($$1, $$1, $$2);
      return this.fixTypeEverywhereTyped("BlockEntityCustomNameToComponentFix", $$1, $$2, $$3x -> {
         Optional<String> $$4 = $$3x.getOptional($$0);
         return $$4.isPresent() && !a.contains($$4.get()) ? bbh.a($$2, $$3x) : ag.a(bbh.a($$3, $$3x), $$2, bci::a);
      });
   }

   public static <T> Dynamic<T> a(Dynamic<T> $$0) {
      String $$1 = $$0.get("CustomName").asString("");
      return $$1.isEmpty() ? $$0.remove("CustomName") : $$0.set("CustomName", bbi.a($$0.getOps(), $$1));
   }
}
