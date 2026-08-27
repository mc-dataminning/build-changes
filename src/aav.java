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

public class aav {
   private static final Logger a = LogUtils.getLogger();

   public static void a(akk $$0, gu $$1, String $$2, int $$3, int $$4) {
      a($$0, (vp)(new vt($$1, $$3, $$2, $$4)));
   }

   public static void a(akk $$0) {
      a($$0, (vp)(new vu()));
   }

   public static void a(akk $$0, cos $$1) {
   }

   public static void a(akk $$0, gu $$1) {
      d($$0, $$1);
   }

   public static void b(akk $$0, gu $$1) {
      d($$0, $$1);
   }

   public static void c(akk $$0, gu $$1) {
      d($$0, $$1);
   }

   private static void d(akk $$0, gu $$1) {
   }

   public static void a(cpl $$0, bja $$1, @Nullable ear $$2, float $$3) {
   }

   public static void a(cpl $$0, gu $$1) {
   }

   public static void a(cqf $$0, dvg $$1) {
   }

   public static void a(cpl $$0, bja $$1, bpu $$2) {
   }

   public static void a(akk $$0, Collection<cct> $$1) {
   }

   public static void a(biy $$0) {
   }

   public static void a(buk $$0) {
   }

   public static void a(cpl $$0, djj $$1, ehd $$2) {
   }

   public static void a(cpl $$0, djl $$1) {
   }

   public static void a(cpl $$0, gu $$1, dez $$2, dci $$3) {
   }

   private static List<String> a(biy $$0, long $$1) {
      Map<brz<?>, Optional<? extends bry<?>>> $$2 = $$0.dM().b();
      List<String> $$3 = Lists.newArrayList();

      for (Entry<brz<?>, Optional<? extends bry<?>>> $$4 : $$2.entrySet()) {
         brz<?> $$5 = $$4.getKey();
         Optional<? extends bry<?>> $$6 = $$4.getValue();
         String $$10;
         if ($$6.isPresent()) {
            bry<?> $$7 = (bry<?>)$$6.get();
            Object $$8 = $$7.c();
            if ($$5 == brz.D) {
               long $$9 = $$1 - (Long)$$8;
               $$10 = $$9 + " ticks ago";
            } else if ($$7.e()) {
               $$10 = a((akk)$$0.dK(), $$8) + " (ttl: " + $$7.b() + ")";
            } else {
               $$10 = a((akk)$$0.dK(), $$8);
            }
         } else {
            $$10 = "-";
         }

         $$3.add(jb.C.b($$5).a() + ": " + $$10);
      }

      $$3.sort(String::compareTo);
      return $$3;
   }

   private static String a(akk $$0, @Nullable Object $$1) {
      if ($$1 == null) {
         return "-";
      } else if ($$1 instanceof UUID) {
         return a($$0, $$0.a((UUID)$$1));
      } else if ($$1 instanceof biy) {
         bii $$2 = (bii)$$1;
         return aau.a($$2);
      } else if ($$1 instanceof bgu) {
         return ((bgu)$$1).ab().getString();
      } else if ($$1 instanceof bsc) {
         return a($$0, ((bsc)$$1).a());
      } else if ($$1 instanceof bla) {
         return a($$0, ((bla)$$1).c());
      } else if ($$1 instanceof hd) {
         return a($$0, ((hd)$$1).b());
      } else if ($$1 instanceof bks) {
         return a($$0, ((bks)$$1).b());
      } else if ($$1 instanceof bhg) {
         bii $$3 = ((bhg)$$1).d();
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

   private static void a(akk $$0, vp $$1) {
      ux<?> $$2 = new vb($$1);

      for (akl $$3 : $$0.v()) {
         $$3.c.b($$2);
      }
   }
}
