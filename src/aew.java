import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class aew<T> extends aeq<T> {
   private final aew.b b;

   private static aew.b a(final aew.b $$0) {
      return new aew.b() {
         private final Map<aex<? extends ht<?>>, Optional<? extends aew.a<?>>> b = new HashMap<>();

         @Override
         public <T> Optional<aew.a<T>> a(aex<? extends ht<? extends T>> $$0x) {
            return (Optional<aew.a<T>>)this.b.computeIfAbsent($$0, $$0::a);
         }
      };
   }

   public static <T> aew<T> a(DynamicOps<T> $$0, final hi.b $$1) {
      return a($$0, a(new aew.b() {
         @Override
         public <E> Optional<aew.a<E>> a(aex<? extends ht<? extends E>> $$0) {
            return $$1.a($$0).map($$0x -> (aew.a<E>)(new aew.a<>($$0x, $$0x, $$0x.g())));
         }
      }));
   }

   public static <T> aew<T> a(DynamicOps<T> $$0, aew.b $$1) {
      return new aew<>($$0, $$1);
   }

   private aew(DynamicOps<T> $$0, aew.b $$1) {
      super($$0);
      this.b = $$1;
   }

   public <E> Optional<hj<E>> a(aex<? extends ht<? extends E>> $$0) {
      return this.b.a($$0).map(aew.a::a);
   }

   public <E> Optional<hh<E>> b(aex<? extends ht<? extends E>> $$0) {
      return this.b.a($$0).map(aew.a::b);
   }

   public static <E, O> RecordCodecBuilder<O, hh<E>> c(aex<? extends ht<? extends E>> $$0) {
      return arh.b(
            (Function<DynamicOps<?>, DataResult<E>>)($$1 -> $$1 instanceof aew<?> $$2
                  ? $$2.b.a($$0).map($$0xx -> DataResult.success($$0xx.b(), $$0xx.c())).orElseGet(() -> DataResult.error(() -> "Unknown registry: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   public static <E, O> RecordCodecBuilder<O, hg.c<E>> d(aex<E> $$0) {
      aex<? extends ht<E>> $$1 = aex.a($$0.b());
      return arh.b(
            (Function<DynamicOps<?>, DataResult<E>>)($$2 -> $$2 instanceof aew<?> $$3
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
      <T> Optional<aew.a<T>> a(aex<? extends ht<? extends T>> var1);
   }
}
