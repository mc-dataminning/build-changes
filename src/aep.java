import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class aep<T> extends aej<T> {
   private final aep.b b;

   private static aep.b a(final aep.b $$0) {
      return new aep.b() {
         private final Map<aeq<? extends hr<?>>, Optional<? extends aep.a<?>>> b = new HashMap<>();

         @Override
         public <T> Optional<aep.a<T>> a(aeq<? extends hr<? extends T>> $$0x) {
            return (Optional<aep.a<T>>)this.b.computeIfAbsent($$0, $$0::a);
         }
      };
   }

   public static <T> aep<T> a(DynamicOps<T> $$0, final hg.b $$1) {
      return a($$0, a(new aep.b() {
         @Override
         public <E> Optional<aep.a<E>> a(aeq<? extends hr<? extends E>> $$0) {
            return $$1.a($$0).map($$0x -> (aep.a<E>)(new aep.a<>($$0x, $$0x, $$0x.g())));
         }
      }));
   }

   public static <T> aep<T> a(DynamicOps<T> $$0, aep.b $$1) {
      return new aep<>($$0, $$1);
   }

   private aep(DynamicOps<T> $$0, aep.b $$1) {
      super($$0);
      this.b = $$1;
   }

   public <E> Optional<hh<E>> a(aeq<? extends hr<? extends E>> $$0) {
      return this.b.a($$0).map(aep.a::a);
   }

   public <E> Optional<hf<E>> b(aeq<? extends hr<? extends E>> $$0) {
      return this.b.a($$0).map(aep.a::b);
   }

   public static <E, O> RecordCodecBuilder<O, hf<E>> c(aeq<? extends hr<? extends E>> $$0) {
      return aqy.b(
            (Function<DynamicOps<?>, DataResult<E>>)($$1 -> $$1 instanceof aep<?> $$2
                  ? $$2.b.a($$0).map($$0xx -> DataResult.success($$0xx.b(), $$0xx.c())).orElseGet(() -> DataResult.error(() -> "Unknown registry: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   public static <E, O> RecordCodecBuilder<O, he.c<E>> d(aeq<E> $$0) {
      aeq<? extends hr<E>> $$1 = aeq.a($$0.b());
      return aqy.b(
            (Function<DynamicOps<?>, DataResult<E>>)($$2 -> $$2 instanceof aep<?> $$3
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
      <T> Optional<aep.a<T>> a(aeq<? extends hr<? extends T>> var1);
   }
}
