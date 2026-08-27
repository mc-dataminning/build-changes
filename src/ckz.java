import java.util.function.Predicate;

public abstract class ckz extends cke {
   public static final Predicate<ckj> c = $$0 -> $$0.a(ara.at);
   public static final Predicate<ckj> d = c.or($$0 -> $$0.a(ckm.tA));

   public ckz(cke.a $$0) {
      super($$0);
   }

   public Predicate<ckj> e() {
      return this.b();
   }

   public abstract Predicate<ckj> b();

   public static ckj a(bkj $$0, Predicate<ckj> $$1) {
      if ($$1.test($$0.b(bia.b))) {
         return $$0.b(bia.b);
      } else {
         return $$1.test($$0.b(bia.a)) ? $$0.b(bia.a) : ckj.b;
      }
   }

   @Override
   public int c() {
      return 1;
   }

   public abstract int d();
}
