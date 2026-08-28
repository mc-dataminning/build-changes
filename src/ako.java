import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

public class ako<T> extends aki<T> {
   private final ako.c b;

   public static <T> ako<T> a(DynamicOps<T> $$0, jo.a $$1) {
      return a($$0, new ako.a($$1));
   }

   public static <T> ako<T> a(DynamicOps<T> $$0, ako.c $$1) {
      return new ako<>($$0, $$1);
   }

   public static <T> Dynamic<T> a(Dynamic<T> $$0, jo.a $$1) {
      return new Dynamic($$1.a($$0.getOps()), $$0.getValue());
   }

   private ako(DynamicOps<T> $$0, ako.c $$1) {
      super($$0);
      this.b = $$1;
   }

   public <U> ako<U> a(DynamicOps<U> $$0) {
      return (ako<U>)($$0 == this.a ? this : new ako((DynamicOps<T>)$$0, this.b));
   }

   public <E> Optional<jp<E>> a(akp<? extends jz<? extends E>> $$0) {
      return this.b.a($$0).map(ako.b::a);
   }

   public <E> Optional<jn<E>> b(akp<? extends jz<? extends E>> $$0) {
      return this.b.a($$0).map(ako.b::b);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         ako<?> $$1 = (ako<?>)$$0;
         return this.a.equals($$1.a) && this.b.equals($$1.b);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode() * 31 + this.b.hashCode();
   }

   public static <E, O> RecordCodecBuilder<O, jn<E>> c(akp<? extends jz<? extends E>> $$0) {
      return axv.a(
            (Function<DynamicOps<?>, DataResult<E>>)($$1 -> $$1 instanceof ako<?> $$2
                  ? $$2.b.a($$0).map($$0xx -> DataResult.success($$0xx.b(), $$0xx.c())).orElseGet(() -> DataResult.error(() -> "Unknown registry: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   public static <E, O> RecordCodecBuilder<O, jm.c<E>> d(akp<E> $$0) {
      akp<? extends jz<E>> $$1 = akp.a($$0.b());
      return axv.a(
            (Function<DynamicOps<?>, DataResult<E>>)($$2 -> $$2 instanceof ako<?> $$3
                  ? $$3.b
                     .a($$1)
                     .flatMap($$1xx -> $$1xx.b().a($$0))
                     .<DataResult<E>>map(DataResult::success)
                     .orElseGet(() -> DataResult.error(() -> "Can't find value: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   static final class a implements ako.c {
      private final jo.a a;
      private final Map<akp<? extends jz<?>>, Optional<? extends ako.b<?>>> b = new ConcurrentHashMap<>();

      public a(jo.a $$0) {
         this.a = $$0;
      }

      @Override
      public <E> Optional<ako.b<E>> a(akp<? extends jz<? extends E>> $$0) {
         return (Optional<ako.b<E>>)this.b.computeIfAbsent($$0, this::b);
      }

      private Optional<ako.b<Object>> b(akp<? extends jz<?>> $$0) {
         return this.a.a($$0).map(ako.b::a);
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            if ($$0 instanceof ako.a $$1 && this.a.equals($$1.a)) {
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

   public static record b<T>(jp<T> a, jn<T> b, Lifecycle c) {
      public static <T> ako.b<T> a(jo.b<T> $$0) {
         return new ako.b<>($$0, $$0, $$0.g());
      }
   }

   public interface c {
      <T> Optional<ako.b<T>> a(akp<? extends jz<? extends T>> var1);
   }
}
