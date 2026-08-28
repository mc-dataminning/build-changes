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

public class eod {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = -1;
   private final ear c;
   private final ke d;
   private final esf e;
   private final aly<dha> f;
   private final dzj g;
   private final edw h;
   private final dhc i;
   private final dig j;
   private final long k;
   private final DataFixer l;
   private final Long2ObjectMap<Object2IntMap<eoc>> m = new Long2ObjectOpenHashMap();
   private final Map<eoc, Long2BooleanMap> n = new HashMap<>();

   public eod(ear $$0, ke $$1, esf $$2, aly<dha> $$3, dzj $$4, edw $$5, dhc $$6, dig $$7, long $$8, DataFixer $$9) {
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

   public eoe a(dgg $$0, eoc $$1, eoz $$2, boolean $$3) {
      long $$4 = $$0.a();
      Object2IntMap<eoc> $$5 = (Object2IntMap<eoc>)this.m.get($$4);
      if ($$5 != null) {
         return this.a($$5, $$1, $$3);
      } else {
         eoe $$6 = this.a($$0, $$1, $$3, $$4);
         if ($$6 != null) {
            return $$6;
         } else if (!$$2.a($$0.g, $$0.h, this.k)) {
            return eoe.b;
         } else {
            boolean $$7 = this.n.computeIfAbsent($$1, $$0x -> new Long2BooleanOpenHashMap()).computeIfAbsent($$4, $$2x -> this.b($$0, $$1));
            return !$$7 ? eoe.b : eoe.c;
         }
      }
   }

   private boolean b(dgg $$0, eoc $$1) {
      return $$1.b(new eoc.a(this.d, this.g, this.j, this.h, this.e, this.k, $$0, this.i, $$1.a()::a)).isPresent();
   }

   @Nullable
   private eoe a(dgg $$0, eoc $$1, boolean $$2, long $$3) {
      wb $$4 = new wb(new wd(vc.a, "DataVersion"), new wd("Level", "Structures", ux.b, "Starts"), new wd("structures", ux.b, "starts"));

      try {
         this.c.a($$0, $$4).join();
      } catch (Exception var13) {
         a.warn("Failed to read chunk {}", $$0, var13);
         return eoe.c;
      }

      if (!($$4.d() instanceof ux $$7)) {
         return null;
      } else {
         int $$8 = eas.a($$7);
         if ($$8 <= 1493) {
            return eoe.c;
         } else {
            eas.a($$7, this.f, this.g.c());

            ux $$9;
            try {
               $$9 = bbo.c.a(this.l, $$7, $$8);
            } catch (Exception var12) {
               a.warn("Failed to partially datafix chunk {}", $$0, var12);
               return eoe.c;
            }

            Object2IntMap<eoc> $$12 = this.a($$9);
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
   private Object2IntMap<eoc> a(ux $$0) {
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
               Object2IntMap<eoc> $$3 = new Object2IntOpenHashMap();
               kd<eoc> $$4 = this.d.e(mb.aT);

               for (String $$5 : $$2.e()) {
                  alz $$6 = alz.c($$5);
                  if ($$6 != null) {
                     eoc $$7 = $$4.a($$6);
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

   private static Object2IntMap<eoc> a(Object2IntMap<eoc> $$0) {
      return $$0.isEmpty() ? Object2IntMaps.emptyMap() : $$0;
   }

   private eoe a(Object2IntMap<eoc> $$0, eoc $$1, boolean $$2) {
      int $$3 = $$0.getOrDefault($$1, -1);
      return $$3 == -1 || $$2 && $$3 != 0 ? eoe.b : eoe.a;
   }

   public void a(dgg $$0, Map<eoc, eok> $$1) {
      long $$2 = $$0.a();
      Object2IntMap<eoc> $$3 = new Object2IntOpenHashMap();
      $$1.forEach(($$1x, $$2x) -> {
         if ($$2x.b()) {
            $$3.put($$1x, $$2x.f());
         }
      });
      this.a($$2, $$3);
   }

   private void a(long $$0, Object2IntMap<eoc> $$1) {
      this.m.put($$0, a($$1));
      this.n.values().forEach($$1x -> $$1x.remove($$0));
   }

   public void a(dgg $$0, eoc $$1) {
      this.m.compute($$0.a(), ($$1x, $$2) -> {
         if ($$2 == null || $$2.isEmpty()) {
            $$2 = new Object2IntOpenHashMap();
         }

         $$2.computeInt($$1, ($$0xx, $$1xx) -> $$1xx == null ? 1 : $$1xx + 1);
         return $$2;
      });
   }
}
