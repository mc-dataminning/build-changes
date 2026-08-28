import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Keyable;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface azk {
   int W = 16;

   String c();

   static <E extends Enum<E> & azk> azk.a<E> a(Supplier<E[]> $$0) {
      return a($$0, $$0x -> $$0x);
   }

   static <E extends Enum<E> & azk> azk.a<E> a(Supplier<E[]> $$0, Function<String, String> $$1) {
      E[] $$2 = (E[])$$0.get();
      Function<String, E> $$3 = a($$2, $$1);
      return new azk.a<>($$2, $$3);
   }

   static <T extends azk> Codec<T> b(Supplier<T[]> $$0) {
      T[] $$1 = (T[])$$0.get();
      Function<String, T> $$2 = a($$1, $$0x -> $$0x);
      ToIntFunction<T> $$3 = ad.g(Arrays.asList($$1));
      return new azk.b<>($$1, $$2, $$3);
   }

   static <T extends azk> Function<String, T> a(T[] $$0, Function<String, String> $$1) {
      if ($$0.length > 16) {
         Map<String, T> $$2 = Arrays.<azk>stream($$0).collect(Collectors.toMap($$1x -> $$1.apply($$1x.c()), $$0x -> (T)$$0x));
         return $$1x -> $$1x == null ? null : $$2.get($$1x);
      } else {
         return $$2x -> {
            for (T $$3 : $$0) {
               if ($$1.apply($$3.c()).equals($$2x)) {
                  return $$3;
               }
            }

            return null;
         };
      }
   }

   static Keyable a(final azk[] $$0) {
      return new Keyable() {
         public <T> Stream<T> keys(DynamicOps<T> $$0x) {
            return Arrays.stream($$0).map(azk::c).map($$0::createString);
         }
      };
   }

   @Deprecated
   public static class a<E extends Enum<E> & azk> extends azk.b<E> {
      private final Function<String, E> a;

      public a(E[] $$0, Function<String, E> $$1) {
         super($$0, $$1, $$0x -> ((Enum)$$0x).ordinal());
         this.a = $$1;
      }

      @Nullable
      public E a(@Nullable String $$0) {
         return this.a.apply($$0);
      }

      public E a(@Nullable String $$0, E $$1) {
         return Objects.requireNonNullElse(this.a($$0), $$1);
      }
   }

   public static class b<S extends azk> implements Codec<S> {
      private final Codec<S> a;

      public b(S[] $$0, Function<String, S> $$1, ToIntFunction<S> $$2) {
         this.a = axw.a(Codec.stringResolver(azk::c, $$1), axw.a($$2, $$1x -> $$1x >= 0 && $$1x < $$0.length ? $$0[$$1x] : null, -1));
      }

      public <T> DataResult<Pair<S, T>> decode(DynamicOps<T> $$0, T $$1) {
         return this.a.decode($$0, $$1);
      }

      public <T> DataResult<T> a(S $$0, DynamicOps<T> $$1, T $$2) {
         return this.a.encode($$0, $$1, $$2);
      }
   }
}
