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

public abstract class fqs {
   private final Map<fqt, List<fqu>> a = Maps.newHashMap();

   protected void a(fqt $$0, List<fqu> $$1) {
      List<fqu> $$2 = this.a.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Value " + $$0 + " is already defined");
      }
   }

   Map<fqt, List<fqu>> a() {
      this.c();
      return ImmutableMap.copyOf(this.a);
   }

   private void c() {
      List<ebc<?>> $$0 = this.b();
      Stream<fqt> $$1 = Stream.of(fqt.a());

      for (ebc<?> $$2 : $$0) {
         $$1 = $$1.flatMap($$1x -> $$2.c().map($$1x::a));
      }

      List<fqt> $$3 = $$1.filter($$0x -> !this.a.containsKey($$0x)).collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         throw new IllegalStateException("Missing definition for properties: " + $$3);
      }
   }

   abstract List<ebc<?>> b();

   public static <T1 extends Comparable<T1>> fqs.a<T1> a(ebc<T1> $$0) {
      return new fqs.a<>($$0);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>> fqs.b<T1, T2> a(ebc<T1> $$0, ebc<T2> $$1) {
      return new fqs.b<>($$0, $$1);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> fqs.c<T1, T2, T3> a(ebc<T1> $$0, ebc<T2> $$1, ebc<T3> $$2) {
      return new fqs.c<>($$0, $$1, $$2);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> fqs.d<T1, T2, T3, T4> a(
      ebc<T1> $$0, ebc<T2> $$1, ebc<T3> $$2, ebc<T4> $$3
   ) {
      return new fqs.d<>($$0, $$1, $$2, $$3);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>> fqs.e<T1, T2, T3, T4, T5> a(
      ebc<T1> $$0, ebc<T2> $$1, ebc<T3> $$2, ebc<T4> $$3, ebc<T5> $$4
   ) {
      return new fqs.e<>($$0, $$1, $$2, $$3, $$4);
   }

   public static class a<T1 extends Comparable<T1>> extends fqs {
      private final ebc<T1> a;

      a(ebc<T1> $$0) {
         this.a = $$0;
      }

      @Override
      public List<ebc<?>> b() {
         return ImmutableList.of(this.a);
      }

      public fqs.a<T1> a(T1 $$0, List<fqu> $$1) {
         fqt $$2 = fqt.a(this.a.c($$0));
         this.a($$2, $$1);
         return this;
      }

      public fqs.a<T1> a(T1 $$0, fqu $$1) {
         return this.a($$0, Collections.singletonList($$1));
      }

      public fqs a(Function<T1, fqu> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }

      public fqs b(Function<T1, List<fqu>> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }
   }

   public static class b<T1 extends Comparable<T1>, T2 extends Comparable<T2>> extends fqs {
      private final ebc<T1> a;
      private final ebc<T2> b;

      b(ebc<T1> $$0, ebc<T2> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public List<ebc<?>> b() {
         return ImmutableList.of(this.a, this.b);
      }

      public fqs.b<T1, T2> a(T1 $$0, T2 $$1, List<fqu> $$2) {
         fqt $$3 = fqt.a(this.a.c($$0), this.b.c($$1));
         this.a($$3, $$2);
         return this;
      }

      public fqs.b<T1, T2> a(T1 $$0, T2 $$1, fqu $$2) {
         return this.a($$0, $$1, Collections.singletonList($$2));
      }

      public fqs a(BiFunction<T1, T2, fqu> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }

      public fqs b(BiFunction<T1, T2, List<fqu>> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }
   }

   public static class c<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> extends fqs {
      private final ebc<T1> a;
      private final ebc<T2> b;
      private final ebc<T3> c;

      c(ebc<T1> $$0, ebc<T2> $$1, ebc<T3> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public List<ebc<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c);
      }

      public fqs.c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, List<fqu> $$3) {
         fqt $$4 = fqt.a(this.a.c($$0), this.b.c($$1), this.c.c($$2));
         this.a($$4, $$3);
         return this;
      }

      public fqs.c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, fqu $$3) {
         return this.a($$0, $$1, $$2, Collections.singletonList($$3));
      }

      public fqs a(fqs.h<T1, T2, T3, fqu> $$0) {
         this.a
            .a()
            .forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3)))));
         return this;
      }

      public fqs b(fqs.h<T1, T2, T3, List<fqu>> $$0) {
         this.a
            .a()
            .forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3)))));
         return this;
      }
   }

   public static class d<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> extends fqs {
      private final ebc<T1> a;
      private final ebc<T2> b;
      private final ebc<T3> c;
      private final ebc<T4> d;

      d(ebc<T1> $$0, ebc<T2> $$1, ebc<T3> $$2, ebc<T4> $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public List<ebc<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c, this.d);
      }

      public fqs.d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, List<fqu> $$4) {
         fqt $$5 = fqt.a(this.a.c($$0), this.b.c($$1), this.c.c($$2), this.d.c($$3));
         this.a($$5, $$4);
         return this;
      }

      public fqs.d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, fqu $$4) {
         return this.a($$0, $$1, $$2, $$3, Collections.singletonList($$4));
      }

      public fqs a(fqs.g<T1, T2, T3, T4, fqu> $$0) {
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

      public fqs b(fqs.g<T1, T2, T3, T4, List<fqu>> $$0) {
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
      extends fqs {
      private final ebc<T1> a;
      private final ebc<T2> b;
      private final ebc<T3> c;
      private final ebc<T4> d;
      private final ebc<T5> e;

      e(ebc<T1> $$0, ebc<T2> $$1, ebc<T3> $$2, ebc<T4> $$3, ebc<T5> $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public List<ebc<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c, this.d, this.e);
      }

      public fqs.e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, List<fqu> $$5) {
         fqt $$6 = fqt.a(this.a.c($$0), this.b.c($$1), this.c.c($$2), this.d.c($$3), this.e.c($$4));
         this.a($$6, $$5);
         return this;
      }

      public fqs.e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, fqu $$5) {
         return this.a($$0, $$1, $$2, $$3, $$4, Collections.singletonList($$5));
      }

      public fqs a(fqs.f<T1, T2, T3, T4, T5, fqu> $$0) {
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

      public fqs b(fqs.f<T1, T2, T3, T4, T5, List<fqu>> $$0) {
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
