import com.mojang.datafixers.util.Function3;
import com.mojang.datafixers.util.Function4;
import com.mojang.datafixers.util.Function5;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Stream;

public abstract class ftg<V> {
   private final Map<fth, V> a = new HashMap<>();

   protected void a(fth $$0, V $$1) {
      V $$2 = this.a.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Value " + $$0 + " is already defined");
      }
   }

   Map<fth, V> a() {
      this.c();
      return Map.copyOf(this.a);
   }

   private void c() {
      List<ecj<?>> $$0 = this.b();
      Stream<fth> $$1 = Stream.of(fth.a);

      for (ecj<?> $$2 : $$0) {
         $$1 = $$1.flatMap($$1x -> $$2.c().map($$1x::a));
      }

      List<fth> $$3 = $$1.filter($$0x -> !this.a.containsKey($$0x)).toList();
      if (!$$3.isEmpty()) {
         throw new IllegalStateException("Missing definition for properties: " + $$3);
      }
   }

   abstract List<ecj<?>> b();

   public static <T1 extends Comparable<T1>> ftg.a<ftb, T1> a(ecj<T1> $$0) {
      return new ftg.a<>($$0);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>> ftg.b<ftb, T1, T2> a(ecj<T1> $$0, ecj<T2> $$1) {
      return new ftg.b<>($$0, $$1);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> ftg.c<ftb, T1, T2, T3> a(
      ecj<T1> $$0, ecj<T2> $$1, ecj<T3> $$2
   ) {
      return new ftg.c<>($$0, $$1, $$2);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> ftg.d<ftb, T1, T2, T3, T4> a(
      ecj<T1> $$0, ecj<T2> $$1, ecj<T3> $$2, ecj<T4> $$3
   ) {
      return new ftg.d<>($$0, $$1, $$2, $$3);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>> ftg.e<ftb, T1, T2, T3, T4, T5> a(
      ecj<T1> $$0, ecj<T2> $$1, ecj<T3> $$2, ecj<T4> $$3, ecj<T5> $$4
   ) {
      return new ftg.e<>($$0, $$1, $$2, $$3, $$4);
   }

   public static <T1 extends Comparable<T1>> ftg.a<gtz, T1> b(ecj<T1> $$0) {
      return new ftg.a<>($$0);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>> ftg.b<gtz, T1, T2> b(ecj<T1> $$0, ecj<T2> $$1) {
      return new ftg.b<>($$0, $$1);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> ftg.c<gtz, T1, T2, T3> b(
      ecj<T1> $$0, ecj<T2> $$1, ecj<T3> $$2
   ) {
      return new ftg.c<>($$0, $$1, $$2);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> ftg.d<gtz, T1, T2, T3, T4> b(
      ecj<T1> $$0, ecj<T2> $$1, ecj<T3> $$2, ecj<T4> $$3
   ) {
      return new ftg.d<>($$0, $$1, $$2, $$3);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>> ftg.e<gtz, T1, T2, T3, T4, T5> b(
      ecj<T1> $$0, ecj<T2> $$1, ecj<T3> $$2, ecj<T4> $$3, ecj<T5> $$4
   ) {
      return new ftg.e<>($$0, $$1, $$2, $$3, $$4);
   }

   public static class a<V, T1 extends Comparable<T1>> extends ftg<V> {
      private final ecj<T1> a;

      a(ecj<T1> $$0) {
         this.a = $$0;
      }

      @Override
      public List<ecj<?>> b() {
         return List.of(this.a);
      }

      public ftg.a<V, T1> a(T1 $$0, V $$1) {
         fth $$2 = fth.a(this.a.c($$0));
         this.a($$2, $$1);
         return this;
      }

      public ftg<V> a(Function<T1, V> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }
   }

   public static class b<V, T1 extends Comparable<T1>, T2 extends Comparable<T2>> extends ftg<V> {
      private final ecj<T1> a;
      private final ecj<T2> b;

      b(ecj<T1> $$0, ecj<T2> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public List<ecj<?>> b() {
         return List.of(this.a, this.b);
      }

      public ftg.b<V, T1, T2> a(T1 $$0, T2 $$1, V $$2) {
         fth $$3 = fth.a(this.a.c($$0), this.b.c($$1));
         this.a($$3, $$2);
         return this;
      }

      public ftg<V> a(BiFunction<T1, T2, V> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }
   }

   public static class c<V, T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> extends ftg<V> {
      private final ecj<T1> a;
      private final ecj<T2> b;
      private final ecj<T3> c;

      c(ecj<T1> $$0, ecj<T2> $$1, ecj<T3> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public List<ecj<?>> b() {
         return List.of(this.a, this.b, this.c);
      }

      public ftg.c<V, T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, V $$3) {
         fth $$4 = fth.a(this.a.c($$0), this.b.c($$1), this.c.c($$2));
         this.a($$4, $$3);
         return this;
      }

      public ftg<V> a(Function3<T1, T2, T3, V> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, (V)$$0.apply($$1, $$2, $$3)))));
         return this;
      }
   }

   public static class d<V, T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> extends ftg<V> {
      private final ecj<T1> a;
      private final ecj<T2> b;
      private final ecj<T3> c;
      private final ecj<T4> d;

      d(ecj<T1> $$0, ecj<T2> $$1, ecj<T3> $$2, ecj<T4> $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public List<ecj<?>> b() {
         return List.of(this.a, this.b, this.c, this.d);
      }

      public ftg.d<V, T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, V $$4) {
         fth $$5 = fth.a(this.a.c($$0), this.b.c($$1), this.c.c($$2), this.d.c($$3));
         this.a($$5, $$4);
         return this;
      }

      public ftg<V> a(Function4<T1, T2, T3, T4, V> $$0) {
         this.a
            .a()
            .forEach(
               $$1 -> this.b
                     .a()
                     .forEach(
                        $$2 -> this.c
                              .a()
                              .forEach($$3 -> this.d.a().forEach($$4 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, (T4)$$4, (V)$$0.apply($$1, $$2, $$3, $$4))))
                     )
            );
         return this;
      }
   }

   public static class e<V, T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>>
      extends ftg<V> {
      private final ecj<T1> a;
      private final ecj<T2> b;
      private final ecj<T3> c;
      private final ecj<T4> d;
      private final ecj<T5> e;

      e(ecj<T1> $$0, ecj<T2> $$1, ecj<T3> $$2, ecj<T4> $$3, ecj<T5> $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public List<ecj<?>> b() {
         return List.of(this.a, this.b, this.c, this.d, this.e);
      }

      public ftg.e<V, T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, V $$5) {
         fth $$6 = fth.a(this.a.c($$0), this.b.c($$1), this.c.c($$2), this.d.c($$3), this.e.c($$4));
         this.a($$6, $$5);
         return this;
      }

      public ftg<V> a(Function5<T1, T2, T3, T4, T5, V> $$0) {
         this.a
            .a()
            .forEach(
               $$1 -> this.b
                     .a()
                     .forEach(
                        $$2 -> this.c
                              .a()
                              .forEach(
                                 $$3 -> this.d
                                       .a()
                                       .forEach(
                                          $$4 -> this.e
                                                .a()
                                                .forEach($$5 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, (T4)$$4, (T5)$$5, (V)$$0.apply($$1, $$2, $$3, $$4, $$5)))
                                       )
                              )
                     )
            );
         return this;
      }
   }
}
