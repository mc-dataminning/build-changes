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

public interface ctp<Context, Condition extends ctp.b<Context>> {
   List<ctp.a<Context, Condition>> a();

   static <C, T> Stream<T> a(Stream<T> $$0, Function<T, ctp<C, ?>> $$1, C $$2) {
      List<ctp.c<C, T>> $$3 = new ArrayList<>();
      $$0.forEach($$2x -> {
         ctp<C, ?> $$3x = $$1.apply((T)$$2x);

         for (ctp.a<C, ?> $$4x : $$3x.a()) {
            $$3.add(new ctp.c<>((T)$$2x, $$4x.b(), (ctp.b<C>)DataFixUtils.orElseGet($$4x.a(), ctp.b::alwaysTrue)));
         }
      });
      $$3.sort(ctp.c.a);
      Iterator<ctp.c<C, T>> $$4 = $$3.iterator();
      int $$5 = Integer.MIN_VALUE;

      while ($$4.hasNext()) {
         ctp.c<C, T> $$6 = $$4.next();
         if ($$6.c < $$5) {
            $$4.remove();
         } else if ($$6.d.test($$2)) {
            $$5 = $$6.c;
         } else {
            $$4.remove();
         }
      }

      return $$3.stream().map(ctp.c::a);
   }

   static <C, T> Optional<T> a(Stream<T> $$0, Function<T, ctp<C, ?>> $$1, azv $$2, C $$3) {
      List<T> $$4 = a($$0, $$1, $$3).toList();
      return ag.b($$4, $$2);
   }

   static <Context, Condition extends ctp.b<Context>> List<ctp.a<Context, Condition>> a(Condition $$0, int $$1) {
      return List.of(new ctp.a<>($$0, $$1));
   }

   static <Context, Condition extends ctp.b<Context>> List<ctp.a<Context, Condition>> a(int $$0) {
      return List.of(new ctp.a<>(Optional.empty(), $$0));
   }

   public static record a<Context, Condition extends ctp.b<Context>>(Optional<Condition> a, int b) {
      public a(Condition $$0, int $$1) {
         this(Optional.of($$0), $$1);
      }

      public a(int $$0) {
         this(Optional.empty(), $$0);
      }

      public static <Context, Condition extends ctp.b<Context>> Codec<ctp.a<Context, Condition>> a(Codec<Condition> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.optionalFieldOf("condition").forGetter(ctp.a::a), Codec.INT.fieldOf("priority").forGetter(ctp.a::b)).apply($$1, ctp.a::new)
         );
      }
   }

   @FunctionalInterface
   public interface b<C> extends Predicate<C> {
      static <C> ctp.b<C> alwaysTrue() {
         return $$0 -> true;
      }
   }

   public static record c<C, T>(T b, int c, ctp.b<C> d) {
      public static final Comparator<ctp.c<?, ?>> a = Comparator.comparingInt(ctp.c::b).reversed();

      public T a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }

      public ctp.b<C> c() {
         return this.d;
      }
   }
}
