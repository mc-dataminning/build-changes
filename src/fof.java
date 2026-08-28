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

public abstract class fof {
   private final Map<fog, List<foh>> a = Maps.newHashMap();

   protected void a(fog $$0, List<foh> $$1) {
      List<foh> $$2 = this.a.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Value " + $$0 + " is already defined");
      }
   }

   Map<fog, List<foh>> a() {
      this.c();
      return ImmutableMap.copyOf(this.a);
   }

   private void c() {
      List<dyt<?>> $$0 = this.b();
      Stream<fog> $$1 = Stream.of(fog.a());

      for (dyt<?> $$2 : $$0) {
         $$1 = $$1.flatMap($$1x -> $$2.c().map($$1x::a));
      }

      List<fog> $$3 = $$1.filter($$0x -> !this.a.containsKey($$0x)).collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         throw new IllegalStateException("Missing definition for properties: " + $$3);
      }
   }

   abstract List<dyt<?>> b();

   public static <T1 extends Comparable<T1>> fof.a<T1> a(dyt<T1> $$0) {
      return new fof.a<>($$0);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>> fof.b<T1, T2> a(dyt<T1> $$0, dyt<T2> $$1) {
      return new fof.b<>($$0, $$1);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> fof.c<T1, T2, T3> a(dyt<T1> $$0, dyt<T2> $$1, dyt<T3> $$2) {
      return new fof.c<>($$0, $$1, $$2);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> fof.d<T1, T2, T3, T4> a(
      dyt<T1> $$0, dyt<T2> $$1, dyt<T3> $$2, dyt<T4> $$3
   ) {
      return new fof.d<>($$0, $$1, $$2, $$3);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>> fof.e<T1, T2, T3, T4, T5> a(
      dyt<T1> $$0, dyt<T2> $$1, dyt<T3> $$2, dyt<T4> $$3, dyt<T5> $$4
   ) {
      return new fof.e<>($$0, $$1, $$2, $$3, $$4);
   }

   public static class a<T1 extends Comparable<T1>> extends fof {
      private final dyt<T1> a;

      a(dyt<T1> $$0) {
         this.a = $$0;
      }

      @Override
      public List<dyt<?>> b() {
         return ImmutableList.of(this.a);
      }

      public fof.a<T1> a(T1 $$0, List<foh> $$1) {
         fog $$2 = fog.a(this.a.c($$0));
         this.a($$2, $$1);
         return this;
      }

      public fof.a<T1> a(T1 $$0, foh $$1) {
         return this.a($$0, Collections.singletonList($$1));
      }

      public fof a(Function<T1, foh> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }

      public fof b(Function<T1, List<foh>> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }
   }

   public static class b<T1 extends Comparable<T1>, T2 extends Comparable<T2>> extends fof {
      private final dyt<T1> a;
      private final dyt<T2> b;

      b(dyt<T1> $$0, dyt<T2> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public List<dyt<?>> b() {
         return ImmutableList.of(this.a, this.b);
      }

      public fof.b<T1, T2> a(T1 $$0, T2 $$1, List<foh> $$2) {
         fog $$3 = fog.a(this.a.c($$0), this.b.c($$1));
         this.a($$3, $$2);
         return this;
      }

      public fof.b<T1, T2> a(T1 $$0, T2 $$1, foh $$2) {
         return this.a($$0, $$1, Collections.singletonList($$2));
      }

      public fof a(BiFunction<T1, T2, foh> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }

      public fof b(BiFunction<T1, T2, List<foh>> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }
   }

   public static class c<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> extends fof {
      private final dyt<T1> a;
      private final dyt<T2> b;
      private final dyt<T3> c;

      c(dyt<T1> $$0, dyt<T2> $$1, dyt<T3> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public List<dyt<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c);
      }

      public fof.c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, List<foh> $$3) {
         fog $$4 = fog.a(this.a.c($$0), this.b.c($$1), this.c.c($$2));
         this.a($$4, $$3);
         return this;
      }

      public fof.c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, foh $$3) {
         return this.a($$0, $$1, $$2, Collections.singletonList($$3));
      }

      public fof a(fof.h<T1, T2, T3, foh> $$0) {
         this.a
            .a()
            .forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3)))));
         return this;
      }

      public fof b(fof.h<T1, T2, T3, List<foh>> $$0) {
         this.a
            .a()
            .forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3)))));
         return this;
      }
   }

   public static class d<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> extends fof {
      private final dyt<T1> a;
      private final dyt<T2> b;
      private final dyt<T3> c;
      private final dyt<T4> d;

      d(dyt<T1> $$0, dyt<T2> $$1, dyt<T3> $$2, dyt<T4> $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public List<dyt<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c, this.d);
      }

      public fof.d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, List<foh> $$4) {
         fog $$5 = fog.a(this.a.c($$0), this.b.c($$1), this.c.c($$2), this.d.c($$3));
         this.a($$5, $$4);
         return this;
      }

      public fof.d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, foh $$4) {
         return this.a($$0, $$1, $$2, $$3, Collections.singletonList($$4));
      }

      public fof a(fof.g<T1, T2, T3, T4, foh> $$0) {
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

      public fof b(fof.g<T1, T2, T3, T4, List<foh>> $$0) {
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
      extends fof {
      private final dyt<T1> a;
      private final dyt<T2> b;
      private final dyt<T3> c;
      private final dyt<T4> d;
      private final dyt<T5> e;

      e(dyt<T1> $$0, dyt<T2> $$1, dyt<T3> $$2, dyt<T4> $$3, dyt<T5> $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public List<dyt<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c, this.d, this.e);
      }

      public fof.e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, List<foh> $$5) {
         fog $$6 = fog.a(this.a.c($$0), this.b.c($$1), this.c.c($$2), this.d.c($$3), this.e.c($$4));
         this.a($$6, $$5);
         return this;
      }

      public fof.e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, foh $$5) {
         return this.a($$0, $$1, $$2, $$3, $$4, Collections.singletonList($$5));
      }

      public fof a(fof.f<T1, T2, T3, T4, T5, foh> $$0) {
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

      public fof b(fof.f<T1, T2, T3, T4, T5, List<foh>> $$0) {
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
