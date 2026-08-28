import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

public class akt<T> extends akm<T> {
   private final akt.c b;

   public static <T> akt<T> a(DynamicOps<T> $$0, jt.a $$1) {
      return a($$0, new akt.a($$1));
   }

   public static <T> akt<T> a(DynamicOps<T> $$0, akt.c $$1) {
      return new akt<>($$0, $$1);
   }

   public static <T> Dynamic<T> a(Dynamic<T> $$0, jt.a $$1) {
      return new Dynamic($$1.a($$0.getOps()), $$0.getValue());
   }

   private akt(DynamicOps<T> $$0, akt.c $$1) {
      super($$0);
      this.b = $$1;
   }

   public <U> akt<U> a(DynamicOps<U> $$0) {
      return (akt<U>)($$0 == this.a ? this : new akt((DynamicOps<T>)$$0, this.b));
   }

   public <E> Optional<ju<E>> a(aku<? extends ke<? extends E>> $$0) {
      return this.b.a($$0).map(akt.b::a);
   }

   public <E> Optional<js<E>> b(aku<? extends ke<? extends E>> $$0) {
      return this.b.a($$0).map(akt.b::b);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         akt<?> $$1 = (akt<?>)$$0;
         return this.a.equals($$1.a) && this.b.equals($$1.b);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode() * 31 + this.b.hashCode();
   }

   public static <E, O> RecordCodecBuilder<O, js<E>> c(aku<? extends ke<? extends E>> $$0) {
      return ayi.a(
            (Function<DynamicOps<?>, DataResult<E>>)($$1 -> $$1 instanceof akt<?> $$2
                  ? $$2.b.a($$0).map($$0xx -> DataResult.success($$0xx.b(), $$0xx.c())).orElseGet(() -> DataResult.error(() -> "Unknown registry: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   public static <E, O> RecordCodecBuilder<O, jr.c<E>> d(aku<E> $$0) {
      aku<? extends ke<E>> $$1 = aku.a($$0.b());
      return ayi.a(
            (Function<DynamicOps<?>, DataResult<E>>)($$2 -> $$2 instanceof akt<?> $$3
                  ? $$3.b
                     .a($$1)
                     .flatMap($$1xx -> $$1xx.b().a($$0))
                     .<DataResult<E>>map(DataResult::success)
                     .orElseGet(() -> DataResult.error(() -> "Can't find value: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   static final class a implements akt.c {
      private final jt.a a;
      private final Map<aku<? extends ke<?>>, Optional<? extends akt.b<?>>> b = new ConcurrentHashMap<>();

      public a(jt.a $$0) {
         this.a = $$0;
      }

      @Override
      public <E> Optional<akt.b<E>> a(aku<? extends ke<? extends E>> $$0) {
         return (Optional<akt.b<E>>)this.b.computeIfAbsent($$0, this::b);
      }

      private Optional<akt.b<Object>> b(aku<? extends ke<?>> $$0) {
         return this.a.a($$0).map(akt.b::a);
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            if ($$0 instanceof akt.a $$1 && this.a.equals($$1.a)) {
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
      public static <T> akt.b<T> a(jt.b<T> $$0) {
         return new akt.b<>($$0, $$0, $$0.h());
      }
   }

   public interface c {
      <T> Optional<akt.b<T>> a(aku<? extends ke<? extends T>> var1);
   }
}
