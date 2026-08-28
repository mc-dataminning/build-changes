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

public class agt {
   private static final Logger a = LogUtils.getLogger();

   public static void a(arf $$0, iz $$1, String $$2, int $$3, int $$4) {
      a($$0, (aax)(new abb($$1, $$3, $$2, $$4)));
   }

   public static void a(arf $$0) {
      a($$0, (aax)(new abc()));
   }

   public static void a(arf $$0, dbf $$1) {
   }

   public static void a(arf $$0, iz $$1) {
      d($$0, $$1);
   }

   public static void b(arf $$0, iz $$1) {
      d($$0, $$1);
   }

   public static void c(arf $$0, iz $$1) {
      d($$0, $$1);
   }

   private static void d(arf $$0, iz $$1) {
   }

   public static void a(dby $$0, btr $$1, @Nullable eoj $$2, float $$3) {
   }

   public static void a(dby $$0, iz $$1) {
   }

   public static void a(dct $$0, eis $$1) {
   }

   public static void a(dby $$0, btr $$1, cao $$2) {
   }

   public static void a(arf $$0, Collection<coi> $$1) {
   }

   public static void a(btp $$0) {
   }

   public static void a(cfg $$0) {
   }

   public static void a(ckz $$0) {
   }

   public static void a(dby $$0, ji<dwv> $$1, evr $$2) {
   }

   public static void a(dby $$0, dwx $$1) {
   }

   public static void a(dby $$0, iz $$1, dsc $$2, dpe $$3) {
   }

   private static List<String> a(btp $$0, long $$1) {
      Map<cct<?>, Optional<? extends ccs<?>>> $$2 = $$0.dS().b();
      List<String> $$3 = Lists.newArrayList();

      for (Entry<cct<?>, Optional<? extends ccs<?>>> $$4 : $$2.entrySet()) {
         cct<?> $$5 = $$4.getKey();
         Optional<? extends ccs<?>> $$6 = $$4.getValue();
         String $$10;
         if ($$6.isPresent()) {
            ccs<?> $$7 = (ccs<?>)$$6.get();
            Object $$8 = $$7.c();
            if ($$5 == cct.D) {
               long $$9 = $$1 - (Long)$$8;
               $$10 = $$9 + " ticks ago";
            } else if ($$7.e()) {
               $$10 = a((arf)$$0.dP(), $$8) + " (ttl: " + $$7.b() + ")";
            } else {
               $$10 = a((arf)$$0.dP(), $$8);
            }
         } else {
            $$10 = "-";
         }

         $$3.add(lp.B.b($$5).a() + ": " + $$10);
      }

      $$3.sort(String::compareTo);
      return $$3;
   }

   private static String a(arf $$0, @Nullable Object $$1) {
      if ($$1 == null) {
         return "-";
      } else if ($$1 instanceof UUID) {
         return a($$0, $$0.a((UUID)$$1));
      } else if ($$1 instanceof btp) {
         bsu $$2 = (bsu)$$1;
         return ags.a($$2);
      } else if ($$1 instanceof bqz) {
         return ((bqz)$$1).af().getString();
      } else if ($$1 instanceof ccw) {
         return a($$0, ((ccw)$$1).a());
      } else if ($$1 instanceof bvt) {
         return a($$0, ((bvt)$$1).c());
      } else if ($$1 instanceof jh) {
         return a($$0, ((jh)$$1).b());
      } else if ($$1 instanceof bvl) {
         return a($$0, ((bvl)$$1).b());
      } else if ($$1 instanceof brn) {
         bsu $$3 = ((brn)$$1).d();
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

   private static void a(arf $$0, aax $$1) {
      zw<?> $$2 = new aad($$1);

      for (arg $$3 : $$0.x()) {
         $$3.c.b($$2);
      }
   }
}
