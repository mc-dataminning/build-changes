import java.util.function.Predicate;

public abstract class cgp extends cfu {
   public static final Predicate<cfz> c = $$0 -> $$0.a(ane.at);
   public static final Predicate<cfz> d = c.or($$0 -> $$0.a(cgc.tA));

   public cgp(cfu.a $$0) {
      super($$0);
   }

   public Predicate<cfz> e() {
      return this.b();
   }

   public abstract Predicate<cfz> b();

   public static cfz a(bfz $$0, Predicate<cfz> $$1) {
      if ($$1.test($$0.b(bdw.b))) {
         return $$0.b(bdw.b);
      } else {
         return $$1.test($$0.b(bdw.a)) ? $$0.b(bdw.a) : cfz.b;
      }
   }

   @Override
   public int c() {
      return 1;
   }

   public abstract int d();
}
