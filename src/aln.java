import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

public class aln<T> extends alg<T> {
   private final aln.c b;

   public static <T> aln<T> a(DynamicOps<T> $$0, js.a $$1) {
      return a($$0, new aln.a($$1));
   }

   public static <T> aln<T> a(DynamicOps<T> $$0, aln.c $$1) {
      return new aln<>($$0, $$1);
   }

   public static <T> Dynamic<T> a(Dynamic<T> $$0, js.a $$1) {
      return new Dynamic($$1.a($$0.getOps()), $$0.getValue());
   }

   private aln(DynamicOps<T> $$0, aln.c $$1) {
      super($$0);
      this.b = $$1;
   }

   public <U> aln<U> a(DynamicOps<U> $$0) {
      return (aln<U>)($$0 == this.a ? this : new aln((DynamicOps<T>)$$0, this.b));
   }

   public <E> Optional<jt<E>> a(alo<? extends kd<? extends E>> $$0) {
      return this.b.a($$0).map(aln.b::a);
   }

   public <E> Optional<jr<E>> b(alo<? extends kd<? extends E>> $$0) {
      return this.b.a($$0).map(aln.b::b);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         aln<?> $$1 = (aln<?>)$$0;
         return this.a.equals($$1.a) && this.b.equals($$1.b);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode() * 31 + this.b.hashCode();
   }

   public static <E, O> RecordCodecBuilder<O, jr<E>> c(alo<? extends kd<? extends E>> $$0) {
      return azd.a(
            (Function<DynamicOps<?>, DataResult<E>>)($$1 -> $$1 instanceof aln<?> $$2
                  ? $$2.b.a($$0).map($$0xx -> DataResult.success($$0xx.b(), $$0xx.c())).orElseGet(() -> DataResult.error(() -> "Unknown registry: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   public static <E, O> RecordCodecBuilder<O, jq.c<E>> d(alo<E> $$0) {
      alo<? extends kd<E>> $$1 = alo.a($$0.b());
      return azd.a(
            (Function<DynamicOps<?>, DataResult<E>>)($$2 -> $$2 instanceof aln<?> $$3
                  ? $$3.b
                     .a($$1)
                     .flatMap($$1xx -> $$1xx.b().a($$0))
                     .<DataResult<E>>map(DataResult::success)
                     .orElseGet(() -> DataResult.error(() -> "Can't find value: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   static final class a implements aln.c {
      private final js.a a;
      private final Map<alo<? extends kd<?>>, Optional<? extends aln.b<?>>> b = new ConcurrentHashMap<>();

      public a(js.a $$0) {
         this.a = $$0;
      }

      @Override
      public <E> Optional<aln.b<E>> a(alo<? extends kd<? extends E>> $$0) {
         return (Optional<aln.b<E>>)this.b.computeIfAbsent($$0, this::b);
      }

      private Optional<aln.b<Object>> b(alo<? extends kd<?>> $$0) {
         return this.a.a($$0).map(aln.b::a);
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            if ($$0 instanceof aln.a $$1 && this.a.equals($$1.a)) {
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
      public static <T> aln.b<T> a(js.b<T> $$0) {
         return new aln.b<>($$0, $$0, $$0.h());
      }
   }

   public interface c {
      <T> Optional<aln.b<T>> a(alo<? extends kd<? extends T>> var1);
   }
}
