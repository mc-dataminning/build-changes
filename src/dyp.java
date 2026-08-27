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

public class dyp {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = -1;
   private final dll c;
   private final is d;
   private final ir<ctx> e;
   private final ir<dyo> f;
   private final ecp g;
   private final ags<csy> h;
   private final dkm i;
   private final dom j;
   private final cta k;
   private final cub l;
   private final long m;
   private final DataFixer n;
   private final Long2ObjectMap<Object2IntMap<dyo>> o = new Long2ObjectOpenHashMap();
   private final Map<dyo, Long2BooleanMap> p = new HashMap<>();

   public dyp(dll $$0, is $$1, ecp $$2, ags<csy> $$3, dkm $$4, dom $$5, cta $$6, cub $$7, long $$8, DataFixer $$9) {
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
      this.e = $$1.d(kc.as);
      this.f = $$1.d(kc.aC);
   }

   public dyq a(csf $$0, dyo $$1, boolean $$2) {
      long $$3 = $$0.a();
      Object2IntMap<dyo> $$4 = (Object2IntMap<dyo>)this.o.get($$3);
      if ($$4 != null) {
         return this.a($$4, $$1, $$2);
      } else {
         dyq $$5 = this.a($$0, $$1, $$2, $$3);
         if ($$5 != null) {
            return $$5;
         } else {
            boolean $$6 = this.p.computeIfAbsent($$1, $$0x -> new Long2BooleanOpenHashMap()).computeIfAbsent($$3, $$2x -> this.b($$0, $$1));
            return !$$6 ? dyq.b : dyq.c;
         }
      }
   }

   private boolean b(csf $$0, dyo $$1) {
      return $$1.b(new dyo.a(this.d, this.i, this.l, this.j, this.g, this.m, $$0, this.k, $$1.a()::a)).isPresent();
   }

   @Nullable
   private dyq a(csf $$0, dyo $$1, boolean $$2, long $$3) {
      tn $$4 = new tn(new tp(so.a, "DataVersion"), new tp("Level", "Structures", sj.b, "Starts"), new tp("structures", sj.b, "starts"));

      try {
         this.c.a($$0, $$4).join();
      } catch (Exception var13) {
         a.warn("Failed to read chunk {}", $$0, var13);
         return dyq.c;
      }

      if (!($$4.d() instanceof sj $$7)) {
         return null;
      } else {
         int $$8 = dln.a($$7);
         if ($$8 <= 1493) {
            return dyq.c;
         } else {
            dln.a($$7, this.h, this.i.b());

            sj $$9;
            try {
               $$9 = avg.c.a(this.n, $$7, $$8);
            } catch (Exception var12) {
               a.warn("Failed to partially datafix chunk {}", $$0, var12);
               return dyq.c;
            }

            Object2IntMap<dyo> $$12 = this.a($$9);
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
   private Object2IntMap<dyo> a(sj $$0) {
      if (!$$0.b("structures", 10)) {
         return null;
      } else {
         sj $$1 = $$0.p("structures");
         if (!$$1.b("starts", 10)) {
            return null;
         } else {
            sj $$2 = $$1.p("starts");
            if ($$2.g()) {
               return Object2IntMaps.emptyMap();
            } else {
               Object2IntMap<dyo> $$3 = new Object2IntOpenHashMap();
               ir<dyo> $$4 = this.d.d(kc.aC);

               for (String $$5 : $$2.e()) {
                  agt $$6 = agt.a($$5);
                  if ($$6 != null) {
                     dyo $$7 = $$4.a($$6);
                     if ($$7 != null) {
                        sj $$8 = $$2.p($$5);
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

   private static Object2IntMap<dyo> a(Object2IntMap<dyo> $$0) {
      return $$0.isEmpty() ? Object2IntMaps.emptyMap() : $$0;
   }

   private dyq a(Object2IntMap<dyo> $$0, dyo $$1, boolean $$2) {
      int $$3 = $$0.getOrDefault($$1, -1);
      return $$3 == -1 || $$2 && $$3 != 0 ? dyq.b : dyq.a;
   }

   public void a(csf $$0, Map<dyo, dyw> $$1) {
      long $$2 = $$0.a();
      Object2IntMap<dyo> $$3 = new Object2IntOpenHashMap();
      $$1.forEach(($$1x, $$2x) -> {
         if ($$2x.b()) {
            $$3.put($$1x, $$2x.f());
         }
      });
      this.a($$2, $$3);
   }

   private void a(long $$0, Object2IntMap<dyo> $$1) {
      this.o.put($$0, a($$1));
      this.p.values().forEach($$1x -> $$1x.remove($$0));
   }

   public void a(csf $$0, dyo $$1) {
      this.o.compute($$0.a(), ($$1x, $$2) -> {
         if ($$2 == null || $$2.isEmpty()) {
            $$2 = new Object2IntOpenHashMap();
         }

         $$2.computeInt($$1, ($$0xx, $$1xx) -> $$1xx == null ? 1 : $$1xx + 1);
         return $$2;
      });
   }
}
