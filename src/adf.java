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

public class adf {
   private static final Logger a = LogUtils.getLogger();

   public static void a(amz $$0, hx $$1, String $$2, int $$3, int $$4) {
      a($$0, (xx)(new yb($$1, $$3, $$2, $$4)));
   }

   public static void a(amz $$0) {
      a($$0, (xx)(new yc()));
   }

   public static void a(amz $$0, csp $$1) {
   }

   public static void a(amz $$0, hx $$1) {
      d($$0, $$1);
   }

   public static void b(amz $$0, hx $$1) {
      d($$0, $$1);
   }

   public static void c(amz $$0, hx $$1) {
      d($$0, $$1);
   }

   private static void d(amz $$0, hx $$1) {
   }

   public static void a(cti $$0, bmh $$1, @Nullable eez $$2, float $$3) {
   }

   public static void a(cti $$0, hx $$1) {
   }

   public static void a(cud $$0, dzh $$1) {
   }

   public static void a(cti $$0, bmh $$1, btc $$2) {
   }

   public static void a(amz $$0, Collection<cgj> $$1) {
   }

   public static void a(bmf $$0) {
   }

   public static void a(bxt $$0) {
   }

   public static void a(cdf $$0) {
   }

   public static void a(cti $$0, dnk $$1, elm $$2) {
   }

   public static void a(cti $$0, dnm $$1) {
   }

   public static void a(cti $$0, hx $$1, dja $$2, dgl $$3) {
   }

   private static List<String> a(bmf $$0, long $$1) {
      Map<bvh<?>, Optional<? extends bvg<?>>> $$2 = $$0.dO().b();
      List<String> $$3 = Lists.newArrayList();

      for (Entry<bvh<?>, Optional<? extends bvg<?>>> $$4 : $$2.entrySet()) {
         bvh<?> $$5 = $$4.getKey();
         Optional<? extends bvg<?>> $$6 = $$4.getValue();
         String $$10;
         if ($$6.isPresent()) {
            bvg<?> $$7 = (bvg<?>)$$6.get();
            Object $$8 = $$7.c();
            if ($$5 == bvh.D) {
               long $$9 = $$1 - (Long)$$8;
               $$10 = $$9 + " ticks ago";
            } else if ($$7.e()) {
               $$10 = a((amz)$$0.dM(), $$8) + " (ttl: " + $$7.b() + ")";
            } else {
               $$10 = a((amz)$$0.dM(), $$8);
            }
         } else {
            $$10 = "-";
         }

         $$3.add(kd.B.b($$5).a() + ": " + $$10);
      }

      $$3.sort(String::compareTo);
      return $$3;
   }

   private static String a(amz $$0, @Nullable Object $$1) {
      if ($$1 == null) {
         return "-";
      } else if ($$1 instanceof UUID) {
         return a($$0, $$0.a((UUID)$$1));
      } else if ($$1 instanceof bmf) {
         blp $$2 = (blp)$$1;
         return ade.a($$2);
      } else if ($$1 instanceof bjz) {
         return ((bjz)$$1).ad().getString();
      } else if ($$1 instanceof bvk) {
         return a($$0, ((bvk)$$1).a());
      } else if ($$1 instanceof boh) {
         return a($$0, ((boh)$$1).c());
      } else if ($$1 instanceof ig) {
         return a($$0, ((ig)$$1).b());
      } else if ($$1 instanceof bnz) {
         return a($$0, ((bnz)$$1).b());
      } else if ($$1 instanceof bkn) {
         blp $$3 = ((bkn)$$1).d();
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

   private static void a(amz $$0, xx $$1) {
      xd<?> $$2 = new xh($$1);

      for (ana $$3 : $$0.x()) {
         $$3.c.b($$2);
      }
   }
}
