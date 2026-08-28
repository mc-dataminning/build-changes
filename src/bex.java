import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;

public class bex extends DataFix {
   public bex(Schema $$0, boolean $$1) {
      super($$0, $$1);
   }

   public TypeRewriteRule makeRule() {
      Type<?> $$0 = this.getInputSchema().getType(bgv.t);
      OpticFinder<Pair<String, String>> $$1 = DSL.fieldFinder("id", DSL.named(bgv.D.typeName(), big.a()));
      OpticFinder<?> $$2 = $$0.findField("tag");
      return this.fixTypeEverywhereTyped("ItemInstanceMapIdFix", $$0, $$2x -> {
         Optional<Pair<String, String>> $$3 = $$2x.getOptional($$1);
         if ($$3.isPresent() && Objects.equals($$3.get().getSecond(), "minecraft:filled_map")) {
            Dynamic<?> $$4 = (Dynamic<?>)$$2x.get(DSL.remainderFinder());
            Typed<?> $$5 = $$2x.getOrCreateTyped($$2);
            Dynamic<?> $$6 = (Dynamic<?>)$$5.get(DSL.remainderFinder());
            $$6 = $$6.set("map", $$6.createInt($$4.get("Damage").asInt(0)));
            return $$2x.set($$2, $$5.set(DSL.remainderFinder(), $$6));
         } else {
            return $$2x;
         }
      });
   }
}
