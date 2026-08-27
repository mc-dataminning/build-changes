import java.util.function.Predicate;

public abstract class ckb extends cjg {
   public static final Predicate<cjl> c = $$0 -> $$0.a(aqd.at);
   public static final Predicate<cjl> d = c.or($$0 -> $$0.a(cjo.tA));

   public ckb(cjg.a $$0) {
      super($$0);
   }

   public Predicate<cjl> e() {
      return this.b();
   }

   public abstract Predicate<cjl> b();

   public static cjl a(bjm $$0, Predicate<cjl> $$1) {
      if ($$1.test($$0.b(bhd.b))) {
         return $$0.b(bhd.b);
      } else {
         return $$1.test($$0.b(bhd.a)) ? $$0.b(bhd.a) : cjl.b;
      }
   }

   @Override
   public int c() {
      return 1;
   }

   public abstract int d();
}
