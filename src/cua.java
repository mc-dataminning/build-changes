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

public interface cua<Context, Condition extends cua.b<Context>> {
   List<cua.a<Context, Condition>> a();

   static <C, T> Stream<T> a(Stream<T> $$0, Function<T, cua<C, ?>> $$1, C $$2) {
      List<cua.c<C, T>> $$3 = new ArrayList<>();
      $$0.forEach($$2x -> {
         cua<C, ?> $$3x = $$1.apply((T)$$2x);

         for (cua.a<C, ?> $$4x : $$3x.a()) {
            $$3.add(new cua.c<>((T)$$2x, $$4x.b(), (cua.b<C>)DataFixUtils.orElseGet($$4x.a(), cua.b::alwaysTrue)));
         }
      });
      $$3.sort(cua.c.a);
      Iterator<cua.c<C, T>> $$4 = $$3.iterator();
      int $$5 = Integer.MIN_VALUE;

      while ($$4.hasNext()) {
         cua.c<C, T> $$6 = $$4.next();
         if ($$6.c < $$5) {
            $$4.remove();
         } else if ($$6.d.test($$2)) {
            $$5 = $$6.c;
         } else {
            $$4.remove();
         }
      }

      return $$3.stream().map(cua.c::a);
   }

   static <C, T> Optional<T> a(Stream<T> $$0, Function<T, cua<C, ?>> $$1, azx $$2, C $$3) {
      List<T> $$4 = a($$0, $$1, $$3).toList();
      return ag.b($$4, $$2);
   }

   static <Context, Condition extends cua.b<Context>> List<cua.a<Context, Condition>> a(Condition $$0, int $$1) {
      return List.of(new cua.a<>($$0, $$1));
   }

   static <Context, Condition extends cua.b<Context>> List<cua.a<Context, Condition>> a(int $$0) {
      return List.of(new cua.a<>(Optional.empty(), $$0));
   }

   public static record a<Context, Condition extends cua.b<Context>>(Optional<Condition> a, int b) {
      public a(Condition $$0, int $$1) {
         this(Optional.of($$0), $$1);
      }

      public a(int $$0) {
         this(Optional.empty(), $$0);
      }

      public static <Context, Condition extends cua.b<Context>> Codec<cua.a<Context, Condition>> a(Codec<Condition> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.optionalFieldOf("condition").forGetter(cua.a::a), Codec.INT.fieldOf("priority").forGetter(cua.a::b)).apply($$1, cua.a::new)
         );
      }
   }

   @FunctionalInterface
   public interface b<C> extends Predicate<C> {
      static <C> cua.b<C> alwaysTrue() {
         return $$0 -> true;
      }
   }

   public static record c<C, T>(T b, int c, cua.b<C> d) {
      public static final Comparator<cua.c<?, ?>> a = Comparator.comparingInt(cua.c::b).reversed();

      public T a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }

      public cua.b<C> c() {
         return this.d;
      }
   }
}
