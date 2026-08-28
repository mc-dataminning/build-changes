import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class afy {
   private static final Logger a = LogUtils.getLogger();

   public static void a(aqm $$0, ja $$1, String $$2, int $$3, int $$4) {
      a($$0, (aac)(new aag($$1, $$3, $$2, $$4)));
   }

   public static void a(aqm $$0) {
      a($$0, (aac)(new aah()));
   }

   public static void a(aqm $$0, dbm $$1) {
   }

   public static void a(aqm $$0, ja $$1) {
      d($$0, $$1);
   }

   public static void b(aqm $$0, ja $$1) {
      d($$0, $$1);
   }

   public static void c(aqm $$0, ja $$1) {
      d($$0, $$1);
   }

   private static void d(aqm $$0, ja $$1) {
   }

   public static void a(dcf $$0, btd $$1, @Nullable eov $$2, float $$3) {
   }

   public static void a(dcf $$0, ja $$1) {
   }

   public static void a(ddb $$0, eje $$1) {
   }

   public static void a(dcf $$0, btd $$1, caa $$2) {
   }

   public static void a(aqm $$0, Collection<cnv> $$1) {
   }

   public static void a(btb $$0) {
   }

   public static void a(ces $$0) {
   }

   public static void a(ckm $$0) {
   }

   public static void a(dcf $$0, jj<dxg> $$1, ewf $$2) {
   }

   public static void a(dcf $$0, dxi $$1) {
   }

   public static void a(dcf $$0, ja $$1, dsk $$2, dpm $$3) {
   }

   private static List<String> a(btb $$0, long $$1) {
      Map<ccf<?>, Optional<? extends cce<?>>> $$2 = $$0.dU().b();
      List<String> $$3 = Lists.newArrayList();

      for (Entry<ccf<?>, Optional<? extends cce<?>>> $$4 : $$2.entrySet()) {
         ccf<?> $$5 = $$4.getKey();
         Optional<? extends cce<?>> $$6 = $$4.getValue();
         String $$10;
         if ($$6.isPresent()) {
            cce<?> $$7 = (cce<?>)$$6.get();
            Object $$8 = $$7.c();
            if ($$5 == ccf.D) {
               long $$9 = $$1 - (Long)$$8;
               $$10 = $$9 + " ticks ago";
            } else if ($$7.e()) {
               $$10 = a((aqm)$$0.dQ(), $$8) + " (ttl: " + $$7.b() + ")";
            } else {
               $$10 = a((aqm)$$0.dQ(), $$8);
            }
         } else {
            $$10 = "-";
         }

         $$3.add(lq.z.b($$5).a() + ": " + $$10);
      }

      $$3.sort(String::compareTo);
      return $$3;
   }

   private static String a(aqm $$0, @Nullable Object $$1) {
      if ($$1 == null) {
         return "-";
      } else if ($$1 instanceof UUID) {
         return a($$0, $$0.a((UUID)$$1));
      } else if ($$1 instanceof btb) {
         bsg $$2 = (bsg)$$1;
         return afx.a($$2);
      } else if ($$1 instanceof bql) {
         return ((bql)$$1).ag().getString();
      } else if ($$1 instanceof cci) {
         return a($$0, ((cci)$$1).a());
      } else if ($$1 instanceof bvf) {
         return a($$0, ((bvf)$$1).c());
      } else if ($$1 instanceof ji) {
         return a($$0, ((ji)$$1).b());
      } else if ($$1 instanceof bux) {
         return a($$0, ((bux)$$1).b());
      } else if ($$1 instanceof bqz) {
         bsg $$3 = ((bqz)$$1).d();
         return $$3 == null ? $$1.toString() : a($$0, $$3);
      } else if (!($$1 instanceof Collection)) {
         return $$1.toString();
      } else {
         List<String> $$4 = Lists.newArrayList();

         for (Object $$5 : (Iterable)$$1) {
            $$4.add(a($$0, $$5));
         }

         return $$4.toString();
      }
   }

   private static void a(aqm $$0, aac $$1) {
      zb<?> $$2 = new zi($$1);

      for (aqn $$3 : $$0.x()) {
         $$3.c.b($$2);
      }
   }
}
