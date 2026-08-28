import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.List;
import java.util.stream.Stream;

public class ftb {
   private final Builder<String, gub.b> a = ImmutableMap.builder();

   private <T extends Comparable<T>> void a(ech<T> $$0, gub.b $$1) {
      this.a.put($$0.f(), $$1);
   }

   public final <T extends Comparable<T>> ftb a(ech<T> $$0, T $$1) {
      this.a($$0, new gub.b(List.of(new gub.a($$0.b($$1), false))));
      return this;
   }

   @SafeVarargs
   public final <T extends Comparable<T>> ftb a(ech<T> $$0, T $$1, T... $$2) {
      List<gub.a> $$3 = Stream.concat(Stream.of($$1), Stream.of($$2)).map($$0::b).sorted().distinct().map($$0x -> new gub.a($$0x, false)).toList();
      this.a($$0, new gub.b($$3));
      return this;
   }

   public final <T extends Comparable<T>> ftb b(ech<T> $$0, T $$1) {
      this.a($$0, new gub.b(List.of(new gub.a($$0.b($$1), true))));
      return this;
   }

   public gua a() {
      return new gub(this.a.buildOrThrow());
   }
}
