import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import java.util.Set;

public class bag extends DataFix {
   private static final Set<String> a = Set.of("minecraft:potion", "minecraft:splash_potion", "minecraft:lingering_potion", "minecraft:tipped_arrow");

   public bag(Schema $$0) {
      super($$0, false);
   }

   protected TypeRewriteRule makeRule() {
      Schema $$0 = this.getInputSchema();
      Type<?> $$1 = this.getInputSchema().getType(beh.t);
      OpticFinder<Pair<String, String>> $$2 = DSL.fieldFinder("id", DSL.named(beh.A.typeName(), bfq.a()));
      OpticFinder<?> $$3 = $$1.findField("tag");
      return TypeRewriteRule.seq(
         this.fixTypeEverywhereTyped("EffectDurationEntity", $$0.getType(beh.y), $$0x -> $$0x.update(DSL.remainderFinder(), this::c)),
         new TypeRewriteRule[]{
            this.fixTypeEverywhereTyped("EffectDurationPlayer", $$0.getType(beh.b), $$0x -> $$0x.update(DSL.remainderFinder(), this::c)),
            this.fixTypeEverywhereTyped("EffectDurationItem", $$1, $$2x -> {
               Optional<Pair<String, String>> $$3x = $$2x.getOptional($$2);
               if ($$3x.filter(a::contains).isPresent()) {
                  Optional<? extends Typed<?>> $$4 = $$2x.getOptionalTyped($$3);
                  if ($$4.isPresent()) {
                     Dynamic<?> $$5 = (Dynamic<?>)$$4.get().get(DSL.remainderFinder());
                     Typed<?> $$6 = $$4.get().set(DSL.remainderFinder(), $$5.update("CustomPotionEffects", this::b));
                     return $$2x.set($$3, $$6);
                  }
               }

               return $$2x;
            })
         }
      );
   }

   private Dynamic<?> a(Dynamic<?> $$0) {
      return $$0.update("FactorCalculationData", $$1 -> {
         int $$2 = $$1.get("effect_changed_timestamp").asInt(-1);
         $$1 = $$1.remove("effect_changed_timestamp");
         int $$3 = $$0.get("Duration").asInt(-1);
         int $$4 = $$2 - $$3;
         return $$1.set("ticks_active", $$1.createInt($$4));
      });
   }

   private Dynamic<?> b(Dynamic<?> $$0) {
      return $$0.createList($$0.asStream().map(this::a));
   }

   private Dynamic<?> c(Dynamic<?> $$0) {
      $$0 = $$0.update("Effects", this::b);
      $$0 = $$0.update("ActiveEffects", this::b);
      return $$0.update("CustomPotionEffects", this::b);
   }
}
