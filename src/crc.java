import java.util.function.Predicate;

public abstract class crc extends cqh {
   public static final Predicate<cqm> c = $$0 -> $$0.a(auv.at);
   public static final Predicate<cqm> d = c.or($$0 -> $$0.a(cqp.us));

   public crc(cqh.a $$0) {
      super($$0);
   }

   public Predicate<cqm> d() {
      return this.b();
   }

   public abstract Predicate<cqm> b();

   public static cqm a(bpp $$0, Predicate<cqm> $$1) {
      if ($$1.test($$0.b(bnc.b))) {
         return $$0.b(bnc.b);
      } else {
         return $$1.test($$0.b(bnc.a)) ? $$0.b(bnc.a) : cqm.h;
      }
   }

   @Override
   public int e() {
      return 1;
   }

   public abstract int c();
}
