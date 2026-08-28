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

   public static void a(ash $$0, dgn $$1) {
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

   public static void a(dhh $$0, bwh $$1, @Nullable euk $$2, float $$3) {
   }

   public static void a(dhh $$0, jh $$1) {
   }

   public static void a(dhh $$0, abt $$1) {
      if ($$0 instanceof ash $$2) {
         a($$2, (abf)$$1);
      }
   }

   public static void a(dif $$0, eor $$1) {
   }

   public static void a(dhh $$0, bwh $$1, cde $$2) {
   }

   public static void a(ash $$0, Collection<crj> $$1) {
   }

   public static void a(bwf $$0) {
   }

   public static void a(chx $$0) {
   }

   public static void a(cns $$0) {
   }

   public static void a(dhh $$0, jq<ecq> $$1, fbx $$2) {
   }

   public static void a(dhh $$0, ecs $$1) {
   }

   public static void a(dhh $$0, jh $$1, dxu $$2, dut $$3) {
   }

   private static List<String> a(bwf $$0, long $$1) {
      Map<cfj<?>, Optional<? extends cfi<?>>> $$2 = $$0.ec().b();
      List<String> $$3 = Lists.newArrayList();

      for (Entry<cfj<?>, Optional<? extends cfi<?>>> $$4 : $$2.entrySet()) {
         cfj<?> $$5 = $$4.getKey();
         Optional<? extends cfi<?>> $$6 = $$4.getValue();
         String $$10;
         if ($$6.isPresent()) {
            cfi<?> $$7 = (cfi<?>)$$6.get();
            Object $$8 = $$7.c();
            if ($$5 == cfj.D) {
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
      } else if ($$1 instanceof bwf) {
         bvj $$2 = (bvj)$$1;
         return ahi.a($$2);
      } else if ($$1 instanceof btl) {
         return ((btl)$$1).al().getString();
      } else if ($$1 instanceof cfm) {
         return a($$0, ((cfm)$$1).a());
      } else if ($$1 instanceof byj) {
         return a($$0, ((byj)$$1).c());
      } else if ($$1 instanceof jp) {
         return a($$0, ((jp)$$1).b());
      } else if ($$1 instanceof byb) {
         return a($$0, ((byb)$$1).b());
      } else if ($$1 instanceof btz) {
         bvj $$3 = ((btz)$$1).d();
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
