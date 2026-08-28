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

public class agc {
   private static final Logger a = LogUtils.getLogger();

   public static void a(arc $$0, ji $$1, String $$2, int $$3, int $$4) {
      a($$0, (zy)(new aac($$1, $$3, $$2, $$4)));
   }

   public static void a(arc $$0) {
      a($$0, (zy)(new aad()));
   }

   public static void a(arc $$0, dfo $$1) {
   }

   public static void a(arc $$0, ji $$1) {
      d($$0, $$1);
   }

   public static void b(arc $$0, ji $$1) {
      d($$0, $$1);
   }

   public static void c(arc $$0, ji $$1) {
      d($$0, $$1);
   }

   private static void d(arc $$0, ji $$1) {
   }

   public static void a(dgi $$0, bvi $$1, @Nullable etn $$2, float $$3) {
   }

   public static void a(dgi $$0, ji $$1) {
   }

   public static void a(dgi $$0, aam $$1) {
      if ($$0 instanceof arc $$2) {
         a($$2, (zy)$$1);
      }
   }

   public static void a(dhg $$0, enu $$1) {
   }

   public static void a(dgi $$0, bvi $$1, ccf $$2) {
   }

   public static void a(arc $$0, Collection<cqk> $$1) {
   }

   public static void a(bvg $$0) {
   }

   public static void a(cgy $$0) {
   }

   public static void a(cmt $$0) {
   }

   public static void a(dgi $$0, jr<ebt> $$1, fba $$2) {
   }

   public static void a(dgi $$0, ebv $$1) {
   }

   public static void a(dgi $$0, ji $$1, dwx $$2, dtw $$3) {
   }

   private static List<String> a(bvg $$0, long $$1) {
      Map<cek<?>, Optional<? extends cej<?>>> $$2 = $$0.ec().b();
      List<String> $$3 = Lists.newArrayList();

      for (Entry<cek<?>, Optional<? extends cej<?>>> $$4 : $$2.entrySet()) {
         cek<?> $$5 = $$4.getKey();
         Optional<? extends cej<?>> $$6 = $$4.getValue();
         String $$10;
         if ($$6.isPresent()) {
            cej<?> $$7 = (cej<?>)$$6.get();
            Object $$8 = $$7.c();
            if ($$5 == cek.D) {
               long $$9 = $$1 - (Long)$$8;
               $$10 = $$9 + " ticks ago";
            } else if ($$7.e()) {
               $$10 = a((arc)$$0.dW(), $$8) + " (ttl: " + $$7.b() + ")";
            } else {
               $$10 = a((arc)$$0.dW(), $$8);
            }
         } else {
            $$10 = "-";
         }

         $$3.add(mb.z.b($$5).a() + ": " + $$10);
      }

      $$3.sort(String::compareTo);
      return $$3;
   }

   private static String a(arc $$0, @Nullable Object $$1) {
      if ($$1 == null) {
         return "-";
      } else if ($$1 instanceof UUID) {
         return a($$0, $$0.a((UUID)$$1));
      } else if ($$1 instanceof bvg) {
         buk $$2 = (buk)$$1;
         return agb.a($$2);
      } else if ($$1 instanceof bsm) {
         return ((bsm)$$1).al().getString();
      } else if ($$1 instanceof cen) {
         return a($$0, ((cen)$$1).a());
      } else if ($$1 instanceof bxk) {
         return a($$0, ((bxk)$$1).c());
      } else if ($$1 instanceof jq) {
         return a($$0, ((jq)$$1).b());
      } else if ($$1 instanceof bxc) {
         return a($$0, ((bxc)$$1).b());
      } else if ($$1 instanceof bta) {
         buk $$3 = ((bta)$$1).d();
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

   private static void a(arc $$0, zy $$1) {
      yv<?> $$2 = new zc($$1);

      for (ard $$3 : $$0.z()) {
         $$3.f.b($$2);
      }
   }
}
