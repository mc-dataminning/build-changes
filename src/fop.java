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

public class fop {
   private final Optional<aku> a;
   private final Set<fot> b;
   private final Optional<String> c;

   public fop(Optional<aku> $$0, Optional<String> $$1, fot... $$2) {
      this.a = $$0;
      this.c = $$1;
      this.b = ImmutableSet.copyOf($$2);
   }

   public aku a(dke $$0) {
      return foo.a($$0, this.c.orElse(""));
   }

   public aku a(dke $$0, fos $$1, BiConsumer<aku, fon> $$2) {
      return this.a(foo.a($$0, this.c.orElse("")), $$1, $$2);
   }

   public aku a(dke $$0, String $$1, fos $$2, BiConsumer<aku, fon> $$3) {
      return this.a(foo.a($$0, $$1 + this.c.orElse("")), $$2, $$3);
   }

   public aku b(dke $$0, String $$1, fos $$2, BiConsumer<aku, fon> $$3) {
      return this.a(foo.a($$0, $$1), $$2, $$3);
   }

   public aku a(cxd $$0, fos $$1, BiConsumer<aku, fon> $$2) {
      return this.a(foo.a($$0, this.c.orElse("")), $$1, $$2);
   }

   public aku a(aku $$0, fos $$1, BiConsumer<aku, fon> $$2) {
      Map<fot, aku> $$3 = this.a($$1);
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

   private Map<fot, aku> a(fos $$0) {
      return Streams.concat(new Stream[]{this.b.stream(), $$0.a()}).collect(ImmutableMap.toImmutableMap(Function.identity(), $$0::a));
   }
}
