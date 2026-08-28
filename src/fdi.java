import it.unimi.dsi.fastutil.Hash.Strategy;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public record fdi<T>(T b, jh c, int d, fdn e) {
   private static final String f = "i";
   private static final String g = "x";
   private static final String h = "y";
   private static final String i = "z";
   private static final String j = "t";
   private static final String k = "p";
   public static final Strategy<fdi<?>> a = new Strategy<fdi<?>>() {
      public int a(fdi<?> $$0) {
         return 31 * $$0.b().hashCode() + $$0.a().hashCode();
      }

      public boolean a(@Nullable fdi<?> $$0, @Nullable fdi<?> $$1) {
         if ($$0 == $$1) {
            return true;
         } else {
            return $$0 != null && $$1 != null ? $$0.a() == $$1.a() && $$0.b().equals($$1.b()) : false;
         }
      }
   };

   public static <T> List<fdi<T>> a(us $$0, Function<String, Optional<T>> $$1, dgf $$2) {
      List<fdi<T>> $$3 = new ArrayList<>($$0.size());
      long $$4 = $$2.a();

      for (int $$5 = 0; $$5 < $$0.size(); $$5++) {
         um $$6 = $$0.a($$5);
         a($$6, $$1).ifPresent($$2x -> {
            if (dgf.a($$2x.b()) == $$4) {
               $$3.add($$2x);
            }
         });
      }

      return $$3;
   }

   public static <T> Optional<fdi<T>> a(um $$0, Function<String, Optional<T>> $$1) {
      return $$1.apply($$0.l("i")).map($$1x -> {
         jh $$2 = new jh($$0.h("x"), $$0.h("y"), $$0.h("z"));
         return new fdi<>((T)$$1x, $$2, $$0.h("t"), fdn.a($$0.h("p")));
      });
   }

   private static um a(String $$0, jh $$1, int $$2, fdn $$3) {
      um $$4 = new um();
      $$4.a("i", $$0);
      $$4.a("x", $$1.u());
      $$4.a("y", $$1.v());
      $$4.a("z", $$1.w());
      $$4.a("t", $$2);
      $$4.a("p", $$3.a());
      return $$4;
   }

   public um a(Function<T, String> $$0) {
      return a($$0.apply(this.b), this.c, this.d, this.e);
   }

   public fdj<T> a(long $$0, long $$1) {
      return new fdj<>(this.b, this.c, $$0 + (long)this.d, this.e, $$1);
   }

   public static <T> fdi<T> a(T $$0, jh $$1) {
      return new fdi<>($$0, $$1, 0, fdn.d);
   }

   public T a() {
      return this.b;
   }

   public jh b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }

   public fdn d() {
      return this.e;
   }
}
