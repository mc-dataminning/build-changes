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

public class azh extends DataFix {
   private static final int a = 128;
   private static final int b = 64;
   private static final int c = 32;
   private static final int d = 16;
   private static final int e = 8;
   private static final int f = 4;
   private static final int g = 2;
   private static final int h = 1;
   static final Logger i = LogUtils.getLogger();
   static final BitSet j = new BitSet(256);
   static final BitSet k = new BitSet(256);
   static final Dynamic<?> l = ayv.b("{Name:'minecraft:pumpkin'}");
   static final Dynamic<?> m = ayv.b("{Name:'minecraft:podzol',Properties:{snowy:'true'}}");
   static final Dynamic<?> n = ayv.b("{Name:'minecraft:grass_block',Properties:{snowy:'true'}}");
   static final Dynamic<?> o = ayv.b("{Name:'minecraft:mycelium',Properties:{snowy:'true'}}");
   static final Dynamic<?> p = ayv.b("{Name:'minecraft:sunflower',Properties:{half:'upper'}}");
   static final Dynamic<?> q = ayv.b("{Name:'minecraft:lilac',Properties:{half:'upper'}}");
   static final Dynamic<?> r = ayv.b("{Name:'minecraft:tall_grass',Properties:{half:'upper'}}");
   static final Dynamic<?> s = ayv.b("{Name:'minecraft:large_fern',Properties:{half:'upper'}}");
   static final Dynamic<?> t = ayv.b("{Name:'minecraft:rose_bush',Properties:{half:'upper'}}");
   static final Dynamic<?> u = ayv.b("{Name:'minecraft:peony',Properties:{half:'upper'}}");
   static final Map<String, Dynamic<?>> v = (Map<String, Dynamic<?>>)DataFixUtils.make(Maps.newHashMap(), $$0 -> {
      $$0.put("minecraft:air0", ayv.b("{Name:'minecraft:flower_pot'}"));
      $$0.put("minecraft:red_flower0", ayv.b("{Name:'minecraft:potted_poppy'}"));
      $$0.put("minecraft:red_flower1", ayv.b("{Name:'minecraft:potted_blue_orchid'}"));
      $$0.put("minecraft:red_flower2", ayv.b("{Name:'minecraft:potted_allium'}"));
      $$0.put("minecraft:red_flower3", ayv.b("{Name:'minecraft:potted_azure_bluet'}"));
      $$0.put("minecraft:red_flower4", ayv.b("{Name:'minecraft:potted_red_tulip'}"));
      $$0.put("minecraft:red_flower5", ayv.b("{Name:'minecraft:potted_orange_tulip'}"));
      $$0.put("minecraft:red_flower6", ayv.b("{Name:'minecraft:potted_white_tulip'}"));
      $$0.put("minecraft:red_flower7", ayv.b("{Name:'minecraft:potted_pink_tulip'}"));
      $$0.put("minecraft:red_flower8", ayv.b("{Name:'minecraft:potted_oxeye_daisy'}"));
      $$0.put("minecraft:yellow_flower0", ayv.b("{Name:'minecraft:potted_dandelion'}"));
      $$0.put("minecraft:sapling0", ayv.b("{Name:'minecraft:potted_oak_sapling'}"));
      $$0.put("minecraft:sapling1", ayv.b("{Name:'minecraft:potted_spruce_sapling'}"));
      $$0.put("minecraft:sapling2", ayv.b("{Name:'minecraft:potted_birch_sapling'}"));
      $$0.put("minecraft:sapling3", ayv.b("{Name:'minecraft:potted_jungle_sapling'}"));
      $$0.put("minecraft:sapling4", ayv.b("{Name:'minecraft:potted_acacia_sapling'}"));
      $$0.put("minecraft:sapling5", ayv.b("{Name:'minecraft:potted_dark_oak_sapling'}"));
      $$0.put("minecraft:red_mushroom0", ayv.b("{Name:'minecraft:potted_red_mushroom'}"));
      $$0.put("minecraft:brown_mushroom0", ayv.b("{Name:'minecraft:potted_brown_mushroom'}"));
      $$0.put("minecraft:deadbush0", ayv.b("{Name:'minecraft:potted_dead_bush'}"));
      $$0.put("minecraft:tallgrass2", ayv.b("{Name:'minecraft:potted_fern'}"));
      $$0.put("minecraft:cactus0", ayv.b(2240));
   });
   static final Map<String, Dynamic<?>> w = (Map<String, Dynamic<?>>)DataFixUtils.make(Maps.newHashMap(), $$0 -> {
      a($$0, 0, "skeleton", "skull");
      a($$0, 1, "wither_skeleton", "skull");
      a($$0, 2, "zombie", "head");
      a($$0, 3, "player", "head");
      a($$0, 4, "creeper", "head");
      a($$0, 5, "dragon", "head");
   });
   static final Map<String, Dynamic<?>> x = (Map<String, Dynamic<?>>)DataFixUtils.make(Maps.newHashMap(), $$0 -> {
      a($$0, "oak_door", 1024);
      a($$0, "iron_door", 1136);
      a($$0, "spruce_door", 3088);
      a($$0, "birch_door", 3104);
      a($$0, "jungle_door", 3120);
      a($$0, "acacia_door", 3136);
      a($$0, "dark_oak_door", 3152);
   });
   static final Map<String, Dynamic<?>> y = (Map<String, Dynamic<?>>)DataFixUtils.make(Maps.newHashMap(), $$0 -> {
      for (int $$1 = 0; $$1 < 26; $$1++) {
         $$0.put("true" + $$1, ayv.b("{Name:'minecraft:note_block',Properties:{powered:'true',note:'" + $$1 + "'}}"));
         $$0.put("false" + $$1, ayv.b("{Name:'minecraft:note_block',Properties:{powered:'false',note:'" + $$1 + "'}}"));
      }
   });
   private static final Int2ObjectMap<String> z = (Int2ObjectMap<String>)DataFixUtils.make(new Int2ObjectOpenHashMap(), $$0 -> {
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
   static final Map<String, Dynamic<?>> A = (Map<String, Dynamic<?>>)DataFixUtils.make(Maps.newHashMap(), $$0 -> {
      ObjectIterator var1 = z.int2ObjectEntrySet().iterator();

      while (var1.hasNext()) {
         Entry<String> $$1 = (Entry<String>)var1.next();
         if (!Objects.equals($$1.getValue(), "red")) {
            a($$0, $$1.getIntKey(), (String)$$1.getValue());
         }
      }
   });
   static final Map<String, Dynamic<?>> B = (Map<String, Dynamic<?>>)DataFixUtils.make(Maps.newHashMap(), $$0 -> {
      ObjectIterator var1 = z.int2ObjectEntrySet().iterator();

      while (var1.hasNext()) {
         Entry<String> $$1 = (Entry<String>)var1.next();
         if (!Objects.equals($$1.getValue(), "white")) {
            b($$0, 15 - $$1.getIntKey(), (String)$$1.getValue());
         }
      }
   });
   static final Dynamic<?> C = ayv.b(0);
   private static final int D = 4096;

   public azh(Schema $$0, boolean $$1) {
      super($$0, $$1);
   }

   private static void a(Map<String, Dynamic<?>> $$0, int $$1, String $$2, String $$3) {
      $$0.put($$1 + "north", ayv.b("{Name:'minecraft:" + $$2 + "_wall_" + $$3 + "',Properties:{facing:'north'}}"));
      $$0.put($$1 + "east", ayv.b("{Name:'minecraft:" + $$2 + "_wall_" + $$3 + "',Properties:{facing:'east'}}"));
      $$0.put($$1 + "south", ayv.b("{Name:'minecraft:" + $$2 + "_wall_" + $$3 + "',Properties:{facing:'south'}}"));
      $$0.put($$1 + "west", ayv.b("{Name:'minecraft:" + $$2 + "_wall_" + $$3 + "',Properties:{facing:'west'}}"));

      for (int $$4 = 0; $$4 < 16; $$4++) {
         $$0.put("" + $$1 + $$4, ayv.b("{Name:'minecraft:" + $$2 + "_" + $$3 + "',Properties:{rotation:'" + $$4 + "'}}"));
      }
   }

   private static void a(Map<String, Dynamic<?>> $$0, String $$1, int $$2) {
      $$0.put(
         "minecraft:" + $$1 + "eastlowerleftfalsefalse",
         ayv.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'east',half:'lower',hinge:'left',open:'false',powered:'false'}}")
      );
      $$0.put(
         "minecraft:" + $$1 + "eastlowerleftfalsetrue",
         ayv.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'east',half:'lower',hinge:'left',open:'false',powered:'true'}}")
      );
      $$0.put(
         "minecraft:" + $$1 + "eastlowerlefttruefalse",
         ayv.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'east',half:'lower',hinge:'left',open:'true',powered:'false'}}")
      );
      $$0.put(
         "minecraft:" + $$1 + "eastlowerlefttruetrue",
         ayv.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'east',half:'lower',hinge:'left',open:'true',powered:'true'}}")
      );
      $$0.put("minecraft:" + $$1 + "eastlowerrightfalsefalse", ayv.b($$2));
      $$0.put(
         "minecraft:" + $$1 + "eastlowerrightfalsetrue",
         ayv.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'east',half:'lower',hinge:'right',open:'false',powered:'true'}}")
      );
      $$0.put("minecraft:" + $$1 + "eastlowerrighttruefalse", ayv.b($$2 + 4));
      $$0.put(
         "minecraft:" + $$1 + "eastlowerrighttruetrue",
         ayv.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'east',half:'lower',hinge:'right',open:'true',powered:'true'}}")
      );
      $$0.put("minecraft:" + $$1 + "eastupperleftfalsefalse", ayv.b($$2 + 8));
      $$0.put("minecraft:" + $$1 + "eastupperleftfalsetrue", ayv.b($$2 + 10));
      $$0.put(
         "minecraft:" + $$1 + "eastupperlefttruefalse",
         ayv.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'east',half:'upper',hinge:'left',open:'true',powered:'false'}}")
      );
      $$0.put(
         "minecraft:" + $$1 + "eastupperlefttruetrue",
         ayv.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'east',half:'upper',hinge:'left',open:'true',powered:'true'}}")
      );
      $$0.put("minecraft:" + $$1 + "eastupperrightfalsefalse", ayv.b($$2 + 9));
      $$0.put("minecraft:" + $$1 + "eastupperrightfalsetrue", ayv.b($$2 + 11));
      $$0.put(
         "minecraft:" + $$1 + "eastupperrighttruefalse",
         ayv.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'east',half:'upper',hinge:'right',open:'true',powered:'false'}}")
      );
      $$0.put(
         "minecraft:" + $$1 + "eastupperrighttruetrue",
         ayv.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'east',half:'upper',hinge:'right',open:'true',powered:'true'}}")
      );
      $$0.put(
         "minecraft:" + $$1 + "northlowerleftfalsefalse",
         ayv.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'north',half:'lower',hinge:'left',open:'false',powered:'false'}}")
      );
      $$0.put(
         "minecraft:" + $$1 + "northlowerleftfalsetrue",
         ayv.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'north',half:'lower',hinge:'left',open:'false',powered:'true'}}")
      );
      $$0.put(
         "minecraft:" + $$1 + "northlowerlefttruefalse",
         ayv.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'north',half:'lower',hinge:'left',open:'true',powered:'false'}}")
      );
      $$0.put(
         "minecraft:" + $$1 + "northlowerlefttruetrue",
         ayv.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'north',half:'lower',hinge:'left',open:'true',powered:'true'}}")
      );
      $$0.put("minecraft:" + $$1 + "northlowerrightfalsefalse", ayv.b($$2 + 3));
      $$0.put(
         "minecraft:" + $$1 + "northlowerrightfalsetrue",
         ayv.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'north',half:'lower',hinge:'right',open:'false',powered:'true'}}")
      );
      $$0.put("minecraft:" + $$1 + "northlowerrighttruefalse", ayv.b($$2 + 7));
      $$0.put(
         "minecraft:" + $$1 + "northlowerrighttruetrue",
         ayv.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'north',half:'lower',hinge:'right',open:'true',powered:'true'}}")
      );
      $$0.put(
         "minecraft:" + $$1 + "northupperleftfalsefalse",
         ayv.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'north',half:'upper',hinge:'left',open:'false',powered:'false'}}")
      );
      $$0.put(
         "minecraft:" + $$1 + "northupperleftfalsetrue",
         ayv.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'north',half:'upper',hinge:'left',open:'false',powered:'true'}}")
      );
      $$0.put(
         "minecraft:" + $$1 + "northupperlefttruefalse",
         ayv.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'north',half:'upper',hinge:'left',open:'true',powered:'false'}}")
      );
      $$0.put(
         "minecraft:" + $$1 + "northupperlefttruetrue",
         ayv.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'north',half:'upper',hinge:'left',open:'true',powered:'true'}}")
      );
      $$0.put(
         "minecraft:" + $$1 + "northupperrightfalsefalse",
         ayv.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'north',half:'upper',hinge:'right',open:'false',powered:'false'}}")
      );
      $$0.put(
         "minecraft:" + $$1 + "northupperrightfalsetrue",
         ayv.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'north',half:'upper',hinge:'right',open:'false',powered:'true'}}")
      );
      $$0.put(
         "minecraft:" + $$1 + "northupperrighttruefalse",
         ayv.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'north',half:'upper',hinge:'right',open:'true',powered:'false'}}")
      );
      $$0.put(
         "minecraft:" + $$1 + "northupperrighttruetrue",
         ayv.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'north',half:'upper',hinge:'right',open:'true',powered:'true'}}")
      );
      $$0.put(
         "minecraft:" + $$1 + "southlowerleftfalsefalse",
         ayv.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'south',half:'lower',hinge:'left',open:'false',powered:'false'}}")
      );
      $$0.put(
         "minecraft:" + $$1 + "southlowerleftfalsetrue",
         ayv.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'south',half:'lower',hinge:'left',open:'false',powered:'true'}}")
      );
      $$0.put(
         "minecraft:" + $$1 + "southlowerlefttruefalse",
         ayv.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'south',half:'lower',hinge:'left',open:'true',powered:'false'}}")
      );
      $$0.put(
         "minecraft:" + $$1 + "southlowerlefttruetrue",
         ayv.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'south',half:'lower',hinge:'left',open:'true',powered:'true'}}")
      );
      $$0.put("minecraft:" + $$1 + "southlowerrightfalsefalse", ayv.b($$2 + 1));
      $$0.put(
         "minecraft:" + $$1 + "southlowerrightfalsetrue",
         ayv.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'south',half:'lower',hinge:'right',open:'false',powered:'true'}}")
      );
      $$0.put("minecraft:" + $$1 + "southlowerrighttruefalse", ayv.b($$2 + 5));
      $$0.put(
         "minecraft:" + $$1 + "southlowerrighttruetrue",
         ayv.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'south',half:'lower',hinge:'right',open:'true',powered:'true'}}")
      );
      $$0.put(
         "minecraft:" + $$1 + "southupperleftfalsefalse",
         ayv.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'south',half:'upper',hinge:'left',open:'false',powered:'false'}}")
      );
      $$0.put(
         "minecraft:" + $$1 + "southupperleftfalsetrue",
         ayv.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'south',half:'upper',hinge:'left',open:'false',powered:'true'}}")
      );
      $$0.put(
         "minecraft:" + $$1 + "southupperlefttruefalse",
         ayv.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'south',half:'upper',hinge:'left',open:'true',powered:'false'}}")
      );
      $$0.put(
         "minecraft:" + $$1 + "southupperlefttruetrue",
         ayv.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'south',half:'upper',hinge:'left',open:'true',powered:'true'}}")
      );
      $$0.put(
         "minecraft:" + $$1 + "southupperrightfalsefalse",
         ayv.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'south',half:'upper',hinge:'right',open:'false',powered:'false'}}")
      );
      $$0.put(
         "minecraft:" + $$1 + "southupperrightfalsetrue",
         ayv.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'south',half:'upper',hinge:'right',open:'false',powered:'true'}}")
      );
      $$0.put(
         "minecraft:" + $$1 + "southupperrighttruefalse",
         ayv.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'south',half:'upper',hinge:'right',open:'true',powered:'false'}}")
      );
      $$0.put(
         "minecraft:" + $$1 + "southupperrighttruetrue",
         ayv.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'south',half:'upper',hinge:'right',open:'true',powered:'true'}}")
      );
      $$0.put(
         "minecraft:" + $$1 + "westlowerleftfalsefalse",
         ayv.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'west',half:'lower',hinge:'left',open:'false',powered:'false'}}")
      );
      $$0.put(
         "minecraft:" + $$1 + "westlowerleftfalsetrue",
         ayv.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'west',half:'lower',hinge:'left',open:'false',powered:'true'}}")
      );
      $$0.put(
         "minecraft:" + $$1 + "westlowerlefttruefalse",
         ayv.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'west',half:'lower',hinge:'left',open:'true',powered:'false'}}")
      );
      $$0.put(
         "minecraft:" + $$1 + "westlowerlefttruetrue",
         ayv.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'west',half:'lower',hinge:'left',open:'true',powered:'true'}}")
      );
      $$0.put("minecraft:" + $$1 + "westlowerrightfalsefalse", ayv.b($$2 + 2));
      $$0.put(
         "minecraft:" + $$1 + "westlowerrightfalsetrue",
         ayv.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'west',half:'lower',hinge:'right',open:'false',powered:'true'}}")
      );
      $$0.put("minecraft:" + $$1 + "westlowerrighttruefalse", ayv.b($$2 + 6));
      $$0.put(
         "minecraft:" + $$1 + "westlowerrighttruetrue",
         ayv.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'west',half:'lower',hinge:'right',open:'true',powered:'true'}}")
      );
      $$0.put(
         "minecraft:" + $$1 + "westupperleftfalsefalse",
         ayv.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'west',half:'upper',hinge:'left',open:'false',powered:'false'}}")
      );
      $$0.put(
         "minecraft:" + $$1 + "westupperleftfalsetrue",
         ayv.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'west',half:'upper',hinge:'left',open:'false',powered:'true'}}")
      );
      $$0.put(
         "minecraft:" + $$1 + "westupperlefttruefalse",
         ayv.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'west',half:'upper',hinge:'left',open:'true',powered:'false'}}")
      );
      $$0.put(
         "minecraft:" + $$1 + "westupperlefttruetrue",
         ayv.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'west',half:'upper',hinge:'left',open:'true',powered:'true'}}")
      );
      $$0.put(
         "minecraft:" + $$1 + "westupperrightfalsefalse",
         ayv.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'west',half:'upper',hinge:'right',open:'false',powered:'false'}}")
      );
      $$0.put(
         "minecraft:" + $$1 + "westupperrightfalsetrue",
         ayv.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'west',half:'upper',hinge:'right',open:'false',powered:'true'}}")
      );
      $$0.put(
         "minecraft:" + $$1 + "westupperrighttruefalse",
         ayv.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'west',half:'upper',hinge:'right',open:'true',powered:'false'}}")
      );
      $$0.put(
         "minecraft:" + $$1 + "westupperrighttruetrue",
         ayv.b("{Name:'minecraft:" + $$1 + "',Properties:{facing:'west',half:'upper',hinge:'right',open:'true',powered:'true'}}")
      );
   }

   private static void a(Map<String, Dynamic<?>> $$0, int $$1, String $$2) {
      $$0.put("southfalsefoot" + $$1, ayv.b("{Name:'minecraft:" + $$2 + "_bed',Properties:{facing:'south',occupied:'false',part:'foot'}}"));
      $$0.put("westfalsefoot" + $$1, ayv.b("{Name:'minecraft:" + $$2 + "_bed',Properties:{facing:'west',occupied:'false',part:'foot'}}"));
      $$0.put("northfalsefoot" + $$1, ayv.b("{Name:'minecraft:" + $$2 + "_bed',Properties:{facing:'north',occupied:'false',part:'foot'}}"));
      $$0.put("eastfalsefoot" + $$1, ayv.b("{Name:'minecraft:" + $$2 + "_bed',Properties:{facing:'east',occupied:'false',part:'foot'}}"));
      $$0.put("southfalsehead" + $$1, ayv.b("{Name:'minecraft:" + $$2 + "_bed',Properties:{facing:'south',occupied:'false',part:'head'}}"));
      $$0.put("westfalsehead" + $$1, ayv.b("{Name:'minecraft:" + $$2 + "_bed',Properties:{facing:'west',occupied:'false',part:'head'}}"));
      $$0.put("northfalsehead" + $$1, ayv.b("{Name:'minecraft:" + $$2 + "_bed',Properties:{facing:'north',occupied:'false',part:'head'}}"));
      $$0.put("eastfalsehead" + $$1, ayv.b("{Name:'minecraft:" + $$2 + "_bed',Properties:{facing:'east',occupied:'false',part:'head'}}"));
      $$0.put("southtruehead" + $$1, ayv.b("{Name:'minecraft:" + $$2 + "_bed',Properties:{facing:'south',occupied:'true',part:'head'}}"));
      $$0.put("westtruehead" + $$1, ayv.b("{Name:'minecraft:" + $$2 + "_bed',Properties:{facing:'west',occupied:'true',part:'head'}}"));
      $$0.put("northtruehead" + $$1, ayv.b("{Name:'minecraft:" + $$2 + "_bed',Properties:{facing:'north',occupied:'true',part:'head'}}"));
      $$0.put("easttruehead" + $$1, ayv.b("{Name:'minecraft:" + $$2 + "_bed',Properties:{facing:'east',occupied:'true',part:'head'}}"));
   }

   private static void b(Map<String, Dynamic<?>> $$0, int $$1, String $$2) {
      for (int $$3 = 0; $$3 < 16; $$3++) {
         $$0.put($$3 + "_" + $$1, ayv.b("{Name:'minecraft:" + $$2 + "_banner',Properties:{rotation:'" + $$3 + "'}}"));
      }

      $$0.put("north_" + $$1, ayv.b("{Name:'minecraft:" + $$2 + "_wall_banner',Properties:{facing:'north'}}"));
      $$0.put("south_" + $$1, ayv.b("{Name:'minecraft:" + $$2 + "_wall_banner',Properties:{facing:'south'}}"));
      $$0.put("west_" + $$1, ayv.b("{Name:'minecraft:" + $$2 + "_wall_banner',Properties:{facing:'west'}}"));
      $$0.put("east_" + $$1, ayv.b("{Name:'minecraft:" + $$2 + "_wall_banner',Properties:{facing:'east'}}"));
   }

   public static String a(Dynamic<?> $$0) {
      return $$0.get("Name").asString("");
   }

   public static String a(Dynamic<?> $$0, String $$1) {
      return $$0.get("Properties").get($$1).asString("");
   }

   public static int a(avj<Dynamic<?>> $$0, Dynamic<?> $$1) {
      int $$2 = $$0.a($$1);
      if ($$2 == -1) {
         $$2 = $$0.d($$1);
      }

      return $$2;
   }

   private Dynamic<?> b(Dynamic<?> $$0) {
      Optional<? extends Dynamic<?>> $$1 = $$0.get("Level").result();
      return $$1.isPresent() && $$1.get().get("Sections").asStreamOpt().result().isPresent() ? $$0.set("Level", new azh.d((Dynamic<?>)$$1.get()).a()) : $$0;
   }

   public TypeRewriteRule makeRule() {
      Type<?> $$0 = this.getInputSchema().getType(bdt.c);
      Type<?> $$1 = this.getOutputSchema().getType(bdt.c);
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

   static {
      k.set(2);
      k.set(3);
      k.set(110);
      k.set(140);
      k.set(144);
      k.set(25);
      k.set(86);
      k.set(26);
      k.set(176);
      k.set(177);
      k.set(175);
      k.set(64);
      k.set(71);
      k.set(193);
      k.set(194);
      k.set(195);
      k.set(196);
      k.set(197);
      j.set(54);
      j.set(146);
      j.set(25);
      j.set(26);
      j.set(51);
      j.set(53);
      j.set(67);
      j.set(108);
      j.set(109);
      j.set(114);
      j.set(128);
      j.set(134);
      j.set(135);
      j.set(136);
      j.set(156);
      j.set(163);
      j.set(164);
      j.set(180);
      j.set(203);
      j.set(55);
      j.set(85);
      j.set(113);
      j.set(188);
      j.set(189);
      j.set(190);
      j.set(191);
      j.set(192);
      j.set(93);
      j.set(94);
      j.set(101);
      j.set(102);
      j.set(160);
      j.set(106);
      j.set(107);
      j.set(183);
      j.set(184);
      j.set(185);
      j.set(186);
      j.set(187);
      j.set(132);
      j.set(139);
      j.set(199);
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
      a(azh.b.b.b, azh.b.a.b),
      b(azh.b.b.a, azh.b.a.b),
      c(azh.b.b.b, azh.b.a.c),
      d(azh.b.b.a, azh.b.a.c),
      e(azh.b.b.b, azh.b.a.a),
      f(azh.b.b.a, azh.b.a.a);

      private final azh.b.a g;
      private final azh.b.b h;

      private b(azh.b.b $$0, azh.b.a $$1) {
         this.g = $$1;
         this.h = $$0;
      }

      public azh.b.b a() {
         return this.h;
      }

      public azh.b.a b() {
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

         private b(int $$0) {
            this.c = $$0;
         }

         public int a() {
            return this.c;
         }
      }
   }

   static class c {
      private final avj<Dynamic<?>> b = avj.c(32);
      private final List<Dynamic<?>> c;
      private final Dynamic<?> d;
      private final boolean e;
      final Int2ObjectMap<IntList> f = new Int2ObjectLinkedOpenHashMap();
      final IntList g = new IntArrayList();
      public final int a;
      private final Set<Dynamic<?>> h = Sets.newIdentityHashSet();
      private final int[] i = new int[4096];

      public c(Dynamic<?> $$0) {
         this.c = Lists.newArrayList();
         this.d = $$0;
         this.a = $$0.get("Y").asInt(0);
         this.e = $$0.get("Blocks").result().isPresent();
      }

      public Dynamic<?> a(int $$0) {
         if ($$0 >= 0 && $$0 <= 4095) {
            Dynamic<?> $$1 = this.b.a(this.i[$$0]);
            return $$1 == null ? azh.C : $$1;
         } else {
            return azh.C;
         }
      }

      public void a(int $$0, Dynamic<?> $$1) {
         if (this.h.add($$1)) {
            this.c.add("%%FILTER_ME%%".equals(azh.a($$1)) ? azh.C : $$1);
         }

         this.i[$$0] = azh.a(this.b, $$1);
      }

      public int b(int $$0) {
         if (!this.e) {
            return $$0;
         } else {
            ByteBuffer $$1 = (ByteBuffer)this.d.get("Blocks").asByteBufferOpt().result().get();
            azh.a $$2 = this.d.get("Data").asByteBufferOpt().map($$0x -> new azh.a(DataFixUtils.toArray($$0x))).result().orElseGet(azh.a::new);
            azh.a $$3 = this.d.get("Add").asByteBufferOpt().map($$0x -> new azh.a(DataFixUtils.toArray($$0x))).result().orElseGet(azh.a::new);
            this.h.add(azh.C);
            azh.a(this.b, azh.C);
            this.c.add(azh.C);

            for (int $$4 = 0; $$4 < 4096; $$4++) {
               int $$5 = $$4 & 15;
               int $$6 = $$4 >> 8 & 15;
               int $$7 = $$4 >> 4 & 15;
               int $$8 = $$3.a($$5, $$6, $$7) << 12 | ($$1.get($$4) & 255) << 4 | $$2.a($$5, $$6, $$7);
               if (azh.k.get($$8 >> 4)) {
                  this.a($$8 >> 4, $$4);
               }

               if (azh.j.get($$8 >> 4)) {
                  int $$9 = azh.a($$5 == 0, $$5 == 15, $$7 == 0, $$7 == 15);
                  if ($$9 == 0) {
                     this.g.add($$4);
                  } else {
                     $$0 |= $$9;
                  }
               }

               this.a($$4, ayv.b($$8));
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
            axu $$2 = new axu($$1, 4096);

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

   static final class d {
      private int a;
      private final azh.c[] b = new azh.c[16];
      private final Dynamic<?> c;
      private final int d;
      private final int e;
      private final Int2ObjectMap<Dynamic<?>> f = new Int2ObjectLinkedOpenHashMap(16);

      public d(Dynamic<?> $$0) {
         this.c = $$0;
         this.d = $$0.get("xPos").asInt(0) << 4;
         this.e = $$0.get("zPos").asInt(0) << 4;
         $$0.get("TileEntities").asStreamOpt().result().ifPresent($$0x -> $$0x.forEach($$0xx -> {
               int $$1x = $$0xx.get("x").asInt(0) - this.d & 15;
               int $$2x = $$0xx.get("y").asInt(0);
               int $$3x = $$0xx.get("z").asInt(0) - this.e & 15;
               int $$4x = $$2x << 8 | $$3x << 4 | $$1x;
               if (this.f.put($$4x, $$0xx) != null) {
                  azh.i.warn("In chunk: {}x{} found a duplicate block entity at position: [{}, {}, {}]", new Object[]{this.d, this.e, $$1x, $$2x, $$3x});
               }
            }));
         boolean $$1 = $$0.get("convertedFromAlphaFormat").asBoolean(false);
         $$0.get("Sections").asStreamOpt().result().ifPresent($$0x -> $$0x.forEach($$0xx -> {
               azh.c $$1x = new azh.c($$0xx);
               this.a = $$1x.b(this.a);
               this.b[$$1x.a] = $$1x;
            }));

         for (azh.c $$2 : this.b) {
            if ($$2 != null) {
               ObjectIterator var7 = $$2.f.entrySet().iterator();

               while (var7.hasNext()) {
                  java.util.Map.Entry<Integer, IntList> $$3 = (java.util.Map.Entry<Integer, IntList>)var7.next();
                  int $$4 = $$2.a << 12;
                  switch ($$3.getKey()) {
                     case 2:
                        IntListIterator var30 = $$3.getValue().iterator();

                        while (var30.hasNext()) {
                           int $$5 = (Integer)var30.next();
                           $$5 |= $$4;
                           Dynamic<?> $$6 = this.a($$5);
                           if ("minecraft:grass_block".equals(azh.a($$6))) {
                              String $$7 = azh.a(this.a(a($$5, azh.b.b)));
                              if ("minecraft:snow".equals($$7) || "minecraft:snow_layer".equals($$7)) {
                                 this.a($$5, azh.n);
                              }
                           }
                        }
                        break;
                     case 3:
                        IntListIterator var29 = $$3.getValue().iterator();

                        while (var29.hasNext()) {
                           int $$8 = (Integer)var29.next();
                           $$8 |= $$4;
                           Dynamic<?> $$9 = this.a($$8);
                           if ("minecraft:podzol".equals(azh.a($$9))) {
                              String $$10 = azh.a(this.a(a($$8, azh.b.b)));
                              if ("minecraft:snow".equals($$10) || "minecraft:snow_layer".equals($$10)) {
                                 this.a($$8, azh.m);
                              }
                           }
                        }
                        break;
                     case 25:
                        IntListIterator var28 = $$3.getValue().iterator();

                        while (var28.hasNext()) {
                           int $$14 = (Integer)var28.next();
                           $$14 |= $$4;
                           Dynamic<?> $$15 = this.c($$14);
                           if ($$15 != null) {
                              String $$16 = Boolean.toString($$15.get("powered").asBoolean(false)) + (byte)Math.min(Math.max($$15.get("note").asInt(0), 0), 24);
                              this.a($$14, azh.y.getOrDefault($$16, azh.y.get("false0")));
                           }
                        }
                        break;
                     case 26:
                        IntListIterator var27 = $$3.getValue().iterator();

                        while (var27.hasNext()) {
                           int $$17 = (Integer)var27.next();
                           $$17 |= $$4;
                           Dynamic<?> $$18 = this.b($$17);
                           Dynamic<?> $$19 = this.a($$17);
                           if ($$18 != null) {
                              int $$20 = $$18.get("color").asInt(0);
                              if ($$20 != 14 && $$20 >= 0 && $$20 < 16) {
                                 String $$21 = azh.a($$19, "facing") + azh.a($$19, "occupied") + azh.a($$19, "part") + $$20;
                                 if (azh.A.containsKey($$21)) {
                                    this.a($$17, azh.A.get($$21));
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
                        IntListIterator var26 = $$3.getValue().iterator();

                        while (var26.hasNext()) {
                           int $$39 = (Integer)var26.next();
                           $$39 |= $$4;
                           Dynamic<?> $$40 = this.a($$39);
                           if (azh.a($$40).endsWith("_door")) {
                              Dynamic<?> $$41 = this.a($$39);
                              if ("lower".equals(azh.a($$41, "half"))) {
                                 int $$42 = a($$39, azh.b.b);
                                 Dynamic<?> $$43 = this.a($$42);
                                 String $$44 = azh.a($$41);
                                 if ($$44.equals(azh.a($$43))) {
                                    String $$45 = azh.a($$41, "facing");
                                    String $$46 = azh.a($$41, "open");
                                    String $$47 = $$1 ? "left" : azh.a($$43, "hinge");
                                    String $$48 = $$1 ? "false" : azh.a($$43, "powered");
                                    this.a($$39, azh.x.get($$44 + $$45 + "lower" + $$47 + $$46 + $$48));
                                    this.a($$42, azh.x.get($$44 + $$45 + "upper" + $$47 + $$46 + $$48));
                                 }
                              }
                           }
                        }
                        break;
                     case 86:
                        IntListIterator var25 = $$3.getValue().iterator();

                        while (var25.hasNext()) {
                           int $$27 = (Integer)var25.next();
                           $$27 |= $$4;
                           Dynamic<?> $$28 = this.a($$27);
                           if ("minecraft:carved_pumpkin".equals(azh.a($$28))) {
                              String $$29 = azh.a(this.a(a($$27, azh.b.a)));
                              if ("minecraft:grass_block".equals($$29) || "minecraft:dirt".equals($$29)) {
                                 this.a($$27, azh.l);
                              }
                           }
                        }
                        break;
                     case 110:
                        IntListIterator var24 = $$3.getValue().iterator();

                        while (var24.hasNext()) {
                           int $$11 = (Integer)var24.next();
                           $$11 |= $$4;
                           Dynamic<?> $$12 = this.a($$11);
                           if ("minecraft:mycelium".equals(azh.a($$12))) {
                              String $$13 = azh.a(this.a(a($$11, azh.b.b)));
                              if ("minecraft:snow".equals($$13) || "minecraft:snow_layer".equals($$13)) {
                                 this.a($$11, azh.o);
                              }
                           }
                        }
                        break;
                     case 140:
                        IntListIterator var23 = $$3.getValue().iterator();

                        while (var23.hasNext()) {
                           int $$30 = (Integer)var23.next();
                           $$30 |= $$4;
                           Dynamic<?> $$31 = this.c($$30);
                           if ($$31 != null) {
                              String $$32 = $$31.get("Item").asString("") + $$31.get("Data").asInt(0);
                              this.a($$30, azh.v.getOrDefault($$32, azh.v.get("minecraft:air0")));
                           }
                        }
                        break;
                     case 144:
                        IntListIterator var22 = $$3.getValue().iterator();

                        while (var22.hasNext()) {
                           int $$33 = (Integer)var22.next();
                           $$33 |= $$4;
                           Dynamic<?> $$34 = this.b($$33);
                           if ($$34 != null) {
                              String $$35 = String.valueOf($$34.get("SkullType").asInt(0));
                              String $$36 = azh.a(this.a($$33), "facing");
                              String $$38;
                              if (!"up".equals($$36) && !"down".equals($$36)) {
                                 $$38 = $$35 + $$36;
                              } else {
                                 $$38 = $$35 + $$34.get("Rot").asInt(0);
                              }

                              $$34.remove("SkullType");
                              $$34.remove("facing");
                              $$34.remove("Rot");
                              this.a($$33, azh.w.getOrDefault($$38, azh.w.get("0north")));
                           }
                        }
                        break;
                     case 175:
                        IntListIterator var21 = $$3.getValue().iterator();

                        while (var21.hasNext()) {
                           int $$49 = (Integer)var21.next();
                           $$49 |= $$4;
                           Dynamic<?> $$50 = this.a($$49);
                           if ("upper".equals(azh.a($$50, "half"))) {
                              Dynamic<?> $$51 = this.a(a($$49, azh.b.a));
                              String $$52 = azh.a($$51);
                              if ("minecraft:sunflower".equals($$52)) {
                                 this.a($$49, azh.p);
                              } else if ("minecraft:lilac".equals($$52)) {
                                 this.a($$49, azh.q);
                              } else if ("minecraft:tall_grass".equals($$52)) {
                                 this.a($$49, azh.r);
                              } else if ("minecraft:large_fern".equals($$52)) {
                                 this.a($$49, azh.s);
                              } else if ("minecraft:rose_bush".equals($$52)) {
                                 this.a($$49, azh.t);
                              } else if ("minecraft:peony".equals($$52)) {
                                 this.a($$49, azh.u);
                              }
                           }
                        }
                        break;
                     case 176:
                     case 177:
                        IntListIterator var10 = $$3.getValue().iterator();

                        while (var10.hasNext()) {
                           int $$22 = (Integer)var10.next();
                           $$22 |= $$4;
                           Dynamic<?> $$23 = this.b($$22);
                           Dynamic<?> $$24 = this.a($$22);
                           if ($$23 != null) {
                              int $$25 = $$23.get("Base").asInt(0);
                              if ($$25 != 15 && $$25 >= 0 && $$25 < 16) {
                                 String $$26 = azh.a($$24, $$3.getKey() == 176 ? "rotation" : "facing") + "_" + $$25;
                                 if (azh.B.containsKey($$26)) {
                                    this.a($$22, azh.B.get($$26));
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

      public static int a(int $$0, azh.b $$1) {
         switch ($$1.b()) {
            case a:
               int $$2 = ($$0 & 15) + $$1.a().a();
               return $$2 >= 0 && $$2 <= 15 ? $$0 & -16 | $$2 : -1;
            case b:
               int $$3 = ($$0 >> 8) + $$1.a().a();
               return $$3 >= 0 && $$3 <= 255 ? $$0 & 0xFF | $$3 << 8 : -1;
            case c:
               int $$4 = ($$0 >> 4 & 15) + $$1.a().a();
               return $$4 >= 0 && $$4 <= 15 ? $$0 & -241 | $$4 << 4 : -1;
            default:
               return -1;
         }
      }

      private void a(int $$0, Dynamic<?> $$1) {
         if ($$0 >= 0 && $$0 <= 65535) {
            azh.c $$2 = this.d($$0);
            if ($$2 != null) {
               $$2.a($$0 & 4095, $$1);
            }
         }
      }

      @Nullable
      private azh.c d(int $$0) {
         int $$1 = $$0 >> 12;
         return $$1 < this.b.length ? this.b[$$1] : null;
      }

      public Dynamic<?> a(int $$0) {
         if ($$0 >= 0 && $$0 <= 65535) {
            azh.c $$1 = this.d($$0);
            return $$1 == null ? azh.C : $$1.a($$0 & 4095);
         } else {
            return azh.C;
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

         for (azh.c $$3 : this.b) {
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
