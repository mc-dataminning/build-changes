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

public class cqm {
   private static final Logger a = LogUtils.getLogger();
   private final cqo b;
   private final Map<alc, cql> c;
   private final cqn d;

   cqm(cqo $$0, cqn $$1, Map<alc, cql> $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public boolean a(cqn $$0) {
      return $$0.a(this.d);
   }

   public cqn a() {
      return this.d;
   }

   public cqn a(Iterable<alc> $$0) {
      return this.a($$0, $$0x -> a.warn("Unknown feature flag: {}", $$0x));
   }

   public cqn a(cql... $$0) {
      return cqn.a(this.b, Arrays.asList($$0));
   }

   public cqn a(Iterable<alc> $$0, Consumer<alc> $$1) {
      Set<cql> $$2 = Sets.newIdentityHashSet();

      for (alc $$3 : $$0) {
         cql $$4 = this.c.get($$3);
         if ($$4 == null) {
            $$1.accept($$3);
         } else {
            $$2.add($$4);
         }
      }

      return cqn.a(this.b, $$2);
   }

   public Set<alc> b(cqn $$0) {
      Set<alc> $$1 = new HashSet<>();
      this.c.forEach(($$2, $$3) -> {
         if ($$0.b($$3)) {
            $$1.add($$2);
         }
      });
      return $$1;
   }

   public Codec<cqn> b() {
      return alc.a.listOf().comapFlatMap($$0 -> {
         Set<alc> $$1 = new HashSet<>();
         cqn $$2 = this.a($$0, $$1::add);
         return !$$1.isEmpty() ? DataResult.error(() -> "Unknown feature ids: " + $$1, $$2) : DataResult.success($$2);
      }, $$0 -> List.copyOf(this.b($$0)));
   }

   public static class a {
      private final cqo a;
      private int b;
      private final Map<alc, cql> c = new LinkedHashMap<>();

      public a(String $$0) {
         this.a = new cqo($$0);
      }

      public cql a(String $$0) {
         return this.a(alc.b($$0));
      }

      public cql a(alc $$0) {
         if (this.b >= 64) {
            throw new IllegalStateException("Too many feature flags");
         } else {
            cql $$1 = new cql(this.a, this.b++);
            cql $$2 = this.c.put($$0, $$1);
            if ($$2 != null) {
               throw new IllegalStateException("Duplicate feature flag " + $$0);
            } else {
               return $$1;
            }
         }
      }

      public cqm a() {
         cqn $$0 = cqn.a(this.a, this.c.values());
         return new cqm(this.a, $$0, Map.copyOf(this.c));
      }
   }
}
