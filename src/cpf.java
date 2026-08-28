import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import org.slf4j.Logger;

public class cpf {
   private static final Logger a = LogUtils.getLogger();
   private final cph b;
   private final Map<alb, cpe> c;
   private final cpg d;

   cpf(cph $$0, cpg $$1, Map<alb, cpe> $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public boolean a(cpg $$0) {
      return $$0.a(this.d);
   }

   public cpg a() {
      return this.d;
   }

   public cpg a(Iterable<alb> $$0) {
      return this.a($$0, $$0x -> a.warn("Unknown feature flag: {}", $$0x));
   }

   public cpg a(cpe... $$0) {
      return cpg.a(this.b, Arrays.asList($$0));
   }

   public cpg a(Iterable<alb> $$0, Consumer<alb> $$1) {
      Set<cpe> $$2 = Sets.newIdentityHashSet();

      for (alb $$3 : $$0) {
         cpe $$4 = this.c.get($$3);
         if ($$4 == null) {
            $$1.accept($$3);
         } else {
            $$2.add($$4);
         }
      }

      return cpg.a(this.b, $$2);
   }

   public Set<alb> b(cpg $$0) {
      Set<alb> $$1 = new HashSet<>();
      this.c.forEach(($$2, $$3) -> {
         if ($$0.b($$3)) {
            $$1.add($$2);
         }
      });
      return $$1;
   }

   public Codec<cpg> b() {
      return alb.a.listOf().comapFlatMap($$0 -> {
         Set<alb> $$1 = new HashSet<>();
         cpg $$2 = this.a($$0, $$1::add);
         return !$$1.isEmpty() ? DataResult.error(() -> "Unknown feature ids: " + $$1, $$2) : DataResult.success($$2);
      }, $$0 -> List.copyOf(this.b($$0)));
   }

   public static class a {
      private final cph a;
      private int b;
      private final Map<alb, cpe> c = new LinkedHashMap<>();

      public a(String $$0) {
         this.a = new cph($$0);
      }

      public cpe a(String $$0) {
         return this.a(new alb("minecraft", $$0));
      }

      public cpe a(alb $$0) {
         if (this.b >= 64) {
            throw new IllegalStateException("Too many feature flags");
         } else {
            cpe $$1 = new cpe(this.a, this.b++);
            cpe $$2 = this.c.put($$0, $$1);
            if ($$2 != null) {
               throw new IllegalStateException("Duplicate feature flag " + $$0);
            } else {
               return $$1;
            }
         }
      }

      public cpf a() {
         cpg $$0 = cpg.a(this.a, this.c.values());
         return new cpf(this.a, $$0, Map.copyOf(this.c));
      }
   }
}
