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

public class ags {
   private static final Logger a = LogUtils.getLogger();

   public static void a(are $$0, iz $$1, String $$2, int $$3, int $$4) {
      a($$0, (aaw)(new aba($$1, $$3, $$2, $$4)));
   }

   public static void a(are $$0) {
      a($$0, (aaw)(new abb()));
   }

   public static void a(are $$0, dbd $$1) {
   }

   public static void a(are $$0, iz $$1) {
      d($$0, $$1);
   }

   public static void b(are $$0, iz $$1) {
      d($$0, $$1);
   }

   public static void c(are $$0, iz $$1) {
      d($$0, $$1);
   }

   private static void d(are $$0, iz $$1) {
   }

   public static void a(dbw $$0, btp $$1, @Nullable eoh $$2, float $$3) {
   }

   public static void a(dbw $$0, iz $$1) {
   }

   public static void a(dcr $$0, eiq $$1) {
   }

   public static void a(dbw $$0, btp $$1, cam $$2) {
   }

   public static void a(are $$0, Collection<cog> $$1) {
   }

   public static void a(btn $$0) {
   }

   public static void a(cfe $$0) {
   }

   public static void a(ckx $$0) {
   }

   public static void a(dbw $$0, ji<dwt> $$1, evp $$2) {
   }

   public static void a(dbw $$0, dwv $$1) {
   }

   public static void a(dbw $$0, iz $$1, dsa $$2, dpc $$3) {
   }

   private static List<String> a(btn $$0, long $$1) {
      Map<ccr<?>, Optional<? extends ccq<?>>> $$2 = $$0.dS().b();
      List<String> $$3 = Lists.newArrayList();

      for (Entry<ccr<?>, Optional<? extends ccq<?>>> $$4 : $$2.entrySet()) {
         ccr<?> $$5 = $$4.getKey();
         Optional<? extends ccq<?>> $$6 = $$4.getValue();
         String $$10;
         if ($$6.isPresent()) {
            ccq<?> $$7 = (ccq<?>)$$6.get();
            Object $$8 = $$7.c();
            if ($$5 == ccr.D) {
               long $$9 = $$1 - (Long)$$8;
               $$10 = $$9 + " ticks ago";
            } else if ($$7.e()) {
               $$10 = a((are)$$0.dP(), $$8) + " (ttl: " + $$7.b() + ")";
            } else {
               $$10 = a((are)$$0.dP(), $$8);
            }
         } else {
            $$10 = "-";
         }

         $$3.add(lp.B.b($$5).a() + ": " + $$10);
      }

      $$3.sort(String::compareTo);
      return $$3;
   }

   private static String a(are $$0, @Nullable Object $$1) {
      if ($$1 == null) {
         return "-";
      } else if ($$1 instanceof UUID) {
         return a($$0, $$0.a((UUID)$$1));
      } else if ($$1 instanceof btn) {
         bss $$2 = (bss)$$1;
         return agr.a($$2);
      } else if ($$1 instanceof bqx) {
         return ((bqx)$$1).af().getString();
      } else if ($$1 instanceof ccu) {
         return a($$0, ((ccu)$$1).a());
      } else if ($$1 instanceof bvr) {
         return a($$0, ((bvr)$$1).c());
      } else if ($$1 instanceof jh) {
         return a($$0, ((jh)$$1).b());
      } else if ($$1 instanceof bvj) {
         return a($$0, ((bvj)$$1).b());
      } else if ($$1 instanceof brl) {
         bss $$3 = ((brl)$$1).d();
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

   private static void a(are $$0, aaw $$1) {
      zv<?> $$2 = new aac($$1);

      for (arf $$3 : $$0.x()) {
         $$3.c.b($$2);
      }
   }
}
