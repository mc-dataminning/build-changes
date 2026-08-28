import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

public class aks<T> extends akl<T> {
   private final aks.c b;

   public static <T> aks<T> a(DynamicOps<T> $$0, jt.a $$1) {
      return a($$0, new aks.a($$1));
   }

   public static <T> aks<T> a(DynamicOps<T> $$0, aks.c $$1) {
      return new aks<>($$0, $$1);
   }

   public static <T> Dynamic<T> a(Dynamic<T> $$0, jt.a $$1) {
      return new Dynamic($$1.a($$0.getOps()), $$0.getValue());
   }

   private aks(DynamicOps<T> $$0, aks.c $$1) {
      super($$0);
      this.b = $$1;
   }

   public <U> aks<U> a(DynamicOps<U> $$0) {
      return (aks<U>)($$0 == this.a ? this : new aks((DynamicOps<T>)$$0, this.b));
   }

   public <E> Optional<ju<E>> a(akt<? extends ke<? extends E>> $$0) {
      return this.b.a($$0).map(aks.b::a);
   }

   public <E> Optional<js<E>> b(akt<? extends ke<? extends E>> $$0) {
      return this.b.a($$0).map(aks.b::b);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         aks<?> $$1 = (aks<?>)$$0;
         return this.a.equals($$1.a) && this.b.equals($$1.b);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode() * 31 + this.b.hashCode();
   }

   public static <E, O> RecordCodecBuilder<O, js<E>> c(akt<? extends ke<? extends E>> $$0) {
      return ayh.a(
            (Function<DynamicOps<?>, DataResult<E>>)($$1 -> $$1 instanceof aks<?> $$2
                  ? $$2.b.a($$0).map($$0xx -> DataResult.success($$0xx.b(), $$0xx.c())).orElseGet(() -> DataResult.error(() -> "Unknown registry: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   public static <E, O> RecordCodecBuilder<O, jr.c<E>> d(akt<E> $$0) {
      akt<? extends ke<E>> $$1 = akt.a($$0.b());
      return ayh.a(
            (Function<DynamicOps<?>, DataResult<E>>)($$2 -> $$2 instanceof aks<?> $$3
                  ? $$3.b
                     .a($$1)
                     .flatMap($$1xx -> $$1xx.b().a($$0))
                     .<DataResult<E>>map(DataResult::success)
                     .orElseGet(() -> DataResult.error(() -> "Can't find value: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   static final class a implements aks.c {
      private final jt.a a;
      private final Map<akt<? extends ke<?>>, Optional<? extends aks.b<?>>> b = new ConcurrentHashMap<>();

      public a(jt.a $$0) {
         this.a = $$0;
      }

      @Override
      public <E> Optional<aks.b<E>> a(akt<? extends ke<? extends E>> $$0) {
         return (Optional<aks.b<E>>)this.b.computeIfAbsent($$0, this::b);
      }

      private Optional<aks.b<Object>> b(akt<? extends ke<?>> $$0) {
         return this.a.a($$0).map(aks.b::a);
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            if ($$0 instanceof aks.a $$1 && this.a.equals($$1.a)) {
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

   public static record b<T>(ju<T> a, js<T> b, Lifecycle c) {
      public static <T> aks.b<T> a(jt.b<T> $$0) {
         return new aks.b<>($$0, $$0, $$0.h());
      }
   }

   public interface c {
      <T> Optional<aks.b<T>> a(akt<? extends ke<? extends T>> var1);
   }
}
