import it.unimi.dsi.fastutil.Hash.Strategy;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public record exp<T>(T b, ja c, int d, exu e) {
   private static final String f = "i";
   private static final String g = "x";
   private static final String h = "y";
   private static final String i = "z";
   private static final String j = "t";
   private static final String k = "p";
   public static final Strategy<exp<?>> a = new Strategy<exp<?>>() {
      public int a(exp<?> $$0) {
         return 31 * $$0.b().hashCode() + $$0.a().hashCode();
      }

      public boolean a(@Nullable exp<?> $$0, @Nullable exp<?> $$1) {
         if ($$0 == $$1) {
            return true;
         } else {
            return $$0 != null && $$1 != null ? $$0.a() == $$1.a() && $$0.b().equals($$1.b()) : false;
         }
      }
   };

   public static <T> void a(ud $$0, Function<String, Optional<T>> $$1, dbk $$2, Consumer<exp<T>> $$3) {
      long $$4 = $$2.a();

      for (int $$5 = 0; $$5 < $$0.size(); $$5++) {
         tx $$6 = $$0.a($$5);
         a($$6, $$1).ifPresent($$2x -> {
            if (dbk.a($$2x.b()) == $$4) {
               $$3.accept($$2x);
            }
         });
      }
   }

   public static <T> Optional<exp<T>> a(tx $$0, Function<String, Optional<T>> $$1) {
      return $$1.apply($$0.l("i")).map($$1x -> {
         ja $$2 = new ja($$0.h("x"), $$0.h("y"), $$0.h("z"));
         return new exp<>((T)$$1x, $$2, $$0.h("t"), exu.a($$0.h("p")));
      });
   }

   private static tx a(String $$0, ja $$1, int $$2, exu $$3) {
      tx $$4 = new tx();
      $$4.a("i", $$0);
      $$4.a("x", $$1.u());
      $$4.a("y", $$1.v());
      $$4.a("z", $$1.w());
      $$4.a("t", $$2);
      $$4.a("p", $$3.a());
      return $$4;
   }

   public static <T> tx a(exq<T> $$0, Function<T, String> $$1, long $$2) {
      return a($$1.apply($$0.a()), $$0.b(), (int)($$0.c() - $$2), $$0.d());
   }

   public tx a(Function<T, String> $$0) {
      return a($$0.apply(this.b), this.c, this.d, this.e);
   }

   public exq<T> a(long $$0, long $$1) {
      return new exq<>(this.b, this.c, $$0 + (long)this.d, this.e, $$1);
   }

   public static <T> exp<T> a(T $$0, ja $$1) {
      return new exp<>($$0, $$1, 0, exu.d);
   }

   public T a() {
      return this.b;
   }

   public ja b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }

   public exu d() {
      return this.e;
   }
}
