import java.util.function.Predicate;

public abstract class clz extends cle {
   public static final Predicate<clj> c = $$0 -> $$0.a(aro.at);
   public static final Predicate<clj> d = c.or($$0 -> $$0.a(clm.um));

   public clz(cle.a $$0) {
      super($$0);
   }

   public Predicate<clj> e() {
      return this.b();
   }

   public abstract Predicate<clj> b();

   public static clj a(blg $$0, Predicate<clj> $$1) {
      if ($$1.test($$0.b(biw.b))) {
         return $$0.b(biw.b);
      } else {
         return $$1.test($$0.b(biw.a)) ? $$0.b(biw.a) : clj.b;
      }
   }

   @Override
   public int c() {
      return 1;
   }

   public abstract int d();
}
