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

public class age {
   private static final Logger a = LogUtils.getLogger();

   public static void a(aqt $$0, jd $$1, String $$2, int $$3, int $$4) {
      a($$0, (aai)(new aam($$1, $$3, $$2, $$4)));
   }

   public static void a(aqt $$0) {
      a($$0, (aai)(new aan()));
   }

   public static void a(aqt $$0, dcb $$1) {
   }

   public static void a(aqt $$0, jd $$1) {
      d($$0, $$1);
   }

   public static void b(aqt $$0, jd $$1) {
      d($$0, $$1);
   }

   public static void c(aqt $$0, jd $$1) {
      d($$0, $$1);
   }

   private static void d(aqt $$0, jd $$1) {
   }

   public static void a(dcu $$0, btn $$1, @Nullable epm $$2, float $$3) {
   }

   public static void a(dcu $$0, jd $$1) {
   }

   public static void a(ddq $$0, eju $$1) {
   }

   public static void a(dcu $$0, btn $$1, cal $$2) {
   }

   public static void a(aqt $$0, Collection<cog> $$1) {
   }

   public static void a(btl $$0) {
   }

   public static void a(cfd $$0) {
   }

   public static void a(ckx $$0) {
   }

   public static void a(dcu $$0, jm<dxw> $$1, eww $$2) {
   }

   public static void a(dcu $$0, dxy $$1) {
   }

   public static void a(dcu $$0, jd $$1, dta $$2, dqc $$3) {
   }

   private static List<String> a(btl $$0, long $$1) {
      Map<ccq<?>, Optional<? extends ccp<?>>> $$2 = $$0.dU().b();
      List<String> $$3 = Lists.newArrayList();

      for (Entry<ccq<?>, Optional<? extends ccp<?>>> $$4 : $$2.entrySet()) {
         ccq<?> $$5 = $$4.getKey();
         Optional<? extends ccp<?>> $$6 = $$4.getValue();
         String $$10;
         if ($$6.isPresent()) {
            ccp<?> $$7 = (ccp<?>)$$6.get();
            Object $$8 = $$7.c();
            if ($$5 == ccq.D) {
               long $$9 = $$1 - (Long)$$8;
               $$10 = $$9 + " ticks ago";
            } else if ($$7.e()) {
               $$10 = a((aqt)$$0.dQ(), $$8) + " (ttl: " + $$7.b() + ")";
            } else {
               $$10 = a((aqt)$$0.dQ(), $$8);
            }
         } else {
            $$10 = "-";
         }

         $$3.add(lt.z.b($$5).a() + ": " + $$10);
      }

      $$3.sort(String::compareTo);
      return $$3;
   }

   private static String a(aqt $$0, @Nullable Object $$1) {
      if ($$1 == null) {
         return "-";
      } else if ($$1 instanceof UUID) {
         return a($$0, $$0.a((UUID)$$1));
      } else if ($$1 instanceof btl) {
         bsq $$2 = (bsq)$$1;
         return agd.a($$2);
      } else if ($$1 instanceof bqv) {
         return ((bqv)$$1).ah().getString();
      } else if ($$1 instanceof cct) {
         return a($$0, ((cct)$$1).a());
      } else if ($$1 instanceof bvq) {
         return a($$0, ((bvq)$$1).c());
      } else if ($$1 instanceof jl) {
         return a($$0, ((jl)$$1).b());
      } else if ($$1 instanceof bvi) {
         return a($$0, ((bvi)$$1).b());
      } else if ($$1 instanceof brj) {
         bsq $$3 = ((brj)$$1).d();
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

   private static void a(aqt $$0, aai $$1) {
      zf<?> $$2 = new zm($$1);

      for (aqu $$3 : $$0.x()) {
         $$3.c.b($$2);
      }
   }
}
