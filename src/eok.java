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

public class eok {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = -1;
   private final eay c;
   private final ke d;
   private final esm e;
   private final aly<dhh> f;
   private final dzq g;
   private final eed h;
   private final dhj i;
   private final din j;
   private final long k;
   private final DataFixer l;
   private final Long2ObjectMap<Object2IntMap<eoj>> m = new Long2ObjectOpenHashMap();
   private final Map<eoj, Long2BooleanMap> n = new HashMap<>();

   public eok(eay $$0, ke $$1, esm $$2, aly<dhh> $$3, dzq $$4, eed $$5, dhj $$6, din $$7, long $$8, DataFixer $$9) {
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

   public eol a(dgn $$0, eoj $$1, epg $$2, boolean $$3) {
      long $$4 = $$0.a();
      Object2IntMap<eoj> $$5 = (Object2IntMap<eoj>)this.m.get($$4);
      if ($$5 != null) {
         return this.a($$5, $$1, $$3);
      } else {
         eol $$6 = this.a($$0, $$1, $$3, $$4);
         if ($$6 != null) {
            return $$6;
         } else if (!$$2.a($$0.h, $$0.i, this.k)) {
            return eol.b;
         } else {
            boolean $$7 = this.n.computeIfAbsent($$1, $$0x -> new Long2BooleanOpenHashMap()).computeIfAbsent($$4, $$2x -> this.b($$0, $$1));
            return !$$7 ? eol.b : eol.c;
         }
      }
   }

   private boolean b(dgn $$0, eoj $$1) {
      return $$1.b(new eoj.a(this.d, this.g, this.j, this.h, this.e, this.k, $$0, this.i, $$1.a()::a)).isPresent();
   }

   @Nullable
   private eol a(dgn $$0, eoj $$1, boolean $$2, long $$3) {
      wb $$4 = new wb(new wd(vc.a, "DataVersion"), new wd("Level", "Structures", ux.b, "Starts"), new wd("structures", ux.b, "starts"));

      try {
         this.c.a($$0, $$4).join();
      } catch (Exception var13) {
         a.warn("Failed to read chunk {}", $$0, var13);
         return eol.c;
      }

      if (!($$4.d() instanceof ux $$7)) {
         return null;
      } else {
         int $$8 = eaz.a($$7);
         if ($$8 <= 1493) {
            return eol.c;
         } else {
            eaz.a($$7, this.f, this.g.c());

            ux $$9;
            try {
               $$9 = bbs.c.a(this.l, $$7, $$8);
            } catch (Exception var12) {
               a.warn("Failed to partially datafix chunk {}", $$0, var12);
               return eol.c;
            }

            Object2IntMap<eoj> $$12 = this.a($$9);
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
   private Object2IntMap<eoj> a(ux $$0) {
      if (!$$0.b("structures", 10)) {
         return null;
      } else {
         ux $$1 = $$0.p("structures");
         if (!$$1.b("starts", 10)) {
            return null;
         } else {
            ux $$2 = $$1.p("starts");
            if ($$2.g()) {
               return Object2IntMaps.emptyMap();
            } else {
               Object2IntMap<eoj> $$3 = new Object2IntOpenHashMap();
               kd<eoj> $$4 = this.d.e(mb.aU);

               for (String $$5 : $$2.e()) {
                  alz $$6 = alz.c($$5);
                  if ($$6 != null) {
                     eoj $$7 = $$4.a($$6);
                     if ($$7 != null) {
                        ux $$8 = $$2.p($$5);
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

   private static Object2IntMap<eoj> a(Object2IntMap<eoj> $$0) {
      return $$0.isEmpty() ? Object2IntMaps.emptyMap() : $$0;
   }

   private eol a(Object2IntMap<eoj> $$0, eoj $$1, boolean $$2) {
      int $$3 = $$0.getOrDefault($$1, -1);
      return $$3 == -1 || $$2 && $$3 != 0 ? eol.b : eol.a;
   }

   public void a(dgn $$0, Map<eoj, eor> $$1) {
      long $$2 = $$0.a();
      Object2IntMap<eoj> $$3 = new Object2IntOpenHashMap();
      $$1.forEach(($$1x, $$2x) -> {
         if ($$2x.b()) {
            $$3.put($$1x, $$2x.f());
         }
      });
      this.a($$2, $$3);
   }

   private void a(long $$0, Object2IntMap<eoj> $$1) {
      this.m.put($$0, a($$1));
      this.n.values().forEach($$1x -> $$1x.remove($$0));
   }

   public void a(dgn $$0, eoj $$1) {
      this.m.compute($$0.a(), ($$1x, $$2) -> {
         if ($$2 == null || $$2.isEmpty()) {
            $$2 = new Object2IntOpenHashMap();
         }

         $$2.computeInt($$1, ($$0xx, $$1xx) -> $$1xx == null ? 1 : $$1xx + 1);
         return $$2;
      });
   }
}
