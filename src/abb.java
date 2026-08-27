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

public class abb {
   private static final Logger a = LogUtils.getLogger();

   public static void a(akq $$0, gw $$1, String $$2, int $$3, int $$4) {
      a($$0, (vw)(new wa($$1, $$3, $$2, $$4)));
   }

   public static void a(akq $$0) {
      a($$0, (vw)(new wb()));
   }

   public static void a(akq $$0, cpc $$1) {
   }

   public static void a(akq $$0, gw $$1) {
      d($$0, $$1);
   }

   public static void b(akq $$0, gw $$1) {
      d($$0, $$1);
   }

   public static void c(akq $$0, gw $$1) {
      d($$0, $$1);
   }

   private static void d(akq $$0, gw $$1) {
   }

   public static void a(cpv $$0, bji $$1, @Nullable ebb $$2, float $$3) {
   }

   public static void a(cpv $$0, gw $$1) {
   }

   public static void a(cqp $$0, dvq $$1) {
   }

   public static void a(cpv $$0, bji $$1, bqc $$2) {
   }

   public static void a(akq $$0, Collection<cdb> $$1) {
   }

   public static void a(bjg $$0) {
   }

   public static void a(bus $$0) {
   }

   public static void a(cpv $$0, djt $$1, ehn $$2) {
   }

   public static void a(cpv $$0, djv $$1) {
   }

   public static void a(cpv $$0, gw $$1, dfj $$2, dcs $$3) {
   }

   private static List<String> a(bjg $$0, long $$1) {
      Map<bsh<?>, Optional<? extends bsg<?>>> $$2 = $$0.dN().b();
      List<String> $$3 = Lists.newArrayList();

      for (Entry<bsh<?>, Optional<? extends bsg<?>>> $$4 : $$2.entrySet()) {
         bsh<?> $$5 = $$4.getKey();
         Optional<? extends bsg<?>> $$6 = $$4.getValue();
         String $$10;
         if ($$6.isPresent()) {
            bsg<?> $$7 = (bsg<?>)$$6.get();
            Object $$8 = $$7.c();
            if ($$5 == bsh.D) {
               long $$9 = $$1 - (Long)$$8;
               $$10 = $$9 + " ticks ago";
            } else if ($$7.e()) {
               $$10 = a((akq)$$0.dL(), $$8) + " (ttl: " + $$7.b() + ")";
            } else {
               $$10 = a((akq)$$0.dL(), $$8);
            }
         } else {
            $$10 = "-";
         }

         $$3.add(jb.C.b($$5).a() + ": " + $$10);
      }

      $$3.sort(String::compareTo);
      return $$3;
   }

   private static String a(akq $$0, @Nullable Object $$1) {
      if ($$1 == null) {
         return "-";
      } else if ($$1 instanceof UUID) {
         return a($$0, $$0.a((UUID)$$1));
      } else if ($$1 instanceof bjg) {
         biq $$2 = (biq)$$1;
         return aba.a($$2);
      } else if ($$1 instanceof bhc) {
         return ((bhc)$$1).ab().getString();
      } else if ($$1 instanceof bsk) {
         return a($$0, ((bsk)$$1).a());
      } else if ($$1 instanceof bli) {
         return a($$0, ((bli)$$1).c());
      } else if ($$1 instanceof hd) {
         return a($$0, ((hd)$$1).b());
      } else if ($$1 instanceof bla) {
         return a($$0, ((bla)$$1).b());
      } else if ($$1 instanceof bho) {
         biq $$3 = ((bho)$$1).d();
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

   private static void a(akq $$0, vw $$1) {
      vd<?> $$2 = new vh($$1);

      for (akr $$3 : $$0.v()) {
         $$3.c.b($$2);
      }
   }
}
