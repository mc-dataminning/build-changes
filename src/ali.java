import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

public class ali<T> extends alb<T> {
   private final ali.c b;

   public static <T> ali<T> a(DynamicOps<T> $$0, ji.a $$1) {
      return a($$0, new ali.a($$1));
   }

   public static <T> ali<T> a(DynamicOps<T> $$0, ali.c $$1) {
      return new ali<>($$0, $$1);
   }

   public static <T> Dynamic<T> a(Dynamic<T> $$0, ji.a $$1) {
      return new Dynamic($$1.a($$0.getOps()), $$0.getValue());
   }

   private ali(DynamicOps<T> $$0, ali.c $$1) {
      super($$0);
      this.b = $$1;
   }

   public <U> ali<U> a(DynamicOps<U> $$0) {
      return (ali<U>)($$0 == this.a ? this : new ali((DynamicOps<T>)$$0, this.b));
   }

   public <E> Optional<jj<E>> a(alj<? extends jt<? extends E>> $$0) {
      return this.b.a($$0).map(ali.b::a);
   }

   public <E> Optional<jh<E>> b(alj<? extends jt<? extends E>> $$0) {
      return this.b.a($$0).map(ali.b::b);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         ali<?> $$1 = (ali<?>)$$0;
         return this.a.equals($$1.a) && this.b.equals($$1.b);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode() * 31 + this.b.hashCode();
   }

   public static <E, O> RecordCodecBuilder<O, jh<E>> c(alj<? extends jt<? extends E>> $$0) {
      return ayy.a(
            (Function<DynamicOps<?>, DataResult<E>>)($$1 -> $$1 instanceof ali<?> $$2
                  ? $$2.b.a($$0).map($$0xx -> DataResult.success($$0xx.b(), $$0xx.c())).orElseGet(() -> DataResult.error(() -> "Unknown registry: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   public static <E, O> RecordCodecBuilder<O, jg.c<E>> d(alj<E> $$0) {
      alj<? extends jt<E>> $$1 = alj.a($$0.b());
      return ayy.a(
            (Function<DynamicOps<?>, DataResult<E>>)($$2 -> $$2 instanceof ali<?> $$3
                  ? $$3.b
                     .a($$1)
                     .flatMap($$1xx -> $$1xx.b().a($$0))
                     .<DataResult<E>>map(DataResult::success)
                     .orElseGet(() -> DataResult.error(() -> "Can't find value: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   static final class a implements ali.c {
      private final ji.a a;
      private final Map<alj<? extends jt<?>>, Optional<? extends ali.b<?>>> b = new ConcurrentHashMap<>();

      public a(ji.a $$0) {
         this.a = $$0;
      }

      @Override
      public <E> Optional<ali.b<E>> a(alj<? extends jt<? extends E>> $$0) {
         return (Optional<ali.b<E>>)this.b.computeIfAbsent($$0, this::b);
      }

      private Optional<ali.b<Object>> b(alj<? extends jt<?>> $$0) {
         return this.a.a($$0).map(ali.b::a);
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            if ($$0 instanceof ali.a $$1 && this.a.equals($$1.a)) {
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

   public static record b<T>(jj<T> a, jh<T> b, Lifecycle c) {
      public static <T> ali.b<T> a(ji.b<T> $$0) {
         return new ali.b<>($$0, $$0, $$0.h());
      }
   }

   public interface c {
      <T> Optional<ali.b<T>> a(alj<? extends jt<? extends T>> var1);
   }
}
