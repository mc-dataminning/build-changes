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

public class agi {
   private static final Logger a = LogUtils.getLogger();

   public static void a(aqt $$0, ir $$1, String $$2, int $$3, int $$4) {
      a($$0, (aam)(new aaq($$1, $$3, $$2, $$4)));
   }

   public static void a(aqt $$0) {
      a($$0, (aam)(new aar()));
   }

   public static void a(aqt $$0, dbh $$1) {
   }

   public static void a(aqt $$0, ir $$1) {
      d($$0, $$1);
   }

   public static void b(aqt $$0, ir $$1) {
      d($$0, $$1);
   }

   public static void c(aqt $$0, ir $$1) {
      d($$0, $$1);
   }

   private static void d(aqt $$0, ir $$1) {
   }

   public static void a(dca $$0, bsq $$1, @Nullable eps $$2, float $$3) {
   }

   public static void a(dca $$0, ir $$1) {
   }

   public static void a(dcv $$0, ekb $$1) {
   }

   public static void a(dca $$0, bsq $$1, bzm $$2) {
   }

   public static void a(aqt $$0, Collection<cnm> $$1) {
   }

   public static void a(bso $$0) {
   }

   public static void a(cef $$0) {
   }

   public static void a(cka $$0) {
   }

   public static void a(dca $$0, ja<dxv> $$1, ewu $$2) {
   }

   public static void a(dca $$0, dxx $$1) {
   }

   public static void a(dca $$0, ir $$1, dtc $$2, dpy $$3) {
   }

   private static List<String> a(bso $$0, long $$1) {
      Map<cbr<?>, Optional<? extends cbq<?>>> $$2 = $$0.dZ().b();
      List<String> $$3 = Lists.newArrayList();

      for (Entry<cbr<?>, Optional<? extends cbq<?>>> $$4 : $$2.entrySet()) {
         cbr<?> $$5 = $$4.getKey();
         Optional<? extends cbq<?>> $$6 = $$4.getValue();
         String $$10;
         if ($$6.isPresent()) {
            cbq<?> $$7 = (cbq<?>)$$6.get();
            Object $$8 = $$7.c();
            if ($$5 == cbr.D) {
               long $$9 = $$1 - (Long)$$8;
               $$10 = $$9 + " ticks ago";
            } else if ($$7.e()) {
               $$10 = a((aqt)$$0.dU(), $$8) + " (ttl: " + $$7.b() + ")";
            } else {
               $$10 = a((aqt)$$0.dU(), $$8);
            }
         } else {
            $$10 = "-";
         }

         $$3.add(lh.B.b($$5).a() + ": " + $$10);
      }

      $$3.sort(String::compareTo);
      return $$3;
   }

   private static String a(aqt $$0, @Nullable Object $$1) {
      if ($$1 == null) {
         return "-";
      } else if ($$1 instanceof UUID) {
         return a($$0, $$0.a((UUID)$$1));
      } else if ($$1 instanceof bso) {
         brv $$2 = (brv)$$1;
         return agh.a($$2);
      } else if ($$1 instanceof bqf) {
         return ((bqf)$$1).af().getString();
      } else if ($$1 instanceof cbu) {
         return a($$0, ((cbu)$$1).a());
      } else if ($$1 instanceof bur) {
         return a($$0, ((bur)$$1).c());
      } else if ($$1 instanceof iz) {
         return a($$0, ((iz)$$1).b());
      } else if ($$1 instanceof buj) {
         return a($$0, ((buj)$$1).b());
      } else if ($$1 instanceof bqt) {
         brv $$3 = ((bqt)$$1).d();
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

   private static void a(aqt $$0, aam $$1) {
      zl<?> $$2 = new zs($$1);

      for (aqu $$3 : $$0.x()) {
         $$3.d.b($$2);
      }
   }
}
