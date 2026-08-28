import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.List;
import java.util.stream.Stream;

public class frq {
   private final Builder<String, gsr.b> a = ImmutableMap.builder();

   private <T extends Comparable<T>> void a(ebw<T> $$0, gsr.b $$1) {
      this.a.put($$0.f(), $$1);
   }

   public final <T extends Comparable<T>> frq a(ebw<T> $$0, T $$1) {
      this.a($$0, new gsr.b(List.of(new gsr.a($$0.b($$1), false))));
      return this;
   }

   @SafeVarargs
   public final <T extends Comparable<T>> frq a(ebw<T> $$0, T $$1, T... $$2) {
      List<gsr.a> $$3 = Stream.concat(Stream.of($$1), Stream.of($$2)).map($$0::b).sorted().distinct().map($$0x -> new gsr.a($$0x, false)).toList();
      this.a($$0, new gsr.b($$3));
      return this;
   }

   public final <T extends Comparable<T>> frq b(ebw<T> $$0, T $$1) {
      this.a($$0, new gsr.b(List.of(new gsr.a($$0.b($$1), true))));
      return this;
   }

   public gsq a() {
      return new gsr(this.a.buildOrThrow());
   }
}
