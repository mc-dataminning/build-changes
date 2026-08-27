import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class ajf<T> extends aiz<T> {
   private final ajf.b b;

   private static ajf.b a(final ajf.b $$0) {
      return new ajf.b() {
         private final Map<ajg<? extends iy<?>>, Optional<? extends ajf.a<?>>> b = new HashMap<>();

         @Override
         public <T> Optional<ajf.a<T>> a(ajg<? extends iy<? extends T>> $$0x) {
            return (Optional<ajf.a<T>>)this.b.computeIfAbsent($$0, $$0::a);
         }
      };
   }

   public static <T> ajf<T> a(DynamicOps<T> $$0, final in.a $$1) {
      return a($$0, a(new ajf.b() {
         @Override
         public <E> Optional<ajf.a<E>> a(ajg<? extends iy<? extends E>> $$0) {
            return $$1.a($$0).map($$0x -> (ajf.a<E>)(new ajf.a<>($$0x, $$0x, $$0x.g())));
         }
      }));
   }

   public static <T> ajf<T> a(DynamicOps<T> $$0, ajf.b $$1) {
      return new ajf<>($$0, $$1);
   }

   public static <T> Dynamic<T> a(Dynamic<T> $$0, in.a $$1) {
      return new Dynamic(a($$0.getOps(), $$1), $$0.getValue());
   }

   private ajf(DynamicOps<T> $$0, ajf.b $$1) {
      super($$0);
      this.b = $$1;
   }

   public <E> Optional<io<E>> a(ajg<? extends iy<? extends E>> $$0) {
      return this.b.a($$0).map(ajf.a::a);
   }

   public <E> Optional<im<E>> b(ajg<? extends iy<? extends E>> $$0) {
      return this.b.a($$0).map(ajf.a::b);
   }

   public static <E, O> RecordCodecBuilder<O, im<E>> c(ajg<? extends iy<? extends E>> $$0) {
      return awe.a(
            (Function<DynamicOps<?>, DataResult<E>>)($$1 -> $$1 instanceof ajf<?> $$2
                  ? $$2.b.a($$0).map($$0xx -> DataResult.success($$0xx.b(), $$0xx.c())).orElseGet(() -> DataResult.error(() -> "Unknown registry: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   public static <E, O> RecordCodecBuilder<O, il.c<E>> d(ajg<E> $$0) {
      ajg<? extends iy<E>> $$1 = ajg.a($$0.b());
      return awe.a(
            (Function<DynamicOps<?>, DataResult<E>>)($$2 -> $$2 instanceof ajf<?> $$3
                  ? $$3.b
                     .a($$1)
                     .flatMap($$1xx -> $$1xx.b().a($$0))
                     .<DataResult<E>>map(DataResult::success)
                     .orElseGet(() -> DataResult.error(() -> "Can't find value: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   public static record a<T>(io<T> a, im<T> b, Lifecycle c) {
   }

   public interface b {
      <T> Optional<ajf.a<T>> a(ajg<? extends iy<? extends T>> var1);
   }
}
