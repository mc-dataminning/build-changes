import java.util.function.Predicate;

public abstract class cra extends cqf {
   public static final Predicate<cqk> c = $$0 -> $$0.a(auv.at);
   public static final Predicate<cqk> d = c.or($$0 -> $$0.a(cqn.ur));

   public cra(cqf.a $$0) {
      super($$0);
   }

   public Predicate<cqk> d() {
      return this.b();
   }

   public abstract Predicate<cqk> b();

   public static cqk a(bpo $$0, Predicate<cqk> $$1) {
      if ($$1.test($$0.b(bnb.b))) {
         return $$0.b(bnb.b);
      } else {
         return $$1.test($$0.b(bnb.a)) ? $$0.b(bnb.a) : cqk.h;
      }
   }

   @Override
   public int e() {
      return 1;
   }

   public abstract int c();
}
