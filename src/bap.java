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
import com.mojang.serialization.OptionalDynamic;
import java.util.Map;

public class bap extends DataFix {
   public bap(Schema $$0) {
      super($$0, false);
   }

   public TypeRewriteRule makeRule() {
      Type<?> $$0 = this.getInputSchema().getType(bgs.s);
      TaggedChoiceType<?> $$1 = this.getInputSchema().findChoiceType(bgs.s);
      OpticFinder<?> $$2 = $$0.findField("components");
      return this.fixTypeEverywhereTyped("Banner entity custom_name to item_name component fix", $$0, $$2x -> {
         Object $$3 = ((Pair)$$2x.get($$1.finder())).getFirst();
         return $$3.equals("minecraft:banner") ? this.a($$2x, $$2) : $$2x;
      });
   }

   private Typed<?> a(Typed<?> $$0, OpticFinder<?> $$1) {
      Dynamic<?> $$2 = (Dynamic<?>)$$0.getOptional(DSL.remainderFinder()).orElseThrow();
      OptionalDynamic<?> $$3 = $$2.get("CustomName");
      boolean $$4 = $$3.asString().result().flatMap(baa::a).filter($$0x -> $$0x.equals("block.minecraft.ominous_banner")).isPresent();
      if ($$4) {
         Typed<?> $$5 = $$0.getOrCreateTyped($$1)
            .update(
               DSL.remainderFinder(),
               $$1x -> $$1x.set("minecraft:item_name", (Dynamic)$$3.result().get()).set("minecraft:hide_additional_tooltip", $$1x.createMap(Map.of()))
            );
         return $$0.set($$1, $$5).set(DSL.remainderFinder(), $$2.remove("CustomName"));
      } else {
         return $$0;
      }
   }
}
