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

public class agr {
   private static final Logger a = LogUtils.getLogger();

   public static void a(arm $$0, jg $$1, String $$2, int $$3, int $$4) {
      a($$0, (aar)(new aav($$1, $$3, $$2, $$4)));
   }

   public static void a(arm $$0) {
      a($$0, (aar)(new aaw()));
   }

   public static void a(arm $$0, deb $$1) {
   }

   public static void a(arm $$0, jg $$1) {
      d($$0, $$1);
   }

   public static void b(arm $$0, jg $$1) {
      d($$0, $$1);
   }

   public static void c(arm $$0, jg $$1) {
      d($$0, $$1);
   }

   private static void d(arm $$0, jg $$1) {
   }

   public static void a(dev $$0, bux $$1, @Nullable ers $$2, float $$3) {
   }

   public static void a(dev $$0, jg $$1) {
   }

   public static void a(dev $$0, abf $$1) {
      if ($$0 instanceof arm $$2) {
         a($$2, (aar)$$1);
      }
   }

   public static void a(dfs $$0, elz $$1) {
   }

   public static void a(dev $$0, bux $$1, cbu $$2) {
   }

   public static void a(arm $$0, Collection<cpv> $$1) {
   }

   public static void a(buv $$0) {
   }

   public static void a(cgn $$0) {
   }

   public static void a(cmi $$0) {
   }

   public static void a(dev $$0, jp<eaa> $$1, ezh $$2) {
   }

   public static void a(dev $$0, eac $$1) {
   }

   public static void a(dev $$0, jg $$1, dvd $$2, dsd $$3) {
   }

   private static List<String> a(buv $$0, long $$1) {
      Map<cdz<?>, Optional<? extends cdy<?>>> $$2 = $$0.ed().b();
      List<String> $$3 = Lists.newArrayList();

      for (Entry<cdz<?>, Optional<? extends cdy<?>>> $$4 : $$2.entrySet()) {
         cdz<?> $$5 = $$4.getKey();
         Optional<? extends cdy<?>> $$6 = $$4.getValue();
         String $$10;
         if ($$6.isPresent()) {
            cdy<?> $$7 = (cdy<?>)$$6.get();
            Object $$8 = $$7.c();
            if ($$5 == cdz.D) {
               long $$9 = $$1 - (Long)$$8;
               $$10 = $$9 + " ticks ago";
            } else if ($$7.e()) {
               $$10 = a((arm)$$0.dX(), $$8) + " (ttl: " + $$7.b() + ")";
            } else {
               $$10 = a((arm)$$0.dX(), $$8);
            }
         } else {
            $$10 = "-";
         }

         $$3.add(lx.z.b($$5).a() + ": " + $$10);
      }

      $$3.sort(String::compareTo);
      return $$3;
   }

   private static String a(arm $$0, @Nullable Object $$1) {
      if ($$1 == null) {
         return "-";
      } else if ($$1 instanceof UUID) {
         return a($$0, $$0.a((UUID)$$1));
      } else if ($$1 instanceof buv) {
         btz $$2 = (btz)$$1;
         return agq.a($$2);
      } else if ($$1 instanceof bsb) {
         return ((bsb)$$1).al().getString();
      } else if ($$1 instanceof cec) {
         return a($$0, ((cec)$$1).a());
      } else if ($$1 instanceof bwz) {
         return a($$0, ((bwz)$$1).c());
      } else if ($$1 instanceof jo) {
         return a($$0, ((jo)$$1).b());
      } else if ($$1 instanceof bwr) {
         return a($$0, ((bwr)$$1).b());
      } else if ($$1 instanceof bsp) {
         btz $$3 = ((bsp)$$1).d();
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

   private static void a(arm $$0, aar $$1) {
      zo<?> $$2 = new zv($$1);

      for (arn $$3 : $$0.x()) {
         $$3.d.b($$2);
      }
   }
}
