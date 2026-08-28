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

public class agx {
   private static final Logger a = LogUtils.getLogger();

   public static void a(asb $$0, iw $$1, String $$2, int $$3, int $$4) {
      a($$0, (aat)(new aax($$1, $$3, $$2, $$4)));
   }

   public static void a(asb $$0) {
      a($$0, (aat)(new aay()));
   }

   public static void a(asb $$0, djo $$1) {
   }

   public static void a(asb $$0, iw $$1) {
      d($$0, $$1);
   }

   public static void b(asb $$0, iw $$1) {
      d($$0, $$1);
   }

   public static void c(asb $$0, iw $$1) {
      d($$0, $$1);
   }

   private static void d(asb $$0, iw $$1) {
   }

   public static void a(dkj $$0, byh $$1, @Nullable eyo $$2, float $$3) {
   }

   public static void a(dkj $$0, iw $$1) {
   }

   public static void a(dkj $$0, abh $$1) {
      if ($$0 instanceof asb $$2) {
         a($$2, (aat)$$1);
      }
   }

   public static void a(dli $$0, esv $$1) {
   }

   public static void a(dkj $$0, byh $$1, cfc $$2) {
   }

   public static void a(asb $$0, Collection<cty> $$1) {
   }

   public static void a(byf $$0) {
   }

   public static void a(cjw $$0) {
   }

   public static void a(cqg $$0) {
   }

   public static void a(dkj $$0, jg<egq> $$1, fgc $$2) {
   }

   public static void a(dkj $$0, egs $$1) {
   }

   public static void a(dkj $$0, iw $$1, ebq $$2, dyl $$3) {
   }

   private static List<String> a(byf $$0, long $$1) {
      Map<chh<?>, Optional<? extends chg<?>>> $$2 = $$0.ec().b();
      List<String> $$3 = Lists.newArrayList();

      for (Entry<chh<?>, Optional<? extends chg<?>>> $$4 : $$2.entrySet()) {
         chh<?> $$5 = $$4.getKey();
         Optional<? extends chg<?>> $$6 = $$4.getValue();
         String $$10;
         if ($$6.isPresent()) {
            chg<?> $$7 = (chg<?>)$$6.get();
            Object $$8 = $$7.c();
            if ($$5 == chh.E) {
               long $$9 = $$1 - (Long)$$8;
               $$10 = $$9 + " ticks ago";
            } else if ($$7.e()) {
               $$10 = a((asb)$$0.dV(), $$8) + " (ttl: " + $$7.b() + ")";
            } else {
               $$10 = a((asb)$$0.dV(), $$8);
            }
         } else {
            $$10 = "-";
         }

         $$3.add(mh.z.b($$5).a() + ": " + $$10);
      }

      $$3.sort(String::compareTo);
      return $$3;
   }

   private static String a(asb $$0, @Nullable Object $$1) {
      if ($$1 == null) {
         return "-";
      } else if ($$1 instanceof UUID) {
         return a($$0, $$0.b((UUID)$$1));
      } else if ($$1 instanceof byf) {
         bxe $$2 = (bxe)$$1;
         return agw.a($$2);
      } else if ($$1 instanceof bvf) {
         return ((bvf)$$1).ah().getString();
      } else if ($$1 instanceof chk) {
         return a($$0, ((chk)$$1).a());
      } else if ($$1 instanceof cah) {
         return a($$0, ((cah)$$1).c());
      } else if ($$1 instanceof jf) {
         return a($$0, ((jf)$$1).b());
      } else if ($$1 instanceof bzz) {
         return a($$0, ((bzz)$$1).b());
      } else if ($$1 instanceof bvt) {
         bxe $$3 = ((bvt)$$1).d();
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

   private static void a(asb $$0, aat $$1) {
      zo<?> $$2 = new zx($$1);

      for (asc $$3 : $$0.z()) {
         $$3.f.b($$2);
      }
   }
}
