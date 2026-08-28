import com.mojang.datafixers.util.Function3;
import com.mojang.datafixers.util.Function4;
import com.mojang.datafixers.util.Function5;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Stream;

public abstract class frt<V> {
   private final Map<fru, V> a = new HashMap<>();

   protected void a(fru $$0, V $$1) {
      V $$2 = this.a.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Value " + $$0 + " is already defined");
      }
   }

   Map<fru, V> a() {
      this.c();
      return Map.copyOf(this.a);
   }

   private void c() {
      List<ebw<?>> $$0 = this.b();
      Stream<fru> $$1 = Stream.of(fru.a);

      for (ebw<?> $$2 : $$0) {
         $$1 = $$1.flatMap($$1x -> $$2.c().map($$1x::a));
      }

      List<fru> $$3 = $$1.filter($$0x -> !this.a.containsKey($$0x)).toList();
      if (!$$3.isEmpty()) {
         throw new IllegalStateException("Missing definition for properties: " + $$3);
      }
   }

   abstract List<ebw<?>> b();

   public static <T1 extends Comparable<T1>> frt.a<gsi, T1> a(ebw<T1> $$0) {
      return new frt.a<>($$0);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>> frt.b<gsi, T1, T2> a(ebw<T1> $$0, ebw<T2> $$1) {
      return new frt.b<>($$0, $$1);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> frt.c<gsi, T1, T2, T3> a(
      ebw<T1> $$0, ebw<T2> $$1, ebw<T3> $$2
   ) {
      return new frt.c<>($$0, $$1, $$2);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> frt.d<gsi, T1, T2, T3, T4> a(
      ebw<T1> $$0, ebw<T2> $$1, ebw<T3> $$2, ebw<T4> $$3
   ) {
      return new frt.d<>($$0, $$1, $$2, $$3);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>> frt.e<gsi, T1, T2, T3, T4, T5> a(
      ebw<T1> $$0, ebw<T2> $$1, ebw<T3> $$2, ebw<T4> $$3, ebw<T5> $$4
   ) {
      return new frt.e<>($$0, $$1, $$2, $$3, $$4);
   }

   public static <T1 extends Comparable<T1>> frt.a<gsn, T1> b(ebw<T1> $$0) {
      return new frt.a<>($$0);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>> frt.b<gsn, T1, T2> b(ebw<T1> $$0, ebw<T2> $$1) {
      return new frt.b<>($$0, $$1);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> frt.c<gsn, T1, T2, T3> b(
      ebw<T1> $$0, ebw<T2> $$1, ebw<T3> $$2
   ) {
      return new frt.c<>($$0, $$1, $$2);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> frt.d<gsn, T1, T2, T3, T4> b(
      ebw<T1> $$0, ebw<T2> $$1, ebw<T3> $$2, ebw<T4> $$3
   ) {
      return new frt.d<>($$0, $$1, $$2, $$3);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>> frt.e<gsn, T1, T2, T3, T4, T5> b(
      ebw<T1> $$0, ebw<T2> $$1, ebw<T3> $$2, ebw<T4> $$3, ebw<T5> $$4
   ) {
      return new frt.e<>($$0, $$1, $$2, $$3, $$4);
   }

   public static class a<V, T1 extends Comparable<T1>> extends frt<V> {
      private final ebw<T1> a;

      a(ebw<T1> $$0) {
         this.a = $$0;
      }

      @Override
      public List<ebw<?>> b() {
         return List.of(this.a);
      }

      public frt.a<V, T1> a(T1 $$0, V $$1) {
         fru $$2 = fru.a(this.a.c($$0));
         this.a($$2, $$1);
         return this;
      }

      public frt<V> a(Function<T1, V> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }
   }

   public static class b<V, T1 extends Comparable<T1>, T2 extends Comparable<T2>> extends frt<V> {
      private final ebw<T1> a;
      private final ebw<T2> b;

      b(ebw<T1> $$0, ebw<T2> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public List<ebw<?>> b() {
         return List.of(this.a, this.b);
      }

      public frt.b<V, T1, T2> a(T1 $$0, T2 $$1, V $$2) {
         fru $$3 = fru.a(this.a.c($$0), this.b.c($$1));
         this.a($$3, $$2);
         return this;
      }

      public frt<V> a(BiFunction<T1, T2, V> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }
   }

   public static class c<V, T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> extends frt<V> {
      private final ebw<T1> a;
      private final ebw<T2> b;
      private final ebw<T3> c;

      c(ebw<T1> $$0, ebw<T2> $$1, ebw<T3> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public List<ebw<?>> b() {
         return List.of(this.a, this.b, this.c);
      }

      public frt.c<V, T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, V $$3) {
         fru $$4 = fru.a(this.a.c($$0), this.b.c($$1), this.c.c($$2));
         this.a($$4, $$3);
         return this;
      }

      public frt<V> a(Function3<T1, T2, T3, V> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, (V)$$0.apply($$1, $$2, $$3)))));
         return this;
      }
   }

   public static class d<V, T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> extends frt<V> {
      private final ebw<T1> a;
      private final ebw<T2> b;
      private final ebw<T3> c;
      private final ebw<T4> d;

      d(ebw<T1> $$0, ebw<T2> $$1, ebw<T3> $$2, ebw<T4> $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public List<ebw<?>> b() {
         return List.of(this.a, this.b, this.c, this.d);
      }

      public frt.d<V, T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, V $$4) {
         fru $$5 = fru.a(this.a.c($$0), this.b.c($$1), this.c.c($$2), this.d.c($$3));
         this.a($$5, $$4);
         return this;
      }

      public frt<V> a(Function4<T1, T2, T3, T4, V> $$0) {
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
      extends frt<V> {
      private final ebw<T1> a;
      private final ebw<T2> b;
      private final ebw<T3> c;
      private final ebw<T4> d;
      private final ebw<T5> e;

      e(ebw<T1> $$0, ebw<T2> $$1, ebw<T3> $$2, ebw<T4> $$3, ebw<T5> $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public List<ebw<?>> b() {
         return List.of(this.a, this.b, this.c, this.d, this.e);
      }

      public frt.e<V, T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, V $$5) {
         fru $$6 = fru.a(this.a.c($$0), this.b.c($$1), this.c.c($$2), this.d.c($$3), this.e.c($$4));
         this.a($$6, $$5);
         return this;
      }

      public frt<V> a(Function5<T1, T2, T3, T4, T5, V> $$0) {
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
