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

public class ahj {
   private static final Logger a = LogUtils.getLogger();

   public static void a(ash $$0, jh $$1, String $$2, int $$3, int $$4) {
      a($$0, (abf)(new abj($$1, $$3, $$2, $$4)));
   }

   public static void a(ash $$0) {
      a($$0, (abf)(new abk()));
   }

   public static void a(ash $$0, dgg $$1) {
   }

   public static void a(ash $$0, jh $$1) {
      d($$0, $$1);
   }

   public static void b(ash $$0, jh $$1) {
      d($$0, $$1);
   }

   public static void c(ash $$0, jh $$1) {
      d($$0, $$1);
   }

   private static void d(ash $$0, jh $$1) {
   }

   public static void a(dha $$0, bwd $$1, @Nullable eud $$2, float $$3) {
   }

   public static void a(dha $$0, jh $$1) {
   }

   public static void a(dha $$0, abt $$1) {
      if ($$0 instanceof ash $$2) {
         a($$2, (abf)$$1);
      }
   }

   public static void a(dhy $$0, eok $$1) {
   }

   public static void a(dha $$0, bwd $$1, cda $$2) {
   }

   public static void a(ash $$0, Collection<crf> $$1) {
   }

   public static void a(bwb $$0) {
   }

   public static void a(cht $$0) {
   }

   public static void a(cno $$0) {
   }

   public static void a(dha $$0, jq<ecj> $$1, fbs $$2) {
   }

   public static void a(dha $$0, ecl $$1) {
   }

   public static void a(dha $$0, jh $$1, dxn $$2, dum $$3) {
   }

   private static List<String> a(bwb $$0, long $$1) {
      Map<cff<?>, Optional<? extends cfe<?>>> $$2 = $$0.eb().b();
      List<String> $$3 = Lists.newArrayList();

      for (Entry<cff<?>, Optional<? extends cfe<?>>> $$4 : $$2.entrySet()) {
         cff<?> $$5 = $$4.getKey();
         Optional<? extends cfe<?>> $$6 = $$4.getValue();
         String $$10;
         if ($$6.isPresent()) {
            cfe<?> $$7 = (cfe<?>)$$6.get();
            Object $$8 = $$7.c();
            if ($$5 == cff.D) {
               long $$9 = $$1 - (Long)$$8;
               $$10 = $$9 + " ticks ago";
            } else if ($$7.e()) {
               $$10 = a((ash)$$0.dV(), $$8) + " (ttl: " + $$7.b() + ")";
            } else {
               $$10 = a((ash)$$0.dV(), $$8);
            }
         } else {
            $$10 = "-";
         }

         $$3.add(ma.z.b($$5).a() + ": " + $$10);
      }

      $$3.sort(String::compareTo);
      return $$3;
   }

   private static String a(ash $$0, @Nullable Object $$1) {
      if ($$1 == null) {
         return "-";
      } else if ($$1 instanceof UUID) {
         return a($$0, $$0.a((UUID)$$1));
      } else if ($$1 instanceof bwb) {
         bvf $$2 = (bvf)$$1;
         return ahi.a($$2);
      } else if ($$1 instanceof bth) {
         return ((bth)$$1).al().getString();
      } else if ($$1 instanceof cfi) {
         return a($$0, ((cfi)$$1).a());
      } else if ($$1 instanceof byf) {
         return a($$0, ((byf)$$1).c());
      } else if ($$1 instanceof jp) {
         return a($$0, ((jp)$$1).b());
      } else if ($$1 instanceof bxx) {
         return a($$0, ((bxx)$$1).b());
      } else if ($$1 instanceof btv) {
         bvf $$3 = ((btv)$$1).d();
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

   private static void a(ash $$0, abf $$1) {
      aac<?> $$2 = new aaj($$1);

      for (asi $$3 : $$0.y()) {
         $$3.f.b($$2);
      }
   }
}
