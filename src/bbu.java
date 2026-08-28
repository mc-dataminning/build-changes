import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.TaggedChoice.TaggedChoiceType;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Map;
import java.util.Optional;

public class bbu extends DataFix {
   public bbu(Schema $$0) {
      super($$0, false);
   }

   public TypeRewriteRule makeRule() {
      Type<?> $$0 = this.getInputSchema().getType(biw.s);
      TaggedChoiceType<?> $$1 = this.getInputSchema().findChoiceType(biw.s);
      OpticFinder<?> $$2 = $$0.findField("CustomName");
      OpticFinder<Pair<String, String>> $$3 = DSL.typeFinder(this.getInputSchema().getType(biw.z));
      return this.fixTypeEverywhereTyped("Banner entity custom_name to item_name component fix", $$0, $$3x -> {
         Object $$4 = ((Pair)$$3x.get($$1.finder())).getFirst();
         return $$4.equals("minecraft:banner") ? this.a($$3x, $$3, $$2) : $$3x;
      });
   }

   private Typed<?> a(Typed<?> $$0, OpticFinder<Pair<String, String>> $$1, OpticFinder<?> $$2) {
      Optional<String> $$3 = $$0.getOptionalTyped($$2).flatMap($$1x -> $$1x.getOptional($$1).map(Pair::getSecond));
      boolean $$4 = $$3.flatMap(bbe::d).filter($$0x -> $$0x.equals("block.minecraft.ominous_banner")).isPresent();
      return $$4
         ? af.a(
            $$0,
            $$0.getType(),
            $$1x -> {
               Dynamic<?> $$2x = $$1x.createMap(
                  Map.of(
                     $$1x.createString("minecraft:item_name"),
                     $$1x.createString($$3.get()),
                     $$1x.createString("minecraft:hide_additional_tooltip"),
                     $$1x.emptyMap()
                  )
               );
               return $$1x.set("components", $$2x).remove("CustomName");
            }
         )
         : $$0;
   }
}
