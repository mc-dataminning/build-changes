import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;

public class azj extends DataFix {
   private static final Map<String, azj.a> a = ImmutableMap.builder()
      .put(
         "mineshaft",
         azj.a.a(
            Map.of(List.of("minecraft:badlands", "minecraft:eroded_badlands", "minecraft:wooded_badlands"), "minecraft:mineshaft_mesa"), "minecraft:mineshaft"
         )
      )
      .put("shipwreck", azj.a.a(Map.of(List.of("minecraft:beach", "minecraft:snowy_beach"), "minecraft:shipwreck_beached"), "minecraft:shipwreck"))
      .put(
         "ocean_ruin",
         azj.a.a(
            Map.of(List.of("minecraft:warm_ocean", "minecraft:lukewarm_ocean", "minecraft:deep_lukewarm_ocean"), "minecraft:ocean_ruin_warm"),
            "minecraft:ocean_ruin_cold"
         )
      )
      .put(
         "village",
         azj.a.a(
            Map.of(
               List.of("minecraft:desert"),
               "minecraft:village_desert",
               List.of("minecraft:savanna"),
               "minecraft:village_savanna",
               List.of("minecraft:snowy_plains"),
               "minecraft:village_snowy",
               List.of("minecraft:taiga"),
               "minecraft:village_taiga"
            ),
            "minecraft:village_plains"
         )
      )
      .put(
         "ruined_portal",
         azj.a.a(
            Map.of(
               List.of("minecraft:desert"),
               "minecraft:ruined_portal_desert",
               List.of(
                  "minecraft:badlands",
                  "minecraft:eroded_badlands",
                  "minecraft:wooded_badlands",
                  "minecraft:windswept_hills",
                  "minecraft:windswept_forest",
                  "minecraft:windswept_gravelly_hills",
                  "minecraft:savanna_plateau",
                  "minecraft:windswept_savanna",
                  "minecraft:stony_shore",
                  "minecraft:meadow",
                  "minecraft:frozen_peaks",
                  "minecraft:jagged_peaks",
                  "minecraft:stony_peaks",
                  "minecraft:snowy_slopes"
               ),
               "minecraft:ruined_portal_mountain",
               List.of("minecraft:bamboo_jungle", "minecraft:jungle", "minecraft:sparse_jungle"),
               "minecraft:ruined_portal_jungle",
               List.of(
                  "minecraft:deep_frozen_ocean",
                  "minecraft:deep_cold_ocean",
                  "minecraft:deep_ocean",
                  "minecraft:deep_lukewarm_ocean",
                  "minecraft:frozen_ocean",
                  "minecraft:ocean",
                  "minecraft:cold_ocean",
                  "minecraft:lukewarm_ocean",
                  "minecraft:warm_ocean"
               ),
               "minecraft:ruined_portal_ocean"
            ),
            "minecraft:ruined_portal"
         )
      )
      .put("pillager_outpost", azj.a.a("minecraft:pillager_outpost"))
      .put("mansion", azj.a.a("minecraft:mansion"))
      .put("jungle_pyramid", azj.a.a("minecraft:jungle_pyramid"))
      .put("desert_pyramid", azj.a.a("minecraft:desert_pyramid"))
      .put("igloo", azj.a.a("minecraft:igloo"))
      .put("swamp_hut", azj.a.a("minecraft:swamp_hut"))
      .put("stronghold", azj.a.a("minecraft:stronghold"))
      .put("monument", azj.a.a("minecraft:monument"))
      .put("fortress", azj.a.a("minecraft:fortress"))
      .put("endcity", azj.a.a("minecraft:end_city"))
      .put("buried_treasure", azj.a.a("minecraft:buried_treasure"))
      .put("nether_fossil", azj.a.a("minecraft:nether_fossil"))
      .put("bastion_remnant", azj.a.a("minecraft:bastion_remnant"))
      .build();

   public azj(Schema $$0) {
      super($$0, false);
   }

   protected TypeRewriteRule makeRule() {
      Type<?> $$0 = this.getInputSchema().getType(ays.c);
      Type<?> $$1 = this.getInputSchema().getType(ays.c);
      return this.writeFixAndRead("StucturesToConfiguredStructures", $$0, $$1, this::a);
   }

   private Dynamic<?> a(Dynamic<?> $$0) {
      return $$0.update("structures", $$1 -> $$1.update("starts", $$1x -> this.a($$1x, $$0)).update("References", $$1x -> this.b($$1x, $$0)));
   }

   private Dynamic<?> a(Dynamic<?> $$0, Dynamic<?> $$1) {
      Map<? extends Dynamic<?>, ? extends Dynamic<?>> $$2 = (Map<? extends Dynamic<?>, ? extends Dynamic<?>>)$$0.getMapValues().result().get();
      List<Dynamic<?>> $$3 = new ArrayList<>();
      $$2.forEach(($$1x, $$2x) -> {
         if ($$2x.get("id").asString("INVALID").equals("INVALID")) {
            $$3.add($$1x);
         }
      });

      for (Dynamic<?> $$4 : $$3) {
         $$0 = $$0.remove($$4.asString(""));
      }

      return $$0.updateMapValues($$1x -> this.a($$1x, $$1));
   }

   private Pair<Dynamic<?>, Dynamic<?>> a(Pair<Dynamic<?>, Dynamic<?>> $$0, Dynamic<?> $$1) {
      Dynamic<?> $$2 = this.c($$0, $$1);
      return new Pair($$2, ((Dynamic)$$0.getSecond()).set("id", $$2));
   }

   private Dynamic<?> b(Dynamic<?> $$0, Dynamic<?> $$1) {
      Map<? extends Dynamic<?>, ? extends Dynamic<?>> $$2 = (Map<? extends Dynamic<?>, ? extends Dynamic<?>>)$$0.getMapValues().result().get();
      List<Dynamic<?>> $$3 = new ArrayList<>();
      $$2.forEach(($$1x, $$2x) -> {
         if ($$2x.asLongStream().count() == 0L) {
            $$3.add($$1x);
         }
      });

      for (Dynamic<?> $$4 : $$3) {
         $$0 = $$0.remove($$4.asString(""));
      }

      return $$0.updateMapValues($$1x -> this.b($$1x, $$1));
   }

   private Pair<Dynamic<?>, Dynamic<?>> b(Pair<Dynamic<?>, Dynamic<?>> $$0, Dynamic<?> $$1) {
      return $$0.mapFirst($$2 -> this.c($$0, $$1));
   }

   private Dynamic<?> c(Pair<Dynamic<?>, Dynamic<?>> $$0, Dynamic<?> $$1) {
      String $$2 = ((Dynamic)$$0.getFirst()).asString("UNKNOWN").toLowerCase(Locale.ROOT);
      azj.a $$3 = a.get($$2);
      if ($$3 == null) {
         throw new IllegalStateException("Found unknown structure: " + $$2);
      } else {
         Dynamic<?> $$4 = (Dynamic<?>)$$0.getSecond();
         String $$5 = $$3.b;
         if (!$$3.a().isEmpty()) {
            Optional<String> $$6 = this.a($$1, $$3);
            if ($$6.isPresent()) {
               $$5 = $$6.get();
            }
         }

         return $$4.createString($$5);
      }
   }

   private Optional<String> a(Dynamic<?> $$0, azj.a $$1) {
      Object2IntArrayMap<String> $$2 = new Object2IntArrayMap();
      $$0.get("sections").asList(Function.identity()).forEach($$2x -> $$2x.get("biomes").get("palette").asList(Function.identity()).forEach($$2xx -> {
            String $$3 = $$1.a().get($$2xx.asString(""));
            if ($$3 != null) {
               $$2.mergeInt($$3, 1, Integer::sum);
            }
         }));
      return $$2.object2IntEntrySet().stream().max(Comparator.comparingInt(it.unimi.dsi.fastutil.objects.Object2IntMap.Entry::getIntValue)).map(Entry::getKey);
   }

   static record a(Map<String, String> a, String b) {

      public static azj.a a(String $$0) {
         return new azj.a(Map.of(), $$0);
      }

      public static azj.a a(Map<List<String>, String> $$0, String $$1) {
         return new azj.a(a($$0), $$1);
      }

      private static Map<String, String> a(Map<List<String>, String> $$0) {
         Builder<String, String> $$1 = ImmutableMap.builder();

         for (Entry<List<String>, String> $$2 : $$0.entrySet()) {
            $$2.getKey().forEach($$2x -> $$1.put($$2x, $$2.getValue()));
         }

         return $$1.build();
      }
   }
}
