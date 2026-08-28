import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class ald<T> extends akx<T> {
   private final ald.c b;

   public static <T> ald<T> a(DynamicOps<T> $$0, jk.a $$1) {
      return a($$0, new ald.a($$1));
   }

   public static <T> ald<T> a(DynamicOps<T> $$0, ald.c $$1) {
      return new ald<>($$0, $$1);
   }

   public static <T> Dynamic<T> a(Dynamic<T> $$0, jk.a $$1) {
      return new Dynamic($$1.a($$0.getOps()), $$0.getValue());
   }

   private ald(DynamicOps<T> $$0, ald.c $$1) {
      super($$0);
      this.b = $$1;
   }

   public <U> ald<U> a(DynamicOps<U> $$0) {
      return (ald<U>)($$0 == this.a ? this : new ald((DynamicOps<T>)$$0, this.b));
   }

   public <E> Optional<jl<E>> a(ale<? extends jv<? extends E>> $$0) {
      return this.b.a($$0).map(ald.b::a);
   }

   public <E> Optional<jj<E>> b(ale<? extends jv<? extends E>> $$0) {
      return this.b.a($$0).map(ald.b::b);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         ald<?> $$1 = (ald<?>)$$0;
         return this.a.equals($$1.a) && this.b.equals($$1.b);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode() * 31 + this.b.hashCode();
   }

   public static <E, O> RecordCodecBuilder<O, jj<E>> c(ale<? extends jv<? extends E>> $$0) {
      return ayh.a(
            (Function<DynamicOps<?>, DataResult<E>>)($$1 -> $$1 instanceof ald<?> $$2
                  ? $$2.b.a($$0).map($$0xx -> DataResult.success($$0xx.b(), $$0xx.c())).orElseGet(() -> DataResult.error(() -> "Unknown registry: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   public static <E, O> RecordCodecBuilder<O, ji.c<E>> d(ale<E> $$0) {
      ale<? extends jv<E>> $$1 = ale.a($$0.b());
      return ayh.a(
            (Function<DynamicOps<?>, DataResult<E>>)($$2 -> $$2 instanceof ald<?> $$3
                  ? $$3.b
                     .a($$1)
                     .flatMap($$1xx -> $$1xx.b().a($$0))
                     .<DataResult<E>>map(DataResult::success)
                     .orElseGet(() -> DataResult.error(() -> "Can't find value: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   static final class a implements ald.c {
      private final jk.a a;
      private final Map<ale<? extends jv<?>>, Optional<? extends ald.b<?>>> b = new HashMap<>();

      public a(jk.a $$0) {
         this.a = $$0;
      }

      @Override
      public <E> Optional<ald.b<E>> a(ale<? extends jv<? extends E>> $$0) {
         return (Optional<ald.b<E>>)this.b.computeIfAbsent($$0, this::b);
      }

      private Optional<ald.b<Object>> b(ale<? extends jv<?>> $$0) {
         return this.a.a($$0).map(ald.b::a);
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            if ($$0 instanceof ald.a $$1 && this.a.equals($$1.a)) {
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

   public static record b<T>(jl<T> a, jj<T> b, Lifecycle c) {
      public static <T> ald.b<T> a(jk.b<T> $$0) {
         return new ald.b<>($$0, $$0, $$0.g());
      }
   }

   public interface c {
      <T> Optional<ald.b<T>> a(ale<? extends jv<? extends T>> var1);
   }
}
