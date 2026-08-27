import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class aco<T> extends aci<T> {
   private final aco.b b;

   private static aco.b a(final aco.b $$0) {
      return new aco.b() {
         private final Map<acp<? extends hr<?>>, Optional<? extends aco.a<?>>> b = new HashMap<>();

         @Override
         public <T> Optional<aco.a<T>> a(acp<? extends hr<? extends T>> $$0x) {
            return (Optional<aco.a<T>>)this.b.computeIfAbsent($$0, $$0::a);
         }
      };
   }

   public static <T> aco<T> a(DynamicOps<T> $$0, final hg.b $$1) {
      return a($$0, a(new aco.b() {
         @Override
         public <E> Optional<aco.a<E>> a(acp<? extends hr<? extends E>> $$0) {
            return $$1.a($$0).map($$0x -> (aco.a<E>)(new aco.a<>($$0x, $$0x, $$0x.g())));
         }
      }));
   }

   public static <T> aco<T> a(DynamicOps<T> $$0, aco.b $$1) {
      return new aco<>($$0, $$1);
   }

   private aco(DynamicOps<T> $$0, aco.b $$1) {
      super($$0);
      this.b = $$1;
   }

   public <E> Optional<hh<E>> a(acp<? extends hr<? extends E>> $$0) {
      return this.b.a($$0).map(aco.a::a);
   }

   public <E> Optional<hf<E>> b(acp<? extends hr<? extends E>> $$0) {
      return this.b.a($$0).map(aco.a::b);
   }

   public static <E, O> RecordCodecBuilder<O, hf<E>> c(acp<? extends hr<? extends E>> $$0) {
      return aoi.a(
            (Function<DynamicOps<?>, DataResult<E>>)($$1 -> $$1 instanceof aco<?> $$2
                  ? $$2.b.a($$0).map($$0xx -> DataResult.success($$0xx.b(), $$0xx.c())).orElseGet(() -> DataResult.error(() -> "Unknown registry: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   public static <E, O> RecordCodecBuilder<O, he.c<E>> d(acp<E> $$0) {
      acp<? extends hr<E>> $$1 = acp.a($$0.b());
      return aoi.a(
            (Function<DynamicOps<?>, DataResult<E>>)($$2 -> $$2 instanceof aco<?> $$3
                  ? $$3.b
                     .a($$1)
                     .flatMap($$1xx -> $$1xx.b().a($$0))
                     .<DataResult<E>>map(DataResult::success)
                     .orElseGet(() -> DataResult.error(() -> "Can't find value: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   public static record a<T>(hh<T> a, hf<T> b, Lifecycle c) {
   }

   public interface b {
      <T> Optional<aco.a<T>> a(acp<? extends hr<? extends T>> var1);
   }
}
