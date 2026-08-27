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

public class aco {
   private static final Logger a = LogUtils.getLogger();

   public static void a(ami $$0, hx $$1, String $$2, int $$3, int $$4) {
      a($$0, (xh)(new xl($$1, $$3, $$2, $$4)));
   }

   public static void a(ami $$0) {
      a($$0, (xh)(new xm()));
   }

   public static void a(ami $$0, crm $$1) {
   }

   public static void a(ami $$0, hx $$1) {
      d($$0, $$1);
   }

   public static void b(ami $$0, hx $$1) {
      d($$0, $$1);
   }

   public static void c(ami $$0, hx $$1) {
      d($$0, $$1);
   }

   private static void d(ami $$0, hx $$1) {
   }

   public static void a(csf $$0, bln $$1, @Nullable edm $$2, float $$3) {
   }

   public static void a(csf $$0, hx $$1) {
   }

   public static void a(csz $$0, dxu $$1) {
   }

   public static void a(csf $$0, bln $$1, bsh $$2) {
   }

   public static void a(ami $$0, Collection<cfg> $$1) {
   }

   public static void a(bll $$0) {
   }

   public static void a(bwx $$0) {
   }

   public static void a(csf $$0, dlx $$1, ejz $$2) {
   }

   public static void a(csf $$0, dlz $$1) {
   }

   public static void a(csf $$0, hx $$1, dhn $$2, dff $$3) {
   }

   private static List<String> a(bll $$0, long $$1) {
      Map<bum<?>, Optional<? extends bul<?>>> $$2 = $$0.dP().b();
      List<String> $$3 = Lists.newArrayList();

      for (Entry<bum<?>, Optional<? extends bul<?>>> $$4 : $$2.entrySet()) {
         bum<?> $$5 = $$4.getKey();
         Optional<? extends bul<?>> $$6 = $$4.getValue();
         String $$10;
         if ($$6.isPresent()) {
            bul<?> $$7 = (bul<?>)$$6.get();
            Object $$8 = $$7.c();
            if ($$5 == bum.D) {
               long $$9 = $$1 - (Long)$$8;
               $$10 = $$9 + " ticks ago";
            } else if ($$7.e()) {
               $$10 = a((ami)$$0.dN(), $$8) + " (ttl: " + $$7.b() + ")";
            } else {
               $$10 = a((ami)$$0.dN(), $$8);
            }
         } else {
            $$10 = "-";
         }

         $$3.add(kc.C.b($$5).a() + ": " + $$10);
      }

      $$3.sort(String::compareTo);
      return $$3;
   }

   private static String a(ami $$0, @Nullable Object $$1) {
      if ($$1 == null) {
         return "-";
      } else if ($$1 instanceof UUID) {
         return a($$0, $$0.a((UUID)$$1));
      } else if ($$1 instanceof bll) {
         bkv $$2 = (bkv)$$1;
         return acn.a($$2);
      } else if ($$1 instanceof bjf) {
         return ((bjf)$$1).ad().getString();
      } else if ($$1 instanceof bup) {
         return a($$0, ((bup)$$1).a());
      } else if ($$1 instanceof bnn) {
         return a($$0, ((bnn)$$1).c());
      } else if ($$1 instanceof ie) {
         return a($$0, ((ie)$$1).b());
      } else if ($$1 instanceof bnf) {
         return a($$0, ((bnf)$$1).b());
      } else if ($$1 instanceof bjt) {
         bkv $$3 = ((bjt)$$1).d();
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

   private static void a(ami $$0, xh $$1) {
      wo<?> $$2 = new ws($$1);

      for (amj $$3 : $$0.w()) {
         $$3.c.b($$2);
      }
   }
}
