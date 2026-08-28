import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Stream;

public class bfs extends DataFix {
   private static final Int2ObjectMap<String> a = ac.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, "minecraft:speed");
      $$0.put(2, "minecraft:slowness");
      $$0.put(3, "minecraft:haste");
      $$0.put(4, "minecraft:mining_fatigue");
      $$0.put(5, "minecraft:strength");
      $$0.put(6, "minecraft:instant_health");
      $$0.put(7, "minecraft:instant_damage");
      $$0.put(8, "minecraft:jump_boost");
      $$0.put(9, "minecraft:nausea");
      $$0.put(10, "minecraft:regeneration");
      $$0.put(11, "minecraft:resistance");
      $$0.put(12, "minecraft:fire_resistance");
      $$0.put(13, "minecraft:water_breathing");
      $$0.put(14, "minecraft:invisibility");
      $$0.put(15, "minecraft:blindness");
      $$0.put(16, "minecraft:night_vision");
      $$0.put(17, "minecraft:hunger");
      $$0.put(18, "minecraft:weakness");
      $$0.put(19, "minecraft:poison");
      $$0.put(20, "minecraft:wither");
      $$0.put(21, "minecraft:health_boost");
      $$0.put(22, "minecraft:absorption");
      $$0.put(23, "minecraft:saturation");
      $$0.put(24, "minecraft:glowing");
      $$0.put(25, "minecraft:levitation");
      $$0.put(26, "minecraft:luck");
      $$0.put(27, "minecraft:unluck");
      $$0.put(28, "minecraft:slow_falling");
      $$0.put(29, "minecraft:conduit_power");
      $$0.put(30, "minecraft:dolphins_grace");
      $$0.put(31, "minecraft:bad_omen");
      $$0.put(32, "minecraft:hero_of_the_village");
      $$0.put(33, "minecraft:darkness");
   });
   private static final Set<String> b = Set.of("minecraft:potion", "minecraft:splash_potion", "minecraft:lingering_potion", "minecraft:tipped_arrow");

   public bfs(Schema $$0) {
      super($$0, false);
   }

   private static <T> Optional<Dynamic<T>> a(Dynamic<T> $$0, String $$1) {
      return $$0.get($$1).asNumber().result().map($$0x -> (String)a.get($$0x.intValue())).map($$0::createString);
   }

   private static <T> Dynamic<T> a(Dynamic<T> $$0, String $$1, Dynamic<T> $$2, String $$3) {
      Optional<Dynamic<T>> $$4 = a($$0, $$1);
      return $$2.replaceField($$1, $$3, $$4);
   }

   private static <T> Dynamic<T> a(Dynamic<T> $$0, String $$1, String $$2) {
      return a($$0, $$1, $$0, $$2);
   }

   private static <T> Dynamic<T> a(Dynamic<T> $$0) {
      $$0 = a($$0, "Id", "id");
      $$0 = $$0.renameField("Ambient", "ambient");
      $$0 = $$0.renameField("Amplifier", "amplifier");
      $$0 = $$0.renameField("Duration", "duration");
      $$0 = $$0.renameField("ShowParticles", "show_particles");
      $$0 = $$0.renameField("ShowIcon", "show_icon");
      Optional<Dynamic<T>> $$1 = $$0.get("HiddenEffect").result().map(bfs::a);
      return $$0.replaceField("HiddenEffect", "hidden_effect", $$1);
   }

   private static <T> Dynamic<T> b(Dynamic<T> $$0, String $$1, String $$2) {
      Optional<Dynamic<T>> $$3 = $$0.get($$1).asStreamOpt().result().map($$1x -> $$0.createList($$1x.map(bfs::a)));
      return $$0.replaceField($$1, $$2, $$3);
   }

   private static <T> Dynamic<T> a(Dynamic<T> $$0, Dynamic<T> $$1) {
      $$1 = a($$0, "EffectId", $$1, "id");
      Optional<Dynamic<T>> $$2 = $$0.get("EffectDuration").result();
      return $$1.replaceField("EffectDuration", "duration", $$2);
   }

   private static <T> Dynamic<T> b(Dynamic<T> $$0) {
      return a($$0, $$0);
   }

   private Typed<?> a(Typed<?> $$0, TypeReference $$1, String $$2, Function<Dynamic<?>, Dynamic<?>> $$3) {
      Type<?> $$4 = this.getInputSchema().getChoiceType($$1, $$2);
      Type<?> $$5 = this.getOutputSchema().getChoiceType($$1, $$2);
      return $$0.updateTyped(DSL.namedChoice($$2, $$4), $$5, $$1x -> $$1x.update(DSL.remainderFinder(), $$3));
   }

   private TypeRewriteRule a() {
      Type<?> $$0 = this.getInputSchema().getType(bgw.s);
      return this.fixTypeEverywhereTyped("BlockEntityMobEffectIdFix", $$0, $$0x -> this.a($$0x, bgw.s, "minecraft:beacon", $$0xx -> {
            $$0xx = a($$0xx, "Primary", "primary_effect");
            return a($$0xx, "Secondary", "secondary_effect");
         }));
   }

   private static <T> Dynamic<T> c(Dynamic<T> $$0) {
      Dynamic<T> $$1 = $$0.emptyMap();
      Dynamic<T> $$2 = a($$0, $$1);
      if (!$$2.equals($$1)) {
         $$0 = $$0.set("stew_effects", $$0.createList(Stream.of($$2)));
      }

      return $$0.remove("EffectId").remove("EffectDuration");
   }

   private static <T> Dynamic<T> d(Dynamic<T> $$0) {
      return b($$0, "CustomPotionEffects", "custom_potion_effects");
   }

   private static <T> Dynamic<T> e(Dynamic<T> $$0) {
      return b($$0, "Effects", "effects");
   }

   private static Dynamic<?> f(Dynamic<?> $$0) {
      return b($$0, "ActiveEffects", "active_effects");
   }

   private TypeRewriteRule b() {
      Type<?> $$0 = this.getInputSchema().getType(bgw.B);
      return this.fixTypeEverywhereTyped("EntityMobEffectIdFix", $$0, $$0x -> {
         $$0x = this.a($$0x, bgw.B, "minecraft:mooshroom", bfs::c);
         $$0x = this.a($$0x, bgw.B, "minecraft:arrow", bfs::d);
         $$0x = this.a($$0x, bgw.B, "minecraft:area_effect_cloud", bfs::e);
         return $$0x.update(DSL.remainderFinder(), bfs::f);
      });
   }

   private TypeRewriteRule c() {
      Type<?> $$0 = this.getInputSchema().getType(bgw.b);
      return this.fixTypeEverywhereTyped("PlayerMobEffectIdFix", $$0, $$0x -> $$0x.update(DSL.remainderFinder(), bfs::f));
   }

   private static <T> Dynamic<T> g(Dynamic<T> $$0) {
      Optional<Dynamic<T>> $$1 = $$0.get("Effects").asStreamOpt().result().map($$1x -> $$0.createList($$1x.map(bfs::b)));
      return $$0.replaceField("Effects", "effects", $$1);
   }

   private TypeRewriteRule d() {
      OpticFinder<Pair<String, String>> $$0 = DSL.fieldFinder("id", DSL.named(bgw.D.typeName(), bih.a()));
      Type<?> $$1 = this.getInputSchema().getType(bgw.t);
      OpticFinder<?> $$2 = $$1.findField("tag");
      return this.fixTypeEverywhereTyped("ItemStackMobEffectIdFix", $$1, $$2x -> {
         Optional<Pair<String, String>> $$3 = $$2x.getOptional($$0);
         if ($$3.isPresent()) {
            String $$4 = (String)$$3.get().getSecond();
            if ($$4.equals("minecraft:suspicious_stew")) {
               return $$2x.updateTyped($$2, $$0xx -> $$0xx.update(DSL.remainderFinder(), bfs::g));
            }

            if (b.contains($$4)) {
               return $$2x.updateTyped($$2, $$0xx -> $$0xx.update(DSL.remainderFinder(), $$0xxx -> b($$0xxx, "CustomPotionEffects", "custom_potion_effects")));
            }
         }

         return $$2x;
      });
   }

   protected TypeRewriteRule makeRule() {
      return TypeRewriteRule.seq(this.a(), new TypeRewriteRule[]{this.b(), this.c(), this.d()});
   }
}
