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

public class cgc {
   private static final Logger a = LogUtils.getLogger();
   private final cge b;
   private final Map<agi, cgb> c;
   private final cgd d;

   cgc(cge $$0, cgd $$1, Map<agi, cgb> $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public boolean a(cgd $$0) {
      return $$0.a(this.d);
   }

   public cgd a() {
      return this.d;
   }

   public cgd a(Iterable<agi> $$0) {
      return this.a($$0, $$0x -> a.warn("Unknown feature flag: {}", $$0x));
   }

   public cgd a(cgb... $$0) {
      return cgd.a(this.b, Arrays.asList($$0));
   }

   public cgd a(Iterable<agi> $$0, Consumer<agi> $$1) {
      Set<cgb> $$2 = Sets.newIdentityHashSet();

      for (agi $$3 : $$0) {
         cgb $$4 = this.c.get($$3);
         if ($$4 == null) {
            $$1.accept($$3);
         } else {
            $$2.add($$4);
         }
      }

      return cgd.a(this.b, $$2);
   }

   public Set<agi> b(cgd $$0) {
      Set<agi> $$1 = new HashSet<>();
      this.c.forEach(($$2, $$3) -> {
         if ($$0.b($$3)) {
            $$1.add($$2);
         }
      });
      return $$1;
   }

   public Codec<cgd> b() {
      return agi.a.listOf().comapFlatMap($$0 -> {
         Set<agi> $$1 = new HashSet<>();
         cgd $$2 = this.a($$0, $$1::add);
         return !$$1.isEmpty() ? DataResult.error(() -> "Unknown feature ids: " + $$1, $$2) : DataResult.success($$2);
      }, $$0 -> List.copyOf(this.b($$0)));
   }

   public static class a {
      private final cge a;
      private int b;
      private final Map<agi, cgb> c = new LinkedHashMap<>();

      public a(String $$0) {
         this.a = new cge($$0);
      }

      public cgb a(String $$0) {
         return this.a(new agi("minecraft", $$0));
      }

      public cgb a(agi $$0) {
         if (this.b >= 64) {
            throw new IllegalStateException("Too many feature flags");
         } else {
            cgb $$1 = new cgb(this.a, this.b++);
            cgb $$2 = this.c.put($$0, $$1);
            if ($$2 != null) {
               throw new IllegalStateException("Duplicate feature flag " + $$0);
            } else {
               return $$1;
            }
         }
      }

      public cgc a() {
         cgd $$0 = cgd.a(this.a, this.c.values());
         return new cgc(this.a, $$0, Map.copyOf(this.c));
      }
   }
}
