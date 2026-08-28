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

public class fnp {
   private final Optional<aku> a;
   private final Set<fns> b;
   private final Optional<String> c;

   public fnp(Optional<aku> $$0, Optional<String> $$1, fns... $$2) {
      this.a = $$0;
      this.c = $$1;
      this.b = ImmutableSet.copyOf($$2);
   }

   public aku a(djk $$0) {
      return fno.a($$0, this.c.orElse(""));
   }

   public aku a(djk $$0, fnr $$1, BiConsumer<aku, fnn> $$2) {
      return this.a(fno.a($$0, this.c.orElse("")), $$1, $$2);
   }

   public aku a(djk $$0, String $$1, fnr $$2, BiConsumer<aku, fnn> $$3) {
      return this.a(fno.a($$0, $$1 + this.c.orElse("")), $$2, $$3);
   }

   public aku b(djk $$0, String $$1, fnr $$2, BiConsumer<aku, fnn> $$3) {
      return this.a(fno.a($$0, $$1), $$2, $$3);
   }

   public aku a(cwj $$0, fnr $$1, BiConsumer<aku, fnn> $$2) {
      return this.a(fno.a($$0, this.c.orElse("")), $$1, $$2);
   }

   public aku a(aku $$0, fnr $$1, BiConsumer<aku, fnn> $$2) {
      Map<fns, aku> $$3 = this.a($$1);
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

   private Map<fns, aku> a(fnr $$0) {
      return Streams.concat(new Stream[]{this.b.stream(), $$0.a()}).collect(ImmutableMap.toImmutableMap(Function.identity(), $$0::a));
   }
}
