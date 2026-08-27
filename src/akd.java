import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class akd<T> extends ajx<T> {
   private final akd.b b;

   private static akd.b a(final akd.b $$0) {
      return new akd.b() {
         private final Map<ake<? extends ji<?>>, Optional<? extends akd.a<?>>> b = new HashMap<>();

         @Override
         public <T> Optional<akd.a<T>> a(ake<? extends ji<? extends T>> $$0x) {
            return (Optional<akd.a<T>>)this.b.computeIfAbsent($$0, $$0::a);
         }
      };
   }

   public static <T> akd<T> a(DynamicOps<T> $$0, final ix.a $$1) {
      return a($$0, a(new akd.b() {
         @Override
         public <E> Optional<akd.a<E>> a(ake<? extends ji<? extends E>> $$0) {
            return $$1.a($$0).map(akd.a::a);
         }
      }));
   }

   public static <T> akd<T> a(DynamicOps<T> $$0, akd.b $$1) {
      return new akd<>($$0, $$1);
   }

   public static <T> Dynamic<T> a(Dynamic<T> $$0, ix.a $$1) {
      return new Dynamic($$1.a($$0.getOps()), $$0.getValue());
   }

   private akd(DynamicOps<T> $$0, akd.b $$1) {
      super($$0);
      this.b = $$1;
   }

   public <U> akd<U> a(DynamicOps<U> $$0) {
      return (akd<U>)($$0 == this.a ? this : new akd((DynamicOps<T>)$$0, this.b));
   }

   public <E> Optional<iy<E>> a(ake<? extends ji<? extends E>> $$0) {
      return this.b.a($$0).map(akd.a::a);
   }

   public <E> Optional<iw<E>> b(ake<? extends ji<? extends E>> $$0) {
      return this.b.a($$0).map(akd.a::b);
   }

   public static <E, O> RecordCodecBuilder<O, iw<E>> c(ake<? extends ji<? extends E>> $$0) {
      return axe.a(
            (Function<DynamicOps<?>, DataResult<E>>)($$1 -> $$1 instanceof akd<?> $$2
                  ? $$2.b.a($$0).map($$0xx -> DataResult.success($$0xx.b(), $$0xx.c())).orElseGet(() -> DataResult.error(() -> "Unknown registry: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   public static <E, O> RecordCodecBuilder<O, iv.c<E>> d(ake<E> $$0) {
      ake<? extends ji<E>> $$1 = ake.a($$0.b());
      return axe.a(
            (Function<DynamicOps<?>, DataResult<E>>)($$2 -> $$2 instanceof akd<?> $$3
                  ? $$3.b
                     .a($$1)
                     .flatMap($$1xx -> $$1xx.b().a($$0))
                     .<DataResult<E>>map(DataResult::success)
                     .orElseGet(() -> DataResult.error(() -> "Can't find value: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   public static record a<T>(iy<T> a, iw<T> b, Lifecycle c) {
      public static <T> akd.a<T> a(ix.b<T> $$0) {
         return new akd.a<>($$0, $$0, $$0.g());
      }
   }

   public interface b {
      <T> Optional<akd.a<T>> a(ake<? extends ji<? extends T>> var1);
   }
}
