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

public class dza {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = -1;
   private final dlw c;
   private final iu d;
   private final it<cuh> e;
   private final it<dyz> f;
   private final eda g;
   private final ahc<cti> h;
   private final dkx i;
   private final dox j;
   private final ctk k;
   private final cul l;
   private final long m;
   private final DataFixer n;
   private final Long2ObjectMap<Object2IntMap<dyz>> o = new Long2ObjectOpenHashMap();
   private final Map<dyz, Long2BooleanMap> p = new HashMap<>();

   public dza(dlw $$0, iu $$1, eda $$2, ahc<cti> $$3, dkx $$4, dox $$5, ctk $$6, cul $$7, long $$8, DataFixer $$9) {
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

   public dzb a(csp $$0, dyz $$1, boolean $$2) {
      long $$3 = $$0.a();
      Object2IntMap<dyz> $$4 = (Object2IntMap<dyz>)this.o.get($$3);
      if ($$4 != null) {
         return this.a($$4, $$1, $$2);
      } else {
         dzb $$5 = this.a($$0, $$1, $$2, $$3);
         if ($$5 != null) {
            return $$5;
         } else {
            boolean $$6 = this.p.computeIfAbsent($$1, $$0x -> new Long2BooleanOpenHashMap()).computeIfAbsent($$3, $$2x -> this.b($$0, $$1));
            return !$$6 ? dzb.b : dzb.c;
         }
      }
   }

   private boolean b(csp $$0, dyz $$1) {
      return $$1.b(new dyz.a(this.d, this.i, this.l, this.j, this.g, this.m, $$0, this.k, $$1.a()::a)).isPresent();
   }

   @Nullable
   private dzb a(csp $$0, dyz $$1, boolean $$2, long $$3) {
      tp $$4 = new tp(new tr(sq.a, "DataVersion"), new tr("Level", "Structures", sl.b, "Starts"), new tr("structures", sl.b, "starts"));

      try {
         this.c.a($$0, $$4).join();
      } catch (Exception var13) {
         a.warn("Failed to read chunk {}", $$0, var13);
         return dzb.c;
      }

      if (!($$4.d() instanceof sl $$7)) {
         return null;
      } else {
         int $$8 = dly.a($$7);
         if ($$8 <= 1493) {
            return dzb.c;
         } else {
            dly.a($$7, this.h, this.i.b());

            sl $$9;
            try {
               $$9 = avq.c.a(this.n, $$7, $$8);
            } catch (Exception var12) {
               a.warn("Failed to partially datafix chunk {}", $$0, var12);
               return dzb.c;
            }

            Object2IntMap<dyz> $$12 = this.a($$9);
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
   private Object2IntMap<dyz> a(sl $$0) {
      if (!$$0.b("structures", 10)) {
         return null;
      } else {
         sl $$1 = $$0.p("structures");
         if (!$$1.b("starts", 10)) {
            return null;
         } else {
            sl $$2 = $$1.p("starts");
            if ($$2.g()) {
               return Object2IntMaps.emptyMap();
            } else {
               Object2IntMap<dyz> $$3 = new Object2IntOpenHashMap();
               it<dyz> $$4 = this.d.d(ke.aD);

               for (String $$5 : $$2.e()) {
                  ahd $$6 = ahd.a($$5);
                  if ($$6 != null) {
                     dyz $$7 = $$4.a($$6);
                     if ($$7 != null) {
                        sl $$8 = $$2.p($$5);
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

   private static Object2IntMap<dyz> a(Object2IntMap<dyz> $$0) {
      return $$0.isEmpty() ? Object2IntMaps.emptyMap() : $$0;
   }

   private dzb a(Object2IntMap<dyz> $$0, dyz $$1, boolean $$2) {
      int $$3 = $$0.getOrDefault($$1, -1);
      return $$3 == -1 || $$2 && $$3 != 0 ? dzb.b : dzb.a;
   }

   public void a(csp $$0, Map<dyz, dzh> $$1) {
      long $$2 = $$0.a();
      Object2IntMap<dyz> $$3 = new Object2IntOpenHashMap();
      $$1.forEach(($$1x, $$2x) -> {
         if ($$2x.b()) {
            $$3.put($$1x, $$2x.f());
         }
      });
      this.a($$2, $$3);
   }

   private void a(long $$0, Object2IntMap<dyz> $$1) {
      this.o.put($$0, a($$1));
      this.p.values().forEach($$1x -> $$1x.remove($$0));
   }

   public void a(csp $$0, dyz $$1) {
      this.o.compute($$0.a(), ($$1x, $$2) -> {
         if ($$2 == null || $$2.isEmpty()) {
            $$2 = new Object2IntOpenHashMap();
         }

         $$2.computeInt($$1, ($$0xx, $$1xx) -> $$1xx == null ? 1 : $$1xx + 1);
         return $$2;
      });
   }
}
