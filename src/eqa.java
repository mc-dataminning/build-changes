public record eqa(aqu d, exa e, exa f, float g, float h, boolean i, eqa.a j) {
   public static final eqa.a a = $$0 -> {
   };
   public static final eqa.a b = eqa::a;
   public static final eqa.a c = eqa::b;

   public eqa(aqu $$0, exa $$1, exa $$2, float $$3, float $$4, eqa.a $$5) {
      this($$0, $$1, $$2, $$3, $$4, false, $$5);
   }

   public eqa(aqu $$0, bsr $$1, eqa.a $$2) {
      this($$0, a($$0, $$1), exa.b, 0.0F, 0.0F, false, $$2);
   }

   private static void a(bsr $$0) {
      if ($$0 instanceof aqv $$1) {
         $$1.c.b(new adh(1032, jd.c, 0, false));
      }
   }

   private static void b(bsr $$0) {
      $$0.f(jd.a((jw)$$0.dn()));
   }

   public static eqa a(aqu $$0, bsr $$1, eqa.a $$2) {
      return new eqa($$0, a($$0, $$1), exa.b, 0.0F, 0.0F, true, $$2);
   }

   private static exa a(aqu $$0, bsr $$1) {
      return $$1.a($$0, $$0.V()).c();
   }

   public aqu a() {
      return this.d;
   }

   public exa b() {
      return this.e;
   }

   public exa c() {
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

   public eqa.a g() {
      return this.j;
   }

   @FunctionalInterface
   public interface a {
      void onTransition(bsr var1);

      default eqa.a then(eqa.a $$0) {
         return $$1 -> {
            this.onTransition($$1);
            $$0.onTransition($$1);
         };
      }
   }
}
