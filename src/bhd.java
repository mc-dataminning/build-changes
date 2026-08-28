import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
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
import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntIterator;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bhd extends DataFix {
   private static final int a = 128;
   private static final int b = 64;
   private static final int c = 32;
   private static final int d = 16;
   private static final int e = 8;
   private static final int f = 4;
   private static final int g = 2;
   private static final int h = 1;
   private static final int[][] i = new int[][]{{-1, 0, 0}, {1, 0, 0}, {0, -1, 0}, {0, 1, 0}, {0, 0, -1}, {0, 0, 1}};
   private static final int j = 7;
   private static final int k = 12;
   private static final int l = 4096;
   static final Object2IntMap<String> m = (Object2IntMap<String>)DataFixUtils.make(new Object2IntOpenHashMap(), $$0 -> {
      $$0.put("minecraft:acacia_leaves", 0);
      $$0.put("minecraft:birch_leaves", 1);
      $$0.put("minecraft:dark_oak_leaves", 2);
      $$0.put("minecraft:jungle_leaves", 3);
      $$0.put("minecraft:oak_leaves", 4);
      $$0.put("minecraft:spruce_leaves", 5);
   });
   static final Set<String> n = ImmutableSet.of(
      "minecraft:acacia_bark",
      "minecraft:birch_bark",
      "minecraft:dark_oak_bark",
      "minecraft:jungle_bark",
      "minecraft:oak_bark",
      "minecraft:spruce_bark",
      new String[]{
         "minecraft:acacia_log",
         "minecraft:birch_log",
         "minecraft:dark_oak_log",
         "minecraft:jungle_log",
         "minecraft:oak_log",
         "minecraft:spruce_log",
         "minecraft:stripped_acacia_log",
         "minecraft:stripped_birch_log",
         "minecraft:stripped_dark_oak_log",
         "minecraft:stripped_jungle_log",
         "minecraft:stripped_oak_log",
         "minecraft:stripped_spruce_log"
      }
   );

   public bhd(Schema $$0, boolean $$1) {
      super($$0, $$1);
   }

   protected TypeRewriteRule makeRule() {
      Type<?> $$0 = this.getInputSchema().getType(biw.c);
      OpticFinder<?> $$1 = $$0.findField("Level");
      OpticFinder<?> $$2 = $$1.type().findField("Sections");
      Type<?> $$3 = $$2.type();
      if (!($$3 instanceof ListType)) {
         throw new IllegalStateException("Expecting sections to be a list.");
      } else {
         Type<?> $$4 = ((ListType)$$3).getElement();
         OpticFinder<?> $$5 = DSL.typeFinder($$4);
         return this.fixTypeEverywhereTyped(
            "Leaves fix",
            $$0,
            $$3x -> $$3x.updateTyped(
                  $$1,
                  $$2xx -> {
                     int[] $$3xx = new int[]{0};
                     Typed<?> $$4x = $$2xx.updateTyped(
                        $$2,
                        $$2xxx -> {
                           Int2ObjectMap<bhd.a> $$3xxx = new Int2ObjectOpenHashMap(
                              $$2xxx.getAllTyped($$5)
                                 .stream()
                                 .map($$0xxxx -> new bhd.a($$0xxxx, this.getInputSchema()))
                                 .collect(Collectors.toMap(bhd.b::c, $$0xxxx -> $$0xxxx))
                           );
                           if ($$3xxx.values().stream().allMatch(bhd.b::b)) {
                              return $$2xxx;
                           } else {
                              List<IntSet> $$4xx = Lists.newArrayList();

                              for (int $$5x = 0; $$5x < 7; $$5x++) {
                                 $$4xx.add(new IntOpenHashSet());
                              }

                              ObjectIterator var25 = $$3xxx.values().iterator();

                              while (var25.hasNext()) {
                                 bhd.a $$6 = (bhd.a)var25.next();
                                 if (!$$6.b()) {
                                    for (int $$7 = 0; $$7 < 4096; $$7++) {
                                       int $$8 = $$6.c($$7);
                                       if ($$6.a($$8)) {
                                          $$4xx.get(0).add($$6.c() << 12 | $$7);
                                       } else if ($$6.b($$8)) {
                                          int $$9 = this.a($$7);
                                          int $$10 = this.c($$7);
                                          $$3xx[0] |= a($$9 == 0, $$9 == 15, $$10 == 0, $$10 == 15);
                                       }
                                    }
                                 }
                              }

                              for (int $$11 = 1; $$11 < 7; $$11++) {
                                 IntSet $$12 = $$4xx.get($$11 - 1);
                                 IntSet $$13 = $$4xx.get($$11);
                                 IntIterator $$14 = $$12.iterator();

                                 while ($$14.hasNext()) {
                                    int $$15 = $$14.nextInt();
                                    int $$16 = this.a($$15);
                                    int $$17 = this.b($$15);
                                    int $$18 = this.c($$15);

                                    for (int[] $$19 : i) {
                                       int $$20 = $$16 + $$19[0];
                                       int $$21 = $$17 + $$19[1];
                                       int $$22 = $$18 + $$19[2];
                                       if ($$20 >= 0 && $$20 <= 15 && $$22 >= 0 && $$22 <= 15 && $$21 >= 0 && $$21 <= 255) {
                                          bhd.a $$23 = (bhd.a)$$3xxx.get($$21 >> 4);
                                          if ($$23 != null && !$$23.b()) {
                                             int $$24 = a($$20, $$21 & 15, $$22);
                                             int $$25 = $$23.c($$24);
                                             if ($$23.b($$25)) {
                                                int $$26 = $$23.d($$25);
                                                if ($$26 > $$11) {
                                                   $$23.a($$24, $$25, $$11);
                                                   $$13.add(a($$20, $$21, $$22));
                                                }
                                             }
                                          }
                                       }
                                    }
                                 }
                              }

                              return $$2xxx.updateTyped(
                                 $$5, $$1xxxx -> ((bhd.a)$$3xxx.get(((Dynamic)$$1xxxx.get(DSL.remainderFinder())).get("Y").asInt(0))).a($$1xxxx)
                              );
                           }
                        }
                     );
                     if ($$3xx[0] != 0) {
                        $$4x = $$4x.update(DSL.remainderFinder(), $$1xxx -> {
                           Dynamic<?> $$2xxx = (Dynamic<?>)DataFixUtils.orElse($$1xxx.get("UpgradeData").result(), $$1xxx.emptyMap());
                           return $$1xxx.set("UpgradeData", $$2xxx.set("Sides", $$1xxx.createByte((byte)($$2xxx.get("Sides").asByte((byte)0) | $$3xx[0]))));
                        });
                     }

                     return $$4x;
                  }
               )
         );
      }
   }

   public static int a(int $$0, int $$1, int $$2) {
      return $$1 << 8 | $$2 << 4 | $$0;
   }

   private int a(int $$0) {
      return $$0 & 15;
   }

   private int b(int $$0) {
      return $$0 >> 8 & 0xFF;
   }

   private int c(int $$0) {
      return $$0 >> 4 & 15;
   }

   public static int a(boolean $$0, boolean $$1, boolean $$2, boolean $$3) {
      int $$4 = 0;
      if ($$2) {
         if ($$1) {
            $$4 |= 2;
         } else if ($$0) {
            $$4 |= 128;
         } else {
            $$4 |= 1;
         }
      } else if ($$3) {
         if ($$0) {
            $$4 |= 32;
         } else if ($$1) {
            $$4 |= 8;
         } else {
            $$4 |= 16;
         }
      } else if ($$1) {
         $$4 |= 4;
      } else if ($$0) {
         $$4 |= 64;
      }

      return $$4;
   }

   public static final class a extends bhd.b {
      private static final String h = "persistent";
      private static final String i = "decayable";
      private static final String j = "distance";
      @Nullable
      private IntSet k;
      @Nullable
      private IntSet l;
      @Nullable
      private Int2IntMap m;

      public a(Typed<?> $$0, Schema $$1) {
         super($$0, $$1);
      }

      @Override
      protected boolean a() {
         this.k = new IntOpenHashSet();
         this.l = new IntOpenHashSet();
         this.m = new Int2IntOpenHashMap();

         for (int $$0 = 0; $$0 < this.e.size(); $$0++) {
            Dynamic<?> $$1 = this.e.get($$0);
            String $$2 = $$1.get("Name").asString("");
            if (bhd.m.containsKey($$2)) {
               boolean $$3 = Objects.equals($$1.get("Properties").get("decayable").asString(""), "false");
               this.k.add($$0);
               this.m.put(this.a($$2, $$3, 7), $$0);
               this.e.set($$0, this.a($$1, $$2, $$3, 7));
            }

            if (bhd.n.contains($$2)) {
               this.l.add($$0);
            }
         }

         return this.k.isEmpty() && this.l.isEmpty();
      }

      private Dynamic<?> a(Dynamic<?> $$0, String $$1, boolean $$2, int $$3) {
         Dynamic<?> $$4 = $$0.emptyMap();
         $$4 = $$4.set("persistent", $$4.createString($$2 ? "true" : "false"));
         $$4 = $$4.set("distance", $$4.createString(Integer.toString($$3)));
         Dynamic<?> $$5 = $$0.emptyMap();
         $$5 = $$5.set("Properties", $$4);
         return $$5.set("Name", $$5.createString($$1));
      }

      public boolean a(int $$0) {
         return this.l.contains($$0);
      }

      public boolean b(int $$0) {
         return this.k.contains($$0);
      }

      int d(int $$0) {
         return this.a($$0) ? 0 : Integer.parseInt(this.e.get($$0).get("Properties").get("distance").asString(""));
      }

      void a(int $$0, int $$1, int $$2) {
         Dynamic<?> $$3 = this.e.get($$1);
         String $$4 = $$3.get("Name").asString("");
         boolean $$5 = Objects.equals($$3.get("Properties").get("persistent").asString(""), "true");
         int $$6 = this.a($$4, $$5, $$2);
         if (!this.m.containsKey($$6)) {
            int $$7 = this.e.size();
            this.k.add($$7);
            this.m.put($$6, $$7);
            this.e.add(this.a($$3, $$4, $$5, $$2));
         }

         int $$8 = this.m.get($$6);
         if (1 << this.g.b() <= $$8) {
            bbw $$9 = new bbw(this.g.b() + 1, 4096);

            for (int $$10 = 0; $$10 < 4096; $$10++) {
               $$9.a($$10, this.g.a($$10));
            }

            this.g = $$9;
         }

         this.g.a($$0, $$8);
      }
   }

   public abstract static class b {
      protected static final String a = "BlockStates";
      protected static final String b = "Name";
      protected static final String c = "Properties";
      private final Type<Pair<String, Dynamic<?>>> h = DSL.named(biw.u.typeName(), DSL.remainderType());
      protected final OpticFinder<List<Pair<String, Dynamic<?>>>> d = DSL.fieldFinder("Palette", DSL.list(this.h));
      protected final List<Dynamic<?>> e;
      protected final int f;
      @Nullable
      protected bbw g;

      public b(Typed<?> $$0, Schema $$1) {
         if (!Objects.equals($$1.getType(biw.u), this.h)) {
            throw new IllegalStateException("Block state type is not what was expected.");
         } else {
            Optional<List<Pair<String, Dynamic<?>>>> $$2 = $$0.getOptional(this.d);
            this.e = $$2.<List<Dynamic<?>>>map($$0x -> $$0x.stream().<Dynamic<?>>map(Pair::getSecond).collect(Collectors.toList())).orElse(ImmutableList.of());
            Dynamic<?> $$3 = (Dynamic<?>)$$0.get(DSL.remainderFinder());
            this.f = $$3.get("Y").asInt(0);
            this.a($$3);
         }
      }

      protected void a(Dynamic<?> $$0) {
         if (this.a()) {
            this.g = null;
         } else {
            long[] $$1 = $$0.get("BlockStates").asLongStream().toArray();
            int $$2 = Math.max(4, DataFixUtils.ceillog2(this.e.size()));
            this.g = new bbw($$2, 4096, $$1);
         }
      }

      public Typed<?> a(Typed<?> $$0) {
         return this.b()
            ? $$0
            : $$0.update(DSL.remainderFinder(), $$0x -> $$0x.set("BlockStates", $$0x.createLongList(Arrays.stream(this.g.a()))))
               .set(this.d, this.e.stream().map($$0x -> Pair.of(biw.u.typeName(), $$0x)).collect(Collectors.toList()));
      }

      public boolean b() {
         return this.g == null;
      }

      public int c(int $$0) {
         return this.g.a($$0);
      }

      protected int a(String $$0, boolean $$1, int $$2) {
         return bhd.m.get($$0) << 5 | ($$1 ? 16 : 0) | $$2;
      }

      int c() {
         return this.f;
      }

      protected abstract boolean a();
   }
}
