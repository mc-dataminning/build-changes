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

public class agb {
   private static final Logger a = LogUtils.getLogger();

   public static void a(aqn $$0, io $$1, String $$2, int $$3, int $$4) {
      a($$0, (aaf)(new aaj($$1, $$3, $$2, $$4)));
   }

   public static void a(aqn $$0) {
      a($$0, (aaf)(new aak()));
   }

   public static void a(aqn $$0, dag $$1) {
   }

   public static void a(aqn $$0, io $$1) {
      d($$0, $$1);
   }

   public static void b(aqn $$0, io $$1) {
      d($$0, $$1);
   }

   public static void c(aqn $$0, io $$1) {
      d($$0, $$1);
   }

   private static void d(aqn $$0, io $$1) {
   }

   public static void a(daz $$0, bss $$1, @Nullable enk $$2, float $$3) {
   }

   public static void a(daz $$0, io $$1) {
   }

   public static void a(dbu $$0, eht $$1) {
   }

   public static void a(daz $$0, bss $$1, bzp $$2) {
   }

   public static void a(aqn $$0, Collection<cnj> $$1) {
   }

   public static void a(bsq $$0) {
   }

   public static void a(ceh $$0) {
   }

   public static void a(cka $$0) {
   }

   public static void a(daz $$0, ix<dvw> $$1, eum $$2) {
   }

   public static void a(daz $$0, dvy $$1) {
   }

   public static void a(daz $$0, io $$1, drd $$2, dof $$3) {
   }

   private static List<String> a(bsq $$0, long $$1) {
      Map<cbu<?>, Optional<? extends cbt<?>>> $$2 = $$0.dS().b();
      List<String> $$3 = Lists.newArrayList();

      for (Entry<cbu<?>, Optional<? extends cbt<?>>> $$4 : $$2.entrySet()) {
         cbu<?> $$5 = $$4.getKey();
         Optional<? extends cbt<?>> $$6 = $$4.getValue();
         String $$10;
         if ($$6.isPresent()) {
            cbt<?> $$7 = (cbt<?>)$$6.get();
            Object $$8 = $$7.c();
            if ($$5 == cbu.D) {
               long $$9 = $$1 - (Long)$$8;
               $$10 = $$9 + " ticks ago";
            } else if ($$7.e()) {
               $$10 = a((aqn)$$0.dP(), $$8) + " (ttl: " + $$7.b() + ")";
            } else {
               $$10 = a((aqn)$$0.dP(), $$8);
            }
         } else {
            $$10 = "-";
         }

         $$3.add(le.B.b($$5).a() + ": " + $$10);
      }

      $$3.sort(String::compareTo);
      return $$3;
   }

   private static String a(aqn $$0, @Nullable Object $$1) {
      if ($$1 == null) {
         return "-";
      } else if ($$1 instanceof UUID) {
         return a($$0, $$0.a((UUID)$$1));
      } else if ($$1 instanceof bsq) {
         brw $$2 = (brw)$$1;
         return aga.a($$2);
      } else if ($$1 instanceof bqb) {
         return ((bqb)$$1).af().getString();
      } else if ($$1 instanceof cbx) {
         return a($$0, ((cbx)$$1).a());
      } else if ($$1 instanceof buu) {
         return a($$0, ((buu)$$1).c());
      } else if ($$1 instanceof iw) {
         return a($$0, ((iw)$$1).b());
      } else if ($$1 instanceof bum) {
         return a($$0, ((bum)$$1).b());
      } else if ($$1 instanceof bqp) {
         brw $$3 = ((bqp)$$1).d();
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

   private static void a(aqn $$0, aaf $$1) {
      ze<?> $$2 = new zl($$1);

      for (aqo $$3 : $$0.x()) {
         $$3.c.b($$2);
      }
   }
}
