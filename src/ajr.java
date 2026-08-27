import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class ajr<T> extends ajl<T> {
   private final ajr.b b;

   private static ajr.b a(final ajr.b $$0) {
      return new ajr.b() {
         private final Map<ajs<? extends iy<?>>, Optional<? extends ajr.a<?>>> b = new HashMap<>();

         @Override
         public <T> Optional<ajr.a<T>> a(ajs<? extends iy<? extends T>> $$0x) {
            return (Optional<ajr.a<T>>)this.b.computeIfAbsent($$0, $$0::a);
         }
      };
   }

   public static <T> ajr<T> a(DynamicOps<T> $$0, final in.a $$1) {
      return a($$0, a(new ajr.b() {
         @Override
         public <E> Optional<ajr.a<E>> a(ajs<? extends iy<? extends E>> $$0) {
            return $$1.a($$0).map(ajr.a::a);
         }
      }));
   }

   public static <T> ajr<T> a(DynamicOps<T> $$0, ajr.b $$1) {
      return new ajr<>($$0, $$1);
   }

   public static <T> Dynamic<T> a(Dynamic<T> $$0, in.a $$1) {
      return new Dynamic($$1.a($$0.getOps()), $$0.getValue());
   }

   private ajr(DynamicOps<T> $$0, ajr.b $$1) {
      super($$0);
      this.b = $$1;
   }

   public <U> ajr<U> a(DynamicOps<U> $$0) {
      return (ajr<U>)($$0 == this.a ? this : new ajr((DynamicOps<T>)$$0, this.b));
   }

   public <E> Optional<io<E>> a(ajs<? extends iy<? extends E>> $$0) {
      return this.b.a($$0).map(ajr.a::a);
   }

   public <E> Optional<im<E>> b(ajs<? extends iy<? extends E>> $$0) {
      return this.b.a($$0).map(ajr.a::b);
   }

   public static <E, O> RecordCodecBuilder<O, im<E>> c(ajs<? extends iy<? extends E>> $$0) {
      return aws.a(
            (Function<DynamicOps<?>, DataResult<E>>)($$1 -> $$1 instanceof ajr<?> $$2
                  ? $$2.b.a($$0).map($$0xx -> DataResult.success($$0xx.b(), $$0xx.c())).orElseGet(() -> DataResult.error(() -> "Unknown registry: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   public static <E, O> RecordCodecBuilder<O, il.c<E>> d(ajs<E> $$0) {
      ajs<? extends iy<E>> $$1 = ajs.a($$0.b());
      return aws.a(
            (Function<DynamicOps<?>, DataResult<E>>)($$2 -> $$2 instanceof ajr<?> $$3
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
      public static <T> ajr.a<T> a(in.b<T> $$0) {
         return new ajr.a<>($$0, $$0, $$0.g());
      }
   }

   public interface b {
      <T> Optional<ajr.a<T>> a(ajs<? extends iy<? extends T>> var1);
   }
}
