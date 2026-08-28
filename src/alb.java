import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

public class alb<T> extends aku<T> {
   private final alb.c b;

   public static <T> alb<T> a(DynamicOps<T> $$0, ju.a $$1) {
      return a($$0, new alb.a($$1));
   }

   public static <T> alb<T> a(DynamicOps<T> $$0, alb.c $$1) {
      return new alb<>($$0, $$1);
   }

   public static <T> Dynamic<T> a(Dynamic<T> $$0, ju.a $$1) {
      return new Dynamic($$1.a($$0.getOps()), $$0.getValue());
   }

   private alb(DynamicOps<T> $$0, alb.c $$1) {
      super($$0);
      this.b = $$1;
   }

   public <U> alb<U> a(DynamicOps<U> $$0) {
      return (alb<U>)($$0 == this.a ? this : new alb((DynamicOps<T>)$$0, this.b));
   }

   public <E> Optional<jv<E>> a(alc<? extends kf<? extends E>> $$0) {
      return this.b.a($$0).map(alb.b::a);
   }

   public <E> Optional<jt<E>> b(alc<? extends kf<? extends E>> $$0) {
      return this.b.a($$0).map(alb.b::b);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         alb<?> $$1 = (alb<?>)$$0;
         return this.a.equals($$1.a) && this.b.equals($$1.b);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode() * 31 + this.b.hashCode();
   }

   public static <E, O> RecordCodecBuilder<O, jt<E>> c(alc<? extends kf<? extends E>> $$0) {
      return ays.a(
            (Function<DynamicOps<?>, DataResult<E>>)($$1 -> $$1 instanceof alb<?> $$2
                  ? $$2.b.a($$0).map($$0xx -> DataResult.success($$0xx.b(), $$0xx.c())).orElseGet(() -> DataResult.error(() -> "Unknown registry: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   public static <E, O> RecordCodecBuilder<O, js.c<E>> d(alc<E> $$0) {
      alc<? extends kf<E>> $$1 = alc.a($$0.b());
      return ays.a(
            (Function<DynamicOps<?>, DataResult<E>>)($$2 -> $$2 instanceof alb<?> $$3
                  ? $$3.b
                     .a($$1)
                     .flatMap($$1xx -> $$1xx.b().a($$0))
                     .<DataResult<E>>map(DataResult::success)
                     .orElseGet(() -> DataResult.error(() -> "Can't find value: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   static final class a implements alb.c {
      private final ju.a a;
      private final Map<alc<? extends kf<?>>, Optional<? extends alb.b<?>>> b = new ConcurrentHashMap<>();

      public a(ju.a $$0) {
         this.a = $$0;
      }

      @Override
      public <E> Optional<alb.b<E>> a(alc<? extends kf<? extends E>> $$0) {
         return (Optional<alb.b<E>>)this.b.computeIfAbsent($$0, this::b);
      }

      private Optional<alb.b<Object>> b(alc<? extends kf<?>> $$0) {
         return this.a.a($$0).map(alb.b::a);
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            if ($$0 instanceof alb.a $$1 && this.a.equals($$1.a)) {
               return true;
            }

            return false;
         }
      }

      @Override
      public int hashCode() {
         return this.a.hashCode();
      }
   }

   public static record b<T>(jv<T> a, jt<T> b, Lifecycle c) {
      public static <T> alb.b<T> a(ju.b<T> $$0) {
         return new alb.b<>($$0, $$0, $$0.h());
      }
   }

   public interface c {
      <T> Optional<alb.b<T>> a(alc<? extends kf<? extends T>> var1);
   }
}
