import it.unimi.dsi.fastutil.Hash.Strategy;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public record fgh<T>(T b, iu c, int d, fgm e) {
   private static final String f = "i";
   private static final String g = "x";
   private static final String h = "y";
   private static final String i = "z";
   private static final String j = "t";
   private static final String k = "p";
   public static final Strategy<fgh<?>> a = new Strategy<fgh<?>>() {
      public int a(fgh<?> $$0) {
         return 31 * $$0.b().hashCode() + $$0.a().hashCode();
      }

      public boolean a(@Nullable fgh<?> $$0, @Nullable fgh<?> $$1) {
         if ($$0 == $$1) {
            return true;
         } else {
            return $$0 != null && $$1 != null ? $$0.a() == $$1.a() && $$0.b().equals($$1.b()) : false;
         }
      }
   };

   public static <T> List<fgh<T>> a(uf $$0, Function<String, Optional<T>> $$1, dih $$2) {
      List<fgh<T>> $$3 = new ArrayList<>($$0.size());
      long $$4 = $$2.a();

      for (int $$5 = 0; $$5 < $$0.size(); $$5++) {
         tz $$6 = $$0.a($$5);
         a($$6, $$1).ifPresent($$2x -> {
            if (dih.a($$2x.b()) == $$4) {
               $$3.add($$2x);
            }
         });
      }

      return $$3;
   }

   public static <T> Optional<fgh<T>> a(tz $$0, Function<String, Optional<T>> $$1) {
      return $$1.apply($$0.l("i")).map($$1x -> {
         iu $$2 = new iu($$0.h("x"), $$0.h("y"), $$0.h("z"));
         return new fgh<>((T)$$1x, $$2, $$0.h("t"), fgm.a($$0.h("p")));
      });
   }

   private static tz a(String $$0, iu $$1, int $$2, fgm $$3) {
      tz $$4 = new tz();
      $$4.a("i", $$0);
      $$4.a("x", $$1.u());
      $$4.a("y", $$1.v());
      $$4.a("z", $$1.w());
      $$4.a("t", $$2);
      $$4.a("p", $$3.a());
      return $$4;
   }

   public tz a(Function<T, String> $$0) {
      return a($$0.apply(this.b), this.c, this.d, this.e);
   }

   public fgi<T> a(long $$0, long $$1) {
      return new fgi<>(this.b, this.c, $$0 + (long)this.d, this.e, $$1);
   }

   public static <T> fgh<T> a(T $$0, iu $$1) {
      return new fgh<>($$0, $$1, 0, fgm.d);
   }

   public T a() {
      return this.b;
   }

   public iu b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }

   public fgm d() {
      return this.e;
   }
}
