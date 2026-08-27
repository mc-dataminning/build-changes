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

public final class fgm<T> {
   private static final Logger c = LogUtils.getLogger();
   public static final fgm.e<Boolean> a = new fgm.e<>(ImmutableList.of(Boolean.TRUE, Boolean.FALSE), Codec.BOOL);
   public static final fgm.b<Boolean> b = ($$0, $$1) -> $$1 ? xd.b : xd.c;
   private final fgm.l<T> d;
   final Function<T, xe> e;
   private final fgm.n<T> f;
   private final Codec<T> g;
   private final T h;
   private final Consumer<T> i;
   final xe j;
   T k;

   public static fgm<Boolean> a(String $$0, boolean $$1, Consumer<Boolean> $$2) {
      return a($$0, a(), $$1, $$2);
   }

   public static fgm<Boolean> a(String $$0, boolean $$1) {
      return a($$0, a(), $$1, $$0x -> {
      });
   }

   public static fgm<Boolean> a(String $$0, fgm.l<Boolean> $$1, boolean $$2) {
      return a($$0, $$1, $$2, $$0x -> {
      });
   }

   public static fgm<Boolean> a(String $$0, fgm.l<Boolean> $$1, boolean $$2, Consumer<Boolean> $$3) {
      return a($$0, $$1, b, $$2, $$3);
   }

   public static fgm<Boolean> a(String $$0, fgm.l<Boolean> $$1, fgm.b<Boolean> $$2, boolean $$3, Consumer<Boolean> $$4) {
      return new fgm<>($$0, $$1, $$2, a, $$3, $$4);
   }

   public fgm(String $$0, fgm.l<T> $$1, fgm.b<T> $$2, fgm.n<T> $$3, T $$4, Consumer<T> $$5) {
      this($$0, $$1, $$2, $$3, $$3.f(), $$4, $$5);
   }

   public fgm(String $$0, fgm.l<T> $$1, fgm.b<T> $$2, fgm.n<T> $$3, Codec<T> $$4, T $$5, Consumer<T> $$6) {
      this.j = xe.c($$0);
      this.d = $$1;
      this.e = $$1x -> $$2.toString(this.j, (T)$$1x);
      this.f = $$3;
      this.g = $$4;
      this.h = $$5;
      this.i = $$6;
      this.k = this.h;
   }

   public static <T> fgm.l<T> a() {
      return $$0 -> null;
   }

   public static <T> fgm.l<T> a(xe $$0) {
      return $$1 -> fjy.a($$0);
   }

   public static <T extends ayo> fgm.b<T> b() {
      return ($$0, $$1) -> $$1.d();
   }

   public fil a(fgn $$0) {
      return this.a($$0, 0, 0, 150);
   }

   public fil a(fgn $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, $$1, $$2, $$3, $$0x -> {
      });
   }

   public fil a(fgn $$0, int $$1, int $$2, int $$3, Consumer<T> $$4) {
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
      if (!fgj.Q().r()) {
         this.k = $$1;
      } else {
         if (!Objects.equals(this.k, $$1)) {
            this.k = $$1;
            this.i.accept(this.k);
         }
      }
   }

   public fgm.n<T> e() {
      return this.f;
   }

   public static record a<T>(List<T> a, List<T> b, BooleanSupplier c, fgm.d.a<T> d, Codec<T> e) implements fgm.d<T> {
      @Override
      public fiu.c<T> a() {
         return fiu.c.a(this.c, this.a, this.b);
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
      public fgm.d.a<T> e() {
         return this.d;
      }

      @Override
      public Codec<T> f() {
         return this.e;
      }
   }

   public interface b<T> {
      xe toString(xe var1, T var2);
   }

   public static record c(int a, IntSupplier b, int c) implements fgm.g, fgm.j<Integer> {
      public Optional<Integer> a(Integer $$0) {
         return Optional.of(aym.a($$0, this.d(), this.b()));
      }

      @Override
      public int b() {
         return this.b.getAsInt();
      }

      @Override
      public Codec<Integer> f() {
         return axu.b(
            Codec.INT,
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
      public fiu.c<Integer> a() {
         return fiu.c.a(IntStream.range(this.a, this.b() + 1).boxed().toList());
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

   interface d<T> extends fgm.n<T> {
      fiu.c<T> a();

      default fgm.d.a<T> e() {
         return fgm::a;
      }

      @Override
      default Function<fgm<T>, fil> a(fgm.l<T> $$0, fgn $$1, int $$2, int $$3, int $$4, Consumer<T> $$5) {
         return $$6 -> fiu.a($$6.e).a(this.a()).a($$0).a($$6.k).a($$2, $$3, $$4, 20, $$6.j, ($$3xx, $$4xx) -> {
               this.e().set($$6, (T)$$4xx);
               $$1.av();
               $$5.accept((T)$$4xx);
            });
      }

      public interface a<T> {
         void set(fgm<T> var1, T var2);
      }
   }

   public static record e<T>(List<T> a, Codec<T> b) implements fgm.d<T> {
      @Override
      public Optional<T> a(T $$0) {
         return this.a.contains($$0) ? Optional.of($$0) : Optional.empty();
      }

      @Override
      public fiu.c<T> a() {
         return fiu.c.a(this.a);
      }

      public List<T> b() {
         return this.a;
      }

      @Override
      public Codec<T> f() {
         return this.b;
      }
   }

   public static record f(int a, int b) implements fgm.g {
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

   interface g extends fgm.k<Integer> {
      int d();

      int b();

      default double b(Integer $$0) {
         return (double)aym.c((float)$$0.intValue(), (float)this.d(), (float)this.b(), 0.0F, 1.0F);
      }

      default Integer a(double $$0) {
         return aym.a(aym.b($$0, 0.0, 1.0, (double)this.d(), (double)this.b()));
      }

      default <R> fgm.k<R> a(final IntFunction<? extends R> $$0, final ToIntFunction<? super R> $$1) {
         return new fgm.k<R>() {
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

   public static record h<T>(Supplier<List<T>> a, Function<T, Optional<T>> b, Codec<T> c) implements fgm.d<T> {
      @Override
      public Optional<T> a(T $$0) {
         return this.b.apply($$0);
      }

      @Override
      public fiu.c<T> a() {
         return fiu.c.a(this.a.get());
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

   static final class i<N> extends fig {
      private final fgm<N> d;
      private final fgm.k<N> e;
      private final fgm.l<N> f;
      private final Consumer<N> m;

      i(fgn $$0, int $$1, int $$2, int $$3, int $$4, fgm<N> $$5, fgm.k<N> $$6, fgm.l<N> $$7, Consumer<N> $$8) {
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

   interface j<T> extends fgm.d<T>, fgm.k<T> {
      boolean c();

      @Override
      default Function<fgm<T>, fil> a(fgm.l<T> $$0, fgn $$1, int $$2, int $$3, int $$4, Consumer<T> $$5) {
         return this.c() ? fgm.d.super.a($$0, $$1, $$2, $$3, $$4, $$5) : fgm.k.super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   interface k<T> extends fgm.n<T> {
      double b(T var1);

      T b(double var1);

      @Override
      default Function<fgm<T>, fil> a(fgm.l<T> $$0, fgn $$1, int $$2, int $$3, int $$4, Consumer<T> $$5) {
         return $$6 -> new fgm.i<>($$1, $$2, $$3, $$4, 20, $$6, this, $$0, $$5);
      }
   }

   @FunctionalInterface
   public interface l<T> {
      @Nullable
      fjy apply(T var1);
   }

   public static enum m implements fgm.k<Double> {
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

      public <R> fgm.k<R> a(final DoubleFunction<? extends R> $$0, final ToDoubleFunction<? super R> $$1) {
         return new fgm.k<R>() {
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
         return axu.a(Codec.doubleRange(0.0, 1.0), Codec.BOOL, $$0 -> $$0 ? 1.0 : 0.0);
      }
   }

   interface n<T> {
      Function<fgm<T>, fil> a(fgm.l<T> var1, fgn var2, int var3, int var4, int var5, Consumer<T> var6);

      Optional<T> a(T var1);

      Codec<T> f();
   }
}
