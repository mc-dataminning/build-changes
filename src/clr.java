import java.util.function.Predicate;

public abstract class clr extends ckw {
   public static final Predicate<clb> c = $$0 -> $$0.a(ark.at);
   public static final Predicate<clb> d = c.or($$0 -> $$0.a(cle.tB));

   public clr(ckw.a $$0) {
      super($$0);
   }

   public Predicate<clb> e() {
      return this.b();
   }

   public abstract Predicate<clb> b();

   public static clb a(bky $$0, Predicate<clb> $$1) {
      if ($$1.test($$0.b(bip.b))) {
         return $$0.b(bip.b);
      } else {
         return $$1.test($$0.b(bip.a)) ? $$0.b(bip.a) : clb.b;
      }
   }

   @Override
   public int c() {
      return 1;
   }

   public abstract int d();
}
