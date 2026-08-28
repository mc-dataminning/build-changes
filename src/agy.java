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

public class agy {
   private static final Logger a = LogUtils.getLogger();

   public static void a(arx $$0, jh $$1, String $$2, int $$3, int $$4) {
      a($$0, (aau)(new aay($$1, $$3, $$2, $$4)));
   }

   public static void a(arx $$0) {
      a($$0, (aau)(new aaz()));
   }

   public static void a(arx $$0, dgf $$1) {
   }

   public static void a(arx $$0, jh $$1) {
      d($$0, $$1);
   }

   public static void b(arx $$0, jh $$1) {
      d($$0, $$1);
   }

   public static void c(arx $$0, jh $$1) {
      d($$0, $$1);
   }

   private static void d(arx $$0, jh $$1) {
   }

   public static void a(dgz $$0, bvz $$1, @Nullable eue $$2, float $$3) {
   }

   public static void a(dgz $$0, jh $$1) {
   }

   public static void a(dgz $$0, abi $$1) {
      if ($$0 instanceof arx $$2) {
         a($$2, (aau)$$1);
      }
   }

   public static void a(dhx $$0, eol $$1) {
   }

   public static void a(dgz $$0, bvz $$1, ccw $$2) {
   }

   public static void a(arx $$0, Collection<crb> $$1) {
   }

   public static void a(bvx $$0) {
   }

   public static void a(chp $$0) {
   }

   public static void a(cnk $$0) {
   }

   public static void a(dgz $$0, jq<eck> $$1, fbr $$2) {
   }

   public static void a(dgz $$0, ecm $$1) {
   }

   public static void a(dgz $$0, jh $$1, dxo $$2, dun $$3) {
   }

   private static List<String> a(bvx $$0, long $$1) {
      Map<cfb<?>, Optional<? extends cfa<?>>> $$2 = $$0.ec().b();
      List<String> $$3 = Lists.newArrayList();

      for (Entry<cfb<?>, Optional<? extends cfa<?>>> $$4 : $$2.entrySet()) {
         cfb<?> $$5 = $$4.getKey();
         Optional<? extends cfa<?>> $$6 = $$4.getValue();
         String $$10;
         if ($$6.isPresent()) {
            cfa<?> $$7 = (cfa<?>)$$6.get();
            Object $$8 = $$7.c();
            if ($$5 == cfb.D) {
               long $$9 = $$1 - (Long)$$8;
               $$10 = $$9 + " ticks ago";
            } else if ($$7.e()) {
               $$10 = a((arx)$$0.dW(), $$8) + " (ttl: " + $$7.b() + ")";
            } else {
               $$10 = a((arx)$$0.dW(), $$8);
            }
         } else {
            $$10 = "-";
         }

         $$3.add(ma.z.b($$5).a() + ": " + $$10);
      }

      $$3.sort(String::compareTo);
      return $$3;
   }

   private static String a(arx $$0, @Nullable Object $$1) {
      if ($$1 == null) {
         return "-";
      } else if ($$1 instanceof UUID) {
         return a($$0, $$0.a((UUID)$$1));
      } else if ($$1 instanceof bvx) {
         bvb $$2 = (bvb)$$1;
         return agx.a($$2);
      } else if ($$1 instanceof btd) {
         return ((btd)$$1).al().getString();
      } else if ($$1 instanceof cfe) {
         return a($$0, ((cfe)$$1).a());
      } else if ($$1 instanceof byb) {
         return a($$0, ((byb)$$1).c());
      } else if ($$1 instanceof jp) {
         return a($$0, ((jp)$$1).b());
      } else if ($$1 instanceof bxt) {
         return a($$0, ((bxt)$$1).b());
      } else if ($$1 instanceof btr) {
         bvb $$3 = ((btr)$$1).d();
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

   private static void a(arx $$0, aau $$1) {
      zr<?> $$2 = new zy($$1);

      for (ary $$3 : $$0.z()) {
         $$3.f.b($$2);
      }
   }
}
