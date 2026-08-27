import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class akr<T> extends akl<T> {
   private final akr.b b;

   private static akr.b a(final akr.b $$0) {
      return new akr.b() {
         private final Map<aks<? extends jn<?>>, Optional<? extends akr.a<?>>> b = new HashMap<>();

         @Override
         public <T> Optional<akr.a<T>> a(aks<? extends jn<? extends T>> $$0x) {
            return (Optional<akr.a<T>>)this.b.computeIfAbsent($$0, $$0::a);
         }
      };
   }

   public static <T> akr<T> a(DynamicOps<T> $$0, final jc.a $$1) {
      return a($$0, a(new akr.b() {
         @Override
         public <E> Optional<akr.a<E>> a(aks<? extends jn<? extends E>> $$0) {
            return $$1.a($$0).map(akr.a::a);
         }
      }));
   }

   public static <T> akr<T> a(DynamicOps<T> $$0, akr.b $$1) {
      return new akr<>($$0, $$1);
   }

   public static <T> Dynamic<T> a(Dynamic<T> $$0, jc.a $$1) {
      return new Dynamic($$1.a($$0.getOps()), $$0.getValue());
   }

   private akr(DynamicOps<T> $$0, akr.b $$1) {
      super($$0);
      this.b = $$1;
   }

   public <U> akr<U> a(DynamicOps<U> $$0) {
      return (akr<U>)($$0 == this.a ? this : new akr((DynamicOps<T>)$$0, this.b));
   }

   public <E> Optional<jd<E>> a(aks<? extends jn<? extends E>> $$0) {
      return this.b.a($$0).map(akr.a::a);
   }

   public <E> Optional<jb<E>> b(aks<? extends jn<? extends E>> $$0) {
      return this.b.a($$0).map(akr.a::b);
   }

   public static <E, O> RecordCodecBuilder<O, jb<E>> c(aks<? extends jn<? extends E>> $$0) {
      return axu.a(
            (Function<DynamicOps<?>, DataResult<E>>)($$1 -> $$1 instanceof akr<?> $$2
                  ? $$2.b.a($$0).map($$0xx -> DataResult.success($$0xx.b(), $$0xx.c())).orElseGet(() -> DataResult.error(() -> "Unknown registry: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   public static <E, O> RecordCodecBuilder<O, ja.c<E>> d(aks<E> $$0) {
      aks<? extends jn<E>> $$1 = aks.a($$0.b());
      return axu.a(
            (Function<DynamicOps<?>, DataResult<E>>)($$2 -> $$2 instanceof akr<?> $$3
                  ? $$3.b
                     .a($$1)
                     .flatMap($$1xx -> $$1xx.b().a($$0))
                     .<DataResult<E>>map(DataResult::success)
                     .orElseGet(() -> DataResult.error(() -> "Can't find value: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   public static record a<T>(jd<T> a, jb<T> b, Lifecycle c) {
      public static <T> akr.a<T> a(jc.b<T> $$0) {
         return new akr.a<>($$0, $$0, $$0.g());
      }
   }

   public interface b {
      <T> Optional<akr.a<T>> a(aks<? extends jn<? extends T>> var1);
   }
}
