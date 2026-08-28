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

public abstract class fnf {
   private final Map<fng, List<fnh>> a = Maps.newHashMap();

   protected void a(fng $$0, List<fnh> $$1) {
      List<fnh> $$2 = this.a.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Value " + $$0 + " is already defined");
      }
   }

   Map<fng, List<fnh>> a() {
      this.c();
      return ImmutableMap.copyOf(this.a);
   }

   private void c() {
      List<dxx<?>> $$0 = this.b();
      Stream<fng> $$1 = Stream.of(fng.a());

      for (dxx<?> $$2 : $$0) {
         $$1 = $$1.flatMap($$1x -> $$2.c().map($$1x::a));
      }

      List<fng> $$3 = $$1.filter($$0x -> !this.a.containsKey($$0x)).collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         throw new IllegalStateException("Missing definition for properties: " + $$3);
      }
   }

   abstract List<dxx<?>> b();

   public static <T1 extends Comparable<T1>> fnf.a<T1> a(dxx<T1> $$0) {
      return new fnf.a<>($$0);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>> fnf.b<T1, T2> a(dxx<T1> $$0, dxx<T2> $$1) {
      return new fnf.b<>($$0, $$1);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> fnf.c<T1, T2, T3> a(dxx<T1> $$0, dxx<T2> $$1, dxx<T3> $$2) {
      return new fnf.c<>($$0, $$1, $$2);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> fnf.d<T1, T2, T3, T4> a(
      dxx<T1> $$0, dxx<T2> $$1, dxx<T3> $$2, dxx<T4> $$3
   ) {
      return new fnf.d<>($$0, $$1, $$2, $$3);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>> fnf.e<T1, T2, T3, T4, T5> a(
      dxx<T1> $$0, dxx<T2> $$1, dxx<T3> $$2, dxx<T4> $$3, dxx<T5> $$4
   ) {
      return new fnf.e<>($$0, $$1, $$2, $$3, $$4);
   }

   public static class a<T1 extends Comparable<T1>> extends fnf {
      private final dxx<T1> a;

      a(dxx<T1> $$0) {
         this.a = $$0;
      }

      @Override
      public List<dxx<?>> b() {
         return ImmutableList.of(this.a);
      }

      public fnf.a<T1> a(T1 $$0, List<fnh> $$1) {
         fng $$2 = fng.a(this.a.c($$0));
         this.a($$2, $$1);
         return this;
      }

      public fnf.a<T1> a(T1 $$0, fnh $$1) {
         return this.a($$0, Collections.singletonList($$1));
      }

      public fnf a(Function<T1, fnh> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }

      public fnf b(Function<T1, List<fnh>> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }
   }

   public static class b<T1 extends Comparable<T1>, T2 extends Comparable<T2>> extends fnf {
      private final dxx<T1> a;
      private final dxx<T2> b;

      b(dxx<T1> $$0, dxx<T2> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public List<dxx<?>> b() {
         return ImmutableList.of(this.a, this.b);
      }

      public fnf.b<T1, T2> a(T1 $$0, T2 $$1, List<fnh> $$2) {
         fng $$3 = fng.a(this.a.c($$0), this.b.c($$1));
         this.a($$3, $$2);
         return this;
      }

      public fnf.b<T1, T2> a(T1 $$0, T2 $$1, fnh $$2) {
         return this.a($$0, $$1, Collections.singletonList($$2));
      }

      public fnf a(BiFunction<T1, T2, fnh> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }

      public fnf b(BiFunction<T1, T2, List<fnh>> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }
   }

   public static class c<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> extends fnf {
      private final dxx<T1> a;
      private final dxx<T2> b;
      private final dxx<T3> c;

      c(dxx<T1> $$0, dxx<T2> $$1, dxx<T3> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public List<dxx<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c);
      }

      public fnf.c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, List<fnh> $$3) {
         fng $$4 = fng.a(this.a.c($$0), this.b.c($$1), this.c.c($$2));
         this.a($$4, $$3);
         return this;
      }

      public fnf.c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, fnh $$3) {
         return this.a($$0, $$1, $$2, Collections.singletonList($$3));
      }

      public fnf a(fnf.h<T1, T2, T3, fnh> $$0) {
         this.a
            .a()
            .forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3)))));
         return this;
      }

      public fnf b(fnf.h<T1, T2, T3, List<fnh>> $$0) {
         this.a
            .a()
            .forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3)))));
         return this;
      }
   }

   public static class d<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> extends fnf {
      private final dxx<T1> a;
      private final dxx<T2> b;
      private final dxx<T3> c;
      private final dxx<T4> d;

      d(dxx<T1> $$0, dxx<T2> $$1, dxx<T3> $$2, dxx<T4> $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public List<dxx<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c, this.d);
      }

      public fnf.d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, List<fnh> $$4) {
         fng $$5 = fng.a(this.a.c($$0), this.b.c($$1), this.c.c($$2), this.d.c($$3));
         this.a($$5, $$4);
         return this;
      }

      public fnf.d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, fnh $$4) {
         return this.a($$0, $$1, $$2, $$3, Collections.singletonList($$4));
      }

      public fnf a(fnf.g<T1, T2, T3, T4, fnh> $$0) {
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

      public fnf b(fnf.g<T1, T2, T3, T4, List<fnh>> $$0) {
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
      extends fnf {
      private final dxx<T1> a;
      private final dxx<T2> b;
      private final dxx<T3> c;
      private final dxx<T4> d;
      private final dxx<T5> e;

      e(dxx<T1> $$0, dxx<T2> $$1, dxx<T3> $$2, dxx<T4> $$3, dxx<T5> $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public List<dxx<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c, this.d, this.e);
      }

      public fnf.e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, List<fnh> $$5) {
         fng $$6 = fng.a(this.a.c($$0), this.b.c($$1), this.c.c($$2), this.d.c($$3), this.e.c($$4));
         this.a($$6, $$5);
         return this;
      }

      public fnf.e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, fnh $$5) {
         return this.a($$0, $$1, $$2, $$3, $$4, Collections.singletonList($$5));
      }

      public fnf a(fnf.f<T1, T2, T3, T4, T5, fnh> $$0) {
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

      public fnf b(fnf.f<T1, T2, T3, T4, T5, List<fnh>> $$0) {
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
