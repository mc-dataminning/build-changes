import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class aiw<T> extends aiq<T> {
   private final aiw.b b;

   private static aiw.b a(final aiw.b $$0) {
      return new aiw.b() {
         private final Map<aix<? extends iv<?>>, Optional<? extends aiw.a<?>>> b = new HashMap<>();

         @Override
         public <T> Optional<aiw.a<T>> a(aix<? extends iv<? extends T>> $$0x) {
            return (Optional<aiw.a<T>>)this.b.computeIfAbsent($$0, $$0::a);
         }
      };
   }

   public static <T> aiw<T> a(DynamicOps<T> $$0, final il.b $$1) {
      return a($$0, a(new aiw.b() {
         @Override
         public <E> Optional<aiw.a<E>> a(aix<? extends iv<? extends E>> $$0) {
            return $$1.a($$0).map($$0x -> (aiw.a<E>)(new aiw.a<>($$0x, $$0x, $$0x.g())));
         }
      }));
   }

   public static <T> aiw<T> a(DynamicOps<T> $$0, aiw.b $$1) {
      return new aiw<>($$0, $$1);
   }

   private aiw(DynamicOps<T> $$0, aiw.b $$1) {
      super($$0);
      this.b = $$1;
   }

   public <E> Optional<im<E>> a(aix<? extends iv<? extends E>> $$0) {
      return this.b.a($$0).map(aiw.a::a);
   }

   public <E> Optional<ik<E>> b(aix<? extends iv<? extends E>> $$0) {
      return this.b.a($$0).map(aiw.a::b);
   }

   public static <E, O> RecordCodecBuilder<O, ik<E>> c(aix<? extends iv<? extends E>> $$0) {
      return avq.a(
            (Function<DynamicOps<?>, DataResult<E>>)($$1 -> $$1 instanceof aiw<?> $$2
                  ? $$2.b.a($$0).map($$0xx -> DataResult.success($$0xx.b(), $$0xx.c())).orElseGet(() -> DataResult.error(() -> "Unknown registry: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   public static <E, O> RecordCodecBuilder<O, ij.c<E>> d(aix<E> $$0) {
      aix<? extends iv<E>> $$1 = aix.a($$0.b());
      return avq.a(
            (Function<DynamicOps<?>, DataResult<E>>)($$2 -> $$2 instanceof aiw<?> $$3
                  ? $$3.b
                     .a($$1)
                     .flatMap($$1xx -> $$1xx.b().a($$0))
                     .<DataResult<E>>map(DataResult::success)
                     .orElseGet(() -> DataResult.error(() -> "Can't find value: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   public static record a<T>(im<T> a, ik<T> b, Lifecycle c) {
   }

   public interface b {
      <T> Optional<aiw.a<T>> a(aix<? extends iv<? extends T>> var1);
   }
}
