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

public abstract class fni {
   private final Map<fnj, List<fnk>> a = Maps.newHashMap();

   protected void a(fnj $$0, List<fnk> $$1) {
      List<fnk> $$2 = this.a.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Value " + $$0 + " is already defined");
      }
   }

   Map<fnj, List<fnk>> a() {
      this.c();
      return ImmutableMap.copyOf(this.a);
   }

   private void c() {
      List<dxz<?>> $$0 = this.b();
      Stream<fnj> $$1 = Stream.of(fnj.a());

      for (dxz<?> $$2 : $$0) {
         $$1 = $$1.flatMap($$1x -> $$2.c().map($$1x::a));
      }

      List<fnj> $$3 = $$1.filter($$0x -> !this.a.containsKey($$0x)).collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         throw new IllegalStateException("Missing definition for properties: " + $$3);
      }
   }

   abstract List<dxz<?>> b();

   public static <T1 extends Comparable<T1>> fni.a<T1> a(dxz<T1> $$0) {
      return new fni.a<>($$0);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>> fni.b<T1, T2> a(dxz<T1> $$0, dxz<T2> $$1) {
      return new fni.b<>($$0, $$1);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> fni.c<T1, T2, T3> a(dxz<T1> $$0, dxz<T2> $$1, dxz<T3> $$2) {
      return new fni.c<>($$0, $$1, $$2);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> fni.d<T1, T2, T3, T4> a(
      dxz<T1> $$0, dxz<T2> $$1, dxz<T3> $$2, dxz<T4> $$3
   ) {
      return new fni.d<>($$0, $$1, $$2, $$3);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>> fni.e<T1, T2, T3, T4, T5> a(
      dxz<T1> $$0, dxz<T2> $$1, dxz<T3> $$2, dxz<T4> $$3, dxz<T5> $$4
   ) {
      return new fni.e<>($$0, $$1, $$2, $$3, $$4);
   }

   public static class a<T1 extends Comparable<T1>> extends fni {
      private final dxz<T1> a;

      a(dxz<T1> $$0) {
         this.a = $$0;
      }

      @Override
      public List<dxz<?>> b() {
         return ImmutableList.of(this.a);
      }

      public fni.a<T1> a(T1 $$0, List<fnk> $$1) {
         fnj $$2 = fnj.a(this.a.c($$0));
         this.a($$2, $$1);
         return this;
      }

      public fni.a<T1> a(T1 $$0, fnk $$1) {
         return this.a($$0, Collections.singletonList($$1));
      }

      public fni a(Function<T1, fnk> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }

      public fni b(Function<T1, List<fnk>> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }
   }

   public static class b<T1 extends Comparable<T1>, T2 extends Comparable<T2>> extends fni {
      private final dxz<T1> a;
      private final dxz<T2> b;

      b(dxz<T1> $$0, dxz<T2> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public List<dxz<?>> b() {
         return ImmutableList.of(this.a, this.b);
      }

      public fni.b<T1, T2> a(T1 $$0, T2 $$1, List<fnk> $$2) {
         fnj $$3 = fnj.a(this.a.c($$0), this.b.c($$1));
         this.a($$3, $$2);
         return this;
      }

      public fni.b<T1, T2> a(T1 $$0, T2 $$1, fnk $$2) {
         return this.a($$0, $$1, Collections.singletonList($$2));
      }

      public fni a(BiFunction<T1, T2, fnk> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }

      public fni b(BiFunction<T1, T2, List<fnk>> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }
   }

   public static class c<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> extends fni {
      private final dxz<T1> a;
      private final dxz<T2> b;
      private final dxz<T3> c;

      c(dxz<T1> $$0, dxz<T2> $$1, dxz<T3> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public List<dxz<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c);
      }

      public fni.c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, List<fnk> $$3) {
         fnj $$4 = fnj.a(this.a.c($$0), this.b.c($$1), this.c.c($$2));
         this.a($$4, $$3);
         return this;
      }

      public fni.c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, fnk $$3) {
         return this.a($$0, $$1, $$2, Collections.singletonList($$3));
      }

      public fni a(fni.h<T1, T2, T3, fnk> $$0) {
         this.a
            .a()
            .forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3)))));
         return this;
      }

      public fni b(fni.h<T1, T2, T3, List<fnk>> $$0) {
         this.a
            .a()
            .forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3)))));
         return this;
      }
   }

   public static class d<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> extends fni {
      private final dxz<T1> a;
      private final dxz<T2> b;
      private final dxz<T3> c;
      private final dxz<T4> d;

      d(dxz<T1> $$0, dxz<T2> $$1, dxz<T3> $$2, dxz<T4> $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public List<dxz<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c, this.d);
      }

      public fni.d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, List<fnk> $$4) {
         fnj $$5 = fnj.a(this.a.c($$0), this.b.c($$1), this.c.c($$2), this.d.c($$3));
         this.a($$5, $$4);
         return this;
      }

      public fni.d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, fnk $$4) {
         return this.a($$0, $$1, $$2, $$3, Collections.singletonList($$4));
      }

      public fni a(fni.g<T1, T2, T3, T4, fnk> $$0) {
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

      public fni b(fni.g<T1, T2, T3, T4, List<fnk>> $$0) {
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
      extends fni {
      private final dxz<T1> a;
      private final dxz<T2> b;
      private final dxz<T3> c;
      private final dxz<T4> d;
      private final dxz<T5> e;

      e(dxz<T1> $$0, dxz<T2> $$1, dxz<T3> $$2, dxz<T4> $$3, dxz<T5> $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public List<dxz<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c, this.d, this.e);
      }

      public fni.e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, List<fnk> $$5) {
         fnj $$6 = fnj.a(this.a.c($$0), this.b.c($$1), this.c.c($$2), this.d.c($$3), this.e.c($$4));
         this.a($$6, $$5);
         return this;
      }

      public fni.e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, fnk $$5) {
         return this.a($$0, $$1, $$2, $$3, $$4, Collections.singletonList($$5));
      }

      public fni a(fni.f<T1, T2, T3, T4, T5, fnk> $$0) {
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

      public fni b(fni.f<T1, T2, T3, T4, T5, List<fnk>> $$0) {
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
