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

public abstract class fqz {
   private final Map<fra, List<frb>> a = Maps.newHashMap();

   protected void a(fra $$0, List<frb> $$1) {
      List<frb> $$2 = this.a.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Value " + $$0 + " is already defined");
      }
   }

   Map<fra, List<frb>> a() {
      this.c();
      return ImmutableMap.copyOf(this.a);
   }

   private void c() {
      List<ebk<?>> $$0 = this.b();
      Stream<fra> $$1 = Stream.of(fra.a());

      for (ebk<?> $$2 : $$0) {
         $$1 = $$1.flatMap($$1x -> $$2.c().map($$1x::a));
      }

      List<fra> $$3 = $$1.filter($$0x -> !this.a.containsKey($$0x)).collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         throw new IllegalStateException("Missing definition for properties: " + $$3);
      }
   }

   abstract List<ebk<?>> b();

   public static <T1 extends Comparable<T1>> fqz.a<T1> a(ebk<T1> $$0) {
      return new fqz.a<>($$0);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>> fqz.b<T1, T2> a(ebk<T1> $$0, ebk<T2> $$1) {
      return new fqz.b<>($$0, $$1);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> fqz.c<T1, T2, T3> a(ebk<T1> $$0, ebk<T2> $$1, ebk<T3> $$2) {
      return new fqz.c<>($$0, $$1, $$2);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> fqz.d<T1, T2, T3, T4> a(
      ebk<T1> $$0, ebk<T2> $$1, ebk<T3> $$2, ebk<T4> $$3
   ) {
      return new fqz.d<>($$0, $$1, $$2, $$3);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>> fqz.e<T1, T2, T3, T4, T5> a(
      ebk<T1> $$0, ebk<T2> $$1, ebk<T3> $$2, ebk<T4> $$3, ebk<T5> $$4
   ) {
      return new fqz.e<>($$0, $$1, $$2, $$3, $$4);
   }

   public static class a<T1 extends Comparable<T1>> extends fqz {
      private final ebk<T1> a;

      a(ebk<T1> $$0) {
         this.a = $$0;
      }

      @Override
      public List<ebk<?>> b() {
         return ImmutableList.of(this.a);
      }

      public fqz.a<T1> a(T1 $$0, List<frb> $$1) {
         fra $$2 = fra.a(this.a.c($$0));
         this.a($$2, $$1);
         return this;
      }

      public fqz.a<T1> a(T1 $$0, frb $$1) {
         return this.a($$0, Collections.singletonList($$1));
      }

      public fqz a(Function<T1, frb> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }

      public fqz b(Function<T1, List<frb>> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }
   }

   public static class b<T1 extends Comparable<T1>, T2 extends Comparable<T2>> extends fqz {
      private final ebk<T1> a;
      private final ebk<T2> b;

      b(ebk<T1> $$0, ebk<T2> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public List<ebk<?>> b() {
         return ImmutableList.of(this.a, this.b);
      }

      public fqz.b<T1, T2> a(T1 $$0, T2 $$1, List<frb> $$2) {
         fra $$3 = fra.a(this.a.c($$0), this.b.c($$1));
         this.a($$3, $$2);
         return this;
      }

      public fqz.b<T1, T2> a(T1 $$0, T2 $$1, frb $$2) {
         return this.a($$0, $$1, Collections.singletonList($$2));
      }

      public fqz a(BiFunction<T1, T2, frb> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }

      public fqz b(BiFunction<T1, T2, List<frb>> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }
   }

   public static class c<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> extends fqz {
      private final ebk<T1> a;
      private final ebk<T2> b;
      private final ebk<T3> c;

      c(ebk<T1> $$0, ebk<T2> $$1, ebk<T3> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public List<ebk<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c);
      }

      public fqz.c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, List<frb> $$3) {
         fra $$4 = fra.a(this.a.c($$0), this.b.c($$1), this.c.c($$2));
         this.a($$4, $$3);
         return this;
      }

      public fqz.c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, frb $$3) {
         return this.a($$0, $$1, $$2, Collections.singletonList($$3));
      }

      public fqz a(fqz.h<T1, T2, T3, frb> $$0) {
         this.a
            .a()
            .forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3)))));
         return this;
      }

      public fqz b(fqz.h<T1, T2, T3, List<frb>> $$0) {
         this.a
            .a()
            .forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3)))));
         return this;
      }
   }

   public static class d<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> extends fqz {
      private final ebk<T1> a;
      private final ebk<T2> b;
      private final ebk<T3> c;
      private final ebk<T4> d;

      d(ebk<T1> $$0, ebk<T2> $$1, ebk<T3> $$2, ebk<T4> $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public List<ebk<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c, this.d);
      }

      public fqz.d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, List<frb> $$4) {
         fra $$5 = fra.a(this.a.c($$0), this.b.c($$1), this.c.c($$2), this.d.c($$3));
         this.a($$5, $$4);
         return this;
      }

      public fqz.d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, frb $$4) {
         return this.a($$0, $$1, $$2, $$3, Collections.singletonList($$4));
      }

      public fqz a(fqz.g<T1, T2, T3, T4, frb> $$0) {
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

      public fqz b(fqz.g<T1, T2, T3, T4, List<frb>> $$0) {
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
      extends fqz {
      private final ebk<T1> a;
      private final ebk<T2> b;
      private final ebk<T3> c;
      private final ebk<T4> d;
      private final ebk<T5> e;

      e(ebk<T1> $$0, ebk<T2> $$1, ebk<T3> $$2, ebk<T4> $$3, ebk<T5> $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public List<ebk<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c, this.d, this.e);
      }

      public fqz.e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, List<frb> $$5) {
         fra $$6 = fra.a(this.a.c($$0), this.b.c($$1), this.c.c($$2), this.d.c($$3), this.e.c($$4));
         this.a($$6, $$5);
         return this;
      }

      public fqz.e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, frb $$5) {
         return this.a($$0, $$1, $$2, $$3, $$4, Collections.singletonList($$5));
      }

      public fqz a(fqz.f<T1, T2, T3, T4, T5, frb> $$0) {
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

      public fqz b(fqz.f<T1, T2, T3, T4, T5, List<frb>> $$0) {
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
