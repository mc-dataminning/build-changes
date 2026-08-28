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

   public static void a(aqk $$0, ja $$1, String $$2, int $$3, int $$4) {
      a($$0, (aac)(new aag($$1, $$3, $$2, $$4)));
   }

   public static void a(aqk $$0) {
      a($$0, (aac)(new aah()));
   }

   public static void a(aqk $$0, dbk $$1) {
   }

   public static void a(aqk $$0, ja $$1) {
      d($$0, $$1);
   }

   public static void b(aqk $$0, ja $$1) {
      d($$0, $$1);
   }

   public static void c(aqk $$0, ja $$1) {
      d($$0, $$1);
   }

   private static void d(aqk $$0, ja $$1) {
   }

   public static void a(dcd $$0, bta $$1, @Nullable eop $$2, float $$3) {
   }

   public static void a(dcd $$0, ja $$1) {
   }

   public static void a(dcz $$0, eiy $$1) {
   }

   public static void a(dcd $$0, bta $$1, bzx $$2) {
   }

   public static void a(aqk $$0, Collection<cns> $$1) {
   }

   public static void a(bsy $$0) {
   }

   public static void a(cep $$0) {
   }

   public static void a(ckj $$0) {
   }

   public static void a(dcd $$0, jj<dxa> $$1, evz $$2) {
   }

   public static void a(dcd $$0, dxc $$1) {
   }

   public static void a(dcd $$0, ja $$1, dsh $$2, dpk $$3) {
   }

   private static List<String> a(bsy $$0, long $$1) {
      Map<ccc<?>, Optional<? extends ccb<?>>> $$2 = $$0.dT().b();
      List<String> $$3 = Lists.newArrayList();

      for (Entry<ccc<?>, Optional<? extends ccb<?>>> $$4 : $$2.entrySet()) {
         ccc<?> $$5 = $$4.getKey();
         Optional<? extends ccb<?>> $$6 = $$4.getValue();
         String $$10;
         if ($$6.isPresent()) {
            ccb<?> $$7 = (ccb<?>)$$6.get();
            Object $$8 = $$7.c();
            if ($$5 == ccc.D) {
               long $$9 = $$1 - (Long)$$8;
               $$10 = $$9 + " ticks ago";
            } else if ($$7.e()) {
               $$10 = a((aqk)$$0.dP(), $$8) + " (ttl: " + $$7.b() + ")";
            } else {
               $$10 = a((aqk)$$0.dP(), $$8);
            }
         } else {
            $$10 = "-";
         }

         $$3.add(lq.z.b($$5).a() + ": " + $$10);
      }

      $$3.sort(String::compareTo);
      return $$3;
   }

   private static String a(aqk $$0, @Nullable Object $$1) {
      if ($$1 == null) {
         return "-";
      } else if ($$1 instanceof UUID) {
         return a($$0, $$0.a((UUID)$$1));
      } else if ($$1 instanceof bsy) {
         bsd $$2 = (bsd)$$1;
         return afx.a($$2);
      } else if ($$1 instanceof bqi) {
         return ((bqi)$$1).af().getString();
      } else if ($$1 instanceof ccf) {
         return a($$0, ((ccf)$$1).a());
      } else if ($$1 instanceof bvc) {
         return a($$0, ((bvc)$$1).c());
      } else if ($$1 instanceof ji) {
         return a($$0, ((ji)$$1).b());
      } else if ($$1 instanceof buu) {
         return a($$0, ((buu)$$1).b());
      } else if ($$1 instanceof bqw) {
         bsd $$3 = ((bqw)$$1).d();
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

   private static void a(aqk $$0, aac $$1) {
      zb<?> $$2 = new zi($$1);

      for (aql $$3 : $$0.x()) {
         $$3.c.b($$2);
      }
   }
}
