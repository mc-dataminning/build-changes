import java.util.function.Predicate;

public abstract class cnh extends cmm {
   public static final Predicate<cmr> c = $$0 -> $$0.a(asj.at);
   public static final Predicate<cmr> d = c.or($$0 -> $$0.a(cmu.un));

   public cnh(cmm.a $$0) {
      super($$0);
   }

   public Predicate<cmr> e() {
      return this.b();
   }

   public abstract Predicate<cmr> b();

   public static cmr a(bmf $$0, Predicate<cmr> $$1) {
      if ($$1.test($$0.b(bju.b))) {
         return $$0.b(bju.b);
      } else {
         return $$1.test($$0.b(bju.a)) ? $$0.b(bju.a) : cmr.f;
      }
   }

   @Override
   public int c() {
      return 1;
   }

   public abstract int d();
}
