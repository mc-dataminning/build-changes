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

public class ftl {
   private final Optional<ali> a;
   private final Set<fto> b;
   private final Optional<String> c;

   public ftl(Optional<ali> $$0, Optional<String> $$1, fto... $$2) {
      this.a = $$0;
      this.c = $$1;
      this.b = ImmutableSet.copyOf($$2);
   }

   public ali a(dnc $$0) {
      return ftk.a($$0, this.c.orElse(""));
   }

   public ali a(dnc $$0, ftn $$1, BiConsumer<ali, ftj> $$2) {
      return this.a(ftk.a($$0, this.c.orElse("")), $$1, $$2);
   }

   public ali a(dnc $$0, String $$1, ftn $$2, BiConsumer<ali, ftj> $$3) {
      return this.a(ftk.a($$0, $$1 + this.c.orElse("")), $$2, $$3);
   }

   public ali b(dnc $$0, String $$1, ftn $$2, BiConsumer<ali, ftj> $$3) {
      return this.a(ftk.a($$0, $$1), $$2, $$3);
   }

   public ali a(czu $$0, ftn $$1, BiConsumer<ali, ftj> $$2) {
      return this.a(ftk.a($$0, this.c.orElse("")), $$1, $$2);
   }

   public ali a(ali $$0, ftn $$1, BiConsumer<ali, ftj> $$2) {
      Map<fto, ali> $$3 = this.a($$1);
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

   private Map<fto, ali> a(ftn $$0) {
      return Streams.concat(new Stream[]{this.b.stream(), $$0.a()}).collect(ImmutableMap.toImmutableMap(Function.identity(), $$0::a));
   }
}
