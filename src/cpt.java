import java.util.function.Predicate;

public abstract class cpt extends coy {
   public static final Predicate<cpd> c = $$0 -> $$0.a(aui.at);
   public static final Predicate<cpd> d = c.or($$0 -> $$0.a(cpg.uq));

   public cpt(coy.a $$0) {
      super($$0);
   }

   public Predicate<cpd> e() {
      return this.b();
   }

   public abstract Predicate<cpd> b();

   public static cpd a(boi $$0, Predicate<cpd> $$1) {
      if ($$1.test($$0.b(blv.b))) {
         return $$0.b(blv.b);
      } else {
         return $$1.test($$0.b(blv.a)) ? $$0.b(blv.a) : cpd.h;
      }
   }

   @Override
   public int an_() {
      return 1;
   }

   public abstract int d();
}
