import com.google.common.collect.Sets;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import java.util.Set;
import org.slf4j.Logger;

public class ayd extends avc {
   private static final Logger b = LogUtils.getLogger();
   private static final Set<String> c = Sets.newHashSet();
   private static final Set<String> d = Sets.newHashSet();
   private static final Set<String> e = Sets.newHashSet();
   private static final Set<String> f = Sets.newHashSet();
   private static final Set<String> g = Sets.newHashSet();
   private static final Set<String> h = Sets.newHashSet();

   public ayd(Schema $$0) {
      super($$0, bax.x);
   }

   protected TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped("EntityUUIDFixes", this.getInputSchema().getType(this.a), $$0 -> {
         $$0 = $$0.update(DSL.remainderFinder(), ayd::c);

         for (String $$1 : c) {
            $$0 = this.a($$0, $$1, ayd::l);
         }

         for (String $$2 : d) {
            $$0 = this.a($$0, $$2, ayd::l);
         }

         for (String $$3 : e) {
            $$0 = this.a($$0, $$3, ayd::m);
         }

         for (String $$4 : f) {
            $$0 = this.a($$0, $$4, ayd::n);
         }

         for (String $$5 : g) {
            $$0 = this.a($$0, $$5, ayd::b);
         }

         for (String $$6 : h) {
            $$0 = this.a($$0, $$6, ayd::o);
         }

         $$0 = this.a($$0, "minecraft:bee", ayd::k);
         $$0 = this.a($$0, "minecraft:zombified_piglin", ayd::k);
         $$0 = this.a($$0, "minecraft:fox", ayd::j);
         $$0 = this.a($$0, "minecraft:item", ayd::i);
         $$0 = this.a($$0, "minecraft:shulker_bullet", ayd::h);
         $$0 = this.a($$0, "minecraft:area_effect_cloud", ayd::g);
         $$0 = this.a($$0, "minecraft:zombie_villager", ayd::f);
         $$0 = this.a($$0, "minecraft:evoker_fangs", ayd::e);
         return this.a($$0, "minecraft:piglin", ayd::d);
      });
   }

   private static Dynamic<?> d(Dynamic<?> $$0) {
      return $$0.update(
         "Brain", $$0x -> $$0x.update("memories", $$0xx -> $$0xx.update("minecraft:angry_at", $$0xxx -> a($$0xxx, "value", "value").orElseGet(() -> {
                     b.warn("angry_at has no value.");
                     return $$0xxx;
                  })))
      );
   }

   private static Dynamic<?> e(Dynamic<?> $$0) {
      return c($$0, "OwnerUUID", "Owner").orElse($$0);
   }

   private static Dynamic<?> f(Dynamic<?> $$0) {
      return c($$0, "ConversionPlayer", "ConversionPlayer").orElse($$0);
   }

   private static Dynamic<?> g(Dynamic<?> $$0) {
      return c($$0, "OwnerUUID", "Owner").orElse($$0);
   }

   private static Dynamic<?> h(Dynamic<?> $$0) {
      $$0 = b($$0, "Owner", "Owner").orElse($$0);
      return b($$0, "Target", "Target").orElse($$0);
   }

   private static Dynamic<?> i(Dynamic<?> $$0) {
      $$0 = b($$0, "Owner", "Owner").orElse($$0);
      return b($$0, "Thrower", "Thrower").orElse($$0);
   }

   private static Dynamic<?> j(Dynamic<?> $$0) {
      Optional<Dynamic<?>> $$1 = $$0.get("TrustedUUIDs").result().map($$1x -> $$0.createList($$1x.asStream().map($$0xx -> (Dynamic)a($$0xx).orElseGet(() -> {
               b.warn("Trusted contained invalid data.");
               return $$0xx;
            }))));
      return (Dynamic<?>)DataFixUtils.orElse($$1.map($$1x -> $$0.remove("TrustedUUIDs").set("Trusted", $$1x)), $$0);
   }

   private static Dynamic<?> k(Dynamic<?> $$0) {
      return a($$0, "HurtBy", "HurtBy").orElse($$0);
   }

   private static Dynamic<?> l(Dynamic<?> $$0) {
      Dynamic<?> $$1 = m($$0);
      return a($$1, "OwnerUUID", "Owner").orElse($$1);
   }

   private static Dynamic<?> m(Dynamic<?> $$0) {
      Dynamic<?> $$1 = n($$0);
      return c($$1, "LoveCause", "LoveCause").orElse($$1);
   }

   private static Dynamic<?> n(Dynamic<?> $$0) {
      return b($$0).update("Leash", $$0x -> c($$0x, "UUID", "UUID").orElse($$0x));
   }

   public static Dynamic<?> b(Dynamic<?> $$0) {
      return $$0.update(
         "Attributes",
         $$1 -> $$0.createList(
               $$1.asStream()
                  .map(
                     $$0xx -> $$0xx.update(
                           "Modifiers", $$1x -> $$0xx.createList($$1x.asStream().map($$0xxxx -> (Dynamic)c($$0xxxx, "UUID", "UUID").orElse($$0xxxx)))
                        )
                  )
            )
      );
   }

   private static Dynamic<?> o(Dynamic<?> $$0) {
      return (Dynamic<?>)DataFixUtils.orElse($$0.get("OwnerUUID").result().map($$1 -> $$0.remove("OwnerUUID").set("Owner", $$1)), $$0);
   }

   public static Dynamic<?> c(Dynamic<?> $$0) {
      return c($$0, "UUID", "UUID").orElse($$0);
   }

   static {
      c.add("minecraft:donkey");
      c.add("minecraft:horse");
      c.add("minecraft:llama");
      c.add("minecraft:mule");
      c.add("minecraft:skeleton_horse");
      c.add("minecraft:trader_llama");
      c.add("minecraft:zombie_horse");
      d.add("minecraft:cat");
      d.add("minecraft:parrot");
      d.add("minecraft:wolf");
      e.add("minecraft:bee");
      e.add("minecraft:chicken");
      e.add("minecraft:cow");
      e.add("minecraft:fox");
      e.add("minecraft:mooshroom");
      e.add("minecraft:ocelot");
      e.add("minecraft:panda");
      e.add("minecraft:pig");
      e.add("minecraft:polar_bear");
      e.add("minecraft:rabbit");
      e.add("minecraft:sheep");
      e.add("minecraft:turtle");
      e.add("minecraft:hoglin");
      f.add("minecraft:bat");
      f.add("minecraft:blaze");
      f.add("minecraft:cave_spider");
      f.add("minecraft:cod");
      f.add("minecraft:creeper");
      f.add("minecraft:dolphin");
      f.add("minecraft:drowned");
      f.add("minecraft:elder_guardian");
      f.add("minecraft:ender_dragon");
      f.add("minecraft:enderman");
      f.add("minecraft:endermite");
      f.add("minecraft:evoker");
      f.add("minecraft:ghast");
      f.add("minecraft:giant");
      f.add("minecraft:guardian");
      f.add("minecraft:husk");
      f.add("minecraft:illusioner");
      f.add("minecraft:magma_cube");
      f.add("minecraft:pufferfish");
      f.add("minecraft:zombified_piglin");
      f.add("minecraft:salmon");
      f.add("minecraft:shulker");
      f.add("minecraft:silverfish");
      f.add("minecraft:skeleton");
      f.add("minecraft:slime");
      f.add("minecraft:snow_golem");
      f.add("minecraft:spider");
      f.add("minecraft:squid");
      f.add("minecraft:stray");
      f.add("minecraft:tropical_fish");
      f.add("minecraft:vex");
      f.add("minecraft:villager");
      f.add("minecraft:iron_golem");
      f.add("minecraft:vindicator");
      f.add("minecraft:pillager");
      f.add("minecraft:wandering_trader");
      f.add("minecraft:witch");
      f.add("minecraft:wither");
      f.add("minecraft:wither_skeleton");
      f.add("minecraft:zombie");
      f.add("minecraft:zombie_villager");
      f.add("minecraft:phantom");
      f.add("minecraft:ravager");
      f.add("minecraft:piglin");
      g.add("minecraft:armor_stand");
      h.add("minecraft:arrow");
      h.add("minecraft:dragon_fireball");
      h.add("minecraft:firework_rocket");
      h.add("minecraft:fireball");
      h.add("minecraft:llama_spit");
      h.add("minecraft:small_fireball");
      h.add("minecraft:snowball");
      h.add("minecraft:spectral_arrow");
      h.add("minecraft:egg");
      h.add("minecraft:ender_pearl");
      h.add("minecraft:experience_bottle");
      h.add("minecraft:potion");
      h.add("minecraft:trident");
      h.add("minecraft:wither_skull");
   }
}
