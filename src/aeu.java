import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class aeu<T> extends aeo<T> {
   private final aeu.b b;

   private static aeu.b a(final aeu.b $$0) {
      return new aeu.b() {
         private final Map<aev<? extends hq<?>>, Optional<? extends aeu.a<?>>> b = new HashMap<>();

         @Override
         public <T> Optional<aeu.a<T>> a(aev<? extends hq<? extends T>> $$0x) {
            return (Optional<aeu.a<T>>)this.b.computeIfAbsent($$0, $$0::a);
         }
      };
   }

   public static <T> aeu<T> a(DynamicOps<T> $$0, final hg.b $$1) {
      return a($$0, a(new aeu.b() {
         @Override
         public <E> Optional<aeu.a<E>> a(aev<? extends hq<? extends E>> $$0) {
            return $$1.a($$0).map($$0x -> (aeu.a<E>)(new aeu.a<>($$0x, $$0x, $$0x.g())));
         }
      }));
   }

   public static <T> aeu<T> a(DynamicOps<T> $$0, aeu.b $$1) {
      return new aeu<>($$0, $$1);
   }

   private aeu(DynamicOps<T> $$0, aeu.b $$1) {
      super($$0);
      this.b = $$1;
   }

   public <E> Optional<hh<E>> a(aev<? extends hq<? extends E>> $$0) {
      return this.b.a($$0).map(aeu.a::a);
   }

   public <E> Optional<hf<E>> b(aev<? extends hq<? extends E>> $$0) {
      return this.b.a($$0).map(aeu.a::b);
   }

   public static <E, O> RecordCodecBuilder<O, hf<E>> c(aev<? extends hq<? extends E>> $$0) {
      return arf.b(
            (Function<DynamicOps<?>, DataResult<E>>)($$1 -> $$1 instanceof aeu<?> $$2
                  ? $$2.b.a($$0).map($$0xx -> DataResult.success($$0xx.b(), $$0xx.c())).orElseGet(() -> DataResult.error(() -> "Unknown registry: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   public static <E, O> RecordCodecBuilder<O, he.c<E>> d(aev<E> $$0) {
      aev<? extends hq<E>> $$1 = aev.a($$0.b());
      return arf.b(
            (Function<DynamicOps<?>, DataResult<E>>)($$2 -> $$2 instanceof aeu<?> $$3
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
      <T> Optional<aeu.a<T>> a(aev<? extends hq<? extends T>> var1);
   }
}
