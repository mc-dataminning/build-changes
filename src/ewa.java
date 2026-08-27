import it.unimi.dsi.fastutil.Hash.Strategy;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public record ewa<T>(T b, io c, int d, ewf e) {
   private static final String f = "i";
   private static final String g = "x";
   private static final String h = "y";
   private static final String i = "z";
   private static final String j = "t";
   private static final String k = "p";
   public static final Strategy<ewa<?>> a = new Strategy<ewa<?>>() {
      public int a(ewa<?> $$0) {
         return 31 * $$0.b().hashCode() + $$0.a().hashCode();
      }

      public boolean a(@Nullable ewa<?> $$0, @Nullable ewa<?> $$1) {
         if ($$0 == $$1) {
            return true;
         } else {
            return $$0 != null && $$1 != null ? $$0.a() == $$1.a() && $$0.b().equals($$1.b()) : false;
         }
      }
   };

   public static <T> void a(uj $$0, Function<String, Optional<T>> $$1, dae $$2, Consumer<ewa<T>> $$3) {
      long $$4 = $$2.a();

      for (int $$5 = 0; $$5 < $$0.size(); $$5++) {
         ud $$6 = $$0.a($$5);
         a($$6, $$1).ifPresent($$2x -> {
            if (dae.a($$2x.b()) == $$4) {
               $$3.accept($$2x);
            }
         });
      }
   }

   public static <T> Optional<ewa<T>> a(ud $$0, Function<String, Optional<T>> $$1) {
      return $$1.apply($$0.l("i")).map($$1x -> {
         io $$2 = new io($$0.h("x"), $$0.h("y"), $$0.h("z"));
         return new ewa<>((T)$$1x, $$2, $$0.h("t"), ewf.a($$0.h("p")));
      });
   }

   private static ud a(String $$0, io $$1, int $$2, ewf $$3) {
      ud $$4 = new ud();
      $$4.a("i", $$0);
      $$4.a("x", $$1.u());
      $$4.a("y", $$1.v());
      $$4.a("z", $$1.w());
      $$4.a("t", $$2);
      $$4.a("p", $$3.a());
      return $$4;
   }

   public static <T> ud a(ewb<T> $$0, Function<T, String> $$1, long $$2) {
      return a($$1.apply($$0.a()), $$0.b(), (int)($$0.c() - $$2), $$0.d());
   }

   public ud a(Function<T, String> $$0) {
      return a($$0.apply(this.b), this.c, this.d, this.e);
   }

   public ewb<T> a(long $$0, long $$1) {
      return new ewb<>(this.b, this.c, $$0 + (long)this.d, this.e, $$1);
   }

   public static <T> ewa<T> a(T $$0, io $$1) {
      return new ewa<>($$0, $$1, 0, ewf.d);
   }

   public T a() {
      return this.b;
   }

   public io b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }

   public ewf d() {
      return this.e;
   }
}
