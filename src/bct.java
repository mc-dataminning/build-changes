import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntListIterator;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bct extends DataFix {
   private static final int a = 128;
   private static final int b = 64;
   private static final int c = 32;
   private static final int d = 16;
   private static final int e = 8;
   private static final int f = 4;
   private static final int g = 2;
   private static final int h = 1;
   static final Logger i = LogUtils.getLogger();
   private static final int j = 4096;

   public bct(Schema $$0, boolean $$1) {
      super($$0, $$1);
   }

   public static String a(Dynamic<?> $$0) {
      return $$0.get("Name").asString("");
   }

   public static String a(Dynamic<?> $$0, String $$1) {
      return $$0.get("Properties").get($$1).asString("");
   }

   public static int a(ayh<Dynamic<?>> $$0, Dynamic<?> $$1) {
      int $$2 = $$0.a($$1);
      if ($$2 == -1) {
         $$2 = $$0.d($$1);
      }

      return $$2;
   }

   private Dynamic<?> b(Dynamic<?> $$0) {
      Optional<? extends Dynamic<?>> $$1 = $$0.get("Level").result();
      return $$1.isPresent() && $$1.get().get("Sections").asStreamOpt().result().isPresent() ? $$0.set("Level", new bct.e((Dynamic<?>)$$1.get()).a()) : $$0;
   }

   public TypeRewriteRule makeRule() {
      Type<?> $$0 = this.getInputSchema().getType(bhu.c);
      Type<?> $$1 = this.getOutputSchema().getType(bhu.c);
      return this.writeFixAndRead("ChunkPalettedStorageFix", $$0, $$1, this::b);
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

   static class a {
      private static final int a = 2048;
      private static final int b = 4;
      private final byte[] c;

      public a() {
         this.c = new byte[2048];
      }

      public a(byte[] $$0) {
         this.c = $$0;
         if ($$0.length != 2048) {
            throw new IllegalArgumentException("ChunkNibbleArrays should be 2048 bytes not: " + $$0.length);
         }
      }

      public int a(int $$0, int $$1, int $$2) {
         int $$3 = this.b($$1 << 8 | $$2 << 4 | $$0);
         return this.a($$1 << 8 | $$2 << 4 | $$0) ? this.c[$$3] & 15 : this.c[$$3] >> 4 & 15;
      }

      private boolean a(int $$0) {
         return ($$0 & 1) == 0;
      }

      private int b(int $$0) {
         return $$0 >> 1;
      }
   }

   public static enum b {
      a(bct.b.b.b, bct.b.a.b),
      b(bct.b.b.a, bct.b.a.b),
      c(bct.b.b.b, bct.b.a.c),
      d(bct.b.b.a, bct.b.a.c),
      e(bct.b.b.b, bct.b.a.a),
      f(bct.b.b.a, bct.b.a.a);

      private final bct.b.a g;
      private final bct.b.b h;

      private b(final bct.b.b $$0, final bct.b.a $$1) {
         this.g = $$1;
         this.h = $$0;
      }

      public bct.b.b a() {
         return this.h;
      }

      public bct.b.a b() {
         return this.g;
      }

      public static enum a {
         a,
         b,
         c;
      }

      public static enum b {
         a(1),
         b(-1);

         private final int c;

         private b(final int $$0) {
            this.c = $$0;
         }

         public int a() {
            return this.c;
         }
      }
   }

   static class c {
      static final BitSet a = new BitSet(256);
      static final BitSet b = new BitSet(256);
      static final Dynamic<?> c = bav.a("minecraft:pumpkin");
      static final Dynamic<?> d = bav.a("minecraft:podzol", Map.of("snowy", "true"));
      static final Dynamic<?> e = bav.a("minecraft:grass_block", Map.of("snowy", "true"));
      static final Dynamic<?> f = bav.a("minecraft:mycelium", Map.of("snowy", "true"));
      static final Dynamic<?> g = bav.a("minecraft:sunflower", Map.of("half", "upper"));
      static final Dynamic<?> h = bav.a("minecraft:lilac", Map.of("half", "upper"));
      static final Dynamic<?> i = bav.a("minecraft:tall_grass", Map.of("half", "upper"));
      static final Dynamic<?> j = bav.a("minecraft:large_fern", Map.of("half", "upper"));
      static final Dynamic<?> k = bav.a("minecraft:rose_bush", Map.of("half", "upper"));
      static final Dynamic<?> l = bav.a("minecraft:peony", Map.of("half", "upper"));
      static final Map<String, Dynamic<?>> m = (Map<String, Dynamic<?>>)DataFixUtils.make(Maps.newHashMap(), $$0 -> {
         $$0.put("minecraft:air0", bav.a("minecraft:flower_pot"));
         $$0.put("minecraft:red_flower0", bav.a("minecraft:potted_poppy"));
         $$0.put("minecraft:red_flower1", bav.a("minecraft:potted_blue_orchid"));
         $$0.put("minecraft:red_flower2", bav.a("minecraft:potted_allium"));
         $$0.put("minecraft:red_flower3", bav.a("minecraft:potted_azure_bluet"));
         $$0.put("minecraft:red_flower4", bav.a("minecraft:potted_red_tulip"));
         $$0.put("minecraft:red_flower5", bav.a("minecraft:potted_orange_tulip"));
         $$0.put("minecraft:red_flower6", bav.a("minecraft:potted_white_tulip"));
         $$0.put("minecraft:red_flower7", bav.a("minecraft:potted_pink_tulip"));
         $$0.put("minecraft:red_flower8", bav.a("minecraft:potted_oxeye_daisy"));
         $$0.put("minecraft:yellow_flower0", bav.a("minecraft:potted_dandelion"));
         $$0.put("minecraft:sapling0", bav.a("minecraft:potted_oak_sapling"));
         $$0.put("minecraft:sapling1", bav.a("minecraft:potted_spruce_sapling"));
         $$0.put("minecraft:sapling2", bav.a("minecraft:potted_birch_sapling"));
         $$0.put("minecraft:sapling3", bav.a("minecraft:potted_jungle_sapling"));
         $$0.put("minecraft:sapling4", bav.a("minecraft:potted_acacia_sapling"));
         $$0.put("minecraft:sapling5", bav.a("minecraft:potted_dark_oak_sapling"));
         $$0.put("minecraft:red_mushroom0", bav.a("minecraft:potted_red_mushroom"));
         $$0.put("minecraft:brown_mushroom0", bav.a("minecraft:potted_brown_mushroom"));
         $$0.put("minecraft:deadbush0", bav.a("minecraft:potted_dead_bush"));
         $$0.put("minecraft:tallgrass2", bav.a("minecraft:potted_fern"));
         $$0.put("minecraft:cactus0", bav.a("minecraft:potted_cactus"));
      });
      static final Map<String, Dynamic<?>> n = (Map<String, Dynamic<?>>)DataFixUtils.make(Maps.newHashMap(), $$0 -> {
         a($$0, 0, "skeleton", "skull");
         a($$0, 1, "wither_skeleton", "skull");
         a($$0, 2, "zombie", "head");
         a($$0, 3, "player", "head");
         a($$0, 4, "creeper", "head");
         a($$0, 5, "dragon", "head");
      });
      static final Map<String, Dynamic<?>> o = (Map<String, Dynamic<?>>)DataFixUtils.make(Maps.newHashMap(), $$0 -> {
         a($$0, "oak_door");
         a($$0, "iron_door");
         a($$0, "spruce_door");
         a($$0, "birch_door");
         a($$0, "jungle_door");
         a($$0, "acacia_door");
         a($$0, "dark_oak_door");
      });
      static final Map<String, Dynamic<?>> p = (Map<String, Dynamic<?>>)DataFixUtils.make(Maps.newHashMap(), $$0 -> {
         for (int $$1 = 0; $$1 < 26; $$1++) {
            $$0.put("true" + $$1, bav.a("minecraft:note_block", Map.of("powered", "true", "note", String.valueOf($$1))));
            $$0.put("false" + $$1, bav.a("minecraft:note_block", Map.of("powered", "false", "note", String.valueOf($$1))));
         }
      });
      private static final Int2ObjectMap<String> q = (Int2ObjectMap<String>)DataFixUtils.make(new Int2ObjectOpenHashMap(), $$0 -> {
         $$0.put(0, "white");
         $$0.put(1, "orange");
         $$0.put(2, "magenta");
         $$0.put(3, "light_blue");
         $$0.put(4, "yellow");
         $$0.put(5, "lime");
         $$0.put(6, "pink");
         $$0.put(7, "gray");
         $$0.put(8, "light_gray");
         $$0.put(9, "cyan");
         $$0.put(10, "purple");
         $$0.put(11, "blue");
         $$0.put(12, "brown");
         $$0.put(13, "green");
         $$0.put(14, "red");
         $$0.put(15, "black");
      });
      static final Map<String, Dynamic<?>> r = (Map<String, Dynamic<?>>)DataFixUtils.make(Maps.newHashMap(), $$0 -> {
         ObjectIterator var1 = q.int2ObjectEntrySet().iterator();

         while (var1.hasNext()) {
            Entry<String> $$1 = (Entry<String>)var1.next();
            if (!Objects.equals($$1.getValue(), "red")) {
               a($$0, $$1.getIntKey(), (String)$$1.getValue());
            }
         }
      });
      static final Map<String, Dynamic<?>> s = (Map<String, Dynamic<?>>)DataFixUtils.make(Maps.newHashMap(), $$0 -> {
         ObjectIterator var1 = q.int2ObjectEntrySet().iterator();

         while (var1.hasNext()) {
            Entry<String> $$1 = (Entry<String>)var1.next();
            if (!Objects.equals($$1.getValue(), "white")) {
               b($$0, 15 - $$1.getIntKey(), (String)$$1.getValue());
            }
         }
      });
      static final Dynamic<?> t = bav.a("minecraft:air");

      private c() {
      }

      private static void a(Map<String, Dynamic<?>> $$0, int $$1, String $$2, String $$3) {
         $$0.put($$1 + "north", bav.a("minecraft:" + $$2 + "_wall_" + $$3, Map.of("facing", "north")));
         $$0.put($$1 + "east", bav.a("minecraft:" + $$2 + "_wall_" + $$3, Map.of("facing", "east")));
         $$0.put($$1 + "south", bav.a("minecraft:" + $$2 + "_wall_" + $$3, Map.of("facing", "south")));
         $$0.put($$1 + "west", bav.a("minecraft:" + $$2 + "_wall_" + $$3, Map.of("facing", "west")));

         for (int $$4 = 0; $$4 < 16; $$4++) {
            $$0.put("" + $$1 + $$4, bav.a("minecraft:" + $$2 + "_" + $$3, Map.of("rotation", String.valueOf($$4))));
         }
      }

      private static void a(Map<String, Dynamic<?>> $$0, String $$1) {
         String $$2 = "minecraft:" + $$1;
         $$0.put(
            "minecraft:" + $$1 + "eastlowerleftfalsefalse",
            bav.a($$2, Map.of("facing", "east", "half", "lower", "hinge", "left", "open", "false", "powered", "false"))
         );
         $$0.put(
            "minecraft:" + $$1 + "eastlowerleftfalsetrue",
            bav.a($$2, Map.of("facing", "east", "half", "lower", "hinge", "left", "open", "false", "powered", "true"))
         );
         $$0.put(
            "minecraft:" + $$1 + "eastlowerlefttruefalse",
            bav.a($$2, Map.of("facing", "east", "half", "lower", "hinge", "left", "open", "true", "powered", "false"))
         );
         $$0.put(
            "minecraft:" + $$1 + "eastlowerlefttruetrue",
            bav.a($$2, Map.of("facing", "east", "half", "lower", "hinge", "left", "open", "true", "powered", "true"))
         );
         $$0.put(
            "minecraft:" + $$1 + "eastlowerrightfalsefalse",
            bav.a($$2, Map.of("facing", "east", "half", "lower", "hinge", "right", "open", "false", "powered", "false"))
         );
         $$0.put(
            "minecraft:" + $$1 + "eastlowerrightfalsetrue",
            bav.a($$2, Map.of("facing", "east", "half", "lower", "hinge", "right", "open", "false", "powered", "true"))
         );
         $$0.put(
            "minecraft:" + $$1 + "eastlowerrighttruefalse",
            bav.a($$2, Map.of("facing", "east", "half", "lower", "hinge", "right", "open", "true", "powered", "false"))
         );
         $$0.put(
            "minecraft:" + $$1 + "eastlowerrighttruetrue",
            bav.a($$2, Map.of("facing", "east", "half", "lower", "hinge", "right", "open", "true", "powered", "true"))
         );
         $$0.put(
            "minecraft:" + $$1 + "eastupperleftfalsefalse",
            bav.a($$2, Map.of("facing", "east", "half", "upper", "hinge", "left", "open", "false", "powered", "false"))
         );
         $$0.put(
            "minecraft:" + $$1 + "eastupperleftfalsetrue",
            bav.a($$2, Map.of("facing", "east", "half", "upper", "hinge", "left", "open", "false", "powered", "true"))
         );
         $$0.put(
            "minecraft:" + $$1 + "eastupperlefttruefalse",
            bav.a($$2, Map.of("facing", "east", "half", "upper", "hinge", "left", "open", "true", "powered", "false"))
         );
         $$0.put(
            "minecraft:" + $$1 + "eastupperlefttruetrue",
            bav.a($$2, Map.of("facing", "east", "half", "upper", "hinge", "left", "open", "true", "powered", "true"))
         );
         $$0.put(
            "minecraft:" + $$1 + "eastupperrightfalsefalse",
            bav.a($$2, Map.of("facing", "east", "half", "upper", "hinge", "right", "open", "false", "powered", "false"))
         );
         $$0.put(
            "minecraft:" + $$1 + "eastupperrightfalsetrue",
            bav.a($$2, Map.of("facing", "east", "half", "upper", "hinge", "right", "open", "false", "powered", "true"))
         );
         $$0.put(
            "minecraft:" + $$1 + "eastupperrighttruefalse",
            bav.a($$2, Map.of("facing", "east", "half", "upper", "hinge", "right", "open", "true", "powered", "false"))
         );
         $$0.put(
            "minecraft:" + $$1 + "eastupperrighttruetrue",
            bav.a($$2, Map.of("facing", "east", "half", "upper", "hinge", "right", "open", "true", "powered", "true"))
         );
         $$0.put(
            "minecraft:" + $$1 + "northlowerleftfalsefalse",
            bav.a($$2, Map.of("facing", "north", "half", "lower", "hinge", "left", "open", "false", "powered", "false"))
         );
         $$0.put(
            "minecraft:" + $$1 + "northlowerleftfalsetrue",
            bav.a($$2, Map.of("facing", "north", "half", "lower", "hinge", "left", "open", "false", "powered", "true"))
         );
         $$0.put(
            "minecraft:" + $$1 + "northlowerlefttruefalse",
            bav.a($$2, Map.of("facing", "north", "half", "lower", "hinge", "left", "open", "true", "powered", "false"))
         );
         $$0.put(
            "minecraft:" + $$1 + "northlowerlefttruetrue",
            bav.a($$2, Map.of("facing", "north", "half", "lower", "hinge", "left", "open", "true", "powered", "true"))
         );
         $$0.put(
            "minecraft:" + $$1 + "northlowerrightfalsefalse",
            bav.a($$2, Map.of("facing", "north", "half", "lower", "hinge", "right", "open", "false", "powered", "false"))
         );
         $$0.put(
            "minecraft:" + $$1 + "northlowerrightfalsetrue",
            bav.a($$2, Map.of("facing", "north", "half", "lower", "hinge", "right", "open", "false", "powered", "true"))
         );
         $$0.put(
            "minecraft:" + $$1 + "northlowerrighttruefalse",
            bav.a($$2, Map.of("facing", "north", "half", "lower", "hinge", "right", "open", "true", "powered", "false"))
         );
         $$0.put(
            "minecraft:" + $$1 + "northlowerrighttruetrue",
            bav.a($$2, Map.of("facing", "north", "half", "lower", "hinge", "right", "open", "true", "powered", "true"))
         );
         $$0.put(
            "minecraft:" + $$1 + "northupperleftfalsefalse",
            bav.a($$2, Map.of("facing", "north", "half", "upper", "hinge", "left", "open", "false", "powered", "false"))
         );
         $$0.put(
            "minecraft:" + $$1 + "northupperleftfalsetrue",
            bav.a($$2, Map.of("facing", "north", "half", "upper", "hinge", "left", "open", "false", "powered", "true"))
         );
         $$0.put(
            "minecraft:" + $$1 + "northupperlefttruefalse",
            bav.a($$2, Map.of("facing", "north", "half", "upper", "hinge", "left", "open", "true", "powered", "false"))
         );
         $$0.put(
            "minecraft:" + $$1 + "northupperlefttruetrue",
            bav.a($$2, Map.of("facing", "north", "half", "upper", "hinge", "left", "open", "true", "powered", "true"))
         );
         $$0.put(
            "minecraft:" + $$1 + "northupperrightfalsefalse",
            bav.a($$2, Map.of("facing", "north", "half", "upper", "hinge", "right", "open", "false", "powered", "false"))
         );
         $$0.put(
            "minecraft:" + $$1 + "northupperrightfalsetrue",
            bav.a($$2, Map.of("facing", "north", "half", "upper", "hinge", "right", "open", "false", "powered", "true"))
         );
         $$0.put(
            "minecraft:" + $$1 + "northupperrighttruefalse",
            bav.a($$2, Map.of("facing", "north", "half", "upper", "hinge", "right", "open", "true", "powered", "false"))
         );
         $$0.put(
            "minecraft:" + $$1 + "northupperrighttruetrue",
            bav.a($$2, Map.of("facing", "north", "half", "upper", "hinge", "right", "open", "true", "powered", "true"))
         );
         $$0.put(
            "minecraft:" + $$1 + "southlowerleftfalsefalse",
            bav.a($$2, Map.of("facing", "south", "half", "lower", "hinge", "left", "open", "false", "powered", "false"))
         );
         $$0.put(
            "minecraft:" + $$1 + "southlowerleftfalsetrue",
            bav.a($$2, Map.of("facing", "south", "half", "lower", "hinge", "left", "open", "false", "powered", "true"))
         );
         $$0.put(
            "minecraft:" + $$1 + "southlowerlefttruefalse",
            bav.a($$2, Map.of("facing", "south", "half", "lower", "hinge", "left", "open", "true", "powered", "false"))
         );
         $$0.put(
            "minecraft:" + $$1 + "southlowerlefttruetrue",
            bav.a($$2, Map.of("facing", "south", "half", "lower", "hinge", "left", "open", "true", "powered", "true"))
         );
         $$0.put(
            "minecraft:" + $$1 + "southlowerrightfalsefalse",
            bav.a($$2, Map.of("facing", "south", "half", "lower", "hinge", "right", "open", "false", "powered", "false"))
         );
         $$0.put(
            "minecraft:" + $$1 + "southlowerrightfalsetrue",
            bav.a($$2, Map.of("facing", "south", "half", "lower", "hinge", "right", "open", "false", "powered", "true"))
         );
         $$0.put(
            "minecraft:" + $$1 + "southlowerrighttruefalse",
            bav.a($$2, Map.of("facing", "south", "half", "lower", "hinge", "right", "open", "true", "powered", "false"))
         );
         $$0.put(
            "minecraft:" + $$1 + "southlowerrighttruetrue",
            bav.a($$2, Map.of("facing", "south", "half", "lower", "hinge", "right", "open", "true", "powered", "true"))
         );
         $$0.put(
            "minecraft:" + $$1 + "southupperleftfalsefalse",
            bav.a($$2, Map.of("facing", "south", "half", "upper", "hinge", "left", "open", "false", "powered", "false"))
         );
         $$0.put(
            "minecraft:" + $$1 + "southupperleftfalsetrue",
            bav.a($$2, Map.of("facing", "south", "half", "upper", "hinge", "left", "open", "false", "powered", "true"))
         );
         $$0.put(
            "minecraft:" + $$1 + "southupperlefttruefalse",
            bav.a($$2, Map.of("facing", "south", "half", "upper", "hinge", "left", "open", "true", "powered", "false"))
         );
         $$0.put(
            "minecraft:" + $$1 + "southupperlefttruetrue",
            bav.a($$2, Map.of("facing", "south", "half", "upper", "hinge", "left", "open", "true", "powered", "true"))
         );
         $$0.put(
            "minecraft:" + $$1 + "southupperrightfalsefalse",
            bav.a($$2, Map.of("facing", "south", "half", "upper", "hinge", "right", "open", "false", "powered", "false"))
         );
         $$0.put(
            "minecraft:" + $$1 + "southupperrightfalsetrue",
            bav.a($$2, Map.of("facing", "south", "half", "upper", "hinge", "right", "open", "false", "powered", "true"))
         );
         $$0.put(
            "minecraft:" + $$1 + "southupperrighttruefalse",
            bav.a($$2, Map.of("facing", "south", "half", "upper", "hinge", "right", "open", "true", "powered", "false"))
         );
         $$0.put(
            "minecraft:" + $$1 + "southupperrighttruetrue",
            bav.a($$2, Map.of("facing", "south", "half", "upper", "hinge", "right", "open", "true", "powered", "true"))
         );
         $$0.put(
            "minecraft:" + $$1 + "westlowerleftfalsefalse",
            bav.a($$2, Map.of("facing", "west", "half", "lower", "hinge", "left", "open", "false", "powered", "false"))
         );
         $$0.put(
            "minecraft:" + $$1 + "westlowerleftfalsetrue",
            bav.a($$2, Map.of("facing", "west", "half", "lower", "hinge", "left", "open", "false", "powered", "true"))
         );
         $$0.put(
            "minecraft:" + $$1 + "westlowerlefttruefalse",
            bav.a($$2, Map.of("facing", "west", "half", "lower", "hinge", "left", "open", "true", "powered", "false"))
         );
         $$0.put(
            "minecraft:" + $$1 + "westlowerlefttruetrue",
            bav.a($$2, Map.of("facing", "west", "half", "lower", "hinge", "left", "open", "true", "powered", "true"))
         );
         $$0.put(
            "minecraft:" + $$1 + "westlowerrightfalsefalse",
            bav.a($$2, Map.of("facing", "west", "half", "lower", "hinge", "right", "open", "false", "powered", "false"))
         );
         $$0.put(
            "minecraft:" + $$1 + "westlowerrightfalsetrue",
            bav.a($$2, Map.of("facing", "west", "half", "lower", "hinge", "right", "open", "false", "powered", "true"))
         );
         $$0.put(
            "minecraft:" + $$1 + "westlowerrighttruefalse",
            bav.a($$2, Map.of("facing", "west", "half", "lower", "hinge", "right", "open", "true", "powered", "false"))
         );
         $$0.put(
            "minecraft:" + $$1 + "westlowerrighttruetrue",
            bav.a($$2, Map.of("facing", "west", "half", "lower", "hinge", "right", "open", "true", "powered", "true"))
         );
         $$0.put(
            "minecraft:" + $$1 + "westupperleftfalsefalse",
            bav.a($$2, Map.of("facing", "west", "half", "upper", "hinge", "left", "open", "false", "powered", "false"))
         );
         $$0.put(
            "minecraft:" + $$1 + "westupperleftfalsetrue",
            bav.a($$2, Map.of("facing", "west", "half", "upper", "hinge", "left", "open", "false", "powered", "true"))
         );
         $$0.put(
            "minecraft:" + $$1 + "westupperlefttruefalse",
            bav.a($$2, Map.of("facing", "west", "half", "upper", "hinge", "left", "open", "true", "powered", "false"))
         );
         $$0.put(
            "minecraft:" + $$1 + "westupperlefttruetrue",
            bav.a($$2, Map.of("facing", "west", "half", "upper", "hinge", "left", "open", "true", "powered", "true"))
         );
         $$0.put(
            "minecraft:" + $$1 + "westupperrightfalsefalse",
            bav.a($$2, Map.of("facing", "west", "half", "upper", "hinge", "right", "open", "false", "powered", "false"))
         );
         $$0.put(
            "minecraft:" + $$1 + "westupperrightfalsetrue",
            bav.a($$2, Map.of("facing", "west", "half", "upper", "hinge", "right", "open", "false", "powered", "true"))
         );
         $$0.put(
            "minecraft:" + $$1 + "westupperrighttruefalse",
            bav.a($$2, Map.of("facing", "west", "half", "upper", "hinge", "right", "open", "true", "powered", "false"))
         );
         $$0.put(
            "minecraft:" + $$1 + "westupperrighttruetrue",
            bav.a($$2, Map.of("facing", "west", "half", "upper", "hinge", "right", "open", "true", "powered", "true"))
         );
      }

      private static void a(Map<String, Dynamic<?>> $$0, int $$1, String $$2) {
         $$0.put("southfalsefoot" + $$1, bav.a("minecraft:" + $$2 + "_bed", Map.of("facing", "south", "occupied", "false", "part", "foot")));
         $$0.put("westfalsefoot" + $$1, bav.a("minecraft:" + $$2 + "_bed", Map.of("facing", "west", "occupied", "false", "part", "foot")));
         $$0.put("northfalsefoot" + $$1, bav.a("minecraft:" + $$2 + "_bed", Map.of("facing", "north", "occupied", "false", "part", "foot")));
         $$0.put("eastfalsefoot" + $$1, bav.a("minecraft:" + $$2 + "_bed", Map.of("facing", "east", "occupied", "false", "part", "foot")));
         $$0.put("southfalsehead" + $$1, bav.a("minecraft:" + $$2 + "_bed", Map.of("facing", "south", "occupied", "false", "part", "head")));
         $$0.put("westfalsehead" + $$1, bav.a("minecraft:" + $$2 + "_bed", Map.of("facing", "west", "occupied", "false", "part", "head")));
         $$0.put("northfalsehead" + $$1, bav.a("minecraft:" + $$2 + "_bed", Map.of("facing", "north", "occupied", "false", "part", "head")));
         $$0.put("eastfalsehead" + $$1, bav.a("minecraft:" + $$2 + "_bed", Map.of("facing", "east", "occupied", "false", "part", "head")));
         $$0.put("southtruehead" + $$1, bav.a("minecraft:" + $$2 + "_bed", Map.of("facing", "south", "occupied", "true", "part", "head")));
         $$0.put("westtruehead" + $$1, bav.a("minecraft:" + $$2 + "_bed", Map.of("facing", "west", "occupied", "true", "part", "head")));
         $$0.put("northtruehead" + $$1, bav.a("minecraft:" + $$2 + "_bed", Map.of("facing", "north", "occupied", "true", "part", "head")));
         $$0.put("easttruehead" + $$1, bav.a("minecraft:" + $$2 + "_bed", Map.of("facing", "east", "occupied", "true", "part", "head")));
      }

      private static void b(Map<String, Dynamic<?>> $$0, int $$1, String $$2) {
         for (int $$3 = 0; $$3 < 16; $$3++) {
            $$0.put($$3 + "_" + $$1, bav.a("minecraft:" + $$2 + "_banner", Map.of("rotation", String.valueOf($$3))));
         }

         $$0.put("north_" + $$1, bav.a("minecraft:" + $$2 + "_wall_banner", Map.of("facing", "north")));
         $$0.put("south_" + $$1, bav.a("minecraft:" + $$2 + "_wall_banner", Map.of("facing", "south")));
         $$0.put("west_" + $$1, bav.a("minecraft:" + $$2 + "_wall_banner", Map.of("facing", "west")));
         $$0.put("east_" + $$1, bav.a("minecraft:" + $$2 + "_wall_banner", Map.of("facing", "east")));
      }

      static {
         b.set(2);
         b.set(3);
         b.set(110);
         b.set(140);
         b.set(144);
         b.set(25);
         b.set(86);
         b.set(26);
         b.set(176);
         b.set(177);
         b.set(175);
         b.set(64);
         b.set(71);
         b.set(193);
         b.set(194);
         b.set(195);
         b.set(196);
         b.set(197);
         a.set(54);
         a.set(146);
         a.set(25);
         a.set(26);
         a.set(51);
         a.set(53);
         a.set(67);
         a.set(108);
         a.set(109);
         a.set(114);
         a.set(128);
         a.set(134);
         a.set(135);
         a.set(136);
         a.set(156);
         a.set(163);
         a.set(164);
         a.set(180);
         a.set(203);
         a.set(55);
         a.set(85);
         a.set(113);
         a.set(188);
         a.set(189);
         a.set(190);
         a.set(191);
         a.set(192);
         a.set(93);
         a.set(94);
         a.set(101);
         a.set(102);
         a.set(160);
         a.set(106);
         a.set(107);
         a.set(183);
         a.set(184);
         a.set(185);
         a.set(186);
         a.set(187);
         a.set(132);
         a.set(139);
         a.set(199);
      }
   }

   static class d {
      private final ayh<Dynamic<?>> b = ayh.c(32);
      private final List<Dynamic<?>> c;
      private final Dynamic<?> d;
      private final boolean e;
      final Int2ObjectMap<IntList> f = new Int2ObjectLinkedOpenHashMap();
      final IntList g = new IntArrayList();
      public final int a;
      private final Set<Dynamic<?>> h = Sets.newIdentityHashSet();
      private final int[] i = new int[4096];

      public d(Dynamic<?> $$0) {
         this.c = Lists.newArrayList();
         this.d = $$0;
         this.a = $$0.get("Y").asInt(0);
         this.e = $$0.get("Blocks").result().isPresent();
      }

      public Dynamic<?> a(int $$0) {
         if ($$0 >= 0 && $$0 <= 4095) {
            Dynamic<?> $$1 = this.b.a(this.i[$$0]);
            return $$1 == null ? bct.c.t : $$1;
         } else {
            return bct.c.t;
         }
      }

      public void a(int $$0, Dynamic<?> $$1) {
         if (this.h.add($$1)) {
            this.c.add("%%FILTER_ME%%".equals(bct.a($$1)) ? bct.c.t : $$1);
         }

         this.i[$$0] = bct.a(this.b, $$1);
      }

      public int b(int $$0) {
         if (!this.e) {
            return $$0;
         } else {
            ByteBuffer $$1 = (ByteBuffer)this.d.get("Blocks").asByteBufferOpt().result().get();
            bct.a $$2 = this.d.get("Data").asByteBufferOpt().map($$0x -> new bct.a(DataFixUtils.toArray($$0x))).result().orElseGet(bct.a::new);
            bct.a $$3 = this.d.get("Add").asByteBufferOpt().map($$0x -> new bct.a(DataFixUtils.toArray($$0x))).result().orElseGet(bct.a::new);
            this.h.add(bct.c.t);
            bct.a(this.b, bct.c.t);
            this.c.add(bct.c.t);

            for (int $$4 = 0; $$4 < 4096; $$4++) {
               int $$5 = $$4 & 15;
               int $$6 = $$4 >> 8 & 15;
               int $$7 = $$4 >> 4 & 15;
               int $$8 = $$3.a($$5, $$6, $$7) << 12 | ($$1.get($$4) & 255) << 4 | $$2.a($$5, $$6, $$7);
               if (bct.c.b.get($$8 >> 4)) {
                  this.a($$8 >> 4, $$4);
               }

               if (bct.c.a.get($$8 >> 4)) {
                  int $$9 = bct.a($$5 == 0, $$5 == 15, $$7 == 0, $$7 == 15);
                  if ($$9 == 0) {
                     this.g.add($$4);
                  } else {
                     $$0 |= $$9;
                  }
               }

               this.a($$4, bcg.b($$8));
            }

            return $$0;
         }
      }

      private void a(int $$0, int $$1) {
         IntList $$2 = (IntList)this.f.get($$0);
         if ($$2 == null) {
            $$2 = new IntArrayList();
            this.f.put($$0, $$2);
         }

         $$2.add($$1);
      }

      public Dynamic<?> a() {
         Dynamic<?> $$0 = this.d;
         if (!this.e) {
            return $$0;
         } else {
            $$0 = $$0.set("Palette", $$0.createList(this.c.stream()));
            int $$1 = Math.max(4, DataFixUtils.ceillog2(this.h.size()));
            bax $$2 = new bax($$1, 4096);

            for (int $$3 = 0; $$3 < this.i.length; $$3++) {
               $$2.a($$3, this.i[$$3]);
            }

            $$0 = $$0.set("BlockStates", $$0.createLongList(Arrays.stream($$2.a())));
            $$0 = $$0.remove("Blocks");
            $$0 = $$0.remove("Data");
            return $$0.remove("Add");
         }
      }
   }

   static final class e {
      private int a;
      private final bct.d[] b = new bct.d[16];
      private final Dynamic<?> c;
      private final int d;
      private final int e;
      private final Int2ObjectMap<Dynamic<?>> f = new Int2ObjectLinkedOpenHashMap(16);

      public e(Dynamic<?> $$0) {
         this.c = $$0;
         this.d = $$0.get("xPos").asInt(0) << 4;
         this.e = $$0.get("zPos").asInt(0) << 4;
         $$0.get("TileEntities").asStreamOpt().ifSuccess($$0x -> $$0x.forEach($$0xx -> {
               int $$1x = $$0xx.get("x").asInt(0) - this.d & 15;
               int $$2x = $$0xx.get("y").asInt(0);
               int $$3x = $$0xx.get("z").asInt(0) - this.e & 15;
               int $$4x = $$2x << 8 | $$3x << 4 | $$1x;
               if (this.f.put($$4x, $$0xx) != null) {
                  bct.i.warn("In chunk: {}x{} found a duplicate block entity at position: [{}, {}, {}]", new Object[]{this.d, this.e, $$1x, $$2x, $$3x});
               }
            }));
         boolean $$1 = $$0.get("convertedFromAlphaFormat").asBoolean(false);
         $$0.get("Sections").asStreamOpt().ifSuccess($$0x -> $$0x.forEach($$0xx -> {
               bct.d $$1x = new bct.d($$0xx);
               this.a = $$1x.b(this.a);
               this.b[$$1x.a] = $$1x;
            }));

         for (bct.d $$2 : this.b) {
            if ($$2 != null) {
               ObjectIterator var7 = $$2.f.int2ObjectEntrySet().iterator();

               while (var7.hasNext()) {
                  Entry<IntList> $$3 = (Entry<IntList>)var7.next();
                  int $$4 = $$2.a << 12;
                  switch ($$3.getIntKey()) {
                     case 2:
                        IntListIterator var30 = ((IntList)$$3.getValue()).iterator();

                        while (var30.hasNext()) {
                           int $$5 = (Integer)var30.next();
                           $$5 |= $$4;
                           Dynamic<?> $$6 = this.a($$5);
                           if ("minecraft:grass_block".equals(bct.a($$6))) {
                              String $$7 = bct.a(this.a(a($$5, bct.b.b)));
                              if ("minecraft:snow".equals($$7) || "minecraft:snow_layer".equals($$7)) {
                                 this.a($$5, bct.c.e);
                              }
                           }
                        }
                        break;
                     case 3:
                        IntListIterator var29 = ((IntList)$$3.getValue()).iterator();

                        while (var29.hasNext()) {
                           int $$8 = (Integer)var29.next();
                           $$8 |= $$4;
                           Dynamic<?> $$9 = this.a($$8);
                           if ("minecraft:podzol".equals(bct.a($$9))) {
                              String $$10 = bct.a(this.a(a($$8, bct.b.b)));
                              if ("minecraft:snow".equals($$10) || "minecraft:snow_layer".equals($$10)) {
                                 this.a($$8, bct.c.d);
                              }
                           }
                        }
                        break;
                     case 25:
                        IntListIterator var28 = ((IntList)$$3.getValue()).iterator();

                        while (var28.hasNext()) {
                           int $$14 = (Integer)var28.next();
                           $$14 |= $$4;
                           Dynamic<?> $$15 = this.c($$14);
                           if ($$15 != null) {
                              String $$16 = Boolean.toString($$15.get("powered").asBoolean(false)) + (byte)Math.min(Math.max($$15.get("note").asInt(0), 0), 24);
                              this.a($$14, bct.c.p.getOrDefault($$16, bct.c.p.get("false0")));
                           }
                        }
                        break;
                     case 26:
                        IntListIterator var27 = ((IntList)$$3.getValue()).iterator();

                        while (var27.hasNext()) {
                           int $$17 = (Integer)var27.next();
                           $$17 |= $$4;
                           Dynamic<?> $$18 = this.b($$17);
                           Dynamic<?> $$19 = this.a($$17);
                           if ($$18 != null) {
                              int $$20 = $$18.get("color").asInt(0);
                              if ($$20 != 14 && $$20 >= 0 && $$20 < 16) {
                                 String $$21 = bct.a($$19, "facing") + bct.a($$19, "occupied") + bct.a($$19, "part") + $$20;
                                 if (bct.c.r.containsKey($$21)) {
                                    this.a($$17, bct.c.r.get($$21));
                                 }
                              }
                           }
                        }
                        break;
                     case 64:
                     case 71:
                     case 193:
                     case 194:
                     case 195:
                     case 196:
                     case 197:
                        IntListIterator var26 = ((IntList)$$3.getValue()).iterator();

                        while (var26.hasNext()) {
                           int $$39 = (Integer)var26.next();
                           $$39 |= $$4;
                           Dynamic<?> $$40 = this.a($$39);
                           if (bct.a($$40).endsWith("_door")) {
                              Dynamic<?> $$41 = this.a($$39);
                              if ("lower".equals(bct.a($$41, "half"))) {
                                 int $$42 = a($$39, bct.b.b);
                                 Dynamic<?> $$43 = this.a($$42);
                                 String $$44 = bct.a($$41);
                                 if ($$44.equals(bct.a($$43))) {
                                    String $$45 = bct.a($$41, "facing");
                                    String $$46 = bct.a($$41, "open");
                                    String $$47 = $$1 ? "left" : bct.a($$43, "hinge");
                                    String $$48 = $$1 ? "false" : bct.a($$43, "powered");
                                    this.a($$39, bct.c.o.get($$44 + $$45 + "lower" + $$47 + $$46 + $$48));
                                    this.a($$42, bct.c.o.get($$44 + $$45 + "upper" + $$47 + $$46 + $$48));
                                 }
                              }
                           }
                        }
                        break;
                     case 86:
                        IntListIterator var25 = ((IntList)$$3.getValue()).iterator();

                        while (var25.hasNext()) {
                           int $$27 = (Integer)var25.next();
                           $$27 |= $$4;
                           Dynamic<?> $$28 = this.a($$27);
                           if ("minecraft:carved_pumpkin".equals(bct.a($$28))) {
                              String $$29 = bct.a(this.a(a($$27, bct.b.a)));
                              if ("minecraft:grass_block".equals($$29) || "minecraft:dirt".equals($$29)) {
                                 this.a($$27, bct.c.c);
                              }
                           }
                        }
                        break;
                     case 110:
                        IntListIterator var24 = ((IntList)$$3.getValue()).iterator();

                        while (var24.hasNext()) {
                           int $$11 = (Integer)var24.next();
                           $$11 |= $$4;
                           Dynamic<?> $$12 = this.a($$11);
                           if ("minecraft:mycelium".equals(bct.a($$12))) {
                              String $$13 = bct.a(this.a(a($$11, bct.b.b)));
                              if ("minecraft:snow".equals($$13) || "minecraft:snow_layer".equals($$13)) {
                                 this.a($$11, bct.c.f);
                              }
                           }
                        }
                        break;
                     case 140:
                        IntListIterator var23 = ((IntList)$$3.getValue()).iterator();

                        while (var23.hasNext()) {
                           int $$30 = (Integer)var23.next();
                           $$30 |= $$4;
                           Dynamic<?> $$31 = this.c($$30);
                           if ($$31 != null) {
                              String $$32 = $$31.get("Item").asString("") + $$31.get("Data").asInt(0);
                              this.a($$30, bct.c.m.getOrDefault($$32, bct.c.m.get("minecraft:air0")));
                           }
                        }
                        break;
                     case 144:
                        IntListIterator var22 = ((IntList)$$3.getValue()).iterator();

                        while (var22.hasNext()) {
                           int $$33 = (Integer)var22.next();
                           $$33 |= $$4;
                           Dynamic<?> $$34 = this.b($$33);
                           if ($$34 != null) {
                              String $$35 = String.valueOf($$34.get("SkullType").asInt(0));
                              String $$36 = bct.a(this.a($$33), "facing");
                              String $$38;
                              if (!"up".equals($$36) && !"down".equals($$36)) {
                                 $$38 = $$35 + $$36;
                              } else {
                                 $$38 = $$35 + $$34.get("Rot").asInt(0);
                              }

                              $$34.remove("SkullType");
                              $$34.remove("facing");
                              $$34.remove("Rot");
                              this.a($$33, bct.c.n.getOrDefault($$38, bct.c.n.get("0north")));
                           }
                        }
                        break;
                     case 175:
                        IntListIterator var21 = ((IntList)$$3.getValue()).iterator();

                        while (var21.hasNext()) {
                           int $$49 = (Integer)var21.next();
                           $$49 |= $$4;
                           Dynamic<?> $$50 = this.a($$49);
                           if ("upper".equals(bct.a($$50, "half"))) {
                              Dynamic<?> $$51 = this.a(a($$49, bct.b.a));
                              String $$52 = bct.a($$51);
                              switch ($$52) {
                                 case "minecraft:sunflower":
                                    this.a($$49, bct.c.g);
                                    break;
                                 case "minecraft:lilac":
                                    this.a($$49, bct.c.h);
                                    break;
                                 case "minecraft:tall_grass":
                                    this.a($$49, bct.c.i);
                                    break;
                                 case "minecraft:large_fern":
                                    this.a($$49, bct.c.j);
                                    break;
                                 case "minecraft:rose_bush":
                                    this.a($$49, bct.c.k);
                                    break;
                                 case "minecraft:peony":
                                    this.a($$49, bct.c.l);
                              }
                           }
                        }
                        break;
                     case 176:
                     case 177:
                        IntListIterator var10 = ((IntList)$$3.getValue()).iterator();

                        while (var10.hasNext()) {
                           int $$22 = (Integer)var10.next();
                           $$22 |= $$4;
                           Dynamic<?> $$23 = this.b($$22);
                           Dynamic<?> $$24 = this.a($$22);
                           if ($$23 != null) {
                              int $$25 = $$23.get("Base").asInt(0);
                              if ($$25 != 15 && $$25 >= 0 && $$25 < 16) {
                                 String $$26 = bct.a($$24, $$3.getIntKey() == 176 ? "rotation" : "facing") + "_" + $$25;
                                 if (bct.c.s.containsKey($$26)) {
                                    this.a($$22, bct.c.s.get($$26));
                                 }
                              }
                           }
                        }
                  }
               }
            }
         }
      }

      @Nullable
      private Dynamic<?> b(int $$0) {
         return (Dynamic<?>)this.f.get($$0);
      }

      @Nullable
      private Dynamic<?> c(int $$0) {
         return (Dynamic<?>)this.f.remove($$0);
      }

      public static int a(int $$0, bct.b $$1) {
         int var10000;
         switch ($$1.b()) {
            case a:
               int $$2 = ($$0 & 15) + $$1.a().a();
               var10000 = $$2 >= 0 && $$2 <= 15 ? $$0 & -16 | $$2 : -1;
               break;
            case b:
               int $$3 = ($$0 >> 8) + $$1.a().a();
               var10000 = $$3 >= 0 && $$3 <= 255 ? $$0 & 0xFF | $$3 << 8 : -1;
               break;
            case c:
               int $$4 = ($$0 >> 4 & 15) + $$1.a().a();
               var10000 = $$4 >= 0 && $$4 <= 15 ? $$0 & -241 | $$4 << 4 : -1;
               break;
            default:
               throw new MatchException(null, null);
         }

         return var10000;
      }

      private void a(int $$0, Dynamic<?> $$1) {
         if ($$0 >= 0 && $$0 <= 65535) {
            bct.d $$2 = this.d($$0);
            if ($$2 != null) {
               $$2.a($$0 & 4095, $$1);
            }
         }
      }

      @Nullable
      private bct.d d(int $$0) {
         int $$1 = $$0 >> 12;
         return $$1 < this.b.length ? this.b[$$1] : null;
      }

      public Dynamic<?> a(int $$0) {
         if ($$0 >= 0 && $$0 <= 65535) {
            bct.d $$1 = this.d($$0);
            return $$1 == null ? bct.c.t : $$1.a($$0 & 4095);
         } else {
            return bct.c.t;
         }
      }

      public Dynamic<?> a() {
         Dynamic<?> $$0 = this.c;
         if (this.f.isEmpty()) {
            $$0 = $$0.remove("TileEntities");
         } else {
            $$0 = $$0.set("TileEntities", $$0.createList(this.f.values().stream()));
         }

         Dynamic<?> $$1 = $$0.emptyMap();
         List<Dynamic<?>> $$2 = Lists.newArrayList();

         for (bct.d $$3 : this.b) {
            if ($$3 != null) {
               $$2.add($$3.a());
               $$1 = $$1.set(String.valueOf($$3.a), $$1.createIntList(Arrays.stream($$3.g.toIntArray())));
            }
         }

         Dynamic<?> $$4 = $$0.emptyMap();
         $$4 = $$4.set("Sides", $$4.createByte((byte)this.a));
         $$4 = $$4.set("Indices", $$1);
         return $$0.set("UpgradeData", $$4).set("Sections", $$4.createList($$2.stream()));
      }
   }
}
