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

public class cri {
   private static final Logger a = LogUtils.getLogger();
   private final crk b;
   private final Map<all, crh> c;
   private final crj d;

   cri(crk $$0, crj $$1, Map<all, crh> $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public boolean a(crj $$0) {
      return $$0.a(this.d);
   }

   public crj a() {
      return this.d;
   }

   public crj a(Iterable<all> $$0) {
      return this.a($$0, $$0x -> a.warn("Unknown feature flag: {}", $$0x));
   }

   public crj a(crh... $$0) {
      return crj.a(this.b, Arrays.asList($$0));
   }

   public crj a(Iterable<all> $$0, Consumer<all> $$1) {
      Set<crh> $$2 = Sets.newIdentityHashSet();

      for (all $$3 : $$0) {
         crh $$4 = this.c.get($$3);
         if ($$4 == null) {
            $$1.accept($$3);
         } else {
            $$2.add($$4);
         }
      }

      return crj.a(this.b, $$2);
   }

   public Set<all> b(crj $$0) {
      Set<all> $$1 = new HashSet<>();
      this.c.forEach(($$2, $$3) -> {
         if ($$0.b($$3)) {
            $$1.add($$2);
         }
      });
      return $$1;
   }

   public Codec<crj> b() {
      return all.a.listOf().comapFlatMap($$0 -> {
         Set<all> $$1 = new HashSet<>();
         crj $$2 = this.a($$0, $$1::add);
         return !$$1.isEmpty() ? DataResult.error(() -> "Unknown feature ids: " + $$1, $$2) : DataResult.success($$2);
      }, $$0 -> List.copyOf(this.b($$0)));
   }

   public static class a {
      private final crk a;
      private int b;
      private final Map<all, crh> c = new LinkedHashMap<>();

      public a(String $$0) {
         this.a = new crk($$0);
      }

      public crh a(String $$0) {
         return this.a(all.b($$0));
      }

      public crh a(all $$0) {
         if (this.b >= 64) {
            throw new IllegalStateException("Too many feature flags");
         } else {
            crh $$1 = new crh(this.a, this.b++);
            crh $$2 = this.c.put($$0, $$1);
            if ($$2 != null) {
               throw new IllegalStateException("Duplicate feature flag " + $$0);
            } else {
               return $$1;
            }
         }
      }

      public cri a() {
         crj $$0 = crj.a(this.a, this.c.values());
         return new cri(this.a, $$0, Map.copyOf(this.c));
      }
   }
}
