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

public class csj {
   private static final Logger a = LogUtils.getLogger();
   private final csl b;
   private final Map<alp, csi> c;
   private final csk d;

   csj(csl $$0, csk $$1, Map<alp, csi> $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public boolean a(csk $$0) {
      return $$0.a(this.d);
   }

   public csk a() {
      return this.d;
   }

   public csk a(Iterable<alp> $$0) {
      return this.a($$0, $$0x -> a.warn("Unknown feature flag: {}", $$0x));
   }

   public csk a(csi... $$0) {
      return csk.a(this.b, Arrays.asList($$0));
   }

   public csk a(Iterable<alp> $$0, Consumer<alp> $$1) {
      Set<csi> $$2 = Sets.newIdentityHashSet();

      for (alp $$3 : $$0) {
         csi $$4 = this.c.get($$3);
         if ($$4 == null) {
            $$1.accept($$3);
         } else {
            $$2.add($$4);
         }
      }

      return csk.a(this.b, $$2);
   }

   public Set<alp> b(csk $$0) {
      Set<alp> $$1 = new HashSet<>();
      this.c.forEach(($$2, $$3) -> {
         if ($$0.b($$3)) {
            $$1.add($$2);
         }
      });
      return $$1;
   }

   public Codec<csk> b() {
      return alp.a.listOf().comapFlatMap($$0 -> {
         Set<alp> $$1 = new HashSet<>();
         csk $$2 = this.a($$0, $$1::add);
         return !$$1.isEmpty() ? DataResult.error(() -> "Unknown feature ids: " + $$1, $$2) : DataResult.success($$2);
      }, $$0 -> List.copyOf(this.b($$0)));
   }

   public static class a {
      private final csl a;
      private int b;
      private final Map<alp, csi> c = new LinkedHashMap<>();

      public a(String $$0) {
         this.a = new csl($$0);
      }

      public csi a(String $$0) {
         return this.a(alp.b($$0));
      }

      public csi a(alp $$0) {
         if (this.b >= 64) {
            throw new IllegalStateException("Too many feature flags");
         } else {
            csi $$1 = new csi(this.a, this.b++);
            csi $$2 = this.c.put($$0, $$1);
            if ($$2 != null) {
               throw new IllegalStateException("Duplicate feature flag " + $$0);
            } else {
               return $$1;
            }
         }
      }

      public csj a() {
         csk $$0 = csk.a(this.a, this.c.values());
         return new csj(this.a, $$0, Map.copyOf(this.c));
      }
   }
}
