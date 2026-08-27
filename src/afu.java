import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class afu<T> extends afo<T> {
   private final afu.b b;

   private static afu.b a(final afu.b $$0) {
      return new afu.b() {
         private final Map<afv<? extends io<?>>, Optional<? extends afu.a<?>>> b = new HashMap<>();

         @Override
         public <T> Optional<afu.a<T>> a(afv<? extends io<? extends T>> $$0x) {
            return (Optional<afu.a<T>>)this.b.computeIfAbsent($$0, $$0::a);
         }
      };
   }

   public static <T> afu<T> a(DynamicOps<T> $$0, final id.b $$1) {
      return a($$0, a(new afu.b() {
         @Override
         public <E> Optional<afu.a<E>> a(afv<? extends io<? extends E>> $$0) {
            return $$1.a($$0).map($$0x -> (afu.a<E>)(new afu.a<>($$0x, $$0x, $$0x.g())));
         }
      }));
   }

   public static <T> afu<T> a(DynamicOps<T> $$0, afu.b $$1) {
      return new afu<>($$0, $$1);
   }

   private afu(DynamicOps<T> $$0, afu.b $$1) {
      super($$0);
      this.b = $$1;
   }

   public <E> Optional<ie<E>> a(afv<? extends io<? extends E>> $$0) {
      return this.b.a($$0).map(afu.a::a);
   }

   public <E> Optional<ic<E>> b(afv<? extends io<? extends E>> $$0) {
      return this.b.a($$0).map(afu.a::b);
   }

   public static <E, O> RecordCodecBuilder<O, ic<E>> c(afv<? extends io<? extends E>> $$0) {
      return asg.b(
            (Function<DynamicOps<?>, DataResult<E>>)($$1 -> $$1 instanceof afu<?> $$2
                  ? $$2.b.a($$0).map($$0xx -> DataResult.success($$0xx.b(), $$0xx.c())).orElseGet(() -> DataResult.error(() -> "Unknown registry: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   public static <E, O> RecordCodecBuilder<O, ib.c<E>> d(afv<E> $$0) {
      afv<? extends io<E>> $$1 = afv.a($$0.b());
      return asg.b(
            (Function<DynamicOps<?>, DataResult<E>>)($$2 -> $$2 instanceof afu<?> $$3
                  ? $$3.b
                     .a($$1)
                     .flatMap($$1xx -> $$1xx.b().a($$0))
                     .<DataResult<E>>map(DataResult::success)
                     .orElseGet(() -> DataResult.error(() -> "Can't find value: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   public static record a<T>(ie<T> a, ic<T> b, Lifecycle c) {
   }

   public interface b {
      <T> Optional<afu.a<T>> a(afv<? extends io<? extends T>> var1);
   }
}
