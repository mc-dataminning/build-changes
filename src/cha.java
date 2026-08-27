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

public class cha {
   private static final Logger a = LogUtils.getLogger();
   private final chc b;
   private final Map<agt, cgz> c;
   private final chb d;

   cha(chc $$0, chb $$1, Map<agt, cgz> $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public boolean a(chb $$0) {
      return $$0.a(this.d);
   }

   public chb a() {
      return this.d;
   }

   public chb a(Iterable<agt> $$0) {
      return this.a($$0, $$0x -> a.warn("Unknown feature flag: {}", $$0x));
   }

   public chb a(cgz... $$0) {
      return chb.a(this.b, Arrays.asList($$0));
   }

   public chb a(Iterable<agt> $$0, Consumer<agt> $$1) {
      Set<cgz> $$2 = Sets.newIdentityHashSet();

      for (agt $$3 : $$0) {
         cgz $$4 = this.c.get($$3);
         if ($$4 == null) {
            $$1.accept($$3);
         } else {
            $$2.add($$4);
         }
      }

      return chb.a(this.b, $$2);
   }

   public Set<agt> b(chb $$0) {
      Set<agt> $$1 = new HashSet<>();
      this.c.forEach(($$2, $$3) -> {
         if ($$0.b($$3)) {
            $$1.add($$2);
         }
      });
      return $$1;
   }

   public Codec<chb> b() {
      return agt.a.listOf().comapFlatMap($$0 -> {
         Set<agt> $$1 = new HashSet<>();
         chb $$2 = this.a($$0, $$1::add);
         return !$$1.isEmpty() ? DataResult.error(() -> "Unknown feature ids: " + $$1, $$2) : DataResult.success($$2);
      }, $$0 -> List.copyOf(this.b($$0)));
   }

   public static class a {
      private final chc a;
      private int b;
      private final Map<agt, cgz> c = new LinkedHashMap<>();

      public a(String $$0) {
         this.a = new chc($$0);
      }

      public cgz a(String $$0) {
         return this.a(new agt("minecraft", $$0));
      }

      public cgz a(agt $$0) {
         if (this.b >= 64) {
            throw new IllegalStateException("Too many feature flags");
         } else {
            cgz $$1 = new cgz(this.a, this.b++);
            cgz $$2 = this.c.put($$0, $$1);
            if ($$2 != null) {
               throw new IllegalStateException("Duplicate feature flag " + $$0);
            } else {
               return $$1;
            }
         }
      }

      public cha a() {
         chb $$0 = chb.a(this.a, this.c.values());
         return new cha(this.a, $$0, Map.copyOf(this.c));
      }
   }
}
