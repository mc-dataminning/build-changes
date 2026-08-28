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

public class agf {
   private static final Logger a = LogUtils.getLogger();

   public static void a(aqu $$0, jd $$1, String $$2, int $$3, int $$4) {
      a($$0, (aaj)(new aan($$1, $$3, $$2, $$4)));
   }

   public static void a(aqu $$0) {
      a($$0, (aaj)(new aao()));
   }

   public static void a(aqu $$0, dcd $$1) {
   }

   public static void a(aqu $$0, jd $$1) {
      d($$0, $$1);
   }

   public static void b(aqu $$0, jd $$1) {
      d($$0, $$1);
   }

   public static void c(aqu $$0, jd $$1) {
      d($$0, $$1);
   }

   private static void d(aqu $$0, jd $$1) {
   }

   public static void a(dcw $$0, btp $$1, @Nullable eps $$2, float $$3) {
   }

   public static void a(dcw $$0, jd $$1) {
   }

   public static void a(dds $$0, ejz $$1) {
   }

   public static void a(dcw $$0, btp $$1, can $$2) {
   }

   public static void a(aqu $$0, Collection<coi> $$1) {
   }

   public static void a(btn $$0) {
   }

   public static void a(cff $$0) {
   }

   public static void a(ckz $$0) {
   }

   public static void a(dcw $$0, jm<dxz> $$1, exc $$2) {
   }

   public static void a(dcw $$0, dyb $$1) {
   }

   public static void a(dcw $$0, jd $$1, dtc $$2, dqe $$3) {
   }

   private static List<String> a(btn $$0, long $$1) {
      Map<ccs<?>, Optional<? extends ccr<?>>> $$2 = $$0.dT().b();
      List<String> $$3 = Lists.newArrayList();

      for (Entry<ccs<?>, Optional<? extends ccr<?>>> $$4 : $$2.entrySet()) {
         ccs<?> $$5 = $$4.getKey();
         Optional<? extends ccr<?>> $$6 = $$4.getValue();
         String $$10;
         if ($$6.isPresent()) {
            ccr<?> $$7 = (ccr<?>)$$6.get();
            Object $$8 = $$7.c();
            if ($$5 == ccs.D) {
               long $$9 = $$1 - (Long)$$8;
               $$10 = $$9 + " ticks ago";
            } else if ($$7.e()) {
               $$10 = a((aqu)$$0.dO(), $$8) + " (ttl: " + $$7.b() + ")";
            } else {
               $$10 = a((aqu)$$0.dO(), $$8);
            }
         } else {
            $$10 = "-";
         }

         $$3.add(lt.z.b($$5).a() + ": " + $$10);
      }

      $$3.sort(String::compareTo);
      return $$3;
   }

   private static String a(aqu $$0, @Nullable Object $$1) {
      if ($$1 == null) {
         return "-";
      } else if ($$1 instanceof UUID) {
         return a($$0, $$0.a((UUID)$$1));
      } else if ($$1 instanceof btn) {
         bsr $$2 = (bsr)$$1;
         return age.a($$2);
      } else if ($$1 instanceof bqw) {
         return ((bqw)$$1).ah().getString();
      } else if ($$1 instanceof ccv) {
         return a($$0, ((ccv)$$1).a());
      } else if ($$1 instanceof bvs) {
         return a($$0, ((bvs)$$1).c());
      } else if ($$1 instanceof jl) {
         return a($$0, ((jl)$$1).b());
      } else if ($$1 instanceof bvk) {
         return a($$0, ((bvk)$$1).b());
      } else if ($$1 instanceof brk) {
         bsr $$3 = ((brk)$$1).d();
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

   private static void a(aqu $$0, aaj $$1) {
      zg<?> $$2 = new zn($$1);

      for (aqv $$3 : $$0.x()) {
         $$3.c.b($$2);
      }
   }
}
