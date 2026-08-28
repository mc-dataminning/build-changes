import it.unimi.dsi.fastutil.Hash.Strategy;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public record exx<T>(T b, ja c, int d, eyc e) {
   private static final String f = "i";
   private static final String g = "x";
   private static final String h = "y";
   private static final String i = "z";
   private static final String j = "t";
   private static final String k = "p";
   public static final Strategy<exx<?>> a = new Strategy<exx<?>>() {
      public int a(exx<?> $$0) {
         return 31 * $$0.b().hashCode() + $$0.a().hashCode();
      }

      public boolean a(@Nullable exx<?> $$0, @Nullable exx<?> $$1) {
         if ($$0 == $$1) {
            return true;
         } else {
            return $$0 != null && $$1 != null ? $$0.a() == $$1.a() && $$0.b().equals($$1.b()) : false;
         }
      }
   };

   public static <T> void a(ud $$0, Function<String, Optional<T>> $$1, dbn $$2, Consumer<exx<T>> $$3) {
      long $$4 = $$2.a();

      for (int $$5 = 0; $$5 < $$0.size(); $$5++) {
         tx $$6 = $$0.a($$5);
         a($$6, $$1).ifPresent($$2x -> {
            if (dbn.a($$2x.b()) == $$4) {
               $$3.accept($$2x);
            }
         });
      }
   }

   public static <T> Optional<exx<T>> a(tx $$0, Function<String, Optional<T>> $$1) {
      return $$1.apply($$0.l("i")).map($$1x -> {
         ja $$2 = new ja($$0.h("x"), $$0.h("y"), $$0.h("z"));
         return new exx<>((T)$$1x, $$2, $$0.h("t"), eyc.a($$0.h("p")));
      });
   }

   private static tx a(String $$0, ja $$1, int $$2, eyc $$3) {
      tx $$4 = new tx();
      $$4.a("i", $$0);
      $$4.a("x", $$1.u());
      $$4.a("y", $$1.v());
      $$4.a("z", $$1.w());
      $$4.a("t", $$2);
      $$4.a("p", $$3.a());
      return $$4;
   }

   public static <T> tx a(exy<T> $$0, Function<T, String> $$1, long $$2) {
      return a($$1.apply($$0.a()), $$0.b(), (int)($$0.c() - $$2), $$0.d());
   }

   public tx a(Function<T, String> $$0) {
      return a($$0.apply(this.b), this.c, this.d, this.e);
   }

   public exy<T> a(long $$0, long $$1) {
      return new exy<>(this.b, this.c, $$0 + (long)this.d, this.e, $$1);
   }

   public static <T> exx<T> a(T $$0, ja $$1) {
      return new exx<>($$0, $$1, 0, eyc.d);
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

   public eyc d() {
      return this.e;
   }
}
