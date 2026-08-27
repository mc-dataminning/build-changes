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

public class aes {
   private static final Logger a = LogUtils.getLogger();

   public static void a(apa $$0, ib $$1, String $$2, int $$3, int $$4) {
      a($$0, (za)(new ze($$1, $$3, $$2, $$4)));
   }

   public static void a(apa $$0) {
      a($$0, (za)(new zf()));
   }

   public static void a(apa $$0, cvl $$1) {
   }

   public static void a(apa $$0, ib $$1) {
      d($$0, $$1);
   }

   public static void b(apa $$0, ib $$1) {
      d($$0, $$1);
   }

   public static void c(apa $$0, ib $$1) {
      d($$0, $$1);
   }

   private static void d(apa $$0, ib $$1) {
   }

   public static void a(cwe $$0, boz $$1, @Nullable eig $$2, float $$3) {
   }

   public static void a(cwe $$0, ib $$1) {
   }

   public static void a(cwz $$0, eco $$1) {
   }

   public static void a(cwe $$0, boz $$1, bvv $$2) {
   }

   public static void a(apa $$0, Collection<cjj> $$1) {
   }

   public static void a(box $$0) {
   }

   public static void a(can $$0) {
   }

   public static void a(cgc $$0) {
   }

   public static void a(cwe $$0, il<dqr> $$1, eov $$2) {
   }

   public static void a(cwe $$0, dqt $$1) {
   }

   public static void a(cwe $$0, ib $$1, dme $$2, dji $$3) {
   }

   private static List<String> a(box $$0, long $$1) {
      Map<bya<?>, Optional<? extends bxz<?>>> $$2 = $$0.dM().b();
      List<String> $$3 = Lists.newArrayList();

      for (Entry<bya<?>, Optional<? extends bxz<?>>> $$4 : $$2.entrySet()) {
         bya<?> $$5 = $$4.getKey();
         Optional<? extends bxz<?>> $$6 = $$4.getValue();
         String $$10;
         if ($$6.isPresent()) {
            bxz<?> $$7 = (bxz<?>)$$6.get();
            Object $$8 = $$7.c();
            if ($$5 == bya.D) {
               long $$9 = $$1 - (Long)$$8;
               $$10 = $$9 + " ticks ago";
            } else if ($$7.e()) {
               $$10 = a((apa)$$0.dJ(), $$8) + " (ttl: " + $$7.b() + ")";
            } else {
               $$10 = a((apa)$$0.dJ(), $$8);
            }
         } else {
            $$10 = "-";
         }

         $$3.add(kh.B.b($$5).a() + ": " + $$10);
      }

      $$3.sort(String::compareTo);
      return $$3;
   }

   private static String a(apa $$0, @Nullable Object $$1) {
      if ($$1 == null) {
         return "-";
      } else if ($$1 instanceof UUID) {
         return a($$0, $$0.a((UUID)$$1));
      } else if ($$1 instanceof box) {
         bof $$2 = (bof)$$1;
         return aer.a($$2);
      } else if ($$1 instanceof bmq) {
         return ((bmq)$$1).ad().getString();
      } else if ($$1 instanceof byd) {
         return a($$0, ((byd)$$1).a());
      } else if ($$1 instanceof bra) {
         return a($$0, ((bra)$$1).c());
      } else if ($$1 instanceof ik) {
         return a($$0, ((ik)$$1).b());
      } else if ($$1 instanceof bqs) {
         return a($$0, ((bqs)$$1).b());
      } else if ($$1 instanceof bne) {
         bof $$3 = ((bne)$$1).d();
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

   private static void a(apa $$0, za $$1) {
      xz<?> $$2 = new yg($$1);

      for (apb $$3 : $$0.x()) {
         $$3.d.b($$2);
      }
   }
}
