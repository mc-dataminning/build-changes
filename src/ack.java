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

public class ack {
   private static final Logger a = LogUtils.getLogger();

   public static void a(ame $$0, ht $$1, String $$2, int $$3, int $$4) {
      a($$0, (xd)(new xh($$1, $$3, $$2, $$4)));
   }

   public static void a(ame $$0) {
      a($$0, (xd)(new xi()));
   }

   public static void a(ame $$0, crh $$1) {
   }

   public static void a(ame $$0, ht $$1) {
      d($$0, $$1);
   }

   public static void b(ame $$0, ht $$1) {
      d($$0, $$1);
   }

   public static void c(ame $$0, ht $$1) {
      d($$0, $$1);
   }

   private static void d(ame $$0, ht $$1) {
   }

   public static void a(csa $$0, bli $$1, @Nullable edh $$2, float $$3) {
   }

   public static void a(csa $$0, ht $$1) {
   }

   public static void a(csu $$0, dxp $$1) {
   }

   public static void a(csa $$0, bli $$1, bsc $$2) {
   }

   public static void a(ame $$0, Collection<cfb> $$1) {
   }

   public static void a(blg $$0) {
   }

   public static void a(bws $$0) {
   }

   public static void a(csa $$0, dls $$1, eju $$2) {
   }

   public static void a(csa $$0, dlu $$1) {
   }

   public static void a(csa $$0, ht $$1, dhi $$2, dfa $$3) {
   }

   private static List<String> a(blg $$0, long $$1) {
      Map<buh<?>, Optional<? extends bug<?>>> $$2 = $$0.dP().b();
      List<String> $$3 = Lists.newArrayList();

      for (Entry<buh<?>, Optional<? extends bug<?>>> $$4 : $$2.entrySet()) {
         buh<?> $$5 = $$4.getKey();
         Optional<? extends bug<?>> $$6 = $$4.getValue();
         String $$10;
         if ($$6.isPresent()) {
            bug<?> $$7 = (bug<?>)$$6.get();
            Object $$8 = $$7.c();
            if ($$5 == buh.D) {
               long $$9 = $$1 - (Long)$$8;
               $$10 = $$9 + " ticks ago";
            } else if ($$7.e()) {
               $$10 = a((ame)$$0.dN(), $$8) + " (ttl: " + $$7.b() + ")";
            } else {
               $$10 = a((ame)$$0.dN(), $$8);
            }
         } else {
            $$10 = "-";
         }

         $$3.add(jy.C.b($$5).a() + ": " + $$10);
      }

      $$3.sort(String::compareTo);
      return $$3;
   }

   private static String a(ame $$0, @Nullable Object $$1) {
      if ($$1 == null) {
         return "-";
      } else if ($$1 instanceof UUID) {
         return a($$0, $$0.a((UUID)$$1));
      } else if ($$1 instanceof blg) {
         bkq $$2 = (bkq)$$1;
         return acj.a($$2);
      } else if ($$1 instanceof bjb) {
         return ((bjb)$$1).ad().getString();
      } else if ($$1 instanceof buk) {
         return a($$0, ((buk)$$1).a());
      } else if ($$1 instanceof bni) {
         return a($$0, ((bni)$$1).c());
      } else if ($$1 instanceof ia) {
         return a($$0, ((ia)$$1).b());
      } else if ($$1 instanceof bna) {
         return a($$0, ((bna)$$1).b());
      } else if ($$1 instanceof bjo) {
         bkq $$3 = ((bjo)$$1).d();
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

   private static void a(ame $$0, xd $$1) {
      wk<?> $$2 = new wo($$1);

      for (amf $$3 : $$0.w()) {
         $$3.c.b($$2);
      }
   }
}
