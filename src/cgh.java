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

public class cgh {
   private static final Logger a = LogUtils.getLogger();
   private final cgj b;
   private final Map<agm, cgg> c;
   private final cgi d;

   cgh(cgj $$0, cgi $$1, Map<agm, cgg> $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public boolean a(cgi $$0) {
      return $$0.a(this.d);
   }

   public cgi a() {
      return this.d;
   }

   public cgi a(Iterable<agm> $$0) {
      return this.a($$0, $$0x -> a.warn("Unknown feature flag: {}", $$0x));
   }

   public cgi a(cgg... $$0) {
      return cgi.a(this.b, Arrays.asList($$0));
   }

   public cgi a(Iterable<agm> $$0, Consumer<agm> $$1) {
      Set<cgg> $$2 = Sets.newIdentityHashSet();

      for (agm $$3 : $$0) {
         cgg $$4 = this.c.get($$3);
         if ($$4 == null) {
            $$1.accept($$3);
         } else {
            $$2.add($$4);
         }
      }

      return cgi.a(this.b, $$2);
   }

   public Set<agm> b(cgi $$0) {
      Set<agm> $$1 = new HashSet<>();
      this.c.forEach(($$2, $$3) -> {
         if ($$0.b($$3)) {
            $$1.add($$2);
         }
      });
      return $$1;
   }

   public Codec<cgi> b() {
      return agm.a.listOf().comapFlatMap($$0 -> {
         Set<agm> $$1 = new HashSet<>();
         cgi $$2 = this.a($$0, $$1::add);
         return !$$1.isEmpty() ? DataResult.error(() -> "Unknown feature ids: " + $$1, $$2) : DataResult.success($$2);
      }, $$0 -> List.copyOf(this.b($$0)));
   }

   public static class a {
      private final cgj a;
      private int b;
      private final Map<agm, cgg> c = new LinkedHashMap<>();

      public a(String $$0) {
         this.a = new cgj($$0);
      }

      public cgg a(String $$0) {
         return this.a(new agm("minecraft", $$0));
      }

      public cgg a(agm $$0) {
         if (this.b >= 64) {
            throw new IllegalStateException("Too many feature flags");
         } else {
            cgg $$1 = new cgg(this.a, this.b++);
            cgg $$2 = this.c.put($$0, $$1);
            if ($$2 != null) {
               throw new IllegalStateException("Duplicate feature flag " + $$0);
            } else {
               return $$1;
            }
         }
      }

      public cgh a() {
         cgi $$0 = cgi.a(this.a, this.c.values());
         return new cgh(this.a, $$0, Map.copyOf(this.c));
      }
   }
}
