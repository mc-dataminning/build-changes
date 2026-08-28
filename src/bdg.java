import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.List.ListType;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectArrayMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableInt;

public class bdg extends DataFix {
   private static final int a = 16;
   private static final ImmutableSet<String> b = ImmutableSet.of(
      "minecraft:bubble_column", "minecraft:kelp", "minecraft:kelp_plant", "minecraft:seagrass", "minecraft:tall_seagrass"
   );

   public bdg(Schema $$0) {
      super($$0, false);
   }

   protected TypeRewriteRule makeRule() {
      Type<?> $$0 = this.getInputSchema().getType(biz.c);
      OpticFinder<?> $$1 = $$0.findField("Level");
      OpticFinder<?> $$2 = $$1.type().findField("Sections");
      OpticFinder<?> $$3 = ((ListType)$$2.type()).getElement().finder();
      OpticFinder<?> $$4 = $$3.type().findField("block_states");
      OpticFinder<?> $$5 = $$3.type().findField("biomes");
      OpticFinder<?> $$6 = $$4.type().findField("palette");
      OpticFinder<?> $$7 = $$1.type().findField("TileTicks");
      return this.fixTypeEverywhereTyped(
         "ChunkProtoTickListFix",
         $$0,
         $$7x -> $$7x.updateTyped(
               $$1,
               $$6xx -> {
                  $$6xx = $$6xx.update(
                     DSL.remainderFinder(),
                     $$0xxx -> (Dynamic)DataFixUtils.orElse(
                           $$0xxx.get("LiquidTicks").result().map($$1xxx -> $$0xxx.set("fluid_ticks", $$1xxx).remove("LiquidTicks")), $$0xxx
                        )
                  );
                  Dynamic<?> $$7xx = (Dynamic<?>)$$6xx.get(DSL.remainderFinder());
                  MutableInt $$8 = new MutableInt();
                  Int2ObjectMap<Supplier<bdg.a>> $$9 = new Int2ObjectArrayMap();
                  $$6xx.getOptionalTyped($$2)
                     .ifPresent(
                        $$6xxx -> $$6xxx.getAllTyped($$3)
                              .forEach(
                                 $$5xxxx -> {
                                    Dynamic<?> $$6xxxx = (Dynamic<?>)$$5xxxx.get(DSL.remainderFinder());
                                    int $$7xxx = $$6xxxx.get("Y").asInt(Integer.MAX_VALUE);
                                    if ($$7xxx != Integer.MAX_VALUE) {
                                       if ($$5xxxx.getOptionalTyped($$5).isPresent()) {
                                          $$8.setValue(Math.min($$7xxx, $$8.getValue()));
                                       }

                                       $$5xxxx.getOptionalTyped($$4)
                                          .ifPresent(
                                             $$3xxxxx -> $$9.put(
                                                   $$7xxx,
                                                   Suppliers.memoize(
                                                      () -> {
                                                         List<? extends Dynamic<?>> $$2xxxxxx = $$3xxxxx.getOptionalTyped($$6)
                                                            .map(
                                                               $$0xxxxxxx -> $$0xxxxxxx.write()
                                                                     .result()
                                                                     .map($$0xxxxxxxx -> $$0xxxxxxxx.asList(Function.identity()))
                                                                     .orElse(Collections.emptyList())
                                                            )
                                                            .orElse(Collections.emptyList());
                                                         long[] $$3xxxxxx = ((Dynamic)$$3xxxxx.get(DSL.remainderFinder())).get("data").asLongStream().toArray();
                                                         return new bdg.a($$2xxxxxx, $$3xxxxxx);
                                                      }
                                                   )
                                                )
                                          );
                                    }
                                 }
                              )
                     );
                  byte $$10 = $$8.getValue().byteValue();
                  $$6xx = $$6xx.update(DSL.remainderFinder(), $$1xxx -> $$1xxx.update("yPos", $$1xxxx -> $$1xxxx.createByte($$10)));
                  if (!$$6xx.getOptionalTyped($$7).isPresent() && !$$7xx.get("fluid_ticks").result().isPresent()) {
                     int $$11 = $$7xx.get("xPos").asInt(0);
                     int $$12 = $$7xx.get("zPos").asInt(0);
                     Dynamic<?> $$13 = this.a($$7xx, $$9, $$10, $$11, $$12, "LiquidsToBeTicked", bdg::b);
                     Dynamic<?> $$14 = this.a($$7xx, $$9, $$10, $$11, $$12, "ToBeTicked", bdg::a);
                     Optional<? extends Pair<? extends Typed<?>, ?>> $$15 = $$7.type().readTyped($$14).result();
                     if ($$15.isPresent()) {
                        $$6xx = $$6xx.set($$7, (Typed)$$15.get().getFirst());
                     }

                     return $$6xx.update(DSL.remainderFinder(), $$1xxx -> $$1xxx.remove("ToBeTicked").remove("LiquidsToBeTicked").set("fluid_ticks", $$13));
                  } else {
                     return $$6xx;
                  }
               }
            )
      );
   }

   private Dynamic<?> a(Dynamic<?> $$0, Int2ObjectMap<Supplier<bdg.a>> $$1, byte $$2, int $$3, int $$4, String $$5, Function<Dynamic<?>, String> $$6) {
      Stream<Dynamic<?>> $$7 = Stream.empty();
      List<? extends Dynamic<?>> $$8 = $$0.get($$5).asList(Function.identity());

      for (int $$9 = 0; $$9 < $$8.size(); $$9++) {
         int $$10 = $$9 + $$2;
         Supplier<bdg.a> $$11 = (Supplier<bdg.a>)$$1.get($$10);
         Stream<? extends Dynamic<?>> $$12 = $$8.get($$9)
            .asStream()
            .mapToInt($$0x -> $$0x.asShort((short)-1))
            .filter($$0x -> $$0x > 0)
            .mapToObj($$6x -> this.a($$0, $$11, $$3, $$10, $$4, $$6x, $$6));
         $$7 = Stream.concat($$7, $$12);
      }

      return $$0.createList($$7);
   }

   private static String a(@Nullable Dynamic<?> $$0) {
      return $$0 != null ? $$0.get("Name").asString("minecraft:air") : "minecraft:air";
   }

   private static String b(@Nullable Dynamic<?> $$0) {
      if ($$0 == null) {
         return "minecraft:empty";
      } else {
         String $$1 = $$0.get("Name").asString("");
         if ("minecraft:water".equals($$1)) {
            return $$0.get("Properties").get("level").asInt(0) == 0 ? "minecraft:water" : "minecraft:flowing_water";
         } else if ("minecraft:lava".equals($$1)) {
            return $$0.get("Properties").get("level").asInt(0) == 0 ? "minecraft:lava" : "minecraft:flowing_lava";
         } else {
            return !b.contains($$1) && !$$0.get("Properties").get("waterlogged").asBoolean(false) ? "minecraft:empty" : "minecraft:water";
         }
      }
   }

   private Dynamic<?> a(Dynamic<?> $$0, @Nullable Supplier<bdg.a> $$1, int $$2, int $$3, int $$4, int $$5, Function<Dynamic<?>, String> $$6) {
      int $$7 = $$5 & 15;
      int $$8 = $$5 >>> 4 & 15;
      int $$9 = $$5 >>> 8 & 15;
      String $$10 = $$6.apply($$1 != null ? $$1.get().a($$7, $$8, $$9) : null);
      return $$0.createMap(
         ImmutableMap.builder()
            .put($$0.createString("i"), $$0.createString($$10))
            .put($$0.createString("x"), $$0.createInt($$2 * 16 + $$7))
            .put($$0.createString("y"), $$0.createInt($$3 * 16 + $$8))
            .put($$0.createString("z"), $$0.createInt($$4 * 16 + $$9))
            .put($$0.createString("t"), $$0.createInt(0))
            .put($$0.createString("p"), $$0.createInt(0))
            .build()
      );
   }

   public static final class a {
      private static final long a = 4L;
      private final List<? extends Dynamic<?>> b;
      private final long[] c;
      private final int d;
      private final long e;
      private final int f;

      public a(List<? extends Dynamic<?>> $$0, long[] $$1) {
         this.b = $$0;
         this.c = $$1;
         this.d = Math.max(4, bdd.a($$0.size()));
         this.e = (1L << this.d) - 1L;
         this.f = (char)(64 / this.d);
      }

      @Nullable
      public Dynamic<?> a(int $$0, int $$1, int $$2) {
         int $$3 = this.b.size();
         if ($$3 < 1) {
            return null;
         } else if ($$3 == 1) {
            return (Dynamic<?>)this.b.get(0);
         } else {
            int $$4 = this.b($$0, $$1, $$2);
            int $$5 = $$4 / this.f;
            if ($$5 >= 0 && $$5 < this.c.length) {
               long $$6 = this.c[$$5];
               int $$7 = ($$4 - $$5 * this.f) * this.d;
               int $$8 = (int)($$6 >> $$7 & this.e);
               return (Dynamic<?>)($$8 >= 0 && $$8 < $$3 ? this.b.get($$8) : null);
            } else {
               return null;
            }
         }
      }

      private int b(int $$0, int $$1, int $$2) {
         return ($$1 << 4 | $$2) << 4 | $$0;
      }

      public List<? extends Dynamic<?>> a() {
         return this.b;
      }

      public long[] b() {
         return this.c;
      }
   }
}
