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

public class fnt {
   private final Optional<akv> a;
   private final Set<fnw> b;
   private final Optional<String> c;

   public fnt(Optional<akv> $$0, Optional<String> $$1, fnw... $$2) {
      this.a = $$0;
      this.c = $$1;
      this.b = ImmutableSet.copyOf($$2);
   }

   public akv a(djn $$0) {
      return fns.a($$0, this.c.orElse(""));
   }

   public akv a(djn $$0, fnv $$1, BiConsumer<akv, fnr> $$2) {
      return this.a(fns.a($$0, this.c.orElse("")), $$1, $$2);
   }

   public akv a(djn $$0, String $$1, fnv $$2, BiConsumer<akv, fnr> $$3) {
      return this.a(fns.a($$0, $$1 + this.c.orElse("")), $$2, $$3);
   }

   public akv b(djn $$0, String $$1, fnv $$2, BiConsumer<akv, fnr> $$3) {
      return this.a(fns.a($$0, $$1), $$2, $$3);
   }

   public akv a(cwm $$0, fnv $$1, BiConsumer<akv, fnr> $$2) {
      return this.a(fns.a($$0, this.c.orElse("")), $$1, $$2);
   }

   public akv a(akv $$0, fnv $$1, BiConsumer<akv, fnr> $$2) {
      Map<fnw, akv> $$3 = this.a($$1);
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

   private Map<fnw, akv> a(fnv $$0) {
      return Streams.concat(new Stream[]{this.b.stream(), $$0.a()}).collect(ImmutableMap.toImmutableMap(Function.identity(), $$0::a));
   }
}
