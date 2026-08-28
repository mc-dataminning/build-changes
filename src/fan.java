import it.unimi.dsi.fastutil.Hash.Strategy;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public record fan<T>(T b, jf c, int d, fas e) {
   private static final String f = "i";
   private static final String g = "x";
   private static final String h = "y";
   private static final String i = "z";
   private static final String j = "t";
   private static final String k = "p";
   public static final Strategy<fan<?>> a = new Strategy<fan<?>>() {
      public int a(fan<?> $$0) {
         return 31 * $$0.b().hashCode() + $$0.a().hashCode();
      }

      public boolean a(@Nullable fan<?> $$0, @Nullable fan<?> $$1) {
         if ($$0 == $$1) {
            return true;
         } else {
            return $$0 != null && $$1 != null ? $$0.a() == $$1.a() && $$0.b().equals($$1.b()) : false;
         }
      }
   };

   public static <T> List<fan<T>> a(um $$0, Function<String, Optional<T>> $$1, ddp $$2) {
      List<fan<T>> $$3 = new ArrayList<>($$0.size());
      long $$4 = $$2.a();

      for (int $$5 = 0; $$5 < $$0.size(); $$5++) {
         ug $$6 = $$0.a($$5);
         a($$6, $$1).ifPresent($$2x -> {
            if (ddp.a($$2x.b()) == $$4) {
               $$3.add($$2x);
            }
         });
      }

      return $$3;
   }

   public static <T> Optional<fan<T>> a(ug $$0, Function<String, Optional<T>> $$1) {
      return $$1.apply($$0.l("i")).map($$1x -> {
         jf $$2 = new jf($$0.h("x"), $$0.h("y"), $$0.h("z"));
         return new fan<>((T)$$1x, $$2, $$0.h("t"), fas.a($$0.h("p")));
      });
   }

   private static ug a(String $$0, jf $$1, int $$2, fas $$3) {
      ug $$4 = new ug();
      $$4.a("i", $$0);
      $$4.a("x", $$1.u());
      $$4.a("y", $$1.v());
      $$4.a("z", $$1.w());
      $$4.a("t", $$2);
      $$4.a("p", $$3.a());
      return $$4;
   }

   public ug a(Function<T, String> $$0) {
      return a($$0.apply(this.b), this.c, this.d, this.e);
   }

   public fao<T> a(long $$0, long $$1) {
      return new fao<>(this.b, this.c, $$0 + (long)this.d, this.e, $$1);
   }

   public static <T> fan<T> a(T $$0, jf $$1) {
      return new fan<>($$0, $$1, 0, fas.d);
   }

   public T a() {
      return this.b;
   }

   public jf b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }

   public fas d() {
      return this.e;
   }
}
