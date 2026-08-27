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

public class ced {
   private static final Logger a = LogUtils.getLogger();
   private final cef b;
   private final Map<aey, cec> c;
   private final cee d;

   ced(cef $$0, cee $$1, Map<aey, cec> $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public boolean a(cee $$0) {
      return $$0.a(this.d);
   }

   public cee a() {
      return this.d;
   }

   public cee a(Iterable<aey> $$0) {
      return this.a($$0, $$0x -> a.warn("Unknown feature flag: {}", $$0x));
   }

   public cee a(cec... $$0) {
      return cee.a(this.b, Arrays.asList($$0));
   }

   public cee a(Iterable<aey> $$0, Consumer<aey> $$1) {
      Set<cec> $$2 = Sets.newIdentityHashSet();

      for (aey $$3 : $$0) {
         cec $$4 = this.c.get($$3);
         if ($$4 == null) {
            $$1.accept($$3);
         } else {
            $$2.add($$4);
         }
      }

      return cee.a(this.b, $$2);
   }

   public Set<aey> b(cee $$0) {
      Set<aey> $$1 = new HashSet<>();
      this.c.forEach(($$2, $$3) -> {
         if ($$0.b($$3)) {
            $$1.add($$2);
         }
      });
      return $$1;
   }

   public Codec<cee> b() {
      return aey.a.listOf().comapFlatMap($$0 -> {
         Set<aey> $$1 = new HashSet<>();
         cee $$2 = this.a($$0, $$1::add);
         return !$$1.isEmpty() ? DataResult.error(() -> "Unknown feature ids: " + $$1, $$2) : DataResult.success($$2);
      }, $$0 -> List.copyOf(this.b($$0)));
   }

   public static class a {
      private final cef a;
      private int b;
      private final Map<aey, cec> c = new LinkedHashMap<>();

      public a(String $$0) {
         this.a = new cef($$0);
      }

      public cec a(String $$0) {
         return this.a(new aey("minecraft", $$0));
      }

      public cec a(aey $$0) {
         if (this.b >= 64) {
            throw new IllegalStateException("Too many feature flags");
         } else {
            cec $$1 = new cec(this.a, this.b++);
            cec $$2 = this.c.put($$0, $$1);
            if ($$2 != null) {
               throw new IllegalStateException("Duplicate feature flag " + $$0);
            } else {
               return $$1;
            }
         }
      }

      public ced a() {
         cee $$0 = cee.a(this.a, this.c.values());
         return new ced(this.a, $$0, Map.copyOf(this.c));
      }
   }
}
