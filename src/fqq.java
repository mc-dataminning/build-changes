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

public class fqq {
   private final Optional<ale> a;
   private final Set<fqt> b;
   private final Optional<String> c;

   public fqq(Optional<ale> $$0, Optional<String> $$1, fqt... $$2) {
      this.a = $$0;
      this.c = $$1;
      this.b = ImmutableSet.copyOf($$2);
   }

   public ale a(dlu $$0) {
      return fqp.a($$0, this.c.orElse(""));
   }

   public ale a(dlu $$0, fqs $$1, BiConsumer<ale, fqo> $$2) {
      return this.a(fqp.a($$0, this.c.orElse("")), $$1, $$2);
   }

   public ale a(dlu $$0, String $$1, fqs $$2, BiConsumer<ale, fqo> $$3) {
      return this.a(fqp.a($$0, $$1 + this.c.orElse("")), $$2, $$3);
   }

   public ale b(dlu $$0, String $$1, fqs $$2, BiConsumer<ale, fqo> $$3) {
      return this.a(fqp.a($$0, $$1), $$2, $$3);
   }

   public ale a(cyo $$0, fqs $$1, BiConsumer<ale, fqo> $$2) {
      return this.a(fqp.a($$0, this.c.orElse("")), $$1, $$2);
   }

   public ale a(ale $$0, fqs $$1, BiConsumer<ale, fqo> $$2) {
      Map<fqt, ale> $$3 = this.a($$1);
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

   private Map<fqt, ale> a(fqs $$0) {
      return Streams.concat(new Stream[]{this.b.stream(), $$0.a()}).collect(ImmutableMap.toImmutableMap(Function.identity(), $$0::a));
   }
}
