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

public class abc {
   private static final Logger a = LogUtils.getLogger();

   public static void a(akt $$0, gw $$1, String $$2, int $$3, int $$4) {
      a($$0, (vx)(new wb($$1, $$3, $$2, $$4)));
   }

   public static void a(akt $$0) {
      a($$0, (vx)(new wc()));
   }

   public static void a(akt $$0, cpi $$1) {
   }

   public static void a(akt $$0, gw $$1) {
      d($$0, $$1);
   }

   public static void b(akt $$0, gw $$1) {
      d($$0, $$1);
   }

   public static void c(akt $$0, gw $$1) {
      d($$0, $$1);
   }

   private static void d(akt $$0, gw $$1) {
   }

   public static void a(cqb $$0, bjo $$1, @Nullable eav $$2, float $$3) {
   }

   public static void a(cqb $$0, gw $$1) {
   }

   public static void a(cqv $$0, dvk $$1) {
   }

   public static void a(cqb $$0, bjo $$1, bqi $$2) {
   }

   public static void a(akt $$0, Collection<cdh> $$1) {
   }

   public static void a(bjm $$0) {
   }

   public static void a(buy $$0) {
   }

   public static void a(cqb $$0, djn $$1, ehh $$2) {
   }

   public static void a(cqb $$0, djp $$1) {
   }

   public static void a(cqb $$0, gw $$1, dfd $$2, dcw $$3) {
   }

   private static List<String> a(bjm $$0, long $$1) {
      Map<bsn<?>, Optional<? extends bsm<?>>> $$2 = $$0.dN().b();
      List<String> $$3 = Lists.newArrayList();

      for (Entry<bsn<?>, Optional<? extends bsm<?>>> $$4 : $$2.entrySet()) {
         bsn<?> $$5 = $$4.getKey();
         Optional<? extends bsm<?>> $$6 = $$4.getValue();
         String $$10;
         if ($$6.isPresent()) {
            bsm<?> $$7 = (bsm<?>)$$6.get();
            Object $$8 = $$7.c();
            if ($$5 == bsn.D) {
               long $$9 = $$1 - (Long)$$8;
               $$10 = $$9 + " ticks ago";
            } else if ($$7.e()) {
               $$10 = a((akt)$$0.dL(), $$8) + " (ttl: " + $$7.b() + ")";
            } else {
               $$10 = a((akt)$$0.dL(), $$8);
            }
         } else {
            $$10 = "-";
         }

         $$3.add(jb.C.b($$5).a() + ": " + $$10);
      }

      $$3.sort(String::compareTo);
      return $$3;
   }

   private static String a(akt $$0, @Nullable Object $$1) {
      if ($$1 == null) {
         return "-";
      } else if ($$1 instanceof UUID) {
         return a($$0, $$0.a((UUID)$$1));
      } else if ($$1 instanceof bjm) {
         biw $$2 = (biw)$$1;
         return abb.a($$2);
      } else if ($$1 instanceof bhi) {
         return ((bhi)$$1).ab().getString();
      } else if ($$1 instanceof bsq) {
         return a($$0, ((bsq)$$1).a());
      } else if ($$1 instanceof blo) {
         return a($$0, ((blo)$$1).c());
      } else if ($$1 instanceof hd) {
         return a($$0, ((hd)$$1).b());
      } else if ($$1 instanceof blg) {
         return a($$0, ((blg)$$1).b());
      } else if ($$1 instanceof bhu) {
         biw $$3 = ((bhu)$$1).d();
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

   private static void a(akt $$0, vx $$1) {
      ve<?> $$2 = new vi($$1);

      for (aku $$3 : $$0.v()) {
         $$3.c.b($$2);
      }
   }
}
