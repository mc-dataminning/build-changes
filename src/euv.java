import it.unimi.dsi.fastutil.Hash.Strategy;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public record euv<T>(T b, im c, int d, eva e) {
   private static final String f = "i";
   private static final String g = "x";
   private static final String h = "y";
   private static final String i = "z";
   private static final String j = "t";
   private static final String k = "p";
   public static final Strategy<euv<?>> a = new Strategy<euv<?>>() {
      public int a(euv<?> $$0) {
         return 31 * $$0.b().hashCode() + $$0.a().hashCode();
      }

      public boolean a(@Nullable euv<?> $$0, @Nullable euv<?> $$1) {
         if ($$0 == $$1) {
            return true;
         } else {
            return $$0 != null && $$1 != null ? $$0.a() == $$1.a() && $$0.b().equals($$1.b()) : false;
         }
      }
   };

   public static <T> void a(ue $$0, Function<String, Optional<T>> $$1, czb $$2, Consumer<euv<T>> $$3) {
      long $$4 = $$2.a();

      for (int $$5 = 0; $$5 < $$0.size(); $$5++) {
         ty $$6 = $$0.a($$5);
         a($$6, $$1).ifPresent($$2x -> {
            if (czb.a($$2x.b()) == $$4) {
               $$3.accept($$2x);
            }
         });
      }
   }

   public static <T> Optional<euv<T>> a(ty $$0, Function<String, Optional<T>> $$1) {
      return $$1.apply($$0.l("i")).map($$1x -> {
         im $$2 = new im($$0.h("x"), $$0.h("y"), $$0.h("z"));
         return new euv<>((T)$$1x, $$2, $$0.h("t"), eva.a($$0.h("p")));
      });
   }

   private static ty a(String $$0, im $$1, int $$2, eva $$3) {
      ty $$4 = new ty();
      $$4.a("i", $$0);
      $$4.a("x", $$1.u());
      $$4.a("y", $$1.v());
      $$4.a("z", $$1.w());
      $$4.a("t", $$2);
      $$4.a("p", $$3.a());
      return $$4;
   }

   public static <T> ty a(euw<T> $$0, Function<T, String> $$1, long $$2) {
      return a($$1.apply($$0.a()), $$0.b(), (int)($$0.c() - $$2), $$0.d());
   }

   public ty a(Function<T, String> $$0) {
      return a($$0.apply(this.b), this.c, this.d, this.e);
   }

   public euw<T> a(long $$0, long $$1) {
      return new euw<>(this.b, this.c, $$0 + (long)this.d, this.e, $$1);
   }

   public static <T> euv<T> a(T $$0, im $$1) {
      return new euv<>($$0, $$1, 0, eva.d);
   }

   public T a() {
      return this.b;
   }

   public im b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }

   public eva d() {
      return this.e;
   }
}
