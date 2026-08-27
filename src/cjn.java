import java.util.function.Predicate;

public abstract class cjn extends cis {
   public static final Predicate<cix> c = $$0 -> $$0.a(apt.at);
   public static final Predicate<cix> d = c.or($$0 -> $$0.a(cja.tA));

   public cjn(cis.a $$0) {
      super($$0);
   }

   public Predicate<cix> e() {
      return this.b();
   }

   public abstract Predicate<cix> b();

   public static cix a(biy $$0, Predicate<cix> $$1) {
      if ($$1.test($$0.b(bgp.b))) {
         return $$0.b(bgp.b);
      } else {
         return $$1.test($$0.b(bgp.a)) ? $$0.b(bgp.a) : cix.b;
      }
   }

   @Override
   public int c() {
      return 1;
   }

   public abstract int d();
}
