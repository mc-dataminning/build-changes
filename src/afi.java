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

public class afi {
   private static final Logger a = LogUtils.getLogger();

   public static void a(aps $$0, ib $$1, String $$2, int $$3, int $$4) {
      a($$0, (zo)(new zs($$1, $$3, $$2, $$4)));
   }

   public static void a(aps $$0) {
      a($$0, (zo)(new zt()));
   }

   public static void a(aps $$0, cye $$1) {
   }

   public static void a(aps $$0, ib $$1) {
      d($$0, $$1);
   }

   public static void b(aps $$0, ib $$1) {
      d($$0, $$1);
   }

   public static void c(aps $$0, ib $$1) {
      d($$0, $$1);
   }

   private static void d(aps $$0, ib $$1) {
   }

   public static void a(cyx $$0, bqq $$1, @Nullable elg $$2, float $$3) {
   }

   public static void a(cyx $$0, ib $$1) {
   }

   public static void a(czs $$0, efp $$1) {
   }

   public static void a(cyx $$0, bqq $$1, bxm $$2) {
   }

   public static void a(aps $$0, Collection<cle> $$1) {
   }

   public static void a(bqo $$0) {
   }

   public static void a(cce $$0) {
   }

   public static void a(chv $$0) {
   }

   public static void a(cyx $$0, il<dts> $$1, esa $$2) {
   }

   public static void a(cyx $$0, dtu $$1) {
   }

   public static void a(cyx $$0, ib $$1, doz $$2, dmc $$3) {
   }

   private static List<String> a(bqo $$0, long $$1) {
      Map<bzr<?>, Optional<? extends bzq<?>>> $$2 = $$0.dP().b();
      List<String> $$3 = Lists.newArrayList();

      for (Entry<bzr<?>, Optional<? extends bzq<?>>> $$4 : $$2.entrySet()) {
         bzr<?> $$5 = $$4.getKey();
         Optional<? extends bzq<?>> $$6 = $$4.getValue();
         String $$10;
         if ($$6.isPresent()) {
            bzq<?> $$7 = (bzq<?>)$$6.get();
            Object $$8 = $$7.c();
            if ($$5 == bzr.D) {
               long $$9 = $$1 - (Long)$$8;
               $$10 = $$9 + " ticks ago";
            } else if ($$7.e()) {
               $$10 = a((aps)$$0.dM(), $$8) + " (ttl: " + $$7.b() + ")";
            } else {
               $$10 = a((aps)$$0.dM(), $$8);
            }
         } else {
            $$10 = "-";
         }

         $$3.add(kr.B.b($$5).a() + ": " + $$10);
      }

      $$3.sort(String::compareTo);
      return $$3;
   }

   private static String a(aps $$0, @Nullable Object $$1) {
      if ($$1 == null) {
         return "-";
      } else if ($$1 instanceof UUID) {
         return a($$0, $$0.a((UUID)$$1));
      } else if ($$1 instanceof bqo) {
         bpv $$2 = (bpv)$$1;
         return afh.a($$2);
      } else if ($$1 instanceof bof) {
         return ((bof)$$1).ad().getString();
      } else if ($$1 instanceof bzu) {
         return a($$0, ((bzu)$$1).a());
      } else if ($$1 instanceof bsr) {
         return a($$0, ((bsr)$$1).c());
      } else if ($$1 instanceof ik) {
         return a($$0, ((ik)$$1).b());
      } else if ($$1 instanceof bsj) {
         return a($$0, ((bsj)$$1).b());
      } else if ($$1 instanceof bot) {
         bpv $$3 = ((bot)$$1).d();
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

   private static void a(aps $$0, zo $$1) {
      yn<?> $$2 = new yu($$1);

      for (apt $$3 : $$0.x()) {
         $$3.d.b($$2);
      }
   }
}
