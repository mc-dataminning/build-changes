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

   public static void a(arq $$0, dic $$1) {
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

   public static void a(div $$0, bxe $$1, @Nullable ewu $$2, float $$3) {
   }

   public static void a(div $$0, iu $$1) {
   }

   public static void a(div $$0, aaw $$1) {
      if ($$0 instanceof arq $$2) {
         a($$2, (aai)$$1);
      }
   }

   public static void a(dju $$0, erb $$1) {
   }

   public static void a(div $$0, bxe $$1, cdz $$2) {
   }

   public static void a(arq $$0, Collection<csn> $$1) {
   }

   public static void a(bxc $$0) {
   }

   public static void a(cit $$0) {
   }

   public static void a(cow $$0) {
   }

   public static void a(div $$0, je<eez> $$1, fei $$2) {
   }

   public static void a(div $$0, efb $$1) {
   }

   public static void a(div $$0, iu $$1, dzz $$2, dwu $$3) {
   }

   private static List<String> a(bxc $$0, long $$1) {
      Map<cge<?>, Optional<? extends cgd<?>>> $$2 = $$0.eb().b();
      List<String> $$3 = Lists.newArrayList();

      for (Entry<cge<?>, Optional<? extends cgd<?>>> $$4 : $$2.entrySet()) {
         cge<?> $$5 = $$4.getKey();
         Optional<? extends cgd<?>> $$6 = $$4.getValue();
         String $$10;
         if ($$6.isPresent()) {
            cgd<?> $$7 = (cgd<?>)$$6.get();
            Object $$8 = $$7.c();
            if ($$5 == cge.E) {
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
      } else if ($$1 instanceof bxc) {
         bwd $$2 = (bwd)$$1;
         return agl.a($$2);
      } else if ($$1 instanceof bue) {
         return ((bue)$$1).al().getString();
      } else if ($$1 instanceof cgh) {
         return a($$0, ((cgh)$$1).a());
      } else if ($$1 instanceof bze) {
         return a($$0, ((bze)$$1).c());
      } else if ($$1 instanceof jd) {
         return a($$0, ((jd)$$1).b());
      } else if ($$1 instanceof byw) {
         return a($$0, ((byw)$$1).b());
      } else if ($$1 instanceof bus) {
         bwd $$3 = ((bus)$$1).d();
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
