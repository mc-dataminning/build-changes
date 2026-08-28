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

public class ftn {
   private final Optional<alk> a;
   private final Set<ftq> b;
   private final Optional<String> c;

   public ftn(Optional<alk> $$0, Optional<String> $$1, ftq... $$2) {
      this.a = $$0;
      this.c = $$1;
      this.b = ImmutableSet.copyOf($$2);
   }

   public alk a(dne $$0) {
      return ftm.a($$0, this.c.orElse(""));
   }

   public alk a(dne $$0, ftp $$1, BiConsumer<alk, ftl> $$2) {
      return this.a(ftm.a($$0, this.c.orElse("")), $$1, $$2);
   }

   public alk a(dne $$0, String $$1, ftp $$2, BiConsumer<alk, ftl> $$3) {
      return this.a(ftm.a($$0, $$1 + this.c.orElse("")), $$2, $$3);
   }

   public alk b(dne $$0, String $$1, ftp $$2, BiConsumer<alk, ftl> $$3) {
      return this.a(ftm.a($$0, $$1), $$2, $$3);
   }

   public alk a(czw $$0, ftp $$1, BiConsumer<alk, ftl> $$2) {
      return this.a(ftm.a($$0, this.c.orElse("")), $$1, $$2);
   }

   public alk a(alk $$0, ftp $$1, BiConsumer<alk, ftl> $$2) {
      Map<ftq, alk> $$3 = this.a($$1);
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

   private Map<ftq, alk> a(ftp $$0) {
      return Streams.concat(new Stream[]{this.b.stream(), $$0.a()}).collect(ImmutableMap.toImmutableMap(Function.identity(), $$0::a));
   }
}
