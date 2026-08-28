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

public class bdr extends DataFix {
   private static final Set<String> a = Set.of("minecraft:potion", "minecraft:splash_potion", "minecraft:lingering_potion", "minecraft:tipped_arrow");

   public bdr(Schema $$0) {
      super($$0, false);
   }

   protected TypeRewriteRule makeRule() {
      Schema $$0 = this.getInputSchema();
      Type<?> $$1 = this.getInputSchema().getType(biq.t);
      OpticFinder<Pair<String, String>> $$2 = DSL.fieldFinder("id", DSL.named(biq.F.typeName(), bkj.a()));
      OpticFinder<?> $$3 = $$1.findField("tag");
      return TypeRewriteRule.seq(
         this.fixTypeEverywhereTyped("EffectDurationEntity", $$0.getType(biq.D), $$0x -> $$0x.update(DSL.remainderFinder(), this::c)),
         new TypeRewriteRule[]{
            this.fixTypeEverywhereTyped("EffectDurationPlayer", $$0.getType(biq.b), $$0x -> $$0x.update(DSL.remainderFinder(), this::c)),
            this.fixTypeEverywhereTyped("EffectDurationItem", $$1, $$2x -> {
               if ($$2x.getOptional($$2).filter($$0xx -> a.contains($$0xx.getSecond())).isPresent()) {
                  Optional<? extends Typed<?>> $$3x = $$2x.getOptionalTyped($$3);
                  if ($$3x.isPresent()) {
                     Dynamic<?> $$4 = (Dynamic<?>)$$3x.get().get(DSL.remainderFinder());
                     Typed<?> $$5 = $$3x.get().set(DSL.remainderFinder(), $$4.update("CustomPotionEffects", this::b));
                     return $$2x.set($$3, $$5);
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
