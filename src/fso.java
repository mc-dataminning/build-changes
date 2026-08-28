import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.List;
import java.util.stream.Stream;

public class fso {
   private final Builder<String, gto.b> a = ImmutableMap.builder();

   private <T extends Comparable<T>> void a(ect<T> $$0, gto.b $$1) {
      this.a.put($$0.f(), $$1);
   }

   public final <T extends Comparable<T>> fso a(ect<T> $$0, T $$1) {
      this.a($$0, new gto.b(List.of(new gto.a($$0.b($$1), false))));
      return this;
   }

   @SafeVarargs
   public final <T extends Comparable<T>> fso a(ect<T> $$0, T $$1, T... $$2) {
      List<gto.a> $$3 = Stream.concat(Stream.of($$1), Stream.of($$2)).map($$0::b).sorted().distinct().map($$0x -> new gto.a($$0x, false)).toList();
      this.a($$0, new gto.b($$3));
      return this;
   }

   public final <T extends Comparable<T>> fso b(ect<T> $$0, T $$1) {
      this.a($$0, new gto.b(List.of(new gto.a($$0.b($$1), true))));
      return this;
   }

   public gtn a() {
      return new gto(this.a.buildOrThrow());
   }
}
