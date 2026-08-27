import java.util.function.Predicate;

public abstract class cqg extends cpl {
   public static final Predicate<cpq> c = $$0 -> $$0.a(aum.at);
   public static final Predicate<cpq> d = c.or($$0 -> $$0.a(cpt.uq));

   public cqg(cpl.a $$0) {
      super($$0);
   }

   public Predicate<cpq> d() {
      return this.b();
   }

   public abstract Predicate<cpq> b();

   public static cpq a(box $$0, Predicate<cpq> $$1) {
      if ($$1.test($$0.b(bmk.b))) {
         return $$0.b(bmk.b);
      } else {
         return $$1.test($$0.b(bmk.a)) ? $$0.b(bmk.a) : cpq.h;
      }
   }

   @Override
   public int e() {
      return 1;
   }

   public abstract int c();
}
