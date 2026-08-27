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

   public static void a(aow $$0, hz $$1, String $$2, int $$3, int $$4) {
      a($$0, (yy)(new zc($$1, $$3, $$2, $$4)));
   }

   public static void a(aow $$0) {
      a($$0, (yy)(new zd()));
   }

   public static void a(aow $$0, cuy $$1) {
   }

   public static void a(aow $$0, hz $$1) {
      d($$0, $$1);
   }

   public static void b(aow $$0, hz $$1) {
      d($$0, $$1);
   }

   public static void c(aow $$0, hz $$1) {
      d($$0, $$1);
   }

   private static void d(aow $$0, hz $$1) {
   }

   public static void a(cvr $$0, bok $$1, @Nullable ehl $$2, float $$3) {
   }

   public static void a(cvr $$0, hz $$1) {
   }

   public static void a(cwm $$0, ebt $$1) {
   }

   public static void a(cvr $$0, bok $$1, bvg $$2) {
   }

   public static void a(aow $$0, Collection<ciu> $$1) {
   }

   public static void a(boi $$0) {
   }

   public static void a(bzy $$0) {
   }

   public static void a(cfn $$0) {
   }

   public static void a(cvr $$0, ij<dpw> $$1, enz $$2) {
   }

   public static void a(cvr $$0, dpy $$1) {
   }

   public static void a(cvr $$0, hz $$1, dlj $$2, diu $$3) {
   }

   private static List<String> a(boi $$0, long $$1) {
      Map<bxl<?>, Optional<? extends bxk<?>>> $$2 = $$0.dO().b();
      List<String> $$3 = Lists.newArrayList();

      for (Entry<bxl<?>, Optional<? extends bxk<?>>> $$4 : $$2.entrySet()) {
         bxl<?> $$5 = $$4.getKey();
         Optional<? extends bxk<?>> $$6 = $$4.getValue();
         String $$10;
         if ($$6.isPresent()) {
            bxk<?> $$7 = (bxk<?>)$$6.get();
            Object $$8 = $$7.c();
            if ($$5 == bxl.D) {
               long $$9 = $$1 - (Long)$$8;
               $$10 = $$9 + " ticks ago";
            } else if ($$7.e()) {
               $$10 = a((aow)$$0.dM(), $$8) + " (ttl: " + $$7.b() + ")";
            } else {
               $$10 = a((aow)$$0.dM(), $$8);
            }
         } else {
            $$10 = "-";
         }

         $$3.add(kf.B.b($$5).a() + ": " + $$10);
      }

      $$3.sort(String::compareTo);
      return $$3;
   }

   private static String a(aow $$0, @Nullable Object $$1) {
      if ($$1 == null) {
         return "-";
      } else if ($$1 instanceof UUID) {
         return a($$0, $$0.a((UUID)$$1));
      } else if ($$1 instanceof boi) {
         bnq $$2 = (bnq)$$1;
         return aeo.a($$2);
      } else if ($$1 instanceof bmb) {
         return ((bmb)$$1).ad().getString();
      } else if ($$1 instanceof bxo) {
         return a($$0, ((bxo)$$1).a());
      } else if ($$1 instanceof bql) {
         return a($$0, ((bql)$$1).c());
      } else if ($$1 instanceof ii) {
         return a($$0, ((ii)$$1).b());
      } else if ($$1 instanceof bqd) {
         return a($$0, ((bqd)$$1).b());
      } else if ($$1 instanceof bmp) {
         bnq $$3 = ((bmp)$$1).d();
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

   private static void a(aow $$0, yy $$1) {
      xx<?> $$2 = new ye($$1);

      for (aox $$3 : $$0.x()) {
         $$3.d.b($$2);
      }
   }
}
