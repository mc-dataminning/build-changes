import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class aev<T> extends aep<T> {
   private final aev.b b;

   private static aev.b a(final aev.b $$0) {
      return new aev.b() {
         private final Map<aew<? extends ht<?>>, Optional<? extends aev.a<?>>> b = new HashMap<>();

         @Override
         public <T> Optional<aev.a<T>> a(aew<? extends ht<? extends T>> $$0x) {
            return (Optional<aev.a<T>>)this.b.computeIfAbsent($$0, $$0::a);
         }
      };
   }

   public static <T> aev<T> a(DynamicOps<T> $$0, final hi.b $$1) {
      return a($$0, a(new aev.b() {
         @Override
         public <E> Optional<aev.a<E>> a(aew<? extends ht<? extends E>> $$0) {
            return $$1.a($$0).map($$0x -> (aev.a<E>)(new aev.a<>($$0x, $$0x, $$0x.g())));
         }
      }));
   }

   public static <T> aev<T> a(DynamicOps<T> $$0, aev.b $$1) {
      return new aev<>($$0, $$1);
   }

   private aev(DynamicOps<T> $$0, aev.b $$1) {
      super($$0);
      this.b = $$1;
   }

   public <E> Optional<hj<E>> a(aew<? extends ht<? extends E>> $$0) {
      return this.b.a($$0).map(aev.a::a);
   }

   public <E> Optional<hh<E>> b(aew<? extends ht<? extends E>> $$0) {
      return this.b.a($$0).map(aev.a::b);
   }

   public static <E, O> RecordCodecBuilder<O, hh<E>> c(aew<? extends ht<? extends E>> $$0) {
      return arg.b(
            (Function<DynamicOps<?>, DataResult<E>>)($$1 -> $$1 instanceof aev<?> $$2
                  ? $$2.b.a($$0).map($$0xx -> DataResult.success($$0xx.b(), $$0xx.c())).orElseGet(() -> DataResult.error(() -> "Unknown registry: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   public static <E, O> RecordCodecBuilder<O, hg.c<E>> d(aew<E> $$0) {
      aew<? extends ht<E>> $$1 = aew.a($$0.b());
      return arg.b(
            (Function<DynamicOps<?>, DataResult<E>>)($$2 -> $$2 instanceof aev<?> $$3
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
      <T> Optional<aev.a<T>> a(aew<? extends ht<? extends T>> var1);
   }
}
