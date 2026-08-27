import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class age<T> extends afy<T> {
   private final age.b b;

   private static age.b a(final age.b $$0) {
      return new age.b() {
         private final Map<agf<? extends io<?>>, Optional<? extends age.a<?>>> b = new HashMap<>();

         @Override
         public <T> Optional<age.a<T>> a(agf<? extends io<? extends T>> $$0x) {
            return (Optional<age.a<T>>)this.b.computeIfAbsent($$0, $$0::a);
         }
      };
   }

   public static <T> age<T> a(DynamicOps<T> $$0, final id.b $$1) {
      return a($$0, a(new age.b() {
         @Override
         public <E> Optional<age.a<E>> a(agf<? extends io<? extends E>> $$0) {
            return $$1.a($$0).map($$0x -> (age.a<E>)(new age.a<>($$0x, $$0x, $$0x.g())));
         }
      }));
   }

   public static <T> age<T> a(DynamicOps<T> $$0, age.b $$1) {
      return new age<>($$0, $$1);
   }

   private age(DynamicOps<T> $$0, age.b $$1) {
      super($$0);
      this.b = $$1;
   }

   public <E> Optional<ie<E>> a(agf<? extends io<? extends E>> $$0) {
      return this.b.a($$0).map(age.a::a);
   }

   public <E> Optional<ic<E>> b(agf<? extends io<? extends E>> $$0) {
      return this.b.a($$0).map(age.a::b);
   }

   public static <E, O> RecordCodecBuilder<O, ic<E>> c(agf<? extends io<? extends E>> $$0) {
      return asq.b(
            (Function<DynamicOps<?>, DataResult<E>>)($$1 -> $$1 instanceof age<?> $$2
                  ? $$2.b.a($$0).map($$0xx -> DataResult.success($$0xx.b(), $$0xx.c())).orElseGet(() -> DataResult.error(() -> "Unknown registry: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   public static <E, O> RecordCodecBuilder<O, ib.c<E>> d(agf<E> $$0) {
      agf<? extends io<E>> $$1 = agf.a($$0.b());
      return asq.b(
            (Function<DynamicOps<?>, DataResult<E>>)($$2 -> $$2 instanceof age<?> $$3
                  ? $$3.b
                     .a($$1)
                     .flatMap($$1xx -> $$1xx.b().a($$0))
                     .<DataResult<E>>map(DataResult::success)
                     .orElseGet(() -> DataResult.error(() -> "Can't find value: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   public static record a<T>(ie<T> a, ic<T> b, Lifecycle c) {
   }

   public interface b {
      <T> Optional<age.a<T>> a(agf<? extends io<? extends T>> var1);
   }
}
