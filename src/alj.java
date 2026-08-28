import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

public class alj<T> extends alc<T> {
   private final alj.c b;

   public static <T> alj<T> a(DynamicOps<T> $$0, js.a $$1) {
      return a($$0, new alj.a($$1));
   }

   public static <T> alj<T> a(DynamicOps<T> $$0, alj.c $$1) {
      return new alj<>($$0, $$1);
   }

   public static <T> Dynamic<T> a(Dynamic<T> $$0, js.a $$1) {
      return new Dynamic($$1.a($$0.getOps()), $$0.getValue());
   }

   private alj(DynamicOps<T> $$0, alj.c $$1) {
      super($$0);
      this.b = $$1;
   }

   public <U> alj<U> a(DynamicOps<U> $$0) {
      return (alj<U>)($$0 == this.a ? this : new alj((DynamicOps<T>)$$0, this.b));
   }

   public <E> Optional<jt<E>> a(alk<? extends kd<? extends E>> $$0) {
      return this.b.a($$0).map(alj.b::a);
   }

   public <E> Optional<jr<E>> b(alk<? extends kd<? extends E>> $$0) {
      return this.b.a($$0).map(alj.b::b);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         alj<?> $$1 = (alj<?>)$$0;
         return this.a.equals($$1.a) && this.b.equals($$1.b);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode() * 31 + this.b.hashCode();
   }

   public static <E, O> RecordCodecBuilder<O, jr<E>> c(alk<? extends kd<? extends E>> $$0) {
      return ayw.a(
            (Function<DynamicOps<?>, DataResult<E>>)($$1 -> $$1 instanceof alj<?> $$2
                  ? $$2.b.a($$0).map($$0xx -> DataResult.success($$0xx.b(), $$0xx.c())).orElseGet(() -> DataResult.error(() -> "Unknown registry: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   public static <E, O> RecordCodecBuilder<O, jq.c<E>> d(alk<E> $$0) {
      alk<? extends kd<E>> $$1 = alk.a($$0.b());
      return ayw.a(
            (Function<DynamicOps<?>, DataResult<E>>)($$2 -> $$2 instanceof alj<?> $$3
                  ? $$3.b
                     .a($$1)
                     .flatMap($$1xx -> $$1xx.b().a($$0))
                     .<DataResult<E>>map(DataResult::success)
                     .orElseGet(() -> DataResult.error(() -> "Can't find value: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   static final class a implements alj.c {
      private final js.a a;
      private final Map<alk<? extends kd<?>>, Optional<? extends alj.b<?>>> b = new ConcurrentHashMap<>();

      public a(js.a $$0) {
         this.a = $$0;
      }

      @Override
      public <E> Optional<alj.b<E>> a(alk<? extends kd<? extends E>> $$0) {
         return (Optional<alj.b<E>>)this.b.computeIfAbsent($$0, this::b);
      }

      private Optional<alj.b<Object>> b(alk<? extends kd<?>> $$0) {
         return this.a.a($$0).map(alj.b::a);
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            if ($$0 instanceof alj.a $$1 && this.a.equals($$1.a)) {
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

   public static record b<T>(jt<T> a, jr<T> b, Lifecycle c) {
      public static <T> alj.b<T> a(js.b<T> $$0) {
         return new alj.b<>($$0, $$0, $$0.h());
      }
   }

   public interface c {
      <T> Optional<alj.b<T>> a(alk<? extends kd<? extends T>> var1);
   }
}
