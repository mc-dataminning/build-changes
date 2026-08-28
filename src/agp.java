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

public class agp {
   private static final Logger a = LogUtils.getLogger();

   public static void a(arb $$0, iz $$1, String $$2, int $$3, int $$4) {
      a($$0, (aat)(new aax($$1, $$3, $$2, $$4)));
   }

   public static void a(arb $$0) {
      a($$0, (aat)(new aay()));
   }

   public static void a(arb $$0, dba $$1) {
   }

   public static void a(arb $$0, iz $$1) {
      d($$0, $$1);
   }

   public static void b(arb $$0, iz $$1) {
      d($$0, $$1);
   }

   public static void c(arb $$0, iz $$1) {
      d($$0, $$1);
   }

   private static void d(arb $$0, iz $$1) {
   }

   public static void a(dbt $$0, btm $$1, @Nullable eoe $$2, float $$3) {
   }

   public static void a(dbt $$0, iz $$1) {
   }

   public static void a(dco $$0, ein $$1) {
   }

   public static void a(dbt $$0, btm $$1, caj $$2) {
   }

   public static void a(arb $$0, Collection<cod> $$1) {
   }

   public static void a(btk $$0) {
   }

   public static void a(cfb $$0) {
   }

   public static void a(cku $$0) {
   }

   public static void a(dbt $$0, ji<dwq> $$1, evm $$2) {
   }

   public static void a(dbt $$0, dws $$1) {
   }

   public static void a(dbt $$0, iz $$1, drx $$2, doz $$3) {
   }

   private static List<String> a(btk $$0, long $$1) {
      Map<cco<?>, Optional<? extends ccn<?>>> $$2 = $$0.dS().b();
      List<String> $$3 = Lists.newArrayList();

      for (Entry<cco<?>, Optional<? extends ccn<?>>> $$4 : $$2.entrySet()) {
         cco<?> $$5 = $$4.getKey();
         Optional<? extends ccn<?>> $$6 = $$4.getValue();
         String $$10;
         if ($$6.isPresent()) {
            ccn<?> $$7 = (ccn<?>)$$6.get();
            Object $$8 = $$7.c();
            if ($$5 == cco.D) {
               long $$9 = $$1 - (Long)$$8;
               $$10 = $$9 + " ticks ago";
            } else if ($$7.e()) {
               $$10 = a((arb)$$0.dP(), $$8) + " (ttl: " + $$7.b() + ")";
            } else {
               $$10 = a((arb)$$0.dP(), $$8);
            }
         } else {
            $$10 = "-";
         }

         $$3.add(lp.B.b($$5).a() + ": " + $$10);
      }

      $$3.sort(String::compareTo);
      return $$3;
   }

   private static String a(arb $$0, @Nullable Object $$1) {
      if ($$1 == null) {
         return "-";
      } else if ($$1 instanceof UUID) {
         return a($$0, $$0.a((UUID)$$1));
      } else if ($$1 instanceof btk) {
         bsp $$2 = (bsp)$$1;
         return ago.a($$2);
      } else if ($$1 instanceof bqu) {
         return ((bqu)$$1).af().getString();
      } else if ($$1 instanceof ccr) {
         return a($$0, ((ccr)$$1).a());
      } else if ($$1 instanceof bvo) {
         return a($$0, ((bvo)$$1).c());
      } else if ($$1 instanceof jh) {
         return a($$0, ((jh)$$1).b());
      } else if ($$1 instanceof bvg) {
         return a($$0, ((bvg)$$1).b());
      } else if ($$1 instanceof bri) {
         bsp $$3 = ((bri)$$1).d();
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

   private static void a(arb $$0, aat $$1) {
      zs<?> $$2 = new zz($$1);

      for (arc $$3 : $$0.x()) {
         $$3.c.b($$2);
      }
   }
}
