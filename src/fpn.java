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

public class fpn {
   private final Optional<ald> a;
   private final Set<fpq> b;
   private final Optional<String> c;

   public fpn(Optional<ald> $$0, Optional<String> $$1, fpq... $$2) {
      this.a = $$0;
      this.c = $$1;
      this.b = ImmutableSet.copyOf($$2);
   }

   public ald a(dku $$0) {
      return fpm.a($$0, this.c.orElse(""));
   }

   public ald a(dku $$0, fpp $$1, BiConsumer<ald, fpl> $$2) {
      return this.a(fpm.a($$0, this.c.orElse("")), $$1, $$2);
   }

   public ald a(dku $$0, String $$1, fpp $$2, BiConsumer<ald, fpl> $$3) {
      return this.a(fpm.a($$0, $$1 + this.c.orElse("")), $$2, $$3);
   }

   public ald b(dku $$0, String $$1, fpp $$2, BiConsumer<ald, fpl> $$3) {
      return this.a(fpm.a($$0, $$1), $$2, $$3);
   }

   public ald a(cxu $$0, fpp $$1, BiConsumer<ald, fpl> $$2) {
      return this.a(fpm.a($$0, this.c.orElse("")), $$1, $$2);
   }

   public ald a(ald $$0, fpp $$1, BiConsumer<ald, fpl> $$2) {
      Map<fpq, ald> $$3 = this.a($$1);
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

   private Map<fpq, ald> a(fpp $$0) {
      return Streams.concat(new Stream[]{this.b.stream(), $$0.a()}).collect(ImmutableMap.toImmutableMap(Function.identity(), $$0::a));
   }
}
