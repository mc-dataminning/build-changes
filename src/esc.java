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
import java.util.Optional;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class esc {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = -1;
   private final eek c;
   private final jt d;
   private final ewe e;
   private final alh<djx> f;
   private final edc g;
   private final ehr h;
   private final djz i;
   private final dle j;
   private final long k;
   private final DataFixer l;
   private final Long2ObjectMap<Object2IntMap<esb>> m = new Long2ObjectOpenHashMap();
   private final Map<esb, Long2BooleanMap> n = new HashMap<>();

   public esc(eek $$0, jt $$1, ewe $$2, alh<djx> $$3, edc $$4, ehr $$5, djz $$6, dle $$7, long $$8, DataFixer $$9) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
      this.h = $$5;
      this.i = $$6;
      this.j = $$7;
      this.k = $$8;
      this.l = $$9;
   }

   public esd a(djc $$0, esb $$1, esy $$2, boolean $$3) {
      long $$4 = $$0.a();
      Object2IntMap<esb> $$5 = (Object2IntMap<esb>)this.m.get($$4);
      if ($$5 != null) {
         return this.a($$5, $$1, $$3);
      } else {
         esd $$6 = this.a($$0, $$1, $$3, $$4);
         if ($$6 != null) {
            return $$6;
         } else if (!$$2.a($$0.h, $$0.i, this.k)) {
            return esd.b;
         } else {
            boolean $$7 = this.n.computeIfAbsent($$1, $$0x -> new Long2BooleanOpenHashMap()).computeIfAbsent($$4, $$2x -> this.b($$0, $$1));
            return !$$7 ? esd.b : esd.c;
         }
      }
   }

   private boolean b(djc $$0, esb $$1) {
      return $$1.b(new esb.a(this.d, this.g, this.j, this.h, this.e, this.k, $$0, this.i, $$1.a()::a)).isPresent();
   }

   @Nullable
   private esd a(djc $$0, esb $$1, boolean $$2, long $$3) {
      vf $$4 = new vf(new vh(ue.a, "DataVersion"), new vh("Level", "Structures", tz.b, "Starts"), new vh("structures", tz.b, "starts"));

      try {
         this.c.a($$0, $$4).join();
      } catch (Exception var13) {
         a.warn("Failed to read chunk {}", $$0, var13);
         return esd.c;
      }

      if (!($$4.d() instanceof tz $$7)) {
         return null;
      } else {
         int $$8 = eel.a($$7);
         if ($$8 <= 1493) {
            return esd.c;
         } else {
            eel.a($$7, this.f, this.g.c());

            tz $$9;
            try {
               $$9 = bbd.c.a(this.l, $$7, $$8);
            } catch (Exception var12) {
               a.warn("Failed to partially datafix chunk {}", $$0, var12);
               return esd.c;
            }

            Object2IntMap<esb> $$12 = this.a($$9);
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
   private Object2IntMap<esb> a(tz $$0) {
      Optional<tz> $$1 = $$0.m("structures").flatMap($$0x -> $$0x.m("starts"));
      if ($$1.isEmpty()) {
         return null;
      } else {
         tz $$2 = $$1.get();
         if ($$2.j()) {
            return Object2IntMaps.emptyMap();
         } else {
            Object2IntMap<esb> $$3 = new Object2IntOpenHashMap();
            js<esb> $$4 = this.d.f(mh.be);
            $$2.a((BiConsumer<String, uy>)(($$2x, $$3x) -> {
               ali $$4x = ali.c($$2x);
               if ($$4x != null) {
                  esb $$5 = $$4.a($$4x);
                  if ($$5 != null) {
                     $$3x.s_().ifPresent($$2xx -> {
                        String $$3xx = $$2xx.b("id", "");
                        if (!"INVALID".equals($$3xx)) {
                           int $$4xx = $$2xx.b("references", 0);
                           $$3.put($$5, $$4xx);
                        }
                     });
                  }
               }
            }));
            return $$3;
         }
      }
   }

   private static Object2IntMap<esb> a(Object2IntMap<esb> $$0) {
      return $$0.isEmpty() ? Object2IntMaps.emptyMap() : $$0;
   }

   private esd a(Object2IntMap<esb> $$0, esb $$1, boolean $$2) {
      int $$3 = $$0.getOrDefault($$1, -1);
      return $$3 == -1 || $$2 && $$3 != 0 ? esd.b : esd.a;
   }

   public void a(djc $$0, Map<esb, esj> $$1) {
      long $$2 = $$0.a();
      Object2IntMap<esb> $$3 = new Object2IntOpenHashMap();
      $$1.forEach(($$1x, $$2x) -> {
         if ($$2x.b()) {
            $$3.put($$1x, $$2x.f());
         }
      });
      this.a($$2, $$3);
   }

   private void a(long $$0, Object2IntMap<esb> $$1) {
      this.m.put($$0, a($$1));
      this.n.values().forEach($$1x -> $$1x.remove($$0));
   }

   public void a(djc $$0, esb $$1) {
      this.m.compute($$0.a(), ($$1x, $$2) -> {
         if ($$2 == null || $$2.isEmpty()) {
            $$2 = new Object2IntOpenHashMap();
         }

         $$2.computeInt($$1, ($$0xx, $$1xx) -> $$1xx == null ? 1 : $$1xx + 1);
         return $$2;
      });
   }
}
