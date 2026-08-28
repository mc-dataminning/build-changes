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

public class cvr {
   private static final Logger a = LogUtils.getLogger();
   private final cvt b;
   private final Map<alr, cvq> c;
   private final cvs d;

   cvr(cvt $$0, cvs $$1, Map<alr, cvq> $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public boolean a(cvs $$0) {
      return $$0.a(this.d);
   }

   public cvs a() {
      return this.d;
   }

   public cvs a(Iterable<alr> $$0) {
      return this.a($$0, $$0x -> a.warn("Unknown feature flag: {}", $$0x));
   }

   public cvs a(cvq... $$0) {
      return cvs.a(this.b, Arrays.asList($$0));
   }

   public cvs a(Iterable<alr> $$0, Consumer<alr> $$1) {
      Set<cvq> $$2 = Sets.newIdentityHashSet();

      for (alr $$3 : $$0) {
         cvq $$4 = this.c.get($$3);
         if ($$4 == null) {
            $$1.accept($$3);
         } else {
            $$2.add($$4);
         }
      }

      return cvs.a(this.b, $$2);
   }

   public Set<alr> b(cvs $$0) {
      Set<alr> $$1 = new HashSet<>();
      this.c.forEach(($$2, $$3) -> {
         if ($$0.b($$3)) {
            $$1.add($$2);
         }
      });
      return $$1;
   }

   public Codec<cvs> b() {
      return alr.a.listOf().comapFlatMap($$0 -> {
         Set<alr> $$1 = new HashSet<>();
         cvs $$2 = this.a($$0, $$1::add);
         return !$$1.isEmpty() ? DataResult.error(() -> "Unknown feature ids: " + $$1, $$2) : DataResult.success($$2);
      }, $$0 -> List.copyOf(this.b($$0)));
   }

   public static class a {
      private final cvt a;
      private int b;
      private final Map<alr, cvq> c = new LinkedHashMap<>();

      public a(String $$0) {
         this.a = new cvt($$0);
      }

      public cvq a(String $$0) {
         return this.a(alr.b($$0));
      }

      public cvq a(alr $$0) {
         if (this.b >= 64) {
            throw new IllegalStateException("Too many feature flags");
         } else {
            cvq $$1 = new cvq(this.a, this.b++);
            cvq $$2 = this.c.put($$0, $$1);
            if ($$2 != null) {
               throw new IllegalStateException("Duplicate feature flag " + $$0);
            } else {
               return $$1;
            }
         }
      }

      public cvr a() {
         cvs $$0 = cvs.a(this.a, this.c.values());
         return new cvr(this.a, $$0, Map.copyOf(this.c));
      }
   }
}
