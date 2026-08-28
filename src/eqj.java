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

public class eqj {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = -1;
   private final ecu c;
   private final js d;
   private final eul e;
   private final ald<dip> f;
   private final ebm g;
   private final egb h;
   private final dir i;
   private final djw j;
   private final long k;
   private final DataFixer l;
   private final Long2ObjectMap<Object2IntMap<eqi>> m = new Long2ObjectOpenHashMap();
   private final Map<eqi, Long2BooleanMap> n = new HashMap<>();

   public eqj(ecu $$0, js $$1, eul $$2, ald<dip> $$3, ebm $$4, egb $$5, dir $$6, djw $$7, long $$8, DataFixer $$9) {
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

   public eqk a(dhw $$0, eqi $$1, erf $$2, boolean $$3) {
      long $$4 = $$0.a();
      Object2IntMap<eqi> $$5 = (Object2IntMap<eqi>)this.m.get($$4);
      if ($$5 != null) {
         return this.a($$5, $$1, $$3);
      } else {
         eqk $$6 = this.a($$0, $$1, $$3, $$4);
         if ($$6 != null) {
            return $$6;
         } else if (!$$2.a($$0.h, $$0.i, this.k)) {
            return eqk.b;
         } else {
            boolean $$7 = this.n.computeIfAbsent($$1, $$0x -> new Long2BooleanOpenHashMap()).computeIfAbsent($$4, $$2x -> this.b($$0, $$1));
            return !$$7 ? eqk.b : eqk.c;
         }
      }
   }

   private boolean b(dhw $$0, eqi $$1) {
      return $$1.b(new eqi.a(this.d, this.g, this.j, this.h, this.e, this.k, $$0, this.i, $$1.a()::a)).isPresent();
   }

   @Nullable
   private eqk a(dhw $$0, eqi $$1, boolean $$2, long $$3) {
      vb $$4 = new vb(new vd(uc.a, "DataVersion"), new vd("Level", "Structures", tx.b, "Starts"), new vd("structures", tx.b, "starts"));

      try {
         this.c.a($$0, $$4).join();
      } catch (Exception var13) {
         a.warn("Failed to read chunk {}", $$0, var13);
         return eqk.c;
      }

      if (!($$4.d() instanceof tx $$7)) {
         return null;
      } else {
         int $$8 = ecv.a($$7);
         if ($$8 <= 1493) {
            return eqk.c;
         } else {
            ecv.a($$7, this.f, this.g.c());

            tx $$9;
            try {
               $$9 = baz.c.a(this.l, $$7, $$8);
            } catch (Exception var12) {
               a.warn("Failed to partially datafix chunk {}", $$0, var12);
               return eqk.c;
            }

            Object2IntMap<eqi> $$12 = this.a($$9);
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
   private Object2IntMap<eqi> a(tx $$0) {
      if (!$$0.b("structures", 10)) {
         return null;
      } else {
         tx $$1 = $$0.p("structures");
         if (!$$1.b("starts", 10)) {
            return null;
         } else {
            tx $$2 = $$1.p("starts");
            if ($$2.g()) {
               return Object2IntMaps.emptyMap();
            } else {
               Object2IntMap<eqi> $$3 = new Object2IntOpenHashMap();
               jr<eqi> $$4 = this.d.f(mg.bc);

               for (String $$5 : $$2.e()) {
                  ale $$6 = ale.c($$5);
                  if ($$6 != null) {
                     eqi $$7 = $$4.a($$6);
                     if ($$7 != null) {
                        tx $$8 = $$2.p($$5);
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

   private static Object2IntMap<eqi> a(Object2IntMap<eqi> $$0) {
      return $$0.isEmpty() ? Object2IntMaps.emptyMap() : $$0;
   }

   private eqk a(Object2IntMap<eqi> $$0, eqi $$1, boolean $$2) {
      int $$3 = $$0.getOrDefault($$1, -1);
      return $$3 == -1 || $$2 && $$3 != 0 ? eqk.b : eqk.a;
   }

   public void a(dhw $$0, Map<eqi, eqq> $$1) {
      long $$2 = $$0.a();
      Object2IntMap<eqi> $$3 = new Object2IntOpenHashMap();
      $$1.forEach(($$1x, $$2x) -> {
         if ($$2x.b()) {
            $$3.put($$1x, $$2x.f());
         }
      });
      this.a($$2, $$3);
   }

   private void a(long $$0, Object2IntMap<eqi> $$1) {
      this.m.put($$0, a($$1));
      this.n.values().forEach($$1x -> $$1x.remove($$0));
   }

   public void a(dhw $$0, eqi $$1) {
      this.m.compute($$0.a(), ($$1x, $$2) -> {
         if ($$2 == null || $$2.isEmpty()) {
            $$2 = new Object2IntOpenHashMap();
         }

         $$2.computeInt($$1, ($$0xx, $$1xx) -> $$1xx == null ? 1 : $$1xx + 1);
         return $$2;
      });
   }
}
