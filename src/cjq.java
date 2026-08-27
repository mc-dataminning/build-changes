import java.util.function.Predicate;

public abstract class cjq extends civ {
   public static final Predicate<cja> c = $$0 -> $$0.a(apw.at);
   public static final Predicate<cja> d = c.or($$0 -> $$0.a(cjd.tA));

   public cjq(civ.a $$0) {
      super($$0);
   }

   public Predicate<cja> e() {
      return this.b();
   }

   public abstract Predicate<cja> b();

   public static cja a(bjb $$0, Predicate<cja> $$1) {
      if ($$1.test($$0.b(bgs.b))) {
         return $$0.b(bgs.b);
      } else {
         return $$1.test($$0.b(bgs.a)) ? $$0.b(bgs.a) : cja.b;
      }
   }

   @Override
   public int c() {
      return 1;
   }

   public abstract int d();
}
