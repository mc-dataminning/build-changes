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

public class agc {
   private static final Logger a = LogUtils.getLogger();

   public static void a(ard $$0, ji $$1, String $$2, int $$3, int $$4) {
      a($$0, (zz)(new aad($$1, $$3, $$2, $$4)));
   }

   public static void a(ard $$0) {
      a($$0, (zz)(new aae()));
   }

   public static void a(ard $$0, dgg $$1) {
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

   public static void a(dgz $$0, bwa $$1, @Nullable euk $$2, float $$3) {
   }

   public static void a(dgz $$0, ji $$1) {
   }

   public static void a(dgz $$0, aan $$1) {
      if ($$0 instanceof ard $$2) {
         a($$2, (zz)$$1);
      }
   }

   public static void a(dhy $$0, eor $$1) {
   }

   public static void a(dgz $$0, bwa $$1, ccx $$2) {
   }

   public static void a(ard $$0, Collection<cre> $$1) {
   }

   public static void a(bvy $$0) {
   }

   public static void a(chq $$0) {
   }

   public static void a(cno $$0) {
   }

   public static void a(dgz $$0, jr<ecp> $$1, fbx $$2) {
   }

   public static void a(dgz $$0, ecr $$1) {
   }

   public static void a(dgz $$0, ji $$1, dxq $$2, dup $$3) {
   }

   private static List<String> a(bvy $$0, long $$1) {
      Map<cfc<?>, Optional<? extends cfb<?>>> $$2 = $$0.ea().b();
      List<String> $$3 = Lists.newArrayList();

      for (Entry<cfc<?>, Optional<? extends cfb<?>>> $$4 : $$2.entrySet()) {
         cfc<?> $$5 = $$4.getKey();
         Optional<? extends cfb<?>> $$6 = $$4.getValue();
         String $$10;
         if ($$6.isPresent()) {
            cfb<?> $$7 = (cfb<?>)$$6.get();
            Object $$8 = $$7.c();
            if ($$5 == cfc.D) {
               long $$9 = $$1 - (Long)$$8;
               $$10 = $$9 + " ticks ago";
            } else if ($$7.e()) {
               $$10 = a((ard)$$0.dU(), $$8) + " (ttl: " + $$7.b() + ")";
            } else {
               $$10 = a((ard)$$0.dU(), $$8);
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
         return a($$0, $$0.b((UUID)$$1));
      } else if ($$1 instanceof bvy) {
         bva $$2 = (bva)$$1;
         return agb.a($$2);
      } else if ($$1 instanceof btb) {
         return ((btb)$$1).al().getString();
      } else if ($$1 instanceof cff) {
         return a($$0, ((cff)$$1).a());
      } else if ($$1 instanceof byc) {
         return a($$0, ((byc)$$1).c());
      } else if ($$1 instanceof jq) {
         return a($$0, ((jq)$$1).b());
      } else if ($$1 instanceof bxu) {
         return a($$0, ((bxu)$$1).b());
      } else if ($$1 instanceof btp) {
         bva $$3 = ((btp)$$1).d();
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
