import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongList;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class els {
   private static final Map<String, String> a = ae.a(Maps.newHashMap(), $$0 -> {
      $$0.put("Village", "Village");
      $$0.put("Mineshaft", "Mineshaft");
      $$0.put("Mansion", "Mansion");
      $$0.put("Igloo", "Temple");
      $$0.put("Desert_Pyramid", "Temple");
      $$0.put("Jungle_Pyramid", "Temple");
      $$0.put("Swamp_Hut", "Temple");
      $$0.put("Stronghold", "Stronghold");
      $$0.put("Monument", "Monument");
      $$0.put("Fortress", "Fortress");
      $$0.put("EndCity", "EndCity");
   });
   private static final Map<String, String> b = ae.a(Maps.newHashMap(), $$0 -> {
      $$0.put("Iglu", "Igloo");
      $$0.put("TeDP", "Desert_Pyramid");
      $$0.put("TeJP", "Jungle_Pyramid");
      $$0.put("TeSH", "Swamp_Hut");
   });
   private static final Set<String> c = Set.of(
      "pillager_outpost",
      "mineshaft",
      "mansion",
      "jungle_pyramid",
      "desert_pyramid",
      "igloo",
      "ruined_portal",
      "shipwreck",
      "swamp_hut",
      "stronghold",
      "monument",
      "ocean_ruin",
      "fortress",
      "endcity",
      "buried_treasure",
      "village",
      "nether_fossil",
      "bastion_remnant"
   );
   private final boolean d;
   private final Map<String, Long2ObjectMap<uk>> e = Maps.newHashMap();
   private final Map<String, ema> f = Maps.newHashMap();
   private final List<String> g;
   private final List<String> h;

   public els(@Nullable etk $$0, List<String> $$1, List<String> $$2) {
      this.g = $$1;
      this.h = $$2;
      this.a($$0);
      boolean $$3 = false;

      for (String $$4 : this.h) {
         $$3 |= this.e.get($$4) != null;
      }

      this.d = $$3;
   }

   public void a(long $$0) {
      for (String $$1 : this.g) {
         ema $$2 = this.f.get($$1);
         if ($$2 != null && $$2.c($$0)) {
            $$2.d($$0);
         }
      }
   }

   public uk a(uk $$0) {
      uk $$1 = $$0.p("Level");
      deh $$2 = new deh($$1.h("xPos"), $$1.h("zPos"));
      if (this.a($$2.g, $$2.h)) {
         $$0 = this.a($$0, $$2);
      }

      uk $$3 = $$1.p("Structures");
      uk $$4 = $$3.p("References");

      for (String $$5 : this.h) {
         boolean $$6 = c.contains($$5.toLowerCase(Locale.ROOT));
         if (!$$4.b($$5, 12) && $$6) {
            int $$7 = 8;
            LongList $$8 = new LongArrayList();

            for (int $$9 = $$2.g - 8; $$9 <= $$2.g + 8; $$9++) {
               for (int $$10 = $$2.h - 8; $$10 <= $$2.h + 8; $$10++) {
                  if (this.a($$9, $$10, $$5)) {
                     $$8.add(deh.c($$9, $$10));
                  }
               }
            }

            $$4.c($$5, $$8);
         }
      }

      $$3.a("References", $$4);
      $$1.a("Structures", $$3);
      $$0.a("Level", $$1);
      return $$0;
   }

   private boolean a(int $$0, int $$1, String $$2) {
      return !this.d ? false : this.e.get($$2) != null && this.f.get(a.get($$2)).b(deh.c($$0, $$1));
   }

   private boolean a(int $$0, int $$1) {
      if (!this.d) {
         return false;
      } else {
         for (String $$2 : this.h) {
            if (this.e.get($$2) != null && this.f.get(a.get($$2)).c(deh.c($$0, $$1))) {
               return true;
            }
         }

         return false;
      }
   }

   private uk a(uk $$0, deh $$1) {
      uk $$2 = $$0.p("Level");
      uk $$3 = $$2.p("Structures");
      uk $$4 = $$3.p("Starts");

      for (String $$5 : this.h) {
         Long2ObjectMap<uk> $$6 = this.e.get($$5);
         if ($$6 != null) {
            long $$7 = $$1.a();
            if (this.f.get(a.get($$5)).c($$7)) {
               uk $$8 = (uk)$$6.get($$7);
               if ($$8 != null) {
                  $$4.a($$5, $$8);
               }
            }
         }
      }

      $$3.a("Starts", $$4);
      $$2.a("Structures", $$3);
      $$0.a("Level", $$2);
      return $$0;
   }

   private void a(@Nullable etk $$0) {
      if ($$0 != null) {
         for (String $$1 : this.g) {
            uk $$2 = new uk();

            try {
               $$2 = $$0.a($$1, bat.o, 1493).p("data").p("Features");
               if ($$2.g()) {
                  continue;
               }
            } catch (IOException var13) {
            }

            for (String $$3 : $$2.e()) {
               uk $$4 = $$2.p($$3);
               long $$5 = deh.c($$4.h("ChunkX"), $$4.h("ChunkZ"));
               uq $$6 = $$4.c("Children", 10);
               if (!$$6.isEmpty()) {
                  String $$7 = $$6.a(0).l("id");
                  String $$8 = b.get($$7);
                  if ($$8 != null) {
                     $$4.a("id", $$8);
                  }
               }

               String $$9 = $$4.l("id");
               this.e.computeIfAbsent($$9, $$0x -> new Long2ObjectOpenHashMap()).put($$5, $$4);
            }

            String $$10 = $$1 + "_index";
            ema $$11 = $$0.a(ema.a(), $$10);
            if ($$11.b().isEmpty()) {
               ema $$12 = new ema();
               this.f.put($$1, $$12);

               for (String $$13 : $$2.e()) {
                  uk $$14 = $$2.p($$13);
                  $$12.a(deh.c($$14.h("ChunkX"), $$14.h("ChunkZ")));
               }
            } else {
               this.f.put($$1, $$11);
            }
         }
      }
   }

   public static els a(alh<dfb> $$0, @Nullable etk $$1) {
      if ($$0 == dfb.i) {
         return new els(
            $$1,
            ImmutableList.of("Monument", "Stronghold", "Village", "Mineshaft", "Temple", "Mansion"),
            ImmutableList.of("Village", "Mineshaft", "Mansion", "Igloo", "Desert_Pyramid", "Jungle_Pyramid", "Swamp_Hut", "Stronghold", "Monument")
         );
      } else if ($$0 == dfb.j) {
         List<String> $$2 = ImmutableList.of("Fortress");
         return new els($$1, $$2, $$2);
      } else if ($$0 == dfb.k) {
         List<String> $$3 = ImmutableList.of("EndCity");
         return new els($$1, $$3, $$3);
      } else {
         throw new RuntimeException(String.format(Locale.ROOT, "Unknown dimension type : %s", $$0));
      }
   }
}
