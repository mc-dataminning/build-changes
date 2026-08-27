import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class ahf<T> extends agz<T> {
   private final ahf.b b;

   private static ahf.b a(final ahf.b $$0) {
      return new ahf.b() {
         private final Map<ahg<? extends it<?>>, Optional<? extends ahf.a<?>>> b = new HashMap<>();

         @Override
         public <T> Optional<ahf.a<T>> a(ahg<? extends it<? extends T>> $$0x) {
            return (Optional<ahf.a<T>>)this.b.computeIfAbsent($$0, $$0::a);
         }
      };
   }

   public static <T> ahf<T> a(DynamicOps<T> $$0, final ij.b $$1) {
      return a($$0, a(new ahf.b() {
         @Override
         public <E> Optional<ahf.a<E>> a(ahg<? extends it<? extends E>> $$0) {
            return $$1.a($$0).map($$0x -> (ahf.a<E>)(new ahf.a<>($$0x, $$0x, $$0x.g())));
         }
      }));
   }

   public static <T> ahf<T> a(DynamicOps<T> $$0, ahf.b $$1) {
      return new ahf<>($$0, $$1);
   }

   private ahf(DynamicOps<T> $$0, ahf.b $$1) {
      super($$0);
      this.b = $$1;
   }

   public <E> Optional<ik<E>> a(ahg<? extends it<? extends E>> $$0) {
      return this.b.a($$0).map(ahf.a::a);
   }

   public <E> Optional<ii<E>> b(ahg<? extends it<? extends E>> $$0) {
      return this.b.a($$0).map(ahf.a::b);
   }

   public static <E, O> RecordCodecBuilder<O, ii<E>> c(ahg<? extends it<? extends E>> $$0) {
      return atx.a(
            (Function<DynamicOps<?>, DataResult<E>>)($$1 -> $$1 instanceof ahf<?> $$2
                  ? $$2.b.a($$0).map($$0xx -> DataResult.success($$0xx.b(), $$0xx.c())).orElseGet(() -> DataResult.error(() -> "Unknown registry: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   public static <E, O> RecordCodecBuilder<O, ih.c<E>> d(ahg<E> $$0) {
      ahg<? extends it<E>> $$1 = ahg.a($$0.b());
      return atx.a(
            (Function<DynamicOps<?>, DataResult<E>>)($$2 -> $$2 instanceof ahf<?> $$3
                  ? $$3.b
                     .a($$1)
                     .flatMap($$1xx -> $$1xx.b().a($$0))
                     .<DataResult<E>>map(DataResult::success)
                     .orElseGet(() -> DataResult.error(() -> "Can't find value: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   public static record a<T>(ik<T> a, ii<T> b, Lifecycle c) {
   }

   public interface b {
      <T> Optional<ahf.a<T>> a(ahg<? extends it<? extends T>> var1);
   }
}
