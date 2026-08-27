import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class aja<T> extends aiu<T> {
   private final aja.b b;

   private static aja.b a(final aja.b $$0) {
      return new aja.b() {
         private final Map<ajb<? extends ix<?>>, Optional<? extends aja.a<?>>> b = new HashMap<>();

         @Override
         public <T> Optional<aja.a<T>> a(ajb<? extends ix<? extends T>> $$0x) {
            return (Optional<aja.a<T>>)this.b.computeIfAbsent($$0, $$0::a);
         }
      };
   }

   public static <T> aja<T> a(DynamicOps<T> $$0, final in.a $$1) {
      return a($$0, a(new aja.b() {
         @Override
         public <E> Optional<aja.a<E>> a(ajb<? extends ix<? extends E>> $$0) {
            return $$1.a($$0).map($$0x -> (aja.a<E>)(new aja.a<>($$0x, $$0x, $$0x.g())));
         }
      }));
   }

   public static <T> aja<T> a(DynamicOps<T> $$0, aja.b $$1) {
      return new aja<>($$0, $$1);
   }

   public static <T> Dynamic<T> a(Dynamic<T> $$0, in.a $$1) {
      return new Dynamic(a($$0.getOps(), $$1), $$0.getValue());
   }

   private aja(DynamicOps<T> $$0, aja.b $$1) {
      super($$0);
      this.b = $$1;
   }

   public <E> Optional<io<E>> a(ajb<? extends ix<? extends E>> $$0) {
      return this.b.a($$0).map(aja.a::a);
   }

   public <E> Optional<im<E>> b(ajb<? extends ix<? extends E>> $$0) {
      return this.b.a($$0).map(aja.a::b);
   }

   public static <E, O> RecordCodecBuilder<O, im<E>> c(ajb<? extends ix<? extends E>> $$0) {
      return avu.b(
            (Function<DynamicOps<?>, DataResult<E>>)($$1 -> $$1 instanceof aja<?> $$2
                  ? $$2.b.a($$0).map($$0xx -> DataResult.success($$0xx.b(), $$0xx.c())).orElseGet(() -> DataResult.error(() -> "Unknown registry: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   public static <E, O> RecordCodecBuilder<O, il.c<E>> d(ajb<E> $$0) {
      ajb<? extends ix<E>> $$1 = ajb.a($$0.b());
      return avu.b(
            (Function<DynamicOps<?>, DataResult<E>>)($$2 -> $$2 instanceof aja<?> $$3
                  ? $$3.b
                     .a($$1)
                     .flatMap($$1xx -> $$1xx.b().a($$0))
                     .<DataResult<E>>map(DataResult::success)
                     .orElseGet(() -> DataResult.error(() -> "Can't find value: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   public static record a<T>(io<T> a, im<T> b, Lifecycle c) {
   }

   public interface b {
      <T> Optional<aja.a<T>> a(ajb<? extends ix<? extends T>> var1);
   }
}
