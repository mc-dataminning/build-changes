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

public class aga {
   private static final Logger a = LogUtils.getLogger();

   public static void a(aqm $$0, io $$1, String $$2, int $$3, int $$4) {
      a($$0, (aaf)(new aaj($$1, $$3, $$2, $$4)));
   }

   public static void a(aqm $$0) {
      a($$0, (aaf)(new aak()));
   }

   public static void a(aqm $$0, dae $$1) {
   }

   public static void a(aqm $$0, io $$1) {
      d($$0, $$1);
   }

   public static void b(aqm $$0, io $$1) {
      d($$0, $$1);
   }

   public static void c(aqm $$0, io $$1) {
      d($$0, $$1);
   }

   private static void d(aqm $$0, io $$1) {
   }

   public static void a(dax $$0, bsq $$1, @Nullable eni $$2, float $$3) {
   }

   public static void a(dax $$0, io $$1) {
   }

   public static void a(dbs $$0, ehr $$1) {
   }

   public static void a(dax $$0, bsq $$1, bzn $$2) {
   }

   public static void a(aqm $$0, Collection<cnh> $$1) {
   }

   public static void a(bso $$0) {
   }

   public static void a(cef $$0) {
   }

   public static void a(cjy $$0) {
   }

   public static void a(dax $$0, ix<dvu> $$1, euk $$2) {
   }

   public static void a(dax $$0, dvw $$1) {
   }

   public static void a(dax $$0, io $$1, drb $$2, dod $$3) {
   }

   private static List<String> a(bso $$0, long $$1) {
      Map<cbs<?>, Optional<? extends cbr<?>>> $$2 = $$0.dS().b();
      List<String> $$3 = Lists.newArrayList();

      for (Entry<cbs<?>, Optional<? extends cbr<?>>> $$4 : $$2.entrySet()) {
         cbs<?> $$5 = $$4.getKey();
         Optional<? extends cbr<?>> $$6 = $$4.getValue();
         String $$10;
         if ($$6.isPresent()) {
            cbr<?> $$7 = (cbr<?>)$$6.get();
            Object $$8 = $$7.c();
            if ($$5 == cbs.D) {
               long $$9 = $$1 - (Long)$$8;
               $$10 = $$9 + " ticks ago";
            } else if ($$7.e()) {
               $$10 = a((aqm)$$0.dP(), $$8) + " (ttl: " + $$7.b() + ")";
            } else {
               $$10 = a((aqm)$$0.dP(), $$8);
            }
         } else {
            $$10 = "-";
         }

         $$3.add(le.B.b($$5).a() + ": " + $$10);
      }

      $$3.sort(String::compareTo);
      return $$3;
   }

   private static String a(aqm $$0, @Nullable Object $$1) {
      if ($$1 == null) {
         return "-";
      } else if ($$1 instanceof UUID) {
         return a($$0, $$0.a((UUID)$$1));
      } else if ($$1 instanceof bso) {
         bru $$2 = (bru)$$1;
         return afz.a($$2);
      } else if ($$1 instanceof bpz) {
         return ((bpz)$$1).af().getString();
      } else if ($$1 instanceof cbv) {
         return a($$0, ((cbv)$$1).a());
      } else if ($$1 instanceof bus) {
         return a($$0, ((bus)$$1).c());
      } else if ($$1 instanceof iw) {
         return a($$0, ((iw)$$1).b());
      } else if ($$1 instanceof buk) {
         return a($$0, ((buk)$$1).b());
      } else if ($$1 instanceof bqn) {
         bru $$3 = ((bqn)$$1).d();
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

   private static void a(aqm $$0, aaf $$1) {
      ze<?> $$2 = new zl($$1);

      for (aqn $$3 : $$0.x()) {
         $$3.d.b($$2);
      }
   }
}
