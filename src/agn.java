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

public class agn {
   private static final Logger a = LogUtils.getLogger();

   public static void a(arg $$0, je $$1, String $$2, int $$3, int $$4) {
      a($$0, (aan)(new aar($$1, $$3, $$2, $$4)));
   }

   public static void a(arg $$0) {
      a($$0, (aan)(new aas()));
   }

   public static void a(arg $$0, dcy $$1) {
   }

   public static void a(arg $$0, je $$1) {
      d($$0, $$1);
   }

   public static void b(arg $$0, je $$1) {
      d($$0, $$1);
   }

   public static void c(arg $$0, je $$1) {
      d($$0, $$1);
   }

   private static void d(arg $$0, je $$1) {
   }

   public static void a(dds $$0, buh $$1, @Nullable eqp $$2, float $$3) {
   }

   public static void a(dds $$0, je $$1) {
   }

   public static void a(dds $$0, abb $$1) {
      if ($$0 instanceof arg $$2) {
         a($$2, (aan)$$1);
      }
   }

   public static void a(dep $$0, ekw $$1) {
   }

   public static void a(dds $$0, buh $$1, cbd $$2) {
   }

   public static void a(arg $$0, Collection<cpc> $$1) {
   }

   public static void a(buf $$0) {
   }

   public static void a(cfw $$0) {
   }

   public static void a(clr $$0) {
   }

   public static void a(dds $$0, jn<dyx> $$1, eye $$2) {
   }

   public static void a(dds $$0, dyz $$1) {
   }

   public static void a(dds $$0, je $$1, dua $$2, drb $$3) {
   }

   private static List<String> a(buf $$0, long $$1) {
      Map<cdi<?>, Optional<? extends cdh<?>>> $$2 = $$0.dX().b();
      List<String> $$3 = Lists.newArrayList();

      for (Entry<cdi<?>, Optional<? extends cdh<?>>> $$4 : $$2.entrySet()) {
         cdi<?> $$5 = $$4.getKey();
         Optional<? extends cdh<?>> $$6 = $$4.getValue();
         String $$10;
         if ($$6.isPresent()) {
            cdh<?> $$7 = (cdh<?>)$$6.get();
            Object $$8 = $$7.c();
            if ($$5 == cdi.D) {
               long $$9 = $$1 - (Long)$$8;
               $$10 = $$9 + " ticks ago";
            } else if ($$7.e()) {
               $$10 = a((arg)$$0.dS(), $$8) + " (ttl: " + $$7.b() + ")";
            } else {
               $$10 = a((arg)$$0.dS(), $$8);
            }
         } else {
            $$10 = "-";
         }

         $$3.add(lu.z.b($$5).a() + ": " + $$10);
      }

      $$3.sort(String::compareTo);
      return $$3;
   }

   private static String a(arg $$0, @Nullable Object $$1) {
      if ($$1 == null) {
         return "-";
      } else if ($$1 instanceof UUID) {
         return a($$0, $$0.a((UUID)$$1));
      } else if ($$1 instanceof buf) {
         btj $$2 = (btj)$$1;
         return agm.a($$2);
      } else if ($$1 instanceof brn) {
         return ((brn)$$1).aj().getString();
      } else if ($$1 instanceof cdl) {
         return a($$0, ((cdl)$$1).a());
      } else if ($$1 instanceof bwi) {
         return a($$0, ((bwi)$$1).c());
      } else if ($$1 instanceof jm) {
         return a($$0, ((jm)$$1).b());
      } else if ($$1 instanceof bwa) {
         return a($$0, ((bwa)$$1).b());
      } else if ($$1 instanceof bsb) {
         btj $$3 = ((bsb)$$1).d();
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

   private static void a(arg $$0, aan $$1) {
      zk<?> $$2 = new zr($$1);

      for (arh $$3 : $$0.x()) {
         $$3.c.b($$2);
      }
   }
}
