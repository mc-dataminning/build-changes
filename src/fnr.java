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

public class fnr {
   private final Optional<aku> a;
   private final Set<fnu> b;
   private final Optional<String> c;

   public fnr(Optional<aku> $$0, Optional<String> $$1, fnu... $$2) {
      this.a = $$0;
      this.c = $$1;
      this.b = ImmutableSet.copyOf($$2);
   }

   public aku a(djm $$0) {
      return fnq.a($$0, this.c.orElse(""));
   }

   public aku a(djm $$0, fnt $$1, BiConsumer<aku, fnp> $$2) {
      return this.a(fnq.a($$0, this.c.orElse("")), $$1, $$2);
   }

   public aku a(djm $$0, String $$1, fnt $$2, BiConsumer<aku, fnp> $$3) {
      return this.a(fnq.a($$0, $$1 + this.c.orElse("")), $$2, $$3);
   }

   public aku b(djm $$0, String $$1, fnt $$2, BiConsumer<aku, fnp> $$3) {
      return this.a(fnq.a($$0, $$1), $$2, $$3);
   }

   public aku a(cwl $$0, fnt $$1, BiConsumer<aku, fnp> $$2) {
      return this.a(fnq.a($$0, this.c.orElse("")), $$1, $$2);
   }

   public aku a(aku $$0, fnt $$1, BiConsumer<aku, fnp> $$2) {
      Map<fnu, aku> $$3 = this.a($$1);
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

   private Map<fnu, aku> a(fnt $$0) {
      return Streams.concat(new Stream[]{this.b.stream(), $$0.a()}).collect(ImmutableMap.toImmutableMap(Function.identity(), $$0::a));
   }
}
