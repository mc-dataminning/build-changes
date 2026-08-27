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

public class afw {
   private static final Logger a = LogUtils.getLogger();

   public static void a(aqh $$0, in $$1, String $$2, int $$3, int $$4) {
      a($$0, (aac)(new aag($$1, $$3, $$2, $$4)));
   }

   public static void a(aqh $$0) {
      a($$0, (aac)(new aah()));
   }

   public static void a(aqh $$0, czk $$1) {
   }

   public static void a(aqh $$0, in $$1) {
      d($$0, $$1);
   }

   public static void b(aqh $$0, in $$1) {
      d($$0, $$1);
   }

   public static void c(aqh $$0, in $$1) {
      d($$0, $$1);
   }

   private static void d(aqh $$0, in $$1) {
   }

   public static void a(dad $$0, bsc $$1, @Nullable emo $$2, float $$3) {
   }

   public static void a(dad $$0, in $$1) {
   }

   public static void a(day $$0, egx $$1) {
   }

   public static void a(dad $$0, bsc $$1, byy $$2) {
   }

   public static void a(aqh $$0, Collection<cms> $$1) {
   }

   public static void a(bsa $$0) {
   }

   public static void a(cdq $$0) {
   }

   public static void a(cjj $$0) {
   }

   public static void a(dad $$0, iw<dva> $$1, etp $$2) {
   }

   public static void a(dad $$0, dvc $$1) {
   }

   public static void a(dad $$0, in $$1, dqh $$2, dnj $$3) {
   }

   private static List<String> a(bsa $$0, long $$1) {
      Map<cbd<?>, Optional<? extends cbc<?>>> $$2 = $$0.dQ().b();
      List<String> $$3 = Lists.newArrayList();

      for (Entry<cbd<?>, Optional<? extends cbc<?>>> $$4 : $$2.entrySet()) {
         cbd<?> $$5 = $$4.getKey();
         Optional<? extends cbc<?>> $$6 = $$4.getValue();
         String $$10;
         if ($$6.isPresent()) {
            cbc<?> $$7 = (cbc<?>)$$6.get();
            Object $$8 = $$7.c();
            if ($$5 == cbd.D) {
               long $$9 = $$1 - (Long)$$8;
               $$10 = $$9 + " ticks ago";
            } else if ($$7.e()) {
               $$10 = a((aqh)$$0.dN(), $$8) + " (ttl: " + $$7.b() + ")";
            } else {
               $$10 = a((aqh)$$0.dN(), $$8);
            }
         } else {
            $$10 = "-";
         }

         $$3.add(ld.B.b($$5).a() + ": " + $$10);
      }

      $$3.sort(String::compareTo);
      return $$3;
   }

   private static String a(aqh $$0, @Nullable Object $$1) {
      if ($$1 == null) {
         return "-";
      } else if ($$1 instanceof UUID) {
         return a($$0, $$0.a((UUID)$$1));
      } else if ($$1 instanceof bsa) {
         brh $$2 = (brh)$$1;
         return afv.a($$2);
      } else if ($$1 instanceof bpr) {
         return ((bpr)$$1).ad().getString();
      } else if ($$1 instanceof cbg) {
         return a($$0, ((cbg)$$1).a());
      } else if ($$1 instanceof bud) {
         return a($$0, ((bud)$$1).c());
      } else if ($$1 instanceof iv) {
         return a($$0, ((iv)$$1).b());
      } else if ($$1 instanceof btv) {
         return a($$0, ((btv)$$1).b());
      } else if ($$1 instanceof bqf) {
         brh $$3 = ((bqf)$$1).d();
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

   private static void a(aqh $$0, aac $$1) {
      zb<?> $$2 = new zi($$1);

      for (aqi $$3 : $$0.x()) {
         $$3.d.b($$2);
      }
   }
}
