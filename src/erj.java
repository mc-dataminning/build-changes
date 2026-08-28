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

public class erj {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = -1;
   private final edu c;
   private final jt d;
   private final evl e;
   private final alf<djh> f;
   private final ecm g;
   private final ehb h;
   private final djj i;
   private final dko j;
   private final long k;
   private final DataFixer l;
   private final Long2ObjectMap<Object2IntMap<eri>> m = new Long2ObjectOpenHashMap();
   private final Map<eri, Long2BooleanMap> n = new HashMap<>();

   public erj(edu $$0, jt $$1, evl $$2, alf<djh> $$3, ecm $$4, ehb $$5, djj $$6, dko $$7, long $$8, DataFixer $$9) {
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

   public erk a(dio $$0, eri $$1, esf $$2, boolean $$3) {
      long $$4 = $$0.a();
      Object2IntMap<eri> $$5 = (Object2IntMap<eri>)this.m.get($$4);
      if ($$5 != null) {
         return this.a($$5, $$1, $$3);
      } else {
         erk $$6 = this.a($$0, $$1, $$3, $$4);
         if ($$6 != null) {
            return $$6;
         } else if (!$$2.a($$0.h, $$0.i, this.k)) {
            return erk.b;
         } else {
            boolean $$7 = this.n.computeIfAbsent($$1, $$0x -> new Long2BooleanOpenHashMap()).computeIfAbsent($$4, $$2x -> this.b($$0, $$1));
            return !$$7 ? erk.b : erk.c;
         }
      }
   }

   private boolean b(dio $$0, eri $$1) {
      return $$1.b(new eri.a(this.d, this.g, this.j, this.h, this.e, this.k, $$0, this.i, $$1.a()::a)).isPresent();
   }

   @Nullable
   private erk a(dio $$0, eri $$1, boolean $$2, long $$3) {
      vd $$4 = new vd(new vf(ue.a, "DataVersion"), new vf("Level", "Structures", tz.b, "Starts"), new vf("structures", tz.b, "starts"));

      try {
         this.c.a($$0, $$4).join();
      } catch (Exception var13) {
         a.warn("Failed to read chunk {}", $$0, var13);
         return erk.c;
      }

      if (!($$4.d() instanceof tz $$7)) {
         return null;
      } else {
         int $$8 = edv.a($$7);
         if ($$8 <= 1493) {
            return erk.c;
         } else {
            edv.a($$7, this.f, this.g.c());

            tz $$9;
            try {
               $$9 = bbb.c.a(this.l, $$7, $$8);
            } catch (Exception var12) {
               a.warn("Failed to partially datafix chunk {}", $$0, var12);
               return erk.c;
            }

            Object2IntMap<eri> $$12 = this.a($$9);
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
   private Object2IntMap<eri> a(tz $$0) {
      if (!$$0.b("structures", 10)) {
         return null;
      } else {
         tz $$1 = $$0.n("structures");
         if (!$$1.b("starts", 10)) {
            return null;
         } else {
            tz $$2 = $$1.n("starts");
            if ($$2.g()) {
               return Object2IntMaps.emptyMap();
            } else {
               Object2IntMap<eri> $$3 = new Object2IntOpenHashMap();
               js<eri> $$4 = this.d.f(mh.be);

               for (String $$5 : $$2.e()) {
                  alg $$6 = alg.c($$5);
                  if ($$6 != null) {
                     eri $$7 = $$4.a($$6);
                     if ($$7 != null) {
                        tz $$8 = $$2.n($$5);
                        if (!$$8.g()) {
                           String $$9 = $$8.j("id");
                           if (!"INVALID".equals($$9)) {
                              int $$10 = $$8.f("references");
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

   private static Object2IntMap<eri> a(Object2IntMap<eri> $$0) {
      return $$0.isEmpty() ? Object2IntMaps.emptyMap() : $$0;
   }

   private erk a(Object2IntMap<eri> $$0, eri $$1, boolean $$2) {
      int $$3 = $$0.getOrDefault($$1, -1);
      return $$3 == -1 || $$2 && $$3 != 0 ? erk.b : erk.a;
   }

   public void a(dio $$0, Map<eri, erq> $$1) {
      long $$2 = $$0.a();
      Object2IntMap<eri> $$3 = new Object2IntOpenHashMap();
      $$1.forEach(($$1x, $$2x) -> {
         if ($$2x.b()) {
            $$3.put($$1x, $$2x.f());
         }
      });
      this.a($$2, $$3);
   }

   private void a(long $$0, Object2IntMap<eri> $$1) {
      this.m.put($$0, a($$1));
      this.n.values().forEach($$1x -> $$1x.remove($$0));
   }

   public void a(dio $$0, eri $$1) {
      this.m.compute($$0.a(), ($$1x, $$2) -> {
         if ($$2 == null || $$2.isEmpty()) {
            $$2 = new Object2IntOpenHashMap();
         }

         $$2.computeInt($$1, ($$0xx, $$1xx) -> $$1xx == null ? 1 : $$1xx + 1);
         return $$2;
      });
   }
}
