import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

public class alx<T> extends alq<T> {
   private final alx.c b;

   public static <T> alx<T> a(DynamicOps<T> $$0, js.a $$1) {
      return a($$0, new alx.a($$1));
   }

   public static <T> alx<T> a(DynamicOps<T> $$0, alx.c $$1) {
      return new alx<>($$0, $$1);
   }

   public static <T> Dynamic<T> a(Dynamic<T> $$0, js.a $$1) {
      return new Dynamic($$1.a($$0.getOps()), $$0.getValue());
   }

   private alx(DynamicOps<T> $$0, alx.c $$1) {
      super($$0);
      this.b = $$1;
   }

   public <U> alx<U> a(DynamicOps<U> $$0) {
      return (alx<U>)($$0 == this.a ? this : new alx((DynamicOps<T>)$$0, this.b));
   }

   public <E> Optional<jt<E>> a(aly<? extends kd<? extends E>> $$0) {
      return this.b.a($$0).map(alx.b::a);
   }

   public <E> Optional<jr<E>> b(aly<? extends kd<? extends E>> $$0) {
      return this.b.a($$0).map(alx.b::b);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         alx<?> $$1 = (alx<?>)$$0;
         return this.a.equals($$1.a) && this.b.equals($$1.b);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode() * 31 + this.b.hashCode();
   }

   public static <E, O> RecordCodecBuilder<O, jr<E>> c(aly<? extends kd<? extends E>> $$0) {
      return azn.a(
            (Function<DynamicOps<?>, DataResult<E>>)($$1 -> $$1 instanceof alx<?> $$2
                  ? $$2.b.a($$0).map($$0xx -> DataResult.success($$0xx.b(), $$0xx.c())).orElseGet(() -> DataResult.error(() -> "Unknown registry: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   public static <E, O> RecordCodecBuilder<O, jq.c<E>> d(aly<E> $$0) {
      aly<? extends kd<E>> $$1 = aly.a($$0.b());
      return azn.a(
            (Function<DynamicOps<?>, DataResult<E>>)($$2 -> $$2 instanceof alx<?> $$3
                  ? $$3.b
                     .a($$1)
                     .flatMap($$1xx -> $$1xx.b().a($$0))
                     .<DataResult<E>>map(DataResult::success)
                     .orElseGet(() -> DataResult.error(() -> "Can't find value: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   static final class a implements alx.c {
      private final js.a a;
      private final Map<aly<? extends kd<?>>, Optional<? extends alx.b<?>>> b = new ConcurrentHashMap<>();

      public a(js.a $$0) {
         this.a = $$0;
      }

      @Override
      public <E> Optional<alx.b<E>> a(aly<? extends kd<? extends E>> $$0) {
         return (Optional<alx.b<E>>)this.b.computeIfAbsent($$0, this::b);
      }

      private Optional<alx.b<Object>> b(aly<? extends kd<?>> $$0) {
         return this.a.a($$0).map(alx.b::a);
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            if ($$0 instanceof alx.a $$1 && this.a.equals($$1.a)) {
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
      public static <T> alx.b<T> a(js.b<T> $$0) {
         return new alx.b<>($$0, $$0, $$0.h());
      }
   }

   public interface c {
      <T> Optional<alx.b<T>> a(aly<? extends kd<? extends T>> var1);
   }
}
