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

public class chr {
   private static final Logger a = LogUtils.getLogger();
   private final cht b;
   private final Map<ahg, chq> c;
   private final chs d;

   chr(cht $$0, chs $$1, Map<ahg, chq> $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public boolean a(chs $$0) {
      return $$0.a(this.d);
   }

   public chs a() {
      return this.d;
   }

   public chs a(Iterable<ahg> $$0) {
      return this.a($$0, $$0x -> a.warn("Unknown feature flag: {}", $$0x));
   }

   public chs a(chq... $$0) {
      return chs.a(this.b, Arrays.asList($$0));
   }

   public chs a(Iterable<ahg> $$0, Consumer<ahg> $$1) {
      Set<chq> $$2 = Sets.newIdentityHashSet();

      for (ahg $$3 : $$0) {
         chq $$4 = this.c.get($$3);
         if ($$4 == null) {
            $$1.accept($$3);
         } else {
            $$2.add($$4);
         }
      }

      return chs.a(this.b, $$2);
   }

   public Set<ahg> b(chs $$0) {
      Set<ahg> $$1 = new HashSet<>();
      this.c.forEach(($$2, $$3) -> {
         if ($$0.b($$3)) {
            $$1.add($$2);
         }
      });
      return $$1;
   }

   public Codec<chs> b() {
      return ahg.a.listOf().comapFlatMap($$0 -> {
         Set<ahg> $$1 = new HashSet<>();
         chs $$2 = this.a($$0, $$1::add);
         return !$$1.isEmpty() ? DataResult.error(() -> "Unknown feature ids: " + $$1, $$2) : DataResult.success($$2);
      }, $$0 -> List.copyOf(this.b($$0)));
   }

   public static class a {
      private final cht a;
      private int b;
      private final Map<ahg, chq> c = new LinkedHashMap<>();

      public a(String $$0) {
         this.a = new cht($$0);
      }

      public chq a(String $$0) {
         return this.a(new ahg("minecraft", $$0));
      }

      public chq a(ahg $$0) {
         if (this.b >= 64) {
            throw new IllegalStateException("Too many feature flags");
         } else {
            chq $$1 = new chq(this.a, this.b++);
            chq $$2 = this.c.put($$0, $$1);
            if ($$2 != null) {
               throw new IllegalStateException("Duplicate feature flag " + $$0);
            } else {
               return $$1;
            }
         }
      }

      public chr a() {
         chs $$0 = chs.a(this.a, this.c.values());
         return new chr(this.a, $$0, Map.copyOf(this.c));
      }
   }
}
