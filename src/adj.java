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

public class adj {
   private static final Logger a = LogUtils.getLogger();

   public static void a(ane $$0, hx $$1, String $$2, int $$3, int $$4) {
      a($$0, (yb)(new yf($$1, $$3, $$2, $$4)));
   }

   public static void a(ane $$0) {
      a($$0, (yb)(new yg()));
   }

   public static void a(ane $$0, cte $$1) {
   }

   public static void a(ane $$0, hx $$1) {
      d($$0, $$1);
   }

   public static void b(ane $$0, hx $$1) {
      d($$0, $$1);
   }

   public static void c(ane $$0, hx $$1) {
      d($$0, $$1);
   }

   private static void d(ane $$0, hx $$1) {
   }

   public static void a(ctx $$0, bmq $$1, @Nullable efo $$2, float $$3) {
   }

   public static void a(ctx $$0, hx $$1) {
   }

   public static void a(cus $$0, dzw $$1) {
   }

   public static void a(ctx $$0, bmq $$1, btl $$2) {
   }

   public static void a(ane $$0, Collection<cgy> $$1) {
   }

   public static void a(bmo $$0) {
   }

   public static void a(byd $$0) {
   }

   public static void a(cds $$0) {
   }

   public static void a(ctx $$0, ih<dnz> $$1, emc $$2) {
   }

   public static void a(ctx $$0, dob $$1) {
   }

   public static void a(ctx $$0, hx $$1, djp $$2, dha $$3) {
   }

   private static List<String> a(bmo $$0, long $$1) {
      Map<bvq<?>, Optional<? extends bvp<?>>> $$2 = $$0.dN().b();
      List<String> $$3 = Lists.newArrayList();

      for (Entry<bvq<?>, Optional<? extends bvp<?>>> $$4 : $$2.entrySet()) {
         bvq<?> $$5 = $$4.getKey();
         Optional<? extends bvp<?>> $$6 = $$4.getValue();
         String $$10;
         if ($$6.isPresent()) {
            bvp<?> $$7 = (bvp<?>)$$6.get();
            Object $$8 = $$7.c();
            if ($$5 == bvq.D) {
               long $$9 = $$1 - (Long)$$8;
               $$10 = $$9 + " ticks ago";
            } else if ($$7.e()) {
               $$10 = a((ane)$$0.dL(), $$8) + " (ttl: " + $$7.b() + ")";
            } else {
               $$10 = a((ane)$$0.dL(), $$8);
            }
         } else {
            $$10 = "-";
         }

         $$3.add(kd.B.b($$5).a() + ": " + $$10);
      }

      $$3.sort(String::compareTo);
      return $$3;
   }

   private static String a(ane $$0, @Nullable Object $$1) {
      if ($$1 == null) {
         return "-";
      } else if ($$1 instanceof UUID) {
         return a($$0, $$0.a((UUID)$$1));
      } else if ($$1 instanceof bmo) {
         blw $$2 = (blw)$$1;
         return adi.a($$2);
      } else if ($$1 instanceof bkh) {
         return ((bkh)$$1).ad().getString();
      } else if ($$1 instanceof bvt) {
         return a($$0, ((bvt)$$1).a());
      } else if ($$1 instanceof boq) {
         return a($$0, ((boq)$$1).c());
      } else if ($$1 instanceof ig) {
         return a($$0, ((ig)$$1).b());
      } else if ($$1 instanceof boi) {
         return a($$0, ((boi)$$1).b());
      } else if ($$1 instanceof bkv) {
         blw $$3 = ((bkv)$$1).d();
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

   private static void a(ane $$0, yb $$1) {
      xg<?> $$2 = new xk($$1);

      for (anf $$3 : $$0.x()) {
         $$3.c.b($$2);
      }
   }
}
