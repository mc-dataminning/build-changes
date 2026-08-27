import java.util.function.Predicate;

public abstract class cno extends cmt {
   public static final Predicate<cmy> c = $$0 -> $$0.a(asp.at);
   public static final Predicate<cmy> d = c.or($$0 -> $$0.a(cnb.un));

   public cno(cmt.a $$0) {
      super($$0);
   }

   public Predicate<cmy> e() {
      return this.b();
   }

   public abstract Predicate<cmy> b();

   public static cmy a(bml $$0, Predicate<cmy> $$1) {
      if ($$1.test($$0.b(bka.b))) {
         return $$0.b(bka.b);
      } else {
         return $$1.test($$0.b(bka.a)) ? $$0.b(bka.a) : cmy.f;
      }
   }

   @Override
   public int c() {
      return 1;
   }

   public abstract int d();
}
