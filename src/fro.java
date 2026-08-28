import com.mojang.datafixers.util.Function3;
import com.mojang.datafixers.util.Function4;
import com.mojang.datafixers.util.Function5;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Stream;

public abstract class fro<V> {
   private final Map<frp, V> a = new HashMap<>();

   protected void a(frp $$0, V $$1) {
      V $$2 = this.a.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Value " + $$0 + " is already defined");
      }
   }

   Map<frp, V> a() {
      this.c();
      return Map.copyOf(this.a);
   }

   private void c() {
      List<ebr<?>> $$0 = this.b();
      Stream<frp> $$1 = Stream.of(frp.a);

      for (ebr<?> $$2 : $$0) {
         $$1 = $$1.flatMap($$1x -> $$2.c().map($$1x::a));
      }

      List<frp> $$3 = $$1.filter($$0x -> !this.a.containsKey($$0x)).toList();
      if (!$$3.isEmpty()) {
         throw new IllegalStateException("Missing definition for properties: " + $$3);
      }
   }

   abstract List<ebr<?>> b();

   public static <T1 extends Comparable<T1>> fro.a<gsd, T1> a(ebr<T1> $$0) {
      return new fro.a<>($$0);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>> fro.b<gsd, T1, T2> a(ebr<T1> $$0, ebr<T2> $$1) {
      return new fro.b<>($$0, $$1);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> fro.c<gsd, T1, T2, T3> a(
      ebr<T1> $$0, ebr<T2> $$1, ebr<T3> $$2
   ) {
      return new fro.c<>($$0, $$1, $$2);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> fro.d<gsd, T1, T2, T3, T4> a(
      ebr<T1> $$0, ebr<T2> $$1, ebr<T3> $$2, ebr<T4> $$3
   ) {
      return new fro.d<>($$0, $$1, $$2, $$3);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>> fro.e<gsd, T1, T2, T3, T4, T5> a(
      ebr<T1> $$0, ebr<T2> $$1, ebr<T3> $$2, ebr<T4> $$3, ebr<T5> $$4
   ) {
      return new fro.e<>($$0, $$1, $$2, $$3, $$4);
   }

   public static <T1 extends Comparable<T1>> fro.a<gsi, T1> b(ebr<T1> $$0) {
      return new fro.a<>($$0);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>> fro.b<gsi, T1, T2> b(ebr<T1> $$0, ebr<T2> $$1) {
      return new fro.b<>($$0, $$1);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> fro.c<gsi, T1, T2, T3> b(
      ebr<T1> $$0, ebr<T2> $$1, ebr<T3> $$2
   ) {
      return new fro.c<>($$0, $$1, $$2);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> fro.d<gsi, T1, T2, T3, T4> b(
      ebr<T1> $$0, ebr<T2> $$1, ebr<T3> $$2, ebr<T4> $$3
   ) {
      return new fro.d<>($$0, $$1, $$2, $$3);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>> fro.e<gsi, T1, T2, T3, T4, T5> b(
      ebr<T1> $$0, ebr<T2> $$1, ebr<T3> $$2, ebr<T4> $$3, ebr<T5> $$4
   ) {
      return new fro.e<>($$0, $$1, $$2, $$3, $$4);
   }

   public static class a<V, T1 extends Comparable<T1>> extends fro<V> {
      private final ebr<T1> a;

      a(ebr<T1> $$0) {
         this.a = $$0;
      }

      @Override
      public List<ebr<?>> b() {
         return List.of(this.a);
      }

      public fro.a<V, T1> a(T1 $$0, V $$1) {
         frp $$2 = frp.a(this.a.c($$0));
         this.a($$2, $$1);
         return this;
      }

      public fro<V> a(Function<T1, V> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }
   }

   public static class b<V, T1 extends Comparable<T1>, T2 extends Comparable<T2>> extends fro<V> {
      private final ebr<T1> a;
      private final ebr<T2> b;

      b(ebr<T1> $$0, ebr<T2> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public List<ebr<?>> b() {
         return List.of(this.a, this.b);
      }

      public fro.b<V, T1, T2> a(T1 $$0, T2 $$1, V $$2) {
         frp $$3 = frp.a(this.a.c($$0), this.b.c($$1));
         this.a($$3, $$2);
         return this;
      }

      public fro<V> a(BiFunction<T1, T2, V> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }
   }

   public static class c<V, T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> extends fro<V> {
      private final ebr<T1> a;
      private final ebr<T2> b;
      private final ebr<T3> c;

      c(ebr<T1> $$0, ebr<T2> $$1, ebr<T3> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public List<ebr<?>> b() {
         return List.of(this.a, this.b, this.c);
      }

      public fro.c<V, T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, V $$3) {
         frp $$4 = frp.a(this.a.c($$0), this.b.c($$1), this.c.c($$2));
         this.a($$4, $$3);
         return this;
      }

      public fro<V> a(Function3<T1, T2, T3, V> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, (V)$$0.apply($$1, $$2, $$3)))));
         return this;
      }
   }

   public static class d<V, T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> extends fro<V> {
      private final ebr<T1> a;
      private final ebr<T2> b;
      private final ebr<T3> c;
      private final ebr<T4> d;

      d(ebr<T1> $$0, ebr<T2> $$1, ebr<T3> $$2, ebr<T4> $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public List<ebr<?>> b() {
         return List.of(this.a, this.b, this.c, this.d);
      }

      public fro.d<V, T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, V $$4) {
         frp $$5 = frp.a(this.a.c($$0), this.b.c($$1), this.c.c($$2), this.d.c($$3));
         this.a($$5, $$4);
         return this;
      }

      public fro<V> a(Function4<T1, T2, T3, T4, V> $$0) {
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
      extends fro<V> {
      private final ebr<T1> a;
      private final ebr<T2> b;
      private final ebr<T3> c;
      private final ebr<T4> d;
      private final ebr<T5> e;

      e(ebr<T1> $$0, ebr<T2> $$1, ebr<T3> $$2, ebr<T4> $$3, ebr<T5> $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public List<ebr<?>> b() {
         return List.of(this.a, this.b, this.c, this.d, this.e);
      }

      public fro.e<V, T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, V $$5) {
         frp $$6 = frp.a(this.a.c($$0), this.b.c($$1), this.c.c($$2), this.d.c($$3), this.e.c($$4));
         this.a($$6, $$5);
         return this;
      }

      public fro<V> a(Function5<T1, T2, T3, T4, T5, V> $$0) {
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
