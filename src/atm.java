import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.Map;

public class atm extends DataFix {
   private static final Map<String, String> a = ImmutableMap.builder()
      .put("generic.maxHealth", "generic.max_health")
      .put("Max Health", "generic.max_health")
      .put("zombie.spawnReinforcements", "zombie.spawn_reinforcements")
      .put("Spawn Reinforcements Chance", "zombie.spawn_reinforcements")
      .put("horse.jumpStrength", "horse.jump_strength")
      .put("Jump Strength", "horse.jump_strength")
      .put("generic.followRange", "generic.follow_range")
      .put("Follow Range", "generic.follow_range")
      .put("generic.knockbackResistance", "generic.knockback_resistance")
      .put("Knockback Resistance", "generic.knockback_resistance")
      .put("generic.movementSpeed", "generic.movement_speed")
      .put("Movement Speed", "generic.movement_speed")
      .put("generic.flyingSpeed", "generic.flying_speed")
      .put("Flying Speed", "generic.flying_speed")
      .put("generic.attackDamage", "generic.attack_damage")
      .put("generic.attackKnockback", "generic.attack_knockback")
      .put("generic.attackSpeed", "generic.attack_speed")
      .put("generic.armorToughness", "generic.armor_toughness")
      .build();

   public atm(Schema $$0) {
      super($$0, false);
   }

   protected TypeRewriteRule makeRule() {
      Type<?> $$0 = this.getInputSchema().getType(ayz.t);
      OpticFinder<?> $$1 = $$0.findField("tag");
      return TypeRewriteRule.seq(
         this.fixTypeEverywhereTyped("Rename ItemStack Attributes", $$0, $$1x -> $$1x.updateTyped($$1, atm::a)),
         new TypeRewriteRule[]{
            this.fixTypeEverywhereTyped("Rename Entity Attributes", this.getInputSchema().getType(ayz.x), atm::b),
            this.fixTypeEverywhereTyped("Rename Player Attributes", this.getInputSchema().getType(ayz.b), atm::b)
         }
      );
   }

   private static Dynamic<?> a(Dynamic<?> $$0) {
      return (Dynamic<?>)DataFixUtils.orElse($$0.asString().result().map($$0x -> a.getOrDefault($$0x, $$0x)).map($$0::createString), $$0);
   }

   private static Typed<?> a(Typed<?> $$0) {
      return $$0.update(
         DSL.remainderFinder(),
         $$0x -> $$0x.update(
               "AttributeModifiers",
               $$0xx -> (Dynamic)DataFixUtils.orElse(
                     $$0xx.asStreamOpt().result().map($$0xxx -> $$0xxx.map($$0xxxx -> $$0xxxx.update("AttributeName", atm::a))).map($$0xx::createList), $$0xx
                  )
            )
      );
   }

   private static Typed<?> b(Typed<?> $$0) {
      return $$0.update(
         DSL.remainderFinder(),
         $$0x -> $$0x.update(
               "Attributes",
               $$0xx -> (Dynamic)DataFixUtils.orElse(
                     $$0xx.asStreamOpt().result().map($$0xxx -> $$0xxx.map($$0xxxx -> $$0xxxx.update("Name", atm::a))).map($$0xx::createList), $$0xx
                  )
            )
      );
   }
}
