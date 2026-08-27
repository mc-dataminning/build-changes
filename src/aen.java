import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class aen<T> extends aeh<T> {
   private final aen.b b;

   private static aen.b a(final aen.b $$0) {
      return new aen.b() {
         private final Map<aeo<? extends hs<?>>, Optional<? extends aen.a<?>>> b = new HashMap<>();

         @Override
         public <T> Optional<aen.a<T>> a(aeo<? extends hs<? extends T>> $$0x) {
            return (Optional<aen.a<T>>)this.b.computeIfAbsent($$0, $$0::a);
         }
      };
   }

   public static <T> aen<T> a(DynamicOps<T> $$0, final hh.b $$1) {
      return a($$0, a(new aen.b() {
         @Override
         public <E> Optional<aen.a<E>> a(aeo<? extends hs<? extends E>> $$0) {
            return $$1.a($$0).map($$0x -> (aen.a<E>)(new aen.a<>($$0x, $$0x, $$0x.g())));
         }
      }));
   }

   public static <T> aen<T> a(DynamicOps<T> $$0, aen.b $$1) {
      return new aen<>($$0, $$1);
   }

   private aen(DynamicOps<T> $$0, aen.b $$1) {
      super($$0);
      this.b = $$1;
   }

   public <E> Optional<hi<E>> a(aeo<? extends hs<? extends E>> $$0) {
      return this.b.a($$0).map(aen.a::a);
   }

   public <E> Optional<hg<E>> b(aeo<? extends hs<? extends E>> $$0) {
      return this.b.a($$0).map(aen.a::b);
   }

   public static <E, O> RecordCodecBuilder<O, hg<E>> c(aeo<? extends hs<? extends E>> $$0) {
      return aqw.a(
            (Function<DynamicOps<?>, DataResult<E>>)($$1 -> $$1 instanceof aen<?> $$2
                  ? $$2.b.a($$0).map($$0xx -> DataResult.success($$0xx.b(), $$0xx.c())).orElseGet(() -> DataResult.error(() -> "Unknown registry: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   public static <E, O> RecordCodecBuilder<O, hf.c<E>> d(aeo<E> $$0) {
      aeo<? extends hs<E>> $$1 = aeo.a($$0.b());
      return aqw.a(
            (Function<DynamicOps<?>, DataResult<E>>)($$2 -> $$2 instanceof aen<?> $$3
                  ? $$3.b
                     .a($$1)
                     .flatMap($$1xx -> $$1xx.b().a($$0))
                     .<DataResult<E>>map(DataResult::success)
                     .orElseGet(() -> DataResult.error(() -> "Can't find value: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   public static record a<T>(hi<T> a, hg<T> b, Lifecycle c) {
   }

   public interface b {
      <T> Optional<aen.a<T>> a(aeo<? extends hs<? extends T>> var1);
   }
}
