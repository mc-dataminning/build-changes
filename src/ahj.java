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

public class ahj {
   private static final Logger a = LogUtils.getLogger();

   public static void a(ash $$0, jh $$1, String $$2, int $$3, int $$4) {
      a($$0, (abf)(new abj($$1, $$3, $$2, $$4)));
   }

   public static void a(ash $$0) {
      a($$0, (abf)(new abk()));
   }

   public static void a(ash $$0, dgo $$1) {
   }

   public static void a(ash $$0, jh $$1) {
      d($$0, $$1);
   }

   public static void b(ash $$0, jh $$1) {
      d($$0, $$1);
   }

   public static void c(ash $$0, jh $$1) {
      d($$0, $$1);
   }

   private static void d(ash $$0, jh $$1) {
   }

   public static void a(dhi $$0, bwi $$1, @Nullable eul $$2, float $$3) {
   }

   public static void a(dhi $$0, jh $$1) {
   }

   public static void a(dhi $$0, abt $$1) {
      if ($$0 instanceof ash $$2) {
         a($$2, (abf)$$1);
      }
   }

   public static void a(dig $$0, eos $$1) {
   }

   public static void a(dhi $$0, bwi $$1, cdf $$2) {
   }

   public static void a(ash $$0, Collection<crk> $$1) {
   }

   public static void a(bwg $$0) {
   }

   public static void a(chy $$0) {
   }

   public static void a(cnt $$0) {
   }

   public static void a(dhi $$0, jq<ecr> $$1, fby $$2) {
   }

   public static void a(dhi $$0, ect $$1) {
   }

   public static void a(dhi $$0, jh $$1, dxv $$2, duu $$3) {
   }

   private static List<String> a(bwg $$0, long $$1) {
      Map<cfk<?>, Optional<? extends cfj<?>>> $$2 = $$0.ec().b();
      List<String> $$3 = Lists.newArrayList();

      for (Entry<cfk<?>, Optional<? extends cfj<?>>> $$4 : $$2.entrySet()) {
         cfk<?> $$5 = $$4.getKey();
         Optional<? extends cfj<?>> $$6 = $$4.getValue();
         String $$10;
         if ($$6.isPresent()) {
            cfj<?> $$7 = (cfj<?>)$$6.get();
            Object $$8 = $$7.c();
            if ($$5 == cfk.D) {
               long $$9 = $$1 - (Long)$$8;
               $$10 = $$9 + " ticks ago";
            } else if ($$7.e()) {
               $$10 = a((ash)$$0.dW(), $$8) + " (ttl: " + $$7.b() + ")";
            } else {
               $$10 = a((ash)$$0.dW(), $$8);
            }
         } else {
            $$10 = "-";
         }

         $$3.add(ma.z.b($$5).a() + ": " + $$10);
      }

      $$3.sort(String::compareTo);
      return $$3;
   }

   private static String a(ash $$0, @Nullable Object $$1) {
      if ($$1 == null) {
         return "-";
      } else if ($$1 instanceof UUID) {
         return a($$0, $$0.a((UUID)$$1));
      } else if ($$1 instanceof bwg) {
         bvk $$2 = (bvk)$$1;
         return ahi.a($$2);
      } else if ($$1 instanceof btm) {
         return ((btm)$$1).al().getString();
      } else if ($$1 instanceof cfn) {
         return a($$0, ((cfn)$$1).a());
      } else if ($$1 instanceof byk) {
         return a($$0, ((byk)$$1).c());
      } else if ($$1 instanceof jp) {
         return a($$0, ((jp)$$1).b());
      } else if ($$1 instanceof byc) {
         return a($$0, ((byc)$$1).b());
      } else if ($$1 instanceof bua) {
         bvk $$3 = ((bua)$$1).d();
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

   private static void a(ash $$0, abf $$1) {
      aac<?> $$2 = new aaj($$1);

      for (asi $$3 : $$0.y()) {
         $$3.f.b($$2);
      }
   }
}
