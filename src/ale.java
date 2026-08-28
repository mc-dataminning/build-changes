import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

public class ale<T> extends akx<T> {
   private final ale.c b;

   public static <T> ale<T> a(DynamicOps<T> $$0, jh.a $$1) {
      return a($$0, new ale.a($$1));
   }

   public static <T> ale<T> a(DynamicOps<T> $$0, ale.c $$1) {
      return new ale<>($$0, $$1);
   }

   public static <T> Dynamic<T> a(Dynamic<T> $$0, jh.a $$1) {
      return new Dynamic($$1.a($$0.getOps()), $$0.getValue());
   }

   private ale(DynamicOps<T> $$0, ale.c $$1) {
      super($$0);
      this.b = $$1;
   }

   public <U> ale<U> a(DynamicOps<U> $$0) {
      return (ale<U>)($$0 == this.a ? this : new ale((DynamicOps<T>)$$0, this.b));
   }

   public <E> Optional<ji<E>> a(alf<? extends js<? extends E>> $$0) {
      return this.b.a($$0).map(ale.b::a);
   }

   public <E> Optional<jg<E>> b(alf<? extends js<? extends E>> $$0) {
      return this.b.a($$0).map(ale.b::b);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         ale<?> $$1 = (ale<?>)$$0;
         return this.a.equals($$1.a) && this.b.equals($$1.b);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode() * 31 + this.b.hashCode();
   }

   public static <E, O> RecordCodecBuilder<O, jg<E>> c(alf<? extends js<? extends E>> $$0) {
      return ayu.a(
            (Function<DynamicOps<?>, DataResult<E>>)($$1 -> $$1 instanceof ale<?> $$2
                  ? $$2.b.a($$0).map($$0xx -> DataResult.success($$0xx.b(), $$0xx.c())).orElseGet(() -> DataResult.error(() -> "Unknown registry: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   public static <E, O> RecordCodecBuilder<O, jf.c<E>> d(alf<E> $$0) {
      alf<? extends js<E>> $$1 = alf.a($$0.b());
      return ayu.a(
            (Function<DynamicOps<?>, DataResult<E>>)($$2 -> $$2 instanceof ale<?> $$3
                  ? $$3.b
                     .a($$1)
                     .flatMap($$1xx -> $$1xx.b().a($$0))
                     .<DataResult<E>>map(DataResult::success)
                     .orElseGet(() -> DataResult.error(() -> "Can't find value: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   static final class a implements ale.c {
      private final jh.a a;
      private final Map<alf<? extends js<?>>, Optional<? extends ale.b<?>>> b = new ConcurrentHashMap<>();

      public a(jh.a $$0) {
         this.a = $$0;
      }

      @Override
      public <E> Optional<ale.b<E>> a(alf<? extends js<? extends E>> $$0) {
         return (Optional<ale.b<E>>)this.b.computeIfAbsent($$0, this::b);
      }

      private Optional<ale.b<Object>> b(alf<? extends js<?>> $$0) {
         return this.a.a($$0).map(ale.b::a);
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            if ($$0 instanceof ale.a $$1 && this.a.equals($$1.a)) {
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

   public static record b<T>(ji<T> a, jg<T> b, Lifecycle c) {
      public static <T> ale.b<T> a(jh.b<T> $$0) {
         return new ale.b<>($$0, $$0, $$0.h());
      }
   }

   public interface c {
      <T> Optional<ale.b<T>> a(alf<? extends js<? extends T>> var1);
   }
}
