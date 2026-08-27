import java.util.function.Predicate;

public abstract class cnn extends cms {
   public static final Predicate<cmx> c = $$0 -> $$0.a(aso.at);
   public static final Predicate<cmx> d = c.or($$0 -> $$0.a(cna.un));

   public cnn(cms.a $$0) {
      super($$0);
   }

   public Predicate<cmx> e() {
      return this.b();
   }

   public abstract Predicate<cmx> b();

   public static cmx a(bmk $$0, Predicate<cmx> $$1) {
      if ($$1.test($$0.b(bjz.b))) {
         return $$0.b(bjz.b);
      } else {
         return $$1.test($$0.b(bjz.a)) ? $$0.b(bjz.a) : cmx.f;
      }
   }

   @Override
   public int c() {
      return 1;
   }

   public abstract int d();
}
