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

public class agm {
   private static final Logger a = LogUtils.getLogger();

   public static void a(arq $$0, iv $$1, String $$2, int $$3, int $$4) {
      a($$0, (aai)(new aam($$1, $$3, $$2, $$4)));
   }

   public static void a(arq $$0) {
      a($$0, (aai)(new aan()));
   }

   public static void a(arq $$0, dio $$1) {
   }

   public static void a(arq $$0, iv $$1) {
      d($$0, $$1);
   }

   public static void b(arq $$0, iv $$1) {
      d($$0, $$1);
   }

   public static void c(arq $$0, iv $$1) {
      d($$0, $$1);
   }

   private static void d(arq $$0, iv $$1) {
   }

   public static void a(djh $$0, bxl $$1, @Nullable exj $$2, float $$3) {
   }

   public static void a(djh $$0, iv $$1) {
   }

   public static void a(djh $$0, aaw $$1) {
      if ($$0 instanceof arq $$2) {
         a($$2, (aai)$$1);
      }
   }

   public static void a(dkg $$0, erq $$1) {
   }

   public static void a(djh $$0, bxl $$1, ceg $$2) {
   }

   public static void a(arq $$0, Collection<csz> $$1) {
   }

   public static void a(bxj $$0) {
   }

   public static void a(cja $$0) {
   }

   public static void a(cph $$0) {
   }

   public static void a(djh $$0, jf<efo> $$1, fex $$2) {
   }

   public static void a(djh $$0, efq $$1) {
   }

   public static void a(djh $$0, iv $$1, eao $$2, dxj $$3) {
   }

   private static List<String> a(bxj $$0, long $$1) {
      Map<cgl<?>, Optional<? extends cgk<?>>> $$2 = $$0.eb().b();
      List<String> $$3 = Lists.newArrayList();

      for (Entry<cgl<?>, Optional<? extends cgk<?>>> $$4 : $$2.entrySet()) {
         cgl<?> $$5 = $$4.getKey();
         Optional<? extends cgk<?>> $$6 = $$4.getValue();
         String $$10;
         if ($$6.isPresent()) {
            cgk<?> $$7 = (cgk<?>)$$6.get();
            Object $$8 = $$7.c();
            if ($$5 == cgl.E) {
               long $$9 = $$1 - (Long)$$8;
               $$10 = $$9 + " ticks ago";
            } else if ($$7.e()) {
               $$10 = a((arq)$$0.dU(), $$8) + " (ttl: " + $$7.b() + ")";
            } else {
               $$10 = a((arq)$$0.dU(), $$8);
            }
         } else {
            $$10 = "-";
         }

         $$3.add(mg.z.b($$5).a() + ": " + $$10);
      }

      $$3.sort(String::compareTo);
      return $$3;
   }

   private static String a(arq $$0, @Nullable Object $$1) {
      if ($$1 == null) {
         return "-";
      } else if ($$1 instanceof UUID) {
         return a($$0, $$0.b((UUID)$$1));
      } else if ($$1 instanceof bxj) {
         bwi $$2 = (bwi)$$1;
         return agl.a($$2);
      } else if ($$1 instanceof buj) {
         return ((buj)$$1).ai().getString();
      } else if ($$1 instanceof cgo) {
         return a($$0, ((cgo)$$1).a());
      } else if ($$1 instanceof bzl) {
         return a($$0, ((bzl)$$1).c());
      } else if ($$1 instanceof je) {
         return a($$0, ((je)$$1).b());
      } else if ($$1 instanceof bzd) {
         return a($$0, ((bzd)$$1).b());
      } else if ($$1 instanceof bux) {
         bwi $$3 = ((bux)$$1).d();
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

   private static void a(arq $$0, aai $$1) {
      zf<?> $$2 = new zm($$1);

      for (arr $$3 : $$0.z()) {
         $$3.f.b($$2);
      }
   }
}
