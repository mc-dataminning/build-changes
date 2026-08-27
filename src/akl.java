import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class akl<T> extends akf<T> {
   private final akl.b b;

   private static akl.b a(final akl.b $$0) {
      return new akl.b() {
         private final Map<akm<? extends jk<?>>, Optional<? extends akl.a<?>>> b = new HashMap<>();

         @Override
         public <T> Optional<akl.a<T>> a(akm<? extends jk<? extends T>> $$0x) {
            return (Optional<akl.a<T>>)this.b.computeIfAbsent($$0, $$0::a);
         }
      };
   }

   public static <T> akl<T> a(DynamicOps<T> $$0, final iz.a $$1) {
      return a($$0, a(new akl.b() {
         @Override
         public <E> Optional<akl.a<E>> a(akm<? extends jk<? extends E>> $$0) {
            return $$1.a($$0).map(akl.a::a);
         }
      }));
   }

   public static <T> akl<T> a(DynamicOps<T> $$0, akl.b $$1) {
      return new akl<>($$0, $$1);
   }

   public static <T> Dynamic<T> a(Dynamic<T> $$0, iz.a $$1) {
      return new Dynamic($$1.a($$0.getOps()), $$0.getValue());
   }

   private akl(DynamicOps<T> $$0, akl.b $$1) {
      super($$0);
      this.b = $$1;
   }

   public <U> akl<U> a(DynamicOps<U> $$0) {
      return (akl<U>)($$0 == this.a ? this : new akl((DynamicOps<T>)$$0, this.b));
   }

   public <E> Optional<ja<E>> a(akm<? extends jk<? extends E>> $$0) {
      return this.b.a($$0).map(akl.a::a);
   }

   public <E> Optional<iy<E>> b(akm<? extends jk<? extends E>> $$0) {
      return this.b.a($$0).map(akl.a::b);
   }

   public static <E, O> RecordCodecBuilder<O, iy<E>> c(akm<? extends jk<? extends E>> $$0) {
      return axn.a(
            (Function<DynamicOps<?>, DataResult<E>>)($$1 -> $$1 instanceof akl<?> $$2
                  ? $$2.b.a($$0).map($$0xx -> DataResult.success($$0xx.b(), $$0xx.c())).orElseGet(() -> DataResult.error(() -> "Unknown registry: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   public static <E, O> RecordCodecBuilder<O, ix.c<E>> d(akm<E> $$0) {
      akm<? extends jk<E>> $$1 = akm.a($$0.b());
      return axn.a(
            (Function<DynamicOps<?>, DataResult<E>>)($$2 -> $$2 instanceof akl<?> $$3
                  ? $$3.b
                     .a($$1)
                     .flatMap($$1xx -> $$1xx.b().a($$0))
                     .<DataResult<E>>map(DataResult::success)
                     .orElseGet(() -> DataResult.error(() -> "Can't find value: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   public static record a<T>(ja<T> a, iy<T> b, Lifecycle c) {
      public static <T> akl.a<T> a(iz.b<T> $$0) {
         return new akl.a<>($$0, $$0, $$0.g());
      }
   }

   public interface b {
      <T> Optional<akl.a<T>> a(akm<? extends jk<? extends T>> var1);
   }
}
