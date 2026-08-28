import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Streams;
import com.google.gson.JsonObject;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class frv {
   private final Optional<alg> a;
   private final Set<fry> b;
   private final Optional<String> c;

   public frv(Optional<alg> $$0, Optional<String> $$1, fry... $$2) {
      this.a = $$0;
      this.c = $$1;
      this.b = ImmutableSet.copyOf($$2);
   }

   public alg a(dmm $$0) {
      return fru.a($$0, this.c.orElse(""));
   }

   public alg a(dmm $$0, frx $$1, BiConsumer<alg, frt> $$2) {
      return this.a(fru.a($$0, this.c.orElse("")), $$1, $$2);
   }

   public alg a(dmm $$0, String $$1, frx $$2, BiConsumer<alg, frt> $$3) {
      return this.a(fru.a($$0, $$1 + this.c.orElse("")), $$2, $$3);
   }

   public alg b(dmm $$0, String $$1, frx $$2, BiConsumer<alg, frt> $$3) {
      return this.a(fru.a($$0, $$1), $$2, $$3);
   }

   public alg a(czg $$0, frx $$1, BiConsumer<alg, frt> $$2) {
      return this.a(fru.a($$0, this.c.orElse("")), $$1, $$2);
   }

   public alg a(alg $$0, frx $$1, BiConsumer<alg, frt> $$2) {
      Map<fry, alg> $$3 = this.a($$1);
      $$2.accept($$0, () -> {
         JsonObject $$1x = new JsonObject();
         this.a.ifPresent($$1xx -> $$1x.addProperty("parent", $$1xx.toString()));
         if (!$$3.isEmpty()) {
            JsonObject $$2x = new JsonObject();
            $$3.forEach(($$1xx, $$2xx) -> $$2x.addProperty($$1xx.a(), $$2xx.toString()));
            $$1x.add("textures", $$2x);
         }

         return $$1x;
      });
      return $$0;
   }

   private Map<fry, alg> a(frx $$0) {
      return Streams.concat(new Stream[]{this.b.stream(), $$0.a()}).collect(ImmutableMap.toImmutableMap(Function.identity(), $$0::a));
   }
}
