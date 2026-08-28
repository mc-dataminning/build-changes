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

public class agq {
   private static final Logger a = LogUtils.getLogger();

   public static void a(aru $$0, iw $$1, String $$2, int $$3, int $$4) {
      a($$0, (aam)(new aaq($$1, $$3, $$2, $$4)));
   }

   public static void a(aru $$0) {
      a($$0, (aam)(new aar()));
   }

   public static void a(aru $$0, dje $$1) {
   }

   public static void a(aru $$0, iw $$1) {
      d($$0, $$1);
   }

   public static void b(aru $$0, iw $$1) {
      d($$0, $$1);
   }

   public static void c(aru $$0, iw $$1) {
      d($$0, $$1);
   }

   private static void d(aru $$0, iw $$1) {
   }

   public static void a(djz $$0, bxy $$1, @Nullable eye $$2, float $$3) {
   }

   public static void a(djz $$0, iw $$1) {
   }

   public static void a(djz $$0, aba $$1) {
      if ($$0 instanceof aru $$2) {
         a($$2, (aam)$$1);
      }
   }

   public static void a(dky $$0, esl $$1) {
   }

   public static void a(djz $$0, bxy $$1, cet $$2) {
   }

   public static void a(aru $$0, Collection<ctp> $$1) {
   }

   public static void a(bxw $$0) {
   }

   public static void a(cjn $$0) {
   }

   public static void a(cpx $$0) {
   }

   public static void a(djz $$0, jg<egg> $$1, ffs $$2) {
   }

   public static void a(djz $$0, egi $$1) {
   }

   public static void a(djz $$0, iw $$1, ebg $$2, dyb $$3) {
   }

   private static List<String> a(bxw $$0, long $$1) {
      Map<cgy<?>, Optional<? extends cgx<?>>> $$2 = $$0.ec().b();
      List<String> $$3 = Lists.newArrayList();

      for (Entry<cgy<?>, Optional<? extends cgx<?>>> $$4 : $$2.entrySet()) {
         cgy<?> $$5 = $$4.getKey();
         Optional<? extends cgx<?>> $$6 = $$4.getValue();
         String $$10;
         if ($$6.isPresent()) {
            cgx<?> $$7 = (cgx<?>)$$6.get();
            Object $$8 = $$7.c();
            if ($$5 == cgy.E) {
               long $$9 = $$1 - (Long)$$8;
               $$10 = $$9 + " ticks ago";
            } else if ($$7.e()) {
               $$10 = a((aru)$$0.dV(), $$8) + " (ttl: " + $$7.b() + ")";
            } else {
               $$10 = a((aru)$$0.dV(), $$8);
            }
         } else {
            $$10 = "-";
         }

         $$3.add(mh.z.b($$5).a() + ": " + $$10);
      }

      $$3.sort(String::compareTo);
      return $$3;
   }

   private static String a(aru $$0, @Nullable Object $$1) {
      if ($$1 == null) {
         return "-";
      } else if ($$1 instanceof UUID) {
         return a($$0, $$0.b((UUID)$$1));
      } else if ($$1 instanceof bxw) {
         bwv $$2 = (bwv)$$1;
         return agp.a($$2);
      } else if ($$1 instanceof buw) {
         return ((buw)$$1).ai().getString();
      } else if ($$1 instanceof chb) {
         return a($$0, ((chb)$$1).a());
      } else if ($$1 instanceof bzy) {
         return a($$0, ((bzy)$$1).c());
      } else if ($$1 instanceof jf) {
         return a($$0, ((jf)$$1).b());
      } else if ($$1 instanceof bzq) {
         return a($$0, ((bzq)$$1).b());
      } else if ($$1 instanceof bvk) {
         bwv $$3 = ((bvk)$$1).d();
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

   private static void a(aru $$0, aam $$1) {
      zj<?> $$2 = new zq($$1);

      for (arv $$3 : $$0.z()) {
         $$3.f.b($$2);
      }
   }
}
