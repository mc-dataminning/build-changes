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

public interface cuc<Context, Condition extends cuc.b<Context>> {
   List<cuc.a<Context, Condition>> a();

   static <C, T> Stream<T> a(Stream<T> $$0, Function<T, cuc<C, ?>> $$1, C $$2) {
      List<cuc.c<C, T>> $$3 = new ArrayList<>();
      $$0.forEach($$2x -> {
         cuc<C, ?> $$3x = $$1.apply((T)$$2x);

         for (cuc.a<C, ?> $$4x : $$3x.a()) {
            $$3.add(new cuc.c<>((T)$$2x, $$4x.b(), (cuc.b<C>)DataFixUtils.orElseGet($$4x.a(), cuc.b::alwaysTrue)));
         }
      });
      $$3.sort(cuc.c.a);
      Iterator<cuc.c<C, T>> $$4 = $$3.iterator();
      int $$5 = Integer.MIN_VALUE;

      while ($$4.hasNext()) {
         cuc.c<C, T> $$6 = $$4.next();
         if ($$6.c < $$5) {
            $$4.remove();
         } else if ($$6.d.test($$2)) {
            $$5 = $$6.c;
         } else {
            $$4.remove();
         }
      }

      return $$3.stream().map(cuc.c::a);
   }

   static <C, T> Optional<T> a(Stream<T> $$0, Function<T, cuc<C, ?>> $$1, azz $$2, C $$3) {
      List<T> $$4 = a($$0, $$1, $$3).toList();
      return ag.b($$4, $$2);
   }

   static <Context, Condition extends cuc.b<Context>> List<cuc.a<Context, Condition>> a(Condition $$0, int $$1) {
      return List.of(new cuc.a<>($$0, $$1));
   }

   static <Context, Condition extends cuc.b<Context>> List<cuc.a<Context, Condition>> a(int $$0) {
      return List.of(new cuc.a<>(Optional.empty(), $$0));
   }

   public static record a<Context, Condition extends cuc.b<Context>>(Optional<Condition> a, int b) {
      public a(Condition $$0, int $$1) {
         this(Optional.of($$0), $$1);
      }

      public a(int $$0) {
         this(Optional.empty(), $$0);
      }

      public static <Context, Condition extends cuc.b<Context>> Codec<cuc.a<Context, Condition>> a(Codec<Condition> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.optionalFieldOf("condition").forGetter(cuc.a::a), Codec.INT.fieldOf("priority").forGetter(cuc.a::b)).apply($$1, cuc.a::new)
         );
      }
   }

   @FunctionalInterface
   public interface b<C> extends Predicate<C> {
      static <C> cuc.b<C> alwaysTrue() {
         return $$0 -> true;
      }
   }

   public static record c<C, T>(T b, int c, cuc.b<C> d) {
      public static final Comparator<cuc.c<?, ?>> a = Comparator.comparingInt(cuc.c::b).reversed();

      public T a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }

      public cuc.b<C> c() {
         return this.d;
      }
   }
}
