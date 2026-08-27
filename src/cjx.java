import java.util.function.Predicate;

public abstract class cjx extends cjc {
   public static final Predicate<cjh> c = $$0 -> $$0.a(aqc.at);
   public static final Predicate<cjh> d = c.or($$0 -> $$0.a(cjk.tA));

   public cjx(cjc.a $$0) {
      super($$0);
   }

   public Predicate<cjh> e() {
      return this.b();
   }

   public abstract Predicate<cjh> b();

   public static cjh a(bji $$0, Predicate<cjh> $$1) {
      if ($$1.test($$0.b(bgz.b))) {
         return $$0.b(bgz.b);
      } else {
         return $$1.test($$0.b(bgz.a)) ? $$0.b(bgz.a) : cjh.b;
      }
   }

   @Override
   public int c() {
      return 1;
   }

   public abstract int d();
}
