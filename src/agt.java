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

   public static void a(arf $$0, dbg $$1) {
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

   public static void a(dbz $$0, bts $$1, @Nullable eok $$2, float $$3) {
   }

   public static void a(dbz $$0, iz $$1) {
   }

   public static void a(dcu $$0, eit $$1) {
   }

   public static void a(dbz $$0, bts $$1, cap $$2) {
   }

   public static void a(arf $$0, Collection<coj> $$1) {
   }

   public static void a(btq $$0) {
   }

   public static void a(cfh $$0) {
   }

   public static void a(cla $$0) {
   }

   public static void a(dbz $$0, ji<dww> $$1, evs $$2) {
   }

   public static void a(dbz $$0, dwy $$1) {
   }

   public static void a(dbz $$0, iz $$1, dsd $$2, dpf $$3) {
   }

   private static List<String> a(btq $$0, long $$1) {
      Map<ccu<?>, Optional<? extends cct<?>>> $$2 = $$0.dS().b();
      List<String> $$3 = Lists.newArrayList();

      for (Entry<ccu<?>, Optional<? extends cct<?>>> $$4 : $$2.entrySet()) {
         ccu<?> $$5 = $$4.getKey();
         Optional<? extends cct<?>> $$6 = $$4.getValue();
         String $$10;
         if ($$6.isPresent()) {
            cct<?> $$7 = (cct<?>)$$6.get();
            Object $$8 = $$7.c();
            if ($$5 == ccu.D) {
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
      } else if ($$1 instanceof btq) {
         bsv $$2 = (bsv)$$1;
         return ags.a($$2);
      } else if ($$1 instanceof bra) {
         return ((bra)$$1).af().getString();
      } else if ($$1 instanceof ccx) {
         return a($$0, ((ccx)$$1).a());
      } else if ($$1 instanceof bvu) {
         return a($$0, ((bvu)$$1).c());
      } else if ($$1 instanceof jh) {
         return a($$0, ((jh)$$1).b());
      } else if ($$1 instanceof bvm) {
         return a($$0, ((bvm)$$1).b());
      } else if ($$1 instanceof bro) {
         bsv $$3 = ((bro)$$1).d();
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
