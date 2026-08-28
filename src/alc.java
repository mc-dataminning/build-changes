import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

public class alc<T> extends akv<T> {
   private final alc.c b;

   public static <T> alc<T> a(DynamicOps<T> $$0, jq.a $$1) {
      return a($$0, new alc.a($$1));
   }

   public static <T> alc<T> a(DynamicOps<T> $$0, alc.c $$1) {
      return new alc<>($$0, $$1);
   }

   public static <T> Dynamic<T> a(Dynamic<T> $$0, jq.a $$1) {
      return new Dynamic($$1.a($$0.getOps()), $$0.getValue());
   }

   private alc(DynamicOps<T> $$0, alc.c $$1) {
      super($$0);
      this.b = $$1;
   }

   public <U> alc<U> a(DynamicOps<U> $$0) {
      return (alc<U>)($$0 == this.a ? this : new alc((DynamicOps<T>)$$0, this.b));
   }

   public <E> Optional<jr<E>> a(ald<? extends kb<? extends E>> $$0) {
      return this.b.a($$0).map(alc.b::a);
   }

   public <E> Optional<jp<E>> b(ald<? extends kb<? extends E>> $$0) {
      return this.b.a($$0).map(alc.b::b);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         alc<?> $$1 = (alc<?>)$$0;
         return this.a.equals($$1.a) && this.b.equals($$1.b);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode() * 31 + this.b.hashCode();
   }

   public static <E, O> RecordCodecBuilder<O, jp<E>> c(ald<? extends kb<? extends E>> $$0) {
      return ayo.a(
            (Function<DynamicOps<?>, DataResult<E>>)($$1 -> $$1 instanceof alc<?> $$2
                  ? $$2.b.a($$0).map($$0xx -> DataResult.success($$0xx.b(), $$0xx.c())).orElseGet(() -> DataResult.error(() -> "Unknown registry: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   public static <E, O> RecordCodecBuilder<O, jo.c<E>> d(ald<E> $$0) {
      ald<? extends kb<E>> $$1 = ald.a($$0.b());
      return ayo.a(
            (Function<DynamicOps<?>, DataResult<E>>)($$2 -> $$2 instanceof alc<?> $$3
                  ? $$3.b
                     .a($$1)
                     .flatMap($$1xx -> $$1xx.b().a($$0))
                     .<DataResult<E>>map(DataResult::success)
                     .orElseGet(() -> DataResult.error(() -> "Can't find value: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   static final class a implements alc.c {
      private final jq.a a;
      private final Map<ald<? extends kb<?>>, Optional<? extends alc.b<?>>> b = new ConcurrentHashMap<>();

      public a(jq.a $$0) {
         this.a = $$0;
      }

      @Override
      public <E> Optional<alc.b<E>> a(ald<? extends kb<? extends E>> $$0) {
         return (Optional<alc.b<E>>)this.b.computeIfAbsent($$0, this::b);
      }

      private Optional<alc.b<Object>> b(ald<? extends kb<?>> $$0) {
         return this.a.a($$0).map(alc.b::a);
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            if ($$0 instanceof alc.a $$1 && this.a.equals($$1.a)) {
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

   public static record b<T>(jr<T> a, jp<T> b, Lifecycle c) {
      public static <T> alc.b<T> a(jq.b<T> $$0) {
         return new alc.b<>($$0, $$0, $$0.h());
      }
   }

   public interface c {
      <T> Optional<alc.b<T>> a(ald<? extends kb<? extends T>> var1);
   }
}
