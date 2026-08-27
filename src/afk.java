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

public class afk {
   private static final Logger a = LogUtils.getLogger();

   public static void a(apu $$0, id $$1, String $$2, int $$3, int $$4) {
      a($$0, (zq)(new zu($$1, $$3, $$2, $$4)));
   }

   public static void a(apu $$0) {
      a($$0, (zq)(new zv()));
   }

   public static void a(apu $$0, cyn $$1) {
   }

   public static void a(apu $$0, id $$1) {
      d($$0, $$1);
   }

   public static void b(apu $$0, id $$1) {
      d($$0, $$1);
   }

   public static void c(apu $$0, id $$1) {
      d($$0, $$1);
   }

   private static void d(apu $$0, id $$1) {
   }

   public static void a(czg $$0, bqv $$1, @Nullable elp $$2, float $$3) {
   }

   public static void a(czg $$0, id $$1) {
   }

   public static void a(dab $$0, efy $$1) {
   }

   public static void a(czg $$0, bqv $$1, bxr $$2) {
   }

   public static void a(apu $$0, Collection<cll> $$1) {
   }

   public static void a(bqt $$0) {
   }

   public static void a(ccj $$0) {
   }

   public static void a(cic $$0) {
   }

   public static void a(czg $$0, in<dub> $$1, esj $$2) {
   }

   public static void a(czg $$0, dud $$1) {
   }

   public static void a(czg $$0, id $$1, dpi $$2, dml $$3) {
   }

   private static List<String> a(bqt $$0, long $$1) {
      Map<bzw<?>, Optional<? extends bzv<?>>> $$2 = $$0.dP().b();
      List<String> $$3 = Lists.newArrayList();

      for (Entry<bzw<?>, Optional<? extends bzv<?>>> $$4 : $$2.entrySet()) {
         bzw<?> $$5 = $$4.getKey();
         Optional<? extends bzv<?>> $$6 = $$4.getValue();
         String $$10;
         if ($$6.isPresent()) {
            bzv<?> $$7 = (bzv<?>)$$6.get();
            Object $$8 = $$7.c();
            if ($$5 == bzw.D) {
               long $$9 = $$1 - (Long)$$8;
               $$10 = $$9 + " ticks ago";
            } else if ($$7.e()) {
               $$10 = a((apu)$$0.dM(), $$8) + " (ttl: " + $$7.b() + ")";
            } else {
               $$10 = a((apu)$$0.dM(), $$8);
            }
         } else {
            $$10 = "-";
         }

         $$3.add(kt.B.b($$5).a() + ": " + $$10);
      }

      $$3.sort(String::compareTo);
      return $$3;
   }

   private static String a(apu $$0, @Nullable Object $$1) {
      if ($$1 == null) {
         return "-";
      } else if ($$1 instanceof UUID) {
         return a($$0, $$0.a((UUID)$$1));
      } else if ($$1 instanceof bqt) {
         bqa $$2 = (bqa)$$1;
         return afj.a($$2);
      } else if ($$1 instanceof bok) {
         return ((bok)$$1).ad().getString();
      } else if ($$1 instanceof bzz) {
         return a($$0, ((bzz)$$1).a());
      } else if ($$1 instanceof bsw) {
         return a($$0, ((bsw)$$1).c());
      } else if ($$1 instanceof im) {
         return a($$0, ((im)$$1).b());
      } else if ($$1 instanceof bso) {
         return a($$0, ((bso)$$1).b());
      } else if ($$1 instanceof boy) {
         bqa $$3 = ((boy)$$1).d();
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

   private static void a(apu $$0, zq $$1) {
      yp<?> $$2 = new yw($$1);

      for (apv $$3 : $$0.x()) {
         $$3.d.b($$2);
      }
   }
}
