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

public class agd {
   private static final Logger a = LogUtils.getLogger();

   public static void a(ard $$0, ji $$1, String $$2, int $$3, int $$4) {
      a($$0, (zz)(new aad($$1, $$3, $$2, $$4)));
   }

   public static void a(ard $$0) {
      a($$0, (zz)(new aae()));
   }

   public static void a(ard $$0, dfo $$1) {
   }

   public static void a(ard $$0, ji $$1) {
      d($$0, $$1);
   }

   public static void b(ard $$0, ji $$1) {
      d($$0, $$1);
   }

   public static void c(ard $$0, ji $$1) {
      d($$0, $$1);
   }

   private static void d(ard $$0, ji $$1) {
   }

   public static void a(dgi $$0, bvj $$1, @Nullable etn $$2, float $$3) {
   }

   public static void a(dgi $$0, ji $$1) {
   }

   public static void a(dgi $$0, aan $$1) {
      if ($$0 instanceof ard $$2) {
         a($$2, (zz)$$1);
      }
   }

   public static void a(dhg $$0, enu $$1) {
   }

   public static void a(dgi $$0, bvj $$1, ccg $$2) {
   }

   public static void a(ard $$0, Collection<cqk> $$1) {
   }

   public static void a(bvh $$0) {
   }

   public static void a(cgz $$0) {
   }

   public static void a(cmu $$0) {
   }

   public static void a(dgi $$0, jr<ebt> $$1, fba $$2) {
   }

   public static void a(dgi $$0, ebv $$1) {
   }

   public static void a(dgi $$0, ji $$1, dwx $$2, dtw $$3) {
   }

   private static List<String> a(bvh $$0, long $$1) {
      Map<cel<?>, Optional<? extends cek<?>>> $$2 = $$0.eb().b();
      List<String> $$3 = Lists.newArrayList();

      for (Entry<cel<?>, Optional<? extends cek<?>>> $$4 : $$2.entrySet()) {
         cel<?> $$5 = $$4.getKey();
         Optional<? extends cek<?>> $$6 = $$4.getValue();
         String $$10;
         if ($$6.isPresent()) {
            cek<?> $$7 = (cek<?>)$$6.get();
            Object $$8 = $$7.c();
            if ($$5 == cel.D) {
               long $$9 = $$1 - (Long)$$8;
               $$10 = $$9 + " ticks ago";
            } else if ($$7.e()) {
               $$10 = a((ard)$$0.dV(), $$8) + " (ttl: " + $$7.b() + ")";
            } else {
               $$10 = a((ard)$$0.dV(), $$8);
            }
         } else {
            $$10 = "-";
         }

         $$3.add(mb.z.b($$5).a() + ": " + $$10);
      }

      $$3.sort(String::compareTo);
      return $$3;
   }

   private static String a(ard $$0, @Nullable Object $$1) {
      if ($$1 == null) {
         return "-";
      } else if ($$1 instanceof UUID) {
         return a($$0, $$0.a((UUID)$$1));
      } else if ($$1 instanceof bvh) {
         bul $$2 = (bul)$$1;
         return agc.a($$2);
      } else if ($$1 instanceof bsn) {
         return ((bsn)$$1).al().getString();
      } else if ($$1 instanceof ceo) {
         return a($$0, ((ceo)$$1).a());
      } else if ($$1 instanceof bxl) {
         return a($$0, ((bxl)$$1).c());
      } else if ($$1 instanceof jq) {
         return a($$0, ((jq)$$1).b());
      } else if ($$1 instanceof bxd) {
         return a($$0, ((bxd)$$1).b());
      } else if ($$1 instanceof btb) {
         bul $$3 = ((btb)$$1).d();
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

   private static void a(ard $$0, zz $$1) {
      yw<?> $$2 = new zd($$1);

      for (are $$3 : $$0.z()) {
         $$3.f.b($$2);
      }
   }
}
