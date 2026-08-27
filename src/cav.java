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

public class cav {
   private static final Logger a = LogUtils.getLogger();
   private final cax b;
   private final Map<acq, cau> c;
   private final caw d;

   cav(cax $$0, caw $$1, Map<acq, cau> $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public boolean a(caw $$0) {
      return $$0.a(this.d);
   }

   public caw a() {
      return this.d;
   }

   public caw a(Iterable<acq> $$0) {
      return this.a($$0, $$0x -> a.warn("Unknown feature flag: {}", $$0x));
   }

   public caw a(cau... $$0) {
      return caw.a(this.b, Arrays.asList($$0));
   }

   public caw a(Iterable<acq> $$0, Consumer<acq> $$1) {
      Set<cau> $$2 = Sets.newIdentityHashSet();

      for (acq $$3 : $$0) {
         cau $$4 = this.c.get($$3);
         if ($$4 == null) {
            $$1.accept($$3);
         } else {
            $$2.add($$4);
         }
      }

      return caw.a(this.b, $$2);
   }

   public Set<acq> b(caw $$0) {
      Set<acq> $$1 = new HashSet<>();
      this.c.forEach(($$2, $$3) -> {
         if ($$0.b($$3)) {
            $$1.add($$2);
         }
      });
      return $$1;
   }

   public Codec<caw> b() {
      return acq.a.listOf().comapFlatMap($$0 -> {
         Set<acq> $$1 = new HashSet<>();
         caw $$2 = this.a($$0, $$1::add);
         return !$$1.isEmpty() ? DataResult.error(() -> "Unknown feature ids: " + $$1, $$2) : DataResult.success($$2);
      }, $$0 -> List.copyOf(this.b($$0)));
   }

   public static class a {
      private final cax a;
      private int b;
      private final Map<acq, cau> c = new LinkedHashMap<>();

      public a(String $$0) {
         this.a = new cax($$0);
      }

      public cau a(String $$0) {
         return this.a(new acq("minecraft", $$0));
      }

      public cau a(acq $$0) {
         if (this.b >= 64) {
            throw new IllegalStateException("Too many feature flags");
         } else {
            cau $$1 = new cau(this.a, this.b++);
            cau $$2 = this.c.put($$0, $$1);
            if ($$2 != null) {
               throw new IllegalStateException("Duplicate feature flag " + $$0);
            } else {
               return $$1;
            }
         }
      }

      public cav a() {
         caw $$0 = caw.a(this.a, this.c.values());
         return new cav(this.a, $$0, Map.copyOf(this.c));
      }
   }
}
