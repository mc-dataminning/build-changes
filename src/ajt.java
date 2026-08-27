import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class ajt<T> extends ajn<T> {
   private final ajt.b b;

   private static ajt.b a(final ajt.b $$0) {
      return new ajt.b() {
         private final Map<aju<? extends ja<?>>, Optional<? extends ajt.a<?>>> b = new HashMap<>();

         @Override
         public <T> Optional<ajt.a<T>> a(aju<? extends ja<? extends T>> $$0x) {
            return (Optional<ajt.a<T>>)this.b.computeIfAbsent($$0, $$0::a);
         }
      };
   }

   public static <T> ajt<T> a(DynamicOps<T> $$0, final ip.a $$1) {
      return a($$0, a(new ajt.b() {
         @Override
         public <E> Optional<ajt.a<E>> a(aju<? extends ja<? extends E>> $$0) {
            return $$1.a($$0).map(ajt.a::a);
         }
      }));
   }

   public static <T> ajt<T> a(DynamicOps<T> $$0, ajt.b $$1) {
      return new ajt<>($$0, $$1);
   }

   public static <T> Dynamic<T> a(Dynamic<T> $$0, ip.a $$1) {
      return new Dynamic($$1.a($$0.getOps()), $$0.getValue());
   }

   private ajt(DynamicOps<T> $$0, ajt.b $$1) {
      super($$0);
      this.b = $$1;
   }

   public <U> ajt<U> a(DynamicOps<U> $$0) {
      return (ajt<U>)($$0 == this.a ? this : new ajt((DynamicOps<T>)$$0, this.b));
   }

   public <E> Optional<iq<E>> a(aju<? extends ja<? extends E>> $$0) {
      return this.b.a($$0).map(ajt.a::a);
   }

   public <E> Optional<io<E>> b(aju<? extends ja<? extends E>> $$0) {
      return this.b.a($$0).map(ajt.a::b);
   }

   public static <E, O> RecordCodecBuilder<O, io<E>> c(aju<? extends ja<? extends E>> $$0) {
      return awu.a(
            (Function<DynamicOps<?>, DataResult<E>>)($$1 -> $$1 instanceof ajt<?> $$2
                  ? $$2.b.a($$0).map($$0xx -> DataResult.success($$0xx.b(), $$0xx.c())).orElseGet(() -> DataResult.error(() -> "Unknown registry: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   public static <E, O> RecordCodecBuilder<O, in.c<E>> d(aju<E> $$0) {
      aju<? extends ja<E>> $$1 = aju.a($$0.b());
      return awu.a(
            (Function<DynamicOps<?>, DataResult<E>>)($$2 -> $$2 instanceof ajt<?> $$3
                  ? $$3.b
                     .a($$1)
                     .flatMap($$1xx -> $$1xx.b().a($$0))
                     .<DataResult<E>>map(DataResult::success)
                     .orElseGet(() -> DataResult.error(() -> "Can't find value: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   public static record a<T>(iq<T> a, io<T> b, Lifecycle c) {
      public static <T> ajt.a<T> a(ip.b<T> $$0) {
         return new ajt.a<>($$0, $$0, $$0.g());
      }
   }

   public interface b {
      <T> Optional<ajt.a<T>> a(aju<? extends ja<? extends T>> var1);
   }
}
