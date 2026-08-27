import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class ahe<T> extends agy<T> {
   private final ahe.b b;

   private static ahe.b a(final ahe.b $$0) {
      return new ahe.b() {
         private final Map<ahf<? extends it<?>>, Optional<? extends ahe.a<?>>> b = new HashMap<>();

         @Override
         public <T> Optional<ahe.a<T>> a(ahf<? extends it<? extends T>> $$0x) {
            return (Optional<ahe.a<T>>)this.b.computeIfAbsent($$0, $$0::a);
         }
      };
   }

   public static <T> ahe<T> a(DynamicOps<T> $$0, final ij.b $$1) {
      return a($$0, a(new ahe.b() {
         @Override
         public <E> Optional<ahe.a<E>> a(ahf<? extends it<? extends E>> $$0) {
            return $$1.a($$0).map($$0x -> (ahe.a<E>)(new ahe.a<>($$0x, $$0x, $$0x.g())));
         }
      }));
   }

   public static <T> ahe<T> a(DynamicOps<T> $$0, ahe.b $$1) {
      return new ahe<>($$0, $$1);
   }

   private ahe(DynamicOps<T> $$0, ahe.b $$1) {
      super($$0);
      this.b = $$1;
   }

   public <E> Optional<ik<E>> a(ahf<? extends it<? extends E>> $$0) {
      return this.b.a($$0).map(ahe.a::a);
   }

   public <E> Optional<ii<E>> b(ahf<? extends it<? extends E>> $$0) {
      return this.b.a($$0).map(ahe.a::b);
   }

   public static <E, O> RecordCodecBuilder<O, ii<E>> c(ahf<? extends it<? extends E>> $$0) {
      return atw.a(
            (Function<DynamicOps<?>, DataResult<E>>)($$1 -> $$1 instanceof ahe<?> $$2
                  ? $$2.b.a($$0).map($$0xx -> DataResult.success($$0xx.b(), $$0xx.c())).orElseGet(() -> DataResult.error(() -> "Unknown registry: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   public static <E, O> RecordCodecBuilder<O, ih.c<E>> d(ahf<E> $$0) {
      ahf<? extends it<E>> $$1 = ahf.a($$0.b());
      return atw.a(
            (Function<DynamicOps<?>, DataResult<E>>)($$2 -> $$2 instanceof ahe<?> $$3
                  ? $$3.b
                     .a($$1)
                     .flatMap($$1xx -> $$1xx.b().a($$0))
                     .<DataResult<E>>map(DataResult::success)
                     .orElseGet(() -> DataResult.error(() -> "Can't find value: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   public static record a<T>(ik<T> a, ii<T> b, Lifecycle c) {
   }

   public interface b {
      <T> Optional<ahe.a<T>> a(ahf<? extends it<? extends T>> var1);
   }
}
