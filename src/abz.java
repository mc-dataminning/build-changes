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

public class abz {
   private static final Logger a = LogUtils.getLogger();

   public static void a(alq $$0, ht $$1, String $$2, int $$3, int $$4) {
      a($$0, (wu)(new wy($$1, $$3, $$2, $$4)));
   }

   public static void a(alq $$0) {
      a($$0, (wu)(new wz()));
   }

   public static void a(alq $$0, cqg $$1) {
   }

   public static void a(alq $$0, ht $$1) {
      d($$0, $$1);
   }

   public static void b(alq $$0, ht $$1) {
      d($$0, $$1);
   }

   public static void c(alq $$0, ht $$1) {
      d($$0, $$1);
   }

   private static void d(alq $$0, ht $$1) {
   }

   public static void a(cqz $$0, bkl $$1, @Nullable ebt $$2, float $$3) {
   }

   public static void a(cqz $$0, ht $$1) {
   }

   public static void a(crt $$0, dwi $$1) {
   }

   public static void a(cqz $$0, bkl $$1, brf $$2) {
   }

   public static void a(alq $$0, Collection<cee> $$1) {
   }

   public static void a(bkj $$0) {
   }

   public static void a(bvv $$0) {
   }

   public static void a(cqz $$0, dkl $$1, eif $$2) {
   }

   public static void a(cqz $$0, dkn $$1) {
   }

   public static void a(cqz $$0, ht $$1, dgb $$2, ddu $$3) {
   }

   private static List<String> a(bkj $$0, long $$1) {
      Map<btk<?>, Optional<? extends btj<?>>> $$2 = $$0.dN().b();
      List<String> $$3 = Lists.newArrayList();

      for (Entry<btk<?>, Optional<? extends btj<?>>> $$4 : $$2.entrySet()) {
         btk<?> $$5 = $$4.getKey();
         Optional<? extends btj<?>> $$6 = $$4.getValue();
         String $$10;
         if ($$6.isPresent()) {
            btj<?> $$7 = (btj<?>)$$6.get();
            Object $$8 = $$7.c();
            if ($$5 == btk.D) {
               long $$9 = $$1 - (Long)$$8;
               $$10 = $$9 + " ticks ago";
            } else if ($$7.e()) {
               $$10 = a((alq)$$0.dL(), $$8) + " (ttl: " + $$7.b() + ")";
            } else {
               $$10 = a((alq)$$0.dL(), $$8);
            }
         } else {
            $$10 = "-";
         }

         $$3.add(jy.C.b($$5).a() + ": " + $$10);
      }

      $$3.sort(String::compareTo);
      return $$3;
   }

   private static String a(alq $$0, @Nullable Object $$1) {
      if ($$1 == null) {
         return "-";
      } else if ($$1 instanceof UUID) {
         return a($$0, $$0.a((UUID)$$1));
      } else if ($$1 instanceof bkj) {
         bjt $$2 = (bjt)$$1;
         return aby.a($$2);
      } else if ($$1 instanceof bif) {
         return ((bif)$$1).ab().getString();
      } else if ($$1 instanceof btn) {
         return a($$0, ((btn)$$1).a());
      } else if ($$1 instanceof bml) {
         return a($$0, ((bml)$$1).c());
      } else if ($$1 instanceof ia) {
         return a($$0, ((ia)$$1).b());
      } else if ($$1 instanceof bmd) {
         return a($$0, ((bmd)$$1).b());
      } else if ($$1 instanceof bir) {
         bjt $$3 = ((bir)$$1).d();
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

   private static void a(alq $$0, wu $$1) {
      wb<?> $$2 = new wf($$1);

      for (alr $$3 : $$0.v()) {
         $$3.c.b($$2);
      }
   }
}
