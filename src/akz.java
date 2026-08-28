import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

public class akz<T> extends akt<T> {
   private final akz.c b;

   public static <T> akz<T> a(DynamicOps<T> $$0, jp.a $$1) {
      return a($$0, new akz.a($$1));
   }

   public static <T> akz<T> a(DynamicOps<T> $$0, akz.c $$1) {
      return new akz<>($$0, $$1);
   }

   public static <T> Dynamic<T> a(Dynamic<T> $$0, jp.a $$1) {
      return new Dynamic($$1.a($$0.getOps()), $$0.getValue());
   }

   private akz(DynamicOps<T> $$0, akz.c $$1) {
      super($$0);
      this.b = $$1;
   }

   public <U> akz<U> a(DynamicOps<U> $$0) {
      return (akz<U>)($$0 == this.a ? this : new akz((DynamicOps<T>)$$0, this.b));
   }

   public <E> Optional<jq<E>> a(ala<? extends ka<? extends E>> $$0) {
      return this.b.a($$0).map(akz.b::a);
   }

   public <E> Optional<jo<E>> b(ala<? extends ka<? extends E>> $$0) {
      return this.b.a($$0).map(akz.b::b);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         akz<?> $$1 = (akz<?>)$$0;
         return this.a.equals($$1.a) && this.b.equals($$1.b);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode() * 31 + this.b.hashCode();
   }

   public static <E, O> RecordCodecBuilder<O, jo<E>> c(ala<? extends ka<? extends E>> $$0) {
      return ayl.a(
            (Function<DynamicOps<?>, DataResult<E>>)($$1 -> $$1 instanceof akz<?> $$2
                  ? $$2.b.a($$0).map($$0xx -> DataResult.success($$0xx.b(), $$0xx.c())).orElseGet(() -> DataResult.error(() -> "Unknown registry: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   public static <E, O> RecordCodecBuilder<O, jn.c<E>> d(ala<E> $$0) {
      ala<? extends ka<E>> $$1 = ala.a($$0.b());
      return ayl.a(
            (Function<DynamicOps<?>, DataResult<E>>)($$2 -> $$2 instanceof akz<?> $$3
                  ? $$3.b
                     .a($$1)
                     .flatMap($$1xx -> $$1xx.b().a($$0))
                     .<DataResult<E>>map(DataResult::success)
                     .orElseGet(() -> DataResult.error(() -> "Can't find value: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   static final class a implements akz.c {
      private final jp.a a;
      private final Map<ala<? extends ka<?>>, Optional<? extends akz.b<?>>> b = new ConcurrentHashMap<>();

      public a(jp.a $$0) {
         this.a = $$0;
      }

      @Override
      public <E> Optional<akz.b<E>> a(ala<? extends ka<? extends E>> $$0) {
         return (Optional<akz.b<E>>)this.b.computeIfAbsent($$0, this::b);
      }

      private Optional<akz.b<Object>> b(ala<? extends ka<?>> $$0) {
         return this.a.a($$0).map(akz.b::a);
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            if ($$0 instanceof akz.a $$1 && this.a.equals($$1.a)) {
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
      public static <T> akz.b<T> a(jp.b<T> $$0) {
         return new akz.b<>($$0, $$0, $$0.g());
      }
   }

   public interface c {
      <T> Optional<akz.b<T>> a(ala<? extends ka<? extends T>> var1);
   }
}
