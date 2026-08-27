import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class aes<T> extends aem<T> {
   private final aes.b b;

   private static aes.b a(final aes.b $$0) {
      return new aes.b() {
         private final Map<aet<? extends ht<?>>, Optional<? extends aes.a<?>>> b = new HashMap<>();

         @Override
         public <T> Optional<aes.a<T>> a(aet<? extends ht<? extends T>> $$0x) {
            return (Optional<aes.a<T>>)this.b.computeIfAbsent($$0, $$0::a);
         }
      };
   }

   public static <T> aes<T> a(DynamicOps<T> $$0, final hi.b $$1) {
      return a($$0, a(new aes.b() {
         @Override
         public <E> Optional<aes.a<E>> a(aet<? extends ht<? extends E>> $$0) {
            return $$1.a($$0).map($$0x -> (aes.a<E>)(new aes.a<>($$0x, $$0x, $$0x.g())));
         }
      }));
   }

   public static <T> aes<T> a(DynamicOps<T> $$0, aes.b $$1) {
      return new aes<>($$0, $$1);
   }

   private aes(DynamicOps<T> $$0, aes.b $$1) {
      super($$0);
      this.b = $$1;
   }

   public <E> Optional<hj<E>> a(aet<? extends ht<? extends E>> $$0) {
      return this.b.a($$0).map(aes.a::a);
   }

   public <E> Optional<hh<E>> b(aet<? extends ht<? extends E>> $$0) {
      return this.b.a($$0).map(aes.a::b);
   }

   public static <E, O> RecordCodecBuilder<O, hh<E>> c(aet<? extends ht<? extends E>> $$0) {
      return arb.b(
            (Function<DynamicOps<?>, DataResult<E>>)($$1 -> $$1 instanceof aes<?> $$2
                  ? $$2.b.a($$0).map($$0xx -> DataResult.success($$0xx.b(), $$0xx.c())).orElseGet(() -> DataResult.error(() -> "Unknown registry: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   public static <E, O> RecordCodecBuilder<O, hg.c<E>> d(aet<E> $$0) {
      aet<? extends ht<E>> $$1 = aet.a($$0.b());
      return arb.b(
            (Function<DynamicOps<?>, DataResult<E>>)($$2 -> $$2 instanceof aes<?> $$3
                  ? $$3.b
                     .a($$1)
                     .flatMap($$1xx -> $$1xx.b().a($$0))
                     .<DataResult<E>>map(DataResult::success)
                     .orElseGet(() -> DataResult.error(() -> "Can't find value: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   public static record a<T>(hj<T> a, hh<T> b, Lifecycle c) {
   }

   public interface b {
      <T> Optional<aes.a<T>> a(aet<? extends ht<? extends T>> var1);
   }
}
