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

public class fsy {
   private final Optional<alr> a;
   private final Set<ftb> b;
   private final Optional<String> c;

   public fsy(Optional<alr> $$0, Optional<String> $$1, ftb... $$2) {
      this.a = $$0;
      this.c = $$1;
      this.b = ImmutableSet.copyOf($$2);
   }

   public alr a(dno $$0) {
      return fsx.a($$0, this.c.orElse(""));
   }

   public alr a(dno $$0, fta $$1, BiConsumer<alr, fsw> $$2) {
      return this.a(fsx.a($$0, this.c.orElse("")), $$1, $$2);
   }

   public alr a(dno $$0, String $$1, fta $$2, BiConsumer<alr, fsw> $$3) {
      return this.a(fsx.a($$0, $$1 + this.c.orElse("")), $$2, $$3);
   }

   public alr b(dno $$0, String $$1, fta $$2, BiConsumer<alr, fsw> $$3) {
      return this.a(fsx.a($$0, $$1), $$2, $$3);
   }

   public alr a(dag $$0, fta $$1, BiConsumer<alr, fsw> $$2) {
      return this.a(fsx.a($$0, this.c.orElse("")), $$1, $$2);
   }

   public alr a(alr $$0, fta $$1, BiConsumer<alr, fsw> $$2) {
      Map<ftb, alr> $$3 = this.a($$1);
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

   private Map<ftb, alr> a(fta $$0) {
      return Streams.concat(new Stream[]{this.b.stream(), $$0.a()}).collect(ImmutableMap.toImmutableMap(Function.identity(), $$0::a));
   }
}
