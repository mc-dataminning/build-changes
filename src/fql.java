public class fql {
   public static final crq a = ctd::a;
   public static final crq b = ($$0, $$1, $$2) -> $$0.f();
   public static final crq c = ($$0, $$1, $$2) -> $$0.i();

   private static int a(cri $$0, hx $$1, crq $$2) {
      return $$0.a($$1, $$2);
   }

   public static int a(cri $$0, hx $$1) {
      return a($$0, $$1, a);
   }

   public static int b(cri $$0, hx $$1) {
      return a($$0, $$1, b);
   }

   public static int c(cri $$0, hx $$1) {
      return a($$0, $$1, c);
   }
}
