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

public class aau {
   private static final Logger a = LogUtils.getLogger();

   public static void a(aki $$0, gv $$1, String $$2, int $$3, int $$4) {
      a($$0, (vo)(new vs($$1, $$3, $$2, $$4)));
   }

   public static void a(aki $$0) {
      a($$0, (vo)(new vt()));
   }

   public static void a(aki $$0, cor $$1) {
   }

   public static void a(aki $$0, gv $$1) {
      d($$0, $$1);
   }

   public static void b(aki $$0, gv $$1) {
      d($$0, $$1);
   }

   public static void c(aki $$0, gv $$1) {
      d($$0, $$1);
   }

   private static void d(aki $$0, gv $$1) {
   }

   public static void a(cpk $$0, biy $$1, @Nullable eaq $$2, float $$3) {
   }

   public static void a(cpk $$0, gv $$1) {
   }

   public static void a(cqe $$0, dvf $$1) {
   }

   public static void a(cpk $$0, biy $$1, bpt $$2) {
   }

   public static void a(aki $$0, Collection<ccs> $$1) {
   }

   public static void a(biw $$0) {
   }

   public static void a(buj $$0) {
   }

   public static void a(cpk $$0, dji $$1, ehf $$2) {
   }

   public static void a(cpk $$0, djk $$1) {
   }

   public static void a(cpk $$0, gv $$1, dey $$2, dch $$3) {
   }

   private static List<String> a(biw $$0, long $$1) {
      Map<bry<?>, Optional<? extends brx<?>>> $$2 = $$0.dM().b();
      List<String> $$3 = Lists.newArrayList();

      for (Entry<bry<?>, Optional<? extends brx<?>>> $$4 : $$2.entrySet()) {
         bry<?> $$5 = $$4.getKey();
         Optional<? extends brx<?>> $$6 = $$4.getValue();
         String $$10;
         if ($$6.isPresent()) {
            brx<?> $$7 = (brx<?>)$$6.get();
            Object $$8 = $$7.c();
            if ($$5 == bry.D) {
               long $$9 = $$1 - (Long)$$8;
               $$10 = $$9 + " ticks ago";
            } else if ($$7.e()) {
               $$10 = a((aki)$$0.dK(), $$8) + " (ttl: " + $$7.b() + ")";
            } else {
               $$10 = a((aki)$$0.dK(), $$8);
            }
         } else {
            $$10 = "-";
         }

         $$3.add(jc.C.b($$5).a() + ": " + $$10);
      }

      $$3.sort(String::compareTo);
      return $$3;
   }

   private static String a(aki $$0, @Nullable Object $$1) {
      if ($$1 == null) {
         return "-";
      } else if ($$1 instanceof UUID) {
         return a($$0, $$0.a((UUID)$$1));
      } else if ($$1 instanceof biw) {
         big $$2 = (big)$$1;
         return aat.a($$2);
      } else if ($$1 instanceof bgs) {
         return ((bgs)$$1).ab().getString();
      } else if ($$1 instanceof bsb) {
         return a($$0, ((bsb)$$1).a());
      } else if ($$1 instanceof bkz) {
         return a($$0, ((bkz)$$1).c());
      } else if ($$1 instanceof he) {
         return a($$0, ((he)$$1).b());
      } else if ($$1 instanceof bkr) {
         return a($$0, ((bkr)$$1).b());
      } else if ($$1 instanceof bhe) {
         big $$3 = ((bhe)$$1).d();
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

   private static void a(aki $$0, vo $$1) {
      uw<?> $$2 = new va($$1);

      for (akj $$3 : $$0.v()) {
         $$3.c.b($$2);
      }
   }
}
