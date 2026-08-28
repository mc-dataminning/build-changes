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

public class ctd {
   private static final Logger a = LogUtils.getLogger();
   private final ctf b;
   private final Map<ald, ctc> c;
   private final cte d;

   ctd(ctf $$0, cte $$1, Map<ald, ctc> $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public boolean a(cte $$0) {
      return $$0.a(this.d);
   }

   public cte a() {
      return this.d;
   }

   public cte a(Iterable<ald> $$0) {
      return this.a($$0, $$0x -> a.warn("Unknown feature flag: {}", $$0x));
   }

   public cte a(ctc... $$0) {
      return cte.a(this.b, Arrays.asList($$0));
   }

   public cte a(Iterable<ald> $$0, Consumer<ald> $$1) {
      Set<ctc> $$2 = Sets.newIdentityHashSet();

      for (ald $$3 : $$0) {
         ctc $$4 = this.c.get($$3);
         if ($$4 == null) {
            $$1.accept($$3);
         } else {
            $$2.add($$4);
         }
      }

      return cte.a(this.b, $$2);
   }

   public Set<ald> b(cte $$0) {
      Set<ald> $$1 = new HashSet<>();
      this.c.forEach(($$2, $$3) -> {
         if ($$0.b($$3)) {
            $$1.add($$2);
         }
      });
      return $$1;
   }

   public Codec<cte> b() {
      return ald.a.listOf().comapFlatMap($$0 -> {
         Set<ald> $$1 = new HashSet<>();
         cte $$2 = this.a($$0, $$1::add);
         return !$$1.isEmpty() ? DataResult.error(() -> "Unknown feature ids: " + $$1, $$2) : DataResult.success($$2);
      }, $$0 -> List.copyOf(this.b($$0)));
   }

   public static class a {
      private final ctf a;
      private int b;
      private final Map<ald, ctc> c = new LinkedHashMap<>();

      public a(String $$0) {
         this.a = new ctf($$0);
      }

      public ctc a(String $$0) {
         return this.a(ald.b($$0));
      }

      public ctc a(ald $$0) {
         if (this.b >= 64) {
            throw new IllegalStateException("Too many feature flags");
         } else {
            ctc $$1 = new ctc(this.a, this.b++);
            ctc $$2 = this.c.put($$0, $$1);
            if ($$2 != null) {
               throw new IllegalStateException("Duplicate feature flag " + $$0);
            } else {
               return $$1;
            }
         }
      }

      public ctd a() {
         cte $$0 = cte.a(this.a, this.c.values());
         return new ctd(this.a, $$0, Map.copyOf(this.c));
      }
   }
}
