import it.unimi.dsi.fastutil.Hash.Strategy;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public record ens<T>(T b, hx c, int d, enx e) {
   private static final String f = "i";
   private static final String g = "x";
   private static final String h = "y";
   private static final String i = "z";
   private static final String j = "t";
   private static final String k = "p";
   public static final Strategy<ens<?>> a = new Strategy<ens<?>>() {
      public int a(ens<?> $$0) {
         return 31 * $$0.b().hashCode() + $$0.a().hashCode();
      }

      public boolean a(@Nullable ens<?> $$0, @Nullable ens<?> $$1) {
         if ($$0 == $$1) {
            return true;
         } else {
            return $$0 != null && $$1 != null ? $$0.a() == $$1.a() && $$0.b().equals($$1.b()) : false;
         }
      }
   };

   public static <T> void a(su $$0, Function<String, Optional<T>> $$1, cte $$2, Consumer<ens<T>> $$3) {
      long $$4 = $$2.a();

      for (int $$5 = 0; $$5 < $$0.size(); $$5++) {
         so $$6 = $$0.a($$5);
         a($$6, $$1).ifPresent($$2x -> {
            if (cte.a($$2x.b()) == $$4) {
               $$3.accept($$2x);
            }
         });
      }
   }

   public static <T> Optional<ens<T>> a(so $$0, Function<String, Optional<T>> $$1) {
      return $$1.apply($$0.l("i")).map($$1x -> {
         hx $$2 = new hx($$0.h("x"), $$0.h("y"), $$0.h("z"));
         return new ens<>((T)$$1x, $$2, $$0.h("t"), enx.a($$0.h("p")));
      });
   }

   private static so a(String $$0, hx $$1, int $$2, enx $$3) {
      so $$4 = new so();
      $$4.a("i", $$0);
      $$4.a("x", $$1.u());
      $$4.a("y", $$1.v());
      $$4.a("z", $$1.w());
      $$4.a("t", $$2);
      $$4.a("p", $$3.a());
      return $$4;
   }

   public static <T> so a(ent<T> $$0, Function<T, String> $$1, long $$2) {
      return a($$1.apply($$0.a()), $$0.b(), (int)($$0.c() - $$2), $$0.d());
   }

   public so a(Function<T, String> $$0) {
      return a($$0.apply(this.b), this.c, this.d, this.e);
   }

   public ent<T> a(long $$0, long $$1) {
      return new ent<>(this.b, this.c, $$0 + (long)this.d, this.e, $$1);
   }

   public static <T> ens<T> a(T $$0, hx $$1) {
      return new ens<>($$0, $$1, 0, enx.d);
   }

   public T a() {
      return this.b;
   }

   public hx b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }

   public enx d() {
      return this.e;
   }
}
