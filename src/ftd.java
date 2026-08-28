import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.List;
import java.util.stream.Stream;

public class ftd {
   private final Builder<String, gud.b> a = ImmutableMap.builder();

   private <T extends Comparable<T>> void a(ecj<T> $$0, gud.b $$1) {
      this.a.put($$0.f(), $$1);
   }

   public final <T extends Comparable<T>> ftd a(ecj<T> $$0, T $$1) {
      this.a($$0, new gud.b(List.of(new gud.a($$0.b($$1), false))));
      return this;
   }

   @SafeVarargs
   public final <T extends Comparable<T>> ftd a(ecj<T> $$0, T $$1, T... $$2) {
      List<gud.a> $$3 = Stream.concat(Stream.of($$1), Stream.of($$2)).map($$0::b).sorted().distinct().map($$0x -> new gud.a($$0x, false)).toList();
      this.a($$0, new gud.b($$3));
      return this;
   }

   public final <T extends Comparable<T>> ftd b(ecj<T> $$0, T $$1) {
      this.a($$0, new gud.b(List.of(new gud.a($$0.b($$1), true))));
      return this;
   }

   public guc a() {
      return new gud(this.a.buildOrThrow());
   }
}
