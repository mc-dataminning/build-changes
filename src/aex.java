import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class aex<T> extends aer<T> {
   private final aex.b b;

   private static aex.b a(final aex.b $$0) {
      return new aex.b() {
         private final Map<aey<? extends hq<?>>, Optional<? extends aex.a<?>>> b = new HashMap<>();

         @Override
         public <T> Optional<aex.a<T>> a(aey<? extends hq<? extends T>> $$0x) {
            return (Optional<aex.a<T>>)this.b.computeIfAbsent($$0, $$0::a);
         }
      };
   }

   public static <T> aex<T> a(DynamicOps<T> $$0, final hg.b $$1) {
      return a($$0, a(new aex.b() {
         @Override
         public <E> Optional<aex.a<E>> a(aey<? extends hq<? extends E>> $$0) {
            return $$1.a($$0).map($$0x -> (aex.a<E>)(new aex.a<>($$0x, $$0x, $$0x.g())));
         }
      }));
   }

   public static <T> aex<T> a(DynamicOps<T> $$0, aex.b $$1) {
      return new aex<>($$0, $$1);
   }

   private aex(DynamicOps<T> $$0, aex.b $$1) {
      super($$0);
      this.b = $$1;
   }

   public <E> Optional<hh<E>> a(aey<? extends hq<? extends E>> $$0) {
      return this.b.a($$0).map(aex.a::a);
   }

   public <E> Optional<hf<E>> b(aey<? extends hq<? extends E>> $$0) {
      return this.b.a($$0).map(aex.a::b);
   }

   public static <E, O> RecordCodecBuilder<O, hf<E>> c(aey<? extends hq<? extends E>> $$0) {
      return arj.b(
            (Function<DynamicOps<?>, DataResult<E>>)($$1 -> $$1 instanceof aex<?> $$2
                  ? $$2.b.a($$0).map($$0xx -> DataResult.success($$0xx.b(), $$0xx.c())).orElseGet(() -> DataResult.error(() -> "Unknown registry: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   public static <E, O> RecordCodecBuilder<O, he.c<E>> d(aey<E> $$0) {
      aey<? extends hq<E>> $$1 = aey.a($$0.b());
      return arj.b(
            (Function<DynamicOps<?>, DataResult<E>>)($$2 -> $$2 instanceof aex<?> $$3
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
      <T> Optional<aex.a<T>> a(aey<? extends hq<? extends T>> var1);
   }
}
