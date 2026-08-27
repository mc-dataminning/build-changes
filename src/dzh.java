import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.Long2BooleanMap;
import it.unimi.dsi.fastutil.longs.Long2BooleanOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dzh {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = -1;
   private final dmd c;
   private final iu d;
   private final it<cuo> e;
   private final it<dzg> f;
   private final edh g;
   private final ahf<ctp> h;
   private final dle i;
   private final dpe j;
   private final ctr k;
   private final cus l;
   private final long m;
   private final DataFixer n;
   private final Long2ObjectMap<Object2IntMap<dzg>> o = new Long2ObjectOpenHashMap();
   private final Map<dzg, Long2BooleanMap> p = new HashMap<>();

   public dzh(dmd $$0, iu $$1, edh $$2, ahf<ctp> $$3, dle $$4, dpe $$5, ctr $$6, cus $$7, long $$8, DataFixer $$9) {
      this.c = $$0;
      this.d = $$1;
      this.g = $$2;
      this.h = $$3;
      this.i = $$4;
      this.j = $$5;
      this.k = $$6;
      this.l = $$7;
      this.m = $$8;
      this.n = $$9;
      this.e = $$1.d(ke.at);
      this.f = $$1.d(ke.aD);
   }

   public dzi a(csw $$0, dzg $$1, boolean $$2) {
      long $$3 = $$0.a();
      Object2IntMap<dzg> $$4 = (Object2IntMap<dzg>)this.o.get($$3);
      if ($$4 != null) {
         return this.a($$4, $$1, $$2);
      } else {
         dzi $$5 = this.a($$0, $$1, $$2, $$3);
         if ($$5 != null) {
            return $$5;
         } else {
            boolean $$6 = this.p.computeIfAbsent($$1, $$0x -> new Long2BooleanOpenHashMap()).computeIfAbsent($$3, $$2x -> this.b($$0, $$1));
            return !$$6 ? dzi.b : dzi.c;
         }
      }
   }

   private boolean b(csw $$0, dzg $$1) {
      return $$1.b(new dzg.a(this.d, this.i, this.l, this.j, this.g, this.m, $$0, this.k, $$1.a()::a)).isPresent();
   }

   @Nullable
   private dzi a(csw $$0, dzg $$1, boolean $$2, long $$3) {
      tr $$4 = new tr(new tt(ss.a, "DataVersion"), new tt("Level", "Structures", sn.b, "Starts"), new tt("structures", sn.b, "starts"));

      try {
         this.c.a($$0, $$4).join();
      } catch (Exception var13) {
         a.warn("Failed to read chunk {}", $$0, var13);
         return dzi.c;
      }

      if (!($$4.d() instanceof sn $$7)) {
         return null;
      } else {
         int $$8 = dmf.a($$7);
         if ($$8 <= 1493) {
            return dzi.c;
         } else {
            dmf.a($$7, this.h, this.i.b());

            sn $$9;
            try {
               $$9 = avw.c.a(this.n, $$7, $$8);
            } catch (Exception var12) {
               a.warn("Failed to partially datafix chunk {}", $$0, var12);
               return dzi.c;
            }

            Object2IntMap<dzg> $$12 = this.a($$9);
            if ($$12 == null) {
               return null;
            } else {
               this.a($$3, $$12);
               return this.a($$12, $$1, $$2);
            }
         }
      }
   }

   @Nullable
   private Object2IntMap<dzg> a(sn $$0) {
      if (!$$0.b("structures", 10)) {
         return null;
      } else {
         sn $$1 = $$0.p("structures");
         if (!$$1.b("starts", 10)) {
            return null;
         } else {
            sn $$2 = $$1.p("starts");
            if ($$2.g()) {
               return Object2IntMaps.emptyMap();
            } else {
               Object2IntMap<dzg> $$3 = new Object2IntOpenHashMap();
               it<dzg> $$4 = this.d.d(ke.aD);

               for (String $$5 : $$2.e()) {
                  ahg $$6 = ahg.a($$5);
                  if ($$6 != null) {
                     dzg $$7 = $$4.a($$6);
                     if ($$7 != null) {
                        sn $$8 = $$2.p($$5);
                        if (!$$8.g()) {
                           String $$9 = $$8.l("id");
                           if (!"INVALID".equals($$9)) {
                              int $$10 = $$8.h("references");
                              $$3.put($$7, $$10);
                           }
                        }
                     }
                  }
               }

               return $$3;
            }
         }
      }
   }

   private static Object2IntMap<dzg> a(Object2IntMap<dzg> $$0) {
      return $$0.isEmpty() ? Object2IntMaps.emptyMap() : $$0;
   }

   private dzi a(Object2IntMap<dzg> $$0, dzg $$1, boolean $$2) {
      int $$3 = $$0.getOrDefault($$1, -1);
      return $$3 == -1 || $$2 && $$3 != 0 ? dzi.b : dzi.a;
   }

   public void a(csw $$0, Map<dzg, dzo> $$1) {
      long $$2 = $$0.a();
      Object2IntMap<dzg> $$3 = new Object2IntOpenHashMap();
      $$1.forEach(($$1x, $$2x) -> {
         if ($$2x.b()) {
            $$3.put($$1x, $$2x.f());
         }
      });
      this.a($$2, $$3);
   }

   private void a(long $$0, Object2IntMap<dzg> $$1) {
      this.o.put($$0, a($$1));
      this.p.values().forEach($$1x -> $$1x.remove($$0));
   }

   public void a(csw $$0, dzg $$1) {
      this.o.compute($$0.a(), ($$1x, $$2) -> {
         if ($$2 == null || $$2.isEmpty()) {
            $$2 = new Object2IntOpenHashMap();
         }

         $$2.computeInt($$1, ($$0xx, $$1xx) -> $$1xx == null ? 1 : $$1xx + 1);
         return $$2;
      });
   }
}
