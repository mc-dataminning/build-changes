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

public abstract class fnj {
   private final Map<fnk, List<fnl>> a = Maps.newHashMap();

   protected void a(fnk $$0, List<fnl> $$1) {
      List<fnl> $$2 = this.a.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Value " + $$0 + " is already defined");
      }
   }

   Map<fnk, List<fnl>> a() {
      this.c();
      return ImmutableMap.copyOf(this.a);
   }

   private void c() {
      List<dya<?>> $$0 = this.b();
      Stream<fnk> $$1 = Stream.of(fnk.a());

      for (dya<?> $$2 : $$0) {
         $$1 = $$1.flatMap($$1x -> $$2.c().map($$1x::a));
      }

      List<fnk> $$3 = $$1.filter($$0x -> !this.a.containsKey($$0x)).collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         throw new IllegalStateException("Missing definition for properties: " + $$3);
      }
   }

   abstract List<dya<?>> b();

   public static <T1 extends Comparable<T1>> fnj.a<T1> a(dya<T1> $$0) {
      return new fnj.a<>($$0);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>> fnj.b<T1, T2> a(dya<T1> $$0, dya<T2> $$1) {
      return new fnj.b<>($$0, $$1);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> fnj.c<T1, T2, T3> a(dya<T1> $$0, dya<T2> $$1, dya<T3> $$2) {
      return new fnj.c<>($$0, $$1, $$2);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> fnj.d<T1, T2, T3, T4> a(
      dya<T1> $$0, dya<T2> $$1, dya<T3> $$2, dya<T4> $$3
   ) {
      return new fnj.d<>($$0, $$1, $$2, $$3);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>> fnj.e<T1, T2, T3, T4, T5> a(
      dya<T1> $$0, dya<T2> $$1, dya<T3> $$2, dya<T4> $$3, dya<T5> $$4
   ) {
      return new fnj.e<>($$0, $$1, $$2, $$3, $$4);
   }

   public static class a<T1 extends Comparable<T1>> extends fnj {
      private final dya<T1> a;

      a(dya<T1> $$0) {
         this.a = $$0;
      }

      @Override
      public List<dya<?>> b() {
         return ImmutableList.of(this.a);
      }

      public fnj.a<T1> a(T1 $$0, List<fnl> $$1) {
         fnk $$2 = fnk.a(this.a.c($$0));
         this.a($$2, $$1);
         return this;
      }

      public fnj.a<T1> a(T1 $$0, fnl $$1) {
         return this.a($$0, Collections.singletonList($$1));
      }

      public fnj a(Function<T1, fnl> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }

      public fnj b(Function<T1, List<fnl>> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }
   }

   public static class b<T1 extends Comparable<T1>, T2 extends Comparable<T2>> extends fnj {
      private final dya<T1> a;
      private final dya<T2> b;

      b(dya<T1> $$0, dya<T2> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public List<dya<?>> b() {
         return ImmutableList.of(this.a, this.b);
      }

      public fnj.b<T1, T2> a(T1 $$0, T2 $$1, List<fnl> $$2) {
         fnk $$3 = fnk.a(this.a.c($$0), this.b.c($$1));
         this.a($$3, $$2);
         return this;
      }

      public fnj.b<T1, T2> a(T1 $$0, T2 $$1, fnl $$2) {
         return this.a($$0, $$1, Collections.singletonList($$2));
      }

      public fnj a(BiFunction<T1, T2, fnl> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }

      public fnj b(BiFunction<T1, T2, List<fnl>> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }
   }

   public static class c<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> extends fnj {
      private final dya<T1> a;
      private final dya<T2> b;
      private final dya<T3> c;

      c(dya<T1> $$0, dya<T2> $$1, dya<T3> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public List<dya<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c);
      }

      public fnj.c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, List<fnl> $$3) {
         fnk $$4 = fnk.a(this.a.c($$0), this.b.c($$1), this.c.c($$2));
         this.a($$4, $$3);
         return this;
      }

      public fnj.c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, fnl $$3) {
         return this.a($$0, $$1, $$2, Collections.singletonList($$3));
      }

      public fnj a(fnj.h<T1, T2, T3, fnl> $$0) {
         this.a
            .a()
            .forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3)))));
         return this;
      }

      public fnj b(fnj.h<T1, T2, T3, List<fnl>> $$0) {
         this.a
            .a()
            .forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3)))));
         return this;
      }
   }

   public static class d<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> extends fnj {
      private final dya<T1> a;
      private final dya<T2> b;
      private final dya<T3> c;
      private final dya<T4> d;

      d(dya<T1> $$0, dya<T2> $$1, dya<T3> $$2, dya<T4> $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public List<dya<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c, this.d);
      }

      public fnj.d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, List<fnl> $$4) {
         fnk $$5 = fnk.a(this.a.c($$0), this.b.c($$1), this.c.c($$2), this.d.c($$3));
         this.a($$5, $$4);
         return this;
      }

      public fnj.d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, fnl $$4) {
         return this.a($$0, $$1, $$2, $$3, Collections.singletonList($$4));
      }

      public fnj a(fnj.g<T1, T2, T3, T4, fnl> $$0) {
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

      public fnj b(fnj.g<T1, T2, T3, T4, List<fnl>> $$0) {
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
      extends fnj {
      private final dya<T1> a;
      private final dya<T2> b;
      private final dya<T3> c;
      private final dya<T4> d;
      private final dya<T5> e;

      e(dya<T1> $$0, dya<T2> $$1, dya<T3> $$2, dya<T4> $$3, dya<T5> $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public List<dya<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c, this.d, this.e);
      }

      public fnj.e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, List<fnl> $$5) {
         fnk $$6 = fnk.a(this.a.c($$0), this.b.c($$1), this.c.c($$2), this.d.c($$3), this.e.c($$4));
         this.a($$6, $$5);
         return this;
      }

      public fnj.e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, fnl $$5) {
         return this.a($$0, $$1, $$2, $$3, $$4, Collections.singletonList($$5));
      }

      public fnj a(fnj.f<T1, T2, T3, T4, T5, fnl> $$0) {
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

      public fnj b(fnj.f<T1, T2, T3, T4, T5, List<fnl>> $$0) {
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
