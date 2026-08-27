import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class agg<T> extends aga<T> {
   private final agg.b b;

   private static agg.b a(final agg.b $$0) {
      return new agg.b() {
         private final Map<agh<? extends io<?>>, Optional<? extends agg.a<?>>> b = new HashMap<>();

         @Override
         public <T> Optional<agg.a<T>> a(agh<? extends io<? extends T>> $$0x) {
            return (Optional<agg.a<T>>)this.b.computeIfAbsent($$0, $$0::a);
         }
      };
   }

   public static <T> agg<T> a(DynamicOps<T> $$0, final id.b $$1) {
      return a($$0, a(new agg.b() {
         @Override
         public <E> Optional<agg.a<E>> a(agh<? extends io<? extends E>> $$0) {
            return $$1.a($$0).map($$0x -> (agg.a<E>)(new agg.a<>($$0x, $$0x, $$0x.g())));
         }
      }));
   }

   public static <T> agg<T> a(DynamicOps<T> $$0, agg.b $$1) {
      return new agg<>($$0, $$1);
   }

   private agg(DynamicOps<T> $$0, agg.b $$1) {
      super($$0);
      this.b = $$1;
   }

   public <E> Optional<ie<E>> a(agh<? extends io<? extends E>> $$0) {
      return this.b.a($$0).map(agg.a::a);
   }

   public <E> Optional<ic<E>> b(agh<? extends io<? extends E>> $$0) {
      return this.b.a($$0).map(agg.a::b);
   }

   public static <E, O> RecordCodecBuilder<O, ic<E>> c(agh<? extends io<? extends E>> $$0) {
      return asu.b(
            (Function<DynamicOps<?>, DataResult<E>>)($$1 -> $$1 instanceof agg<?> $$2
                  ? $$2.b.a($$0).map($$0xx -> DataResult.success($$0xx.b(), $$0xx.c())).orElseGet(() -> DataResult.error(() -> "Unknown registry: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   public static <E, O> RecordCodecBuilder<O, ib.c<E>> d(agh<E> $$0) {
      agh<? extends io<E>> $$1 = agh.a($$0.b());
      return asu.b(
            (Function<DynamicOps<?>, DataResult<E>>)($$2 -> $$2 instanceof agg<?> $$3
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
      <T> Optional<agg.a<T>> a(agh<? extends io<? extends T>> var1);
   }
}
