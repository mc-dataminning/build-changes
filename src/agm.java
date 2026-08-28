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

public class agm {
   private static final Logger a = LogUtils.getLogger();

   public static void a(arq $$0, iu $$1, String $$2, int $$3, int $$4) {
      a($$0, (aai)(new aam($$1, $$3, $$2, $$4)));
   }

   public static void a(arq $$0) {
      a($$0, (aai)(new aan()));
   }

   public static void a(arq $$0, dih $$1) {
   }

   public static void a(arq $$0, iu $$1) {
      d($$0, $$1);
   }

   public static void b(arq $$0, iu $$1) {
      d($$0, $$1);
   }

   public static void c(arq $$0, iu $$1) {
      d($$0, $$1);
   }

   private static void d(arq $$0, iu $$1) {
   }

   public static void a(dja $$0, bxg $$1, @Nullable exc $$2, float $$3) {
   }

   public static void a(dja $$0, iu $$1) {
   }

   public static void a(dja $$0, aaw $$1) {
      if ($$0 instanceof arq $$2) {
         a($$2, (aai)$$1);
      }
   }

   public static void a(djz $$0, erj $$1) {
   }

   public static void a(dja $$0, bxg $$1, ceb $$2) {
   }

   public static void a(arq $$0, Collection<css> $$1) {
   }

   public static void a(bxe $$0) {
   }

   public static void a(civ $$0) {
   }

   public static void a(cpa $$0) {
   }

   public static void a(dja $$0, je<efh> $$1, feq $$2) {
   }

   public static void a(dja $$0, efj $$1) {
   }

   public static void a(dja $$0, iu $$1, eah $$2, dxc $$3) {
   }

   private static List<String> a(bxe $$0, long $$1) {
      Map<cgg<?>, Optional<? extends cgf<?>>> $$2 = $$0.ec().b();
      List<String> $$3 = Lists.newArrayList();

      for (Entry<cgg<?>, Optional<? extends cgf<?>>> $$4 : $$2.entrySet()) {
         cgg<?> $$5 = $$4.getKey();
         Optional<? extends cgf<?>> $$6 = $$4.getValue();
         String $$10;
         if ($$6.isPresent()) {
            cgf<?> $$7 = (cgf<?>)$$6.get();
            Object $$8 = $$7.c();
            if ($$5 == cgg.E) {
               long $$9 = $$1 - (Long)$$8;
               $$10 = $$9 + " ticks ago";
            } else if ($$7.e()) {
               $$10 = a((arq)$$0.dV(), $$8) + " (ttl: " + $$7.b() + ")";
            } else {
               $$10 = a((arq)$$0.dV(), $$8);
            }
         } else {
            $$10 = "-";
         }

         $$3.add(mf.z.b($$5).a() + ": " + $$10);
      }

      $$3.sort(String::compareTo);
      return $$3;
   }

   private static String a(arq $$0, @Nullable Object $$1) {
      if ($$1 == null) {
         return "-";
      } else if ($$1 instanceof UUID) {
         return a($$0, $$0.b((UUID)$$1));
      } else if ($$1 instanceof bxe) {
         bwf $$2 = (bwf)$$1;
         return agl.a($$2);
      } else if ($$1 instanceof bug) {
         return ((bug)$$1).al().getString();
      } else if ($$1 instanceof cgj) {
         return a($$0, ((cgj)$$1).a());
      } else if ($$1 instanceof bzg) {
         return a($$0, ((bzg)$$1).c());
      } else if ($$1 instanceof jd) {
         return a($$0, ((jd)$$1).b());
      } else if ($$1 instanceof byy) {
         return a($$0, ((byy)$$1).b());
      } else if ($$1 instanceof buu) {
         bwf $$3 = ((buu)$$1).d();
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

   private static void a(arq $$0, aai $$1) {
      zf<?> $$2 = new zm($$1);

      for (arr $$3 : $$0.z()) {
         $$3.f.b($$2);
      }
   }
}
