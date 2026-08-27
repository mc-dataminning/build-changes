import java.util.function.Predicate;

public abstract class cnw extends cnb {
   public static final Predicate<cng> c = $$0 -> $$0.a(asq.at);
   public static final Predicate<cng> d = c.or($$0 -> $$0.a(cnj.uq));

   public cnw(cnb.a $$0) {
      super($$0);
   }

   public Predicate<cng> e() {
      return this.b();
   }

   public abstract Predicate<cng> b();

   public static cng a(bmo $$0, Predicate<cng> $$1) {
      if ($$1.test($$0.b(bkb.b))) {
         return $$0.b(bkb.b);
      } else {
         return $$1.test($$0.b(bkb.a)) ? $$0.b(bkb.a) : cng.f;
      }
   }

   @Override
   public int an_() {
      return 1;
   }

   public abstract int d();
}
