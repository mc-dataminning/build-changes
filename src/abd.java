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

public class abd {
   private static final Logger a = LogUtils.getLogger();

   public static void a(aks $$0, gw $$1, String $$2, int $$3, int $$4) {
      a($$0, (vy)(new wc($$1, $$3, $$2, $$4)));
   }

   public static void a(aks $$0) {
      a($$0, (vy)(new wd()));
   }

   public static void a(aks $$0, cpe $$1) {
   }

   public static void a(aks $$0, gw $$1) {
      d($$0, $$1);
   }

   public static void b(aks $$0, gw $$1) {
      d($$0, $$1);
   }

   public static void c(aks $$0, gw $$1) {
      d($$0, $$1);
   }

   private static void d(aks $$0, gw $$1) {
   }

   public static void a(cpx $$0, bjk $$1, @Nullable ebd $$2, float $$3) {
   }

   public static void a(cpx $$0, gw $$1) {
   }

   public static void a(cqr $$0, dvs $$1) {
   }

   public static void a(cpx $$0, bjk $$1, bqe $$2) {
   }

   public static void a(aks $$0, Collection<cdd> $$1) {
   }

   public static void a(bji $$0) {
   }

   public static void a(buu $$0) {
   }

   public static void a(cpx $$0, djv $$1, ehp $$2) {
   }

   public static void a(cpx $$0, djx $$1) {
   }

   public static void a(cpx $$0, gw $$1, dfl $$2, dcu $$3) {
   }

   private static List<String> a(bji $$0, long $$1) {
      Map<bsj<?>, Optional<? extends bsi<?>>> $$2 = $$0.dN().b();
      List<String> $$3 = Lists.newArrayList();

      for (Entry<bsj<?>, Optional<? extends bsi<?>>> $$4 : $$2.entrySet()) {
         bsj<?> $$5 = $$4.getKey();
         Optional<? extends bsi<?>> $$6 = $$4.getValue();
         String $$10;
         if ($$6.isPresent()) {
            bsi<?> $$7 = (bsi<?>)$$6.get();
            Object $$8 = $$7.c();
            if ($$5 == bsj.D) {
               long $$9 = $$1 - (Long)$$8;
               $$10 = $$9 + " ticks ago";
            } else if ($$7.e()) {
               $$10 = a((aks)$$0.dL(), $$8) + " (ttl: " + $$7.b() + ")";
            } else {
               $$10 = a((aks)$$0.dL(), $$8);
            }
         } else {
            $$10 = "-";
         }

         $$3.add(jd.C.b($$5).a() + ": " + $$10);
      }

      $$3.sort(String::compareTo);
      return $$3;
   }

   private static String a(aks $$0, @Nullable Object $$1) {
      if ($$1 == null) {
         return "-";
      } else if ($$1 instanceof UUID) {
         return a($$0, $$0.a((UUID)$$1));
      } else if ($$1 instanceof bji) {
         bis $$2 = (bis)$$1;
         return abc.a($$2);
      } else if ($$1 instanceof bhe) {
         return ((bhe)$$1).ab().getString();
      } else if ($$1 instanceof bsm) {
         return a($$0, ((bsm)$$1).a());
      } else if ($$1 instanceof blk) {
         return a($$0, ((blk)$$1).c());
      } else if ($$1 instanceof hf) {
         return a($$0, ((hf)$$1).b());
      } else if ($$1 instanceof blc) {
         return a($$0, ((blc)$$1).b());
      } else if ($$1 instanceof bhq) {
         bis $$3 = ((bhq)$$1).d();
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

   private static void a(aks $$0, vy $$1) {
      vf<?> $$2 = new vj($$1);

      for (akt $$3 : $$0.v()) {
         $$3.c.b($$2);
      }
   }
}
