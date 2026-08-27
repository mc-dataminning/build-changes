import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicLike;
import com.mojang.serialization.OptionalDynamic;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.UnaryOperator;
import java.util.stream.IntStream;

public class ays {
   public static Dynamic<?> a(Dynamic<?> $$0) {
      Optional<Number> $$1 = $$0.get("X").asNumber().result();
      Optional<Number> $$2 = $$0.get("Y").asNumber().result();
      Optional<Number> $$3 = $$0.get("Z").asNumber().result();
      return !$$1.isEmpty() && !$$2.isEmpty() && !$$3.isEmpty()
         ? $$0.createIntList(IntStream.of($$1.get().intValue(), $$2.get().intValue(), $$3.get().intValue()))
         : $$0;
   }

   public static <T> Dynamic<T> a(Dynamic<T> $$0, String $$1, Optional<? extends Dynamic<?>> $$2) {
      return $$2.isEmpty() ? $$0 : $$0.set($$1, $$2.get());
   }

   public static <T> Dynamic<T> a(Dynamic<T> $$0, String $$1, String $$2) {
      return a($$0, $$1, $$2, UnaryOperator.identity());
   }

   public static <T> Dynamic<T> a(Dynamic<T> $$0, String $$1, String $$2, Optional<? extends Dynamic<?>> $$3) {
      return a($$0.remove($$1), $$2, $$3);
   }

   public static <T> Dynamic<T> a(Dynamic<T> $$0, String $$1, String $$2, UnaryOperator<Dynamic<?>> $$3) {
      return a($$0.remove($$1), $$2, $$0.get($$1).result().map($$3));
   }

   public static Dynamic<?> a(Dynamic<?> $$0, String $$1, Dynamic<?> $$2, String $$3) {
      return a($$0, $$1, $$2, $$3, UnaryOperator.identity());
   }

   public static <T> Dynamic<?> a(Dynamic<T> $$0, String $$1, Dynamic<?> $$2, String $$3, UnaryOperator<Dynamic<T>> $$4) {
      Optional<Dynamic<T>> $$5 = $$0.get($$1).result();
      return $$5.isPresent() ? $$2.set($$3, $$4.apply($$5.get())) : $$2;
   }

   @SafeVarargs
   public static TypeTemplate a(Pair<String, TypeTemplate>... $$0) {
      List<TypeTemplate> $$1 = Arrays.stream($$0).map($$0x -> DSL.optional(DSL.field((String)$$0x.getFirst(), (TypeTemplate)$$0x.getSecond()))).toList();
      return DSL.allWithRemainder($$1.get(0), $$1.subList(1, $$1.size()).toArray(new TypeTemplate[0]));
   }

   private static <T> DataResult<Boolean> b(Dynamic<T> $$0) {
      return $$0.getOps().getBooleanValue($$0.getValue());
   }

   public static DataResult<Boolean> a(DynamicLike<?> $$0) {
      if ($$0 instanceof Dynamic<?> $$1) {
         return b($$1);
      } else {
         return $$0 instanceof OptionalDynamic<?> $$2 ? $$2.get().flatMap(ays::b) : DataResult.error(() -> "Unknown dynamic value: " + $$0);
      }
   }

   public static boolean a(DynamicLike<?> $$0, boolean $$1) {
      return a($$0).result().orElse($$1);
   }

   public static <T, R> Typed<R> a(Type<R> $$0, Typed<T> $$1) {
      return new Typed($$0, $$1.getOps(), $$1.getValue());
   }
}
