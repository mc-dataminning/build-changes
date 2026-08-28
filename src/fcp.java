import it.unimi.dsi.fastutil.Hash.Strategy;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public record fcp<T>(T b, ji c, int d, fcu e) {
   private static final String f = "i";
   private static final String g = "x";
   private static final String h = "y";
   private static final String i = "z";
   private static final String j = "t";
   private static final String k = "p";
   public static final Strategy<fcp<?>> a = new Strategy<fcp<?>>() {
      public int a(fcp<?> $$0) {
         return 31 * $$0.b().hashCode() + $$0.a().hashCode();
      }

      public boolean a(@Nullable fcp<?> $$0, @Nullable fcp<?> $$1) {
         if ($$0 == $$1) {
            return true;
         } else {
            return $$0 != null && $$1 != null ? $$0.a() == $$1.a() && $$0.b().equals($$1.b()) : false;
         }
      }
   };

   public static <T> List<fcp<T>> a(tw $$0, Function<String, Optional<T>> $$1, dfm $$2) {
      List<fcp<T>> $$3 = new ArrayList<>($$0.size());
      long $$4 = $$2.a();

      for (int $$5 = 0; $$5 < $$0.size(); $$5++) {
         tq $$6 = $$0.a($$5);
         a($$6, $$1).ifPresent($$2x -> {
            if (dfm.a($$2x.b()) == $$4) {
               $$3.add($$2x);
            }
         });
      }

      return $$3;
   }

   public static <T> Optional<fcp<T>> a(tq $$0, Function<String, Optional<T>> $$1) {
      return $$1.apply($$0.l("i")).map($$1x -> {
         ji $$2 = new ji($$0.h("x"), $$0.h("y"), $$0.h("z"));
         return new fcp<>((T)$$1x, $$2, $$0.h("t"), fcu.a($$0.h("p")));
      });
   }

   private static tq a(String $$0, ji $$1, int $$2, fcu $$3) {
      tq $$4 = new tq();
      $$4.a("i", $$0);
      $$4.a("x", $$1.u());
      $$4.a("y", $$1.v());
      $$4.a("z", $$1.w());
      $$4.a("t", $$2);
      $$4.a("p", $$3.a());
      return $$4;
   }

   public tq a(Function<T, String> $$0) {
      return a($$0.apply(this.b), this.c, this.d, this.e);
   }

   public fcq<T> a(long $$0, long $$1) {
      return new fcq<>(this.b, this.c, $$0 + (long)this.d, this.e, $$1);
   }

   public static <T> fcp<T> a(T $$0, ji $$1) {
      return new fcp<>($$0, $$1, 0, fcu.d);
   }

   public T a() {
      return this.b;
   }

   public ji b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }

   public fcu d() {
      return this.e;
   }
}
