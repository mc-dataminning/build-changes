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

public class aay {
   private static final Logger a = LogUtils.getLogger();

   public static void a(akn $$0, gw $$1, String $$2, int $$3, int $$4) {
      a($$0, (vs)(new vw($$1, $$3, $$2, $$4)));
   }

   public static void a(akn $$0) {
      a($$0, (vs)(new vx()));
   }

   public static void a(akn $$0, cox $$1) {
   }

   public static void a(akn $$0, gw $$1) {
      d($$0, $$1);
   }

   public static void b(akn $$0, gw $$1) {
      d($$0, $$1);
   }

   public static void c(akn $$0, gw $$1) {
      d($$0, $$1);
   }

   private static void d(akn $$0, gw $$1) {
   }

   public static void a(cpq $$0, bjd $$1, @Nullable eaw $$2, float $$3) {
   }

   public static void a(cpq $$0, gw $$1) {
   }

   public static void a(cqk $$0, dvl $$1) {
   }

   public static void a(cpq $$0, bjd $$1, bpx $$2) {
   }

   public static void a(akn $$0, Collection<ccw> $$1) {
   }

   public static void a(bjb $$0) {
   }

   public static void a(bun $$0) {
   }

   public static void a(cpq $$0, djo $$1, ehi $$2) {
   }

   public static void a(cpq $$0, djq $$1) {
   }

   public static void a(cpq $$0, gw $$1, dfe $$2, dcn $$3) {
   }

   private static List<String> a(bjb $$0, long $$1) {
      Map<bsc<?>, Optional<? extends bsb<?>>> $$2 = $$0.dM().b();
      List<String> $$3 = Lists.newArrayList();

      for (Entry<bsc<?>, Optional<? extends bsb<?>>> $$4 : $$2.entrySet()) {
         bsc<?> $$5 = $$4.getKey();
         Optional<? extends bsb<?>> $$6 = $$4.getValue();
         String $$10;
         if ($$6.isPresent()) {
            bsb<?> $$7 = (bsb<?>)$$6.get();
            Object $$8 = $$7.c();
            if ($$5 == bsc.D) {
               long $$9 = $$1 - (Long)$$8;
               $$10 = $$9 + " ticks ago";
            } else if ($$7.e()) {
               $$10 = a((akn)$$0.dK(), $$8) + " (ttl: " + $$7.b() + ")";
            } else {
               $$10 = a((akn)$$0.dK(), $$8);
            }
         } else {
            $$10 = "-";
         }

         $$3.add(jd.C.b($$5).a() + ": " + $$10);
      }

      $$3.sort(String::compareTo);
      return $$3;
   }

   private static String a(akn $$0, @Nullable Object $$1) {
      if ($$1 == null) {
         return "-";
      } else if ($$1 instanceof UUID) {
         return a($$0, $$0.a((UUID)$$1));
      } else if ($$1 instanceof bjb) {
         bil $$2 = (bil)$$1;
         return aax.a($$2);
      } else if ($$1 instanceof bgx) {
         return ((bgx)$$1).ab().getString();
      } else if ($$1 instanceof bsf) {
         return a($$0, ((bsf)$$1).a());
      } else if ($$1 instanceof bld) {
         return a($$0, ((bld)$$1).c());
      } else if ($$1 instanceof hf) {
         return a($$0, ((hf)$$1).b());
      } else if ($$1 instanceof bkv) {
         return a($$0, ((bkv)$$1).b());
      } else if ($$1 instanceof bhj) {
         bil $$3 = ((bhj)$$1).d();
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

   private static void a(akn $$0, vs $$1) {
      va<?> $$2 = new ve($$1);

      for (ako $$3 : $$0.v()) {
         $$3.c.b($$2);
      }
   }
}
