import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.OptionalDynamic;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class bgs extends DataFix {
   private static final Set<String> a = Set.of(
      "filled_map.buried_treasure",
      "filled_map.explorer_jungle",
      "filled_map.explorer_swamp",
      "filled_map.mansion",
      "filled_map.monument",
      "filled_map.trial_chambers",
      "filled_map.village_desert",
      "filled_map.village_plains",
      "filled_map.village_savanna",
      "filled_map.village_snowy",
      "filled_map.village_taiga"
   );

   public bgs(Schema $$0) {
      super($$0, false);
   }

   public final TypeRewriteRule makeRule() {
      Type<?> $$0 = this.getInputSchema().getType(bix.t);
      OpticFinder<Pair<String, String>> $$1 = DSL.fieldFinder("id", DSL.named(bix.D.typeName(), bkl.a()));
      OpticFinder<?> $$2 = $$0.findField("components");
      return this.fixTypeEverywhereTyped(
         "ItemStack custom_name to item_name component fix",
         $$0,
         $$2x -> {
            Optional<Pair<String, String>> $$3 = $$2x.getOptional($$1);
            Optional<String> $$4 = $$3.map(Pair::getSecond);
            if ($$4.filter($$0xx -> $$0xx.equals("minecraft:white_banner")).isPresent()) {
               return $$2x.updateTyped($$2, $$0xx -> $$0xx.update(DSL.remainderFinder(), bgs::b));
            } else {
               return $$4.filter($$0xx -> $$0xx.equals("minecraft:filled_map")).isPresent()
                  ? $$2x.updateTyped($$2, $$0xx -> $$0xx.update(DSL.remainderFinder(), bgs::a))
                  : $$2x;
            }
         }
      );
   }

   private static <T> Dynamic<T> a(Dynamic<T> $$0) {
      return a($$0, a::contains);
   }

   private static <T> Dynamic<T> b(Dynamic<T> $$0) {
      return a($$0, $$0x -> $$0x.equals("block.minecraft.ominous_banner"));
   }

   private static <T> Dynamic<T> a(Dynamic<T> $$0, Predicate<String> $$1) {
      OptionalDynamic<T> $$2 = $$0.get("minecraft:custom_name");
      Optional<String> $$3 = $$2.asString().result().flatMap(bbr::a).filter($$1);
      return $$3.isPresent() ? $$0.renameField("minecraft:custom_name", "minecraft:item_name") : $$0;
   }
}
