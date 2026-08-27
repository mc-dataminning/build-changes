import java.util.function.Predicate;

public abstract class cmx extends cmc {
   public static final Predicate<cmh> c = $$0 -> $$0.a(arz.at);
   public static final Predicate<cmh> d = c.or($$0 -> $$0.a(cmk.un));

   public cmx(cmc.a $$0) {
      super($$0);
   }

   public Predicate<cmh> e() {
      return this.b();
   }

   public abstract Predicate<cmh> b();

   public static cmh a(blv $$0, Predicate<cmh> $$1) {
      if ($$1.test($$0.b(bjk.b))) {
         return $$0.b(bjk.b);
      } else {
         return $$1.test($$0.b(bjk.a)) ? $$0.b(bjk.a) : cmh.f;
      }
   }

   @Override
   public int c() {
      return 1;
   }

   public abstract int d();
}
