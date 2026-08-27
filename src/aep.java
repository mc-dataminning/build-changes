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

public class aep {
   private static final Logger a = LogUtils.getLogger();

   public static void a(aov $$0, hz $$1, String $$2, int $$3, int $$4) {
      a($$0, (yy)(new zc($$1, $$3, $$2, $$4)));
   }

   public static void a(aov $$0) {
      a($$0, (yy)(new zd()));
   }

   public static void a(aov $$0, cuu $$1) {
   }

   public static void a(aov $$0, hz $$1) {
      d($$0, $$1);
   }

   public static void b(aov $$0, hz $$1) {
      d($$0, $$1);
   }

   public static void c(aov $$0, hz $$1) {
      d($$0, $$1);
   }

   private static void d(aov $$0, hz $$1) {
   }

   public static void a(cvn $$0, boi $$1, @Nullable ehe $$2, float $$3) {
   }

   public static void a(cvn $$0, hz $$1) {
   }

   public static void a(cwi $$0, ebm $$1) {
   }

   public static void a(cvn $$0, boi $$1, bvc $$2) {
   }

   public static void a(aov $$0, Collection<ciq> $$1) {
   }

   public static void a(bog $$0) {
   }

   public static void a(bzu $$0) {
   }

   public static void a(cfj $$0) {
   }

   public static void a(cvn $$0, ij<dpp> $$1, ens $$2) {
   }

   public static void a(cvn $$0, dpr $$1) {
   }

   public static void a(cvn $$0, hz $$1, dlf $$2, diq $$3) {
   }

   private static List<String> a(bog $$0, long $$1) {
      Map<bxh<?>, Optional<? extends bxg<?>>> $$2 = $$0.dO().b();
      List<String> $$3 = Lists.newArrayList();

      for (Entry<bxh<?>, Optional<? extends bxg<?>>> $$4 : $$2.entrySet()) {
         bxh<?> $$5 = $$4.getKey();
         Optional<? extends bxg<?>> $$6 = $$4.getValue();
         String $$10;
         if ($$6.isPresent()) {
            bxg<?> $$7 = (bxg<?>)$$6.get();
            Object $$8 = $$7.c();
            if ($$5 == bxh.D) {
               long $$9 = $$1 - (Long)$$8;
               $$10 = $$9 + " ticks ago";
            } else if ($$7.e()) {
               $$10 = a((aov)$$0.dM(), $$8) + " (ttl: " + $$7.b() + ")";
            } else {
               $$10 = a((aov)$$0.dM(), $$8);
            }
         } else {
            $$10 = "-";
         }

         $$3.add(kf.B.b($$5).a() + ": " + $$10);
      }

      $$3.sort(String::compareTo);
      return $$3;
   }

   private static String a(aov $$0, @Nullable Object $$1) {
      if ($$1 == null) {
         return "-";
      } else if ($$1 instanceof UUID) {
         return a($$0, $$0.a((UUID)$$1));
      } else if ($$1 instanceof bog) {
         bno $$2 = (bno)$$1;
         return aeo.a($$2);
      } else if ($$1 instanceof blz) {
         return ((blz)$$1).ad().getString();
      } else if ($$1 instanceof bxk) {
         return a($$0, ((bxk)$$1).a());
      } else if ($$1 instanceof bqh) {
         return a($$0, ((bqh)$$1).c());
      } else if ($$1 instanceof ii) {
         return a($$0, ((ii)$$1).b());
      } else if ($$1 instanceof bpz) {
         return a($$0, ((bpz)$$1).b());
      } else if ($$1 instanceof bmn) {
         bno $$3 = ((bmn)$$1).d();
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

   private static void a(aov $$0, yy $$1) {
      xx<?> $$2 = new ye($$1);

      for (aow $$3 : $$0.x()) {
         $$3.d.b($$2);
      }
   }
}
