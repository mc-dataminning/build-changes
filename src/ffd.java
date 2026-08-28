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

public final class ffd<T> {
   private static final Logger c = LogUtils.getLogger();
   public static final ffd.e<Boolean> a = new ffd.e<>(ImmutableList.of(Boolean.TRUE, Boolean.FALSE), Codec.BOOL);
   public static final ffd.b<Boolean> b = ($$0, $$1) -> $$1 ? xk.b : xk.c;
   private final ffd.l<T> d;
   final Function<T, xl> e;
   private final ffd.n<T> f;
   private final Codec<T> g;
   private final T h;
   private final Consumer<T> i;
   final xl j;
   T k;

   public static ffd<Boolean> a(String $$0, boolean $$1, Consumer<Boolean> $$2) {
      return a($$0, a(), $$1, $$2);
   }

   public static ffd<Boolean> a(String $$0, boolean $$1) {
      return a($$0, a(), $$1, $$0x -> {
      });
   }

   public static ffd<Boolean> a(String $$0, ffd.l<Boolean> $$1, boolean $$2) {
      return a($$0, $$1, $$2, $$0x -> {
      });
   }

   public static ffd<Boolean> a(String $$0, ffd.l<Boolean> $$1, boolean $$2, Consumer<Boolean> $$3) {
      return a($$0, $$1, b, $$2, $$3);
   }

   public static ffd<Boolean> a(String $$0, ffd.l<Boolean> $$1, ffd.b<Boolean> $$2, boolean $$3, Consumer<Boolean> $$4) {
      return new ffd<>($$0, $$1, $$2, a, $$3, $$4);
   }

   public ffd(String $$0, ffd.l<T> $$1, ffd.b<T> $$2, ffd.n<T> $$3, T $$4, Consumer<T> $$5) {
      this($$0, $$1, $$2, $$3, $$3.f(), $$4, $$5);
   }

   public ffd(String $$0, ffd.l<T> $$1, ffd.b<T> $$2, ffd.n<T> $$3, Codec<T> $$4, T $$5, Consumer<T> $$6) {
      this.j = xl.c($$0);
      this.d = $$1;
      this.e = $$1x -> $$2.toString(this.j, (T)$$1x);
      this.f = $$3;
      this.g = $$4;
      this.h = $$5;
      this.i = $$6;
      this.k = this.h;
   }

   public static <T> ffd.l<T> a() {
      return $$0 -> null;
   }

   public static <T> ffd.l<T> a(xl $$0) {
      return $$1 -> fik.a($$0);
   }

   public static <T extends ayx> ffd.b<T> b() {
      return ($$0, $$1) -> $$1.d();
   }

   public fgx a(ffe $$0) {
      return this.a($$0, 0, 0, 150);
   }

   public fgx a(ffe $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, $$1, $$2, $$3, $$0x -> {
      });
   }

   public fgx a(ffe $$0, int $$1, int $$2, int $$3, Consumer<T> $$4) {
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
      if (!ffa.Q().r()) {
         this.k = $$1;
      } else {
         if (!Objects.equals(this.k, $$1)) {
            this.k = $$1;
            this.i.accept(this.k);
         }
      }
   }

   public ffd.n<T> e() {
      return this.f;
   }

   public static record a<T>(List<T> a, List<T> b, BooleanSupplier c, ffd.d.a<T> d, Codec<T> e) implements ffd.d<T> {
      @Override
      public fhg.c<T> a() {
         return fhg.c.a(this.c, this.a, this.b);
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
      public ffd.d.a<T> e() {
         return this.d;
      }

      @Override
      public Codec<T> f() {
         return this.e;
      }
   }

   public interface b<T> {
      xl toString(xl var1, T var2);
   }

   public static record c(int a, IntSupplier b, int c) implements ffd.g, ffd.j<Integer> {
      public Optional<Integer> a(Integer $$0) {
         return Optional.of(ayu.a($$0, this.d(), this.b()));
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
      public fhg.c<Integer> a() {
         return fhg.c.a(IntStream.range(this.a, this.b() + 1).boxed().toList());
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

   interface d<T> extends ffd.n<T> {
      fhg.c<T> a();

      default ffd.d.a<T> e() {
         return ffd::a;
      }

      @Override
      default Function<ffd<T>, fgx> a(ffd.l<T> $$0, ffe $$1, int $$2, int $$3, int $$4, Consumer<T> $$5) {
         return $$6 -> fhg.a($$6.e).a(this.a()).a($$0).a($$6.k).a($$2, $$3, $$4, 20, $$6.j, ($$3xx, $$4xx) -> {
               this.e().set($$6, (T)$$4xx);
               $$1.av();
               $$5.accept((T)$$4xx);
            });
      }

      public interface a<T> {
         void set(ffd<T> var1, T var2);
      }
   }

   public static record e<T>(List<T> a, Codec<T> b) implements ffd.d<T> {
      @Override
      public Optional<T> a(T $$0) {
         return this.a.contains($$0) ? Optional.of($$0) : Optional.empty();
      }

      @Override
      public fhg.c<T> a() {
         return fhg.c.a(this.a);
      }

      public List<T> b() {
         return this.a;
      }

      @Override
      public Codec<T> f() {
         return this.b;
      }
   }

   public static record f(int a, int b) implements ffd.g {
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
   }

   interface g extends ffd.k<Integer> {
      int d();

      int b();

      default double b(Integer $$0) {
         return (double)ayu.c((float)$$0.intValue(), (float)this.d(), (float)this.b(), 0.0F, 1.0F);
      }

      default Integer a(double $$0) {
         return ayu.a(ayu.b($$0, 0.0, 1.0, (double)this.d(), (double)this.b()));
      }

      default <R> ffd.k<R> a(final IntFunction<? extends R> $$0, final ToIntFunction<? super R> $$1) {
         return new ffd.k<R>() {
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

   public static record h<T>(Supplier<List<T>> a, Function<T, Optional<T>> b, Codec<T> c) implements ffd.d<T> {
      @Override
      public Optional<T> a(T $$0) {
         return this.b.apply($$0);
      }

      @Override
      public fhg.c<T> a() {
         return fhg.c.a(this.a.get());
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

   static final class i<N> extends fgs {
      private final ffd<N> d;
      private final ffd.k<N> e;
      private final ffd.l<N> f;
      private final Consumer<N> m;

      i(ffe $$0, int $$1, int $$2, int $$3, int $$4, ffd<N> $$5, ffd.k<N> $$6, ffd.l<N> $$7, Consumer<N> $$8) {
         super($$0, $$1, $$2, $$3, $$4, $$6.b($$5.c()));
         this.d = $$5;
         this.e = $$6;
         this.f = $$7;
         this.m = $$8;
         this.b();
      }

      @Override
      protected void b() {
         this.b(this.d.e.apply(this.d.c()));
         this.a(this.f.apply(this.e.b(this.c)));
      }

      @Override
      protected void a() {
         this.d.a(this.e.b(this.c));
         this.a.av();
         this.m.accept(this.d.c());
      }
   }

   interface j<T> extends ffd.d<T>, ffd.k<T> {
      boolean c();

      @Override
      default Function<ffd<T>, fgx> a(ffd.l<T> $$0, ffe $$1, int $$2, int $$3, int $$4, Consumer<T> $$5) {
         return this.c() ? ffd.d.super.a($$0, $$1, $$2, $$3, $$4, $$5) : ffd.k.super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   interface k<T> extends ffd.n<T> {
      double b(T var1);

      T b(double var1);

      @Override
      default Function<ffd<T>, fgx> a(ffd.l<T> $$0, ffe $$1, int $$2, int $$3, int $$4, Consumer<T> $$5) {
         return $$6 -> new ffd.i<>($$1, $$2, $$3, $$4, 20, $$6, this, $$0, $$5);
      }
   }

   @FunctionalInterface
   public interface l<T> {
      @Nullable
      fik apply(T var1);
   }

   public static enum m implements ffd.k<Double> {
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

      public <R> ffd.k<R> a(final DoubleFunction<? extends R> $$0, final ToDoubleFunction<? super R> $$1) {
         return new ffd.k<R>() {
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
      Function<ffd<T>, fgx> a(ffd.l<T> var1, ffe var2, int var3, int var4, int var5, Consumer<T> var6);

      Optional<T> a(T var1);

      Codec<T> f();
   }
}
