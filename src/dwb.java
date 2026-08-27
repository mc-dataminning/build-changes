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

public class dwb {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = -1;
   private final dix c;
   private final ip d;
   private final io<crx> e;
   private final io<dwa> f;
   private final dzu g;
   private final afv<cqz> h;
   private final dhy i;
   private final dly j;
   private final crb k;
   private final csb l;
   private final long m;
   private final DataFixer n;
   private final Long2ObjectMap<Object2IntMap<dwa>> o = new Long2ObjectOpenHashMap();
   private final Map<dwa, Long2BooleanMap> p = new HashMap<>();

   public dwb(dix $$0, ip $$1, dzu $$2, afv<cqz> $$3, dhy $$4, dly $$5, crb $$6, csb $$7, long $$8, DataFixer $$9) {
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
      this.e = $$1.d(jz.aq);
      this.f = $$1.d(jz.aA);
   }

   public dwc a(cqg $$0, dwa $$1, boolean $$2) {
      long $$3 = $$0.a();
      Object2IntMap<dwa> $$4 = (Object2IntMap<dwa>)this.o.get($$3);
      if ($$4 != null) {
         return this.a($$4, $$1, $$2);
      } else {
         dwc $$5 = this.a($$0, $$1, $$2, $$3);
         if ($$5 != null) {
            return $$5;
         } else {
            boolean $$6 = this.p.computeIfAbsent($$1, $$0x -> new Long2BooleanOpenHashMap()).computeIfAbsent($$3, $$2x -> this.b($$0, $$1));
            return !$$6 ? dwc.b : dwc.c;
         }
      }
   }

   private boolean b(cqg $$0, dwa $$1) {
      return $$1.b(new dwa.a(this.d, this.i, this.l, this.j, this.g, this.m, $$0, this.k, $$1.a()::a)).isPresent();
   }

   @Nullable
   private dwc a(cqg $$0, dwa $$1, boolean $$2, long $$3) {
      su $$4 = new su(new sw(ry.a, "DataVersion"), new sw("Level", "Structures", rt.b, "Starts"), new sw("structures", rt.b, "starts"));

      try {
         this.c.a($$0, $$4).join();
      } catch (Exception var13) {
         a.warn("Failed to read chunk {}", $$0, var13);
         return dwc.c;
      }

      if (!($$4.d() instanceof rt $$7)) {
         return null;
      } else {
         int $$8 = diz.a($$7);
         if ($$8 <= 1493) {
            return dwc.c;
         } else {
            diz.a($$7, this.h, this.i.b());

            rt $$9;
            try {
               $$9 = aud.c.a(this.n, $$7, $$8);
            } catch (Exception var12) {
               a.warn("Failed to partially datafix chunk {}", $$0, var12);
               return dwc.c;
            }

            Object2IntMap<dwa> $$12 = this.a($$9);
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
   private Object2IntMap<dwa> a(rt $$0) {
      if (!$$0.b("structures", 10)) {
         return null;
      } else {
         rt $$1 = $$0.p("structures");
         if (!$$1.b("starts", 10)) {
            return null;
         } else {
            rt $$2 = $$1.p("starts");
            if ($$2.g()) {
               return Object2IntMaps.emptyMap();
            } else {
               Object2IntMap<dwa> $$3 = new Object2IntOpenHashMap();
               io<dwa> $$4 = this.d.d(jz.aA);

               for (String $$5 : $$2.e()) {
                  afw $$6 = afw.a($$5);
                  if ($$6 != null) {
                     dwa $$7 = $$4.a($$6);
                     if ($$7 != null) {
                        rt $$8 = $$2.p($$5);
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

   private static Object2IntMap<dwa> a(Object2IntMap<dwa> $$0) {
      return $$0.isEmpty() ? Object2IntMaps.emptyMap() : $$0;
   }

   private dwc a(Object2IntMap<dwa> $$0, dwa $$1, boolean $$2) {
      int $$3 = $$0.getOrDefault($$1, -1);
      return $$3 == -1 || $$2 && $$3 != 0 ? dwc.b : dwc.a;
   }

   public void a(cqg $$0, Map<dwa, dwi> $$1) {
      long $$2 = $$0.a();
      Object2IntMap<dwa> $$3 = new Object2IntOpenHashMap();
      $$1.forEach(($$1x, $$2x) -> {
         if ($$2x.b()) {
            $$3.put($$1x, $$2x.f());
         }
      });
      this.a($$2, $$3);
   }

   private void a(long $$0, Object2IntMap<dwa> $$1) {
      this.o.put($$0, a($$1));
      this.p.values().forEach($$1x -> $$1x.remove($$0));
   }

   public void a(cqg $$0, dwa $$1) {
      this.o.compute($$0.a(), ($$1x, $$2) -> {
         if ($$2 == null || $$2.isEmpty()) {
            $$2 = new Object2IntOpenHashMap();
         }

         $$2.computeInt($$1, ($$0xx, $$1xx) -> $$1xx == null ? 1 : $$1xx + 1);
         return $$2;
      });
   }
}
