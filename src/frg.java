import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntSupplier;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.stream.IntStream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class frg<T> {
   private static final Logger c = LogUtils.getLogger();
   public static final frg.e<Boolean> a = new frg.e<>(ImmutableList.of(Boolean.TRUE, Boolean.FALSE), Codec.BOOL);
   public static final frg.b<Boolean> b = ($$0, $$1) -> $$1 ? wz.b : wz.c;
   private final frg.l<T> d;
   final Function<T, xa> e;
   private final frg.n<T> f;
   private final Codec<T> g;
   private final T h;
   private final Consumer<T> i;
   final xa j;
   T k;

   public static frg<Boolean> a(String $$0, boolean $$1, Consumer<Boolean> $$2) {
      return a($$0, a(), $$1, $$2);
   }

   public static frg<Boolean> a(String $$0, boolean $$1) {
      return a($$0, a(), $$1, $$0x -> {
      });
   }

   public static frg<Boolean> a(String $$0, frg.l<Boolean> $$1, boolean $$2) {
      return a($$0, $$1, $$2, $$0x -> {
      });
   }

   public static frg<Boolean> a(String $$0, frg.l<Boolean> $$1, boolean $$2, Consumer<Boolean> $$3) {
      return a($$0, $$1, b, $$2, $$3);
   }

   public static frg<Boolean> a(String $$0, frg.l<Boolean> $$1, frg.b<Boolean> $$2, boolean $$3, Consumer<Boolean> $$4) {
      return new frg<>($$0, $$1, $$2, a, $$3, $$4);
   }

   public frg(String $$0, frg.l<T> $$1, frg.b<T> $$2, frg.n<T> $$3, T $$4, Consumer<T> $$5) {
      this($$0, $$1, $$2, $$3, $$3.f(), $$4, $$5);
   }

   public frg(String $$0, frg.l<T> $$1, frg.b<T> $$2, frg.n<T> $$3, Codec<T> $$4, T $$5, Consumer<T> $$6) {
      this.j = xa.c($$0);
      this.d = $$1;
      this.e = $$1x -> $$2.toString(this.j, (T)$$1x);
      this.f = $$3;
      this.g = $$4;
      this.h = $$5;
      this.i = $$6;
      this.k = this.h;
   }

   public static <T> frg.l<T> a() {
      return $$0 -> null;
   }

   public static <T> frg.l<T> a(xa $$0) {
      return $$1 -> fvw.a($$0);
   }

   public static <T extends azr> frg.b<T> b() {
      return ($$0, $$1) -> $$1.d();
   }

   public fuj a(frh $$0) {
      return this.a($$0, 0, 0, 150);
   }

   public fuj a(frh $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, $$1, $$2, $$3, $$0x -> {
      });
   }

   public fuj a(frh $$0, int $$1, int $$2, int $$3, Consumer<T> $$4) {
      return this.f.a(this.d, $$0, $$1, $$2, $$3, $$4).apply(this);
   }

   public T c() {
      return this.k;
   }

   public Codec<T> d() {
      return this.g;
   }

   @Override
   public String toString() {
      return this.j.getString();
   }

   public void a(T $$0) {
      T $$1 = this.f.a($$0).orElseGet(() -> {
         c.error("Illegal option value " + $$0 + " for " + this.j);
         return this.h;
      });
      if (!frd.Q().r()) {
         this.k = $$1;
      } else {
         if (!Objects.equals(this.k, $$1)) {
            this.k = $$1;
            this.i.accept(this.k);
         }
      }
   }

   public frg.n<T> e() {
      return this.f;
   }

   public static record a<T>(List<T> a, List<T> b, BooleanSupplier c, frg.d.a<T> d, Codec<T> e) implements frg.d<T> {
      @Override
      public fus.c<T> a() {
         return fus.c.a(this.c, this.a, this.b);
      }

      @Override
      public Optional<T> a(T $$0) {
         return (this.c.getAsBoolean() ? this.b : this.a).contains($$0) ? Optional.of($$0) : Optional.empty();
      }

      public List<T> b() {
         return this.a;
      }

      public List<T> c() {
         return this.b;
      }

      public BooleanSupplier d() {
         return this.c;
      }

      @Override
      public frg.d.a<T> e() {
         return this.d;
      }

      @Override
      public Codec<T> f() {
         return this.e;
      }
   }

   public interface b<T> {
      xa toString(xa var1, T var2);
   }

   public static record c(int a, IntSupplier b, int c) implements frg.g, frg.j<Integer> {
      public Optional<Integer> a(Integer $$0) {
         return Optional.of(azo.a($$0, this.d(), this.b()));
      }

      @Override
      public int b() {
         return this.b.getAsInt();
      }

      @Override
      public Codec<Integer> f() {
         return Codec.INT
            .validate(
               $$0 -> {
                  int $$1 = this.c + 1;
                  return $$0.compareTo(this.a) >= 0 && $$0.compareTo($$1) <= 0
                     ? DataResult.success($$0)
                     : DataResult.error(() -> "Value " + $$0 + " outside of range [" + this.a + ":" + $$1 + "]", $$0);
               }
            );
      }

      @Override
      public boolean c() {
         return true;
      }

      @Override
      public fus.c<Integer> a() {
         return fus.c.a(IntStream.range(this.a, this.b() + 1).boxed().toList());
      }

      @Override
      public int d() {
         return this.a;
      }

      public IntSupplier g() {
         return this.b;
      }

      public int h() {
         return this.c;
      }
   }

   interface d<T> extends frg.n<T> {
      fus.c<T> a();

      default frg.d.a<T> e() {
         return frg::a;
      }

      @Override
      default Function<frg<T>, fuj> a(frg.l<T> $$0, frh $$1, int $$2, int $$3, int $$4, Consumer<T> $$5) {
         return $$6 -> fus.a($$6.e).a(this.a()).a($$0).a($$6.k).a($$2, $$3, $$4, 20, $$6.j, ($$3xx, $$4xx) -> {
               this.e().set($$6, (T)$$4xx);
               $$1.az();
               $$5.accept((T)$$4xx);
            });
      }

      public interface a<T> {
         void set(frg<T> var1, T var2);
      }
   }

   public static record e<T>(List<T> a, Codec<T> b) implements frg.d<T> {
      @Override
      public Optional<T> a(T $$0) {
         return this.a.contains($$0) ? Optional.of($$0) : Optional.empty();
      }

      @Override
      public fus.c<T> a() {
         return fus.c.a(this.a);
      }

      public List<T> b() {
         return this.a;
      }

      @Override
      public Codec<T> f() {
         return this.b;
      }
   }

   public static record f(int a, int b, boolean c) implements frg.g {
      public f(int $$0, int $$1) {
         this($$0, $$1, true);
      }

      public Optional<Integer> a(Integer $$0) {
         return $$0.compareTo(this.d()) >= 0 && $$0.compareTo(this.b()) <= 0 ? Optional.of($$0) : Optional.empty();
      }

      @Override
      public Codec<Integer> f() {
         return Codec.intRange(this.a, this.b + 1);
      }

      @Override
      public int d() {
         return this.a;
      }

      @Override
      public boolean aQ_() {
         return this.c;
      }
   }

   interface g extends frg.k<Integer> {
      int d();

      int b();

      default double b(Integer $$0) {
         if ($$0 == this.d()) {
            return 0.0;
         } else {
            return $$0 == this.b() ? 1.0 : azo.b((double)$$0.intValue() + 0.5, (double)this.d(), (double)this.b() + 1.0, 0.0, 1.0);
         }
      }

      default Integer a(double $$0) {
         if ($$0 >= 1.0) {
            $$0 = 0.99999F;
         }

         return azo.a(azo.b($$0, 0.0, 1.0, (double)this.d(), (double)this.b() + 1.0));
      }

      default <R> frg.k<R> a(final IntFunction<? extends R> $$0, final ToIntFunction<? super R> $$1) {
         return new frg.k<R>() {
            @Override
            public Optional<R> a(R $$0x) {
               return g.this.a(Integer.valueOf($$1.applyAsInt($$0))).map($$0::apply);
            }

            @Override
            public double b(R $$0x) {
               return g.this.b($$1.applyAsInt($$0));
            }

            @Override
            public R b(double $$0x) {
               return (R)$$0.apply(g.this.a($$0));
            }

            @Override
            public Codec<R> f() {
               return g.this.f().xmap($$0::apply, $$1::applyAsInt);
            }
         };
      }
   }

   public static record h<T>(Supplier<List<T>> a, Function<T, Optional<T>> b, Codec<T> c) implements frg.d<T> {
      @Override
      public Optional<T> a(T $$0) {
         return this.b.apply($$0);
      }

      @Override
      public fus.c<T> a() {
         return fus.c.a(this.a.get());
      }

      public Supplier<List<T>> b() {
         return this.a;
      }

      public Function<T, Optional<T>> c() {
         return this.b;
      }

      @Override
      public Codec<T> f() {
         return this.c;
      }
   }

   public static final class i<N> extends fud {
      private final frg<N> d;
      private final frg.k<N> e;
      private final frg.l<N> f;
      private final Consumer<N> m;
      @Nullable
      private Long n;
      private final boolean o;

      i(frh $$0, int $$1, int $$2, int $$3, int $$4, frg<N> $$5, frg.k<N> $$6, frg.l<N> $$7, Consumer<N> $$8, boolean $$9) {
         super($$0, $$1, $$2, $$3, $$4, $$6.b($$5.c()));
         this.d = $$5;
         this.e = $$6;
         this.f = $$7;
         this.m = $$8;
         this.o = $$9;
         this.b();
      }

      @Override
      protected void b() {
         this.b(this.d.e.apply(this.e.b(this.c)));
         this.a(this.f.apply(this.e.b(this.c)));
      }

      @Override
      protected void a() {
         if (this.o) {
            this.c();
         } else {
            this.n = ag.c() + 600L;
         }
      }

      public void c() {
         N $$0 = this.e.b(this.c);
         if (!Objects.equals($$0, this.d.c())) {
            this.d.a($$0);
            this.m.accept(this.d.c());
         }
      }

      @Override
      public void b(ftx $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         if (this.n != null && ag.c() >= this.n) {
            this.n = null;
            this.c();
         }
      }
   }

   interface j<T> extends frg.d<T>, frg.k<T> {
      boolean c();

      @Override
      default Function<frg<T>, fuj> a(frg.l<T> $$0, frh $$1, int $$2, int $$3, int $$4, Consumer<T> $$5) {
         return this.c() ? frg.d.super.a($$0, $$1, $$2, $$3, $$4, $$5) : frg.k.super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   interface k<T> extends frg.n<T> {
      double b(T var1);

      T b(double var1);

      default boolean aQ_() {
         return true;
      }

      @Override
      default Function<frg<T>, fuj> a(frg.l<T> $$0, frh $$1, int $$2, int $$3, int $$4, Consumer<T> $$5) {
         return $$6 -> new frg.i<>($$1, $$2, $$3, $$4, 20, $$6, this, $$0, $$5, this.aQ_());
      }
   }

   @FunctionalInterface
   public interface l<T> {
      @Nullable
      fvw apply(T var1);
   }

   public static enum m implements frg.k<Double> {
      a;

      public Optional<Double> a(Double $$0) {
         return $$0 >= 0.0 && $$0 <= 1.0 ? Optional.of($$0) : Optional.empty();
      }

      public double b(Double $$0) {
         return $$0;
      }

      public Double a(double $$0) {
         return $$0;
      }

      public <R> frg.k<R> a(final DoubleFunction<? extends R> $$0, final ToDoubleFunction<? super R> $$1) {
         return new frg.k<R>() {
            @Override
            public Optional<R> a(R $$0x) {
               return m.this.a(Double.valueOf($$1.applyAsDouble($$0))).map($$0::apply);
            }

            @Override
            public double b(R $$0x) {
               return m.this.b(Double.valueOf($$1.applyAsDouble($$0)));
            }

            @Override
            public R b(double $$0x) {
               return (R)$$0.apply(m.this.a($$0));
            }

            @Override
            public Codec<R> f() {
               return m.this.f().xmap($$0::apply, $$1::applyAsDouble);
            }
         };
      }

      @Override
      public Codec<Double> f() {
         return Codec.withAlternative(Codec.doubleRange(0.0, 1.0), Codec.BOOL, $$0 -> $$0 ? 1.0 : 0.0);
      }
   }

   interface n<T> {
      Function<frg<T>, fuj> a(frg.l<T> var1, frh var2, int var3, int var4, int var5, Consumer<T> var6);

      Optional<T> a(T var1);

      Codec<T> f();
   }
}
