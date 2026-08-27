import it.unimi.dsi.fastutil.Hash.Strategy;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public record erh<T>(T b, ib c, int d, erm e) {
   private static final String f = "i";
   private static final String g = "x";
   private static final String h = "y";
   private static final String i = "z";
   private static final String j = "t";
   private static final String k = "p";
   public static final Strategy<erh<?>> a = new Strategy<erh<?>>() {
      public int a(erh<?> $$0) {
         return 31 * $$0.b().hashCode() + $$0.a().hashCode();
      }

      public boolean a(@Nullable erh<?> $$0, @Nullable erh<?> $$1) {
         if ($$0 == $$1) {
            return true;
         } else {
            return $$0 != null && $$1 != null ? $$0.a() == $$1.a() && $$0.b().equals($$1.b()) : false;
         }
      }
   };

   public static <T> void a(tg $$0, Function<String, Optional<T>> $$1, cwg $$2, Consumer<erh<T>> $$3) {
      long $$4 = $$2.a();

      for (int $$5 = 0; $$5 < $$0.size(); $$5++) {
         ta $$6 = $$0.a($$5);
         a($$6, $$1).ifPresent($$2x -> {
            if (cwg.a($$2x.b()) == $$4) {
               $$3.accept($$2x);
            }
         });
      }
   }

   public static <T> Optional<erh<T>> a(ta $$0, Function<String, Optional<T>> $$1) {
      return $$1.apply($$0.l("i")).map($$1x -> {
         ib $$2 = new ib($$0.h("x"), $$0.h("y"), $$0.h("z"));
         return new erh<>((T)$$1x, $$2, $$0.h("t"), erm.a($$0.h("p")));
      });
   }

   private static ta a(String $$0, ib $$1, int $$2, erm $$3) {
      ta $$4 = new ta();
      $$4.a("i", $$0);
      $$4.a("x", $$1.u());
      $$4.a("y", $$1.v());
      $$4.a("z", $$1.w());
      $$4.a("t", $$2);
      $$4.a("p", $$3.a());
      return $$4;
   }

   public static <T> ta a(eri<T> $$0, Function<T, String> $$1, long $$2) {
      return a($$1.apply($$0.a()), $$0.b(), (int)($$0.c() - $$2), $$0.d());
   }

   public ta a(Function<T, String> $$0) {
      return a($$0.apply(this.b), this.c, this.d, this.e);
   }

   public eri<T> a(long $$0, long $$1) {
      return new eri<>(this.b, this.c, $$0 + (long)this.d, this.e, $$1);
   }

   public static <T> erh<T> a(T $$0, ib $$1) {
      return new erh<>($$0, $$1, 0, erm.d);
   }

   public T a() {
      return this.b;
   }

   public ib b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }

   public erm d() {
      return this.e;
   }
}
