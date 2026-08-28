import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

public class alf<T> extends aky<T> {
   private final alf.c b;

   public static <T> alf<T> a(DynamicOps<T> $$0, jr.a $$1) {
      return a($$0, new alf.a($$1));
   }

   public static <T> alf<T> a(DynamicOps<T> $$0, alf.c $$1) {
      return new alf<>($$0, $$1);
   }

   public static <T> Dynamic<T> a(Dynamic<T> $$0, jr.a $$1) {
      return new Dynamic($$1.a($$0.getOps()), $$0.getValue());
   }

   private alf(DynamicOps<T> $$0, alf.c $$1) {
      super($$0);
      this.b = $$1;
   }

   public <U> alf<U> a(DynamicOps<U> $$0) {
      return (alf<U>)($$0 == this.a ? this : new alf((DynamicOps<T>)$$0, this.b));
   }

   public <E> Optional<js<E>> a(alg<? extends kc<? extends E>> $$0) {
      return this.b.a($$0).map(alf.b::a);
   }

   public <E> Optional<jq<E>> b(alg<? extends kc<? extends E>> $$0) {
      return this.b.a($$0).map(alf.b::b);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         alf<?> $$1 = (alf<?>)$$0;
         return this.a.equals($$1.a) && this.b.equals($$1.b);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode() * 31 + this.b.hashCode();
   }

   public static <E, O> RecordCodecBuilder<O, jq<E>> c(alg<? extends kc<? extends E>> $$0) {
      return ays.a(
            (Function<DynamicOps<?>, DataResult<E>>)($$1 -> $$1 instanceof alf<?> $$2
                  ? $$2.b.a($$0).map($$0xx -> DataResult.success($$0xx.b(), $$0xx.c())).orElseGet(() -> DataResult.error(() -> "Unknown registry: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   public static <E, O> RecordCodecBuilder<O, jp.c<E>> d(alg<E> $$0) {
      alg<? extends kc<E>> $$1 = alg.a($$0.b());
      return ays.a(
            (Function<DynamicOps<?>, DataResult<E>>)($$2 -> $$2 instanceof alf<?> $$3
                  ? $$3.b
                     .a($$1)
                     .flatMap($$1xx -> $$1xx.b().a($$0))
                     .<DataResult<E>>map(DataResult::success)
                     .orElseGet(() -> DataResult.error(() -> "Can't find value: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   static final class a implements alf.c {
      private final jr.a a;
      private final Map<alg<? extends kc<?>>, Optional<? extends alf.b<?>>> b = new ConcurrentHashMap<>();

      public a(jr.a $$0) {
         this.a = $$0;
      }

      @Override
      public <E> Optional<alf.b<E>> a(alg<? extends kc<? extends E>> $$0) {
         return (Optional<alf.b<E>>)this.b.computeIfAbsent($$0, this::b);
      }

      private Optional<alf.b<Object>> b(alg<? extends kc<?>> $$0) {
         return this.a.a($$0).map(alf.b::a);
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            if ($$0 instanceof alf.a $$1 && this.a.equals($$1.a)) {
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

   public static record b<T>(js<T> a, jq<T> b, Lifecycle c) {
      public static <T> alf.b<T> a(jr.b<T> $$0) {
         return new alf.b<>($$0, $$0, $$0.h());
      }
   }

   public interface c {
      <T> Optional<alf.b<T>> a(alg<? extends kc<? extends T>> var1);
   }
}
