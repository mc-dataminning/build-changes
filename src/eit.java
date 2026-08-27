import it.unimi.dsi.fastutil.Hash.Strategy;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public record eit<T>(T b, gw c, int d, eiy e) {
   private static final String f = "i";
   private static final String g = "x";
   private static final String h = "y";
   private static final String i = "z";
   private static final String j = "t";
   private static final String k = "p";
   public static final Strategy<eit<?>> a = new Strategy<eit<?>>() {
      public int a(eit<?> $$0) {
         return 31 * $$0.b().hashCode() + $$0.a().hashCode();
      }

      public boolean a(@Nullable eit<?> $$0, @Nullable eit<?> $$1) {
         if ($$0 == $$1) {
            return true;
         } else {
            return $$0 != null && $$1 != null ? $$0.a() == $$1.a() && $$0.b().equals($$1.b()) : false;
         }
      }
   };

   public static <T> void a(ra $$0, Function<String, Optional<T>> $$1, cox $$2, Consumer<eit<T>> $$3) {
      long $$4 = $$2.a();

      for (int $$5 = 0; $$5 < $$0.size(); $$5++) {
         qu $$6 = $$0.a($$5);
         a($$6, $$1).ifPresent($$2x -> {
            if (cox.a($$2x.b()) == $$4) {
               $$3.accept($$2x);
            }
         });
      }
   }

   public static <T> Optional<eit<T>> a(qu $$0, Function<String, Optional<T>> $$1) {
      return $$1.apply($$0.l("i")).map($$1x -> {
         gw $$2 = new gw($$0.h("x"), $$0.h("y"), $$0.h("z"));
         return new eit<>((T)$$1x, $$2, $$0.h("t"), eiy.a($$0.h("p")));
      });
   }

   private static qu a(String $$0, gw $$1, int $$2, eiy $$3) {
      qu $$4 = new qu();
      $$4.a("i", $$0);
      $$4.a("x", $$1.u());
      $$4.a("y", $$1.v());
      $$4.a("z", $$1.w());
      $$4.a("t", $$2);
      $$4.a("p", $$3.a());
      return $$4;
   }

   public static <T> qu a(eiu<T> $$0, Function<T, String> $$1, long $$2) {
      return a($$1.apply($$0.a()), $$0.b(), (int)($$0.c() - $$2), $$0.d());
   }

   public qu a(Function<T, String> $$0) {
      return a($$0.apply(this.b), this.c, this.d, this.e);
   }

   public eiu<T> a(long $$0, long $$1) {
      return new eiu<>(this.b, this.c, $$0 + (long)this.d, this.e, $$1);
   }

   public static <T> eit<T> a(T $$0, gw $$1) {
      return new eit<>($$0, $$1, 0, eiy.d);
   }

   public T a() {
      return this.b;
   }

   public gw b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }

   public eiy d() {
      return this.e;
   }
}
