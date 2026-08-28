import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

public class aki<T> extends akc<T> {
   private final aki.c b;

   public static <T> aki<T> a(DynamicOps<T> $$0, jl.a $$1) {
      return a($$0, new aki.a($$1));
   }

   public static <T> aki<T> a(DynamicOps<T> $$0, aki.c $$1) {
      return new aki<>($$0, $$1);
   }

   public static <T> Dynamic<T> a(Dynamic<T> $$0, jl.a $$1) {
      return new Dynamic($$1.a($$0.getOps()), $$0.getValue());
   }

   private aki(DynamicOps<T> $$0, aki.c $$1) {
      super($$0);
      this.b = $$1;
   }

   public <U> aki<U> a(DynamicOps<U> $$0) {
      return (aki<U>)($$0 == this.a ? this : new aki((DynamicOps<T>)$$0, this.b));
   }

   public <E> Optional<jm<E>> a(akj<? extends jw<? extends E>> $$0) {
      return this.b.a($$0).map(aki.b::a);
   }

   public <E> Optional<jk<E>> b(akj<? extends jw<? extends E>> $$0) {
      return this.b.a($$0).map(aki.b::b);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         aki<?> $$1 = (aki<?>)$$0;
         return this.a.equals($$1.a) && this.b.equals($$1.b);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode() * 31 + this.b.hashCode();
   }

   public static <E, O> RecordCodecBuilder<O, jk<E>> c(akj<? extends jw<? extends E>> $$0) {
      return axm.a(
            (Function<DynamicOps<?>, DataResult<E>>)($$1 -> $$1 instanceof aki<?> $$2
                  ? $$2.b.a($$0).map($$0xx -> DataResult.success($$0xx.b(), $$0xx.c())).orElseGet(() -> DataResult.error(() -> "Unknown registry: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   public static <E, O> RecordCodecBuilder<O, jj.c<E>> d(akj<E> $$0) {
      akj<? extends jw<E>> $$1 = akj.a($$0.b());
      return axm.a(
            (Function<DynamicOps<?>, DataResult<E>>)($$2 -> $$2 instanceof aki<?> $$3
                  ? $$3.b
                     .a($$1)
                     .flatMap($$1xx -> $$1xx.b().a($$0))
                     .<DataResult<E>>map(DataResult::success)
                     .orElseGet(() -> DataResult.error(() -> "Can't find value: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   static final class a implements aki.c {
      private final jl.a a;
      private final Map<akj<? extends jw<?>>, Optional<? extends aki.b<?>>> b = new ConcurrentHashMap<>();

      public a(jl.a $$0) {
         this.a = $$0;
      }

      @Override
      public <E> Optional<aki.b<E>> a(akj<? extends jw<? extends E>> $$0) {
         return (Optional<aki.b<E>>)this.b.computeIfAbsent($$0, this::b);
      }

      private Optional<aki.b<Object>> b(akj<? extends jw<?>> $$0) {
         return this.a.a($$0).map(aki.b::a);
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            if ($$0 instanceof aki.a $$1 && this.a.equals($$1.a)) {
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

   public static record b<T>(jm<T> a, jk<T> b, Lifecycle c) {
      public static <T> aki.b<T> a(jl.b<T> $$0) {
         return new aki.b<>($$0, $$0, $$0.g());
      }
   }

   public interface c {
      <T> Optional<aki.b<T>> a(akj<? extends jw<? extends T>> var1);
   }
}
