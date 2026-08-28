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

public interface ctm<Context, Condition extends ctm.b<Context>> {
   List<ctm.a<Context, Condition>> a();

   static <C, T> Stream<T> a(Stream<T> $$0, Function<T, ctm<C, ?>> $$1, C $$2) {
      List<ctm.c<C, T>> $$3 = new ArrayList<>();
      $$0.forEach($$2x -> {
         ctm<C, ?> $$3x = $$1.apply((T)$$2x);

         for (ctm.a<C, ?> $$4x : $$3x.a()) {
            $$3.add(new ctm.c<>((T)$$2x, $$4x.b(), (ctm.b<C>)DataFixUtils.orElseGet($$4x.a(), ctm.b::alwaysTrue)));
         }
      });
      $$3.sort(ctm.c.a);
      Iterator<ctm.c<C, T>> $$4 = $$3.iterator();
      int $$5 = Integer.MIN_VALUE;

      while ($$4.hasNext()) {
         ctm.c<C, T> $$6 = $$4.next();
         if ($$6.c < $$5) {
            $$4.remove();
         } else if ($$6.d.test($$2)) {
            $$5 = $$6.c;
         } else {
            $$4.remove();
         }
      }

      return $$3.stream().map(ctm.c::a);
   }

   static <C, T> Optional<T> a(Stream<T> $$0, Function<T, ctm<C, ?>> $$1, azv $$2, C $$3) {
      List<T> $$4 = a($$0, $$1, $$3).toList();
      return ag.b($$4, $$2);
   }

   static <Context, Condition extends ctm.b<Context>> List<ctm.a<Context, Condition>> a(Condition $$0, int $$1) {
      return List.of(new ctm.a<>($$0, $$1));
   }

   static <Context, Condition extends ctm.b<Context>> List<ctm.a<Context, Condition>> a(int $$0) {
      return List.of(new ctm.a<>(Optional.empty(), $$0));
   }

   public static record a<Context, Condition extends ctm.b<Context>>(Optional<Condition> a, int b) {
      public a(Condition $$0, int $$1) {
         this(Optional.of($$0), $$1);
      }

      public a(int $$0) {
         this(Optional.empty(), $$0);
      }

      public static <Context, Condition extends ctm.b<Context>> Codec<ctm.a<Context, Condition>> a(Codec<Condition> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.optionalFieldOf("condition").forGetter(ctm.a::a), Codec.INT.fieldOf("priority").forGetter(ctm.a::b)).apply($$1, ctm.a::new)
         );
      }
   }

   @FunctionalInterface
   public interface b<C> extends Predicate<C> {
      static <C> ctm.b<C> alwaysTrue() {
         return $$0 -> true;
      }
   }

   public static record c<C, T>(T b, int c, ctm.b<C> d) {
      public static final Comparator<ctm.c<?, ?>> a = Comparator.comparingInt(ctm.c::b).reversed();

      public T a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }

      public ctm.b<C> c() {
         return this.d;
      }
   }
}
