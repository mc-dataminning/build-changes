import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.List;
import java.util.stream.Stream;

public class frl {
   private final Builder<String, gsm.b> a = ImmutableMap.builder();

   private <T extends Comparable<T>> void a(ebr<T> $$0, gsm.b $$1) {
      this.a.put($$0.f(), $$1);
   }

   public final <T extends Comparable<T>> frl a(ebr<T> $$0, T $$1) {
      this.a($$0, new gsm.b(List.of(new gsm.a($$0.b($$1), false))));
      return this;
   }

   @SafeVarargs
   public final <T extends Comparable<T>> frl a(ebr<T> $$0, T $$1, T... $$2) {
      List<gsm.a> $$3 = Stream.concat(Stream.of($$1), Stream.of($$2)).map($$0::b).sorted().distinct().map($$0x -> new gsm.a($$0x, false)).toList();
      this.a($$0, new gsm.b($$3));
      return this;
   }

   public final <T extends Comparable<T>> frl b(ebr<T> $$0, T $$1) {
      this.a($$0, new gsm.b(List.of(new gsm.a($$0.b($$1), true))));
      return this;
   }

   public gsl a() {
      return new gsm(this.a.buildOrThrow());
   }
}
