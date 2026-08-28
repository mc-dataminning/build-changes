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

public class cqp {
   private static final Logger a = LogUtils.getLogger();
   private final cqr b;
   private final Map<ale, cqo> c;
   private final cqq d;

   cqp(cqr $$0, cqq $$1, Map<ale, cqo> $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public boolean a(cqq $$0) {
      return $$0.a(this.d);
   }

   public cqq a() {
      return this.d;
   }

   public cqq a(Iterable<ale> $$0) {
      return this.a($$0, $$0x -> a.warn("Unknown feature flag: {}", $$0x));
   }

   public cqq a(cqo... $$0) {
      return cqq.a(this.b, Arrays.asList($$0));
   }

   public cqq a(Iterable<ale> $$0, Consumer<ale> $$1) {
      Set<cqo> $$2 = Sets.newIdentityHashSet();

      for (ale $$3 : $$0) {
         cqo $$4 = this.c.get($$3);
         if ($$4 == null) {
            $$1.accept($$3);
         } else {
            $$2.add($$4);
         }
      }

      return cqq.a(this.b, $$2);
   }

   public Set<ale> b(cqq $$0) {
      Set<ale> $$1 = new HashSet<>();
      this.c.forEach(($$2, $$3) -> {
         if ($$0.b($$3)) {
            $$1.add($$2);
         }
      });
      return $$1;
   }

   public Codec<cqq> b() {
      return ale.a.listOf().comapFlatMap($$0 -> {
         Set<ale> $$1 = new HashSet<>();
         cqq $$2 = this.a($$0, $$1::add);
         return !$$1.isEmpty() ? DataResult.error(() -> "Unknown feature ids: " + $$1, $$2) : DataResult.success($$2);
      }, $$0 -> List.copyOf(this.b($$0)));
   }

   public static class a {
      private final cqr a;
      private int b;
      private final Map<ale, cqo> c = new LinkedHashMap<>();

      public a(String $$0) {
         this.a = new cqr($$0);
      }

      public cqo a(String $$0) {
         return this.a(ale.b($$0));
      }

      public cqo a(ale $$0) {
         if (this.b >= 64) {
            throw new IllegalStateException("Too many feature flags");
         } else {
            cqo $$1 = new cqo(this.a, this.b++);
            cqo $$2 = this.c.put($$0, $$1);
            if ($$2 != null) {
               throw new IllegalStateException("Duplicate feature flag " + $$0);
            } else {
               return $$1;
            }
         }
      }

      public cqp a() {
         cqq $$0 = cqq.a(this.a, this.c.values());
         return new cqp(this.a, $$0, Map.copyOf(this.c));
      }
   }
}
