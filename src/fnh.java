import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public abstract class fnh {
   private final Map<fni, List<fnj>> a = Maps.newHashMap();

   protected void a(fni $$0, List<fnj> $$1) {
      List<fnj> $$2 = this.a.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Value " + $$0 + " is already defined");
      }
   }

   Map<fni, List<fnj>> a() {
      this.c();
      return ImmutableMap.copyOf(this.a);
   }

   private void c() {
      List<dxy<?>> $$0 = this.b();
      Stream<fni> $$1 = Stream.of(fni.a());

      for (dxy<?> $$2 : $$0) {
         $$1 = $$1.flatMap($$1x -> $$2.c().map($$1x::a));
      }

      List<fni> $$3 = $$1.filter($$0x -> !this.a.containsKey($$0x)).collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         throw new IllegalStateException("Missing definition for properties: " + $$3);
      }
   }

   abstract List<dxy<?>> b();

   public static <T1 extends Comparable<T1>> fnh.a<T1> a(dxy<T1> $$0) {
      return new fnh.a<>($$0);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>> fnh.b<T1, T2> a(dxy<T1> $$0, dxy<T2> $$1) {
      return new fnh.b<>($$0, $$1);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> fnh.c<T1, T2, T3> a(dxy<T1> $$0, dxy<T2> $$1, dxy<T3> $$2) {
      return new fnh.c<>($$0, $$1, $$2);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> fnh.d<T1, T2, T3, T4> a(
      dxy<T1> $$0, dxy<T2> $$1, dxy<T3> $$2, dxy<T4> $$3
   ) {
      return new fnh.d<>($$0, $$1, $$2, $$3);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>> fnh.e<T1, T2, T3, T4, T5> a(
      dxy<T1> $$0, dxy<T2> $$1, dxy<T3> $$2, dxy<T4> $$3, dxy<T5> $$4
   ) {
      return new fnh.e<>($$0, $$1, $$2, $$3, $$4);
   }

   public static class a<T1 extends Comparable<T1>> extends fnh {
      private final dxy<T1> a;

      a(dxy<T1> $$0) {
         this.a = $$0;
      }

      @Override
      public List<dxy<?>> b() {
         return ImmutableList.of(this.a);
      }

      public fnh.a<T1> a(T1 $$0, List<fnj> $$1) {
         fni $$2 = fni.a(this.a.c($$0));
         this.a($$2, $$1);
         return this;
      }

      public fnh.a<T1> a(T1 $$0, fnj $$1) {
         return this.a($$0, Collections.singletonList($$1));
      }

      public fnh a(Function<T1, fnj> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }

      public fnh b(Function<T1, List<fnj>> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }
   }

   public static class b<T1 extends Comparable<T1>, T2 extends Comparable<T2>> extends fnh {
      private final dxy<T1> a;
      private final dxy<T2> b;

      b(dxy<T1> $$0, dxy<T2> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public List<dxy<?>> b() {
         return ImmutableList.of(this.a, this.b);
      }

      public fnh.b<T1, T2> a(T1 $$0, T2 $$1, List<fnj> $$2) {
         fni $$3 = fni.a(this.a.c($$0), this.b.c($$1));
         this.a($$3, $$2);
         return this;
      }

      public fnh.b<T1, T2> a(T1 $$0, T2 $$1, fnj $$2) {
         return this.a($$0, $$1, Collections.singletonList($$2));
      }

      public fnh a(BiFunction<T1, T2, fnj> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }

      public fnh b(BiFunction<T1, T2, List<fnj>> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }
   }

   public static class c<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> extends fnh {
      private final dxy<T1> a;
      private final dxy<T2> b;
      private final dxy<T3> c;

      c(dxy<T1> $$0, dxy<T2> $$1, dxy<T3> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public List<dxy<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c);
      }

      public fnh.c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, List<fnj> $$3) {
         fni $$4 = fni.a(this.a.c($$0), this.b.c($$1), this.c.c($$2));
         this.a($$4, $$3);
         return this;
      }

      public fnh.c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, fnj $$3) {
         return this.a($$0, $$1, $$2, Collections.singletonList($$3));
      }

      public fnh a(fnh.h<T1, T2, T3, fnj> $$0) {
         this.a
            .a()
            .forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3)))));
         return this;
      }

      public fnh b(fnh.h<T1, T2, T3, List<fnj>> $$0) {
         this.a
            .a()
            .forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3)))));
         return this;
      }
   }

   public static class d<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> extends fnh {
      private final dxy<T1> a;
      private final dxy<T2> b;
      private final dxy<T3> c;
      private final dxy<T4> d;

      d(dxy<T1> $$0, dxy<T2> $$1, dxy<T3> $$2, dxy<T4> $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public List<dxy<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c, this.d);
      }

      public fnh.d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, List<fnj> $$4) {
         fni $$5 = fni.a(this.a.c($$0), this.b.c($$1), this.c.c($$2), this.d.c($$3));
         this.a($$5, $$4);
         return this;
      }

      public fnh.d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, fnj $$4) {
         return this.a($$0, $$1, $$2, $$3, Collections.singletonList($$4));
      }

      public fnh a(fnh.g<T1, T2, T3, T4, fnj> $$0) {
         this.a
            .a()
            .forEach(
               $$1 -> this.b
                     .a()
                     .forEach(
                        $$2 -> this.c
                              .a()
                              .forEach(
                                 $$3 -> this.d.a().forEach($$4 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, (T4)$$4, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3, (T4)$$4)))
                              )
                     )
            );
         return this;
      }

      public fnh b(fnh.g<T1, T2, T3, T4, List<fnj>> $$0) {
         this.a
            .a()
            .forEach(
               $$1 -> this.b
                     .a()
                     .forEach(
                        $$2 -> this.c
                              .a()
                              .forEach(
                                 $$3 -> this.d.a().forEach($$4 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, (T4)$$4, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3, (T4)$$4)))
                              )
                     )
            );
         return this;
      }
   }

   public static class e<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>>
      extends fnh {
      private final dxy<T1> a;
      private final dxy<T2> b;
      private final dxy<T3> c;
      private final dxy<T4> d;
      private final dxy<T5> e;

      e(dxy<T1> $$0, dxy<T2> $$1, dxy<T3> $$2, dxy<T4> $$3, dxy<T5> $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public List<dxy<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c, this.d, this.e);
      }

      public fnh.e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, List<fnj> $$5) {
         fni $$6 = fni.a(this.a.c($$0), this.b.c($$1), this.c.c($$2), this.d.c($$3), this.e.c($$4));
         this.a($$6, $$5);
         return this;
      }

      public fnh.e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, fnj $$5) {
         return this.a($$0, $$1, $$2, $$3, $$4, Collections.singletonList($$5));
      }

      public fnh a(fnh.f<T1, T2, T3, T4, T5, fnj> $$0) {
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
                                                .forEach(
                                                   $$5 -> this.a(
                                                         (T1)$$1, (T2)$$2, (T3)$$3, (T4)$$4, (T5)$$5, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3, (T4)$$4, (T5)$$5)
                                                      )
                                                )
                                       )
                              )
                     )
            );
         return this;
      }

      public fnh b(fnh.f<T1, T2, T3, T4, T5, List<fnj>> $$0) {
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
                                                .forEach(
                                                   $$5 -> this.a(
                                                         (T1)$$1, (T2)$$2, (T3)$$3, (T4)$$4, (T5)$$5, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3, (T4)$$4, (T5)$$5)
                                                      )
                                                )
                                       )
                              )
                     )
            );
         return this;
      }
   }

   @FunctionalInterface
   public interface f<P1, P2, P3, P4, P5, R> {
      R apply(P1 var1, P2 var2, P3 var3, P4 var4, P5 var5);
   }

   @FunctionalInterface
   public interface g<P1, P2, P3, P4, R> {
      R apply(P1 var1, P2 var2, P3 var3, P4 var4);
   }

   @FunctionalInterface
   public interface h<P1, P2, P3, R> {
      R apply(P1 var1, P2 var2, P3 var3);
   }
}
