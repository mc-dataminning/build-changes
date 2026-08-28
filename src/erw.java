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
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class erw {
   private static final Map<String, String> a = ag.a(Maps.newHashMap(), $$0 -> {
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
   private static final Map<String, String> b = ag.a(Maps.newHashMap(), $$0 -> {
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
   private final Map<String, Long2ObjectMap<tz>> e = Maps.newHashMap();
   private final Map<String, ese> f = Maps.newHashMap();
   private final List<String> g;
   private final List<String> h;

   public erw(@Nullable ezp $$0, List<String> $$1, List<String> $$2) {
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
         ese $$2 = this.f.get($$1);
         if ($$2 != null && $$2.c($$0)) {
            $$2.d($$0);
         }
      }
   }

   public tz a(tz $$0) {
      tz $$1 = $$0.n("Level");
      djc $$2 = new djc($$1.b("xPos", 0), $$1.b("zPos", 0));
      if (this.a($$2.h, $$2.i)) {
         $$0 = this.a($$0, $$2);
      }

      tz $$3 = $$1.n("Structures");
      tz $$4 = $$3.n("References");

      for (String $$5 : this.h) {
         boolean $$6 = c.contains($$5.toLowerCase(Locale.ROOT));
         if (!$$4.l($$5).isPresent() && $$6) {
            int $$7 = 8;
            LongList $$8 = new LongArrayList();

            for (int $$9 = $$2.h - 8; $$9 <= $$2.h + 8; $$9++) {
               for (int $$10 = $$2.i - 8; $$10 <= $$2.i + 8; $$10++) {
                  if (this.a($$9, $$10, $$5)) {
                     $$8.add(djc.c($$9, $$10));
                  }
               }
            }

            $$4.a($$5, $$8.toLongArray());
         }
      }

      $$3.a("References", $$4);
      $$1.a("Structures", $$3);
      $$0.a("Level", $$1);
      return $$0;
   }

   private boolean a(int $$0, int $$1, String $$2) {
      return !this.d ? false : this.e.get($$2) != null && this.f.get(a.get($$2)).b(djc.c($$0, $$1));
   }

   private boolean a(int $$0, int $$1) {
      if (!this.d) {
         return false;
      } else {
         for (String $$2 : this.h) {
            if (this.e.get($$2) != null && this.f.get(a.get($$2)).c(djc.c($$0, $$1))) {
               return true;
            }
         }

         return false;
      }
   }

   private tz a(tz $$0, djc $$1) {
      tz $$2 = $$0.n("Level");
      tz $$3 = $$2.n("Structures");
      tz $$4 = $$3.n("Starts");

      for (String $$5 : this.h) {
         Long2ObjectMap<tz> $$6 = this.e.get($$5);
         if ($$6 != null) {
            long $$7 = $$1.a();
            if (this.f.get(a.get($$5)).c($$7)) {
               tz $$8 = (tz)$$6.get($$7);
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

   private void a(@Nullable ezp $$0) {
      if ($$0 != null) {
         for (String $$1 : this.g) {
            tz $$2 = new tz();

            try {
               $$2 = $$0.a($$1, bbd.o, 1493).n("data").n("Features");
               if ($$2.j()) {
                  continue;
               }
            } catch (IOException var8) {
            }

            $$2.a((BiConsumer<String, uy>)(($$0x, $$1x) -> {
               if ($$1x instanceof tz $$2x) {
                  long $$4x = djc.c($$2x.b("ChunkX", 0), $$2x.b("ChunkZ", 0));
                  uf $$5x = $$2x.p("Children");
                  if (!$$5x.isEmpty()) {
                     Optional<String> $$6 = $$5x.a(0).flatMap($$0xx -> $$0xx.i("id"));
                     $$6.map(b::get).ifPresent($$1xx -> $$2x.a("id", $$1xx));
                  }

                  $$2x.i("id").ifPresent($$2xx -> this.e.computeIfAbsent($$2xx, $$0xxx -> new Long2ObjectOpenHashMap()).put($$4x, $$2x));
               }
            }));
            String $$3 = $$1 + "_index";
            ese $$4 = $$0.a(ese.a($$3));
            if ($$4.a().isEmpty()) {
               ese $$5 = new ese();
               this.f.put($$1, $$5);
               $$2.a((BiConsumer<String, uy>)(($$1x, $$2x) -> {
                  if ($$2x instanceof tz $$3x) {
                     $$5.a(djc.c($$3x.b("ChunkX", 0), $$3x.b("ChunkZ", 0)));
                  }
               }));
            } else {
               this.f.put($$1, $$4);
            }
         }
      }
   }

   public static erw a(alh<djx> $$0, @Nullable ezp $$1) {
      if ($$0 == djx.i) {
         return new erw(
            $$1,
            ImmutableList.of("Monument", "Stronghold", "Village", "Mineshaft", "Temple", "Mansion"),
            ImmutableList.of("Village", "Mineshaft", "Mansion", "Igloo", "Desert_Pyramid", "Jungle_Pyramid", "Swamp_Hut", "Stronghold", "Monument")
         );
      } else if ($$0 == djx.j) {
         List<String> $$2 = ImmutableList.of("Fortress");
         return new erw($$1, $$2, $$2);
      } else if ($$0 == djx.k) {
         List<String> $$3 = ImmutableList.of("EndCity");
         return new erw($$1, $$3, $$3);
      } else {
         throw new RuntimeException(String.format(Locale.ROOT, "Unknown dimension type : %s", $$0));
      }
   }
}
