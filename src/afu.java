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

public class afu {
   private static final Logger a = LogUtils.getLogger();

   public static void a(aqe $$0, im $$1, String $$2, int $$3, int $$4) {
      a($$0, (aaa)(new aae($$1, $$3, $$2, $$4)));
   }

   public static void a(aqe $$0) {
      a($$0, (aaa)(new aaf()));
   }

   public static void a(aqe $$0, czb $$1) {
   }

   public static void a(aqe $$0, im $$1) {
      d($$0, $$1);
   }

   public static void b(aqe $$0, im $$1) {
      d($$0, $$1);
   }

   public static void c(aqe $$0, im $$1) {
      d($$0, $$1);
   }

   private static void d(aqe $$0, im $$1) {
   }

   public static void a(czu $$0, brg $$1, @Nullable emf $$2, float $$3) {
   }

   public static void a(czu $$0, im $$1) {
   }

   public static void a(dap $$0, ego $$1) {
   }

   public static void a(czu $$0, brg $$1, byc $$2) {
   }

   public static void a(aqe $$0, Collection<clw> $$1) {
   }

   public static void a(bre $$0) {
   }

   public static void a(ccu $$0) {
   }

   public static void a(cin $$0) {
   }

   public static void a(czu $$0, iv<dur> $$1, etf $$2) {
   }

   public static void a(czu $$0, dut $$1) {
   }

   public static void a(czu $$0, im $$1, dpy $$2, dna $$3) {
   }

   private static List<String> a(bre $$0, long $$1) {
      Map<cah<?>, Optional<? extends cag<?>>> $$2 = $$0.dQ().b();
      List<String> $$3 = Lists.newArrayList();

      for (Entry<cah<?>, Optional<? extends cag<?>>> $$4 : $$2.entrySet()) {
         cah<?> $$5 = $$4.getKey();
         Optional<? extends cag<?>> $$6 = $$4.getValue();
         String $$10;
         if ($$6.isPresent()) {
            cag<?> $$7 = (cag<?>)$$6.get();
            Object $$8 = $$7.c();
            if ($$5 == cah.D) {
               long $$9 = $$1 - (Long)$$8;
               $$10 = $$9 + " ticks ago";
            } else if ($$7.e()) {
               $$10 = a((aqe)$$0.dN(), $$8) + " (ttl: " + $$7.b() + ")";
            } else {
               $$10 = a((aqe)$$0.dN(), $$8);
            }
         } else {
            $$10 = "-";
         }

         $$3.add(lc.B.b($$5).a() + ": " + $$10);
      }

      $$3.sort(String::compareTo);
      return $$3;
   }

   private static String a(aqe $$0, @Nullable Object $$1) {
      if ($$1 == null) {
         return "-";
      } else if ($$1 instanceof UUID) {
         return a($$0, $$0.a((UUID)$$1));
      } else if ($$1 instanceof bre) {
         bql $$2 = (bql)$$1;
         return aft.a($$2);
      } else if ($$1 instanceof bov) {
         return ((bov)$$1).ad().getString();
      } else if ($$1 instanceof cak) {
         return a($$0, ((cak)$$1).a());
      } else if ($$1 instanceof bth) {
         return a($$0, ((bth)$$1).c());
      } else if ($$1 instanceof iu) {
         return a($$0, ((iu)$$1).b());
      } else if ($$1 instanceof bsz) {
         return a($$0, ((bsz)$$1).b());
      } else if ($$1 instanceof bpj) {
         bql $$3 = ((bpj)$$1).d();
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

   private static void a(aqe $$0, aaa $$1) {
      yz<?> $$2 = new zg($$1);

      for (aqf $$3 : $$0.x()) {
         $$3.d.b($$2);
      }
   }
}
