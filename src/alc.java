import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class alc<T> extends akw<T> {
   private final alc.b b;

   private static alc.b a(final alc.b $$0) {
      return new alc.b() {
         private final Map<ald<? extends jv<?>>, Optional<? extends alc.a<?>>> b = new HashMap<>();

         @Override
         public <T> Optional<alc.a<T>> a(ald<? extends jv<? extends T>> $$0x) {
            return (Optional<alc.a<T>>)this.b.computeIfAbsent($$0, $$0::a);
         }
      };
   }

   public static <T> alc<T> a(DynamicOps<T> $$0, final jk.a $$1) {
      return a($$0, a(new alc.b() {
         @Override
         public <E> Optional<alc.a<E>> a(ald<? extends jv<? extends E>> $$0) {
            return $$1.a($$0).map(alc.a::a);
         }
      }));
   }

   public static <T> alc<T> a(DynamicOps<T> $$0, alc.b $$1) {
      return new alc<>($$0, $$1);
   }

   public static <T> Dynamic<T> a(Dynamic<T> $$0, jk.a $$1) {
      return new Dynamic($$1.a($$0.getOps()), $$0.getValue());
   }

   private alc(DynamicOps<T> $$0, alc.b $$1) {
      super($$0);
      this.b = $$1;
   }

   public <U> alc<U> a(DynamicOps<U> $$0) {
      return (alc<U>)($$0 == this.a ? this : new alc((DynamicOps<T>)$$0, this.b));
   }

   public <E> Optional<jl<E>> a(ald<? extends jv<? extends E>> $$0) {
      return this.b.a($$0).map(alc.a::a);
   }

   public <E> Optional<jj<E>> b(ald<? extends jv<? extends E>> $$0) {
      return this.b.a($$0).map(alc.a::b);
   }

   public static <E, O> RecordCodecBuilder<O, jj<E>> c(ald<? extends jv<? extends E>> $$0) {
      return ayf.a(
            (Function<DynamicOps<?>, DataResult<E>>)($$1 -> $$1 instanceof alc<?> $$2
                  ? $$2.b.a($$0).map($$0xx -> DataResult.success($$0xx.b(), $$0xx.c())).orElseGet(() -> DataResult.error(() -> "Unknown registry: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   public static <E, O> RecordCodecBuilder<O, ji.c<E>> d(ald<E> $$0) {
      ald<? extends jv<E>> $$1 = ald.a($$0.b());
      return ayf.a(
            (Function<DynamicOps<?>, DataResult<E>>)($$2 -> $$2 instanceof alc<?> $$3
                  ? $$3.b
                     .a($$1)
                     .flatMap($$1xx -> $$1xx.b().a($$0))
                     .<DataResult<E>>map(DataResult::success)
                     .orElseGet(() -> DataResult.error(() -> "Can't find value: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   public static record a<T>(jl<T> a, jj<T> b, Lifecycle c) {
      public static <T> alc.a<T> a(jk.b<T> $$0) {
         return new alc.a<>($$0, $$0, $$0.g());
      }
   }

   public interface b {
      <T> Optional<alc.a<T>> a(ald<? extends jv<? extends T>> var1);
   }
}
