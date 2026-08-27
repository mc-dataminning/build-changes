import java.util.function.Predicate;

public abstract class cjo extends cit {
   public static final Predicate<ciy> c = $$0 -> $$0.a(apt.at);
   public static final Predicate<ciy> d = c.or($$0 -> $$0.a(cjb.tA));

   public cjo(cit.a $$0) {
      super($$0);
   }

   public Predicate<ciy> e() {
      return this.b();
   }

   public abstract Predicate<ciy> b();

   public static ciy a(biy $$0, Predicate<ciy> $$1) {
      if ($$1.test($$0.b(bgp.b))) {
         return $$0.b(bgp.b);
      } else {
         return $$1.test($$0.b(bgp.a)) ? $$0.b(bgp.a) : ciy.b;
      }
   }

   @Override
   public int c() {
      return 1;
   }

   public abstract int d();
}
