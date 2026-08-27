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

public class cok {
   private static final Logger a = LogUtils.getLogger();
   private final com b;
   private final Map<akn, coj> c;
   private final col d;

   cok(com $$0, col $$1, Map<akn, coj> $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public boolean a(col $$0) {
      return $$0.a(this.d);
   }

   public col a() {
      return this.d;
   }

   public col a(Iterable<akn> $$0) {
      return this.a($$0, $$0x -> a.warn("Unknown feature flag: {}", $$0x));
   }

   public col a(coj... $$0) {
      return col.a(this.b, Arrays.asList($$0));
   }

   public col a(Iterable<akn> $$0, Consumer<akn> $$1) {
      Set<coj> $$2 = Sets.newIdentityHashSet();

      for (akn $$3 : $$0) {
         coj $$4 = this.c.get($$3);
         if ($$4 == null) {
            $$1.accept($$3);
         } else {
            $$2.add($$4);
         }
      }

      return col.a(this.b, $$2);
   }

   public Set<akn> b(col $$0) {
      Set<akn> $$1 = new HashSet<>();
      this.c.forEach(($$2, $$3) -> {
         if ($$0.b($$3)) {
            $$1.add($$2);
         }
      });
      return $$1;
   }

   public Codec<col> b() {
      return akn.a.listOf().comapFlatMap($$0 -> {
         Set<akn> $$1 = new HashSet<>();
         col $$2 = this.a($$0, $$1::add);
         return !$$1.isEmpty() ? DataResult.error(() -> "Unknown feature ids: " + $$1, $$2) : DataResult.success($$2);
      }, $$0 -> List.copyOf(this.b($$0)));
   }

   public static class a {
      private final com a;
      private int b;
      private final Map<akn, coj> c = new LinkedHashMap<>();

      public a(String $$0) {
         this.a = new com($$0);
      }

      public coj a(String $$0) {
         return this.a(new akn("minecraft", $$0));
      }

      public coj a(akn $$0) {
         if (this.b >= 64) {
            throw new IllegalStateException("Too many feature flags");
         } else {
            coj $$1 = new coj(this.a, this.b++);
            coj $$2 = this.c.put($$0, $$1);
            if ($$2 != null) {
               throw new IllegalStateException("Duplicate feature flag " + $$0);
            } else {
               return $$1;
            }
         }
      }

      public cok a() {
         col $$0 = col.a(this.a, this.c.values());
         return new cok(this.a, $$0, Map.copyOf(this.c));
      }
   }
}
