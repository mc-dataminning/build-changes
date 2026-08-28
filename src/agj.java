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

public class agj {
   private static final Logger a = LogUtils.getLogger();

   public static void a(arn $$0, jj $$1, String $$2, int $$3, int $$4) {
      a($$0, (aaf)(new aaj($$1, $$3, $$2, $$4)));
   }

   public static void a(arn $$0) {
      a($$0, (aaf)(new aak()));
   }

   public static void a(arn $$0, dgw $$1) {
   }

   public static void a(arn $$0, jj $$1) {
      d($$0, $$1);
   }

   public static void b(arn $$0, jj $$1) {
      d($$0, $$1);
   }

   public static void c(arn $$0, jj $$1) {
      d($$0, $$1);
   }

   private static void d(arn $$0, jj $$1) {
   }

   public static void a(dhp $$0, bwt $$1, @Nullable evh $$2, float $$3) {
   }

   public static void a(dhp $$0, jj $$1) {
   }

   public static void a(dhp $$0, aat $$1) {
      if ($$0 instanceof arn $$2) {
         a($$2, (aaf)$$1);
      }
   }

   public static void a(dio $$0, epo $$1) {
   }

   public static void a(dhp $$0, bwt $$1, cdo $$2) {
   }

   public static void a(arn $$0, Collection<crv> $$1) {
   }

   public static void a(bwr $$0) {
   }

   public static void a(cih $$0) {
   }

   public static void a(cof $$0) {
   }

   public static void a(dhp $$0, js<edm> $$1, fcu $$2) {
   }

   public static void a(dhp $$0, edo $$1) {
   }

   public static void a(dhp $$0, jj $$1, dym $$2, dvi $$3) {
   }

   private static List<String> a(bwr $$0, long $$1) {
      Map<cft<?>, Optional<? extends cfs<?>>> $$2 = $$0.eb().b();
      List<String> $$3 = Lists.newArrayList();

      for (Entry<cft<?>, Optional<? extends cfs<?>>> $$4 : $$2.entrySet()) {
         cft<?> $$5 = $$4.getKey();
         Optional<? extends cfs<?>> $$6 = $$4.getValue();
         String $$10;
         if ($$6.isPresent()) {
            cfs<?> $$7 = (cfs<?>)$$6.get();
            Object $$8 = $$7.c();
            if ($$5 == cft.E) {
               long $$9 = $$1 - (Long)$$8;
               $$10 = $$9 + " ticks ago";
            } else if ($$7.e()) {
               $$10 = a((arn)$$0.dV(), $$8) + " (ttl: " + $$7.b() + ")";
            } else {
               $$10 = a((arn)$$0.dV(), $$8);
            }
         } else {
            $$10 = "-";
         }

         $$3.add(md.z.b($$5).a() + ": " + $$10);
      }

      $$3.sort(String::compareTo);
      return $$3;
   }

   private static String a(arn $$0, @Nullable Object $$1) {
      if ($$1 == null) {
         return "-";
      } else if ($$1 instanceof UUID) {
         return a($$0, $$0.b((UUID)$$1));
      } else if ($$1 instanceof bwr) {
         bvs $$2 = (bvs)$$1;
         return agi.a($$2);
      } else if ($$1 instanceof btt) {
         return ((btt)$$1).al().getString();
      } else if ($$1 instanceof cfw) {
         return a($$0, ((cfw)$$1).a());
      } else if ($$1 instanceof byt) {
         return a($$0, ((byt)$$1).c());
      } else if ($$1 instanceof jr) {
         return a($$0, ((jr)$$1).b());
      } else if ($$1 instanceof byl) {
         return a($$0, ((byl)$$1).b());
      } else if ($$1 instanceof buh) {
         bvs $$3 = ((buh)$$1).d();
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

   private static void a(arn $$0, aaf $$1) {
      zc<?> $$2 = new zj($$1);

      for (aro $$3 : $$0.z()) {
         $$3.f.b($$2);
      }
   }
}
