import it.unimi.dsi.fastutil.Hash.Strategy;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public record emm<T>(T b, hv c, int d, emr e) {
   private static final String f = "i";
   private static final String g = "x";
   private static final String h = "y";
   private static final String i = "z";
   private static final String j = "t";
   private static final String k = "p";
   public static final Strategy<emm<?>> a = new Strategy<emm<?>>() {
      public int a(emm<?> $$0) {
         return 31 * $$0.b().hashCode() + $$0.a().hashCode();
      }

      public boolean a(@Nullable emm<?> $$0, @Nullable emm<?> $$1) {
         if ($$0 == $$1) {
            return true;
         } else {
            return $$0 != null && $$1 != null ? $$0.a() == $$1.a() && $$0.b().equals($$1.b()) : false;
         }
      }
   };

   public static <T> void a(sp $$0, Function<String, Optional<T>> $$1, csf $$2, Consumer<emm<T>> $$3) {
      long $$4 = $$2.a();

      for (int $$5 = 0; $$5 < $$0.size(); $$5++) {
         sj $$6 = $$0.a($$5);
         a($$6, $$1).ifPresent($$2x -> {
            if (csf.a($$2x.b()) == $$4) {
               $$3.accept($$2x);
            }
         });
      }
   }

   public static <T> Optional<emm<T>> a(sj $$0, Function<String, Optional<T>> $$1) {
      return $$1.apply($$0.l("i")).map($$1x -> {
         hv $$2 = new hv($$0.h("x"), $$0.h("y"), $$0.h("z"));
         return new emm<>((T)$$1x, $$2, $$0.h("t"), emr.a($$0.h("p")));
      });
   }

   private static sj a(String $$0, hv $$1, int $$2, emr $$3) {
      sj $$4 = new sj();
      $$4.a("i", $$0);
      $$4.a("x", $$1.u());
      $$4.a("y", $$1.v());
      $$4.a("z", $$1.w());
      $$4.a("t", $$2);
      $$4.a("p", $$3.a());
      return $$4;
   }

   public static <T> sj a(emn<T> $$0, Function<T, String> $$1, long $$2) {
      return a($$1.apply($$0.a()), $$0.b(), (int)($$0.c() - $$2), $$0.d());
   }

   public sj a(Function<T, String> $$0) {
      return a($$0.apply(this.b), this.c, this.d, this.e);
   }

   public emn<T> a(long $$0, long $$1) {
      return new emn<>(this.b, this.c, $$0 + (long)this.d, this.e, $$1);
   }

   public static <T> emm<T> a(T $$0, hv $$1) {
      return new emm<>($$0, $$1, 0, emr.d);
   }

   public T a() {
      return this.b;
   }

   public hv b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }

   public emr d() {
      return this.e;
   }
}
