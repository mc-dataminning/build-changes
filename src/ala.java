import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

public class ala<T> extends aku<T> {
   private final ala.c b;

   public static <T> ala<T> a(DynamicOps<T> $$0, jp.a $$1) {
      return a($$0, new ala.a($$1));
   }

   public static <T> ala<T> a(DynamicOps<T> $$0, ala.c $$1) {
      return new ala<>($$0, $$1);
   }

   public static <T> Dynamic<T> a(Dynamic<T> $$0, jp.a $$1) {
      return new Dynamic($$1.a($$0.getOps()), $$0.getValue());
   }

   private ala(DynamicOps<T> $$0, ala.c $$1) {
      super($$0);
      this.b = $$1;
   }

   public <U> ala<U> a(DynamicOps<U> $$0) {
      return (ala<U>)($$0 == this.a ? this : new ala((DynamicOps<T>)$$0, this.b));
   }

   public <E> Optional<jq<E>> a(alb<? extends ka<? extends E>> $$0) {
      return this.b.a($$0).map(ala.b::a);
   }

   public <E> Optional<jo<E>> b(alb<? extends ka<? extends E>> $$0) {
      return this.b.a($$0).map(ala.b::b);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         ala<?> $$1 = (ala<?>)$$0;
         return this.a.equals($$1.a) && this.b.equals($$1.b);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode() * 31 + this.b.hashCode();
   }

   public static <E, O> RecordCodecBuilder<O, jo<E>> c(alb<? extends ka<? extends E>> $$0) {
      return aym.a(
            (Function<DynamicOps<?>, DataResult<E>>)($$1 -> $$1 instanceof ala<?> $$2
                  ? $$2.b.a($$0).map($$0xx -> DataResult.success($$0xx.b(), $$0xx.c())).orElseGet(() -> DataResult.error(() -> "Unknown registry: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   public static <E, O> RecordCodecBuilder<O, jn.c<E>> d(alb<E> $$0) {
      alb<? extends ka<E>> $$1 = alb.a($$0.b());
      return aym.a(
            (Function<DynamicOps<?>, DataResult<E>>)($$2 -> $$2 instanceof ala<?> $$3
                  ? $$3.b
                     .a($$1)
                     .flatMap($$1xx -> $$1xx.b().a($$0))
                     .<DataResult<E>>map(DataResult::success)
                     .orElseGet(() -> DataResult.error(() -> "Can't find value: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   static final class a implements ala.c {
      private final jp.a a;
      private final Map<alb<? extends ka<?>>, Optional<? extends ala.b<?>>> b = new ConcurrentHashMap<>();

      public a(jp.a $$0) {
         this.a = $$0;
      }

      @Override
      public <E> Optional<ala.b<E>> a(alb<? extends ka<? extends E>> $$0) {
         return (Optional<ala.b<E>>)this.b.computeIfAbsent($$0, this::b);
      }

      private Optional<ala.b<Object>> b(alb<? extends ka<?>> $$0) {
         return this.a.a($$0).map(ala.b::a);
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            if ($$0 instanceof ala.a $$1 && this.a.equals($$1.a)) {
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

   public static record b<T>(jq<T> a, jo<T> b, Lifecycle c) {
      public static <T> ala.b<T> a(jp.b<T> $$0) {
         return new ala.b<>($$0, $$0, $$0.g());
      }
   }

   public interface c {
      <T> Optional<ala.b<T>> a(alb<? extends ka<? extends T>> var1);
   }
}
