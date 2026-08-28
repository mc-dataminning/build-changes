import it.unimi.dsi.fastutil.Hash.Strategy;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public record fay<T>(T b, jg c, int d, fbd e) {
   private static final String f = "i";
   private static final String g = "x";
   private static final String h = "y";
   private static final String i = "z";
   private static final String j = "t";
   private static final String k = "p";
   public static final Strategy<fay<?>> a = new Strategy<fay<?>>() {
      public int a(fay<?> $$0) {
         return 31 * $$0.b().hashCode() + $$0.a().hashCode();
      }

      public boolean a(@Nullable fay<?> $$0, @Nullable fay<?> $$1) {
         if ($$0 == $$1) {
            return true;
         } else {
            return $$0 != null && $$1 != null ? $$0.a() == $$1.a() && $$0.b().equals($$1.b()) : false;
         }
      }
   };

   public static <T> List<fay<T>> a(up $$0, Function<String, Optional<T>> $$1, deb $$2) {
      List<fay<T>> $$3 = new ArrayList<>($$0.size());
      long $$4 = $$2.a();

      for (int $$5 = 0; $$5 < $$0.size(); $$5++) {
         uj $$6 = $$0.a($$5);
         a($$6, $$1).ifPresent($$2x -> {
            if (deb.a($$2x.b()) == $$4) {
               $$3.add($$2x);
            }
         });
      }

      return $$3;
   }

   public static <T> Optional<fay<T>> a(uj $$0, Function<String, Optional<T>> $$1) {
      return $$1.apply($$0.l("i")).map($$1x -> {
         jg $$2 = new jg($$0.h("x"), $$0.h("y"), $$0.h("z"));
         return new fay<>((T)$$1x, $$2, $$0.h("t"), fbd.a($$0.h("p")));
      });
   }

   private static uj a(String $$0, jg $$1, int $$2, fbd $$3) {
      uj $$4 = new uj();
      $$4.a("i", $$0);
      $$4.a("x", $$1.u());
      $$4.a("y", $$1.v());
      $$4.a("z", $$1.w());
      $$4.a("t", $$2);
      $$4.a("p", $$3.a());
      return $$4;
   }

   public uj a(Function<T, String> $$0) {
      return a($$0.apply(this.b), this.c, this.d, this.e);
   }

   public faz<T> a(long $$0, long $$1) {
      return new faz<>(this.b, this.c, $$0 + (long)this.d, this.e, $$1);
   }

   public static <T> fay<T> a(T $$0, jg $$1) {
      return new fay<>($$0, $$1, 0, fbd.d);
   }

   public T a() {
      return this.b;
   }

   public jg b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }

   public fbd d() {
      return this.e;
   }
}
