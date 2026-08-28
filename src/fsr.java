import com.mojang.datafixers.util.Function3;
import com.mojang.datafixers.util.Function4;
import com.mojang.datafixers.util.Function5;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Stream;

public abstract class fsr<V> {
   private final Map<fss, V> a = new HashMap<>();

   protected void a(fss $$0, V $$1) {
      V $$2 = this.a.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Value " + $$0 + " is already defined");
      }
   }

   Map<fss, V> a() {
      this.c();
      return Map.copyOf(this.a);
   }

   private void c() {
      List<ect<?>> $$0 = this.b();
      Stream<fss> $$1 = Stream.of(fss.a);

      for (ect<?> $$2 : $$0) {
         $$1 = $$1.flatMap($$1x -> $$2.c().map($$1x::a));
      }

      List<fss> $$3 = $$1.filter($$0x -> !this.a.containsKey($$0x)).toList();
      if (!$$3.isEmpty()) {
         throw new IllegalStateException("Missing definition for properties: " + $$3);
      }
   }

   abstract List<ect<?>> b();

   public static <T1 extends Comparable<T1>> fsr.a<fsm, T1> a(ect<T1> $$0) {
      return new fsr.a<>($$0);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>> fsr.b<fsm, T1, T2> a(ect<T1> $$0, ect<T2> $$1) {
      return new fsr.b<>($$0, $$1);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> fsr.c<fsm, T1, T2, T3> a(
      ect<T1> $$0, ect<T2> $$1, ect<T3> $$2
   ) {
      return new fsr.c<>($$0, $$1, $$2);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> fsr.d<fsm, T1, T2, T3, T4> a(
      ect<T1> $$0, ect<T2> $$1, ect<T3> $$2, ect<T4> $$3
   ) {
      return new fsr.d<>($$0, $$1, $$2, $$3);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>> fsr.e<fsm, T1, T2, T3, T4, T5> a(
      ect<T1> $$0, ect<T2> $$1, ect<T3> $$2, ect<T4> $$3, ect<T5> $$4
   ) {
      return new fsr.e<>($$0, $$1, $$2, $$3, $$4);
   }

   public static <T1 extends Comparable<T1>> fsr.a<gtk, T1> b(ect<T1> $$0) {
      return new fsr.a<>($$0);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>> fsr.b<gtk, T1, T2> b(ect<T1> $$0, ect<T2> $$1) {
      return new fsr.b<>($$0, $$1);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> fsr.c<gtk, T1, T2, T3> b(
      ect<T1> $$0, ect<T2> $$1, ect<T3> $$2
   ) {
      return new fsr.c<>($$0, $$1, $$2);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> fsr.d<gtk, T1, T2, T3, T4> b(
      ect<T1> $$0, ect<T2> $$1, ect<T3> $$2, ect<T4> $$3
   ) {
      return new fsr.d<>($$0, $$1, $$2, $$3);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>> fsr.e<gtk, T1, T2, T3, T4, T5> b(
      ect<T1> $$0, ect<T2> $$1, ect<T3> $$2, ect<T4> $$3, ect<T5> $$4
   ) {
      return new fsr.e<>($$0, $$1, $$2, $$3, $$4);
   }

   public static class a<V, T1 extends Comparable<T1>> extends fsr<V> {
      private final ect<T1> a;

      a(ect<T1> $$0) {
         this.a = $$0;
      }

      @Override
      public List<ect<?>> b() {
         return List.of(this.a);
      }

      public fsr.a<V, T1> a(T1 $$0, V $$1) {
         fss $$2 = fss.a(this.a.c($$0));
         this.a($$2, $$1);
         return this;
      }

      public fsr<V> a(Function<T1, V> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }
   }

   public static class b<V, T1 extends Comparable<T1>, T2 extends Comparable<T2>> extends fsr<V> {
      private final ect<T1> a;
      private final ect<T2> b;

      b(ect<T1> $$0, ect<T2> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public List<ect<?>> b() {
         return List.of(this.a, this.b);
      }

      public fsr.b<V, T1, T2> a(T1 $$0, T2 $$1, V $$2) {
         fss $$3 = fss.a(this.a.c($$0), this.b.c($$1));
         this.a($$3, $$2);
         return this;
      }

      public fsr<V> a(BiFunction<T1, T2, V> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }
   }

   public static class c<V, T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> extends fsr<V> {
      private final ect<T1> a;
      private final ect<T2> b;
      private final ect<T3> c;

      c(ect<T1> $$0, ect<T2> $$1, ect<T3> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public List<ect<?>> b() {
         return List.of(this.a, this.b, this.c);
      }

      public fsr.c<V, T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, V $$3) {
         fss $$4 = fss.a(this.a.c($$0), this.b.c($$1), this.c.c($$2));
         this.a($$4, $$3);
         return this;
      }

      public fsr<V> a(Function3<T1, T2, T3, V> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, (V)$$0.apply($$1, $$2, $$3)))));
         return this;
      }
   }

   public static class d<V, T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> extends fsr<V> {
      private final ect<T1> a;
      private final ect<T2> b;
      private final ect<T3> c;
      private final ect<T4> d;

      d(ect<T1> $$0, ect<T2> $$1, ect<T3> $$2, ect<T4> $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public List<ect<?>> b() {
         return List.of(this.a, this.b, this.c, this.d);
      }

      public fsr.d<V, T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, V $$4) {
         fss $$5 = fss.a(this.a.c($$0), this.b.c($$1), this.c.c($$2), this.d.c($$3));
         this.a($$5, $$4);
         return this;
      }

      public fsr<V> a(Function4<T1, T2, T3, T4, V> $$0) {
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
      extends fsr<V> {
      private final ect<T1> a;
      private final ect<T2> b;
      private final ect<T3> c;
      private final ect<T4> d;
      private final ect<T5> e;

      e(ect<T1> $$0, ect<T2> $$1, ect<T3> $$2, ect<T4> $$3, ect<T5> $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public List<ect<?>> b() {
         return List.of(this.a, this.b, this.c, this.d, this.e);
      }

      public fsr.e<V, T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, V $$5) {
         fss $$6 = fss.a(this.a.c($$0), this.b.c($$1), this.c.c($$2), this.d.c($$3), this.e.c($$4));
         this.a($$6, $$5);
         return this;
      }

      public fsr<V> a(Function5<T1, T2, T3, T4, T5, V> $$0) {
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
