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

public class aci {
   private static final Logger a = LogUtils.getLogger();

   public static void a(ama $$0, ht $$1, String $$2, int $$3, int $$4) {
      a($$0, (xd)(new xh($$1, $$3, $$2, $$4)));
   }

   public static void a(ama $$0) {
      a($$0, (xd)(new xi()));
   }

   public static void a(ama $$0, cqz $$1) {
   }

   public static void a(ama $$0, ht $$1) {
      d($$0, $$1);
   }

   public static void b(ama $$0, ht $$1) {
      d($$0, $$1);
   }

   public static void c(ama $$0, ht $$1) {
      d($$0, $$1);
   }

   private static void d(ama $$0, ht $$1) {
   }

   public static void a(crs $$0, bla $$1, @Nullable ecv $$2, float $$3) {
   }

   public static void a(crs $$0, ht $$1) {
   }

   public static void a(csm $$0, dxd $$1) {
   }

   public static void a(crs $$0, bla $$1, bru $$2) {
   }

   public static void a(ama $$0, Collection<cet> $$1) {
   }

   public static void a(bky $$0) {
   }

   public static void a(bwk $$0) {
   }

   public static void a(crs $$0, dlg $$1, eji $$2) {
   }

   public static void a(crs $$0, dli $$1) {
   }

   public static void a(crs $$0, ht $$1, dgw $$2, deo $$3) {
   }

   private static List<String> a(bky $$0, long $$1) {
      Map<btz<?>, Optional<? extends bty<?>>> $$2 = $$0.dN().b();
      List<String> $$3 = Lists.newArrayList();

      for (Entry<btz<?>, Optional<? extends bty<?>>> $$4 : $$2.entrySet()) {
         btz<?> $$5 = $$4.getKey();
         Optional<? extends bty<?>> $$6 = $$4.getValue();
         String $$10;
         if ($$6.isPresent()) {
            bty<?> $$7 = (bty<?>)$$6.get();
            Object $$8 = $$7.c();
            if ($$5 == btz.D) {
               long $$9 = $$1 - (Long)$$8;
               $$10 = $$9 + " ticks ago";
            } else if ($$7.e()) {
               $$10 = a((ama)$$0.dL(), $$8) + " (ttl: " + $$7.b() + ")";
            } else {
               $$10 = a((ama)$$0.dL(), $$8);
            }
         } else {
            $$10 = "-";
         }

         $$3.add(jy.C.b($$5).a() + ": " + $$10);
      }

      $$3.sort(String::compareTo);
      return $$3;
   }

   private static String a(ama $$0, @Nullable Object $$1) {
      if ($$1 == null) {
         return "-";
      } else if ($$1 instanceof UUID) {
         return a($$0, $$0.a((UUID)$$1));
      } else if ($$1 instanceof bky) {
         bki $$2 = (bki)$$1;
         return ach.a($$2);
      } else if ($$1 instanceof biu) {
         return ((biu)$$1).ab().getString();
      } else if ($$1 instanceof buc) {
         return a($$0, ((buc)$$1).a());
      } else if ($$1 instanceof bna) {
         return a($$0, ((bna)$$1).c());
      } else if ($$1 instanceof ia) {
         return a($$0, ((ia)$$1).b());
      } else if ($$1 instanceof bms) {
         return a($$0, ((bms)$$1).b());
      } else if ($$1 instanceof bjg) {
         bki $$3 = ((bjg)$$1).d();
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

   private static void a(ama $$0, xd $$1) {
      wk<?> $$2 = new wo($$1);

      for (amb $$3 : $$0.v()) {
         $$3.c.b($$2);
      }
   }
}
