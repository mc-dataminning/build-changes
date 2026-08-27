import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class akk<T> extends ake<T> {
   private final akk.b b;

   private static akk.b a(final akk.b $$0) {
      return new akk.b() {
         private final Map<akl<? extends jk<?>>, Optional<? extends akk.a<?>>> b = new HashMap<>();

         @Override
         public <T> Optional<akk.a<T>> a(akl<? extends jk<? extends T>> $$0x) {
            return (Optional<akk.a<T>>)this.b.computeIfAbsent($$0, $$0::a);
         }
      };
   }

   public static <T> akk<T> a(DynamicOps<T> $$0, final iz.a $$1) {
      return a($$0, a(new akk.b() {
         @Override
         public <E> Optional<akk.a<E>> a(akl<? extends jk<? extends E>> $$0) {
            return $$1.a($$0).map(akk.a::a);
         }
      }));
   }

   public static <T> akk<T> a(DynamicOps<T> $$0, akk.b $$1) {
      return new akk<>($$0, $$1);
   }

   public static <T> Dynamic<T> a(Dynamic<T> $$0, iz.a $$1) {
      return new Dynamic($$1.a($$0.getOps()), $$0.getValue());
   }

   private akk(DynamicOps<T> $$0, akk.b $$1) {
      super($$0);
      this.b = $$1;
   }

   public <U> akk<U> a(DynamicOps<U> $$0) {
      return (akk<U>)($$0 == this.a ? this : new akk((DynamicOps<T>)$$0, this.b));
   }

   public <E> Optional<ja<E>> a(akl<? extends jk<? extends E>> $$0) {
      return this.b.a($$0).map(akk.a::a);
   }

   public <E> Optional<iy<E>> b(akl<? extends jk<? extends E>> $$0) {
      return this.b.a($$0).map(akk.a::b);
   }

   public static <E, O> RecordCodecBuilder<O, iy<E>> c(akl<? extends jk<? extends E>> $$0) {
      return axm.a(
            (Function<DynamicOps<?>, DataResult<E>>)($$1 -> $$1 instanceof akk<?> $$2
                  ? $$2.b.a($$0).map($$0xx -> DataResult.success($$0xx.b(), $$0xx.c())).orElseGet(() -> DataResult.error(() -> "Unknown registry: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   public static <E, O> RecordCodecBuilder<O, ix.c<E>> d(akl<E> $$0) {
      akl<? extends jk<E>> $$1 = akl.a($$0.b());
      return axm.a(
            (Function<DynamicOps<?>, DataResult<E>>)($$2 -> $$2 instanceof akk<?> $$3
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
      public static <T> akk.a<T> a(iz.b<T> $$0) {
         return new akk.a<>($$0, $$0, $$0.g());
      }
   }

   public interface b {
      <T> Optional<akk.a<T>> a(akl<? extends jk<? extends T>> var1);
   }
}
