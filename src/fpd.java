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

public abstract class fpd {
   private final Map<fpe, List<fpf>> a = Maps.newHashMap();

   protected void a(fpe $$0, List<fpf> $$1) {
      List<fpf> $$2 = this.a.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Value " + $$0 + " is already defined");
      }
   }

   Map<fpe, List<fpf>> a() {
      this.c();
      return ImmutableMap.copyOf(this.a);
   }

   private void c() {
      List<dzp<?>> $$0 = this.b();
      Stream<fpe> $$1 = Stream.of(fpe.a());

      for (dzp<?> $$2 : $$0) {
         $$1 = $$1.flatMap($$1x -> $$2.c().map($$1x::a));
      }

      List<fpe> $$3 = $$1.filter($$0x -> !this.a.containsKey($$0x)).collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         throw new IllegalStateException("Missing definition for properties: " + $$3);
      }
   }

   abstract List<dzp<?>> b();

   public static <T1 extends Comparable<T1>> fpd.a<T1> a(dzp<T1> $$0) {
      return new fpd.a<>($$0);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>> fpd.b<T1, T2> a(dzp<T1> $$0, dzp<T2> $$1) {
      return new fpd.b<>($$0, $$1);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> fpd.c<T1, T2, T3> a(dzp<T1> $$0, dzp<T2> $$1, dzp<T3> $$2) {
      return new fpd.c<>($$0, $$1, $$2);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> fpd.d<T1, T2, T3, T4> a(
      dzp<T1> $$0, dzp<T2> $$1, dzp<T3> $$2, dzp<T4> $$3
   ) {
      return new fpd.d<>($$0, $$1, $$2, $$3);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>> fpd.e<T1, T2, T3, T4, T5> a(
      dzp<T1> $$0, dzp<T2> $$1, dzp<T3> $$2, dzp<T4> $$3, dzp<T5> $$4
   ) {
      return new fpd.e<>($$0, $$1, $$2, $$3, $$4);
   }

   public static class a<T1 extends Comparable<T1>> extends fpd {
      private final dzp<T1> a;

      a(dzp<T1> $$0) {
         this.a = $$0;
      }

      @Override
      public List<dzp<?>> b() {
         return ImmutableList.of(this.a);
      }

      public fpd.a<T1> a(T1 $$0, List<fpf> $$1) {
         fpe $$2 = fpe.a(this.a.c($$0));
         this.a($$2, $$1);
         return this;
      }

      public fpd.a<T1> a(T1 $$0, fpf $$1) {
         return this.a($$0, Collections.singletonList($$1));
      }

      public fpd a(Function<T1, fpf> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }

      public fpd b(Function<T1, List<fpf>> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }
   }

   public static class b<T1 extends Comparable<T1>, T2 extends Comparable<T2>> extends fpd {
      private final dzp<T1> a;
      private final dzp<T2> b;

      b(dzp<T1> $$0, dzp<T2> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public List<dzp<?>> b() {
         return ImmutableList.of(this.a, this.b);
      }

      public fpd.b<T1, T2> a(T1 $$0, T2 $$1, List<fpf> $$2) {
         fpe $$3 = fpe.a(this.a.c($$0), this.b.c($$1));
         this.a($$3, $$2);
         return this;
      }

      public fpd.b<T1, T2> a(T1 $$0, T2 $$1, fpf $$2) {
         return this.a($$0, $$1, Collections.singletonList($$2));
      }

      public fpd a(BiFunction<T1, T2, fpf> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }

      public fpd b(BiFunction<T1, T2, List<fpf>> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }
   }

   public static class c<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> extends fpd {
      private final dzp<T1> a;
      private final dzp<T2> b;
      private final dzp<T3> c;

      c(dzp<T1> $$0, dzp<T2> $$1, dzp<T3> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public List<dzp<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c);
      }

      public fpd.c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, List<fpf> $$3) {
         fpe $$4 = fpe.a(this.a.c($$0), this.b.c($$1), this.c.c($$2));
         this.a($$4, $$3);
         return this;
      }

      public fpd.c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, fpf $$3) {
         return this.a($$0, $$1, $$2, Collections.singletonList($$3));
      }

      public fpd a(fpd.h<T1, T2, T3, fpf> $$0) {
         this.a
            .a()
            .forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3)))));
         return this;
      }

      public fpd b(fpd.h<T1, T2, T3, List<fpf>> $$0) {
         this.a
            .a()
            .forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3)))));
         return this;
      }
   }

   public static class d<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> extends fpd {
      private final dzp<T1> a;
      private final dzp<T2> b;
      private final dzp<T3> c;
      private final dzp<T4> d;

      d(dzp<T1> $$0, dzp<T2> $$1, dzp<T3> $$2, dzp<T4> $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public List<dzp<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c, this.d);
      }

      public fpd.d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, List<fpf> $$4) {
         fpe $$5 = fpe.a(this.a.c($$0), this.b.c($$1), this.c.c($$2), this.d.c($$3));
         this.a($$5, $$4);
         return this;
      }

      public fpd.d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, fpf $$4) {
         return this.a($$0, $$1, $$2, $$3, Collections.singletonList($$4));
      }

      public fpd a(fpd.g<T1, T2, T3, T4, fpf> $$0) {
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

      public fpd b(fpd.g<T1, T2, T3, T4, List<fpf>> $$0) {
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
      extends fpd {
      private final dzp<T1> a;
      private final dzp<T2> b;
      private final dzp<T3> c;
      private final dzp<T4> d;
      private final dzp<T5> e;

      e(dzp<T1> $$0, dzp<T2> $$1, dzp<T3> $$2, dzp<T4> $$3, dzp<T5> $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public List<dzp<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c, this.d, this.e);
      }

      public fpd.e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, List<fpf> $$5) {
         fpe $$6 = fpe.a(this.a.c($$0), this.b.c($$1), this.c.c($$2), this.d.c($$3), this.e.c($$4));
         this.a($$6, $$5);
         return this;
      }

      public fpd.e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, fpf $$5) {
         return this.a($$0, $$1, $$2, $$3, $$4, Collections.singletonList($$5));
      }

      public fpd a(fpd.f<T1, T2, T3, T4, T5, fpf> $$0) {
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

      public fpd b(fpd.f<T1, T2, T3, T4, T5, List<fpf>> $$0) {
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
