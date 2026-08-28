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

   public static void a(aqm $$0, dbn $$1) {
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

   public static void a(dcg $$0, bte $$1, @Nullable eox $$2, float $$3) {
   }

   public static void a(dcg $$0, ja $$1) {
   }

   public static void a(ddc $$0, ejf $$1) {
   }

   public static void a(dcg $$0, bte $$1, cab $$2) {
   }

   public static void a(aqm $$0, Collection<cnw> $$1) {
   }

   public static void a(btc $$0) {
   }

   public static void a(cet $$0) {
   }

   public static void a(ckn $$0) {
   }

   public static void a(dcg $$0, jj<dxh> $$1, ewh $$2) {
   }

   public static void a(dcg $$0, dxj $$1) {
   }

   public static void a(dcg $$0, ja $$1, dsl $$2, dpn $$3) {
   }

   private static List<String> a(btc $$0, long $$1) {
      Map<ccg<?>, Optional<? extends ccf<?>>> $$2 = $$0.dV().b();
      List<String> $$3 = Lists.newArrayList();

      for (Entry<ccg<?>, Optional<? extends ccf<?>>> $$4 : $$2.entrySet()) {
         ccg<?> $$5 = $$4.getKey();
         Optional<? extends ccf<?>> $$6 = $$4.getValue();
         String $$10;
         if ($$6.isPresent()) {
            ccf<?> $$7 = (ccf<?>)$$6.get();
            Object $$8 = $$7.c();
            if ($$5 == ccg.D) {
               long $$9 = $$1 - (Long)$$8;
               $$10 = $$9 + " ticks ago";
            } else if ($$7.e()) {
               $$10 = a((aqm)$$0.dR(), $$8) + " (ttl: " + $$7.b() + ")";
            } else {
               $$10 = a((aqm)$$0.dR(), $$8);
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
      } else if ($$1 instanceof btc) {
         bsh $$2 = (bsh)$$1;
         return afx.a($$2);
      } else if ($$1 instanceof bqm) {
         return ((bqm)$$1).ah().getString();
      } else if ($$1 instanceof ccj) {
         return a($$0, ((ccj)$$1).a());
      } else if ($$1 instanceof bvg) {
         return a($$0, ((bvg)$$1).c());
      } else if ($$1 instanceof ji) {
         return a($$0, ((ji)$$1).b());
      } else if ($$1 instanceof buy) {
         return a($$0, ((buy)$$1).b());
      } else if ($$1 instanceof bra) {
         bsh $$3 = ((bra)$$1).d();
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
