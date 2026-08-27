import java.util.function.Predicate;

public abstract class cjm extends cir {
   public static final Predicate<ciw> c = $$0 -> $$0.a(apr.at);
   public static final Predicate<ciw> d = c.or($$0 -> $$0.a(ciz.tA));

   public cjm(cir.a $$0) {
      super($$0);
   }

   public Predicate<ciw> e() {
      return this.b();
   }

   public abstract Predicate<ciw> b();

   public static ciw a(biw $$0, Predicate<ciw> $$1) {
      if ($$1.test($$0.b(bgn.b))) {
         return $$0.b(bgn.b);
      } else {
         return $$1.test($$0.b(bgn.a)) ? $$0.b(bgn.a) : ciw.b;
      }
   }

   @Override
   public int c() {
      return 1;
   }

   public abstract int d();
}
