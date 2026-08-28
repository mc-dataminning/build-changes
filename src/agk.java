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

public class agk {
   private static final Logger a = LogUtils.getLogger();

   public static void a(aro $$0, iu $$1, String $$2, int $$3, int $$4) {
      a($$0, (aag)(new aak($$1, $$3, $$2, $$4)));
   }

   public static void a(aro $$0) {
      a($$0, (aag)(new aal()));
   }

   public static void a(aro $$0, dhw $$1) {
   }

   public static void a(aro $$0, iu $$1) {
      d($$0, $$1);
   }

   public static void b(aro $$0, iu $$1) {
      d($$0, $$1);
   }

   public static void c(aro $$0, iu $$1) {
      d($$0, $$1);
   }

   private static void d(aro $$0, iu $$1) {
   }

   public static void a(dip $$0, bxb $$1, @Nullable ewj $$2, float $$3) {
   }

   public static void a(dip $$0, iu $$1) {
   }

   public static void a(dip $$0, aau $$1) {
      if ($$0 instanceof aro $$2) {
         a($$2, (aag)$$1);
      }
   }

   public static void a(djo $$0, eqq $$1) {
   }

   public static void a(dip $$0, bxb $$1, cdw $$2) {
   }

   public static void a(aro $$0, Collection<csh> $$1) {
   }

   public static void a(bwz $$0) {
   }

   public static void a(cip $$0) {
   }

   public static void a(coq $$0) {
   }

   public static void a(dip $$0, je<eeo> $$1, fdw $$2) {
   }

   public static void a(dip $$0, eeq $$1) {
   }

   public static void a(dip $$0, iu $$1, dzo $$2, dwk $$3) {
   }

   private static List<String> a(bwz $$0, long $$1) {
      Map<cgb<?>, Optional<? extends cga<?>>> $$2 = $$0.eb().b();
      List<String> $$3 = Lists.newArrayList();

      for (Entry<cgb<?>, Optional<? extends cga<?>>> $$4 : $$2.entrySet()) {
         cgb<?> $$5 = $$4.getKey();
         Optional<? extends cga<?>> $$6 = $$4.getValue();
         String $$10;
         if ($$6.isPresent()) {
            cga<?> $$7 = (cga<?>)$$6.get();
            Object $$8 = $$7.c();
            if ($$5 == cgb.E) {
               long $$9 = $$1 - (Long)$$8;
               $$10 = $$9 + " ticks ago";
            } else if ($$7.e()) {
               $$10 = a((aro)$$0.dV(), $$8) + " (ttl: " + $$7.b() + ")";
            } else {
               $$10 = a((aro)$$0.dV(), $$8);
            }
         } else {
            $$10 = "-";
         }

         $$3.add(mf.z.b($$5).a() + ": " + $$10);
      }

      $$3.sort(String::compareTo);
      return $$3;
   }

   private static String a(aro $$0, @Nullable Object $$1) {
      if ($$1 == null) {
         return "-";
      } else if ($$1 instanceof UUID) {
         return a($$0, $$0.b((UUID)$$1));
      } else if ($$1 instanceof bwz) {
         bwa $$2 = (bwa)$$1;
         return agj.a($$2);
      } else if ($$1 instanceof bub) {
         return ((bub)$$1).al().getString();
      } else if ($$1 instanceof cge) {
         return a($$0, ((cge)$$1).a());
      } else if ($$1 instanceof bzb) {
         return a($$0, ((bzb)$$1).c());
      } else if ($$1 instanceof jd) {
         return a($$0, ((jd)$$1).b());
      } else if ($$1 instanceof byt) {
         return a($$0, ((byt)$$1).b());
      } else if ($$1 instanceof bup) {
         bwa $$3 = ((bup)$$1).d();
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

   private static void a(aro $$0, aag $$1) {
      zd<?> $$2 = new zk($$1);

      for (arp $$3 : $$0.z()) {
         $$3.f.b($$2);
      }
   }
}
