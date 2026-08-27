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

public final class ezl<T> {
   private static final Logger c = LogUtils.getLogger();
   public static final ezl.e<Boolean> a = new ezl.e<>(ImmutableList.of(Boolean.TRUE, Boolean.FALSE), Codec.BOOL);
   public static final ezl.b<Boolean> b = ($$0, $$1) -> $$1 ? vt.b : vt.c;
   private final ezl.l<T> d;
   final Function<T, vu> e;
   private final ezl.n<T> f;
   private final Codec<T> g;
   private final T h;
   private final Consumer<T> i;
   final vu j;
   T k;

   public static ezl<Boolean> a(String $$0, boolean $$1, Consumer<Boolean> $$2) {
      return a($$0, a(), $$1, $$2);
   }

   public static ezl<Boolean> a(String $$0, boolean $$1) {
      return a($$0, a(), $$1, $$0x -> {
      });
   }

   public static ezl<Boolean> a(String $$0, ezl.l<Boolean> $$1, boolean $$2) {
      return a($$0, $$1, $$2, $$0x -> {
      });
   }

   public static ezl<Boolean> a(String $$0, ezl.l<Boolean> $$1, boolean $$2, Consumer<Boolean> $$3) {
      return a($$0, $$1, b, $$2, $$3);
   }

   public static ezl<Boolean> a(String $$0, ezl.l<Boolean> $$1, ezl.b<Boolean> $$2, boolean $$3, Consumer<Boolean> $$4) {
      return new ezl<>($$0, $$1, $$2, a, $$3, $$4);
   }

   public ezl(String $$0, ezl.l<T> $$1, ezl.b<T> $$2, ezl.n<T> $$3, T $$4, Consumer<T> $$5) {
      this($$0, $$1, $$2, $$3, $$3.f(), $$4, $$5);
   }

   public ezl(String $$0, ezl.l<T> $$1, ezl.b<T> $$2, ezl.n<T> $$3, Codec<T> $$4, T $$5, Consumer<T> $$6) {
      this.j = vu.c($$0);
      this.d = $$1;
      this.e = $$1x -> $$2.toString(this.j, (T)$$1x);
      this.f = $$3;
      this.g = $$4;
      this.h = $$5;
      this.i = $$6;
      this.k = this.h;
   }

   public static <T> ezl.l<T> a() {
      return $$0 -> null;
   }

   public static <T> ezl.l<T> a(vu $$0) {
      return $$1 -> fct.a($$0);
   }

   public static <T extends awy> ezl.b<T> b() {
      return ($$0, $$1) -> $$1.d();
   }

   public fbg a(ezm $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, $$1, $$2, $$3, $$0x -> {
      });
   }

   public fbg a(ezm $$0, int $$1, int $$2, int $$3, Consumer<T> $$4) {
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
      if (!ezi.Q().r()) {
         this.k = $$1;
      } else {
         if (!Objects.equals(this.k, $$1)) {
            this.k = $$1;
            this.i.accept(this.k);
         }
      }
   }

   public ezl.n<T> e() {
      return this.f;
   }

   public static record a<T>(List<T> a, List<T> b, BooleanSupplier c, ezl.d.a<T> d, Codec<T> e) implements ezl.d<T> {
      @Override
      public fbp.c<T> a() {
         return fbp.c.a(this.c, this.a, this.b);
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
      public ezl.d.a<T> e() {
         return this.d;
      }

      @Override
      public Codec<T> f() {
         return this.e;
      }
   }

   public interface b<T> {
      vu toString(vu var1, T var2);
   }

   public static record c(int a, IntSupplier b, int c) implements ezl.g, ezl.j<Integer> {
      public Optional<Integer> a(Integer $$0) {
         return Optional.of(aww.a($$0, this.d(), this.b()));
      }

      @Override
      public int b() {
         return this.b.getAsInt();
      }

      @Override
      public Codec<Integer> f() {
         return awe.b(
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
      public fbp.c<Integer> a() {
         return fbp.c.a(IntStream.range(this.a, this.b() + 1).boxed().toList());
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

   interface d<T> extends ezl.n<T> {
      fbp.c<T> a();

      default ezl.d.a<T> e() {
         return ezl::a;
      }

      @Override
      default Function<ezl<T>, fbg> a(ezl.l<T> $$0, ezm $$1, int $$2, int $$3, int $$4, Consumer<T> $$5) {
         return $$6 -> fbp.a($$6.e).a(this.a()).a($$0).a($$6.k).a($$2, $$3, $$4, 20, $$6.j, ($$3xx, $$4xx) -> {
               this.e().set($$6, (T)$$4xx);
               $$1.at();
               $$5.accept((T)$$4xx);
            });
      }

      public interface a<T> {
         void set(ezl<T> var1, T var2);
      }
   }

   public static record e<T>(List<T> a, Codec<T> b) implements ezl.d<T> {
      @Override
      public Optional<T> a(T $$0) {
         return this.a.contains($$0) ? Optional.of($$0) : Optional.empty();
      }

      @Override
      public fbp.c<T> a() {
         return fbp.c.a(this.a);
      }

      public List<T> b() {
         return this.a;
      }

      @Override
      public Codec<T> f() {
         return this.b;
      }
   }

   public static record f(int a, int b) implements ezl.g {
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

   interface g extends ezl.k<Integer> {
      int d();

      int b();

      default double b(Integer $$0) {
         return (double)aww.c((float)$$0.intValue(), (float)this.d(), (float)this.b(), 0.0F, 1.0F);
      }

      default Integer a(double $$0) {
         return aww.a(aww.b($$0, 0.0, 1.0, (double)this.d(), (double)this.b()));
      }

      default <R> ezl.k<R> a(final IntFunction<? extends R> $$0, final ToIntFunction<? super R> $$1) {
         return new ezl.k<R>() {
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

   public static record h<T>(Supplier<List<T>> a, Function<T, Optional<T>> b, Codec<T> c) implements ezl.d<T> {
      @Override
      public Optional<T> a(T $$0) {
         return this.b.apply($$0);
      }

      @Override
      public fbp.c<T> a() {
         return fbp.c.a(this.a.get());
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

   static final class i<N> extends fbb {
      private final ezl<N> d;
      private final ezl.k<N> e;
      private final ezl.l<N> f;
      private final Consumer<N> m;

      i(ezm $$0, int $$1, int $$2, int $$3, int $$4, ezl<N> $$5, ezl.k<N> $$6, ezl.l<N> $$7, Consumer<N> $$8) {
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
         this.a.at();
         this.m.accept(this.d.c());
      }
   }

   interface j<T> extends ezl.d<T>, ezl.k<T> {
      boolean c();

      @Override
      default Function<ezl<T>, fbg> a(ezl.l<T> $$0, ezm $$1, int $$2, int $$3, int $$4, Consumer<T> $$5) {
         return this.c() ? ezl.d.super.a($$0, $$1, $$2, $$3, $$4, $$5) : ezl.k.super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   interface k<T> extends ezl.n<T> {
      double b(T var1);

      T b(double var1);

      @Override
      default Function<ezl<T>, fbg> a(ezl.l<T> $$0, ezm $$1, int $$2, int $$3, int $$4, Consumer<T> $$5) {
         return $$6 -> new ezl.i<>($$1, $$2, $$3, $$4, 20, $$6, this, $$0, $$5);
      }
   }

   @FunctionalInterface
   public interface l<T> {
      @Nullable
      fct apply(T var1);
   }

   public static enum m implements ezl.k<Double> {
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

      public <R> ezl.k<R> a(final DoubleFunction<? extends R> $$0, final ToDoubleFunction<? super R> $$1) {
         return new ezl.k<R>() {
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
         return awe.a(Codec.doubleRange(0.0, 1.0), Codec.BOOL, $$0 -> $$0 ? 1.0 : 0.0);
      }
   }

   interface n<T> {
      Function<ezl<T>, fbg> a(ezl.l<T> var1, ezm var2, int var3, int var4, int var5, Consumer<T> var6);

      Optional<T> a(T var1);

      Codec<T> f();
   }
}
