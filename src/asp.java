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
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface asp {
   int W = 16;

   String c();

   static <E extends Enum<E> & asp> asp.a<E> a(Supplier<E[]> $$0) {
      return a($$0, $$0x -> $$0x);
   }

   static <E extends Enum<E> & asp> asp.a<E> a(Supplier<E[]> $$0, Function<String, String> $$1) {
      E[] $$2 = (E[])$$0.get();
      if ($$2.length > 16) {
         Map<String, E> $$3 = Arrays.stream($$2).collect(Collectors.toMap($$1x -> $$1.apply(((asp)$$1x).c()), $$0x -> (E)$$0x));
         return new asp.a<>($$2, $$1x -> $$1x == null ? null : $$3.get($$1x));
      } else {
         return new asp.a<>($$2, $$2x -> {
            for (E $$3x : $$2) {
               if ($$1.apply($$3x.c()).equals($$2x)) {
                  return $$3x;
               }
            }

            return null;
         });
      }
   }

   static Keyable a(final asp[] $$0) {
      return new Keyable() {
         public <T> Stream<T> keys(DynamicOps<T> $$0x) {
            return Arrays.stream($$0).map(asp::c).map($$0::createString);
         }
      };
   }

   @Deprecated
   public static class a<E extends Enum<E> & asp> implements Codec<E> {
      private final Codec<E> a;
      private final Function<String, E> b;

      public a(E[] $$0, Function<String, E> $$1) {
         this.a = arf.b(
            arf.b($$0x -> ((asp)$$0x).c(), $$1), arf.a($$0x -> ((Enum)$$0x).ordinal(), $$1x -> $$1x >= 0 && $$1x < $$0.length ? $$0[$$1x] : null, -1)
         );
         this.b = $$1;
      }

      public <T> DataResult<Pair<E, T>> decode(DynamicOps<T> $$0, T $$1) {
         return this.a.decode($$0, $$1);
      }

      public <T> DataResult<T> a(E $$0, DynamicOps<T> $$1, T $$2) {
         return this.a.encode($$0, $$1, $$2);
      }

      @Nullable
      public E a(@Nullable String $$0) {
         return this.b.apply($$0);
      }

      public E a(@Nullable String $$0, E $$1) {
         return Objects.requireNonNullElse(this.a($$0), $$1);
      }
   }
}
