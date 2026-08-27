import java.util.function.Predicate;

public abstract class cjv extends cja {
   public static final Predicate<cjf> c = $$0 -> $$0.a(aqb.at);
   public static final Predicate<cjf> d = c.or($$0 -> $$0.a(cji.tA));

   public cjv(cja.a $$0) {
      super($$0);
   }

   public Predicate<cjf> e() {
      return this.b();
   }

   public abstract Predicate<cjf> b();

   public static cjf a(bjg $$0, Predicate<cjf> $$1) {
      if ($$1.test($$0.b(bgx.b))) {
         return $$0.b(bgx.b);
      } else {
         return $$1.test($$0.b(bgx.a)) ? $$0.b(bgx.a) : cjf.b;
      }
   }

   @Override
   public int c() {
      return 1;
   }

   public abstract int d();
}
