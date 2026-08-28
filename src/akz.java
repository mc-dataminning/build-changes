import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class akz<T> extends akt<T> {
   private final akz.b b;

   private static akz.b a(final akz.b $$0) {
      return new akz.b() {
         private final Map<ala<? extends jv<?>>, Optional<? extends akz.a<?>>> b = new HashMap<>();

         @Override
         public <T> Optional<akz.a<T>> a(ala<? extends jv<? extends T>> $$0x) {
            return (Optional<akz.a<T>>)this.b.computeIfAbsent($$0, $$0::a);
         }
      };
   }

   public static <T> akz<T> a(DynamicOps<T> $$0, final jk.a $$1) {
      return a($$0, a(new akz.b() {
         @Override
         public <E> Optional<akz.a<E>> a(ala<? extends jv<? extends E>> $$0) {
            return $$1.a($$0).map(akz.a::a);
         }
      }));
   }

   public static <T> akz<T> a(DynamicOps<T> $$0, akz.b $$1) {
      return new akz<>($$0, $$1);
   }

   public static <T> Dynamic<T> a(Dynamic<T> $$0, jk.a $$1) {
      return new Dynamic($$1.a($$0.getOps()), $$0.getValue());
   }

   private akz(DynamicOps<T> $$0, akz.b $$1) {
      super($$0);
      this.b = $$1;
   }

   public <U> akz<U> a(DynamicOps<U> $$0) {
      return (akz<U>)($$0 == this.a ? this : new akz((DynamicOps<T>)$$0, this.b));
   }

   public <E> Optional<jl<E>> a(ala<? extends jv<? extends E>> $$0) {
      return this.b.a($$0).map(akz.a::a);
   }

   public <E> Optional<jj<E>> b(ala<? extends jv<? extends E>> $$0) {
      return this.b.a($$0).map(akz.a::b);
   }

   public static <E, O> RecordCodecBuilder<O, jj<E>> c(ala<? extends jv<? extends E>> $$0) {
      return ayc.a(
            (Function<DynamicOps<?>, DataResult<E>>)($$1 -> $$1 instanceof akz<?> $$2
                  ? $$2.b.a($$0).map($$0xx -> DataResult.success($$0xx.b(), $$0xx.c())).orElseGet(() -> DataResult.error(() -> "Unknown registry: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   public static <E, O> RecordCodecBuilder<O, ji.c<E>> d(ala<E> $$0) {
      ala<? extends jv<E>> $$1 = ala.a($$0.b());
      return ayc.a(
            (Function<DynamicOps<?>, DataResult<E>>)($$2 -> $$2 instanceof akz<?> $$3
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
      public static <T> akz.a<T> a(jk.b<T> $$0) {
         return new akz.a<>($$0, $$0, $$0.g());
      }
   }

   public interface b {
      <T> Optional<akz.a<T>> a(ala<? extends jv<? extends T>> var1);
   }
}
