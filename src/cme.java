import java.util.function.Predicate;

public abstract class cme extends clj {
   public static final Predicate<clo> c = $$0 -> $$0.a(ars.at);
   public static final Predicate<clo> d = c.or($$0 -> $$0.a(clr.um));

   public cme(clj.a $$0) {
      super($$0);
   }

   public Predicate<clo> e() {
      return this.b();
   }

   public abstract Predicate<clo> b();

   public static clo a(bll $$0, Predicate<clo> $$1) {
      if ($$1.test($$0.b(bja.b))) {
         return $$0.b(bja.b);
      } else {
         return $$1.test($$0.b(bja.a)) ? $$0.b(bja.a) : clo.b;
      }
   }

   @Override
   public int c() {
      return 1;
   }

   public abstract int d();
}
