import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class ahb<T> extends agv<T> {
   private final ahb.b b;

   private static ahb.b a(final ahb.b $$0) {
      return new ahb.b() {
         private final Map<ahc<? extends it<?>>, Optional<? extends ahb.a<?>>> b = new HashMap<>();

         @Override
         public <T> Optional<ahb.a<T>> a(ahc<? extends it<? extends T>> $$0x) {
            return (Optional<ahb.a<T>>)this.b.computeIfAbsent($$0, $$0::a);
         }
      };
   }

   public static <T> ahb<T> a(DynamicOps<T> $$0, final ij.b $$1) {
      return a($$0, a(new ahb.b() {
         @Override
         public <E> Optional<ahb.a<E>> a(ahc<? extends it<? extends E>> $$0) {
            return $$1.a($$0).map($$0x -> (ahb.a<E>)(new ahb.a<>($$0x, $$0x, $$0x.g())));
         }
      }));
   }

   public static <T> ahb<T> a(DynamicOps<T> $$0, ahb.b $$1) {
      return new ahb<>($$0, $$1);
   }

   private ahb(DynamicOps<T> $$0, ahb.b $$1) {
      super($$0);
      this.b = $$1;
   }

   public <E> Optional<ik<E>> a(ahc<? extends it<? extends E>> $$0) {
      return this.b.a($$0).map(ahb.a::a);
   }

   public <E> Optional<ii<E>> b(ahc<? extends it<? extends E>> $$0) {
      return this.b.a($$0).map(ahb.a::b);
   }

   public static <E, O> RecordCodecBuilder<O, ii<E>> c(ahc<? extends it<? extends E>> $$0) {
      return atq.a(
            (Function<DynamicOps<?>, DataResult<E>>)($$1 -> $$1 instanceof ahb<?> $$2
                  ? $$2.b.a($$0).map($$0xx -> DataResult.success($$0xx.b(), $$0xx.c())).orElseGet(() -> DataResult.error(() -> "Unknown registry: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   public static <E, O> RecordCodecBuilder<O, ih.c<E>> d(ahc<E> $$0) {
      ahc<? extends it<E>> $$1 = ahc.a($$0.b());
      return atq.a(
            (Function<DynamicOps<?>, DataResult<E>>)($$2 -> $$2 instanceof ahb<?> $$3
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
      <T> Optional<ahb.a<T>> a(ahc<? extends it<? extends T>> var1);
   }
}
