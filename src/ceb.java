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

public class ceb {
   private static final Logger a = LogUtils.getLogger();
   private final ced b;
   private final Map<aex, cea> c;
   private final cec d;

   ceb(ced $$0, cec $$1, Map<aex, cea> $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public boolean a(cec $$0) {
      return $$0.a(this.d);
   }

   public cec a() {
      return this.d;
   }

   public cec a(Iterable<aex> $$0) {
      return this.a($$0, $$0x -> a.warn("Unknown feature flag: {}", $$0x));
   }

   public cec a(cea... $$0) {
      return cec.a(this.b, Arrays.asList($$0));
   }

   public cec a(Iterable<aex> $$0, Consumer<aex> $$1) {
      Set<cea> $$2 = Sets.newIdentityHashSet();

      for (aex $$3 : $$0) {
         cea $$4 = this.c.get($$3);
         if ($$4 == null) {
            $$1.accept($$3);
         } else {
            $$2.add($$4);
         }
      }

      return cec.a(this.b, $$2);
   }

   public Set<aex> b(cec $$0) {
      Set<aex> $$1 = new HashSet<>();
      this.c.forEach(($$2, $$3) -> {
         if ($$0.b($$3)) {
            $$1.add($$2);
         }
      });
      return $$1;
   }

   public Codec<cec> b() {
      return aex.a.listOf().comapFlatMap($$0 -> {
         Set<aex> $$1 = new HashSet<>();
         cec $$2 = this.a($$0, $$1::add);
         return !$$1.isEmpty() ? DataResult.error(() -> "Unknown feature ids: " + $$1, $$2) : DataResult.success($$2);
      }, $$0 -> List.copyOf(this.b($$0)));
   }

   public static class a {
      private final ced a;
      private int b;
      private final Map<aex, cea> c = new LinkedHashMap<>();

      public a(String $$0) {
         this.a = new ced($$0);
      }

      public cea a(String $$0) {
         return this.a(new aex("minecraft", $$0));
      }

      public cea a(aex $$0) {
         if (this.b >= 64) {
            throw new IllegalStateException("Too many feature flags");
         } else {
            cea $$1 = new cea(this.a, this.b++);
            cea $$2 = this.c.put($$0, $$1);
            if ($$2 != null) {
               throw new IllegalStateException("Duplicate feature flag " + $$0);
            } else {
               return $$1;
            }
         }
      }

      public ceb a() {
         cec $$0 = cec.a(this.a, this.c.values());
         return new ceb(this.a, $$0, Map.copyOf(this.c));
      }
   }
}
