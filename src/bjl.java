import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.LongStream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bjl extends DataFix {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<String, bjl.a> b = ImmutableMap.builder()
      .put(
         "mineshaft",
         bjl.a.a(
            Map.of(List.of("minecraft:badlands", "minecraft:eroded_badlands", "minecraft:wooded_badlands"), "minecraft:mineshaft_mesa"), "minecraft:mineshaft"
         )
      )
      .put("shipwreck", bjl.a.a(Map.of(List.of("minecraft:beach", "minecraft:snowy_beach"), "minecraft:shipwreck_beached"), "minecraft:shipwreck"))
      .put(
         "ocean_ruin",
         bjl.a.a(
            Map.of(List.of("minecraft:warm_ocean", "minecraft:lukewarm_ocean", "minecraft:deep_lukewarm_ocean"), "minecraft:ocean_ruin_warm"),
            "minecraft:ocean_ruin_cold"
         )
      )
      .put(
         "village",
         bjl.a.a(
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
         bjl.a.a(
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
      .put("pillager_outpost", bjl.a.a("minecraft:pillager_outpost"))
      .put("mansion", bjl.a.a("minecraft:mansion"))
      .put("jungle_pyramid", bjl.a.a("minecraft:jungle_pyramid"))
      .put("desert_pyramid", bjl.a.a("minecraft:desert_pyramid"))
      .put("igloo", bjl.a.a("minecraft:igloo"))
      .put("swamp_hut", bjl.a.a("minecraft:swamp_hut"))
      .put("stronghold", bjl.a.a("minecraft:stronghold"))
      .put("monument", bjl.a.a("minecraft:monument"))
      .put("fortress", bjl.a.a("minecraft:fortress"))
      .put("endcity", bjl.a.a("minecraft:end_city"))
      .put("buried_treasure", bjl.a.a("minecraft:buried_treasure"))
      .put("nether_fossil", bjl.a.a("minecraft:nether_fossil"))
      .put("bastion_remnant", bjl.a.a("minecraft:bastion_remnant"))
      .build();

   public bjl(Schema $$0) {
      super($$0, false);
   }

   protected TypeRewriteRule makeRule() {
      Type<?> $$0 = this.getInputSchema().getType(biq.c);
      Type<?> $$1 = this.getInputSchema().getType(biq.c);
      return this.writeFixAndRead("StucturesToConfiguredStructures", $$0, $$1, this::a);
   }

   private Dynamic<?> a(Dynamic<?> $$0) {
      return $$0.update("structures", $$1 -> $$1.update("starts", $$1x -> this.a($$1x, $$0)).update("References", $$1x -> this.b($$1x, $$0)));
   }

   private Dynamic<?> a(Dynamic<?> $$0, Dynamic<?> $$1) {
      Map<? extends Dynamic<?>, ? extends Dynamic<?>> $$2 = $$0.getMapValues().result().orElse(Map.of());
      HashMap<Dynamic<?>, Dynamic<?>> $$3 = Maps.newHashMap();
      $$2.forEach(($$2x, $$3x) -> {
         if (!$$3x.get("id").asString("INVALID").equals("INVALID")) {
            Dynamic<?> $$4 = this.c($$2x, $$1);
            if ($$4 == null) {
               a.warn("Encountered unknown structure in datafixer: " + $$2x.asString("<missing key>"));
            } else {
               $$3.computeIfAbsent($$4, $$2xx -> $$3x.set("id", $$4));
            }
         }
      });
      return $$1.createMap($$3);
   }

   private Dynamic<?> b(Dynamic<?> $$0, Dynamic<?> $$1) {
      Map<? extends Dynamic<?>, ? extends Dynamic<?>> $$2 = $$0.getMapValues().result().orElse(Map.of());
      HashMap<Dynamic<?>, Dynamic<?>> $$3 = Maps.newHashMap();
      $$2.forEach(($$2x, $$3x) -> {
         if ($$3x.asLongStream().count() != 0L) {
            Dynamic<?> $$4 = this.c($$2x, $$1);
            if ($$4 == null) {
               a.warn("Encountered unknown structure in datafixer: " + $$2x.asString("<missing key>"));
            } else {
               $$3.compute($$4, ($$1xx, $$2xx) -> $$2xx == null ? $$3x : $$3x.createLongList(LongStream.concat($$2xx.asLongStream(), $$3x.asLongStream())));
            }
         }
      });
      return $$1.createMap($$3);
   }

   @Nullable
   private Dynamic<?> c(Dynamic<?> $$0, Dynamic<?> $$1) {
      String $$2 = $$0.asString("UNKNOWN").toLowerCase(Locale.ROOT);
      bjl.a $$3 = b.get($$2);
      if ($$3 == null) {
         return null;
      } else {
         String $$4 = $$3.b;
         if (!$$3.a().isEmpty()) {
            Optional<String> $$5 = this.a($$1, $$3);
            if ($$5.isPresent()) {
               $$4 = $$5.get();
            }
         }

         return $$1.createString($$4);
      }
   }

   private Optional<String> a(Dynamic<?> $$0, bjl.a $$1) {
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

      public static bjl.a a(String $$0) {
         return new bjl.a(Map.of(), $$0);
      }

      public static bjl.a a(Map<List<String>, String> $$0, String $$1) {
         return new bjl.a(a($$0), $$1);
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
