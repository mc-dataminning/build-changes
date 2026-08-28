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

public class ago {
   private static final Logger a = LogUtils.getLogger();

   public static void a(ars $$0, iv $$1, String $$2, int $$3, int $$4) {
      a($$0, (aak)(new aao($$1, $$3, $$2, $$4)));
   }

   public static void a(ars $$0) {
      a($$0, (aak)(new aap()));
   }

   public static void a(ars $$0, djc $$1) {
   }

   public static void a(ars $$0, iv $$1) {
      d($$0, $$1);
   }

   public static void b(ars $$0, iv $$1) {
      d($$0, $$1);
   }

   public static void c(ars $$0, iv $$1) {
      d($$0, $$1);
   }

   private static void d(ars $$0, iv $$1) {
   }

   public static void a(djx $$0, bxw $$1, @Nullable eyc $$2, float $$3) {
   }

   public static void a(djx $$0, iv $$1) {
   }

   public static void a(djx $$0, aay $$1) {
      if ($$0 instanceof ars $$2) {
         a($$2, (aak)$$1);
      }
   }

   public static void a(dkw $$0, esj $$1) {
   }

   public static void a(djx $$0, bxw $$1, cer $$2) {
   }

   public static void a(ars $$0, Collection<ctn> $$1) {
   }

   public static void a(bxu $$0) {
   }

   public static void a(cjl $$0) {
   }

   public static void a(cpv $$0) {
   }

   public static void a(djx $$0, jf<ege> $$1, ffq $$2) {
   }

   public static void a(djx $$0, egg $$1) {
   }

   public static void a(djx $$0, iv $$1, ebe $$2, dxz $$3) {
   }

   private static List<String> a(bxu $$0, long $$1) {
      Map<cgw<?>, Optional<? extends cgv<?>>> $$2 = $$0.ec().b();
      List<String> $$3 = Lists.newArrayList();

      for (Entry<cgw<?>, Optional<? extends cgv<?>>> $$4 : $$2.entrySet()) {
         cgw<?> $$5 = $$4.getKey();
         Optional<? extends cgv<?>> $$6 = $$4.getValue();
         String $$10;
         if ($$6.isPresent()) {
            cgv<?> $$7 = (cgv<?>)$$6.get();
            Object $$8 = $$7.c();
            if ($$5 == cgw.E) {
               long $$9 = $$1 - (Long)$$8;
               $$10 = $$9 + " ticks ago";
            } else if ($$7.e()) {
               $$10 = a((ars)$$0.dV(), $$8) + " (ttl: " + $$7.b() + ")";
            } else {
               $$10 = a((ars)$$0.dV(), $$8);
            }
         } else {
            $$10 = "-";
         }

         $$3.add(mg.z.b($$5).a() + ": " + $$10);
      }

      $$3.sort(String::compareTo);
      return $$3;
   }

   private static String a(ars $$0, @Nullable Object $$1) {
      if ($$1 == null) {
         return "-";
      } else if ($$1 instanceof UUID) {
         return a($$0, $$0.b((UUID)$$1));
      } else if ($$1 instanceof bxu) {
         bwt $$2 = (bwt)$$1;
         return agn.a($$2);
      } else if ($$1 instanceof buu) {
         return ((buu)$$1).ai().getString();
      } else if ($$1 instanceof cgz) {
         return a($$0, ((cgz)$$1).a());
      } else if ($$1 instanceof bzw) {
         return a($$0, ((bzw)$$1).c());
      } else if ($$1 instanceof je) {
         return a($$0, ((je)$$1).b());
      } else if ($$1 instanceof bzo) {
         return a($$0, ((bzo)$$1).b());
      } else if ($$1 instanceof bvi) {
         bwt $$3 = ((bvi)$$1).d();
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

   private static void a(ars $$0, aak $$1) {
      zh<?> $$2 = new zo($$1);

      for (art $$3 : $$0.z()) {
         $$3.f.b($$2);
      }
   }
}
