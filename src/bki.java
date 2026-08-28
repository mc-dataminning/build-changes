import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicLike;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.OptionalDynamic;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.apache.commons.lang3.mutable.MutableInt;

public class bki extends DataFix {
   private static final String a = "minecraft:village";
   private static final String b = "minecraft:desert_pyramid";
   private static final String c = "minecraft:igloo";
   private static final String d = "minecraft:jungle_pyramid";
   private static final String e = "minecraft:swamp_hut";
   private static final String f = "minecraft:pillager_outpost";
   private static final String g = "minecraft:endcity";
   private static final String h = "minecraft:mansion";
   private static final String i = "minecraft:monument";
   private static final ImmutableMap<String, bki.a> j = ImmutableMap.builder()
      .put("minecraft:village", new bki.a(32, 8, 10387312))
      .put("minecraft:desert_pyramid", new bki.a(32, 8, 14357617))
      .put("minecraft:igloo", new bki.a(32, 8, 14357618))
      .put("minecraft:jungle_pyramid", new bki.a(32, 8, 14357619))
      .put("minecraft:swamp_hut", new bki.a(32, 8, 14357620))
      .put("minecraft:pillager_outpost", new bki.a(32, 8, 165745296))
      .put("minecraft:monument", new bki.a(32, 5, 10387313))
      .put("minecraft:endcity", new bki.a(20, 11, 10387313))
      .put("minecraft:mansion", new bki.a(80, 20, 10387319))
      .build();

   public bki(Schema $$0) {
      super($$0, true);
   }

   protected TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped("WorldGenSettings building", this.getInputSchema().getType(bit.O), $$0 -> $$0.update(DSL.remainderFinder(), bki::a));
   }

   private static <T> Dynamic<T> a(long $$0, DynamicLike<T> $$1, Dynamic<T> $$2, Dynamic<T> $$3) {
      return $$1.createMap(
         ImmutableMap.of(
            $$1.createString("type"),
            $$1.createString("minecraft:noise"),
            $$1.createString("biome_source"),
            $$3,
            $$1.createString("seed"),
            $$1.createLong($$0),
            $$1.createString("settings"),
            $$2
         )
      );
   }

   private static <T> Dynamic<T> a(Dynamic<T> $$0, long $$1, boolean $$2, boolean $$3) {
      Builder<Dynamic<T>, Dynamic<T>> $$4 = ImmutableMap.builder()
         .put($$0.createString("type"), $$0.createString("minecraft:vanilla_layered"))
         .put($$0.createString("seed"), $$0.createLong($$1))
         .put($$0.createString("large_biomes"), $$0.createBoolean($$3));
      if ($$2) {
         $$4.put($$0.createString("legacy_biome_init_layer"), $$0.createBoolean($$2));
      }

      return $$0.createMap($$4.build());
   }

   private static <T> Dynamic<T> a(Dynamic<T> $$0) {
      DynamicOps<T> $$1 = $$0.getOps();
      long $$2 = $$0.get("RandomSeed").asLong(0L);
      Optional<String> $$3 = $$0.get("generatorName").asString().map($$0x -> $$0x.toLowerCase(Locale.ROOT)).result();
      Optional<String> $$4 = $$0.get("legacy_custom_options")
         .asString()
         .result()
         .map(Optional::of)
         .orElseGet(() -> $$3.equals(Optional.of("customized")) ? $$0.get("generatorOptions").asString().result() : Optional.empty());
      boolean $$5 = false;
      Dynamic<T> $$6;
      if ($$3.equals(Optional.of("customized"))) {
         $$6 = a($$0, $$2);
      } else if ($$3.isEmpty()) {
         $$6 = a($$0, $$2);
      } else {
         String $$28 = $$3.get();
         switch ($$28) {
            case "flat":
               OptionalDynamic<T> $$8 = $$0.get("generatorOptions");
               Map<Dynamic<T>, Dynamic<T>> $$9 = a($$1, $$8);
               $$6 = $$0.createMap(
                  ImmutableMap.of(
                     $$0.createString("type"),
                     $$0.createString("minecraft:flat"),
                     $$0.createString("settings"),
                     $$0.createMap(
                        ImmutableMap.of(
                           $$0.createString("structures"),
                           $$0.createMap($$9),
                           $$0.createString("layers"),
                           $$8.get("layers")
                              .result()
                              .orElseGet(
                                 () -> $$0.createList(
                                       Stream.of(
                                          $$0.createMap(
                                             ImmutableMap.of(
                                                $$0.createString("height"), $$0.createInt(1), $$0.createString("block"), $$0.createString("minecraft:bedrock")
                                             )
                                          ),
                                          $$0.createMap(
                                             ImmutableMap.of(
                                                $$0.createString("height"), $$0.createInt(2), $$0.createString("block"), $$0.createString("minecraft:dirt")
                                             )
                                          ),
                                          $$0.createMap(
                                             ImmutableMap.of(
                                                $$0.createString("height"),
                                                $$0.createInt(1),
                                                $$0.createString("block"),
                                                $$0.createString("minecraft:grass_block")
                                             )
                                          )
                                       )
                                    )
                              ),
                           $$0.createString("biome"),
                           $$0.createString($$8.get("biome").asString("minecraft:plains"))
                        )
                     )
                  )
               );
               break;
            case "debug_all_block_states":
               $$6 = $$0.createMap(ImmutableMap.of($$0.createString("type"), $$0.createString("minecraft:debug")));
               break;
            case "buffet":
               OptionalDynamic<T> $$12 = $$0.get("generatorOptions");
               OptionalDynamic<?> $$13 = $$12.get("chunk_generator");
               Optional<String> $$14 = $$13.get("type").asString().result();
               Dynamic<T> $$15;
               if (Objects.equals($$14, Optional.of("minecraft:caves"))) {
                  $$15 = $$0.createString("minecraft:caves");
                  $$5 = true;
               } else if (Objects.equals($$14, Optional.of("minecraft:floating_islands"))) {
                  $$15 = $$0.createString("minecraft:floating_islands");
               } else {
                  $$15 = $$0.createString("minecraft:overworld");
               }

               Dynamic<T> $$18 = $$12.get("biome_source")
                  .result()
                  .orElseGet(() -> $$0.createMap(ImmutableMap.of($$0.createString("type"), $$0.createString("minecraft:fixed"))));
               Dynamic<T> $$20;
               if ($$18.get("type").asString().result().equals(Optional.of("minecraft:fixed"))) {
                  String $$19 = $$18.get("options").get("biomes").asStream().findFirst().flatMap($$0x -> $$0x.asString().result()).orElse("minecraft:ocean");
                  $$20 = $$18.remove("options").set("biome", $$0.createString($$19));
               } else {
                  $$20 = $$18;
               }

               $$6 = a($$2, $$0, $$15, $$20);
               break;
            default:
               boolean $$23 = $$3.get().equals("default");
               boolean $$24 = $$3.get().equals("default_1_1") || $$23 && $$0.get("generatorVersion").asInt(0) == 0;
               boolean $$25 = $$3.get().equals("amplified");
               boolean $$26 = $$3.get().equals("largebiomes");
               $$6 = a($$2, $$0, $$0.createString($$25 ? "minecraft:amplified" : "minecraft:overworld"), a($$0, $$2, $$24, $$26));
         }
      }

      boolean $$28 = $$0.get("MapFeatures").asBoolean(true);
      boolean $$29 = $$0.get("BonusChest").asBoolean(false);
      Builder<T, T> $$30 = ImmutableMap.builder();
      $$30.put($$1.createString("seed"), $$1.createLong($$2));
      $$30.put($$1.createString("generate_features"), $$1.createBoolean($$28));
      $$30.put($$1.createString("bonus_chest"), $$1.createBoolean($$29));
      $$30.put($$1.createString("dimensions"), a($$0, $$2, $$6, $$5));
      $$4.ifPresent($$2x -> $$30.put($$1.createString("legacy_custom_options"), $$1.createString($$2x)));
      return new Dynamic($$1, $$1.createMap($$30.build()));
   }

   protected static <T> Dynamic<T> a(Dynamic<T> $$0, long $$1) {
      return a($$1, $$0, $$0.createString("minecraft:overworld"), a($$0, $$1, false, false));
   }

   protected static <T> T a(Dynamic<T> $$0, long $$1, Dynamic<T> $$2, boolean $$3) {
      DynamicOps<T> $$4 = $$0.getOps();
      return (T)$$4.createMap(
         ImmutableMap.of(
            $$4.createString("minecraft:overworld"),
            $$4.createMap(
               ImmutableMap.of(
                  $$4.createString("type"), $$4.createString("minecraft:overworld" + ($$3 ? "_caves" : "")), $$4.createString("generator"), $$2.getValue()
               )
            ),
            $$4.createString("minecraft:the_nether"),
            $$4.createMap(
               ImmutableMap.of(
                  $$4.createString("type"),
                  $$4.createString("minecraft:the_nether"),
                  $$4.createString("generator"),
                  a(
                        $$1,
                        $$0,
                        $$0.createString("minecraft:nether"),
                        $$0.createMap(
                           ImmutableMap.of(
                              $$0.createString("type"),
                              $$0.createString("minecraft:multi_noise"),
                              $$0.createString("seed"),
                              $$0.createLong($$1),
                              $$0.createString("preset"),
                              $$0.createString("minecraft:nether")
                           )
                        )
                     )
                     .getValue()
               )
            ),
            $$4.createString("minecraft:the_end"),
            $$4.createMap(
               ImmutableMap.of(
                  $$4.createString("type"),
                  $$4.createString("minecraft:the_end"),
                  $$4.createString("generator"),
                  a(
                        $$1,
                        $$0,
                        $$0.createString("minecraft:end"),
                        $$0.createMap(
                           ImmutableMap.of($$0.createString("type"), $$0.createString("minecraft:the_end"), $$0.createString("seed"), $$0.createLong($$1))
                        )
                     )
                     .getValue()
               )
            )
         )
      );
   }

   private static <T> Map<Dynamic<T>, Dynamic<T>> a(DynamicOps<T> $$0, OptionalDynamic<T> $$1) {
      MutableInt $$2 = new MutableInt(32);
      MutableInt $$3 = new MutableInt(3);
      MutableInt $$4 = new MutableInt(128);
      MutableBoolean $$5 = new MutableBoolean(false);
      Map<String, bki.a> $$6 = Maps.newHashMap();
      if ($$1.result().isEmpty()) {
         $$5.setTrue();
         $$6.put("minecraft:village", (bki.a)j.get("minecraft:village"));
      }

      $$1.get("structures")
         .flatMap(Dynamic::getMapValues)
         .ifSuccess($$5x -> $$5x.forEach(($$5xx, $$6x) -> $$6x.getMapValues().result().ifPresent($$6xx -> $$6xx.forEach(($$6xxx, $$7x) -> {
                     String $$8 = $$5xx.asString("");
                     String $$9 = $$6xxx.asString("");
                     String $$10 = $$7x.asString("");
                     if ("stronghold".equals($$8)) {
                        $$5.setTrue();
                        switch ($$9) {
                           case "distance":
                              $$2.setValue(a($$10, $$2.getValue(), 1));
                              return;
                           case "spread":
                              $$3.setValue(a($$10, $$3.getValue(), 1));
                              return;
                           case "count":
                              $$4.setValue(a($$10, $$4.getValue(), 1));
                              return;
                        }
                     } else {
                        switch ($$9) {
                           case "distance":
                              switch ($$8) {
                                 case "village":
                                    a($$6, "minecraft:village", $$10, 9);
                                    return;
                                 case "biome_1":
                                    a($$6, "minecraft:desert_pyramid", $$10, 9);
                                    a($$6, "minecraft:igloo", $$10, 9);
                                    a($$6, "minecraft:jungle_pyramid", $$10, 9);
                                    a($$6, "minecraft:swamp_hut", $$10, 9);
                                    a($$6, "minecraft:pillager_outpost", $$10, 9);
                                    return;
                                 case "endcity":
                                    a($$6, "minecraft:endcity", $$10, 1);
                                    return;
                                 case "mansion":
                                    a($$6, "minecraft:mansion", $$10, 1);
                                    return;
                                 default:
                                    return;
                              }
                           case "separation":
                              if ("oceanmonument".equals($$8)) {
                                 bki.a $$11 = $$6.getOrDefault("minecraft:monument", (bki.a)j.get("minecraft:monument"));
                                 int $$12 = a($$10, $$11.c, 1);
                                 $$6.put("minecraft:monument", new bki.a($$12, $$11.c, $$11.d));
                              }

                              return;
                           case "spacing":
                              if ("oceanmonument".equals($$8)) {
                                 a($$6, "minecraft:monument", $$10, 1);
                              }

                              return;
                        }
                     }
                  }))));
      Builder<Dynamic<T>, Dynamic<T>> $$7 = ImmutableMap.builder();
      $$7.put(
         $$1.createString("structures"),
         $$1.createMap(
            $$6.entrySet().stream().collect(Collectors.toMap($$1x -> $$1.createString((String)$$1x.getKey()), $$1x -> ((bki.a)$$1x.getValue()).a($$0)))
         )
      );
      if ($$5.isTrue()) {
         $$7.put(
            $$1.createString("stronghold"),
            $$1.createMap(
               ImmutableMap.of(
                  $$1.createString("distance"),
                  $$1.createInt($$2.getValue()),
                  $$1.createString("spread"),
                  $$1.createInt($$3.getValue()),
                  $$1.createString("count"),
                  $$1.createInt($$4.getValue())
               )
            )
         );
      }

      return $$7.build();
   }

   private static int a(String $$0, int $$1) {
      return NumberUtils.toInt($$0, $$1);
   }

   private static int a(String $$0, int $$1, int $$2) {
      return Math.max($$2, a($$0, $$1));
   }

   private static void a(Map<String, bki.a> $$0, String $$1, String $$2, int $$3) {
      bki.a $$4 = $$0.getOrDefault($$1, (bki.a)j.get($$1));
      int $$5 = a($$2, $$4.b, $$3);
      $$0.put($$1, new bki.a($$5, $$4.c, $$4.d));
   }

   static final class a {
      public static final Codec<bki.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.INT.fieldOf("spacing").forGetter($$0x -> $$0x.b),
                  Codec.INT.fieldOf("separation").forGetter($$0x -> $$0x.c),
                  Codec.INT.fieldOf("salt").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, bki.a::new)
      );
      final int b;
      final int c;
      final int d;

      public a(int $$0, int $$1, int $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public <T> Dynamic<T> a(DynamicOps<T> $$0) {
         return new Dynamic($$0, a.encodeStart($$0, this).result().orElse($$0.emptyMap()));
      }
   }
}
