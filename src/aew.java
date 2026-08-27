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

public class aew {
   private static final Logger a = LogUtils.getLogger();

   public static void a(apf $$0, ib $$1, String $$2, int $$3, int $$4) {
      a($$0, (zc)(new zg($$1, $$3, $$2, $$4)));
   }

   public static void a(apf $$0) {
      a($$0, (zc)(new zh()));
   }

   public static void a(apf $$0, cwg $$1) {
   }

   public static void a(apf $$0, ib $$1) {
      d($$0, $$1);
   }

   public static void b(apf $$0, ib $$1) {
      d($$0, $$1);
   }

   public static void c(apf $$0, ib $$1) {
      d($$0, $$1);
   }

   private static void d(apf $$0, ib $$1) {
   }

   public static void a(cwz $$0, bpq $$1, @Nullable ejc $$2, float $$3) {
   }

   public static void a(cwz $$0, ib $$1) {
   }

   public static void a(cxu $$0, edk $$1) {
   }

   public static void a(cwz $$0, bpq $$1, bwm $$2) {
   }

   public static void a(apf $$0, Collection<ckd> $$1) {
   }

   public static void a(bpo $$0) {
   }

   public static void a(cbe $$0) {
   }

   public static void a(cgu $$0) {
   }

   public static void a(cwz $$0, il<drn> $$1, epr $$2) {
   }

   public static void a(cwz $$0, drp $$1) {
   }

   public static void a(cwz $$0, ib $$1, dmz $$2, dkd $$3) {
   }

   private static List<String> a(bpo $$0, long $$1) {
      Map<byr<?>, Optional<? extends byq<?>>> $$2 = $$0.dP().b();
      List<String> $$3 = Lists.newArrayList();

      for (Entry<byr<?>, Optional<? extends byq<?>>> $$4 : $$2.entrySet()) {
         byr<?> $$5 = $$4.getKey();
         Optional<? extends byq<?>> $$6 = $$4.getValue();
         String $$10;
         if ($$6.isPresent()) {
            byq<?> $$7 = (byq<?>)$$6.get();
            Object $$8 = $$7.c();
            if ($$5 == byr.D) {
               long $$9 = $$1 - (Long)$$8;
               $$10 = $$9 + " ticks ago";
            } else if ($$7.e()) {
               $$10 = a((apf)$$0.dM(), $$8) + " (ttl: " + $$7.b() + ")";
            } else {
               $$10 = a((apf)$$0.dM(), $$8);
            }
         } else {
            $$10 = "-";
         }

         $$3.add(ki.B.b($$5).a() + ": " + $$10);
      }

      $$3.sort(String::compareTo);
      return $$3;
   }

   private static String a(apf $$0, @Nullable Object $$1) {
      if ($$1 == null) {
         return "-";
      } else if ($$1 instanceof UUID) {
         return a($$0, $$0.a((UUID)$$1));
      } else if ($$1 instanceof bpo) {
         bow $$2 = (bow)$$1;
         return aev.a($$2);
      } else if ($$1 instanceof bnh) {
         return ((bnh)$$1).ad().getString();
      } else if ($$1 instanceof byu) {
         return a($$0, ((byu)$$1).a());
      } else if ($$1 instanceof brr) {
         return a($$0, ((brr)$$1).c());
      } else if ($$1 instanceof ik) {
         return a($$0, ((ik)$$1).b());
      } else if ($$1 instanceof brj) {
         return a($$0, ((brj)$$1).b());
      } else if ($$1 instanceof bnv) {
         bow $$3 = ((bnv)$$1).d();
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

   private static void a(apf $$0, zc $$1) {
      yb<?> $$2 = new yi($$1);

      for (apg $$3 : $$0.x()) {
         $$3.d.b($$2);
      }
   }
}
