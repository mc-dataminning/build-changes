import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class akf<T> extends ajz<T> {
   private final akf.b b;

   private static akf.b a(final akf.b $$0) {
      return new akf.b() {
         private final Map<akg<? extends jj<?>>, Optional<? extends akf.a<?>>> b = new HashMap<>();

         @Override
         public <T> Optional<akf.a<T>> a(akg<? extends jj<? extends T>> $$0x) {
            return (Optional<akf.a<T>>)this.b.computeIfAbsent($$0, $$0::a);
         }
      };
   }

   public static <T> akf<T> a(DynamicOps<T> $$0, final iy.a $$1) {
      return a($$0, a(new akf.b() {
         @Override
         public <E> Optional<akf.a<E>> a(akg<? extends jj<? extends E>> $$0) {
            return $$1.a($$0).map(akf.a::a);
         }
      }));
   }

   public static <T> akf<T> a(DynamicOps<T> $$0, akf.b $$1) {
      return new akf<>($$0, $$1);
   }

   public static <T> Dynamic<T> a(Dynamic<T> $$0, iy.a $$1) {
      return new Dynamic($$1.a($$0.getOps()), $$0.getValue());
   }

   private akf(DynamicOps<T> $$0, akf.b $$1) {
      super($$0);
      this.b = $$1;
   }

   public <U> akf<U> a(DynamicOps<U> $$0) {
      return (akf<U>)($$0 == this.a ? this : new akf((DynamicOps<T>)$$0, this.b));
   }

   public <E> Optional<iz<E>> a(akg<? extends jj<? extends E>> $$0) {
      return this.b.a($$0).map(akf.a::a);
   }

   public <E> Optional<ix<E>> b(akg<? extends jj<? extends E>> $$0) {
      return this.b.a($$0).map(akf.a::b);
   }

   public static <E, O> RecordCodecBuilder<O, ix<E>> c(akg<? extends jj<? extends E>> $$0) {
      return axh.a(
            (Function<DynamicOps<?>, DataResult<E>>)($$1 -> $$1 instanceof akf<?> $$2
                  ? $$2.b.a($$0).map($$0xx -> DataResult.success($$0xx.b(), $$0xx.c())).orElseGet(() -> DataResult.error(() -> "Unknown registry: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   public static <E, O> RecordCodecBuilder<O, iw.c<E>> d(akg<E> $$0) {
      akg<? extends jj<E>> $$1 = akg.a($$0.b());
      return axh.a(
            (Function<DynamicOps<?>, DataResult<E>>)($$2 -> $$2 instanceof akf<?> $$3
                  ? $$3.b
                     .a($$1)
                     .flatMap($$1xx -> $$1xx.b().a($$0))
                     .<DataResult<E>>map(DataResult::success)
                     .orElseGet(() -> DataResult.error(() -> "Can't find value: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   public static record a<T>(iz<T> a, ix<T> b, Lifecycle c) {
      public static <T> akf.a<T> a(iy.b<T> $$0) {
         return new akf.a<>($$0, $$0, $$0.g());
      }
   }

   public interface b {
      <T> Optional<akf.a<T>> a(akg<? extends jj<? extends T>> var1);
   }
}
