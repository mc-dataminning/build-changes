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

public class agv {
   private static final Logger a = LogUtils.getLogger();

   public static void a(arq $$0, jh $$1, String $$2, int $$3, int $$4) {
      a($$0, (aav)(new aaz($$1, $$3, $$2, $$4)));
   }

   public static void a(arq $$0) {
      a($$0, (aav)(new aba()));
   }

   public static void a(arq $$0, del $$1) {
   }

   public static void a(arq $$0, jh $$1) {
      d($$0, $$1);
   }

   public static void b(arq $$0, jh $$1) {
      d($$0, $$1);
   }

   public static void c(arq $$0, jh $$1) {
      d($$0, $$1);
   }

   private static void d(arq $$0, jh $$1) {
   }

   public static void a(dff $$0, bvg $$1, @Nullable esc $$2, float $$3) {
   }

   public static void a(dff $$0, jh $$1) {
   }

   public static void a(dff $$0, abj $$1) {
      if ($$0 instanceof arq $$2) {
         a($$2, (aav)$$1);
      }
   }

   public static void a(dgd $$0, emj $$1) {
   }

   public static void a(dff $$0, bvg $$1, ccd $$2) {
   }

   public static void a(arq $$0, Collection<cqe> $$1) {
   }

   public static void a(bve $$0) {
   }

   public static void a(cgw $$0) {
   }

   public static void a(cmr $$0) {
   }

   public static void a(dff $$0, jq<eak> $$1, ezr $$2) {
   }

   public static void a(dff $$0, eam $$1) {
   }

   public static void a(dff $$0, jh $$1, dvo $$2, dso $$3) {
   }

   private static List<String> a(bve $$0, long $$1) {
      Map<cei<?>, Optional<? extends ceh<?>>> $$2 = $$0.ee().b();
      List<String> $$3 = Lists.newArrayList();

      for (Entry<cei<?>, Optional<? extends ceh<?>>> $$4 : $$2.entrySet()) {
         cei<?> $$5 = $$4.getKey();
         Optional<? extends ceh<?>> $$6 = $$4.getValue();
         String $$10;
         if ($$6.isPresent()) {
            ceh<?> $$7 = (ceh<?>)$$6.get();
            Object $$8 = $$7.c();
            if ($$5 == cei.D) {
               long $$9 = $$1 - (Long)$$8;
               $$10 = $$9 + " ticks ago";
            } else if ($$7.e()) {
               $$10 = a((arq)$$0.dY(), $$8) + " (ttl: " + $$7.b() + ")";
            } else {
               $$10 = a((arq)$$0.dY(), $$8);
            }
         } else {
            $$10 = "-";
         }

         $$3.add(lz.z.b($$5).a() + ": " + $$10);
      }

      $$3.sort(String::compareTo);
      return $$3;
   }

   private static String a(arq $$0, @Nullable Object $$1) {
      if ($$1 == null) {
         return "-";
      } else if ($$1 instanceof UUID) {
         return a($$0, $$0.a((UUID)$$1));
      } else if ($$1 instanceof bve) {
         bui $$2 = (bui)$$1;
         return agu.a($$2);
      } else if ($$1 instanceof bsk) {
         return ((bsk)$$1).am().getString();
      } else if ($$1 instanceof cel) {
         return a($$0, ((cel)$$1).a());
      } else if ($$1 instanceof bxi) {
         return a($$0, ((bxi)$$1).c());
      } else if ($$1 instanceof jp) {
         return a($$0, ((jp)$$1).b());
      } else if ($$1 instanceof bxa) {
         return a($$0, ((bxa)$$1).b());
      } else if ($$1 instanceof bsy) {
         bui $$3 = ((bsy)$$1).d();
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

   private static void a(arq $$0, aav $$1) {
      zs<?> $$2 = new zz($$1);

      for (arr $$3 : $$0.x()) {
         $$3.g.b($$2);
      }
   }
}
