import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface cul<Context, Condition extends cul.b<Context>> {
   List<cul.a<Context, Condition>> a();

   static <C, T> Stream<T> a(Stream<T> $$0, Function<T, cul<C, ?>> $$1, C $$2) {
      List<cul.c<C, T>> $$3 = new ArrayList<>();
      $$0.forEach($$2x -> {
         cul<C, ?> $$3x = $$1.apply((T)$$2x);

         for (cul.a<C, ?> $$4x : $$3x.a()) {
            $$3.add(new cul.c<>((T)$$2x, $$4x.b(), (cul.b<C>)DataFixUtils.orElseGet($$4x.a(), cul.b::alwaysTrue)));
         }
      });
      $$3.sort(cul.c.a);
      Iterator<cul.c<C, T>> $$4 = $$3.iterator();
      int $$5 = Integer.MIN_VALUE;

      while ($$4.hasNext()) {
         cul.c<C, T> $$6 = $$4.next();
         if ($$6.c < $$5) {
            $$4.remove();
         } else if ($$6.d.test($$2)) {
            $$5 = $$6.c;
         } else {
            $$4.remove();
         }
      }

      return $$3.stream().map(cul.c::a);
   }

   static <C, T> Optional<T> a(Stream<T> $$0, Function<T, cul<C, ?>> $$1, bai $$2, C $$3) {
      List<T> $$4 = a($$0, $$1, $$3).toList();
      return ag.b($$4, $$2);
   }

   static <Context, Condition extends cul.b<Context>> List<cul.a<Context, Condition>> a(Condition $$0, int $$1) {
      return List.of(new cul.a<>($$0, $$1));
   }

   static <Context, Condition extends cul.b<Context>> List<cul.a<Context, Condition>> a(int $$0) {
      return List.of(new cul.a<>(Optional.empty(), $$0));
   }

   public static record a<Context, Condition extends cul.b<Context>>(Optional<Condition> a, int b) {
      public a(Condition $$0, int $$1) {
         this(Optional.of($$0), $$1);
      }

      public a(int $$0) {
         this(Optional.empty(), $$0);
      }

      public static <Context, Condition extends cul.b<Context>> Codec<cul.a<Context, Condition>> a(Codec<Condition> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.optionalFieldOf("condition").forGetter(cul.a::a), Codec.INT.fieldOf("priority").forGetter(cul.a::b)).apply($$1, cul.a::new)
         );
      }
   }

   @FunctionalInterface
   public interface b<C> extends Predicate<C> {
      static <C> cul.b<C> alwaysTrue() {
         return $$0 -> true;
      }
   }

   public static record c<C, T>(T b, int c, cul.b<C> d) {
      public static final Comparator<cul.c<?, ?>> a = Comparator.comparingInt(cul.c::b).reversed();

      public T a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }

      public cul.b<C> c() {
         return this.d;
      }
   }
}
