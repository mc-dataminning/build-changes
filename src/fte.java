import com.mojang.datafixers.util.Function3;
import com.mojang.datafixers.util.Function4;
import com.mojang.datafixers.util.Function5;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Stream;

public abstract class fte<V> {
   private final Map<ftf, V> a = new HashMap<>();

   protected void a(ftf $$0, V $$1) {
      V $$2 = this.a.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Value " + $$0 + " is already defined");
      }
   }

   Map<ftf, V> a() {
      this.c();
      return Map.copyOf(this.a);
   }

   private void c() {
      List<ech<?>> $$0 = this.b();
      Stream<ftf> $$1 = Stream.of(ftf.a);

      for (ech<?> $$2 : $$0) {
         $$1 = $$1.flatMap($$1x -> $$2.c().map($$1x::a));
      }

      List<ftf> $$3 = $$1.filter($$0x -> !this.a.containsKey($$0x)).toList();
      if (!$$3.isEmpty()) {
         throw new IllegalStateException("Missing definition for properties: " + $$3);
      }
   }

   abstract List<ech<?>> b();

   public static <T1 extends Comparable<T1>> fte.a<fsz, T1> a(ech<T1> $$0) {
      return new fte.a<>($$0);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>> fte.b<fsz, T1, T2> a(ech<T1> $$0, ech<T2> $$1) {
      return new fte.b<>($$0, $$1);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> fte.c<fsz, T1, T2, T3> a(
      ech<T1> $$0, ech<T2> $$1, ech<T3> $$2
   ) {
      return new fte.c<>($$0, $$1, $$2);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> fte.d<fsz, T1, T2, T3, T4> a(
      ech<T1> $$0, ech<T2> $$1, ech<T3> $$2, ech<T4> $$3
   ) {
      return new fte.d<>($$0, $$1, $$2, $$3);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>> fte.e<fsz, T1, T2, T3, T4, T5> a(
      ech<T1> $$0, ech<T2> $$1, ech<T3> $$2, ech<T4> $$3, ech<T5> $$4
   ) {
      return new fte.e<>($$0, $$1, $$2, $$3, $$4);
   }

   public static <T1 extends Comparable<T1>> fte.a<gtx, T1> b(ech<T1> $$0) {
      return new fte.a<>($$0);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>> fte.b<gtx, T1, T2> b(ech<T1> $$0, ech<T2> $$1) {
      return new fte.b<>($$0, $$1);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> fte.c<gtx, T1, T2, T3> b(
      ech<T1> $$0, ech<T2> $$1, ech<T3> $$2
   ) {
      return new fte.c<>($$0, $$1, $$2);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> fte.d<gtx, T1, T2, T3, T4> b(
      ech<T1> $$0, ech<T2> $$1, ech<T3> $$2, ech<T4> $$3
   ) {
      return new fte.d<>($$0, $$1, $$2, $$3);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>> fte.e<gtx, T1, T2, T3, T4, T5> b(
      ech<T1> $$0, ech<T2> $$1, ech<T3> $$2, ech<T4> $$3, ech<T5> $$4
   ) {
      return new fte.e<>($$0, $$1, $$2, $$3, $$4);
   }

   public static class a<V, T1 extends Comparable<T1>> extends fte<V> {
      private final ech<T1> a;

      a(ech<T1> $$0) {
         this.a = $$0;
      }

      @Override
      public List<ech<?>> b() {
         return List.of(this.a);
      }

      public fte.a<V, T1> a(T1 $$0, V $$1) {
         ftf $$2 = ftf.a(this.a.c($$0));
         this.a($$2, $$1);
         return this;
      }

      public fte<V> a(Function<T1, V> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }
   }

   public static class b<V, T1 extends Comparable<T1>, T2 extends Comparable<T2>> extends fte<V> {
      private final ech<T1> a;
      private final ech<T2> b;

      b(ech<T1> $$0, ech<T2> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public List<ech<?>> b() {
         return List.of(this.a, this.b);
      }

      public fte.b<V, T1, T2> a(T1 $$0, T2 $$1, V $$2) {
         ftf $$3 = ftf.a(this.a.c($$0), this.b.c($$1));
         this.a($$3, $$2);
         return this;
      }

      public fte<V> a(BiFunction<T1, T2, V> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }
   }

   public static class c<V, T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> extends fte<V> {
      private final ech<T1> a;
      private final ech<T2> b;
      private final ech<T3> c;

      c(ech<T1> $$0, ech<T2> $$1, ech<T3> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public List<ech<?>> b() {
         return List.of(this.a, this.b, this.c);
      }

      public fte.c<V, T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, V $$3) {
         ftf $$4 = ftf.a(this.a.c($$0), this.b.c($$1), this.c.c($$2));
         this.a($$4, $$3);
         return this;
      }

      public fte<V> a(Function3<T1, T2, T3, V> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, (V)$$0.apply($$1, $$2, $$3)))));
         return this;
      }
   }

   public static class d<V, T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> extends fte<V> {
      private final ech<T1> a;
      private final ech<T2> b;
      private final ech<T3> c;
      private final ech<T4> d;

      d(ech<T1> $$0, ech<T2> $$1, ech<T3> $$2, ech<T4> $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public List<ech<?>> b() {
         return List.of(this.a, this.b, this.c, this.d);
      }

      public fte.d<V, T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, V $$4) {
         ftf $$5 = ftf.a(this.a.c($$0), this.b.c($$1), this.c.c($$2), this.d.c($$3));
         this.a($$5, $$4);
         return this;
      }

      public fte<V> a(Function4<T1, T2, T3, T4, V> $$0) {
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
      extends fte<V> {
      private final ech<T1> a;
      private final ech<T2> b;
      private final ech<T3> c;
      private final ech<T4> d;
      private final ech<T5> e;

      e(ech<T1> $$0, ech<T2> $$1, ech<T3> $$2, ech<T4> $$3, ech<T5> $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public List<ech<?>> b() {
         return List.of(this.a, this.b, this.c, this.d, this.e);
      }

      public fte.e<V, T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, V $$5) {
         ftf $$6 = ftf.a(this.a.c($$0), this.b.c($$1), this.c.c($$2), this.d.c($$3), this.e.c($$4));
         this.a($$6, $$5);
         return this;
      }

      public fte<V> a(Function5<T1, T2, T3, T4, T5, V> $$0) {
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
