import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

public class akp<T> extends akj<T> {
   private final akp.c b;

   public static <T> akp<T> a(DynamicOps<T> $$0, jo.a $$1) {
      return a($$0, new akp.a($$1));
   }

   public static <T> akp<T> a(DynamicOps<T> $$0, akp.c $$1) {
      return new akp<>($$0, $$1);
   }

   public static <T> Dynamic<T> a(Dynamic<T> $$0, jo.a $$1) {
      return new Dynamic($$1.a($$0.getOps()), $$0.getValue());
   }

   private akp(DynamicOps<T> $$0, akp.c $$1) {
      super($$0);
      this.b = $$1;
   }

   public <U> akp<U> a(DynamicOps<U> $$0) {
      return (akp<U>)($$0 == this.a ? this : new akp((DynamicOps<T>)$$0, this.b));
   }

   public <E> Optional<jp<E>> a(akq<? extends jz<? extends E>> $$0) {
      return this.b.a($$0).map(akp.b::a);
   }

   public <E> Optional<jn<E>> b(akq<? extends jz<? extends E>> $$0) {
      return this.b.a($$0).map(akp.b::b);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         akp<?> $$1 = (akp<?>)$$0;
         return this.a.equals($$1.a) && this.b.equals($$1.b);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode() * 31 + this.b.hashCode();
   }

   public static <E, O> RecordCodecBuilder<O, jn<E>> c(akq<? extends jz<? extends E>> $$0) {
      return axw.a(
            (Function<DynamicOps<?>, DataResult<E>>)($$1 -> $$1 instanceof akp<?> $$2
                  ? $$2.b.a($$0).map($$0xx -> DataResult.success($$0xx.b(), $$0xx.c())).orElseGet(() -> DataResult.error(() -> "Unknown registry: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   public static <E, O> RecordCodecBuilder<O, jm.c<E>> d(akq<E> $$0) {
      akq<? extends jz<E>> $$1 = akq.a($$0.b());
      return axw.a(
            (Function<DynamicOps<?>, DataResult<E>>)($$2 -> $$2 instanceof akp<?> $$3
                  ? $$3.b
                     .a($$1)
                     .flatMap($$1xx -> $$1xx.b().a($$0))
                     .<DataResult<E>>map(DataResult::success)
                     .orElseGet(() -> DataResult.error(() -> "Can't find value: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   static final class a implements akp.c {
      private final jo.a a;
      private final Map<akq<? extends jz<?>>, Optional<? extends akp.b<?>>> b = new ConcurrentHashMap<>();

      public a(jo.a $$0) {
         this.a = $$0;
      }

      @Override
      public <E> Optional<akp.b<E>> a(akq<? extends jz<? extends E>> $$0) {
         return (Optional<akp.b<E>>)this.b.computeIfAbsent($$0, this::b);
      }

      private Optional<akp.b<Object>> b(akq<? extends jz<?>> $$0) {
         return this.a.a($$0).map(akp.b::a);
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            if ($$0 instanceof akp.a $$1 && this.a.equals($$1.a)) {
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
      public static <T> akp.b<T> a(jo.b<T> $$0) {
         return new akp.b<>($$0, $$0, $$0.g());
      }
   }

   public interface c {
      <T> Optional<akp.b<T>> a(akq<? extends jz<? extends T>> var1);
   }
}
