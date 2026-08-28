public record ern(arh d, eys e, eys f, float g, float h, boolean i, ern.a j) {
   public static final ern.a a = $$0 -> {
   };
   public static final ern.a b = ern::a;
   public static final ern.a c = ern::b;

   public ern(arh $$0, eys $$1, eys $$2, float $$3, float $$4, ern.a $$5) {
      this($$0, $$1, $$2, $$3, $$4, false, $$5);
   }

   public ern(arh $$0, bto $$1, ern.a $$2) {
      this($$0, a($$0, $$1), eys.c, 0.0F, 0.0F, false, $$2);
   }

   private static void a(bto $$0) {
      if ($$0 instanceof ari $$1) {
         $$1.c.b(new adm(1032, je.c, 0, false));
      }
   }

   private static void b(bto $$0) {
      $$0.f(je.a((jx)$$0.dq()));
   }

   public static ern a(arh $$0, bto $$1, ern.a $$2) {
      return new ern($$0, a($$0, $$1), eys.c, 0.0F, 0.0F, true, $$2);
   }

   private static eys a(arh $$0, bto $$1) {
      return $$1.a($$0, $$0.W()).c();
   }

   public ern a(float $$0, float $$1) {
      return new ern(this.a(), this.b(), this.c(), $$0, $$1, this.f(), this.g());
   }

   public arh a() {
      return this.d;
   }

   public eys b() {
      return this.e;
   }

   public eys c() {
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

   public ern.a g() {
      return this.j;
   }

   @FunctionalInterface
   public interface a {
      void onTransition(bto var1);

      default ern.a then(ern.a $$0) {
         return $$1 -> {
            this.onTransition($$1);
            $$0.onTransition($$1);
         };
      }
   }
}
