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

public class ebf {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = -1;
   private final dob c;
   private final iw d;
   private final iv<cwm> e;
   private final iv<ebe> f;
   private final eff g;
   private final aix<cvn> h;
   private final dnc i;
   private final drc j;
   private final cvp k;
   private final cwq l;
   private final long m;
   private final DataFixer n;
   private final Long2ObjectMap<Object2IntMap<ebe>> o = new Long2ObjectOpenHashMap();
   private final Map<ebe, Long2BooleanMap> p = new HashMap<>();

   public ebf(dob $$0, iw $$1, eff $$2, aix<cvn> $$3, dnc $$4, drc $$5, cvp $$6, cwq $$7, long $$8, DataFixer $$9) {
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
      this.e = $$1.d(kg.at);
      this.f = $$1.d(kg.aD);
   }

   public ebg a(cuu $$0, ebe $$1, boolean $$2) {
      long $$3 = $$0.a();
      Object2IntMap<ebe> $$4 = (Object2IntMap<ebe>)this.o.get($$3);
      if ($$4 != null) {
         return this.a($$4, $$1, $$2);
      } else {
         ebg $$5 = this.a($$0, $$1, $$2, $$3);
         if ($$5 != null) {
            return $$5;
         } else {
            boolean $$6 = this.p.computeIfAbsent($$1, $$0x -> new Long2BooleanOpenHashMap()).computeIfAbsent($$3, $$2x -> this.b($$0, $$1));
            return !$$6 ? ebg.b : ebg.c;
         }
      }
   }

   private boolean b(cuu $$0, ebe $$1) {
      return $$1.b(new ebe.a(this.d, this.i, this.l, this.j, this.g, this.m, $$0, this.k, $$1.a()::a)).isPresent();
   }

   @Nullable
   private ebg a(cuu $$0, ebe $$1, boolean $$2, long $$3) {
      ua $$4 = new ua(new uc(tb.a, "DataVersion"), new uc("Level", "Structures", sw.b, "Starts"), new uc("structures", sw.b, "starts"));

      try {
         this.c.a($$0, $$4).join();
      } catch (Exception var13) {
         a.warn("Failed to read chunk {}", $$0, var13);
         return ebg.c;
      }

      if (!($$4.d() instanceof sw $$7)) {
         return null;
      } else {
         int $$8 = dod.a($$7);
         if ($$8 <= 1493) {
            return ebg.c;
         } else {
            dod.a($$7, this.h, this.i.b());

            sw $$9;
            try {
               $$9 = axo.c.a(this.n, $$7, $$8);
            } catch (Exception var12) {
               a.warn("Failed to partially datafix chunk {}", $$0, var12);
               return ebg.c;
            }

            Object2IntMap<ebe> $$12 = this.a($$9);
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
   private Object2IntMap<ebe> a(sw $$0) {
      if (!$$0.b("structures", 10)) {
         return null;
      } else {
         sw $$1 = $$0.p("structures");
         if (!$$1.b("starts", 10)) {
            return null;
         } else {
            sw $$2 = $$1.p("starts");
            if ($$2.g()) {
               return Object2IntMaps.emptyMap();
            } else {
               Object2IntMap<ebe> $$3 = new Object2IntOpenHashMap();
               iv<ebe> $$4 = this.d.d(kg.aD);

               for (String $$5 : $$2.e()) {
                  aiy $$6 = aiy.a($$5);
                  if ($$6 != null) {
                     ebe $$7 = $$4.a($$6);
                     if ($$7 != null) {
                        sw $$8 = $$2.p($$5);
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

   private static Object2IntMap<ebe> a(Object2IntMap<ebe> $$0) {
      return $$0.isEmpty() ? Object2IntMaps.emptyMap() : $$0;
   }

   private ebg a(Object2IntMap<ebe> $$0, ebe $$1, boolean $$2) {
      int $$3 = $$0.getOrDefault($$1, -1);
      return $$3 == -1 || $$2 && $$3 != 0 ? ebg.b : ebg.a;
   }

   public void a(cuu $$0, Map<ebe, ebm> $$1) {
      long $$2 = $$0.a();
      Object2IntMap<ebe> $$3 = new Object2IntOpenHashMap();
      $$1.forEach(($$1x, $$2x) -> {
         if ($$2x.b()) {
            $$3.put($$1x, $$2x.f());
         }
      });
      this.a($$2, $$3);
   }

   private void a(long $$0, Object2IntMap<ebe> $$1) {
      this.o.put($$0, a($$1));
      this.p.values().forEach($$1x -> $$1x.remove($$0));
   }

   public void a(cuu $$0, ebe $$1) {
      this.o.compute($$0.a(), ($$1x, $$2) -> {
         if ($$2 == null || $$2.isEmpty()) {
            $$2 = new Object2IntOpenHashMap();
         }

         $$2.computeInt($$1, ($$0xx, $$1xx) -> $$1xx == null ? 1 : $$1xx + 1);
         return $$2;
      });
   }
}
