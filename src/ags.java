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

   public static void a(arn $$0, jh $$1, String $$2, int $$3, int $$4) {
      a($$0, (aas)(new aaw($$1, $$3, $$2, $$4)));
   }

   public static void a(arn $$0) {
      a($$0, (aas)(new aax()));
   }

   public static void a(arn $$0, deh $$1) {
   }

   public static void a(arn $$0, jh $$1) {
      d($$0, $$1);
   }

   public static void b(arn $$0, jh $$1) {
      d($$0, $$1);
   }

   public static void c(arn $$0, jh $$1) {
      d($$0, $$1);
   }

   private static void d(arn $$0, jh $$1) {
   }

   public static void a(dfb $$0, bvc $$1, @Nullable ery $$2, float $$3) {
   }

   public static void a(dfb $$0, jh $$1) {
   }

   public static void a(dfb $$0, abg $$1) {
      if ($$0 instanceof arn $$2) {
         a($$2, (aas)$$1);
      }
   }

   public static void a(dfy $$0, emf $$1) {
   }

   public static void a(dfb $$0, bvc $$1, cbz $$2) {
   }

   public static void a(arn $$0, Collection<cqa> $$1) {
   }

   public static void a(bva $$0) {
   }

   public static void a(cgs $$0) {
   }

   public static void a(cmn $$0) {
   }

   public static void a(dfb $$0, jq<eag> $$1, ezn $$2) {
   }

   public static void a(dfb $$0, eai $$1) {
   }

   public static void a(dfb $$0, jh $$1, dvj $$2, dsj $$3) {
   }

   private static List<String> a(bva $$0, long $$1) {
      Map<cee<?>, Optional<? extends ced<?>>> $$2 = $$0.ed().b();
      List<String> $$3 = Lists.newArrayList();

      for (Entry<cee<?>, Optional<? extends ced<?>>> $$4 : $$2.entrySet()) {
         cee<?> $$5 = $$4.getKey();
         Optional<? extends ced<?>> $$6 = $$4.getValue();
         String $$10;
         if ($$6.isPresent()) {
            ced<?> $$7 = (ced<?>)$$6.get();
            Object $$8 = $$7.c();
            if ($$5 == cee.D) {
               long $$9 = $$1 - (Long)$$8;
               $$10 = $$9 + " ticks ago";
            } else if ($$7.e()) {
               $$10 = a((arn)$$0.dX(), $$8) + " (ttl: " + $$7.b() + ")";
            } else {
               $$10 = a((arn)$$0.dX(), $$8);
            }
         } else {
            $$10 = "-";
         }

         $$3.add(ly.z.b($$5).a() + ": " + $$10);
      }

      $$3.sort(String::compareTo);
      return $$3;
   }

   private static String a(arn $$0, @Nullable Object $$1) {
      if ($$1 == null) {
         return "-";
      } else if ($$1 instanceof UUID) {
         return a($$0, $$0.a((UUID)$$1));
      } else if ($$1 instanceof bva) {
         bue $$2 = (bue)$$1;
         return agr.a($$2);
      } else if ($$1 instanceof bsg) {
         return ((bsg)$$1).am().getString();
      } else if ($$1 instanceof ceh) {
         return a($$0, ((ceh)$$1).a());
      } else if ($$1 instanceof bxe) {
         return a($$0, ((bxe)$$1).c());
      } else if ($$1 instanceof jp) {
         return a($$0, ((jp)$$1).b());
      } else if ($$1 instanceof bww) {
         return a($$0, ((bww)$$1).b());
      } else if ($$1 instanceof bsu) {
         bue $$3 = ((bsu)$$1).d();
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

   private static void a(arn $$0, aas $$1) {
      zp<?> $$2 = new zw($$1);

      for (aro $$3 : $$0.x()) {
         $$3.g.b($$2);
      }
   }
}
