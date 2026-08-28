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

public abstract class fqg {
   private final Map<fqh, List<fqi>> a = Maps.newHashMap();

   protected void a(fqh $$0, List<fqi> $$1) {
      List<fqi> $$2 = this.a.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Value " + $$0 + " is already defined");
      }
   }

   Map<fqh, List<fqi>> a() {
      this.c();
      return ImmutableMap.copyOf(this.a);
   }

   private void c() {
      List<ear<?>> $$0 = this.b();
      Stream<fqh> $$1 = Stream.of(fqh.a());

      for (ear<?> $$2 : $$0) {
         $$1 = $$1.flatMap($$1x -> $$2.c().map($$1x::a));
      }

      List<fqh> $$3 = $$1.filter($$0x -> !this.a.containsKey($$0x)).collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         throw new IllegalStateException("Missing definition for properties: " + $$3);
      }
   }

   abstract List<ear<?>> b();

   public static <T1 extends Comparable<T1>> fqg.a<T1> a(ear<T1> $$0) {
      return new fqg.a<>($$0);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>> fqg.b<T1, T2> a(ear<T1> $$0, ear<T2> $$1) {
      return new fqg.b<>($$0, $$1);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> fqg.c<T1, T2, T3> a(ear<T1> $$0, ear<T2> $$1, ear<T3> $$2) {
      return new fqg.c<>($$0, $$1, $$2);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> fqg.d<T1, T2, T3, T4> a(
      ear<T1> $$0, ear<T2> $$1, ear<T3> $$2, ear<T4> $$3
   ) {
      return new fqg.d<>($$0, $$1, $$2, $$3);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>> fqg.e<T1, T2, T3, T4, T5> a(
      ear<T1> $$0, ear<T2> $$1, ear<T3> $$2, ear<T4> $$3, ear<T5> $$4
   ) {
      return new fqg.e<>($$0, $$1, $$2, $$3, $$4);
   }

   public static class a<T1 extends Comparable<T1>> extends fqg {
      private final ear<T1> a;

      a(ear<T1> $$0) {
         this.a = $$0;
      }

      @Override
      public List<ear<?>> b() {
         return ImmutableList.of(this.a);
      }

      public fqg.a<T1> a(T1 $$0, List<fqi> $$1) {
         fqh $$2 = fqh.a(this.a.c($$0));
         this.a($$2, $$1);
         return this;
      }

      public fqg.a<T1> a(T1 $$0, fqi $$1) {
         return this.a($$0, Collections.singletonList($$1));
      }

      public fqg a(Function<T1, fqi> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }

      public fqg b(Function<T1, List<fqi>> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }
   }

   public static class b<T1 extends Comparable<T1>, T2 extends Comparable<T2>> extends fqg {
      private final ear<T1> a;
      private final ear<T2> b;

      b(ear<T1> $$0, ear<T2> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public List<ear<?>> b() {
         return ImmutableList.of(this.a, this.b);
      }

      public fqg.b<T1, T2> a(T1 $$0, T2 $$1, List<fqi> $$2) {
         fqh $$3 = fqh.a(this.a.c($$0), this.b.c($$1));
         this.a($$3, $$2);
         return this;
      }

      public fqg.b<T1, T2> a(T1 $$0, T2 $$1, fqi $$2) {
         return this.a($$0, $$1, Collections.singletonList($$2));
      }

      public fqg a(BiFunction<T1, T2, fqi> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }

      public fqg b(BiFunction<T1, T2, List<fqi>> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }
   }

   public static class c<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> extends fqg {
      private final ear<T1> a;
      private final ear<T2> b;
      private final ear<T3> c;

      c(ear<T1> $$0, ear<T2> $$1, ear<T3> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public List<ear<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c);
      }

      public fqg.c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, List<fqi> $$3) {
         fqh $$4 = fqh.a(this.a.c($$0), this.b.c($$1), this.c.c($$2));
         this.a($$4, $$3);
         return this;
      }

      public fqg.c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, fqi $$3) {
         return this.a($$0, $$1, $$2, Collections.singletonList($$3));
      }

      public fqg a(fqg.h<T1, T2, T3, fqi> $$0) {
         this.a
            .a()
            .forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3)))));
         return this;
      }

      public fqg b(fqg.h<T1, T2, T3, List<fqi>> $$0) {
         this.a
            .a()
            .forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3)))));
         return this;
      }
   }

   public static class d<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> extends fqg {
      private final ear<T1> a;
      private final ear<T2> b;
      private final ear<T3> c;
      private final ear<T4> d;

      d(ear<T1> $$0, ear<T2> $$1, ear<T3> $$2, ear<T4> $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public List<ear<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c, this.d);
      }

      public fqg.d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, List<fqi> $$4) {
         fqh $$5 = fqh.a(this.a.c($$0), this.b.c($$1), this.c.c($$2), this.d.c($$3));
         this.a($$5, $$4);
         return this;
      }

      public fqg.d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, fqi $$4) {
         return this.a($$0, $$1, $$2, $$3, Collections.singletonList($$4));
      }

      public fqg a(fqg.g<T1, T2, T3, T4, fqi> $$0) {
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

      public fqg b(fqg.g<T1, T2, T3, T4, List<fqi>> $$0) {
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
      extends fqg {
      private final ear<T1> a;
      private final ear<T2> b;
      private final ear<T3> c;
      private final ear<T4> d;
      private final ear<T5> e;

      e(ear<T1> $$0, ear<T2> $$1, ear<T3> $$2, ear<T4> $$3, ear<T5> $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public List<ear<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c, this.d, this.e);
      }

      public fqg.e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, List<fqi> $$5) {
         fqh $$6 = fqh.a(this.a.c($$0), this.b.c($$1), this.c.c($$2), this.d.c($$3), this.e.c($$4));
         this.a($$6, $$5);
         return this;
      }

      public fqg.e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, fqi $$5) {
         return this.a($$0, $$1, $$2, $$3, $$4, Collections.singletonList($$5));
      }

      public fqg a(fqg.f<T1, T2, T3, T4, T5, fqi> $$0) {
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

      public fqg b(fqg.f<T1, T2, T3, T4, T5, List<fqi>> $$0) {
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
