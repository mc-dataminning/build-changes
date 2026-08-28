public record eqz(arg d, eye e, eye f, float g, float h, boolean i, eqz.a j) {
   public static final eqz.a a = $$0 -> {
   };
   public static final eqz.a b = eqz::a;
   public static final eqz.a c = eqz::b;

   public eqz(arg $$0, eye $$1, eye $$2, float $$3, float $$4, eqz.a $$5) {
      this($$0, $$1, $$2, $$3, $$4, false, $$5);
   }

   public eqz(arg $$0, btj $$1, eqz.a $$2) {
      this($$0, a($$0, $$1), eye.c, 0.0F, 0.0F, false, $$2);
   }

   private static void a(btj $$0) {
      if ($$0 instanceof arh $$1) {
         $$1.c.b(new adm(1032, je.c, 0, false));
      }
   }

   private static void b(btj $$0) {
      $$0.f(je.a((jx)$$0.dq()));
   }

   public static eqz a(arg $$0, btj $$1, eqz.a $$2) {
      return new eqz($$0, a($$0, $$1), eye.c, 0.0F, 0.0F, true, $$2);
   }

   private static eye a(arg $$0, btj $$1) {
      return $$1.a($$0, $$0.W()).c();
   }

   public eqz a(float $$0, float $$1) {
      return new eqz(this.a(), this.b(), this.c(), $$0, $$1, this.f(), this.g());
   }

   public arg a() {
      return this.d;
   }

   public eye b() {
      return this.e;
   }

   public eye c() {
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

   public eqz.a g() {
      return this.j;
   }

   @FunctionalInterface
   public interface a {
      void onTransition(btj var1);

      default eqz.a then(eqz.a $$0) {
         return $$1 -> {
            this.onTransition($$1);
            $$0.onTransition($$1);
         };
      }
   }
}
