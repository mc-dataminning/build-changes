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

public class agn {
   private static final Logger a = LogUtils.getLogger();

   public static void a(arh $$0, je $$1, String $$2, int $$3, int $$4) {
      a($$0, (aan)(new aar($$1, $$3, $$2, $$4)));
   }

   public static void a(arh $$0) {
      a($$0, (aan)(new aas()));
   }

   public static void a(arh $$0, ddm $$1) {
   }

   public static void a(arh $$0, je $$1) {
      d($$0, $$1);
   }

   public static void b(arh $$0, je $$1) {
      d($$0, $$1);
   }

   public static void c(arh $$0, je $$1) {
      d($$0, $$1);
   }

   private static void d(arh $$0, je $$1) {
   }

   public static void a(deg $$0, bum $$1, @Nullable erd $$2, float $$3) {
   }

   public static void a(deg $$0, je $$1) {
   }

   public static void a(deg $$0, abb $$1) {
      if ($$0 instanceof arh $$2) {
         a($$2, (aan)$$1);
      }
   }

   public static void a(dfd $$0, elk $$1) {
   }

   public static void a(deg $$0, bum $$1, cbi $$2) {
   }

   public static void a(arh $$0, Collection<cpi> $$1) {
   }

   public static void a(buk $$0) {
   }

   public static void a(cgb $$0) {
   }

   public static void a(clw $$0) {
   }

   public static void a(deg $$0, jn<dzl> $$1, eys $$2) {
   }

   public static void a(deg $$0, dzn $$1) {
   }

   public static void a(deg $$0, je $$1, duo $$2, drp $$3) {
   }

   private static List<String> a(buk $$0, long $$1) {
      Map<cdn<?>, Optional<? extends cdm<?>>> $$2 = $$0.dX().b();
      List<String> $$3 = Lists.newArrayList();

      for (Entry<cdn<?>, Optional<? extends cdm<?>>> $$4 : $$2.entrySet()) {
         cdn<?> $$5 = $$4.getKey();
         Optional<? extends cdm<?>> $$6 = $$4.getValue();
         String $$10;
         if ($$6.isPresent()) {
            cdm<?> $$7 = (cdm<?>)$$6.get();
            Object $$8 = $$7.c();
            if ($$5 == cdn.D) {
               long $$9 = $$1 - (Long)$$8;
               $$10 = $$9 + " ticks ago";
            } else if ($$7.e()) {
               $$10 = a((arh)$$0.dS(), $$8) + " (ttl: " + $$7.b() + ")";
            } else {
               $$10 = a((arh)$$0.dS(), $$8);
            }
         } else {
            $$10 = "-";
         }

         $$3.add(lu.z.b($$5).a() + ": " + $$10);
      }

      $$3.sort(String::compareTo);
      return $$3;
   }

   private static String a(arh $$0, @Nullable Object $$1) {
      if ($$1 == null) {
         return "-";
      } else if ($$1 instanceof UUID) {
         return a($$0, $$0.a((UUID)$$1));
      } else if ($$1 instanceof buk) {
         bto $$2 = (bto)$$1;
         return agm.a($$2);
      } else if ($$1 instanceof brs) {
         return ((brs)$$1).aj().getString();
      } else if ($$1 instanceof cdq) {
         return a($$0, ((cdq)$$1).a());
      } else if ($$1 instanceof bwn) {
         return a($$0, ((bwn)$$1).c());
      } else if ($$1 instanceof jm) {
         return a($$0, ((jm)$$1).b());
      } else if ($$1 instanceof bwf) {
         return a($$0, ((bwf)$$1).b());
      } else if ($$1 instanceof bsg) {
         bto $$3 = ((bsg)$$1).d();
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

   private static void a(arh $$0, aan $$1) {
      zk<?> $$2 = new zr($$1);

      for (ari $$3 : $$0.x()) {
         $$3.c.b($$2);
      }
   }
}
