public record err(arj d, eyw e, eyw f, float g, float h, boolean i, err.a j) {
   public static final err.a a = $$0 -> {
   };
   public static final err.a b = err::a;
   public static final err.a c = err::b;

   public err(arj $$0, eyw $$1, eyw $$2, float $$3, float $$4, err.a $$5) {
      this($$0, $$1, $$2, $$3, $$4, false, $$5);
   }

   public err(arj $$0, btr $$1, err.a $$2) {
      this($$0, a($$0, $$1), eyw.c, 0.0F, 0.0F, false, $$2);
   }

   private static void a(btr $$0) {
      if ($$0 instanceof ark $$1) {
         $$1.c.b(new adn(1032, jf.c, 0, false));
      }
   }

   private static void b(btr $$0) {
      $$0.f(jf.a((jy)$$0.dq()));
   }

   public static err a(arj $$0, btr $$1, err.a $$2) {
      return new err($$0, a($$0, $$1), eyw.c, 0.0F, 0.0F, true, $$2);
   }

   private static eyw a(arj $$0, btr $$1) {
      return $$1.a($$0, $$0.W()).c();
   }

   public err a(float $$0, float $$1) {
      return new err(this.a(), this.b(), this.c(), $$0, $$1, this.f(), this.g());
   }

   public arj a() {
      return this.d;
   }

   public eyw b() {
      return this.e;
   }

   public eyw c() {
      return this.f;
   }

   public float d() {
      return this.g;
   }

   public float e() {
      return this.h;
   }

   public boolean f() {
      return this.i;
   }

   public err.a g() {
      return this.j;
   }

   @FunctionalInterface
   public interface a {
      void onTransition(btr var1);

      default err.a then(err.a $$0) {
         return $$1 -> {
            this.onTransition($$1);
            $$0.onTransition($$1);
         };
      }
   }
}
